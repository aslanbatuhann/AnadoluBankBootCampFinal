package com.batuhanaslan.insuranceagent.anadolubankbootcamp.repository;

import com.batuhanaslan.insuranceagent.anadolubankbootcamp.model.Policy;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PolicyRepository {
    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public ArrayList<Policy> getPolicyDate() throws Exception {

        Session session = this.sessionFactory.openSession();
        Criteria criteria = session.createCriteria(Policy.class);
        ArrayList<Policy> policyArrayList = (ArrayList<Policy>) criteria.addOrder(org.hibernate.criterion.Order.asc("date_policy")).list();

        return policyArrayList;
    }

    public Double getPolicySum() {
        Session session = this.sessionFactory.openSession();
        Criteria criteria = session.createCriteria(Policy.class);
        criteria.setProjection(Projections.avg("unit_cost"));
        criteria.uniqueResult();

        return (Double) criteria.uniqueResult();
    }

    public List<Policy> getAllPolicy() {
        try {
            Session session = this.sessionFactory.openSession();
            CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
            CriteriaQuery<Policy> criteriaQuery = criteriaBuilder.createQuery(Policy.class);
            Root<Policy> root = criteriaQuery.from(Policy.class);

            CriteriaQuery<Policy> criteriaQuery2 = criteriaQuery.select(root);
            Query<Policy> query = session.createQuery(criteriaQuery2);
            List<Policy> policyList = query.getResultList();
            return policyList;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return new ArrayList<Policy>();
        }
    }
}
