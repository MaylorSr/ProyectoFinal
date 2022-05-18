package com.salesianostriana.dam.peluquerialoli.controller;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.salesianostriana.dam.peluquerialoli.model.Citas;
import com.salesianostriana.dam.peluquerialoli.servicios.CitasServicios;
import com.salesianostriana.dam.peluquerialoli.servicios.ServiciosServicios;

@Controller
public class CitasController {
	@Autowired
	HttpSession session;
	@Autowired
	private CitasServicios citasServicios;

	@Autowired
	private ServiciosServicios serviciosServicios;

	@GetMapping("/admin/listadoCitas")
	public String mostrarCitas(Model model) {
		model.addAttribute("listadoCitas", citasServicios.findAll());
		return "citas";
	}

	@GetMapping("/admin/nuevoCita")
	public String mostrarFormulario(Model model) {
		model.addAttribute("citas", new Citas());
		model.addAttribute("listadoServicios", serviciosServicios.findAll());
		return "formularioCitas";
	}

	@GetMapping("/private/nuevoCita")
	public String mostrarFormularioUsuario(Model model) {
		model.addAttribute("citas", new Citas());
		model.addAttribute("listadoServicios", serviciosServicios.findAll());
		return "solicitarCita";
	}

	@PostMapping("/private/nuevoCita/submit")
	public String procesarFormularioUsuario(@ModelAttribute("citas") Citas citas) {
		if (!citasServicios.seSolapanFechas(citas.getFecha(), citas.getHora())) {
			citasServicios.save(citas);
			return "redirect:/private/peluqueriaLoli";
		} else {
			return "redirect:/private/error/solicitar/cita";
		}

	}

	@GetMapping("/private/peluqueriaLoli")
	public String mostrarPaginaWebPrincipal() {
		return "peluqueriaLoli";
	}

	@GetMapping("/private/peluqueriaLoli/contacto")
	public String mostrarContacto() {
		return "contacto";
	}

	@GetMapping("/private/peluqueriaLoli/quienesSomos")
	public String mostrarQuienesSomos() {
		return "quienesSomos";
	}

	@GetMapping("/private/error/solicitar/cita")
	public String mostrarErrorSolicitudCita() {
		return "errorCita";
	}

	@PostMapping("/admin/nuevoCita/submit")
	public String procesarFormulario(@ModelAttribute("citas") Citas citas) {
		if (!citasServicios.seSolapanFechas(citas.getFecha(), citas.getHora())) {
			citasServicios.save(citas);
			return "redirect:/admin/listadoCitas";
		} else {
			return "redirect:/private/error/solicitar/cita";
		}
	}

	@GetMapping("/admin/editarCitas/{id}")
	public String mostrarFormularioEdicion(@PathVariable("id") long id, Model model) {

		Optional<Citas> aEditar = citasServicios.findById(id);

		if (aEditar != null) {
			model.addAttribute("citas", aEditar.get());
			return "formularioCitas";
		} else {
			return "redirect:/admin/listadoCitas";
		}
	}

	@PostMapping("/admin/editarCitas/submit")
	public String procesarFormularioEdicion(@ModelAttribute("citas") Citas citas) {
		citasServicios.edit(citas);
		return "redirect:/admin/listadoCitas";
	}

	@GetMapping("admin/borrarCita/{id}")
	public String borrar(@PathVariable("id") long id) {
		citasServicios.delete(id);
		return "redirect:/admin/listadoCitas";
	}

	@GetMapping("/admin/listadoCitas/buscar/nombre")
	public String buscarCliente(Model model, @RequestParam String nombre) {
		model.addAttribute("listadoCitas", citasServicios.buscarPorNombre(nombre));
		return "citas";
	}

}
