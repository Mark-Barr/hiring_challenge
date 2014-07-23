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

import com.itcoretest.model.Workplace;
import com.itcoretest.services.WorkplaceService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
 
/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/workplaces")
public class WorkplaceController {
	
	 private static final Logger logger = LoggerFactory
			   .getLogger(WorkplaceController.class);
 
    @Autowired
    WorkplaceService workplaceService;
    
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public Workplaces get(Model model) {
    	
    	logger.debug("WorkplaceController: welcome, "+model.toString());    
 	
    	List<Workplace> workplaceList  = workplaceService.getAll();
    	Workplaces workplaces = new Workplaces();
    	workplaces.setWorkplaces(workplaceList);

        return workplaces;
    }
    
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, value = "/{workplaceId}")
    public Workplace get(Model model,  @PathVariable("workplaceId") Integer workplaceId) {
    	
    	logger.debug("WorkplaceController: welcome, "+model.toString());  
    	
    	logger.debug("workplace id requested is: "+workplaceId);
 	
    	List<Workplace> workplaces ;
    	
 
		Workplace oneWorkplace = workplaceService.getById(workplaceId);

		return oneWorkplace;
    }


    
    
    @RequestMapping(value = "/workplaces/**", method = RequestMethod.POST)
    public String report(Model model) {

        return "POST is currently unsupported in controller";
    }
    
    public void setWorkplaceService(WorkplaceService workplaceService)
    {
    	this.workplaceService = workplaceService;
    }
    
    public WorkplaceService getWorkplaceService()
    {
    	return this.workplaceService;
    }   
    

    //wrapper class for xml helping
    @XmlRootElement
	static class Workplaces{
		public List<Workplace> workplaces = new ArrayList<Workplace>();
		
		public void setWorkplaces(List<Workplace> workplaces){
			this.workplaces = workplaces;
		}
	}
	
    
}