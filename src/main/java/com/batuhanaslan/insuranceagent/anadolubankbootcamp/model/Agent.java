package com.batuhanaslan.insuranceagent.anadolubankbootcamp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "agent")
public class Agent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "agent_id")
    private int agent_id;

    @OneToMany(targetEntity = Customer.class)
    @JoinColumn(name = "customer_id")
    private List<Customer> customer;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "user_name")
    private String user_name;

    @Column(name = "password")
    private String password;
}
