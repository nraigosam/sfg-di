package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String SayGreeting() {
        return "Hello Word - Constructor";
    }
}
