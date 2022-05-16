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

import com.salesianostriana.dam.peluquerialoli.model.Servicios;
import com.salesianostriana.dam.peluquerialoli.servicios.ServiciosServicios;

@Controller
public class ServiciosController {

	@Autowired
	private ServiciosServicios serviciosServicios;

	@GetMapping("/admin/listadoServicios")
	public String listarServicios(Model model) {

		/*
		 * List<Servicios> lista =
		 * List.of(Servicios.builder().nombre("Corte").descripcion("").precio(5).build()
		 * , Servicios.builder().nombre("Teñido").descripcion("").precio(10).build());
		 * model.addAttribute("listadoServicios", lista);
		 */
		model.addAttribute("listadoServicios", serviciosServicios.findAll());
		return "servicios";
	}

	@GetMapping("/admin/nuevo")
	public String mostrarFormulario(Model model) {
		model.addAttribute("servicios", new Servicios());
		return "formulario";
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
			model.addAttribute("servicios", aEditar);
			return "formulario";
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
	public String borrar(@PathVariable("id") long id) {
		serviciosServicios.delete(id);
		return "redirect:/admin/listadoServicios";
	}

	@GetMapping("/private/peluqueriaLoli")
	public String mostrarPaginaWeb() {
		return "usuario";
	}

	@GetMapping("/private/peluqueriaLoli/quienesSomos")
	public String mostrarQuienesSomos() {
		return "quienesSomos";
	}

	@GetMapping("/private/peluqueriaLoli/servicios")
	public String mostrarServiciosUser() {
		
		return "listadoServicios";
	}

	@GetMapping("/admin/carrito")
	public String mostrarCarrito() {
		return "carrito";
	}
	
	@GetMapping("/admin/listadoServicios/buscar/nombre")
	public String buscar(Model model, @RequestParam String nombre) {
		model.addAttribute("listadoServicios", serviciosServicios.buscarPorNombre(nombre));
		return "servicios";
	}

	
}
