package cs544.ea.jobsearchprojectpractice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Skill {
    @Id
    @GeneratedValue
    private int skillId;
    private String name;
    private float experience;
    private String description;
    private String language;

    @ManyToOne
    private Job job;

    public Skill() {
    }

    public Skill(String name, float experience, String description, String language) {
        this.name = name;
        this.experience = experience;
        this.description = description;
        this.language = language;
    }

    public int getSkillId() {
        return skillId;
    }

    public void setSkillId(int skillId) {
        this.skillId = skillId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
