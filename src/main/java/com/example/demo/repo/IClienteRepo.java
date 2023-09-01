package com.example.demo.repo;

import java.util.List;

import com.example.demo.repo.modelo.Cliente;
import com.example.demo.repo.modelo.CompraPasajes;
import com.example.demo.repo.modelo.Vuelo;
import com.example.demo.repo.modelo.dto.VueloDto;

public interface IClienteRepo {

	public List<Vuelo> encontrarVuelosDis(String origen,String destino ,String fecha);
	
	public List<Vuelo> encontrarVueloPorNumero(String numero);
	
	public Vuelo encontrarVueloPorNumeroInd(String numero);
	
	public void insertar(CompraPasajes compraPasajes);
	
	public Cliente encontrarPorCedula(String cedula);
	
	public void actualizar(Vuelo vuelo);
	
}
