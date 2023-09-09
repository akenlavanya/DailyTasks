package in.co.hsbc.foodapp.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggerAspect {
	
	//@Before - advice
	// execution (* findAllFoodItems()) - point cut expression

	@Before("execution(* findAllFoodItems())")
	public void log() {
		System.out.println("Executed business Method");
	}
}
