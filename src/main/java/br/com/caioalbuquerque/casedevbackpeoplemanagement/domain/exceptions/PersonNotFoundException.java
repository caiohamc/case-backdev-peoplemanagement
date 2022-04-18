package br.com.caioalbuquerque.casedevbackpeoplemanagement.domain.exceptions;

/**
 * @author Caio Henrique Albuquerque
 * @since 18/04/22
 */
public class PersonNotFoundException extends RuntimeException {
    public PersonNotFoundException(Long id) {
        super("Could not find person with id " + id);
    }
}