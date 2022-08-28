package cs544.ea.jobsearchprojectpractice.service;

import cs544.ea.jobsearchprojectpractice.model.Application;
import cs544.ea.jobsearchprojectpractice.model.Job;

import java.util.List;

public interface ImplApplicationService {
    List<Application> getAllApplication();
    Application getApplicationById(int id);
    List<Application> addListOfApplication(List<Application> applicationList);
    Application addOneApplication(Application application);
    String delete(int id);
    Application update(Application application);
}
