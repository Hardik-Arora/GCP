package com.example.appengine.java8.request;

import lombok.Data;

@Data
public class BallRequest {

    private Integer over;
    private Integer ball;
    private Integer run;
    private Integer batsman;
    private Integer bowler;

    public BallRequest(Integer over, Integer ball, Integer run, Integer batsman, Integer bowler) {
        this.over = over;
        this.ball = ball;
        this.run = run;
        this.batsman = batsman;
        this.bowler = bowler;
    }
}
