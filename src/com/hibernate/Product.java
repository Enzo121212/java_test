package com.hibernate;

import javax.persistence.*;

@Entity
@Table(name="Product")
public class Product {
	
	@Id  @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String libelle;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idArticle")
	private Article article;
	
	
	
	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public int getId() {
		return id;
	}



	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
    @Override
    public String toString() {
        return "\tlibelle=" + libelle + "\n\taddress=" + article ;
             
    }

}



