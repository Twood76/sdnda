package com.apress.gerber.dnd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BarbarianPrimalPath extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barbarian_primal_path);
    }

    public void onFrenzy(View view) {
        Intent newIntent = new Intent(getApplicationContext(), BarbarianBerserkerAbilityFrenzy.class);
        startActivity(newIntent);
    }

    public void onMIndlessRage(View view) {
        Intent newIntent = new Intent(getApplicationContext(), BarbarianBerserkerAbilityMindlessRage.class);
        startActivity(newIntent);
    }

    public void onIntimidatingPresence(View view) {
        Intent newIntent = new Intent(getApplicationContext(), BarbarianBerserkerAbilityIntimidatingPresence.class);
        startActivity(newIntent);
    }

    public void onRetailation(View view) {
        Intent newIntent = new Intent(getApplicationContext(), BarbarianBerserkerAbilityRetailation.class);
        startActivity(newIntent);
    }
}
