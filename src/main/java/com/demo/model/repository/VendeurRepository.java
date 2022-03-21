package com.demo.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.model.entities.Vendeur;

public interface VendeurRepository extends JpaRepository<Vendeur, Long> {
//List<Vendeur> find
List<Vendeur> findByNomOrPrenom(String  nom, String prenom);
@Query("SELECT v from Vendeur v ORDER BY adresse")
List<Vendeur> findVendeurs();
@Query("SELECT Count(v.id) from Vendeur v")
int coundVendeur();
//List<Vendeur> findAllOrderByAdresse();

}
