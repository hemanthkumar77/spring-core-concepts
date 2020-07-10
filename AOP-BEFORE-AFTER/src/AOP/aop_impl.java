package AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class aop_impl {
@Before(value = "Pointcut.control.servicelayer()")
private void beforeadvice(JoinPoint jp)
{
	System.out.println("Db connectivity is opened");
	System.out.println("before advice"+jp.getSignature().getName()+" "+jp.getTarget().getClass().getSimpleName());
}
@After(value = "Pointcut.control.servicelayer()")
private void afteradvice(JoinPoint jp)
{
	System.out.println("after advice"+jp.getSignature().getName()+" "+jp.getTarget().getClass().getSimpleName());
	System.out.println("DB connectivity is closed");
}
}
