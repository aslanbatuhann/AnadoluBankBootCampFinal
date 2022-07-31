package com.batuhanaslan.insuranceagent.anadolubankbootcamp.repository;

import com.batuhanaslan.insuranceagent.anadolubankbootcamp.helper.Helper;
import com.batuhanaslan.insuranceagent.anadolubankbootcamp.helper.TimeHelper;
import com.batuhanaslan.insuranceagent.anadolubankbootcamp.model.Policy;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TemporalType;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class PolicyRepository {
    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Policy getPolicy(int policy_id) throws Exception {
        Session session = this.sessionFactory.openSession();
        Policy foundPolicy = session.get(Policy.class, policy_id);
        if (foundPolicy != null) {
            return foundPolicy;
        }
        throw new Exception("Product does not exist!");
    }

    public ArrayList<Policy> getPolicyDate(String date_policy) throws Exception {

        long dateTime = TimeHelper.convertToMillisTime(date_policy);
        Session session = this.sessionFactory.openSession();

        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Policy> query = criteriaBuilder.createQuery(Policy.class);

        Root<Policy> root = query.from(Policy.class);

        query.select(root).where(
                criteriaBuilder.equal(root.get("date_policy"), dateTime)
        );
        return (ArrayList<Policy>) session.createQuery(query).list();
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
