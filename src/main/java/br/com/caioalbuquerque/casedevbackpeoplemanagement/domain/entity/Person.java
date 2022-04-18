package br.com.caioalbuquerque.casedevbackpeoplemanagement.domain.entity;

import br.com.caioalbuquerque.casedevbackpeoplemanagement.domain.enums.PersonIdentificatorType;
import lombok.*;

import javax.persistence.*;

/**
 * @author Caio Henrique Albuquerque
 * @since 18/04/22
 */
@Entity
@NoArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String identificator;

    @Column(name = "identificator_type")
    private PersonIdentificatorType identificatorType;

    public Person(String name, String identificator, PersonIdentificatorType identificatorType) {
        this.name = name;
        this.identificator = identificator;
        this.identificatorType = identificatorType;
    }
}