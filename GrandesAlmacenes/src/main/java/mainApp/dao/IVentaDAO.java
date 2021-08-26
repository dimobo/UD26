package mainApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mainApp.dto.Venta;

/**
 * 
 * @author dimobo
 *
 */

public interface IVentaDAO extends JpaRepository<Venta, Integer> {

}
