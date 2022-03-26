package co.com.sofka.mentoring35.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Random {
    @Id
    private String id;
    private String card1;
    private String card2;

    public Random() {
    }

    public Random(String card1, String card2) {
        this.card1 = card1;
        this.card2 = card2;
    }

    public String getId() {
        return id;
    }

    public void setIde(String id) {
        this.id = id;
    }

    public String getCard1() {
        return card1;
    }

    public void setCard1(String card1) {
        this.card1 = card1;
    }

    public String getCard2() {
        return card2;
    }

    public void setCard2(String card2) {
        this.card2 = card2;
    }
}
