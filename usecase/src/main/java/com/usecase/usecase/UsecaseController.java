package com.usecase.usecase;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsecaseController {

    @GetMapping("/usecasedetails")
    public ArrayList Details() {
        ArrayList<Usecase> l = new ArrayList<>();
        l.add(new Usecase("Siva", "727722EUCS168", "Web Frameworks", null, "Chicken Friedrice,Briyani,Parrota ", "-",
                "Software Developer", "-", "-", "WakeUp to reality! Nothing ever goes to plan in this Curse World"));
        return l;
    }
}
