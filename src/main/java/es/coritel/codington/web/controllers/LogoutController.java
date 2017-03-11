package es.coritel.codington.web.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import es.coritel.codington.festival.domain.Visitor;
import es.coritel.codington.festival.interfaces.services.IEventService;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;

@Controller
public class LogoutController {

    @Autowired
    private IEventService eventService;

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public ModelAndView process(HttpServletRequest request, HttpServletResponse response) {
        // TODO: completar código
        HttpSession session = request.getSession();
        if (session != null) {
            session.invalidate();
        }
        try {
            response.sendRedirect(request.getContextPath() + "/");
        } catch (IOException ex) {
            Logger.getLogger(LogoutController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @RequestMapping(value = "/visitormain", method = RequestMethod.GET)
    public ModelAndView principal(HttpServletRequest request) {
        // TODO: completar código
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("events", eventService.getAllEvents());
        Visitor visitor = (Visitor) request.getAttribute("visitor");
        modelAndView.addObject("visitor", visitor);
        modelAndView.setViewName("visitormain");
        return modelAndView;
    }

}
