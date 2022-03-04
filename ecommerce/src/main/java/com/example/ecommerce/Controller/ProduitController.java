package com.example.ecommerce.Controller;

import com.example.ecommerce.Repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;
import java.util.Map;

@Controller
public class ProduitController {


    ProduitRepository pr;

    private Collection<com.example.entity.Produit> produitList;
    private double total;



    @GetMapping("/produit")
    public String showProduitList(Map<String, Object> model) {
        produitList = (Collection<com.example.entity.Produit>) pr.findAll();
        model.put("produit",produitList);
        return "produit";
    }

}
