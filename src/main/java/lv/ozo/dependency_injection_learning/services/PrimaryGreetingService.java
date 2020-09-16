package lv.ozo.dependency_injection_learning.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService{


    @Override
    public String sayGreeting() {
        return "Hello World from Primary beam";
    }
}
