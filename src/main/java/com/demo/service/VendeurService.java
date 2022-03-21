package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.entities.Vendeur;
import com.demo.model.repository.VendeurRepository;

@Service
public class VendeurService {

	@Autowired
	VendeurRepository vendeurapi;
public Vendeur add(Vendeur v)
{
return vendeurapi.save(v);	
}
public List<Vendeur> listerVendeurs()
{
return vendeurapi.findAll();	
}
public List<Vendeur> filterBynomprenom(String nom,String prenom)
{
return vendeurapi.findByNomOrPrenom(nom, prenom);	
}



}
