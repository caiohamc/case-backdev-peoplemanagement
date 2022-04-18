package br.com.caioalbuquerque.casedevbackpeoplemanagement.adapters.usecase;

import br.com.caioalbuquerque.casedevbackpeoplemanagement.application.repository.PersonRepository;
import br.com.caioalbuquerque.casedevbackpeoplemanagement.application.usecase.CreatePersonRequest;
import br.com.caioalbuquerque.casedevbackpeoplemanagement.application.usecase.CreatePersonUseCase;
import br.com.caioalbuquerque.casedevbackpeoplemanagement.domain.entity.Person;
import br.com.caioalbuquerque.casedevbackpeoplemanagement.domain.enums.PersonIdentificatorType;
import org.springframework.stereotype.Service;

/**
 * @author Caio Henrique Albuquerque
 * @since 18/04/22
 */
@Service
public class CreatePersonUseCaseImpl implements CreatePersonUseCase {
    private PersonRepository personRepo;

    public CreatePersonUseCaseImpl(PersonRepository personRepo) {
        this.personRepo = personRepo;
    }

    @Override
    public Person perform(CreatePersonRequest request) {
        if (request != null && request.getIdentificator() != null) {
            if(request.getIdentificator().length() == 11) {
                Person newPerson = new Person(request.getName(),
                        request.getIdentificator(), PersonIdentificatorType.CPF);
                return personRepo.save(newPerson);
            }

            if(request.getIdentificator().length() == 14) {
                Person newPerson = new Person(request.getName(),
                        request.getIdentificator(), PersonIdentificatorType.CNPJ);
                return personRepo.save(newPerson);
            }
        }

        return null;
    }
}