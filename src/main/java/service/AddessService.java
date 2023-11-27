package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Address;
import repo.AddressRepository;

@service
public class AddessService {
	 	@Autowired
	    private AddressRepository repository;

	    public boolean insert(Address address){
	        boolean check = repository.save(address) !=null;
	        return check;
	    }
	    public List<Address> findAll(){
	        return repository.findAll();
	    }

}
