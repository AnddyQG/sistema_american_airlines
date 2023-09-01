package com.example.demo.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Cliente;
import com.example.demo.repo.modelo.CompraPasajes;
import com.example.demo.repo.modelo.Vuelo;
import com.example.demo.repo.modelo.dto.VueloDto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class ClienteRepoImpl implements IClienteRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Vuelo> encontrarVuelosDis(String origen, String destino, String fecha) {
	String jpql="SELECT v FROM Vuelo v WHERE v.origen=:datoOrigen AND v.destino=:datoDestino AND v.fechaVuelo =:datoFecha AND v.estado =:datoDisponible";
	
	TypedQuery<Vuelo>query=this.entityManager.createQuery(jpql,Vuelo.class);
		
	query.setParameter("datoOrigen", origen);
	query.setParameter("datoDestino", destino);
	query.setParameter("datoFecha", fecha);
		query.setParameter("datoDisponible", "DIS");
		return query.getResultList();
	}

	@Override
	public List<Vuelo> encontrarVueloPorNumero(String numero) {
		String jpql="SELECT v FROM Vuelo v WHERE v.numero=:datoNumero AND v.estado =:datoDisponible";
		TypedQuery<Vuelo>query=this.entityManager.createQuery(jpql,Vuelo.class);
		query.setParameter("datoNumero", numero);
		query.setParameter("datoDisponible", "DIS");
		
		return query.getResultList();
	}

	@Override
	public void insertar(CompraPasajes compraPasajes) {
		// TODO Auto-generated method stub
		this.entityManager.persist(compraPasajes);
	}

	@Override
	public Cliente encontrarPorCedula(String cedula) {
		TypedQuery<Cliente>query=this.entityManager.createQuery("SELECT c FROM Cliente c WHERE c.cedula=:datoCedula",Cliente.class);
		query.setParameter("datoCedula", cedula);
		return query.getSingleResult();
	}

	@Override
	public void actualizar(Vuelo vuelo) {
		// TODO Auto-generated method stub
		this.entityManager.merge(vuelo);
	}

	@Override
	public Vuelo encontrarVueloPorNumeroInd(String numero) {
	
		String jpql="SELECT v FROM Vuelo v WHERE v.numero=:datoNumero AND v.estado =:datoDisponible";
		TypedQuery<Vuelo>query=this.entityManager.createQuery(jpql,Vuelo.class);
		query.setParameter("datoNumero", numero);
		query.setParameter("datoDisponible", "DIS");
		
		return query.getSingleResult();
		
	}

}
