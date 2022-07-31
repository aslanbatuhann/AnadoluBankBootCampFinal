package com.batuhanaslan.insuranceagent.anadolubankbootcamp.service;

import com.batuhanaslan.insuranceagent.anadolubankbootcamp.model.Customer;
import com.batuhanaslan.insuranceagent.anadolubankbootcamp.repository.CustomerRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class CustomerService {
    private CustomerRepository customerRepository;

    public Customer get(int id) throws Exception {
        return customerRepository.getCustomer(id);
    }

    public List<Customer> list() {
        return customerRepository.getAllCustomer();
    }
}
