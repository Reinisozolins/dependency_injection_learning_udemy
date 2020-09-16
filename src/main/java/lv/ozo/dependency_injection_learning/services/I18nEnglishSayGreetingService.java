package lv.ozo.dependency_injection_learning.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("EN")
@Service("i18nService")
public class I18nEnglishSayGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "English hello world";
    }
}
