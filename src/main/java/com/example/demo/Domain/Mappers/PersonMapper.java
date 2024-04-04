package com.example.demo.Domain.Mappers;

import com.example.demo.Domain.Dtos.PersonDto;
import com.example.demo.Domain.Entities.PersonEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonMapper implements IPersonMapper{

    @Override
    public PersonEntity MapPersonDtoToPersonEntity(PersonDto person) {
        PersonEntity personEntity = new PersonEntity();
        personEntity.setFirstName(person.getFirstName());
        personEntity.setLastName(person.getLastName());
        personEntity.setAge(person.getAge());
        personEntity.setAddress(person.getAddress());
        return personEntity;
    }

    @Override
    public PersonDto MapPersonEntityPersonDto(PersonEntity person) {
        PersonDto personDto = new PersonDto();
        personDto.setFirstName(person.getFirstName());
        personDto.setLastName(person.getLastName());
        personDto.setAge(person.getAge());
        personDto.setAddress(person.getAddress());
        return personDto;
    }

    @Override
    public List<PersonEntity> MapListPersonDtoToListPersonEntity(List<PersonDto> persons) {
        ArrayList<PersonEntity> personsEntities = new ArrayList<>();
        persons.forEach(personDto -> {
           personsEntities.add(this.MapPersonDtoToPersonEntity(personDto));
        });
        return personsEntities;
    }

    @Override
    public List<PersonDto> MapListPersonEntityToListPersonDto(List<PersonEntity> persons) {
        ArrayList<PersonDto> personsDtos = new ArrayList<>();
        persons.forEach(personEntity -> {
            personsDtos.add(this.MapPersonEntityPersonDto(personEntity));
        });
        return personsDtos;
    }
}
