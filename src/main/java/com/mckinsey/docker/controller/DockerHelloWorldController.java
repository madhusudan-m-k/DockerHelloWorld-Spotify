/**
 * 
 */
package com.mckinsey.docker.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author Madhu Krishnamurthy
 *
 */

@RestController
@CrossOrigin(maxAge = 3600)
@RequestMapping("docker")
public class DockerHelloWorldController {

	private static final Logger LOGGER = LoggerFactory.getLogger(DockerHelloWorldController.class);

	@RequestMapping(value = "/", produces = "application/JSON")
	public @ResponseBody String hello() {
		LOGGER.debug("Debug from Credit Model Controller Hello World");
		return "Hello from Credit Model";
	}

	
	@RequestMapping(value = "/hello-world", produces = "application/JSON")
	public @ResponseBody String helloWorld() {
		LOGGER.debug("Debug from Credit Model Controller Hello World");
		return "Hello from Credit Model";
	}
	
	
	@RequestMapping(value = "/hello-world-bean", produces = "application/JSON")
	public @ResponseBody HelloWorldBean helloWoldBean() {
		LOGGER.debug("Debug from Credit Model Controller Hello World");
		return new HelloWorldBean("Hello Docker from " + "Docker boy");
	}

	@RequestMapping(value = "/hello-world-bean/{name}", produces = "application/JSON")
	public @ResponseBody HelloWorldBean helloWoldBean(@PathVariable String name) {
		LOGGER.debug("Debug from Credit Model Controller Hello World");
		return new HelloWorldBean("Hello Docker from " + name);
	}
	
	class HelloWorldBean {
		
		String name;
		Date date;
		
		public HelloWorldBean(String name) {
			this.name = name;
			date = new Date();
		}
		
		public String getName() {
			return this.name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public Date getDate() {
			return this.date;
		}
		
		public void setDate(Date date) {
			this.date = date;
		}
	}
	
}
