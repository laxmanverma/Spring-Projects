package com.laxman;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("In after initialization method. Bean name is " + beanName);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) 
			throws BeansException {
		System.out.println("In before initialization method. Bean name is " + beanName);
		return bean; //spring excepts to return the object back so that it can continue 
		//its configuration using the object we are returning.
	}

}
