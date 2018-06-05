package com.apress.gerber.dnd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;

public class BardAbilityDetailsActivity extends AppCompatActivity {

    //Variables for Sweeper
    private ScrollView myLayout = null;
    private float x1;
    private float x2;
    private boolean beeingUsed = true;
    //end of SweepVariables

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bard_ability_details);

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

                    Intent newIntent = new Intent(getApplicationContext(), BardSpellCastingActivity.class);
                    newIntent.setFlags(newIntent.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                    startActivity(newIntent);
                    overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                    beeingUsed = true;
                    return true;


                }
                //next
                if (((x2 - x1) < 0) && (beeingUsed == false) && (Math.abs(x2 - x1) > 200)) {
                    /*
                    Intent newIntent = new Intent(getApplicationContext(), BardAbilitiesOverview.class);
                    newIntent.setFlags(newIntent.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                    startActivity(newIntent);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    beeingUsed = true;
                    return true;*/
                }
                return false;
            }
            //---End of sweeper---
        });
    }

    public void onBardicInspiration(View view) {
        Intent newIntent = new Intent(getApplicationContext(), BardBardicInspiration.class);
        startActivity(newIntent);
    }

    public void onJackOfAllTrades(View view) {
        Intent newIntent = new Intent(getApplicationContext(), BardJackOfAllTrades.class);
        startActivity(newIntent);
    }

    public void onSongOfRest(View view) {
        Intent newIntent = new Intent(getApplicationContext(), BardSongOfRest.class);
        startActivity(newIntent);
    }

    public void onExperise(View view) {
        Intent newIntent = new Intent(getApplicationContext(), BardExpertise.class);
        startActivity(newIntent);
    }


    public void onFontOfInspiration(View view) {
        Intent newIntent = new Intent(getApplicationContext(), BardFontOfInspiration.class);
        startActivity(newIntent);
    }

    public void onCounterCharm(View view) {
        Intent newIntent = new Intent(getApplicationContext(), BardCountercharm.class);
        startActivity(newIntent);
    }

    public void onMagicalSecrets(View view) {
        Intent newIntent = new Intent(getApplicationContext(), BardMagicalSecrets.class);
        startActivity(newIntent);
    }

    public void onSuperiorInspiration(View view) {
        Intent newIntent = new Intent(getApplicationContext(), BardSuperiorInspiration.class);
        startActivity(newIntent);
    }

    public void onNextButton(View view) {
        Intent newIntent = new Intent(getApplicationContext(), ClericActivity.class);
        newIntent.setFlags(newIntent.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(newIntent);
    }

    public void onPreviousButton(View view) {
        Intent newIntent = new Intent(getApplicationContext(), ClassOverviewUniversalActivity.class);
        newIntent.setFlags(newIntent.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(newIntent);
    }

    public void onChooseButtonclick(View view) {
        Intent i = new Intent(this, RollStatsActivity.class);
        String klasa = "Bard";
        String mainStats = "Charisma/Dexterity";
        i.putExtra("klasa", klasa);
        i.putExtra("mainStats", mainStats);
        startActivity(i);
    }

    public void onCollegeOfLore(View view) {
        Intent newIntent = new Intent(getApplicationContext(), BardCollegeOfLore.class);
        startActivity(newIntent);
    }

    public void onCollegeOfValor(View view) {
        Intent newIntent = new Intent(getApplicationContext(), BardCollegeOfValor.class);
        startActivity(newIntent);
    }
}
