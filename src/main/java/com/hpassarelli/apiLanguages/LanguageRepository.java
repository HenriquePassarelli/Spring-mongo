package com.hpassarelli.apiLanguages;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface LanguageRepository extends MongoRepository<Language, String> {

}
