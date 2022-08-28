package cs544.ea.jobsearchprojectpractice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {
    @Id
    @GeneratedValue
    private int id;
    private String street;
    private String city;
    private String state;
    private String country;

    @OneToOne
    private Company company;

    public Address() {
    }

    public Address(String street, String city, String state, String country, Company company) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
