package com.demo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.entities.Vendeur;

public interface VendeurRepository extends JpaRepository<Vendeur, Long> {

}
