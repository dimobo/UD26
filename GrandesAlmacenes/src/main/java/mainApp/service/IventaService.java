package mainApp.service;

import java.util.List;

import mainApp.dto.Venta;

/**
 * 
 * @author dimobo
 *
 */

public interface IventaService {

	// Metrodos del CRUD
	public List<Venta> listarVentas(); // lista todas las ventas.

	public Venta ventaID(int id); // Lista la venta correspondiente a la ID.

	public Venta guardarVenta(Venta venta); // Guarda una venta.

	public Venta actualizaVenta(Venta venta); // Actualiza una venta.

	public void eliminarVenta(Venta venta); // Elimina la venta correspondiente a la ID.

}