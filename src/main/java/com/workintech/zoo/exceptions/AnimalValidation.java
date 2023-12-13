package com.workintech.zoo.exceptions;

import com.workintech.zoo.entity.Animal;
import org.springframework.http.HttpStatus;

import java.util.Map;

public class AnimalValidation {
    private static final String ID_NOT_VALID = "ID must be greater than 0.";
    private static final String ANIMAL_NOT_EXIST = "Animal with given ID does not exist.";
    private static final String ANIMAL_ALREADY_EXIST = "Animal with given ID exists already.";
    private static final String ANIMAL_CREDENTIALS_NOT_VALID = "Animal credentials are not valid.";

    public static void isIdNotValid(long id) {
        if (id <= 0) throw new AnimalException(ID_NOT_VALID, HttpStatus.BAD_REQUEST);
    }

    public static void doesAnimalNotExist(Map<Long, Animal> animalMap, long id) {
        if (!animalMap.containsKey(id)) throw new AnimalException(ANIMAL_NOT_EXIST, HttpStatus.BAD_REQUEST);
    }
}
