package com.adorno.services.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.adorno.model.Person;
import com.adorno.services.interfaces.PersonaService;

@Service
public class OtroService {
    @Autowired
    PersonaService personService;

    public int tryInject(){
        return  personService.getPersons().size();
    }

    public Person getCosa(){
    	return personService.getPersonById().get();
         
    }
}
