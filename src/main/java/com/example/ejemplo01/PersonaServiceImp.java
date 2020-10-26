package com.example.ejemplo01;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImp implements PersonaService {
	@Autowired
	private PersonaRepositorio repositorio;

	@Override
	public List<persona> listar() {
		return repositorio.findAll();
	}

	@Override
	public persona listarId(int id) {
		return repositorio.findById(id);
	}

	@Override
	public persona add(persona p) {
		return repositorio.save(p);
	}

	@Override
	public persona edit(persona p) {
		return repositorio.save(p);
	}

	@Override
	public persona delete(int id) {
		persona p = repositorio.findById(id);
		if(p!=null) {
			repositorio.delete(p);
		}
		return p;
	}

}
