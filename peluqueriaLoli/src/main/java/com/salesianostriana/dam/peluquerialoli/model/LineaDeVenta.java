package com.salesianostriana.dam.peluquerialoli.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LineaDeVenta {

	@Id
	@GeneratedValue
	private long id;
	
	@ManyToOne
	private Servicios servicios;

	@ManyToOne
	private Venta venta;

	public void addToVenta(Venta venta) {
		this.addToVenta(venta);
		venta.getServicios().add(this);
	}

	public void removeFromCurso(Venta venta) {
		venta.getServicios().remove(this);
	}

}
