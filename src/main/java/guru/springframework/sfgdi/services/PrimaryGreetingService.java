package guru.springframework.sfgdi.services;


public class PrimaryGreetingService implements GreetingService{

    @Override
    public String SayGreeting() {
         return "Hello word - From the primary bean";
    }
}
