package com.example.ecommerce;

import java.util.concurrent.TimeUnit;

import com.example.ecommerce.Repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.entity.Produit;


@SpringBootApplication
public class DemoApplication implements CommandLineRunner, WebMvcConfigurer {

	@Autowired
	ProduitRepository pr;


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {

		registry.addResourceHandler("/resources/**").addResourceLocations("classpath:/static/")
				.setCacheControl(CacheControl.maxAge(2, TimeUnit.HOURS).cachePublic());
	}

	@Override
	public void run(String... args) throws  Exception{

		pr.save(new Produit("PANTALON",20.99));
		pr.save(new Produit("CHEMISE",20.99));
		pr.save(new Produit("JUPE",20.99));

		for(Produit prod : pr.findAll()){
			System.out.println("     "+ prod.toString());
		}

	}



}
