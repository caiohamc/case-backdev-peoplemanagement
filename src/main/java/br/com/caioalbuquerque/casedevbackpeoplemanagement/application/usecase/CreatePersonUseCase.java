package br.com.caioalbuquerque.casedevbackpeoplemanagement.application.usecase;

import br.com.caioalbuquerque.casedevbackpeoplemanagement.domain.entity.Person;

/**
 * @author Caio Henrique Albuquerque
 * @since 18/04/22
 */
public interface CreatePersonUseCase {
    public Person perform(CreatePersonRequest person);
}