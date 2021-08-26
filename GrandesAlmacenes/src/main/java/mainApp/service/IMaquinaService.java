package mainApp.service;

import java.util.List;

import mainApp.dto.Maquina;

/**
 * 
 * @author dimobo
 *
 */

public interface IMaquinaService {

	// Metrodos del CRUD
	public List<Maquina> listarMaquinas(); // lista todas las maquinas.

	public Maquina maquinaID(int id); // Lista la maquina correspondiente a la ID.

	public Maquina guardarMaquina(Maquina maquina); // Guarda una maquina.

	public Maquina actualizarMaquina(Maquina maquina); // Actualiza una maquina.

	public void eliminarMaquina(int id); // Elimina la maquina correspondiente a la ID.

}
