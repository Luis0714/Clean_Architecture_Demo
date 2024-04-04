package com.example.demo.Domain.Mappers;

import com.example.demo.Domain.Dtos.PersonDto;
import com.example.demo.Domain.Entities.PersonEntity;

import java.util.List;

public interface IPersonMapper {
   PersonEntity MapPersonDtoToPersonEntity(PersonDto person);
   PersonDto MapPersonEntityPersonDto(PersonEntity person);
   List<PersonEntity> MapListPersonDtoToListPersonEntity(List<PersonDto> persons);
   List<PersonDto> MapListPersonEntityToListPersonDto(List<PersonEntity> persons);
}
