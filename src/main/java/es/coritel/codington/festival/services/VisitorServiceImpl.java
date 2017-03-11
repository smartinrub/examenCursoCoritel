package es.coritel.codington.festival.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.coritel.codington.festival.domain.Visitor;
import es.coritel.codington.festival.exceptions.FERSGenericException;
import es.coritel.codington.festival.interfaces.daos.IVisitorDAO;
import es.coritel.codington.festival.interfaces.services.IVisitorService;

@Service
public class VisitorServiceImpl implements IVisitorService {

	@Autowired
	private IVisitorDAO visitorDAO;

	@Override
	@Transactional
	public void createVisitor(Visitor visitor){
		// TODO: completar código
		visitorDAO.insertData(visitor);
	}

	@Override
	@Transactional(readOnly=true)
	public Visitor searchVisitorByUserName(String userName){
		// TODO: completar código
		return visitorDAO.searchUserByUserName(userName);
	}
}
