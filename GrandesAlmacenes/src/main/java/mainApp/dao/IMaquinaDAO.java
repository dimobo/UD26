package mainApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import mainApp.dto.Maquina;

/**
 * 
 * @author dimobo
 *
 */

public interface IMaquinaDAO extends JpaRepository<Maquina, Integer> {

}
