package mainApp.dto;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 * @author dimobo
 *
 */

@Entity
@Table(name = "maquinas_registradoras")
public class MaquinaRegistradora {

	// Atributos de la maquina.
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private int id;
	@Column
	private int piso;

	@OneToMany
	@JoinColumn(name = "id")
	private List<Venta> venta;

	// Constructores
	
	public MaquinaRegistradora() {
	}

	/**
	 * 
	 * @param id
	 * @param piso
	 * @param venta
	 */
	public MaquinaRegistradora(int id, int piso, List<Venta> venta) {
		super();
		this.id = id;
		this.piso = piso;
		this.venta = venta;
	}

	// Getters and Setters
	/**
	 * 
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * 
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 * @return the piso
	 */
	public int getPiso() {
		return piso;
	}

	/**
	 * 
	 * @param piso the piso to set
	 */
	public void setPiso(int piso) {
		this.piso = piso;
	}

	/**
	 * 
	 * @return the venta
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Venta")
	public List<Venta> getVenta() {
		return venta;
	}

	/**
	 * 
	 * @param venta the venta to set
	 */
	public void setVenta(List<Venta> venta) {
		this.venta = venta;
	}
	
	@Override
	public String toString() {
		return "Cajero [id=" + id + "piso=" + piso + "]";
	}

}
