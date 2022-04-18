package br.com.caioalbuquerque.casedevbackpeoplemanagement.domain.enums;

/**
 * @author Caio Henrique Albuquerque
 * @since 18/04/22
 */
public enum PersonIdentificatorType {
    CPF(1), CNPJ(2);

    private final int type;

    PersonIdentificatorType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}