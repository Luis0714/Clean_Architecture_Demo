package com.example.demo.Domain.Interfaces.Services;

import com.example.demo.Domain.Dtos.PersonDto;
import com.example.demo.Domain.Entities.PersonEntity;

import java.util.ArrayList;
import java.util.List;

public interface IFileService {
    boolean WriteInTheArchive(PersonEntity person);
    ArrayList<PersonEntity> ReadOfTheArchive();
}
