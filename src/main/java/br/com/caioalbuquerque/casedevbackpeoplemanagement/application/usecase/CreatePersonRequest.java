package br.com.caioalbuquerque.casedevbackpeoplemanagement.application.usecase;

import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author Caio Henrique Albuquerque
 * @since 18/04/22
 */
@Getter
public class CreatePersonRequest {
    private String name;
    private String identificator;
}