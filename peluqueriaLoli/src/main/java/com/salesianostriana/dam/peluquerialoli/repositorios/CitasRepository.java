package com.salesianostriana.dam.peluquerialoli.repositorios;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.salesianostriana.dam.peluquerialoli.model.Citas;
import com.salesianostriana.dam.peluquerialoli.model.Servicios;

public interface CitasRepository extends JpaRepository<Citas, Long> {

	@Query("select c from Citas c")
	public List<Citas> addQuirirIds();
	
	public List<Citas> findByNombreContainsIgnoreCase(String nombre);

	@Query("select count(c) from Citas c where c.servicios = ?1")
	public int findNumCitasByServicios(Optional<Servicios> servicios);
	
}
