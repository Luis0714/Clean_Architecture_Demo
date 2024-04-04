package com.example.demo.Application.Services.Persons;

import com.example.demo.Domain.Dtos.PersonDto;
import com.example.demo.Domain.Entities.PersonEntity;
import com.example.demo.Domain.Interfaces.Repositories.IPersonRepository;
import com.example.demo.Domain.Mappers.IPersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class PersonService implements IPersonService{
    @Autowired
    private IPersonRepository  personRepository;
    @Autowired
    private IPersonMapper personMapper;

    @Override
    public PersonDto CreatePerson(PersonDto person) {
       PersonEntity personSave = this.personMapper.MapPersonDtoToPersonEntity(person);
       return this.personMapper.MapPersonEntityPersonDto(personSave);
    }

    @Override
    public List<PersonDto> GetAllPersons() {
        ArrayList<PersonEntity> personEntities = personRepository.GetAllPerson();
        return personMapper.MapListPersonEntityToListPersonDto(personEntities);
    }


}
