package mainApp.dto;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author dimobo
 *
 */

@Entity
@Table(name = "ventas")
public class Venta {

	// Atributos de la venta.

	@EmbeddedId
	VentaId id;

	// Constructores

	public Venta() {
	}

	public Venta(Cajero cajero, MaquinaRegistradora maquina, Producto producto) {
		super();
		this.id.cajero = cajero;
		this.id.maquina = maquina;
		this.id.producto = producto;
	}

	// Getters and Setters
	/**
	 * 
	 * @return the cajero
	 */
	public Cajero getCajero() {
		return id.cajero;
	}

	/**
	 * 
	 * @param cajero the cajero to set
	 */
	public void setCajero(Cajero cajero) {
		this.id.cajero = cajero;
	}

	/**
	 * 
	 * @return the maquina
	 */
	public MaquinaRegistradora getMaquina() {
		return id.maquina;
	}

	/**
	 * 
	 * @param maquina the maquina to set
	 */
	public void setMaquina(MaquinaRegistradora maquina) {
		this.id.maquina = maquina;
	}

	/**
	 * 
	 * @return the producto
	 */
	public Producto getProducto() {
		return id.producto;
	}

	/**
	 * 
	 * @param producto the producto to set
	 */
	public void setProducto(Producto producto) {
		this.id.producto = producto;
	}

	@Override
	public String toString() {
		return "Cajero [cajero=" + id.cajero + "maquina=" + id.maquina + "producto=" + id.producto + "]";
	}

}

@Embeddable
class VentaId implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "cajero")
	Cajero cajero;

	@ManyToOne
	@JoinColumn(name = "maquina")
	MaquinaRegistradora maquina;

	@ManyToOne
	@JoinColumn(name = "producto")
	Producto producto;
}
