package com.example.Controller.impl;

import org.springframework.stereotype.Service;

@Service
public class StringServiceImpl  implements StringService {
    @Override
    public String proguseName(String name) {
        return "Привет из сервиса "+name;
    }
}
