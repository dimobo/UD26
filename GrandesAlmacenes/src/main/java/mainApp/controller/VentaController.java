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

import mainApp.dto.Maquina;
import mainApp.dto.Venta;
import mainApp.service.VentaServiceImpl;

/**
 * 
 * @author dimobo
 *
 */

@RestController
@RequestMapping("/api")
public class VentaController {

	@Autowired
	VentaServiceImpl ventaServiceImpl;

	// List all
	@GetMapping("/ventas")
	public List<Venta> listarVentas() {
		return ventaServiceImpl.listarVentas();
	}

	// List by id
	@GetMapping("/ventas/{id}")
	public Venta ventaID(@PathVariable(name = "id") int id) {
		Venta ventaId = new Venta();
		ventaId = ventaServiceImpl.ventaID(id);
		System.out.println("Venta x ID: " + ventaId);
		return ventaId;
	}

	// Create
	@PostMapping("/ventas")
	public Venta guardarVenta(@RequestBody Venta venta) {
		return ventaServiceImpl.guardarVenta(venta);
	}

	// Update
	@PutMapping("/ventas/{id}")
	public Venta actuaVenta(@PathVariable(name = "id") int id, @RequestBody Venta venta) {
		Venta ventaSeleccionada = new Venta(), ventaActualizada = new Venta();
		ventaSeleccionada = ventaServiceImpl.ventaID(id);
		ventaSeleccionada.setCajero(venta.getCajero());
		ventaSeleccionada.setMaquina(venta.getMaquina());
		ventaSeleccionada.setProducto(venta.getProducto());
		ventaActualizada = ventaServiceImpl.actualizaVenta(ventaSeleccionada);
		System.out.println("La venta actualizada es: " + ventaActualizada);
		return ventaActualizada;
	}

	// Delete
	@DeleteMapping("/ventas")
	public void eliminarVenta(@RequestBody Venta venta) {
		ventaServiceImpl.eliminarVenta(venta);
	}

}