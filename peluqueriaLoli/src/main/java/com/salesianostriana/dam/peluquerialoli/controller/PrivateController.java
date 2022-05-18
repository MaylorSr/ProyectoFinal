package com.salesianostriana.dam.peluquerialoli.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrivateController {

	@GetMapping("/private")
	public String privateIndex(Model model, @AuthenticationPrincipal UserDetails user) {

		model.addAttribute("usuario", user.getUsername());

		return "private/index";
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
	
	

}
