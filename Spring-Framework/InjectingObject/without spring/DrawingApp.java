package com.laxman;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		// ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		// Triangle triangle = (Triangle) context.getBean("triangle");
		Triangle triangle = new Triangle();
		triangle.setPointA(new Point(0, 0));
		triangle.setPointB(new Point(0, 1));
		triangle.setPointC(new Point(1, 1));
		triangle.draw();
	}

}
