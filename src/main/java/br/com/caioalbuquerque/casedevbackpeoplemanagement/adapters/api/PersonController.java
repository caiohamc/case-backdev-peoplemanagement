package br.com.caioalbuquerque.casedevbackpeoplemanagement.adapters.api;

import br.com.caioalbuquerque.casedevbackpeoplemanagement.application.usecase.CreatePersonRequest;
import br.com.caioalbuquerque.casedevbackpeoplemanagement.application.usecase.CreatePersonUseCase;
import br.com.caioalbuquerque.casedevbackpeoplemanagement.application.usecase.FindPersonByIdUseCase;
import br.com.caioalbuquerque.casedevbackpeoplemanagement.application.usecase.FindAllPersonsUseCase;
import br.com.caioalbuquerque.casedevbackpeoplemanagement.domain.entity.Person;
import br.com.caioalbuquerque.casedevbackpeoplemanagement.domain.exceptions.PersonNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 * @author Caio Henrique Albuquerque
 * @since 18/04/22
 */
@RestController
@RequestMapping(path = "/api/v1/person", produces = APPLICATION_JSON_VALUE)
public class PersonController {
    private static final Logger LOGGER = Logger.getLogger("CandidateController");

    @Autowired
    private FindAllPersonsUseCase findAllPersonsUseCase;

    @Autowired
    private FindPersonByIdUseCase findPersonByIdUseCase;

    @Autowired
    private CreatePersonUseCase createPersonUseCase;

    @GetMapping(path = "/")
    public List<Person> findAllPersons(){
        LOGGER.info("Searching for all persons ...");
        return findAllPersonsUseCase.perform();
    }

    @GetMapping(path = "/{id}")
    public Person findPersonById(@PathVariable("id") Long personId) {
        LOGGER.info("Searching for person with id " + personId + " ...");
        return findPersonByIdUseCase.perform(personId)
                .orElseThrow(() -> new PersonNotFoundException(personId));
    }

    @PostMapping(path = "/")
    @ResponseStatus(HttpStatus.CREATED)
    public Person createPerson(@RequestBody CreatePersonRequest request) {
        LOGGER.info("Creating new person ...");
        return createPersonUseCase.perform(request);
    }
}