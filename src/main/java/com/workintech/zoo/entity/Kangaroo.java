package com.workintech.zoo.entity;

import com.workintech.zoo.enums.Sex;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Kangaroo {
    private long id;
    private String name;
    private double height;
    private double weight;
    private Sex sex;
    private boolean isAggressive;
}
