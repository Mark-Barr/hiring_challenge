Application One is a Java/Spring web app. In development, I have been running it on Apache Tomcat v.7 and using the Firefox web browser.

I've included the .war file, which you should be able to deploy on a Tomcat instance and run if the following
describes a valid db and db user account on your local machine:

<bean id="dataSource" class="org.apache.commons.dbcp.BasicDataSource" destroy-method="close">
	<property name="driverClassName" value="com.mysql.jdbc.Driver"/>
	<property name="url" value="jdbc:mysql://localhost:3306/itcore_test"/>
  <property name="username" value="test"/>
  <property name="password" value="test"/>
</bean>

I've also included most of the important folders from my eclipse project folder, should you want to build an eclipse project and run
the solution that way.

So, in terms of setup, you'll need to:

1) create a mysql db. I’ve included the commands I used to import the data files into my db. 
Currently, the app is looking for 'itcore_test' (as is configured in the above datasource bean). 
You can alter these settings by editing the file: 
ITCore_Challenge_Project\WebContent\WEB-INF\spring\appServlet\servlet-context.xml

Configure this settings file and your db to match values and you should be good to go.

Generate a new .war or use the old one (if db settings maatch) and deploy it to Tomcat. I've been using version 7.

The base URL for the project is : http://localhost:8080/ITCore_Challenge_Project/   From this URL you should find links to guide you.

If you have an issues, please don't hesitate to contact me. i'll be happy to send any additional files that you might need, or to come
into the office and give a demo from my laptop, if needed.


REFERENCE NOTES:

Some URLs to help you test:

the root project path:
http://localhost:8080/ITCore_Challenge_Project/

all schools:
http://localhost:8080/ITCore_Challenge_Project/schools

specific school (by spID):
http://localhost:8080/ITCore_Challenge_Project/schools/450119275

additionally, I added a query feature to the schools service, allowing for
fuzzy searching based on schoolName:
http://localhost:8080/ITCore_Challenge_Project/schools?schoolName=montessori

people objects: (this one is a memory/time hog. I’ve capped it at 1000 records for the purposes of this test app.)
http://localhost:8080/ITCore_Challenge_Project/people

specific person (by spID):
http://localhost:8080/ITCore_Challenge_Project/people/124155246

workplaces: (I’ve capped it at 1000 records for the purposes of this test app.)
http://localhost:8080/ITCore_Challenge_Project/workplaces

specific workplace (by spID):
http://localhost:8080/ITCore_Challenge_Project/workplaces/500016645

households: (I’ve capped it at 1000 records for the purposes of this test app.)
http://localhost:8080/ITCore_Challenge_Project/households

specific household (by spID):
http://localhost:8080/ITCore_Challenge_Project/households/91447233