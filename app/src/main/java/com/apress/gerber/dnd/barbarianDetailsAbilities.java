package com.apress.gerber.dnd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;

public class barbarianDetailsAbilities extends AppCompatActivity {

    //Variables for Sweeper
    private ScrollView myLayout = null;
    private float x1;
    private float x2;
    private boolean beeingUsed = true;
    //end of SweepVariables

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barbarian_details_abilities);


        //Sweep Screen - got to setOnTouchListener to existin label (layout) deciding which area should be listen for touch events
        myLayout = (ScrollView) findViewById(R.id.scrollId);
        myLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if ((motionEvent.getAction() == MotionEvent.ACTION_DOWN)) {
                    x1 = motionEvent.getX();
                    beeingUsed = true;
                }
                if ((motionEvent.getAction() == MotionEvent.ACTION_UP)) {
                    x2 = motionEvent.getX();
                    beeingUsed = false;
                }
                //previous
                if (((x2 - x1) > 0) && beeingUsed == false && (Math.abs(x2 - x1) > 200)) {
                    Intent newIntent = new Intent(getApplicationContext(), ClassFeatures.class);
                    newIntent.setFlags(newIntent.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                    startActivity(newIntent);
                    overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                    beeingUsed = true;
                    return true;


                }
                //next
                /*if (((x2 - x1) < 0) && (beeingUsed == false) && (Math.abs(x2 - x1) > 200)) {
                    Intent newIntent = new Intent(getApplicationContext(), barbarianDetailsAbilities.class);
                    newIntent.setFlags(newIntent.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                    startActivity(newIntent);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    beeingUsed = true;
                    return true;
                }*/
                return false;
            }
            //---End of sweeper---
        });
    }

    public void onUnarmoredDefense(View view) {
        Intent newIntent = new Intent(getApplicationContext(), BarbarianAbilityUnarmoredDefense.class);
        startActivity(newIntent);
    }

    public void onRage(View view) {
        Intent newIntent = new Intent(getApplicationContext(), BarbarianAbilityRage.class);
        startActivity(newIntent);
    }

    public void onRecklessAttack(View view) {
        Intent newIntent = new Intent(getApplicationContext(), BarbarianAbilityRecklessAttack.class);
        startActivity(newIntent);
    }

    public void onDangerSense(View view) {
        Intent newIntent = new Intent(getApplicationContext(), BarbarianAbilitiesDangerSense.class);
        startActivity(newIntent);
    }

    public void onBerserker(View view) {
        Intent newIntent = new Intent(getApplicationContext(), BarbarianPrimalPath.class);
        startActivity(newIntent);
    }

    public void onTotemWarrior(View view) {
        Intent newIntent = new Intent(getApplicationContext(), BarbarianTotemWarrior.class);
        startActivity(newIntent);
    }

    public void onFeralInstinct(View view) {
        Intent newIntent = new Intent(getApplicationContext(), BarbarianFeralInstinct.class);
        startActivity(newIntent);
    }

    public void onBrutalCritical(View view) {
        Intent newIntent = new Intent(getApplicationContext(), BarbarianBrutalCritical.class);
        startActivity(newIntent);
    }

    public void onRelentlessRage(View view) {
        Intent newIntent = new Intent(getApplicationContext(), BarbarianRelentlessRage.class);
        startActivity(newIntent);
    }

    public void onPersistenRage(View view) {
        Intent newIntent = new Intent(getApplicationContext(), BarbarianPersistentRage.class);
        startActivity(newIntent);
    }

    public void onIndomitableMIght(View view) {
        Intent newIntent = new Intent(getApplicationContext(), BarbarianIndomitableMight.class);
        startActivity(newIntent);
    }

    public void onPrimalCHampion(View view) {
        Intent newIntent = new Intent(getApplicationContext(), PrimalChampion.class);
        startActivity(newIntent);
    }

    public void onChooseButtonclick(View view) {
        Intent i = new Intent(this, RollStatsActivity.class);
        String klasa = "Barbarian";
        String mainStats = "Strength/Constitution";
        i.putExtra("klasa", klasa);
        i.putExtra("mainStats", mainStats);
        startActivity(i);
    }

    public void onNextButton(View view) {
        Intent newIntent = new Intent(getApplicationContext(), ClassOverviewUniversalActivity.class);
        startActivity(newIntent);
    }
}