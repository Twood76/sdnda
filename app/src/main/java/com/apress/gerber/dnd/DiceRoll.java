package com.apress.gerber.dnd;

import java.util.Random;

/**
 * Created by Szyman on 06.12.2017.
 */

public class DiceRoll {
    public int rollXDY(int x, int y){
        Random random = new Random();
        int result = 0;
        for(int i = 0; i<x; i++) {
            result += random.nextInt(y)+1;
        }
        return result;
    }

    public int rollXDYRemove1(int x, int y){
        int lowestRoll = 9999;        int result = 0;
        Random random = new Random();
        for(int i =0; i<x; i++) {
            int temp = random.nextInt(y)+1;
            result += temp;
            if(temp < lowestRoll){lowestRoll = temp;}
        }
        return result - lowestRoll;
    }
}
