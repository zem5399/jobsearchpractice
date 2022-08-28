package cs544.ea.jobsearchprojectpractice.repository;

import cs544.ea.jobsearchprojectpractice.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Integer> {
}
