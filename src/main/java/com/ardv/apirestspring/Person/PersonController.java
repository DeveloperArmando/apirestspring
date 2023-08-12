package com.ardv.apirestspring.Person;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/person")
@RequiredArgsConstructor
public class PersonController {
    private final PersonService personService;

    @PostMapping
    public void createPerson(@RequestBody Person person) {
        personService.createPerson(person);
    }

    @GetMapping
    public String hello() {
        return "Hello World!";
    }
}
