package co.com.sofka.mentoring35.repository;

import co.com.sofka.mentoring35.model.Random;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RandomRepository extends ReactiveMongoRepository<Random, String> {
    
}
