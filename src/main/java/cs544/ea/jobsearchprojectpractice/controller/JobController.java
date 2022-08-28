package cs544.ea.jobsearchprojectpractice.controller;

import cs544.ea.jobsearchprojectpractice.model.Job;
import cs544.ea.jobsearchprojectpractice.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobController {
    @Autowired
    JobService jobService;

    @PostMapping("/jobs")
    public List<Job> addListOfJobs(@RequestBody List<Job> jobs) {
        return jobService.addListOfJobs(jobs);
    }

    @GetMapping("/jobs")
    public List<Job> getAll() {
        return jobService.getAllJobs();
    }
}
