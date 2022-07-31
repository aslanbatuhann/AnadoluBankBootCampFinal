package com.batuhanaslan.insuranceagent.anadolubankbootcamp.repository;

import com.batuhanaslan.insuranceagent.anadolubankbootcamp.model.Agent;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AgentRepository {
    private SessionFactory sessionFactory;
    private HibernateTemplate hibernateTemplate;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Agent getAgent(int agent_id) throws Exception {
        Session session = this.sessionFactory.openSession();
        Agent foundAgent = session.get(Agent.class, agent_id);
        if (foundAgent != null) {
            return foundAgent;
        }
        throw new Exception("Product does not exist!");
    }
    public boolean getAgentLogin(String user_name,String password) throws Exception {
        Session session = this.sessionFactory.openSession();
        boolean userFound = false;

        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();

        CriteriaQuery<Agent> query = criteriaBuilder.createQuery(Agent.class);
        Root<Agent> root = query.from(Agent.class);

        query.select(root).where(criteriaBuilder.equal(root.get("user_name"),user_name));
        query.select(root).where(criteriaBuilder.equal(root.get("password"),password));

        try {
            if((query.select(root).where(criteriaBuilder.equal(root.get("user_name"),user_name)) != null)  && (query.select(root).where(criteriaBuilder.equal(root.get("password"),password))!= null)) {
                userFound = true;
            }
        } catch(Exception e) {
            userFound = false;
        }
        return userFound;
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
