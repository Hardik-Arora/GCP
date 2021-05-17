package com.example.appengine.java8.repository;

import com.example.appengine.java8.entities.Ball;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.WriteResult;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static com.example.appengine.java8.repository.BallRepository.ballList;

@Component
public class FirestoreRepository {
    public Ball getByOver(Integer over, Integer ball){
        Ball result = ballList.stream().filter(ball2 -> ball2.getOver() == over).filter(ball1 -> ball1.getBall() == ball).findFirst().orElse(null);
        System.out.println("Microservice B");
        return result;
    }
}
