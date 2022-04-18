package br.com.caioalbuquerque.casedevbackpeoplemanagement.application.usecase;

import br.com.caioalbuquerque.casedevbackpeoplemanagement.domain.entity.Person;

import java.util.List;

/**
 * @author Caio Henrique Albuquerque
 * @since 18/04/22
 */
public interface FindAllPersonsUseCase {
    public List<Person> perform();
}