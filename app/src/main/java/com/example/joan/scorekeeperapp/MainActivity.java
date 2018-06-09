package com.example.joan.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

       int pointsForChelsea = 0;
       int pointsForBrighton = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addThreeForChelsea(View v){
        displayForChelsea(3);
        pointsForChelsea = pointsForChelsea + 3;
        displayForChelsea(pointsForChelsea);


    } public void addZeroForChelsea(View v) {
        displayForChelsea(0);
        pointsForChelsea = pointsForChelsea + 0;
        displayForChelsea(pointsForChelsea);

    }

    public void addOneForChelsea(View v){
        displayForChelsea(1);
        pointsForChelsea = pointsForChelsea + 1;
        displayForChelsea(pointsForChelsea);
    }

    public void addThreeForBrighton(View v) {
        displayForChelsea(3);
        pointsForBrighton = pointsForBrighton + 3;
        displayForBrighton(pointsForBrighton);
    }

    public void addZeroForBrighton(View v) {
        displayForChelsea(0);
        pointsForBrighton = pointsForBrighton + 0;
        displayForBrighton(pointsForBrighton);

    }

    public void addOneForBrighton(View v) {
        displayForChelsea(0);
        pointsForChelsea = pointsForChelsea + 1;
        displayForBrighton(pointsForBrighton);

    }
    /**
     * Resets the points for both teams back to 0.
     */

    public void resetScore (View v)  {
        pointsForChelsea = 0;
        pointsForBrighton = 0;
        displayForChelsea(pointsForChelsea);
        displayForBrighton(pointsForBrighton);


    }

    /**
     * Displays the given score for Chelsea.
     */
    public void displayForChelsea(int score) {
        TextView scoreView = (TextView) findViewById(R.id.chelsea_points);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Brighton.
     */
    public void displayForBrighton(int score) {
        TextView scoreView = (TextView) findViewById(R.id.brighton_points);
        scoreView.setText(String.valueOf(score));
    }



}

