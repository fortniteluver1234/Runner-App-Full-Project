/*
Title: Runner Collection Class
Author: Ethan Brill
Purpose: Holds the runner's info and manages a list of runs to figure out total distance and average pace.
Resources:
  - AP Computer Science A (Unit 3: Class Creation, Topic 3.5 and Unit 4: Data Collections, Topic 4.8 ArrayList)
  - Codename One API Docs
*/

package com.runner.myapp;

import java.util.ArrayList;
import java.util.List;

public class runnerone {
    private String name;
    private List<run> runs;

    public runnerone(String name) {
        this.name = name;
        this.runs = new ArrayList<>();
    }

    public void addrun(run run) {
        runs.add(run);
    }

    public double getTotalDistance() {
        double total = 0;
        for (run r : runs) {
            total += r.getDistance();
        }
        return total;
    }

    public double getAveragePace() {
        if (runs.isEmpty()) return 0;
        double totalPace = 0;
        for (run r : runs) {
            totalPace += r.getPace();
        }
        return totalPace / runs.size();
    }
}