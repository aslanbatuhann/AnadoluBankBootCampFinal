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

    public ArrayList<Policy> getPolicyDate() throws Exception {
        return policyRepository.getPolicyDate();
    }

    public Double getPolicySum() {
        return policyRepository.getPolicySum();
    }

    public List<Policy> list() {
        return policyRepository.getAllPolicy();
    }

}
