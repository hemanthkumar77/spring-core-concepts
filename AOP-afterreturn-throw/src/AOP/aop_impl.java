package AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import MODEL.employee;

@Aspect
@Component
public class aop_impl {
@AfterReturning(value = "Pointcut.control.servicelayer()",returning="emp")
public void beforeadvice(JoinPoint jp,employee emp)
{
	System.out.println("Db connectivity is opened");
	System.out.println("before advice"+jp.getSignature().getName()+" "+jp.getTarget().getClass().getSimpleName());
   System.out.print(emp);
}
@AfterThrowing(value = "Pointcut.control.servicelayer()",throwing="ex")
private void afteradvice(JoinPoint jp,Exception ex)
{
	System.out.println("after advice"+jp.getSignature().getName()+" "+jp.getTarget().getClass().getSimpleName());
	System.out.println("DB connectivity is closed");
	System.out.print("after throwing: "+ex.getMessage());
}
}
