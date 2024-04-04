package com.example.demo.Application.Services.Persons;

import com.example.demo.Domain.Dtos.PersonDto;

import java.util.List;

public interface IPersonService {
    PersonDto CreatePerson(PersonDto person);
    List<PersonDto> GetAllPersons();
}
