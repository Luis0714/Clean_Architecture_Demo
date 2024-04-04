package com.example.demo.Domain.Interfaces.Repositories;

import com.example.demo.Domain.Dtos.PersonDto;
import com.example.demo.Domain.Entities.PersonEntity;

import java.util.ArrayList;
import java.util.List;

public interface IPersonRepository {
    PersonEntity CreatePerson(PersonEntity person);
    ArrayList<PersonEntity> GetAllPerson();
}
