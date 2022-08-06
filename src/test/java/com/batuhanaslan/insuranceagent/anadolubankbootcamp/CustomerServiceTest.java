package com.batuhanaslan.insuranceagent.anadolubankbootcamp;

import com.batuhanaslan.insuranceagent.anadolubankbootcamp.model.Agent;
import com.batuhanaslan.insuranceagent.anadolubankbootcamp.model.Customer;
import com.batuhanaslan.insuranceagent.anadolubankbootcamp.service.AgentService;
import com.batuhanaslan.insuranceagent.anadolubankbootcamp.service.CustomerService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class CustomerServiceTest {

    private CustomerService customerService;

    @Before
    public void setup() {
        AbstractApplicationContext ctx = null;

        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        this.customerService = ctx.getBean(CustomerService.class);
    }

    @Test
    public void testCustomerList() {

        List<Customer> customerList = customerService.list();

        int actualSizeResult = customerList.size();
        int expectedSizeResult = 100;
        Assert.assertEquals(actualSizeResult, expectedSizeResult);
    }
}
