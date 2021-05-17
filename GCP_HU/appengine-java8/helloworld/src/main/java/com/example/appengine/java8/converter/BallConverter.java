package com.example.appengine.java8.converter;

import com.example.appengine.java8.entities.Ball;
import com.example.appengine.java8.request.BallRequest;
import com.example.appengine.java8.response.BallResponse;

public class BallConverter {

    public static Ball toEntity(BallRequest ballRequest){
        return new Ball (
                ballRequest.getOver(),
                ballRequest.getBall(),
                ballRequest.getRun(),
                ballRequest.getBatsman(),
                ballRequest.getBowler()
        );
    }

    public static BallResponse toResponse(Ball ball){
        return new BallResponse(ball.getOver(), ball.getBall(), ball.getRun(), ball.getBatsman(), ball.getBowler());
    }
}
