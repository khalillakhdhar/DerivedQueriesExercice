package com.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.model.entities.Produit;
import com.demo.model.entities.Vendeur;
import com.demo.service.ProduitService;
import com.demo.service.VendeurService;

@SpringBootApplication
public class DerivedQueriesExerciceApplication implements CommandLineRunner {
@Autowired
VendeurService vs;
@Autowired
ProduitService prs;
	
	public static void main(String[] args) {
		SpringApplication.run(DerivedQueriesExerciceApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		
		// TODO Auto-generated method stub
		Vendeur v1=new Vendeur("jean", "jaque", "Paris");
		Vendeur v2=new Vendeur("Musk", "elon", "New jersey");
		Vendeur v3=new Vendeur("Gates", "Bill", "Alabama");
		vs.add(v1);
		vs.add(v2);
		vs.add(v3);
		Produit pr1=new Produit("DVD", "dvd", 3, 1);
		Produit pr2=new Produit("tesla Cars", "tesla TR44 new model",2, 33000);
		Produit pr3=new Produit("Microsoft office", "MSO licence 3 PC", 30, 130);
		prs.addproduct(pr1);
		prs.addproduct(pr2);
		prs.addproduct(pr3);
		List<Vendeur> lv=new ArrayList<Vendeur>();
		lv=vs.filterBynomprenom("Musk", "bill");
		int i=0;
		for(Vendeur vd: lv)
		{
			i++;
			
			System.out.println("vendeur filtré numéro "+i+ " "+ vd.toString());
			
		}
		
		List<Produit> lp=new ArrayList<Produit>();
		lp=prs.searchQuantite(4);
		for(Produit p:lp)
		{
			System.out.println("produit avec une quantité < 4 "+p.toString());
			
		}
		List<Produit> lpdes=new ArrayList<Produit>();
		lpdes=prs.searchByDescriptionContent("tesla");
		for(Produit pr:lpdes)
		{
			System.out.println(" résultat filtré par description "+pr.toString());
		}
		
	}

}
