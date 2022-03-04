package com.example.ecommerce.Repository;


import com.example.entity.Produit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface ProduitRepository extends CrudRepository<com.example.entity.Produit, Long> {


    Iterable<Produit> findAll() ;
    Produit findById(Integer id);
    Collection<Produit> findByName(String name);


}

