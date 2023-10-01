package com.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ConsoleOneToOne {

	public static void main(String[] args) {
		 EntityManagerFactory entityManagerFactory = null;
	        EntityManager entityManager = null;
	        try {
	            entityManagerFactory = Persistence.createEntityManagerFactory("WebStore");
	           entityManager = entityManagerFactory.createEntityManager();
	        
	            System.out.println( "- Lecture de tous les articles -----------" );
	            //Article art = entityManager.find(Article.class,2);
	            
	            Product produit = entityManager.find(Product.class , 1);
	           
	            System.out.println(  produit.getArticle().getPrice() );
	            
	            System.out.println();
	            

	  
	            
	        }catch(Exception e){
	        	System.out.print("probleme base de donne avec "+ e.getMessage());
	          
	        } finally {
	            if ( entityManager != null ) entityManager.close();
	            if ( entityManagerFactory != null ) entityManagerFactory.close();
	        }
	}

	

}
