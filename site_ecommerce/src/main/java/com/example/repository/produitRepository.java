package com.example.repository;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Produit;

@Repository
public interface produitRepository  extends CrudRepository<Produit, Double> {


    Collection<Produit> findAll() ;
    Produit findById(Integer id);
    Collection<Produit> findByName(String name);


}
