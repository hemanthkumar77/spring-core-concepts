package AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class aop_impl {
@Around(value = "Pointcut.control.servicelayer()")
public Object aroundadvice(ProceedingJoinPoint jp) throws Throwable
{
	System.out.println("before advice"+jp.getSignature().getName()+" "+jp.getTarget().getClass().getSimpleName());
	Object obj=null;
	try
	{
		obj=jp.proceed();
	}
	catch(Exception ex)
	{
		System.out.print(ex.getMessage());
	}
	System.out.println("after advice"+jp.getSignature().getName()+" "+jp.getTarget().getClass().getSimpleName());
	return obj;
	
}
}
