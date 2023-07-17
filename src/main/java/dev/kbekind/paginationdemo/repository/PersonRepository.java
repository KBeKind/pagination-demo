package dev.kbekind.paginationdemo.repository;


import dev.kbekind.paginationdemo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PersonRepository extends PagingAndSortingRepository<Person, Integer>, JpaRepository<Person, Integer>{



}
