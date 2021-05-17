package com.example.appengine.java8.entities;

public class Ball {

    private Integer over;
    private Integer ball;
    private Integer run;
    private Integer batsman;
    private Integer bowler;

    public Ball(Integer over, Integer ball, Integer run, Integer batsman, Integer bowler) {
        this.over = over;
        this.ball = ball;
        this.run = run;
        this.batsman = batsman;
        this.bowler = bowler;
    }

    public Integer getOver() {
        return over;
    }

    public void setOver(Integer over) {
        this.over = over;
    }

    public Integer getBall() {
        return ball;
    }

    public void setBall(Integer ball) {
        this.ball = ball;
    }

    public Integer getRun() {
        return run;
    }

    public void setRun(Integer run) {
        this.run = run;
    }

    public Integer getBatsman() {
        return batsman;
    }

    public void setBatsman(Integer batsman) {
        this.batsman = batsman;
    }

    public Integer getBowler() {
        return bowler;
    }

    public void setBowler(Integer bowler) {
        this.bowler = bowler;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "over=" + over +
                ", ball=" + ball +
                ", run=" + run +
                ", batsman=" + batsman +
                ", bowler=" + bowler +
                '}';
    }
}
