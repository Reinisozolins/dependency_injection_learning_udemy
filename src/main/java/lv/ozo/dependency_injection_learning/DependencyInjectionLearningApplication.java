    package lv.ozo.dependency_injection_learning;

import lv.ozo.dependency_injection_learning.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionLearningApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionLearningApplication.class, args);

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());
		MyController myController =(MyController) ctx.getBean("myController");
		System.out.println("___Primary");
		System.out.println(myController.sayHello());
		String greeting = myController.sayHello();
		System.out.println(greeting);


		String bye = myController.sayBye();
		System.out.println(bye);
//
		MyOtherController myOtherController = (MyOtherController) ctx.getBean("myOtherController");
		String hello = myOtherController.otherHi();
		System.out.println(hello);

		String byeBye = myOtherController.otherBye();
		System.out.println(byeBye);

		System.out.println("____Primary beam");
//		System.out.println(myController.sayHello());

		System.out.println("_______ Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("_____Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());
		System.out.println("End");

		System.out.println("_____Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());

		System.out.println("final beam end");




	}

}
