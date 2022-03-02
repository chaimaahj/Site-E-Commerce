package com.example.controller;

import java.util.Collection;
import java.util.Map;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.entity.Produit;
import com.example.repository.produitRepository;

@Controller
public class produitController {
    
    produitRepository produit;

    private Collection<Produit> produitList;



    private double totalPrice;

    

    @GetMapping("/produit")
    public String showProductList(Map<String, Object> model) {
       produitList =produit.findAll();
       model.put("produit",produitList);
       return "produit";
    }
    
}

