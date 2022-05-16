package com.salesianostriana.dam.peluquerialoli.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.salesianostriana.dam.peluquerialoli.model.Servicios;
import com.salesianostriana.dam.peluquerialoli.repositorios.ServiciosRepository;
import com.salesianostriana.dam.peluquerialoli.servicios.base.ServicioBaseImpl;

@Service
public class ServiciosServicios extends ServicioBaseImpl<Servicios, Long, ServiciosRepository> {

	@Autowired
	private ServiciosRepository serviciosRepository;
	
	public ServiciosServicios(ServiciosRepository repo) {
		super();
		this.serviciosRepository = repo;
	}
	
	public Servicios add(Servicios servicios) { return serviciosRepository.save(servicios); }
	
	public Servicios edit(Servicios servicios) { return serviciosRepository.save(servicios); }

	public void delete(Servicios servicios) { serviciosRepository.delete(servicios); }

	public void delete(long id) { serviciosRepository.deleteById(id); }
	
	public List<Servicios> findAll() { return serviciosRepository.findAll(); }
	
	public Optional<Servicios> findById(long id) {
		return serviciosRepository.findById(id);
	}

	public List<Servicios> buscarPorNombre(String cadena) {
		return repositorio.findByNombreContainingIgnoreCase(cadena);
	}
	

	
	
	
	
	
	
	
}
