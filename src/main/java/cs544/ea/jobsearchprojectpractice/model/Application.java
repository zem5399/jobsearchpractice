package cs544.ea.jobsearchprojectpractice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.LocalDate;

@Entity
public class Application {
    @Id
    @GeneratedValue
    private int appId;
    private LocalDate date;
    private float resumeVersion;

    @OneToOne
    private Job job;

    public Application() {
    }

    public Application(LocalDate date, float resumeVersion) {
        this.date = date;
        this.resumeVersion = resumeVersion;
    }

    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public float getResumeVersion() {
        return resumeVersion;
    }

    public void setResumeVersion(float resumeVersion) {
        this.resumeVersion = resumeVersion;
    }
}
