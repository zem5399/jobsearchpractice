package cs544.ea.jobsearchprojectpractice.service;

import cs544.ea.jobsearchprojectpractice.model.Job;
import cs544.ea.jobsearchprojectpractice.repository.ApplicationRepository;
import cs544.ea.jobsearchprojectpractice.repository.JobRepository;
import cs544.ea.jobsearchprojectpractice.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService implements ImplJobService{

    @Autowired
    JobRepository jobRepository;
    @Autowired
    ApplicationRepository applicationRepository;
    @Autowired
    SkillRepository skillRepository;


    @Override
    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    @Override
    public Job getJobById(int id) {
        return jobRepository.findById(id).get();
    }

    @Override
    public List<Job> addListOfJobs(List<Job> jobs) {
        return jobRepository.saveAll(jobs);
    }

    @Override
    public Job addOneJob(Job job) {
        return jobRepository.save(job);
    }

    @Override
    public String delete(int id) {
        jobRepository.deleteById(id);
        return "job deleted";
    }

    @Override
    public Job update(Job job) {
        return null;
    }
}
