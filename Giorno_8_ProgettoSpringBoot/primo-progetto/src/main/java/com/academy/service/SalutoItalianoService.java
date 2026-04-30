package com.academy.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Primary
@Service
public class SalutoItalianoService implements SalutoService {

    @Override
    public String getSaluto() {
        return "Buongiorno!";
    }
}