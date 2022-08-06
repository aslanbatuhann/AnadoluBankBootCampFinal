package com.batuhanaslan.insuranceagent.anadolubankbootcamp.service;

import com.batuhanaslan.insuranceagent.anadolubankbootcamp.model.Agent;
import com.batuhanaslan.insuranceagent.anadolubankbootcamp.repository.AgentRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class AgentService {
    private AgentRepository agentRepository;

    public List getAgentUsername(String user_name, String password) {
        return agentRepository.getAgentUsername(user_name, password);
    }

    public List<Agent> list() {
        return agentRepository.getAllAgent();
    }
}
