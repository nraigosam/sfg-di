package guru.springframework.sfgdi.services;


public class SetterInjectedGreetingService implements GreetingService{
    @Override
    public String SayGreeting() {
        return "Hello Word - Setter ";
    }
}
