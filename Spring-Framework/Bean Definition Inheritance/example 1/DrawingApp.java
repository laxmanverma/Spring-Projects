package com.laxman;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		Triangle triangle1 = (Triangle) context.getBean("triangle1");
		triangle.draw();
		triangle1.draw();
	}

}
