package com.academy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.academy.ContatoreBeanPrototype;
import com.academy.ContatoreBeanSingleton;
import com.academy.service.SalutoService;

@RestController
public class SalutoController2 {
	
	  private final ContatoreBeanSingleton contatoreBeanSingleton;
	  private final  ContatoreBeanPrototype contatoreBeanPrototype;
	  private final SalutoService salutoService;

	@Autowired
    public SalutoController2(@Qualifier("salutoIngleseService")SalutoService salutoService,ContatoreBeanSingleton contatoreBeanSingleton,ContatoreBeanPrototype contatoreBeanPrototype) {
		
       this.salutoService = salutoService;
        this.contatoreBeanSingleton = contatoreBeanSingleton;
        this.contatoreBeanPrototype = contatoreBeanPrototype;
}
	
	
	@GetMapping("/saluto2")
    public String saluto() {
        return salutoService.getSaluto();
    }
	
	@GetMapping("/Contatore")
	public String contatore() {
		int valore = contatoreBeanSingleton.incrementa();
	    return "Contatore: " + valore;
	}
	
	
	
	@GetMapping("/Contatore2")
	public String contatore2() {
		int valore = contatoreBeanPrototype.incrementa();
	    return "Contatore: " + valore;
	}
	
	
	
	
	}



	    