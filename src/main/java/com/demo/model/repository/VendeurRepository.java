package com.demo.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.entities.Vendeur;

public interface VendeurRepository extends JpaRepository<Vendeur, Long> {
//List<Vendeur> find
List<Vendeur> findByNomOrPrenom(String  nom, String prenom);
}
