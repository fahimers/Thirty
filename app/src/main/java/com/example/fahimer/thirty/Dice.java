package com.example.fahimer.thirty;

// Denna klass ska lagra alla tärningar som blir kastade och resultaten av de och användar input

import java.util.ArrayList;
import java.util.List;

public class Dice {


    public List<Integer> list= new ArrayList<Integer>();
    public List<Integer> dice1= new ArrayList<Integer>();
    public List<Integer> dice2= new ArrayList<Integer>();
    public  List<Integer> dice3= new ArrayList<Integer>();
    public  List<Integer> dice4= new ArrayList<Integer>();
    public  List<Integer> dice5= new ArrayList<Integer>();
    public  List<Integer> dice6= new ArrayList<Integer>();

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public void setValue3(int value3) {
        this.value3 = value3;
    }

    public void setValue4(int value4) {
        this.value4 = value4;
    }

    public void setValue5(int value5) {
        this.value5 = value5;
    }

    public void setValue6(int value6) {
        this.value6 = value6;
    }

    public int value1, value2,value3,value4,value5,value6;

    public int getValue1() {
        return value1;
    }

    public int getValue2() {
        return value2;
    }

    public int getValue3() {
        return value3;
    }

    public int getValue4() {
        return value4;
    }

    public int getValue5() {
        return value5;
    }

    public int getValue6() {
        return value6;
    }

    public List<Integer> getDice1() {
        return dice1;
    }
    public List<Integer> getDice2() {
        return dice2;
    }
    public List<Integer> getDice3() {
        return dice3;
    }
    public List<Integer> getDice4() {
        return dice4;
    }
    public List<Integer> getDice5() {
        return dice5;
    }
    public List<Integer> getDice6() {
        return dice6;
    }

}
