package guru.springframework.sfgdi.services;


public class I18nSpanishGreetingService implements GreetingService{

    @Override
    public String SayGreeting() {
        return "Hola Mundo - ES";
    }
}
