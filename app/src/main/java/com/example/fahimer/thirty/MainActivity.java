package com.example.fahimer.thirty;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import java.util.List;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    public static final Random RANDOM = new Random();
    protected Button showAllResults, rollDices,newgame, keep1,keep2, keep3,keep4,keep5,keep6;
    private ImageView imageView1, imageView2, imageView3, imageView4, imageView5, imageView6;
    private boolean clicked1,clicked2,clicked3,clicked4,clicked5,clicked6;
    public int value1, value2,value3,value4,value5,value6;
    private int round=0;
    private TextView roundCounter,pointCounter;
    private  int points;
    public List<Integer> list= new ArrayList<Integer>();
    protected List<Integer> dice1= new ArrayList<Integer>();
    protected List<Integer> dice2= new ArrayList<Integer>();
    protected List<Integer> dice3= new ArrayList<Integer>();
    protected List<Integer> dice4= new ArrayList<Integer>();
    protected List<Integer> dice5= new ArrayList<Integer>();
    protected List<Integer> dice6= new ArrayList<Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        rollDices = (Button) findViewById(R.id.rollDices);
        newgame = (Button) findViewById(R.id.NewGame);
        showAllResults= (Button) findViewById(R.id.showResults);
        keep1 = (Button) findViewById(R.id.keep);
        keep2 = (Button) findViewById(R.id.keep2);
        keep3= (Button) findViewById(R.id.button3);
        keep4= (Button) findViewById(R.id.button4);
        keep5= (Button) findViewById(R.id.button5);
        keep6= (Button) findViewById(R.id.button6);
        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView4 = (ImageView) findViewById(R.id.imageView4);
        imageView5 = (ImageView) findViewById(R.id.imageView5);
        imageView6 = (ImageView) findViewById(R.id.imageView6);
        roundCounter=(TextView) findViewById(R.id.roundNr);
        pointCounter=(TextView) findViewById(R.id.pointCounter);

        rollDices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                round++;
                value1= randomDiceValue();
                value2= randomDiceValue();
                value3= randomDiceValue();
                value4= randomDiceValue();
                value5= randomDiceValue();
                value6= randomDiceValue();

                if(3==round || 6==round || 9==round || 12==round || 15==round || 18==round || 21==round || 24==round || 27==round || 30==round) {
                    list.add(value1); list.add(value2);list.add(value3);list.add(value4);list.add(value5);list.add(value6);

                    clicked1 = false; clicked2= false; clicked3 = false; clicked4 = false; clicked5 = false; clicked6 = false;
                    keep1.setClickable(true);   keep2.setClickable(true);   keep3.setClickable(true);   keep4.setClickable(true);   keep5.setClickable(true);   keep6.setClickable(true);
                }

                int res1 = getResources().getIdentifier("red" + value1, "drawable", "com.example.fahimer.thirty");
                int res2 = getResources().getIdentifier("red" + value2, "drawable", "com.example.fahimer.thirty");
                int res3 = getResources().getIdentifier("red" + value3, "drawable", "com.example.fahimer.thirty");
                int res4 = getResources().getIdentifier("red" + value4, "drawable", "com.example.fahimer.thirty");
                int res5 = getResources().getIdentifier("red" + value5, "drawable", "com.example.fahimer.thirty");
                int res6 = getResources().getIdentifier("red" + value6, "drawable", "com.example.fahimer.thirty");

                if(clicked1==false) {
                    imageView1.setImageResource(res1);
                }if(clicked2==false) {
                    imageView2.setImageResource(res2);
                }if(clicked3==false) {
                    imageView3.setImageResource(res3);
                }if(clicked4==false) {
                    imageView4.setImageResource(res4);
                }if(clicked5==false) {
                    imageView5.setImageResource(res5);
                }if(clicked6==false) {
                    imageView6.setImageResource(res6);
                }

                if(round==31){
                    round= 0;
                }
                roundCounter.setText(String.valueOf(round));
                if( round==3 || 6==round || 9==round || 12==round || 15==round || 18==round || 21==round || 24==round || 27==round || 30==round){
                for(int i= 0; i<list.size(); i++){
                    if(3 >= list.get(i)){
                        points++;
                        }
                }
                }
                pointCounter.setText(String.valueOf(list));
            }
        });

        showAllResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent startNewActivity = new Intent(MainActivity.this, DisplayResultActivity.class);

                startNewActivity.putIntegerArrayListExtra("result", (ArrayList<Integer>) list);
                startNewActivity.putIntegerArrayListExtra("dice1",(ArrayList<Integer>) dice1);
                startNewActivity.putIntegerArrayListExtra("dice2",(ArrayList<Integer>) dice2);
                startNewActivity.putIntegerArrayListExtra("dice3",(ArrayList<Integer>) dice3);
                startNewActivity.putIntegerArrayListExtra("dice4",(ArrayList<Integer>) dice4);
                startNewActivity.putIntegerArrayListExtra("dice5",(ArrayList<Integer>) dice5);
                startNewActivity.putIntegerArrayListExtra("dice6",(ArrayList<Integer>) dice6);
                startActivity(startNewActivity);
            }
        });

        newgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                round= 0;
                points= 0;
                roundCounter.setText(String.valueOf(round));
            }
        });
        keep1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                keep1.setClickable(false);
                clicked1=true;
                dice1.add(value1);
                resetRound(keep1);
            }});
        keep2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                keep2.setClickable(false);
                clicked2=true;
                dice2.add(value2);
                resetRound(keep2);
            }});
        keep3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                keep3.setClickable(false);
                clicked3=true;
                dice3.add(value3);
                resetRound(keep3);
            }});
        keep4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                keep4.setClickable(false);
                clicked4=true;
                dice4.add(value4);
                resetRound(keep4);
            }});
        keep5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                keep5.setClickable(false);
                clicked5=true;
                dice5.add(value5);
                resetRound(keep5);
            }});
        keep6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                keep6.setClickable(false);
                clicked6=true;
                dice6.add(value6);
                resetRound(keep6);
            }});
    }
    public static int randomDiceValue() {
        return RANDOM.nextInt(6) + 1;
    }
    public void init(){

    }
    public void resetRound(View view){
        if(3==round || 6==round || 9==round || 12==round || 15==round || 18==round || 21==round || 24==round || 27==round || 30==round) {
            view.setClickable(true);
        }
    }
}