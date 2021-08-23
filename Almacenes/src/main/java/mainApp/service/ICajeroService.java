package mainApp.service;

import java.util.List;
import mainApp.dto.Cajero;

/**
 * 
 * @author dimobo
 *
 */

public interface ICajeroService {

	// Metrodos del CRUD
	public List<Cajero> listarCajeros(); // lista todos los cajeros.

	public Cajero cajeroID(int id); // Lista el cajero correspondiente a la ID.

	public Cajero guardarCajero(Cajero cajero); // Guarda un cajero.

	public Cajero actualizarCajero(Cajero cajero); // Actualiza un cajero.

	public void eliminarCajero(int id); // Elimina el cajero correspondiente a la ID.

}
