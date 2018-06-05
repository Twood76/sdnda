package com.apress.gerber.dnd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class chooseClassScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_class_screen);
    }

    public void onNextButoton(View view) {
        Intent newIntent = new Intent(this, ClassOverviewUniversalActivity.class);
        String whichClass = "barbarian";
        newIntent.putExtra("whichClass", whichClass);
        startActivity(newIntent);

    }
}
