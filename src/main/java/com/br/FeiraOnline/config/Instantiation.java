package com.br.FeiraOnline.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.br.FeiraOnline.domain.Product;
import com.br.FeiraOnline.repository.ProcutcRepository;

@Configuration
public class Instantiation implements CommandLineRunner{
	@Autowired
	private ProcutcRepository productRepsotirory;

	@Override
	public void run(String... args) throws Exception {
		
		productRepsotirory.deleteAll();
		
		Product bicicleta = new Product(null, "123054","bicileta", "maria@gmail.com","61 991-4010");
		Product aviao = new Product(null, "Alex Green", "aviao","alex@gmail.com","61 991-4011");
		Product carro = new Product(null, "Bob Grey","carro" ,"bob@gmail.com","61 991-4010");
		
		productRepsotirory.saveAll(Arrays.asList(bicicleta,aviao,carro));
		
	}

}
