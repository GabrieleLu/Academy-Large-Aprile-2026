package com.academy;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class SalutoComplesso {
	

    @PostConstruct
    public void init() {
        System.out.println("bean inizializzato");
        
    }
    
    @PreDestroy
    public void cleanup() {
    	 System.out.println("bean distrutto");
    }
    
}
