package com.adorno.modelomany;

import jakarta.persistence.Entity;

@Entity
public class ManyConcreteEntity extends ManyAbstractEntity {

    private String name;

    public ManyConcreteEntity() {
    }

    public ManyConcreteEntity(String nick, String description, String name) {
        super(nick, description);
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
