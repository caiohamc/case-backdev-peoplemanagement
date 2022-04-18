package br.com.caioalbuquerque.casedevbackpeoplemanagement.application.repository;

import br.com.caioalbuquerque.casedevbackpeoplemanagement.domain.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Caio Henrique Albuquerque
 * @since 18/04/22
 */
public interface PersonRepository extends JpaRepository<Person, Long> {
    Optional<Person> findById(Integer id);
}