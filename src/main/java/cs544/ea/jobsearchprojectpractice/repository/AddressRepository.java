package cs544.ea.jobsearchprojectpractice.repository;

import cs544.ea.jobsearchprojectpractice.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
