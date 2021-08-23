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
import mainApp.service.MaquinaServiceImpl;

/**
 * 
 * @author dimobo
 *
 */

@RestController
@RequestMapping("/api")
public class MaquinaController {

	@Autowired
	MaquinaServiceImpl maquinaServiceImpl;

	// List all
	@GetMapping("/maquinas")
	public List<Maquina> listarMaquinas() {
		return maquinaServiceImpl.listarMaquinas();
	}

	// List por id
	@GetMapping("/maquinas/{id}")
	public Maquina maquinaID(@PathVariable(name = "id") int id) {
		Maquina maquinaId = new Maquina();
		maquinaId = maquinaServiceImpl.maquinaID(id);
		System.out.println("Maquina x ID: " + maquinaId);
		return maquinaId;
	}

	// Crear maquina
	@PostMapping("/maquinas")
	public Maquina guardarMaquina(@RequestBody Maquina maquina) {
		return maquinaServiceImpl.guardarMaquina(maquina);
	}

	// Actualizar maquina
	@PutMapping("/maquinas/{id}")
	public Maquina actualizarMaquina(@PathVariable(name = "id") int id, @RequestBody Maquina maquina) {
		Maquina maquinaSeleccionada = new Maquina(), maquinaActualizada = new Maquina();
		maquinaSeleccionada = maquinaServiceImpl.maquinaID(id);
		maquinaSeleccionada.setPiso(maquina.getPiso());
		maquinaActualizada = maquinaServiceImpl.actualizarMaquina(maquinaSeleccionada);
		System.out.println("El cajero actualizado es: " + maquinaActualizada);
		return maquinaActualizada;
	}

	// Eliminar maquina
	@DeleteMapping("/maquinas/{id}")
	public void eliminarMaquina(@PathVariable(name = "id") int id) {
		maquinaServiceImpl.eliminarMaquina(id);
	}

}
