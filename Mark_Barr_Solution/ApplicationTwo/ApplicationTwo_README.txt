
Application Two is a simply Java HTTP client that connects to the remote service,
gathers school information, and presents a summary of school and student counts
based on county.

to run the appliaction two solution from the command line (you will need java installed):

java -cp applicationTwo.jar com.itcoretest.applicationtwo.XMLConsumer

Source code can be found under the src/ directory.

*last minute tweak:
if your version of java is older, you may have trouble with the jar. If that is
the case, simply cd into the /src dir and use this command to launch it:

java -cp . com/itcoretest/applicationtwo/XMLConsumer