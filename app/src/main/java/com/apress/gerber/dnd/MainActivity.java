package com.apress.gerber.dnd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCharacterSheetClick(View view) {
        dupa x = new dupa();
        x.setDupsko(100);
        int a = 0;
        Intent i = new Intent(this, SummaryActivity.class);
        startActivity(i);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

    }

    public void onCreateCharacterSheetClick(View view) {
        Intent newIntent = new Intent(this, CharacterCreation.class);
        newIntent.setFlags(newIntent.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(newIntent);
    }
}
