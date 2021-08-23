package mainApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import mainApp.dto.Cajero;

/**
 * 
 * @author dimobo
 *
 */

public interface ICajeroDAO extends JpaRepository<Cajero, Integer> {

}
