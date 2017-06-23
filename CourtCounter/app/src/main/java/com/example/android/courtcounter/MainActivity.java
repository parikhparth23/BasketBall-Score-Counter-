package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int total_point_a = 0;
    int total_point_b = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreeForTeamA(View view) {
        total_point_a = 3 + total_point_a;
        displayForTeamA(total_point_a);
    }

    public void addTwoForTeamA(View view) {
        total_point_a = 2 + total_point_a;
        displayForTeamA(total_point_a);
    }

    public void addFreeThrowForTeamA(View view) {
        total_point_a = 1 + total_point_a;
        displayForTeamA(total_point_a);
    }

    public void addThreeForTeamB(View view) {
        total_point_b = 3 + total_point_b;
        displayForTeamB(total_point_b);
    }

    public void addTwoForTeamB(View view) {
        total_point_b = 2 + total_point_b;
        displayForTeamB(total_point_b);
    }

    public void addFreeThrowForTeamB(View view) {
        total_point_b = 1 + total_point_b;
        displayForTeamB(total_point_b);
    }

    public void reset(View view) {
        total_point_a = 0;
        total_point_b = 0;
        displayForTeamA(total_point_a);
        displayForTeamB(total_point_b);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
