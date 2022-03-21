package com.demo.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
List<Produit> findByQuantiteLessThan(int quantite);
List<Produit> findByDescriptionContaining(String contenu);
}
