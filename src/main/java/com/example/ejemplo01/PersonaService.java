package com.example.ejemplo01;

import java.util.List;

public interface PersonaService {
	List<persona>listar();
	persona listarId(int id);
	persona add(persona p);
	persona edit(persona p);
	persona delete(int id);
}
