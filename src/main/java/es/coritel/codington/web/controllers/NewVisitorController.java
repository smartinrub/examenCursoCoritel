package es.coritel.codington.web.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import es.coritel.codington.festival.domain.Visitor;
import es.coritel.codington.festival.exceptions.FERSGenericException;
import es.coritel.codington.festival.interfaces.services.IVisitorService;

/**
 * This controller will register new Visitor into system by accepting his
 * details and load into database
 *
 *@author Accenture Technology Solutions
 */
@Controller
@RequestMapping("/registration")
public class NewVisitorController {
	@Autowired
	private IVisitorService visitorService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView form(@ModelAttribute("visitor") Visitor visitor) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("visitor", visitor);
		mav.setViewName("registration");
		return mav;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView process(@ModelAttribute("visitor") @Valid Visitor visitor,
			BindingResult result) {
		// TODO: completar código
		ModelAndView modelAndView = new ModelAndView();
		if(result.hasErrors()) {
			visitor.setPassword("");
			visitor.setConfirmPassword("");
			modelAndView.setViewName("registration");
			return modelAndView;
		}
		if(visitorService.searchVisitorByUserName(visitor.getUserName()) != null){
			modelAndView.setViewName("registration");
			return modelAndView;
		}
		visitorService.createVisitor(visitor);
		modelAndView.setViewName("redirect:/");
		return modelAndView;
	}
}
