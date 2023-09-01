package com.example.demo.repo.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "avion")
public class Avion {

	@Id
	@SequenceGenerator(name = "seq_avion", sequenceName = "seq_avion", allocationSize = 1)

    @GeneratedValue(generator = "seq_avion", strategy = GenerationType.SEQUENCE)

  
	@Column(name = "avio_id")
	private Integer id;
	@Column(name = "avio_numero")
	private String numero;
	@Column(name = "avio_nombre")
	private String nombre;
	@Column(name = "avio_capacidad_asientos")
	private Integer capacidadAsientos;
	
	@OneToMany(mappedBy = "avion",fetch = FetchType.LAZY)
	List<Vuelo>vuelos;
	
	@Override
	public String toString() {
		return "Avion [id=" + id + ", numero=" + numero + ", capacidadAsientos=" + capacidadAsientos + "]";
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

	public Integer getCapacidadAsientos() {
		return capacidadAsientos;
	}

	public void setCapacidadAsientos(Integer capacidadAsientos) {
		this.capacidadAsientos = capacidadAsientos;
	}

	public List<Vuelo> getVuelos() {
		return vuelos;
	}

	public void setVuelos(List<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
}
