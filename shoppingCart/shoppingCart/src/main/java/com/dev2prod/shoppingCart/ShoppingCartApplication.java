package com.dev2prod.shoppingCart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ShoppingCartApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartApplication.class, args);
	}


    //this is required replace the hard-coaded URL with Discovery client 
    @Bean("webclient")
    @LoadBalanced
    WebClient.Builder getWebClient(){
		return WebClient.builder();
	}
    
   
}
