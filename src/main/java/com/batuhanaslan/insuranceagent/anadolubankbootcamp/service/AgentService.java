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

    public boolean getAgentLogin(String user_name,String password) throws Exception {
        return agentRepository.getAgentLogin(user_name,password);
    }
    public Agent get(int id) throws Exception {
        return agentRepository.getAgent(id);
    }

    public List<Agent> list() {
        return agentRepository.getAllAgent();
    }
}
