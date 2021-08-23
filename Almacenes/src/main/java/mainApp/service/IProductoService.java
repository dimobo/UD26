package mainApp.service;

import java.util.List;

import mainApp.dto.Producto;

/**
 * 
 * @author dimobo
 *
 */

public interface IProductoService {

	// Metrodos del CRUD
	public List<Producto> listarProductos(); // lista todos los productos.

	public Producto productoID(int id); // Lista el producto correspondiente a la ID.

	public Producto guardarProducto(Producto producto); // Guarda un producto.

	public Producto actualizaProducto(Producto producto); // Actualiza un producto.

	public void eliminarProducto(int id); // Elimina el producto correspondiente a la ID.

}
