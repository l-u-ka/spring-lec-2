package com.example.demo.services;

import com.example.demo.entities.Address;
import com.example.demo.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    public List<Address> getAll() {
        return addressRepository.findAll();
    }

    public Address getAddressById (Long id) throws Exception {
        return addressRepository.findById(id).orElseThrow(() -> new Exception("RECORD_NOT FOUND"));
    }

}
