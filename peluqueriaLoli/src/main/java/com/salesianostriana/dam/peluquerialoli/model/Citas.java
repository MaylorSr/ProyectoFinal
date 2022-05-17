package com.salesianostriana.dam.peluquerialoli.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Citas {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String nombre;
	private String telefonoCliente;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fecha;
	
	private LocalTime hora;

}
