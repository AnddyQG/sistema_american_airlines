package com.example.demo.service;

import java.util.List;

import com.example.demo.repo.modelo.CompraPasajes;
import com.example.demo.repo.modelo.Vuelo;
import com.example.demo.repo.modelo.dto.VueloDto;

public interface IClienteService {

	public List<Vuelo> buscarVuelosDis(String origen,String destino ,String fecha);
	
	public List<Vuelo> buscarVueloPorNumero(String numero);
	
	public void reservar(Integer cantidadAsientos,String cedula);
	
}
