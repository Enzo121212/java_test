package com.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Console {

	public static void main(String[] args) {
		 EntityManagerFactory entityManagerFactory = null;
	        EntityManager entityManager = null;
	        try {
	            entityManagerFactory = Persistence.createEntityManagerFactory("WebStore");
	           entityManager = entityManagerFactory.createEntityManager();
	        
	            System.out.println( "- Lecture de tous les articles -----------" );
	            Article art = entityManager.find(Article.class,3);
	            System.out.println( "ART = "+art );
	            
	            EntityTransaction trans = entityManager.getTransaction();
	            trans.begin();
	            	//update price 
	            	/*art.setPrice(10); 
	            	entityManager.persist(art);*/
	            
	            	//insert
	            	/**Article newArticle = new Article("Les technologie" , "Fer a soude",123);
	            	entityManager.persist(newArticle);**/
	            
	            	
	            	//Delete
	            	/**Article art2 = entityManager.find(Article.class,1);
	            	entityManager.remove(art2); **/
	            
	            trans.commit();
	            
	           /** SELECT
	            * List<Article> result = entityManager.createQuery("from Article",Article.class).getResultList();
	            
	            for (Article article : result) {
	                System.out.println( article );
	            }**/
	            
	            /** List<Article> articles = entityManager.createQuery( "from T_Articles", Article.class )
	                                   .getResultList();
	            for (Article article : articles) {
	                System.out.println( article );
	            } **/
	            
	        }catch(Exception e){
	        	System.out.print("probleme base de donne avec "+ e.getMessage());
	          
	        } finally {
	            if ( entityManager != null ) entityManager.close();
	            if ( entityManagerFactory != null ) entityManagerFactory.close();
	        }
	}

}
