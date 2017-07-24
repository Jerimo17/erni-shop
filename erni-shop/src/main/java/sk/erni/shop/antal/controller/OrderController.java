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

import sk.erni.shop.antal.model.ShopOrder;

@Path("shoporder")
public class OrderController {
	
	private EntityManager entityManager;
	private EntityManagerFactory emf;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ShopOrder> orders() {
		
		emf = Persistence.createEntityManagerFactory("primary");
		entityManager = emf.createEntityManager(); 
		
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<ShopOrder> criteria = builder.createQuery( ShopOrder.class );
		Root<ShopOrder> shop = criteria.from( ShopOrder.class );
		criteria.select( shop );
		List<ShopOrder> results = entityManager.createQuery( criteria ).getResultList(); 
	
		entityManager.close();
		emf.close();
		
		return results;
	}
}

