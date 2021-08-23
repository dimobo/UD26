package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import mainApp.dao.ICajeroDAO;
import mainApp.dto.Cajero;

/**
 * 
 * @author dimobo
 *
 */

public class CajeroServiceImpl implements ICajeroService {

	@Autowired
	ICajeroDAO iCajeroDao;

	@Override
	public List<Cajero> listarCajeros() {
		return iCajeroDao.findAll();
	}

	@Override
	public Cajero cajeroID(int id) {
		return iCajeroDao.findById(id).get();
	}

	@Override
	public Cajero guardarCajero(Cajero cajero) {
		return iCajeroDao.save(cajero);
	}

	@Override
	public Cajero actualizaCajero(Cajero cajero) {
		return iCajeroDao.save(cajero);
	}

	@Override
	public void eliminarCajero(int id) {
		iCajeroDao.deleteById(id);
	}

}
