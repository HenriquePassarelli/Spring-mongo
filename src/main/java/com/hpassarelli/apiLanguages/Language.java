package com.hpassarelli.apiLanguages;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("languages")
public class Language {

    @Id
    private String id;
    private String title;
    private String image;
    private String rank;

    public Language(String title, String image, String rank) {
        this.title = title;
        this.image = image;
        this.rank = rank;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public String getRank() {
        return rank;
    }

    public String getId() {
        return id;
    }
}
