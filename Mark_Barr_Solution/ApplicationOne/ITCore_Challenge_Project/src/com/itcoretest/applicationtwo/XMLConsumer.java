package com.itcoretest.applicationtwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.itcoretest.model.School;

public class XMLConsumer {
	
	private String target;
	
	
	public XMLConsumer(){
		init();
	}
	
	private void init(){
		
		System.out.println("+++++++++++++++++++++++++++");
		System.out.println(" Command Line HTTP Client:");
		System.out.println("+++++++++++++++++++++++++++");
		
	}

	private void setTarget(String target) {
		this.target = target;
		
	}
	
	public void process(){
		
		System.out.println("\ncalling remote server at: "+this.target);
		
		String result = null;
		
		try {
			result = handleHttpUrlConnection(target);
		} catch (Exception e) {
			System.out.println(">>FAILED to connect to remote server!");
			System.exit(0);
		}
		
		List<School> schools = parseXML(result);
		
		evaluateSchoolData(schools);
		
	}
	
	/**
	 * Evaluate the school data
	 * @param schools a list of schools
	 */
	 private void evaluateSchoolData(List<School> schools) {
		 
		 System.out.println("\nanalyzing...");
		 
		 HashMap<String,Integer> countySchools = new  HashMap<String,Integer>();
		 HashMap<String,Integer> countyTotals = new  HashMap<String,Integer>();
		
		 for (School nextSchool: schools){
			 String county = nextSchool.getCounty();
			 //have we encountered this county yet?
			 
			//handle schools per county
			 if (countySchools.containsKey(county)){
				 
				Integer oldTotalSchools = countySchools.get(county) ;
				countySchools.put(county, oldTotalSchools+1);
			 }
			 else{
				 countySchools.put(county, 1);
			 }
			 
			 //handle total students per county
			 if (countyTotals.containsKey(county)){
				 //handle schools per county
				Integer oldTotalSchools = countyTotals.get(county) ;
				countyTotals.put(county, oldTotalSchools+nextSchool.getTotal() );
			 }
			 else{
				 countyTotals.put(county, nextSchool.getTotal());
			 }
		 }
		 
		 spitOutResults(countySchools, countyTotals);
		
	}

	private void spitOutResults(HashMap<String, Integer> countySchools,
			HashMap<String, Integer> countyTotals) {
		
		//sort the county names
		Object[] countyNames = countySchools.keySet().toArray();
		Arrays.sort(countyNames);
		
		System.out.println("=============================================================");
		System.out.printf("%-20s %-20s %-20s\n", "COUNTY","TOTAL SCHOOLS","TOTAL STUDENTS");
		System.out.println("=============================================================");
		//for (String county: countyTotals.keySet()){
		for (Object county: countyNames){
			
			System.out.printf("%-20s %-20s %-20s\n", county, countySchools.get(county),countyTotals.get(county));
			
		}
		
	}

	private List<School> parseXML(String result) {
		 
		 String newSchoolName=null;
		 String newCounty=null;
		 String newTotal=null;
		 
		 List<School> schoolList = new ArrayList<School>();
		 
		 try{
			 //set up
			 DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			 DocumentBuilder db = dbf.newDocumentBuilder(); 
			 //parse it
			 InputSource is = new InputSource();
			 is.setCharacterStream(new StringReader(result));
			 Document doc = db.parse(is);
			 
			 //find the pieces we need		 
				NodeList nList = doc.getElementsByTagName("school");
			 
				System.out.println("----------------------------");
			 
				for (int temp = 0; temp < nList.getLength(); temp++) {
			 
					Node nNode = nList.item(temp);
			 
					School newSchool = null;
					if (nNode.getNodeType() == Node.ELEMENT_NODE) {
			 
						Element eElement = (Element) nNode;
						newSchool = new School();
						
						newSchoolName = eElement.getElementsByTagName("schoolName").item(0).getTextContent();
						newCounty = eElement.getElementsByTagName("county").item(0).getTextContent();
						newTotal = eElement.getElementsByTagName("total").item(0).getTextContent();
						
						newSchool.setSchoolName(newSchoolName);
						newSchool.setCounty(newCounty);
						newSchool.setTotal(new Integer(newTotal));
						
					}
						//System.out.println("SchoolName : " + newSchoolName);
						//System.out.println("County : " + newCounty);
						//System.out.println("Total Students: " + newTotal);
						schoolList.add(newSchool);
				}
		 }
		 catch(Exception e){
			 
			 e.printStackTrace();
			 
		 }
		 //return the new list of school data
		return schoolList;
		
	}

	private String handleHttpUrlConnection(String targetUrl)
			  throws Exception
			  {
			    URL url = null;
			    BufferedReader reader = null;
			    StringBuilder stringBuilder;
			 
			    try
			    {
			      // create the HttpURLConnection
			      url = new URL(targetUrl);
			      HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			       
			      // just want to do an HTTP GET here
			      connection.setRequestMethod("GET");
			       
			       
			      // give it 15 seconds to respond
			      connection.setReadTimeout(15*1000);
			      connection.connect();
			 
			      // read the output from the server
			      reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			      stringBuilder = new StringBuilder();
			 
			      String line = null;
			      while ((line = reader.readLine()) != null)
			      {
			        stringBuilder.append(line + "\n");
			      }
			      return stringBuilder.toString();
			    }
			    catch (Exception e)
			    {
			      e.printStackTrace();
			      throw e;
			    }
			    finally
			    {
			      // close the reader; this can throw an exception too, so
			      // wrap it in another try/catch block.
			      if (reader != null)
			      {
			        try
			        {
			          reader.close();
			        }
			        catch (IOException ioe)
			        {
			          ioe.printStackTrace();
			        }
			      }
			    }
			  }
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		XMLConsumer consumer = new XMLConsumer();
		
		consumer.setTarget("http://localhost:8080/ITCore_Challenge_Project/schools");
		
		consumer.process();

	}

}
