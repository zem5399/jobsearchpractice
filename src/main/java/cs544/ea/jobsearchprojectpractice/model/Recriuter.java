package cs544.ea.jobsearchprojectpractice.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Recriuter extends Company {

    @OneToMany
    private List<Client> client;

    public Recriuter() {
    }

    public Recriuter(String name, Address address, List<Client> client) {
        super(name, address);
        this.client = client;
    }

    public List<Client> getClient() {
        return client;
    }

    public void setClient(List<Client> client) {
        this.client = client;
    }
}
