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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itcoretest.helpers.SchoolsWrapper;
import com.itcoretest.model.School;
import com.itcoretest.services.SchoolService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
 
/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/schools")
public class SchoolController {
	
	 private static final Logger logger = LoggerFactory
			   .getLogger(SchoolController.class);
 
    @Autowired
    SchoolService schoolService;
    
    @ResponseBody
    //@RequestMapping(method = RequestMethod.GET, produces="application/json")
    @RequestMapping(method = RequestMethod.GET)
    public Schools get(@RequestParam(value = "schoolName", required = false) String schoolName) {
    	
    	logger.debug("SchoolController: GET ALL method ");  
    	
    	List<School> schoolList;
    	
    	if (schoolName != null) {
    		//tweak for LIKE clause
    		schoolName = "%"+schoolName.toUpperCase()+"%";
    		schoolList  = schoolService.findByName(schoolName);
    	}
    	else {
    		schoolList  = schoolService.getAll();
    	}
    	
    	//add a wrapper
    	Schools schools = new Schools();
    	schools.setSchools(schoolList);

        return schools;
    	//return schoolList;
    
    }
    
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, value = "/{schoolId}")
    public School get(Model model,  @PathVariable("schoolId") Integer schoolId) {
    	
    	logger.debug("SchoolController: schoolId:"+schoolId);  
    	
    	logger.debug("school id requested is: "+schoolId);
 	
    	List<School> schools ;
    	
 
		School oneSchool = schoolService.getById(schoolId);

		return oneSchool;
    }


    
    
    @RequestMapping(value = "/schools/**", method = RequestMethod.POST)
    public String report(Model model) {

        return "POST is currently unsupported in controller";
    }
    
    public void setSchoolService(SchoolService schoolService)
    {
    	this.schoolService = schoolService;
    }
    
    public SchoolService getSchoolService()
    {
    	return this.schoolService;
    }   
    

    //wrapper class for xml helping
    @XmlRootElement
	public static class Schools{
		public List<School> school = new ArrayList<School>();
		
		public void setSchools(List<School> schools){
			this.school = schools;
		}
	}
	
    
}