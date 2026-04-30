package com.academy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class ContatoreBeanPrototype {
	
	private int contatore = 0;
	
	
	 public int incrementa() {
	        contatore++;
	        return contatore;
	    }

}
