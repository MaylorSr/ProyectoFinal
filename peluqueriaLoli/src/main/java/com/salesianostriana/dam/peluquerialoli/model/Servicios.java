package com.salesianostriana.dam.peluquerialoli.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	private String nombre;
	private String descripcion;
	private double precio;
	


}
