package cs544.ea.jobsearchprojectpractice.model;

import javax.persistence.Entity;
import java.time.LocalDate;
@Entity
public class HiringManagerInterveiw extends Interview {
    private int size;
    private LocalDate localDate;

    public HiringManagerInterveiw() {
    }

    public HiringManagerInterveiw(LocalDate date, String phoneNumber, String email, int size, LocalDate localDate) {
        super(date, phoneNumber, email);
        this.size = size;
        this.localDate = localDate;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}
