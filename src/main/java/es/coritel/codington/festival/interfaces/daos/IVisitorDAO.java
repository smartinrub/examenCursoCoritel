package es.coritel.codington.festival.interfaces.daos;

import es.coritel.codington.festival.domain.Visitor;
import es.coritel.codington.festival.exceptions.FERSGenericException;;

public interface IVisitorDAO {

	public void insertData(Visitor visitor);
	public Visitor searchUserByUserName(String userName);

}
