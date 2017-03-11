package es.coritel.codington.festival.daos;


import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import es.coritel.codington.festival.domain.Visitor;
import es.coritel.codington.festival.exceptions.FERSGenericException;
import es.coritel.codington.festival.interfaces.daos.IVisitorDAO;

@Repository
public class VisitorDAO implements IVisitorDAO {

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void insertData(Visitor visitor) throws FERSGenericException {
		try {
			// TODO: completar código
			entityManager.persist(visitor);
		} catch (Exception e) {
			throw new FERSGenericException("Fails creating visitor",e);
		}
	}

	@Override
	public Visitor searchUserByUserName(String userName){
		try {
			// TODO: completar código
			Query query = entityManager.createQuery("SELECT v FROM Visitor v WHERE v.userName =:uName");
                        query.setParameter("uName", userName);
			return (Visitor) query.getSingleResult();
		}
		catch (NoResultException| NonUniqueResultException e){
			return null;
		}
		catch (Exception e) {
			throw new FERSGenericException("Fails searching visitor",e);
		}
	}
}
