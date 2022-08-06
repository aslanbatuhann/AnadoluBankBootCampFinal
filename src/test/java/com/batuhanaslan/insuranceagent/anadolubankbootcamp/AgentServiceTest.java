package com.batuhanaslan.insuranceagent.anadolubankbootcamp;

import com.batuhanaslan.insuranceagent.anadolubankbootcamp.model.Agent;
import com.batuhanaslan.insuranceagent.anadolubankbootcamp.model.Policy;
import com.batuhanaslan.insuranceagent.anadolubankbootcamp.service.AgentService;
import com.batuhanaslan.insuranceagent.anadolubankbootcamp.service.PolicyService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class AgentServiceTest {

    private AgentService agentService;

    @Before
    public void setup() {
        AbstractApplicationContext ctx = null;

        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        this.agentService = ctx.getBean(AgentService.class);
    }

    @Test
    public void testAgentList() {

        List<Agent> agentList = agentService.list();

        int actualSizeResult = agentList.size();
        int expectedSizeResult = 1;
        Assert.assertEquals(actualSizeResult, expectedSizeResult);
    }


}
