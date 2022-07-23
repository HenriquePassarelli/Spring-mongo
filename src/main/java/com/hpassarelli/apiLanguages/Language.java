package com.hpassarelli.apiLanguages;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("languages")
public class Language {

    @Id
    private String id;
    private String title;
    private String image;
    private String ranking;

    public Language(String id, String title, String image, String ranking) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.ranking = ranking;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public String getRanking() {
        return ranking;
    }

    public String getId() {
        return id;
    }
}
