package bean2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class method2 implements BeanPostProcessor,Ordered {

	@Override
	public Object postProcessAfterInitialization(Object bean, String value) throws BeansException {
		System.out.println("method2-afterIntialization: "+value);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String value) throws BeansException {
		System.out.println("method2-beforeIntialization: "+value);
		return bean;
	}

	@Override
	public int getOrder() {
		return 0;
	}

}
