package es.coritel.codington.festival.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.coritel.codington.festival.domain.Event;
import es.coritel.codington.festival.interfaces.daos.IEventDAO;
import es.coritel.codington.festival.interfaces.services.IEventService;



@Service
public class EventServiceImpl implements IEventService {
	@Autowired
	private IEventDAO eventDAO;

	@Override
	@Transactional(readOnly=true)
	public List<Event> getAllEvents(){
		// TODO: completar código
		return eventDAO.showAllEvents();
	}

}
