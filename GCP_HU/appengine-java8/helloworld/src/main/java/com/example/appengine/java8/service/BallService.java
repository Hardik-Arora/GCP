package com.example.appengine.java8.service;

import com.example.appengine.java8.controller.BallController;
import com.example.appengine.java8.converter.BallConverter;
import com.example.appengine.java8.entities.Ball;
import com.example.appengine.java8.repository.BallRepository;
import com.example.appengine.java8.request.BallRequest;
import com.example.appengine.java8.response.BallResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.concurrent.ExecutionException;

@Service
public class BallService {

    private BallRepository ballRepository;

    @Autowired
    public BallService(BallRepository ballRepository){
        this.ballRepository = ballRepository;
    }

    public BallResponse create(BallRequest ballRequest) throws ExecutionException, InterruptedException {
        Ball ball = BallConverter.toEntity(ballRequest);
        Ball result = ballRepository.save(ball);
        return BallConverter.toResponse(result);
    }
}
