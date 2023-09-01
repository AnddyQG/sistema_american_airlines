package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IClienteRepo;
import com.example.demo.repo.modelo.Cliente;
import com.example.demo.repo.modelo.CompraPasajes;
import com.example.demo.repo.modelo.Vuelo;
import com.example.demo.repo.modelo.dto.VueloDto;
@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	private IClienteRepo clienteRepo;

	@Override
	public List<Vuelo> buscarVuelosDis(String origen, String destino, String fecha) {
		
		return this.clienteRepo.encontrarVuelosDis(origen, destino, fecha);
	}

	@Override
	public List<Vuelo> buscarVueloPorNumero(String numero) {
		// TODO Auto-generated method stub
		return this.clienteRepo.encontrarVueloPorNumero(numero);
	}

	@Override
	public void reservar(Integer cantidadAsientos, String cedula) {
		// TODO Auto-generated method stub
		CompraPasajes compraPasajes= new CompraPasajes();
		compraPasajes.setCantidadAsientosComprados(cantidadAsientos);
		Cliente cliente=this.clienteRepo.encontrarPorCedula(cedula);
		compraPasajes.setCliente(cliente);
		compraPasajes.setEstado("RES");
		compraPasajes.setFechaCompra("HOY");
		compraPasajes.setNumero("001");
		Vuelo vuelo=this.clienteRepo.encontrarVueloPorNumeroInd(compraPasajes.getVuelo().getNumero());
		compraPasajes.setVuelo(compraPasajes.getVuelo());
		
		this.clienteRepo.insertar(compraPasajes);
		vuelo.setEstado("ND");
		this.clienteRepo.actualizar(vuelo);
		
	}
	


}
