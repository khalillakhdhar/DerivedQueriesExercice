package com.demo.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.Min;
@Entity
public class Produit implements Serializable {

private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(nullable = false)
private String titre;
@Lob
private String description;
@Min(value = 0)
private int quantite;
@Column(nullable = false)
private double prix;
public Produit() {
	super();
	// TODO Auto-generated constructor stub
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getQuantite() {
	return quantite;
}
public void setQuantite(int quantite) {
	this.quantite = quantite;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}

public Produit(String titre, String description, @Min(0) int quantite, double prix) {
	super();
	this.titre = titre;
	this.description = description;
	this.quantite = quantite;
	this.prix = prix;
}
@Override
public String toString() {
	return "Produit [id=" + id + ", titre=" + titre + ", description=" + description + ", quantite=" + quantite
			+ ", prix=" + prix + "]";
}
	
	
}
