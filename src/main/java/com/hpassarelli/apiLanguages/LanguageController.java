package com.hpassarelli.apiLanguages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public List<Language> getLanguages() {
        return repository.findAll();
    }

    @PostMapping("languages")
    public Language setLanguage(@RequestBody Language language) {
        Language saved = repository.save(language);

        return saved;
    }

    @DeleteMapping("/languages/{id}")
    public void deleteLanguage(@PathVariable("id") String id) {
        repository.deleteById(id);
    }

    @PutMapping("/languages")
    public Language updateLanguage(@RequestBody Language language){

        Language saved = repository.save(language);

        return saved;
    }
}
