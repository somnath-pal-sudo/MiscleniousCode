package LogAnalysis.LogAnalysis;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class MyApp {
	
		// Define a static logger variable so that it references the
	    // Logger instance named "MyApp".
	    private static final Logger logger = (Logger) LogManager.getLogger(MyApp.class.getName());
	 
	    public static void main(final String... args) {
	 
	        // Set up a simple configuration that logs on the console.
	 
	        logger.trace("Entering application.");
	        Bar bar = new Bar();
	        if (!bar.doIt()) {
	            logger.error("Didn't do it.");
	        }
	        logger.trace("Exiting application.");
	    }
	}


