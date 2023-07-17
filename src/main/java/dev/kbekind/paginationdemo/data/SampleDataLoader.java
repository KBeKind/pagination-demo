package dev.kbekind.paginationdemo.data;

import dev.kbekind.paginationdemo.model.Address;
import dev.kbekind.paginationdemo.model.Person;
import dev.kbekind.paginationdemo.repository.PersonRepository;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;


@Component
public class SampleDataLoader implements CommandLineRunner {


    private final PersonRepository personRepository;

    public SampleDataLoader(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        Person person = new Person(
                "Klee",
                "BeKind",
                new Address("Street","City"));
        personRepository.save(person);
    }
}
