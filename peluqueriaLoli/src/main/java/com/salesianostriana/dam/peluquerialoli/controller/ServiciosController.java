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

import com.salesianostriana.dam.peluquerialoli.model.Servicios;
import com.salesianostriana.dam.peluquerialoli.servicios.CitasServicios;
import com.salesianostriana.dam.peluquerialoli.servicios.ServiciosServicios;

@Controller
@RequestMapping("/admin/peluqueriaLoli")
public class ServiciosController {
	@Autowired
	HttpSession session;
	@Autowired
	private ServiciosServicios serviciosServicios;

	@Autowired
	private CitasServicios citasSevicios;

	@GetMapping("/listadoServicios")
	public String listarServicios(Model model) {
		model.addAttribute("listadoServicios", serviciosServicios.findAll());
		return "servicios";
	}

	@GetMapping("/nuevo")
	public String mostrarFormulario(Model model) {
		model.addAttribute("servicios", new Servicios());
		return "formularioServicios";
	}

	@PostMapping("/nuevo/submit")
	public String procesarFormulario(@ModelAttribute("servicios") Servicios servicios) {
		serviciosServicios.save(servicios);
		return "redirect:/admin/peluqueriaLoli/listadoServicios";
	}

	@GetMapping("/editar/{id}")
	public String mostrarFormularioEdicion(@PathVariable("id") long id, Model model) {
		Optional<Servicios> aEditar = serviciosServicios.findById(id);
		if (aEditar != null) {
			model.addAttribute("servicios", aEditar.get());
			return "formularioServicios";
		} else {
			return "redirect:/admin/peluqueriaLoli/listadoServicios";
		}

	}

	@PostMapping("/editar/submit")
	public String procesarFormularioEdicion(@ModelAttribute("servicios") Servicios servicios) {
		serviciosServicios.edit(servicios);
		return "redirect:/admin/peluqueriaLoli/listadoServicios";
	}

	@GetMapping("/borrar/{id}")
	public String borrar(@PathVariable("id") long id, Model model) {
		Optional<Servicios> servicios = serviciosServicios.findById(id);
		if (servicios != null) {
			if (citasSevicios.comprobarNumeroDeCitasporServicios(servicios) == 0) {
				serviciosServicios.delete(id);
				return "redirect:/admin/peluqueriaLoli/listadoServicios";
			} else {
				return "redirect:/admin/peluqueriaLoli/listadoServicios/?error=true";
			}
		}
		return "redirect:/admin/peluqueriaLoli/listadoServicios";
	}

	@GetMapping("/listadoServicios/buscar/nombre")
	public String buscar(Model model, @RequestParam String nombre) {
		model.addAttribute("listadoServicios", serviciosServicios.buscarPorNombre(nombre));
		return "servicios";
	}

}
