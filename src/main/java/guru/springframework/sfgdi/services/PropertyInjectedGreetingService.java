package guru.springframework.sfgdi.services;

public class PropertyInjectedGreetingService implements GreetingService{
    @Override
    public String SayGreeting() {
        return "Hello Word - Property ";
    }
}
