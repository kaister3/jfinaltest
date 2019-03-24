package com.company;

import javax.swing.*;

public class Game {

}

class Hero{
    String name;
    float hp;
    float armor;
    int moveSpeed;

    public Hero(String name){
        this.name = name;
    }
}

class Garen extends Hero{
    public Garen(String a){
        super(a);
    }
}