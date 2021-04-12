package com.csilocacoes.myapi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.csilocacoes.myapi.domain.Usuario;
import com.csilocacoes.myapi.repositories.UsuarioRepository;

@SpringBootApplication
public class MyApiApplication implements CommandLineRunner {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(MyApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Usuario u4 = new Usuario(null, "Hulk", "dbanner", "123");


		// usuarioRepository.saveAll(Arrays.asList(u4));

	}

}
