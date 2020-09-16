package lv.ozo.dependency_injection_learning.controllers;

import lv.ozo.dependency_injection_learning.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        System.out.println("Hello World - from sayHello");

        return greetingService.sayGreeting();
    }

    public String sayBye(){
        System.out.println("Good bye world");

        return "Say Bye works";
    }
}
