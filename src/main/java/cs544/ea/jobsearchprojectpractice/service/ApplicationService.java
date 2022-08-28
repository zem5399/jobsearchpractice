package cs544.ea.jobsearchprojectpractice.service;

import cs544.ea.jobsearchprojectpractice.model.Application;
import cs544.ea.jobsearchprojectpractice.model.Job;
import cs544.ea.jobsearchprojectpractice.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ApplicationService implements ImplApplicationService{
    @Autowired
    ApplicationRepository applicationRepository;


    @Override
    public List<Application> getAllApplication() {
        return applicationRepository.findAll();
    }

    @Override
    public Application getApplicationById(int id) {
        return applicationRepository.findById(id).get();
    }

    @Override
    public List<Application> addListOfApplication(List<Application> applicationList) {
        return applicationRepository.saveAll(applicationList);
    }

    @Override
    public Application addOneApplication(Application application) {
        return applicationRepository.save(application);
    }

    @Override
    public String delete(int id) {
        applicationRepository.deleteById(id);
        return "Application deleted";
    }

    @Override
    public Application update(Application application) {
        return applicationRepository.save(application);
    }
}
