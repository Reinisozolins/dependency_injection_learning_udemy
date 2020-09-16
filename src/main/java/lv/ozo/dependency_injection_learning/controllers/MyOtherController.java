package lv.ozo.dependency_injection_learning.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyOtherController {
    public String otherHi(){
        System.out.println("Hi Humans");
        return "Hi from my other controller";
    }

    public String otherBye(){
        String answer = "Bye Humans";
        return answer;
    }
}
