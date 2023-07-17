package dev.kbekind.paginationdemo.data;

import dev.kbekind.paginationdemo.model.Address;
import dev.kbekind.paginationdemo.model.Person;
import dev.kbekind.paginationdemo.repository.PersonRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



@Component
public class SampleDataLoader implements CommandLineRunner {

    private final PersonRepository personRepository;

    public SampleDataLoader(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        Integer listLength = 100;

        for (int i = 0; i < listLength; i++) {

            Person person = new Person(
                    "Klee" + i,
                    "BeKind" + i,
                    new Address("Street" + i,"City" + i));
            personRepository.save(person);

        }

    }
}
