package es.coritel.codington.festival.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import es.coritel.codington.festival.domain.Event;
import es.coritel.codington.festival.exceptions.FERSGenericException;
import es.coritel.codington.festival.interfaces.daos.IEventDAO;

@Repository
public class EventDAO implements IEventDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Event> showAllEvents() {
        try {
            TypedQuery<Event> query = entityManager.createNamedQuery("findAll", Event.class);
            return query.getResultList();
        } catch (PersistenceException e) {
            throw new FERSGenericException(e.getMessage(), e);
        }
    }

}
