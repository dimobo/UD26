package mainApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mainApp.dto.Producto;
import mainApp.service.ProductoServiceImpl;

/**
 * 
 * @author dimobo
 *
 */

@RestController
@RequestMapping("/api")
public class ProductoController {

	@Autowired
	ProductoServiceImpl productoServiceImpl;

	// List all
	@GetMapping("/productos")
	public List<Producto> listarProductos() {
		return productoServiceImpl.listarProductos();
	}

	// List by ID
	@GetMapping("/productos/{id}")
	public Producto productoID(@PathVariable(name = "id") int id) {
		Producto productoId = new Producto();
		productoId = productoServiceImpl.productoID(id);
		System.out.println("Producto x ID: " + productoId);
		return productoId;
	}

	// Create
	@PostMapping("/productos")
	public Producto guardarProducto(@RequestBody Producto producto) {
		return productoServiceImpl.guardarProducto(producto);
	}

	// Update
	@PutMapping("/productos/{id}")
	public Producto actualizarProducto(@PathVariable(name = "id") int id, @RequestBody Producto producto) {
		Producto productoSeleccionado = new Producto(), productoActualizado = new Producto();
		productoSeleccionado = productoServiceImpl.productoID(id);
		productoSeleccionado.setNombre(producto.getNombre());
		productoSeleccionado.setPrecio(producto.getPrecio());
		productoSeleccionado.setId(producto.getId());
		productoActualizado = productoServiceImpl.actualizaProducto(productoSeleccionado);
		System.out.println("El producto actualizado es: " + productoActualizado);
		return productoActualizado;
	}

	// Delete
	@DeleteMapping("/producto/{id}")
	public void eliminarProducto(@PathVariable(name = "id") int id) {
		productoServiceImpl.eliminarProducto(id);
	}

}
