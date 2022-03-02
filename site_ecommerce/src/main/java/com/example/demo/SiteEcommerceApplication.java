package com.example.demo;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.entity.Produit;
import com.example.repository.produitRepository;

@SpringBootApplication
public class SiteEcommerceApplication implements CommandLineRunner, WebMvcConfigurer {
    @Autowired
    produitRepository pr;


    public static void main(String[] args) {
        SpringApplication.run(SiteEcommerceApplication.class, args);
    }
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler("/resources/**").addResourceLocations("classpath:/static/")
                .setCacheControl(CacheControl.maxAge(2, TimeUnit.HOURS).cachePublic());
    }
    @Override
    public void run(String... args) throws  Exception{

        pr.save(new Produit("Licorne",20.99));
        pr.save(new Produit("Panda",20.99));
        pr.save(new Produit("Herisson",20.99));
        
        for(Produit prod : pr.findAll()){
            System.out.println("     "+ prod.toString());
        }
    }



}
