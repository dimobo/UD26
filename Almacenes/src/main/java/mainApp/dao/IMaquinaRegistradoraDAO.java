package mainApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import mainApp.dto.MaquinaRegistradora;

/**
 * 
 * @author dimobo
 *
 */

public interface IMaquinaRegistradoraDAO extends JpaRepository<MaquinaRegistradora, Integer> {

}
