package com.apress.gerber.dnd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BarbarianTotemWarrior extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barbarian_totem_warrior);
    }

    public void onSpiritSeeker(View view) {
        Intent newIntent = new Intent(getApplicationContext(), BarbarianTotemWarriorAbilitySpiritSeeker.class);
        startActivity(newIntent);
    }

    public void onTotemSpirit(View view) {
        Intent newIntent = new Intent(getApplicationContext(), BarbarianTotemSpirit.class);
        startActivity(newIntent);
    }


    public void onAspectOfTheBeast(View view) {
        Intent newIntent = new Intent(getApplicationContext(), BarbarianTotemAspectOfTheBeast.class);
        startActivity(newIntent);
    }

    public void onSPiritWalker(View view) {
        Intent newIntent = new Intent(getApplicationContext(), BarbarianTotemSpiritWalker.class);
        startActivity(newIntent);
    }

    public void onTotemicAttunement(View view) {
        Intent newIntent = new Intent(getApplicationContext(), BarbarianTotemicAttunement.class);
        startActivity(newIntent);
    }
}
