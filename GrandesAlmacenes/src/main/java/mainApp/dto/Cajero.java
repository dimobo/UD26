package mainApp.dto;

import java.util.List;

import javax.persistence.CascadeType;
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
@Table(name = "cajeros")
public class Cajero {

	// Atributos de la clase.
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private int id;
	
	@Column
	private String nomApels;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "cajero")
	private List<Venta> venta;

	// Constructores.
	
	public Cajero() {
	}

	/**
	 * 
	 * @param id
	 * @param nomApels
	 * @param venta
	 */
	public Cajero(int id, String nomApels, List<Venta> venta) {
		this.id = id;
		this.nomApels = nomApels;
		this.venta = venta;
	}

	// Getters y setters
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
	 * @return the nomApels
	 */
	public String getNomApels() {
		return nomApels;
	}

	/**
	 * 
	 * @param nomApels the nomApels to set
	 */
	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
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
		return "Cajero [id=" + id + "nombre=" + nomApels + "]";
	}

}
