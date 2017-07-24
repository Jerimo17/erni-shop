package sk.erni.shop.antal.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import sk.erni.shop.antal.model.Customer;

@Path("customer")
public class CustomerController {
		
	private EntityManager entityManager;
	private EntityManagerFactory emf;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Customer> customers() {
		
		emf = Persistence.createEntityManagerFactory("primary");
		entityManager = emf.createEntityManager(); 
		
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Customer> criteria = builder.createQuery( Customer.class );
		Root<Customer> cus = criteria.from( Customer.class );
		criteria.select( cus );
		List<Customer> results = entityManager.createQuery( criteria ).getResultList(); 
	
		entityManager.close();
		emf.close();
		
		return results;
	}
}
