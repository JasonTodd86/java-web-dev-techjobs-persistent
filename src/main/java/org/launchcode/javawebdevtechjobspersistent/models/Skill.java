package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @Size(min = 3, max = 255)
    private String skillDescription;

    public Skill() {
    }

    //Didn't add getters and setters because assignment didn't specify.
}