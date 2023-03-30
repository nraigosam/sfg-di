package guru.springframework.sfgdi.services;


public class I18nEnglishGreetingService implements GreetingService{

    @Override
    public String SayGreeting() {
        return "Hello Word - EN";
    }
}
