package guru.springframework.sfgdi.services;


public class ConstructorGreetingService implements GreetingService {
    @Override
    public String SayGreeting() {
        return "Hello Word - Constructor";
    }
}
