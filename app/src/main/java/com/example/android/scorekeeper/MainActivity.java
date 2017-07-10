package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0, scoreB = 0, lossA = 0, lossB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void displayScoreA(int scoreForA){
        TextView txt = (TextView) findViewById(R.id.scoreA);
        txt.setText(String.valueOf(scoreForA));
    }

    private void displayScoreB(int scoreForB){
        TextView txt = (TextView) findViewById(R.id.scoreB);
        txt.setText(String.valueOf(scoreForB));
    }

    private void displayLossA(int lossForA){
        TextView txt = (TextView) findViewById(R.id.lossATxt);
        txt.setText("Loss: " + String.valueOf(lossForA));
    }

    private void displayLossB(int lossForB){
        TextView txt = (TextView) findViewById(R.id.lossBTxt);
        txt.setText("Loss: " + String.valueOf(lossForB));
    }

    public void winForA(View view){
        scoreA = scoreA + 3;
        displayScoreA(scoreA);
    }

    public void winForB(View view){
        scoreB = scoreB + 3;
        displayScoreB(scoreB);
    }

    public void lossForA(View view){
        lossA = lossA + 1;
        displayLossA(lossA);
    }

    public void lossForB(View view){
        lossB = lossB + 1;
        displayLossB(lossB);
    }

    public void draw(View view){
        scoreA = scoreA + 1;
        scoreB = scoreB + 1;

        displayScoreB(scoreB);
        displayScoreA(scoreA);
    }

    public void reset(View view){
        lossA = 0;
        lossB = 0;
        scoreA = 0;
        scoreB = 0;

        displayScoreA(scoreA);
        displayScoreB(scoreB);
        displayLossA(lossA);
        displayLossB(lossB);
    }
}
