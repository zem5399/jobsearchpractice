package cs544.ea.jobsearchprojectpractice.service;

import cs544.ea.jobsearchprojectpractice.model.Address;
import cs544.ea.jobsearchprojectpractice.model.Job;

import java.util.List;

public interface ImplAddressService {
    List<Address> getAllAddress();
    Address getAddressById(int id);
    List<Address> addListOfAddress(List<Address> address);
    Address addOnAddress(Address address);
    String delete(int id);
    Address update(Address address);
}
