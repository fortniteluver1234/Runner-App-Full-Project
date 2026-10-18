/*
Title: RunnerApp Main Interface
Author: Ethan Brill
Purpose: Builds the main UI screen and runs the app to display my running stats.
Resources:
  - Codename One Docs (Lifecycle, Form, Label, BoxLayout)
  - Codename One Maven Plugin
  - JDK 21
*/

package com.runner.myapp;

import static com.codename1.ui.CN.*;
import com.codename1.system.Lifecycle;
import com.codename1.ui.*;
import com.codename1.ui.layouts.*;

public class RunnerApp extends Lifecycle {

    @Override
    public void runApp() {
    
        Form mainForm = new Form("Running Tracker", new BoxLayout(BoxLayout.Y_AXIS));

        runnerone runner = new runnerone("Ethan");
        runner.addrun(new run(3.1, 25, "Morning Run"));
        runner.addrun(new run(5.0, 42, "Evening Run"));

   
        Label distanceLabel = new Label("Total Distance: " + runner.getTotalDistance() + " miles");
        Label paceLabel = new Label("Average Pace: " + String.format("%.2f", runner.getAveragePace()) + " min/mile");

        mainForm.add(distanceLabel);
        mainForm.add(paceLabel);

        mainForm.show();
    }

}