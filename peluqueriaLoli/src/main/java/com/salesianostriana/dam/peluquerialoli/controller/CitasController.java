package com.salesianostriana.dam.peluquerialoli.controller;

import java.util.Optional;

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

@Controller
public class CitasController {

	@Autowired
	private CitasServicios citasServicios;

	@GetMapping("/admin/listadoCitas")
	public String mostrarCitas(Model model) {
		model.addAttribute("listadoCitas", citasServicios.findAll());
		return "citas";
	}

	@GetMapping("/admin/nuevoCita")
	public String mostrarFormulario(Model model) {
		model.addAttribute("citas", new Citas());
		return "formularioCitas";
	}

	@PostMapping("/admin/nuevoCita/submit")
	public String procesarFormulario(@ModelAttribute("citas") Citas citas) {
		citasServicios.save(citas);
		return "redirect:/admin/listadoCitas";
	}

	@GetMapping("/admin/editarCitas/{id}")
	public String mostrarFormularioEdicion(@PathVariable("id") long id, Model model) {

		Optional<Citas> aEditar = citasServicios.findById(id);

		if (aEditar != null) {
			model.addAttribute("citas", aEditar);
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
	
	/*
	@GetMapping("/admin/listadoCitas/buscar/nombre/cliente")
	public String buscarCliente(Model model, @RequestParam String nombreCliente) {
		model.addAttribute("listadoCitas", citasServicios.buscarPorNombreCliente(nombreCliente));
		return "citas";
	}*/
	
	
	
}
