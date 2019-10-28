package com.vueApplication.VueWebShop.web;

import com.vueApplication.VueWebShop.domain.AppRole;
import com.vueApplication.VueWebShop.domain.AppRoleRepository;
import com.vueApplication.VueWebShop.domain.AppUser;
import com.vueApplication.VueWebShop.domain.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class VueWebShopApplication {

	@Autowired
	private AppUserRepository repository;

	@Autowired
	private AppRoleRepository roleRepository;

	public static void main(String[] args) {
		SpringApplication.run(VueWebShopApplication.class, args);
	}

}
