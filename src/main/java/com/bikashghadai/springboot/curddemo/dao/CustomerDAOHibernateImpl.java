package com.bikashghadai.springboot.curddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bikashghadai.springboot.curddemo.entity.Customer;
@Repository
public class CustomerDAOHibernateImpl implements CustomerDAO {
	private EntityManager entityManager;
	@Autowired
	public CustomerDAOHibernateImpl(EntityManager theEntityManager) {
		
	}
@Override
	
	public List<Customer> findAll(){
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Customer> theQuery = currentSession.createQuery("from customer",Customer.class);
		List<Customer> customers = theQuery.getResultList();
		return customers;
	}

	@Override
	public Customer findById(int theId) {
		Session currentSession = entityManager.unwrap(Session.class);
		Customer theCustomer = currentSession.get(Customer.class, theId);
		return theCustomer;
	}

	@Override
	public void save(Customer thecustomer) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(thecustomer);
		
	}

	@Override
	public void deleteBYId(int theId) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query theQuery =currentSession.createQuery("delete from the Customer where id=:thecustomer");
		theQuery.setParameter("customerId", theId);
		theQuery.executeUpdate();
		
	}

}
