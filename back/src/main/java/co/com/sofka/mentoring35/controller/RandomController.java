package co.com.sofka.mentoring35.controller;

import java.util.ArrayList;
import java.util.List;

import co.com.sofka.mentoring35.model.Random;
import co.com.sofka.mentoring35.repository.RandomRepository;
import co.com.sofka.mentoring35.service.RandomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/r")
public class RandomController {

    @Autowired
    private RandomService randomService;

    @PostMapping
    public Mono<Random> addNew() {
        return randomService.addNew();
    }

    @GetMapping
    public Flux<Random> list(){
        return randomService.findAll();
    }
}
