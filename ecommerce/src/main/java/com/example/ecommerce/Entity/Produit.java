package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.example.entity.Produit;
import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;



@Entity
public class Produit {


	public Produit() {
	}

	public Produit(String nom, double prix) {
		this.nom=nom;
		this.prix=prix;
	}
    @Id
	@GeneratedValue
	private long id;


	private String nom;


	private String description;


	private String imgUrl;

	private double prix;

	private int qte;

	private String devise;


	public void setDevise(String devise) {
		this.devise = devise;
	}


	public String getDevise() {
		return this.devise;
	}
	public void setQuantite(int quantite) {
		this.qte = quantite;
	}


	public int getQuantite() {
		return this.qte;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}



	@Override
	public String toString() {
		return "Id: " + getId() + " Nom: " + getNom() + " Description: " + getDescription() + " Prix: " + getPrix();
	}

}
