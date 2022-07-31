package com.batuhanaslan.insuranceagent.anadolubankbootcamp.service;

import com.batuhanaslan.insuranceagent.anadolubankbootcamp.model.Policy;
import com.batuhanaslan.insuranceagent.anadolubankbootcamp.repository.PolicyRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Data
public class PolicyService {

    @Autowired
    private PolicyRepository policyRepository;

    public Policy get(int id) throws Exception {
        return policyRepository.getPolicy(id);
    }

    public ArrayList<Policy> getPolicyDate(String date_policy) throws Exception {
        return  policyRepository.getPolicyDate(date_policy);
    }

    public List<Policy> list() {
        return policyRepository.getAllPolicy();
    }

}
