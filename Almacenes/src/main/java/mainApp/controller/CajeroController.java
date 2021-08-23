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

import mainApp.dto.Cajero;
import mainApp.service.CajeroServiceImpl;

/**
 * 
 * @author dimobo
 *
 */

@RestController
@RequestMapping("/api")
public class CajeroController {

	@Autowired
	CajeroServiceImpl cajeroServiceImpl;

	// List all
	@GetMapping("/cajeros")
	public List<Cajero> listarCajeros() {
		return cajeroServiceImpl.listarCajeros();
	}

	// List por id
	@GetMapping("/cajeros/{id}")
	public Cajero cajeroID(@PathVariable(name = "id") int id) {
		Cajero Cajero_id = new Cajero();
		Cajero_id = cajeroServiceImpl.cajeroID(id);
		System.out.println("Curso x ID: " + Cajero_id);
		return Cajero_id;
	}

	// Crear cajero
	@PostMapping("/cajeros")
	public Cajero guardarCajero(@RequestBody Cajero cajero) {
		return cajeroServiceImpl.guardarCajero(cajero);
	}

	// Actualizar cajero
	@PutMapping("/cajeros/{id}")
	public Cajero actualizarCajero(@PathVariable(name = "id") int id, @RequestBody Cajero cajero) {
		Cajero cajeroSeleccionado = new Cajero(), cajeroActualizado = new Cajero();
		cajeroSeleccionado = cajeroServiceImpl.cajeroID(id);
		cajeroSeleccionado.setNomApels(cajero.getNomApels());
		cajeroActualizado = cajeroServiceImpl.actualizarCajero(cajeroSeleccionado);
		System.out.println("El cajero actualizado es: " + cajeroActualizado);
		return cajeroActualizado;
	}

	// Eliminar cajero
	@DeleteMapping("/cajeros/{id}")
	public void eliminarCajero(@PathVariable(name = "id") int id) {
		cajeroServiceImpl.eliminarCajero(id);
	}

}
