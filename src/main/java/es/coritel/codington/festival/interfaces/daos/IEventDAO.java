package es.coritel.codington.festival.interfaces.daos;

import java.util.List;

import es.coritel.codington.festival.domain.Event;
import es.coritel.codington.festival.exceptions.FERSGenericException;

public interface IEventDAO {
	public List<Event> showAllEvents();
}
