package com.hpassarelli.apiLanguages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LanguageController {

    @Autowired
    private LanguageRepository repository;

    @GetMapping("/health")
    public String starter() {
        return "Service running";
    }

    @GetMapping("/languages")
    public List<Language> getLanguages(){
        return repository.findAll();
    }
}
