package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service 
public class PropertyInjectedGreetingService implements GreetingService{
    @Override
    public String SayGreeting() {
        return "Hello Word - Property ";
    }
}
