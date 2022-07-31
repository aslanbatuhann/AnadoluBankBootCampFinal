package com.batuhanaslan.insuranceagent.anadolubankbootcamp.repository;

import com.batuhanaslan.insuranceagent.anadolubankbootcamp.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepository {
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    // select * from Customer where cost_id = ?
    public Customer getCustomer(int cost_id) throws Exception {
        Session session = this.sessionFactory.openSession();
        Customer foundCustomer = session.get(Customer.class, cost_id);
        if (foundCustomer != null) {
            return foundCustomer;
        }
        throw new Exception("Product does not exist!");
    }

    public List<Customer> getAllCustomer() {
        try {
            Session session = this.sessionFactory.openSession();
            CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
            CriteriaQuery<Customer> criteriaQuery = criteriaBuilder.createQuery(Customer.class);
            Root<Customer> root = criteriaQuery.from(Customer.class);

            CriteriaQuery<Customer> criteriaQuery2 = criteriaQuery.select(root);
            Query<Customer> query = session.createQuery(criteriaQuery2);
            List<Customer> customerList = query.getResultList();
            return customerList;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return new ArrayList<Customer>();
        }
    }
}
