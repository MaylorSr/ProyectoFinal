package com.salesianostriana.dam.peluquerialoli.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.salesianostriana.dam.peluquerialoli.formbeans.SearchBean;
import com.salesianostriana.dam.peluquerialoli.model.Citas;
import com.salesianostriana.dam.peluquerialoli.servicios.CitasServicios;
import com.salesianostriana.dam.peluquerialoli.servicios.ServiciosServicios;

@Controller
@RequestMapping("/private/peluqueriaLoli")
public class PrivateController {

	@Autowired
	HttpSession session;
	@Autowired
	private ServiciosServicios serviciosServicios;

	@Autowired
	private CitasServicios citasServicios;

	@GetMapping("/private")
	public String privateIndex(Model model, @AuthenticationPrincipal UserDetails user) {

		model.addAttribute("usuario", user.getUsername());

		return "private/index";
	}

	@GetMapping("/")
	public String mostrarNav() {
		return "inicio";
	}

	@GetMapping("/quienesSomos")
	public String mostrarQuienesSomos() {
		return "quienesSomos";
	}

	@GetMapping("/serviciosCliente")
	public String mostrarServicios(Model model) {
		model.addAttribute("listadoServicios", serviciosServicios.findAll());
		model.addAttribute("searchForm", new SearchBean());
		return "listadoServicios";
	}

	@PostMapping("/search")
	public String searchServicio(@ModelAttribute("searchForm") SearchBean searchBean, Model model) {
		model.addAttribute("listadoServicios", serviciosServicios.buscarPorNombre(searchBean.getSearch()));
		return "listadoServicios";
	}

	@GetMapping("/nuevaCita")
	public String mostrarFormularioUsuario(Model model) {
		model.addAttribute("citas", new Citas());
		model.addAttribute("listadoServicios", serviciosServicios.findAll());
		return "solicitarCita";
	}

	@PostMapping("/nuevaCita/submit")
	public String procesarFormularioUsuario(@ModelAttribute("citas") Citas citas) {
		if (citas != null) {
			if (!citasServicios.comprobarFechas(citas.getFecha(), citas.getHora())) {
				citasServicios.save(citas);
				return "redirect:/private/peluqueriaLoli/nuevaCita";
			} else {
				return "redirect:/private/peluqueriaLoli/nuevaCita/?error=true";
			}
		}
		return "redirect:/private/peluqueriaLoli/nuevaCita";
	}

	@GetMapping("/contacto")
	public String mostrarContacto() {
		return "contacto";
	}

	@PostMapping("/nuevoMensaje/submit")
	public String procesarFormulario() {
		return "redirect:/private/peluqueriaLoli/contacto?error=true";

	}

}
