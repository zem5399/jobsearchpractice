package cs544.ea.jobsearchprojectpractice.model;

import javax.persistence.*;
import java.util.List;

@Entity
public abstract class Company {
    @Id
    @GeneratedValue
    private int id;
    private String name;

    @OneToOne
    private Address address;

    @OneToMany(mappedBy = "company")
    private List<Job> job;

    protected Company() {
    }

    protected Company(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
