package com.itcoretest.helpers;


import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import com.itcoretest.model.School;


//wrapper class for xml helping

@XmlRootElement(name="schools")
public class SchoolsWrapper {
	
	private List<School> school;
	
	public SchoolsWrapper() {
		
	}
		
	public void setSchools(List<School> schools){
			this.school = schools;
	}
	
	public List<School> getSchool(){
		return school;
}

}
