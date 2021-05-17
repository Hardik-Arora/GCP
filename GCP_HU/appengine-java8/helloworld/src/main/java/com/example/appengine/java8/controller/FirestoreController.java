package com.example.appengine.java8.controller;

import com.example.appengine.java8.entities.Ball;
import com.example.appengine.java8.service.FirestoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirestoreController {

    private FirestoreService firestoreService;

    @Autowired
    public FirestoreController(FirestoreService firestoreService) {
        this.firestoreService = firestoreService;
    }

    @GetMapping("/over/{over}/{ball}")
    public Ball getByOver(@PathVariable("over") Integer over, @PathVariable("ball") Integer ball){
        return firestoreService.getByOver(over, ball);
    }

}
