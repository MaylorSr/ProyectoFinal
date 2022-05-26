package com.salesianostriana.dam.peluquerialoli.servicios;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.salesianostriana.dam.peluquerialoli.model.Citas;
import com.salesianostriana.dam.peluquerialoli.model.Servicios;
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

	/**
	 * Este metodo comprueba si en nuestra lista de citas se encuentra el mismo dia
	 * y hora que quiere solicitar el usuario
	 * 
	 * @param fecha retoma la fecha dada por el usuario
	 * @param hora  retoma la hora dada por el usuario
	 * @return devuelve un boolean (true) en caso de que la cita que quiere el
	 *         usuario ya este en la lista
	 */

	public boolean seSolapanFechas(LocalDate fecha, LocalTime hora) {
		boolean seSolapan = false;
		for (Citas citas : citasRepository.findAll()) {
			if (citas.getFecha().equals(fecha) && citas.getHora().equals(hora)) {
				seSolapan = true;
			}
		}

		return seSolapan;
	}
	

	public int numeroCitasServicios(Optional<Servicios> servicios) {
		return citasRepository.findNumCitasByServicios(servicios);
	}

}
