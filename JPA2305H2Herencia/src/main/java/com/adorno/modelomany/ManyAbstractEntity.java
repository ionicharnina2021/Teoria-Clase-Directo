package com.adorno.modelomany;

import jakarta.persistence.Entity;

@Entity
public abstract class ManyAbstractEntity extends ManyAbstractRootEntity {

    private String description;

    public ManyAbstractEntity() {
    }

    public ManyAbstractEntity(String nick, String description) {
        super(nick);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


}
