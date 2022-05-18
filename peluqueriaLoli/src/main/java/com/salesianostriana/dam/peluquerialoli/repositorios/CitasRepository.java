package com.salesianostriana.dam.peluquerialoli.repositorios;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.salesianostriana.dam.peluquerialoli.model.Citas;

public interface CitasRepository extends JpaRepository<Citas, Long> {

	@Query("select c from Citas c")
	public List<Citas> addQuirirIds();

	public List<Citas> findByNombreContainsIgnoreCase(String nombre);

}
