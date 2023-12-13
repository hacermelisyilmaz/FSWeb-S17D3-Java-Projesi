package com.workintech.zoo.controller;

import com.workintech.zoo.entity.Kangaroo;
import com.workintech.zoo.enums.Sex;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/workintech/kangaroos")
public class KangarooController {
    private Map<Long, Kangaroo> kangaroos;

    @PostConstruct
    public void kangarooInitialization() {
        kangaroos = new HashMap<>();
        Kangaroo kangaroo = new Kangaroo(1L, "Sammy", 2.4, 40.8, Sex.FEMALE, false);
        kangaroos.put(kangaroo.getId(), kangaroo);
    }

    @GetMapping
    public Map<Long, Kangaroo> getKangaroos() {
        return kangaroos;
    }
}
