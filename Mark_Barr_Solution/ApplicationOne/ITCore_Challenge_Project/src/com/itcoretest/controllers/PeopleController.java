package com.itcoretest.controllers;


import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itcoretest.model.People;
import com.itcoretest.services.PeopleService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
 
/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/people")
public class PeopleController {
	
	 private static final Logger logger = LoggerFactory
			   .getLogger(PeopleController.class);
 
    @Autowired
    PeopleService peopleService;
    
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public Peoples get(Model model) {
    	
    	logger.debug("PeopleController: welcome, "+model.toString());    
 	
    	List<People> peopleList  = peopleService.getAll();
    	Peoples people = new Peoples();
    	people.setPeoples(peopleList);

        return people;
    }
    
    @ResponseBody
    @RequestMapping(value = "/{peopleId}", method = RequestMethod.GET)
    public People get(Model model,  @PathVariable("peopleId") Integer peopleId) {
    	
    	logger.debug("PeopleController: welcome, "+model.toString());  
    	
    	logger.debug("people id requested is: "+peopleId);
 	
    	List<People> people ;
    	
 
		People onePeople = peopleService.getById(peopleId);

		return onePeople;
    }

    
    @ResponseBody
    @RequestMapping(value = "/people/**", method = RequestMethod.POST)
    public String report(Model model) {

        return "POST is currently unsupported in controller";
    }
    
    public void setPeopleService(PeopleService peopleService)
    {
    	this.peopleService = peopleService;
    }
    
    public PeopleService getPeopleService()
    {
    	return this.peopleService;
    }   
    

    //wrapper class for xml helping
    @XmlRootElement
	static class Peoples{
		public List<People> people = new ArrayList<People>();
		
		public void setPeoples(List<People> people){
			this.people = people;
		}
	}
	
    
}