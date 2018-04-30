package com.laxman;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
		Shape shape1 = (Shape) context.getBean("triangle");
		shape1.draw();
	}

}
