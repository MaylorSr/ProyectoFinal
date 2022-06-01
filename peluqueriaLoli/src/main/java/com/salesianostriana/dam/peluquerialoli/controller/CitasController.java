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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.salesianostriana.dam.peluquerialoli.model.Citas;
import com.salesianostriana.dam.peluquerialoli.servicios.CitasServicios;
import com.salesianostriana.dam.peluquerialoli.servicios.ServiciosServicios;

@Controller
@RequestMapping("/admin/peluqueriaLoli")
public class CitasController {
	@Autowired
	HttpSession session;
	@Autowired
	private CitasServicios citasServicios;

	@Autowired
	private ServiciosServicios serviciosServicios;

	@GetMapping("/listadoCitas")
	public String mostrarCitas(Model model) {
		model.addAttribute("listadoCitas", citasServicios.findAll());
		return "citas";
	}

	@GetMapping("/nuevaCita")
	public String mostrarFormulario(Model model) {
		model.addAttribute("citas", new Citas());
		model.addAttribute("listadoServicios", serviciosServicios.findAll());
		return "formularioCitas";
	}

	@GetMapping("/editarCitas/{id}")
	public String mostrarFormularioEdicion(@PathVariable("id") long id, Model model) {
		model.addAttribute("listadoServicios", serviciosServicios.findAll());
		Optional<Citas> aEditar = citasServicios.findById(id);
		if (aEditar != null) {
			model.addAttribute("citas", aEditar.get());
			model.addAttribute("listadoCitas", citasServicios.findAll());
			citasServicios.delete(id);
			return "formularioCitas";

		} else {
			return "redirect:/admin/peluqueriaLoli/listadoCitas";
		}
	}

	@PostMapping("/editarCita/submit")
	public String procesarFormularioEdicion(@ModelAttribute("citas") Citas citas) {
		if (citasServicios.comprobarFechas(citas.getFecha(), citas.getHora())) {
			citasServicios.edit(citas);
			return "redirect:/admin/peluqueriaLoli/listadoCitas/";
		} else {
			citasServicios.edit(citas);
			return "redirect:/admin/peluqueriaLoli/listadoCitas/";
		}
	}

	@PostMapping("/nuevaCita/submit")
	public String procesarFormulario(@ModelAttribute("citas") Citas citas) {
		if (!citasServicios.comprobarFechas(citas.getFecha(), citas.getHora())) {
			citasServicios.save(citas);
			return "redirect:/admin/peluqueriaLoli/listadoCitas";
		} else {
			return "redirect:/admin/peluqueriaLoli/nuevaCita/?error=true";
		}
	}

	@GetMapping("/borrarCita/{id}")
	public String borrar(@PathVariable("id") long id) {
		citasServicios.delete(id);
		return "redirect:/admin/peluqueriaLoli/listadoCitas";
	}

	@GetMapping("/listadoCitas/buscar/nombre")
	public String buscarCliente(Model model, @RequestParam String nombre) {
		model.addAttribute("listadoCitas", citasServicios.buscarPorNombre(nombre));
		return "citas";
	}
}
