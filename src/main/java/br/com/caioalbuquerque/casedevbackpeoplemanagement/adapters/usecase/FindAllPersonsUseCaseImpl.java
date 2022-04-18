package br.com.caioalbuquerque.casedevbackpeoplemanagement.adapters.usecase;

import br.com.caioalbuquerque.casedevbackpeoplemanagement.application.repository.PersonRepository;
import br.com.caioalbuquerque.casedevbackpeoplemanagement.application.usecase.FindAllPersonsUseCase;
import br.com.caioalbuquerque.casedevbackpeoplemanagement.domain.entity.Person;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Caio Henrique Albuquerque
 * @since 18/04/22
 */
@Service
public class FindAllPersonsUseCaseImpl implements FindAllPersonsUseCase {
    private PersonRepository personRepo;

    public FindAllPersonsUseCaseImpl(PersonRepository personRepo) {
        this.personRepo = personRepo;
    }

    public List<Person> perform() {
        return personRepo.findAll();
    }
}