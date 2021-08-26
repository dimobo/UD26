package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.IProductoDAO;
import mainApp.dto.Producto;

/**
 * 
 * @author dimobo
 *
 */

@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	IProductoDAO iProductoDAO;

	@Override
	public List<Producto> listarProductos() {
		return iProductoDAO.findAll();
	}

	@Override
	public Producto productoID(int id) {
		return iProductoDAO.findById(id).get();
	}

	@Override
	public Producto guardarProducto(Producto producto) {
		return iProductoDAO.save(producto);
	}

	@Override
	public Producto actualizaProducto(Producto producto) {
		return iProductoDAO.save(producto);
	}

	@Override
	public void eliminarProducto(int id) {
		iProductoDAO.deleteById(id);
	}

}
