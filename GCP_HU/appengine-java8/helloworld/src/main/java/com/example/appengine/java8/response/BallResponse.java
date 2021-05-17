package com.example.appengine.java8.response;

import lombok.Data;

@Data
public class BallResponse {

    private Integer over;
    private Integer ball;
    private Integer run;
    private Integer batsman;
    private Integer bowler;

    public BallResponse(Integer over, Integer ball, Integer run, Integer batsman, Integer bowler) {
        this.over = over;
        this.ball = ball;
        this.run = run;
        this.batsman = batsman;
        this.bowler = bowler;
    }
}
