package mainApp.service;

import java.util.List;

import mainApp.dto.MaquinaRegistradora;

/**
 * 
 * @author dimobo
 *
 */

public interface IMaquinaRegistradoraService {

	// Metrodos del CRUD
	public List<MaquinaRegistradora> listarMaquinas(); // lista todas las maquinas.

	public MaquinaRegistradora maquinaID(int id); // Lista la maquina correspondiente a la ID.

	public MaquinaRegistradora guardarMaquina(MaquinaRegistradora maquina); // Guarda una maquina.

	public MaquinaRegistradora actualizaMaquina(MaquinaRegistradora maquina); // Actualiza una maquina.

	public void eliminarMaquina(int id); // Elimina la maquina correspondiente a la ID.

}
