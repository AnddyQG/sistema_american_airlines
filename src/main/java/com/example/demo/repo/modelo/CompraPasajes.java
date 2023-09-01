package com.example.demo.repo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "compra_pasajes")
public class CompraPasajes {

	
	@Id
	@SequenceGenerator(name = "seq_copa", sequenceName = "seq_copa", allocationSize = 1)

    @GeneratedValue(generator = "seq_copa", strategy = GenerationType.SEQUENCE)

  
	@Column(name = "copa_id")
	
	private Integer id;
	@Column(name = "copa_numero")
	private String numero;
	@Column(name = "copa_fecha_compra")
	private String fechaCompra;
	@Column(name = "copa_cantidad_asientos_comprados")
	private Integer cantidadAsientosComprados;
	@Column(name = "copa_estado")
	private String estado;
	
	@ManyToOne
	@JoinColumn(name = "copa_id_cliente")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name ="copa_id_vuelo" )
	private Vuelo vuelo;
	
	
	@Override
	public String toString() {
		return "CompraPasajes [id=" + id + ", numero=" + numero + ", fechaCompra=" + fechaCompra
				+ ", cantidadAsientosComprados=" + cantidadAsientosComprados + ", estado=" + estado + "]";
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getFechaCompra() {
		return fechaCompra;
	}


	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}


	public Integer getCantidadAsientosComprados() {
		return cantidadAsientosComprados;
	}


	public void setCantidadAsientosComprados(Integer cantidadAsientosComprados) {
		this.cantidadAsientosComprados = cantidadAsientosComprados;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Vuelo getVuelo() {
		return vuelo;
	}


	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}
	
	
	
	
}
