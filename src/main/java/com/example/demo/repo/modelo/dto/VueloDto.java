package com.example.demo.repo.modelo.dto;

public class VueloDto {

	private String numero;
	private String origen;
	private String destino;
	private String nombre;
	private String valor;
	public VueloDto(String numero, String origen, String destino, String nombre, String valor) {
		super();
		this.numero = numero;
		this.origen = origen;
		this.destino = destino;
		this.nombre = nombre;
		this.valor = valor;
	}
	
	
	public VueloDto() {
		
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
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


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getValor() {
		return valor;
	}


	public void setValor(String valor) {
		this.valor = valor;
	}
	
	
	
}
