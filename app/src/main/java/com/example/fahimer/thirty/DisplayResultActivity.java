package com.example.fahimer.thirty;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class DisplayResultActivity extends AppCompatActivity {

    private TextView diceResults, textView3, textView4,textView5, textView6, textView7, textView8;
    public List<Integer> list2 = new ArrayList<Integer>();
    public List<Integer> diceN1= new ArrayList<Integer>();
    public List<Integer> dice2= new ArrayList<Integer>();
    public List<Integer> dice3= new ArrayList<Integer>();

    public List<Integer> dice4= new ArrayList<Integer>();
    public List<Integer> dice5= new ArrayList<Integer>();
    public List<Integer> dice6= new ArrayList<Integer>();

    StringBuilder jokeStringBuilder1= new StringBuilder();
    StringBuilder jokeStringBuilder = new StringBuilder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_result);
        diceResults = (TextView) findViewById(R.id.DiceResult);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView5 = (TextView) findViewById(R.id.textView5);
        textView6 = (TextView) findViewById(R.id.textView6);
        textView7 = (TextView) findViewById(R.id.textView7);
        textView8 = (TextView) findViewById(R.id.textView8);


        list2  = getIntent().getIntegerArrayListExtra("result");
        diceN1 = getIntent().getIntegerArrayListExtra("dice1");
        dice2  = getIntent().getIntegerArrayListExtra("dice2");
        dice3  = getIntent().getIntegerArrayListExtra("dice3");

        dice4  = getIntent().getIntegerArrayListExtra("dice4");
        dice5  = getIntent().getIntegerArrayListExtra("dice5");
        dice6  = getIntent().getIntegerArrayListExtra("dice6");

        for (int i = 0; i<list2.size(); i++) {
            Log.i("Member name: ", String.valueOf(list2.get(i)));
            jokeStringBuilder.append(list2.get(i)+",");
        }

        diceResults.setText(String.valueOf(jokeStringBuilder));

        textView3.setText(String.valueOf(diceN1));
        textView4.setText(String.valueOf(dice2));
        textView5.setText(String.valueOf(dice3));
        textView6.setText(String.valueOf(dice4));
        textView7.setText(String.valueOf(dice5));
        textView8.setText(String.valueOf(dice6));
    }
}
