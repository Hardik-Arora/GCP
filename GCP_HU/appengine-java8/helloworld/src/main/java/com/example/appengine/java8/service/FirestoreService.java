package com.example.appengine.java8.service;

import com.example.appengine.java8.entities.Ball;
import com.example.appengine.java8.repository.BallRepository;
import com.example.appengine.java8.repository.FirestoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FirestoreService {
    private FirestoreRepository firestoreRepository;

    @Autowired
    public FirestoreService(FirestoreRepository firestoreRepository){
        this.firestoreRepository = firestoreRepository;
    }
    public Ball getByOver(Integer over, Integer ball){
        return firestoreRepository.getByOver(over, ball);
    }
}
