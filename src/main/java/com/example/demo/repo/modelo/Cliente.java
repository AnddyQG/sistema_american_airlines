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
@Table(name = "cliente")
public class Cliente {

	
	@Id
	@SequenceGenerator(name = "seq_cliente", sequenceName = "seq_cliente", allocationSize = 1)

    @GeneratedValue(generator = "seq_cliente", strategy = GenerationType.SEQUENCE)

  
	@Column(name = "clie_id")
	private Integer id;
	@Column(name = "clie_nombre")
	private String nombre;
	@Column(name = "clie_cedula")
	private String cedula;
	
	@OneToMany(mappedBy = "cliente",fetch = FetchType.LAZY)
	List<CompraPasajes>compraPasajes;
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", cedula=" + cedula + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public List<CompraPasajes> getCompraPasajes() {
		return compraPasajes;
	}

	public void setCompraPasajes(List<CompraPasajes> compraPasajes) {
		this.compraPasajes = compraPasajes;
	}


	
	
}
