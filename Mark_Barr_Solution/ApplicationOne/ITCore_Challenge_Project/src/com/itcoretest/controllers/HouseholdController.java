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

import com.itcoretest.model.Household;
import com.itcoretest.services.HouseholdService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
 
/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/households")
public class HouseholdController {
	
	 private static final Logger logger = LoggerFactory
			   .getLogger(HouseholdController.class);
 
    @Autowired
    HouseholdService householdService;
    
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public Households get(Model model) {
    	
    	logger.debug("HouseholdController: welcome, "+model.toString());    
 	
    	List<Household> householdList  = householdService.getAll();
    	Households household = new Households();
    	household.setHouseholds(householdList);

        return household;
    }
    
    @ResponseBody
    @RequestMapping(value = "/{householdId}", method = RequestMethod.GET)
    public Household get(Model model,  @PathVariable("householdId") Integer householdId) {
    	
    	logger.debug("HouseholdController: welcome, "+model.toString());  
    	
    	logger.debug("household id requested is: "+householdId);
 	
    	List<Household> household ;
    	
 
		Household oneHousehold = householdService.getById(householdId);

		return oneHousehold;
    }

    
    @ResponseBody
    @RequestMapping(value = "/household/**", method = RequestMethod.POST)
    public String report(Model model) {

        return "POST is currently unsupported in controller";
    }
    
    public void setHouseholdService(HouseholdService householdService)
    {
    	this.householdService = householdService;
    }
    
    public HouseholdService getHouseholdService()
    {
    	return this.householdService;
    }   
    

    //wrapper class for xml helping
    @XmlRootElement
	static class Households{
		public List<Household> household = new ArrayList<Household>();
		
		public void setHouseholds(List<Household> household){
			this.household = household;
		}
	}
	
    
}