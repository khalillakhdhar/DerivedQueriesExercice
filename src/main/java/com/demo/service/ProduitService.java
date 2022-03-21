package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.entities.Produit;
import com.demo.model.repository.ProduitRepository;

@Service
public class ProduitService {
@Autowired
ProduitRepository produitRepo;
public Produit addproduct(Produit pr)
{
return produitRepo.save(pr);	

}
public List<Produit> searchQuantite(int quantite)
{
return produitRepo.findByQuantiteLessThan(quantite);	
}
public List<Produit> searchByDescriptionContent(String content)
{
return produitRepo.findByDescriptionContaining(content);	
}

}
