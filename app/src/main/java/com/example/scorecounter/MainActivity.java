package com.example.scorecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    int scoreA, scoreB, foulATeam, foulBTeam;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goalA(View v){
        scoreA += 1;
        displayA(Integer.toString(scoreA));
    }

    public void foulA(View v){
        foulATeam += 1;
        displayAFoul(Integer.toString(foulATeam));
    }

    public void goalB(View v){
        scoreB += 1;
        displayB(Integer.toString(scoreB));
    }

    public void foulB(View v){
        foulBTeam += 1;
        displayBFoul(Integer.toString(foulBTeam));
    }

    private void displayA(String score){
        TextView A = findViewById(R.id.teamAScore);
        A.setText(score);
    }

    private void displayB(String score){
        TextView B = findViewById(R.id.teamBScore);
        B.setText(score);
    }

    private void displayAFoul(String foul){
        TextView fa = findViewById(R.id.teamAFoul);
        fa.setText(foul);
    }

    private void displayBFoul(String foul){
        TextView fb = findViewById(R.id.teamBFoul);
        fb.setText(foul);
    }

    public void reset(View v){
        scoreA = 0;
        scoreB = 0;
        foulATeam = 0;
        foulBTeam = 0;
        displayA(Integer.toString(scoreA));
        displayB(Integer.toString(scoreB));
        displayAFoul(Integer.toString(foulATeam));
        displayBFoul(Integer.toString(foulBTeam));
    }


}
