package co.com.sofka.mentoring35.service;

import co.com.sofka.mentoring35.model.Random;
import co.com.sofka.mentoring35.repository.RandomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@Service
public class RandomService {

    private RandomRepository randomRepository;
    private List<String> cards;

    @Autowired
    public RandomService(RandomRepository randomRepository) {
        this.randomRepository = randomRepository;
        this.cards = new ArrayList<String>();
        cargarCartas();
    }

    public Flux<Random> findAll() {
        return randomRepository.findAll();
    }

    public Mono<Random> addNew(){
        int randomIndex1 = getRandomNumber(0,51);
        int randomIndex2 = getRandomNumber(0,51);

        String card1 = this.cards.get(randomIndex1);
        String card2 = this.cards.get(randomIndex2);

        Mono<Random> random = Mono.just(new Random(card1, card2));
        return random.flatMap(randomRepository::insert);
    }

    private int getRandomNumber(int min, int max){
        return (int)Math.floor(Math.random()*(max-min+1)+min);
    }

    private void cargarCartas() {
        this.cards.add("https://deckofcardsapi.com/static/img/AS.png");
        this.cards.add("https://deckofcardsapi.com/static/img/2S.png");
        this.cards.add("https://deckofcardsapi.com/static/img/3S.png");
        this.cards.add("https://deckofcardsapi.com/static/img/4S.png");
        this.cards.add("https://deckofcardsapi.com/static/img/5S.png");
        this.cards.add("https://deckofcardsapi.com/static/img/6S.png");
        this.cards.add("https://deckofcardsapi.com/static/img/7S.png");
        this.cards.add("https://deckofcardsapi.com/static/img/8S.png");
        this.cards.add("https://deckofcardsapi.com/static/img/9S.png");
        this.cards.add("https://deckofcardsapi.com/static/img/0S.png");
        this.cards.add("https://deckofcardsapi.com/static/img/JS.png");
        this.cards.add("https://deckofcardsapi.com/static/img/QS.png");
        this.cards.add("https://deckofcardsapi.com/static/img/KS.png");

        this.cards.add("https://deckofcardsapi.com/static/img/AH.png");
        this.cards.add("https://deckofcardsapi.com/static/img/2H.png");
        this.cards.add("https://deckofcardsapi.com/static/img/3H.png");
        this.cards.add("https://deckofcardsapi.com/static/img/4H.png");
        this.cards.add("https://deckofcardsapi.com/static/img/5H.png");
        this.cards.add("https://deckofcardsapi.com/static/img/6H.png");
        this.cards.add("https://deckofcardsapi.com/static/img/7H.png");
        this.cards.add("https://deckofcardsapi.com/static/img/8H.png");
        this.cards.add("https://deckofcardsapi.com/static/img/9H.png");
        this.cards.add("https://deckofcardsapi.com/static/img/0H.png");
        this.cards.add("https://deckofcardsapi.com/static/img/JH.png");
        this.cards.add("https://deckofcardsapi.com/static/img/QH.png");
        this.cards.add("https://deckofcardsapi.com/static/img/KH.png");

        this.cards.add("https://deckofcardsapi.com/static/img/AC.png");
        this.cards.add("https://deckofcardsapi.com/static/img/2C.png");
        this.cards.add("https://deckofcardsapi.com/static/img/3C.png");
        this.cards.add("https://deckofcardsapi.com/static/img/4C.png");
        this.cards.add("https://deckofcardsapi.com/static/img/5C.png");
        this.cards.add("https://deckofcardsapi.com/static/img/6C.png");
        this.cards.add("https://deckofcardsapi.com/static/img/7C.png");
        this.cards.add("https://deckofcardsapi.com/static/img/8C.png");
        this.cards.add("https://deckofcardsapi.com/static/img/9C.png");
        this.cards.add("https://deckofcardsapi.com/static/img/0C.png");
        this.cards.add("https://deckofcardsapi.com/static/img/JC.png");
        this.cards.add("https://deckofcardsapi.com/static/img/QC.png");
        this.cards.add("https://deckofcardsapi.com/static/img/KC.png");

        this.cards.add("https://deckofcardsapi.com/static/img/AD.png");
        this.cards.add("https://deckofcardsapi.com/static/img/2D.png");
        this.cards.add("https://deckofcardsapi.com/static/img/3D.png");
        this.cards.add("https://deckofcardsapi.com/static/img/4D.png");
        this.cards.add("https://deckofcardsapi.com/static/img/5D.png");
        this.cards.add("https://deckofcardsapi.com/static/img/6D.png");
        this.cards.add("https://deckofcardsapi.com/static/img/7D.png");
        this.cards.add("https://deckofcardsapi.com/static/img/8D.png");
        this.cards.add("https://deckofcardsapi.com/static/img/9D.png");
        this.cards.add("https://deckofcardsapi.com/static/img/0D.png");
        this.cards.add("https://deckofcardsapi.com/static/img/JD.png");
        this.cards.add("https://deckofcardsapi.com/static/img/QD.png");
        this.cards.add("https://deckofcardsapi.com/static/img/KD.png");
    }
}
