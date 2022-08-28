package cs544.ea.jobsearchprojectpractice.model;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class TechnicalInterveiw extends Interview {
    private float duration;
    private Location location;
    private String questions;

    public TechnicalInterveiw() {
    }

    public TechnicalInterveiw(LocalDate date, String phoneNumber, String email, float duration, Location location, String questions) {
        super(date, phoneNumber, email);
        this.duration = duration;
        this.location = location;
        this.questions = questions;
    }
}
