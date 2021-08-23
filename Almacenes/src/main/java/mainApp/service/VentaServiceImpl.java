package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import mainApp.dao.IVentaDAO;
import mainApp.dto.Venta;

/**
 * 
 * @author dimobo
 *
 */

public class VentaServiceImpl implements IventaService {

	@Autowired
	IVentaDAO iVentaDAO;

	@Override
	public List<Venta> listarVentas() {
		return iVentaDAO.findAll();
	}

	@Override
	public Venta ventaID(int id) {
		return iVentaDAO.findById(id).get();
	}

	@Override
	public Venta guardarVenta(Venta venta) {
		return iVentaDAO.save(venta);
	}

	@Override
	public Venta actualizaVenta(Venta venta) {
		return iVentaDAO.save(venta);
	}

	@Override
	public void eliminarVenta(int id) {
		iVentaDAO.deleteById(id);
	}

}
