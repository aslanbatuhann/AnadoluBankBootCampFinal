package com.batuhanaslan.insuranceagent.anadolubankbootcamp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "policy")
public class Policy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "policy_id")
    private Integer policy_id;

    @Column(name = "policy_num")
    private Integer policy_num;

    @Column(name = "date_policy")
    private String date_policy;

    @Column(name = "unit_cost")
    private Integer unit_cost;

    @Column(name = "car_model")
    private String car_model;
}
