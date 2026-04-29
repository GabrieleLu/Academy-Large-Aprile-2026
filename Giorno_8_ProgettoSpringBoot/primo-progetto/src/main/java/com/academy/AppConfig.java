package com.academy;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {

    @Value("${app.nome}")
    private String appNome;

    @Value("${app.versione}")
    private String appVersione;

    @Value("${app.messaggio-benvenuto}")
    private String messaggioBenvenuto;

    @PostConstruct
    public void init() {
        System.out.println("=== CONFIGURAZIONE APPLICAZIONE ===");
        System.out.println("Nome: " + appNome);
        System.out.println("Versione: " + appVersione);
        System.out.println("Messaggio: " + messaggioBenvenuto);
        System.out.println("===================================");
    }
}
