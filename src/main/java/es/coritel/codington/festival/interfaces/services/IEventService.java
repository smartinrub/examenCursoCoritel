package es.coritel.codington.festival.interfaces.services;

import java.util.List;

import es.coritel.codington.festival.domain.Event;
import es.coritel.codington.festival.exceptions.FERSGenericException;

public interface IEventService {

	public List<Event> getAllEvents();

}
