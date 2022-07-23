package com.hpassarelli.apiLanguages;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LanguageRepository extends MongoRepository<Language, String> {

}
