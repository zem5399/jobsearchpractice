package cs544.ea.jobsearchprojectpractice.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Job {
    @Id
    @GeneratedValue
    private int id;
    private String title;
    private float salary;

    @OneToOne
    private Application application;

    @OneToMany(mappedBy = "job")
    private List<Skill> skill;

    @ManyToOne
    private Company company;

    public Job() {
    }

    public Job(String title, float salary) {
        this.title = title;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
