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

@Entity
@Table(name = "productos")
public class Producto {

	// Atributos del producto.

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private int id;
	@Column
	private String nombre;
	@Column
	private double precio;

	@OneToMany
	@JoinColumn(name = "id")
	private List<Venta> venta;

	// Constructores

	public Producto() {
	}

	/**
	 * 
	 * @param id
	 * @param nombre
	 * @param precio
	 * @param venta
	 */
	public Producto(int id, String nombre, double precio, List<Venta> venta) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
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
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * 
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
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
		return "Cajero [id=" + id + "nombre=" + nombre + "precio=" + precio + "]";
	}

}
