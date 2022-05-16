package com.salesianostriana.dam.peluquerialoli.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.salesianostriana.dam.peluquerialoli.model.Servicios;

public interface ServiciosRepository extends JpaRepository<Servicios, Long> {
	

	@Query("select s from Servicios s")
	public List<Servicios> addQuirirIds();

	public List<Servicios> findByNombreContainingIgnoreCase(String nombre);

}
