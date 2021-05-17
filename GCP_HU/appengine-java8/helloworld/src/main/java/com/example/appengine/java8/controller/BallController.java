package com.example.appengine.java8.controller;

import com.example.appengine.java8.entities.Ball;
import com.example.appengine.java8.request.BallRequest;
import com.example.appengine.java8.response.BallResponse;
import com.example.appengine.java8.service.BallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;

@RestController
public class BallController {

    private BallService ballService;

    @Autowired
    public BallController(BallService ballService){
        this.ballService = ballService;
    }

    @PostMapping("/ball")
    public BallResponse create(@RequestBody BallRequest ball) throws ExecutionException, InterruptedException {
        return ballService.create(ball);
    }
}
