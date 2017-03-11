package es.coritel.codington.festival.interfaces.services;

import es.coritel.codington.festival.domain.Visitor;
import es.coritel.codington.festival.exceptions.FERSGenericException;
public interface IVisitorService {

	public void createVisitor(Visitor visitor);
	public Visitor searchVisitorByUserName(String userName);
}
