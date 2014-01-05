package MyProjects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	public void TestLog() {

		logger.info("Hello, World!!");
		logger.info("I'm a info message");
		logger.debug("I'm a debug message");
		logger.error("I'm a error message");
		logger.warn("I'm a warn message");

	}

}
