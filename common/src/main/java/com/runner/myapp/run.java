package com.runner.myapp;

public class run {
private double distance;
private int duration;
private String type;

public run(double distance, int duration, String type){ 
    this.distance = distance;
    this.duration = duration;
    this.type = type;
}
public double getDistance(){
    return distance;
}
public int getDuration() {
    return duration;
}
public String getType() {
    return type;
}
    public double getPace(){
        if (distance == 0) return 0.0;
        return duration/distance;
    }
}