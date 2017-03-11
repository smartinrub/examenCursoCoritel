package es.coritel.codington.web.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import es.coritel.codington.festival.domain.Visitor;
import es.coritel.codington.festival.exceptions.FERSGenericException;
import es.coritel.codington.festival.interfaces.services.IVisitorService;


@Controller
public class SearchVisitorController {

	@Autowired
	private IVisitorService visitorService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String principal(@ModelAttribute("visitor") Visitor visitor) {
		return "index";
	}
	
	@RequestMapping(value="/", method = RequestMethod.POST)
	public ModelAndView process(
			@ModelAttribute("visitor") Visitor visitor,
			HttpServletRequest request) {
		// TODO: completar código
		ModelAndView modelAndView = new ModelAndView();
                Visitor visitorFound = visitorService.searchVisitorByUserName(visitor.getUserName());
                if (visitorFound != null) {
                    if (visitorFound.getPassword().equals(visitor.getPassword())){
                        modelAndView.addObject("vistor", visitorFound);
                        request.getSession().setAttribute("visitor", visitorFound);
                        modelAndView.setViewName("redirect:/visitormain");
                        return modelAndView;
                    }
                }
                visitor.setPassword("");
		modelAndView.setViewName("index");
		return modelAndView;
	}

}
