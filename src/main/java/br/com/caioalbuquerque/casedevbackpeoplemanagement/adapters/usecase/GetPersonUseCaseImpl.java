package br.com.caioalbuquerque.casedevbackpeoplemanagement.adapters.usecase;

import br.com.caioalbuquerque.casedevbackpeoplemanagement.application.repository.PersonRepository;
import br.com.caioalbuquerque.casedevbackpeoplemanagement.application.usecase.FindPersonByIdUseCase;
import br.com.caioalbuquerque.casedevbackpeoplemanagement.domain.entity.Person;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author Caio Henrique Albuquerque
 * @since 18/04/22
 */
@Service
public class GetPersonUseCaseImpl implements FindPersonByIdUseCase {
    private PersonRepository personRepo;

    public GetPersonUseCaseImpl(PersonRepository personRepo) {
        this.personRepo = personRepo;
    }

    public Optional<Person> perform(Long personId) {
        return personRepo.findById(personId);
    }
}