package Pointcut;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class control {
@Pointcut("within(support..*)")
public void servicelayer()
{
	//operations
}
}
