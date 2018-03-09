/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.counter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int scoreShooter1;

    int scoreShooter2;

    int noofShotsS1;

    int noofShotsS2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addSevenforS1(View v) {
        scoreShooter1 = scoreShooter1 + 7;
        noofShotsS1 = noofShotsS1 +1;
        displayForS1(scoreShooter1);
        displayShotsS1(noofShotsS1);
    }
    public void addEightforS1(View v) {
        scoreShooter1 = scoreShooter1 + 8;
        noofShotsS1 = noofShotsS1 +1;
        displayForS1(scoreShooter1);
        displayShotsS1(noofShotsS1);
    }
    public void addNineforS1(View v) {
        scoreShooter1 = scoreShooter1 + 9;
        noofShotsS1 = noofShotsS1 +1;
        displayForS1(scoreShooter1);
        displayShotsS1(noofShotsS1);
}
    public void addXforS1(View v) {
        scoreShooter1 = scoreShooter1 + 10;
        noofShotsS1 = noofShotsS1 +1;
        displayForS1(scoreShooter1);
        displayShotsS1(noofShotsS1);
    }
    public void addSevenforS2(View v) {
        scoreShooter2 = scoreShooter2 + 7;
        noofShotsS2 = noofShotsS2 +1;
        displayForS2(scoreShooter2);
        displayShotsS2(noofShotsS2);
    }
    public void addEightforS2(View v) {
        scoreShooter2 = scoreShooter2 + 8;
        noofShotsS2 = noofShotsS2 +1;
        displayForS2(scoreShooter2);
        displayShotsS2(noofShotsS2);
    }
    public void addNineforS2(View v) {
        scoreShooter2 = scoreShooter2 + 9;
        noofShotsS2 = noofShotsS2 +1;
        displayForS2(scoreShooter2);
        displayShotsS2(noofShotsS2);
    }
    public void addXforS2(View v) {
        scoreShooter2 = scoreShooter2 + 10;
        noofShotsS2 = noofShotsS2 +1;
        displayForS2(scoreShooter2);
        displayShotsS2(noofShotsS2);
    }
    public void resetScore(View v) {
        scoreShooter1 = 0;
        noofShotsS1 = 0;
        scoreShooter2 = 0;
        noofShotsS2 = 0;
        displayForS1(scoreShooter1);
        displayForS2(scoreShooter2);
        displayShotsS1(noofShotsS1);
        displayShotsS2(noofShotsS2);
    }
    public void displayForS1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_S1);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForS2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_S2);
        scoreView.setText(String.valueOf(score));
    }
    public void displayShotsS1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.shots_S1);
        scoreView.setText(String.valueOf(score));
    }
    public void displayShotsS2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.shots_S2);
        scoreView.setText(String.valueOf(score));
    }
}