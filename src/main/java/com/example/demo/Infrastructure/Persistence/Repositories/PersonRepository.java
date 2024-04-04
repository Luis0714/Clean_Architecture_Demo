package com.example.demo.Infrastructure.Persistence.Repositories;

import com.example.demo.Domain.Dtos.PersonDto;
import com.example.demo.Domain.Entities.PersonEntity;
import com.example.demo.Domain.Interfaces.Repositories.IPersonRepository;
import com.example.demo.Domain.Interfaces.Services.IFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class PersonRepository implements IPersonRepository {
    @Autowired
    private IFileService fileService;
    @Override
    public PersonEntity CreatePerson(PersonEntity person) {
        boolean isSave = this.fileService.WriteInTheArchive(person);
        if(isSave){
            return person;
        }
        return null;
    }

    @Override
    public ArrayList<PersonEntity> GetAllPerson() {
        return fileService.ReadOfTheArchive();
    }
}
