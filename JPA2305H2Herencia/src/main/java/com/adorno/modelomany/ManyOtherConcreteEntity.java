package com.adorno.modelomany;

import jakarta.persistence.Entity;

@Entity
public class ManyOtherConcreteEntity extends ManyAbstractEntity {

    private String surname;

    public ManyOtherConcreteEntity() {
    }

    public ManyOtherConcreteEntity(String nick, String description, String surname) {
        super(nick, description);
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

}
