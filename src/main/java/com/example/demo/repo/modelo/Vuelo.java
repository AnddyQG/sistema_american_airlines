package com.example.demo.repo.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "vuelo")
public class Vuelo {

	@Id
	@SequenceGenerator(name = "seq_vuelo", sequenceName = "seq_vuelo", allocationSize = 1)

    @GeneratedValue(generator = "seq_vuelo", strategy = GenerationType.SEQUENCE)

  
	@Column(name = "vuel_id")
	private Integer id;
	@Column(name = "vuel_origen")
	private String origen;
	@Column(name = "vuel_destino")
	private String destino;
	
	
	@Column(name = "vuel_numero")
	private String numero;
	@Column(name = "vuel_fecha_vuelo")
	private String fechaVuelo;
	@Column(name = "vuel_asientos_disponibles")
	private Integer asientosDisponibles;
	@Column(name = "vuel_valor_asiento")
	private BigDecimal valorAsiento;
	@Column(name = "vuel_estado")
	private String estado;
	
	@ManyToOne
	@JoinColumn(name = "vuel_id_avion")
	private Avion avion;
	
	@OneToMany(mappedBy = "vuelo",fetch = FetchType.LAZY)
	List<CompraPasajes>compraPasajes;
	
	@Override
	public String toString() {
		return "Vuelo [id=" + id + ", numero=" + numero + ", asientosDisponibles=" + asientosDisponibles
				+ ", valorAsiento=" + valorAsiento + ", estado=" + estado + "]";
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



	public BigDecimal getValorAsiento() {
		return valorAsiento;
	}

	public void setValorAsiento(BigDecimal valorAsiento) {
		this.valorAsiento = valorAsiento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public List<CompraPasajes> getCompraPasajes() {
		return compraPasajes;
	}

	public void setCompraPasajes(List<CompraPasajes> compraPasajes) {
		this.compraPasajes = compraPasajes;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getFechaVuelo() {
		return fechaVuelo;
	}

	public void setFechaVuelo(String fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}

	public Integer getAsientosDisponibles() {
		return asientosDisponibles;
	}

	public void setAsientosDisponibles(Integer asientosDisponibles) {
		this.asientosDisponibles = asientosDisponibles;
	}
	
	
	
}
