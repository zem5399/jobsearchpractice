package cs544.ea.jobsearchprojectpractice.model;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class ScreeeingInterveiw extends Interview {
    private String name;
    private String result;

    public ScreeeingInterveiw() {
    }

    public ScreeeingInterveiw(LocalDate date, String phoneNumber, String email, String name, String result) {
        super(date, phoneNumber, email);
        this.name = name;
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
