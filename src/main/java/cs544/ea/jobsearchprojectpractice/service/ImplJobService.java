package cs544.ea.jobsearchprojectpractice.service;

import cs544.ea.jobsearchprojectpractice.model.Job;

import java.util.List;

public interface ImplJobService {
    List<Job> getAllJobs();
    Job getJobById(int id);
    List<Job> addListOfJobs(List<Job> jobs);
    Job addOneJob(Job job);
    String delete(int id);
    Job update(Job job);
}
