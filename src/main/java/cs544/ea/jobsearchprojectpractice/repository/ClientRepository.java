package cs544.ea.jobsearchprojectpractice.repository;

import cs544.ea.jobsearchprojectpractice.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
