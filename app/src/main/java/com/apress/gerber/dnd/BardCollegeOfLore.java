package com.apress.gerber.dnd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BardCollegeOfLore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bard_college_of_lore);
    }

    public void onBonusProficiency(View view) {
        Intent newIntent = new Intent(getApplicationContext(), BardBonusProfitiency.class);
        startActivity(newIntent);
    }

    public void onCuttingWords(View view) {
        Intent newIntent = new Intent(getApplicationContext(), BardCuttingWords.class);
        startActivity(newIntent);
    }

    public void onAdditionalMagicalSecret(View view) {
        Intent newIntent = new Intent(getApplicationContext(), BardMagicalSecrets.class);
        startActivity(newIntent);
    }

    public void onPeerlessSkill(View view) {
        Intent newIntent = new Intent(getApplicationContext(), BardPeerlessSkill.class);
        startActivity(newIntent);
    }
}
