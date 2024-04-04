package com.example.demo.Api.Controllers;

import com.example.demo.Application.Services.Persons.IPersonService;
import com.example.demo.Domain.Dtos.PersonDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("person")
public class PersonController {
    @Autowired
    private IPersonService personService;

    @GetMapping("/index/{name}")
    public ResponseEntity<Map<String, String>> Hello(@PathVariable String name){
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hola "+name+" Bienvenido a la API del demo Clean Architecture");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/create")
    public ResponseEntity<PersonDto> Create(@RequestBody PersonDto person){
       return ResponseEntity.ok(this.personService.CreatePerson(person));
    }

    @GetMapping("/getAllPersons")
    public ResponseEntity<List<PersonDto>> GetAll(){
        return ResponseEntity.ok(this.personService.GetAllPersons());
    }

}
