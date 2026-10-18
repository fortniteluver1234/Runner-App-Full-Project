/*
Title: Run Data Model
Author: Ethan Brill
Purpose: Creates the Run object to save distance, duration, and run names using constructors and getter/setter methods.
Resources:
  - AP Computer Science A (Unit 3: Class Creation, Topic 3.4 Constructors and Topic 3.5 Methods)
  - Codename One API Docs
*/

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