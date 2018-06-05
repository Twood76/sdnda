package com.apress.gerber.dnd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BardCollegeOfValor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bard_college_of_valor);
    }

    public void onValorBonusProficiency(View view) {
        Intent newIntent = new Intent(getApplicationContext(), BardValorBonusProficiency.class);
        startActivity(newIntent);
    }

    public void onCombatInspiration(View view) {
        Intent newIntent = new Intent(getApplicationContext(), BardCombatInspiration.class);
        startActivity(newIntent);
    }

    public void onExtraAttack(View view) {
        Intent newIntent = new Intent(getApplicationContext(), BardExtraAttack.class);
        startActivity(newIntent);
    }

    public void onBattleMagic(View view) {
        Intent newIntent = new Intent(getApplicationContext(), BardBattleMagic.class);
        startActivity(newIntent);
    }
}
