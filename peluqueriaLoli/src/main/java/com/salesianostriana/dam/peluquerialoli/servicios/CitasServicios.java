package com.salesianostriana.dam.peluquerialoli.servicios;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.peluquerialoli.model.Citas;
import com.salesianostriana.dam.peluquerialoli.repositorios.CitasRepository;
import com.salesianostriana.dam.peluquerialoli.servicios.base.ServicioBaseImpl;

@Service
public class CitasServicios extends ServicioBaseImpl<Citas, Long, CitasRepository> {

	@Autowired
	private CitasRepository citasRepository;

	public CitasServicios(CitasRepository repo) {
		super();
		this.citasRepository = repo;
	}

	public Citas add(Citas citas) {
		return citasRepository.save(citas);
	}

	public Citas edit(Citas citas) {
		return citasRepository.save(citas);
	}

	public void delete(Citas citas) {
		citasRepository.delete(citas);
	}

	public void delete(long id) {
		citasRepository.deleteById(id);
	}

	public List<Citas> findAll() {
		return citasRepository.findAll();
	}

	public Optional<Citas> findById(long id) {
		return citasRepository.findById(id);
	}

	public List<Citas> buscarPorNombre(String cadena) {
		return repositorio.findByNombreContainsIgnoreCase(cadena);
	}

	/*
	 * logica de negocio, no se puede pedir dos citas a la misma hora el mismo dia
	 */

	public boolean seSolapanFechas(LocalDate fecha1, LocalTime hora) {
		boolean seSolapan;
		for (Citas citas : citasRepository.findAll()) {
		}

	}

}
