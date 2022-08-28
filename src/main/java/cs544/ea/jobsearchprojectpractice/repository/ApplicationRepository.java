package cs544.ea.jobsearchprojectpractice.repository;

import cs544.ea.jobsearchprojectpractice.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Integer> {
}
