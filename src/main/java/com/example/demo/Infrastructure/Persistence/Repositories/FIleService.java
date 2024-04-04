package com.example.demo.Infrastructure.Persistence.Repositories;

import com.example.demo.Domain.Dtos.PersonDto;
import com.example.demo.Domain.Entities.PersonEntity;
import com.example.demo.Domain.Interfaces.Services.IFileService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FIleService implements IFileService {

    private ArrayList<PersonEntity> persons = new ArrayList<PersonEntity>();

    @Override
    public boolean WriteInTheArchive(PersonEntity person) {
        return this.persons.add(person);
    }
    @Override
    public ArrayList<PersonEntity> ReadOfTheArchive() {
        persons.add(new PersonEntity.Builder()
                .firstName("John")
                .lastName("Doe")
                .age(30)
                .address("123 Main St, City")
                .build());

        persons.add(new PersonEntity.Builder()
                .firstName("Jane")
                .lastName("Smith")
                .age(25)
                .address("456 Elm St, Town")
                .build());

        persons.add(new PersonEntity.Builder()
                .firstName("Michael")
                .lastName("Johnson")
                .age(40)
                .address("789 Oak St, Village")
                .build());

        persons.add(new PersonEntity.Builder()
                .firstName("Emily")
                .lastName("Brown")
                .age(35)
                .address("101 Pine St, Hamlet")
                .build());

        persons.add(new PersonEntity.Builder()
                .firstName("David")
                .lastName("Wilson")
                .age(28)
                .address("202 Cedar St, County")
                .build());

        persons.add(new PersonEntity.Builder()
                .firstName("Sarah")
                .lastName("Miller")
                .age(45)
                .address("303 Maple St, Borough")
                .build());

        persons.add(new PersonEntity.Builder()
                .firstName("Christopher")
                .lastName("Taylor")
                .age(32)
                .address("404 Birch St, District")
                .build());

        persons.add(new PersonEntity.Builder()
                .firstName("Jessica")
                .lastName("Anderson")
                .age(37)
                .address("505 Spruce St, Township")
                .build());

        persons.add(new PersonEntity.Builder()
                .firstName("Daniel")
                .lastName("Thomas")
                .age(27)
                .address("606 Walnut St, Precinct")
                .build());

        persons.add(new PersonEntity.Builder()
                .firstName("Ashley")
                .lastName("Jackson")
                .age(34)
                .address("707 Pineapple St, Municipality")
                .build());
        return this.persons;
    }
}
