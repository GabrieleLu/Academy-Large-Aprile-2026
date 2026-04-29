package com.academy.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalutoController {
	
	
	@Value("${app.nome}")
    private String appNome;

    @Value("${app.versione}")
    private String appVersione;

    @Value("${app.messaggio-benvenuto}")
    private String messaggioBenvenuto;
    
    @Value("${server.port}")
    private String porta;
    
    
    

    @GetMapping("/saluto")
    public String saluto() {
        return "Ciao dal mio primo Spring Boot!!!!";
    }
    
    
    @GetMapping("/info")
    public Map<String, String> info() {
        Map<String, String> risposta = new HashMap<>();
        risposta.put("autore", "Mario Rossi");
        return risposta;
    }
    
    
    @GetMapping("/app-info")
    public String appInfo() {
        return "App: " + appNome +
               ", Versione: " + appVersione +
               ", Messaggio: " + messaggioBenvenuto;
    
}
    @GetMapping("/port-info")
    public String portInfo() {
        return "La porta dove sta girando la app e : " + porta ;
    }
    
    
    

}


