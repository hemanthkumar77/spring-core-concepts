package bean1;

import org.springframework.beans.BeansException;

import org.springframework.beans.factory.config.BeanPostProcessor;

import org.springframework.core.Ordered;

public class method1 implements BeanPostProcessor,Ordered {

	@Override
	public Object postProcessAfterInitialization(Object bean, String value) throws BeansException {
		System.out.println("method-1 afterinitialization: "+value);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String value) throws BeansException {
		System.out.println("method-1 Beforeinitialization: "+value);
		return bean ;
	}

	@Override
	public int getOrder() {
	 return 1;
	}



}
