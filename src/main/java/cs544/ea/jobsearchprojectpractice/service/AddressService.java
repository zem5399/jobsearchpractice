package cs544.ea.jobsearchprojectpractice.service;

import cs544.ea.jobsearchprojectpractice.model.Address;
import cs544.ea.jobsearchprojectpractice.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService implements ImplAddressService {

    @Autowired
    AddressRepository addressRepository;


    @Override
    public List<Address> getAllAddress() {
        return addressRepository.findAll();
    }

    @Override
    public Address getAddressById(int id) {
        return addressRepository.findById(id).get();
    }

    @Override
    public List<Address> addListOfAddress(List<Address> address) {
        return addressRepository.saveAll(address);
    }

    @Override
    public Address addOnAddress(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public String delete(int id) {
        addressRepository.deleteById(id);
        return "Address deleted";
    }

    @Override
    public Address update(Address address) {
        return addressRepository.save(address);
    }
}
