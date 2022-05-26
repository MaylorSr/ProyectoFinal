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

import com.salesianostriana.dam.peluquerialoli.model.Servicios;
import com.salesianostriana.dam.peluquerialoli.servicios.CitasServicios;
import com.salesianostriana.dam.peluquerialoli.servicios.ServiciosServicios;
import com.salesianostriana.dam.peluquerialoli.formbeans.SearchBean;

@Controller
public class ServiciosController {
	@Autowired
	HttpSession session;
	@Autowired
	private ServiciosServicios serviciosServicios;

	@Autowired
	private CitasServicios citasSevicios;

	@GetMapping("/admin/listadoServicios")
	public String listarServicios(Model model) {

		model.addAttribute("listadoServicios", serviciosServicios.findAll());
		return "servicios";
	}

	@GetMapping("/admin/nuevo")
	public String mostrarFormulario(Model model) {
		model.addAttribute("servicios", new Servicios());
		return "formularioServicios";
	}

	@PostMapping("/admin/nuevo/submit")
	public String procesarFormulario(@ModelAttribute("servicios") Servicios servicios) {
		serviciosServicios.save(servicios);
		return "redirect:/admin/listadoServicios";
	}

	@GetMapping("/admin/editar/{id}")
	public String mostrarFormularioEdicion(@PathVariable("id") long id, Model model) {
		Optional<Servicios> aEditar = serviciosServicios.findById(id);
		if (aEditar != null) {
			model.addAttribute("servicios", aEditar.get());
			return "formularioServicios";
		} else {
			return "redirect:/admin/listadoServicios";
		}

	}

	@PostMapping("/admin/editar/submit")
	public String procesarFormularioEdicion(@ModelAttribute("servicios") Servicios servicios) {
		serviciosServicios.edit(servicios);
		return "redirect:/admin/listadoServicios";
	}

	@GetMapping("/admin/borrar/{id}")
	public String borrar(@PathVariable("id") long id, Model model) {
		Optional<Servicios> servicios = serviciosServicios.findById(id);
		if (citasSevicios.numeroCitasServicios(servicios) == 0) {
			serviciosServicios.delete(id);
			return "redirect:/admin/listadoServicios";
		} else {
			return "redirect:/error";
		}
	}

	@GetMapping("/private/peluqueriaLoli/servicios")
	public String mostrarServiciosUser(Model model) {
		model.addAttribute("listadoServicios", serviciosServicios.findAll());
		model.addAttribute("searchForm", new SearchBean());
		return "listadoServicios";
	}

	@GetMapping("/admin/listadoServicios/buscar/nombre")
	public String buscar(Model model, @RequestParam String nombre) {
		model.addAttribute("listadoServicios", serviciosServicios.buscarPorNombre(nombre));
		return "servicios";
	}

	@PostMapping("/private/peluqueriaLoli/search")
	public String searchServicio(@ModelAttribute("searchForm") SearchBean searchBean, Model model) {
		model.addAttribute("listadoServicios", serviciosServicios.buscarPorNombre(searchBean.getSearch()));
		return "listadoServicios";
	}

}
