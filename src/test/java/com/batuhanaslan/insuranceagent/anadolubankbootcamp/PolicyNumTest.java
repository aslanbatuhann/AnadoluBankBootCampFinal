package com.batuhanaslan.insuranceagent.anadolubankbootcamp;

import com.batuhanaslan.insuranceagent.anadolubankbootcamp.model.Policy;
import com.batuhanaslan.insuranceagent.anadolubankbootcamp.service.PolicyService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class PolicyNumTest {

    private PolicyService policyService;

    @Before
    public void setup() {
        AbstractApplicationContext ctx = null;

        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        this.policyService = ctx.getBean(PolicyService.class);
    }

    @Test
    public void testPolicyNum() {

        List<Policy> policyList = policyService.list();

        int actualSizeResult = policyList.size();
        int expectedSizeResult = 100;
        Assert.assertEquals(actualSizeResult, expectedSizeResult);

        int actualPolicyNameResult = policyList.get(1).getPolicy_num();
        int expectedPolicyNameResult = 349;
        Assert.assertEquals(actualPolicyNameResult, expectedPolicyNameResult);
    }
}
