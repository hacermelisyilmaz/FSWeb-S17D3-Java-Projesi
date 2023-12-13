package com.workintech.zoo.controller;

import com.workintech.zoo.entity.Koala;
import com.workintech.zoo.enums.Sex;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/workintech/koalas")
public class KoalaController {
    private Map<Long, Koala> koalas;

    @PostConstruct
    public void koalaInitialization() {
        koalas = new HashMap<>();
        Koala koala = new Koala(1L, "Sammy", 2.4, 16, Sex.FEMALE);
        koalas.put(koala.getId(), koala);
    }

    @GetMapping
    public Map<Long, Koala> getKoalas() {
        return koalas;
    }

    @GetMapping("/{id}")
    public Koala getKoala(@PathVariable long id) {
        return koalas.get(id);
    }

    @PostConstruct
    public void addKoala(@RequestBody Koala koala) {
        koalas.put(koala.getId(), koala);
    }

    @PutMapping("/{id}")
    public void updateKoala(@PathVariable long id, @RequestBody Koala koala) {
        koalas.put(id, koala);
    }

    @DeleteMapping("/{id}")
    public void removeKoala(@PathVariable long id) {
        koalas.remove(id);
    }
}
