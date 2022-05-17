package com.salesianostriana.dam.peluquerialoli.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Servicios {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String nombre;
	@Lob
	private String descripcion;

	@Column(length = 1000)
	private String imagen;
	private double precio;
	
	private double duracion;

}
