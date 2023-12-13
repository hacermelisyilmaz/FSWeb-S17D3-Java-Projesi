package com.workintech.zoo.entity;


import com.workintech.zoo.enums.Sex;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Koala {
    private long id;
    private String name;
    private double weight;
    private double sleepHour;
    private Sex sex;


}