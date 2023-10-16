package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;

public class SetterInjectedController {

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    private GreetingService greetingService;

    public SetterInjectedController() {
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
