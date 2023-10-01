package com.h2database;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class Console {
	  
	public static void main(String[] args) {

			    EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
			    System.out.println(emf);
	

	}

}
