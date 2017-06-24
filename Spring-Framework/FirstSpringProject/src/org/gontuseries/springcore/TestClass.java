package org.gontuseries.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
	public static void main(String[] args){
		  
		  ClassPathXmlApplicationContext context = 
				  new ClassPathXmlApplicationContext("SpringConfig.xml"); //this statement loads the SpringConfig.xml file 
		  																 //from our project to application context
		  //Application context is a interface which simply reads the configuration of our project from xml file and then by 
		  //calling different methods of it we access different functionalities provided by the spring framework like 
		  //dependency injection,AOP,etc. In simpler words this is the basic interface provided to access spring framework.
		  
		  Restaurant restaurantObj = (Restaurant) context.getBean("restaurantBean"); //Here we are calling getBean method of 
		  //application context interface just to request spring framework to create and return an object with a bean name 
		  //restaurantBean here spring framework will search for this bean in the configuration(.xml) file and will implicitly 
		  //create and return an object for the class mentioned with a bean name restaurantBean.
		  
		  restaurantObj.greetCustomer(); 
		  context.close();
		 } 
}
