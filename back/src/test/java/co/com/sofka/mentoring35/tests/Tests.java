package co.com.sofka.mentoring35.tests;


import co.com.sofka.mentoring35.model.Random;
import co.com.sofka.mentoring35.service.RandomService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class Tests {
    @Autowired
    RandomService randomService;

    @Test
    public void testAddNew(){
        Mono<Random> random1 = Mono.just(new Random("asd","asd"));
        StepVerifier.create(random1).expectNext(new Random("asd","asd")).verifyComplete();
    }

    @Test
    public void ListAddNew(){
        Flux<Random> random1 = randomService.findAll();
        StepVerifier.create(random1).expectNext(new Random("asd1","asd1")).expectNext(new Random("asd1","asd1")).verifyComplete();
    }


}
