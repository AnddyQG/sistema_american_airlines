package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repo.modelo.Cliente;
import com.example.demo.repo.modelo.CompraPasajes;
import com.example.demo.repo.modelo.Vuelo;

import com.example.demo.service.IClienteService;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private IClienteService clienteService;
	
	@GetMapping("/vuelosDisponibles")
	public String vuelosDisp(Vuelo vuelo) {

		
		return "vistaBuscarVuelos";
	}
	@GetMapping("/listaVuelosDisponible")
	public String listaVuelos(Model model,Vuelo vuelo) {
		List<Vuelo>vuelos=	this.clienteService.buscarVuelosDis(vuelo.getOrigen(), vuelo.getDestino(), vuelo.getFechaVuelo());
		model.addAttribute("vuelos",vuelos);
		
		return "vistaListaVuelo";
	}
	
	@GetMapping("/buscarPorNumero")
	public String buscarPorNumero(Vuelo vuelo) {
		
		return "vistaBuscarNumero";
	}
	@GetMapping("/listaVuelos")
	public String listaBuscarNumero(Model model,Vuelo vuelo) {
		List<Vuelo>vuelos=this.clienteService.buscarVueloPorNumero(vuelo.getNumero());
	
		model.addAttribute("vuelos",vuelos);
		
		
		
		return "vistaListaNumero";
		
	}
	
	@PostMapping("/insertarReserva")
	public String insertar(CompraPasajes compraPasaje,Cliente cliente) {
		
		this.clienteService.reservar(compraPasaje.getCantidadAsientosComprados(),compraPasaje.getCliente().getCedula());
		
		
		return "vistaReserva";
	}
}
