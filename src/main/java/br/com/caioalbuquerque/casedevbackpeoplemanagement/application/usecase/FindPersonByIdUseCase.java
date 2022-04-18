package br.com.caioalbuquerque.casedevbackpeoplemanagement.application.usecase;

import br.com.caioalbuquerque.casedevbackpeoplemanagement.domain.entity.Person;

import java.util.Optional;

/**
 * @author Caio Henrique Albuquerque
 * @since 18/04/22
 */
public interface FindPersonByIdUseCase {
    public Optional<Person> perform(Long personId);
}