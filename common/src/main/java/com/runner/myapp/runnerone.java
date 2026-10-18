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