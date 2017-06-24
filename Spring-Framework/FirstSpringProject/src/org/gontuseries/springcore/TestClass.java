package org.gontuseries.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
	public static void main(String[] args){
		  
		  ClassPathXmlApplicationContext context = 
				  new ClassPathXmlApplicationContext("SpringConfig.xml");
		  Restaurant restaurantObj = (Restaurant) context.getBean("restaurantBean");
		  restaurantObj.greetCustomer(); 
		  context.close();
		 } 
}
