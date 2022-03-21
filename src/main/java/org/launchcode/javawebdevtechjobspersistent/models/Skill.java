package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @ManyToMany(mappedBy="skills")
    private List<Job> jobs = new ArrayList<>();

    @Size(max = 250)
    @NotBlank(message = "Please provide a description.")
    private String skillDescription;

    public Skill() {
    }

    //Didn't add getters and setters at first because assignment didn't specify. Added them after I kept getting errors that the template can't be parsed (skills/add.html).


    public String getSkillDescription() {
        return skillDescription;
    }
    public void setSkillDescription(String skillDescription) {
        this.skillDescription = skillDescription;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}