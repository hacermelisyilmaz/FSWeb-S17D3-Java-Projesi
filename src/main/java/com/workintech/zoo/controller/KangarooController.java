package com.workintech.zoo.controller;

import com.workintech.zoo.entity.Kangaroo;
import com.workintech.zoo.enums.Sex;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public Kangaroo getKangaroo(@PathVariable long id) {
        return kangaroos.get(id);
    }

    @PostConstruct
    public void addKangaroo(@RequestBody Kangaroo kangaroo) {
        kangaroos.put(kangaroo.getId(), kangaroo);
    }

    @PutMapping("/{id}")
    public void updateKangaroo(@PathVariable long id, @RequestBody Kangaroo kangaroo) {
        kangaroos.put(id, kangaroo);
    }

    @DeleteMapping("/{id}")
    public void removeKangaroo(@PathVariable long id) {
        kangaroos.remove(id);
    }
}
