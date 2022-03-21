package com.demo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
