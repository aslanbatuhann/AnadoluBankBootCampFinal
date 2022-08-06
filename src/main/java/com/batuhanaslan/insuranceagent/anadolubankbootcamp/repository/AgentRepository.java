package com.batuhanaslan.insuranceagent.anadolubankbootcamp.repository;

import com.batuhanaslan.insuranceagent.anadolubankbootcamp.model.Agent;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AgentRepository {
    private SessionFactory sessionFactory;


    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List getAgentUsername(String user_name, String password) {
        Session session = this.sessionFactory.openSession();
        boolean foundAgent = true;
        Criteria criteria = session.createCriteria(Agent.class, "agent");
        Criterion user_name1 = Restrictions.eq("user_name", user_name);
        Criterion password1 = Restrictions.eq("password", password);

        LogicalExpression orExp = Restrictions.and(user_name1, password1);
        criteria.add(orExp);

        return criteria.list();
    }

    public List<Agent> getAllAgent() {
        try {
            Session session = this.sessionFactory.openSession();
            CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
            CriteriaQuery<Agent> criteriaQuery = criteriaBuilder.createQuery(Agent.class);
            Root<Agent> root = criteriaQuery.from(Agent.class);

            CriteriaQuery<Agent> criteriaQuery2 = criteriaQuery.select(root);
            Query<Agent> query = session.createQuery(criteriaQuery2);
            List<Agent> agentList = query.getResultList();
            return agentList;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return new ArrayList<Agent>();
        }
    }
}
