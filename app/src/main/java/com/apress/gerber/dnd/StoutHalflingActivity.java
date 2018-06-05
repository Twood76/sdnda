package com.apress.gerber.dnd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;

public class StoutHalflingActivity extends AppCompatActivity {
    //Variables for Sweeper
    private ScrollView myLayout = null;
    private float x1;
    private float x2;
    private boolean beeingUsed = true;

    //end of SweepVariables
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stout_halfling);
        //Sweep Screen - got to setOnTouchListener to existin label (layout) deciding which area should be listen for touch events
        myLayout = (ScrollView) findViewById(R.id.scrollId);
        myLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if ((motionEvent.getAction() == MotionEvent.ACTION_DOWN)) {
                    x1 = motionEvent.getX();
                }
                if ((motionEvent.getAction() == MotionEvent.ACTION_UP)) {
                    x2 = motionEvent.getX();
                    beeingUsed = false;
                }
                //previous
                if (((x2 - x1) > 0) && beeingUsed == false && (Math.abs(x2 - x1) > 200)) {
                    Intent newIntent = new Intent(getApplicationContext(), LightfootHalflingActivity.class);
                    Bundle bundle = getIntent().getBundleExtra("bundle");
                    newIntent.putExtra("bundle", bundle);
                    newIntent.setFlags(newIntent.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                    startActivity(newIntent);
                    overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                    beeingUsed = true;
                    return true;

                }
                //next
                if (((x2 - x1) < 0) && (beeingUsed == false) && (Math.abs(x2 - x1) > 200)) {
                    /*
                    Intent newIntent = new Intent(getApplicationContext(), StoutHalflingActivity.class);
                    Bundle bundle = getIntent().getBundleExtra("bundle");
                    newIntent.putExtra("bundle", bundle);
                    newIntent.setFlags(newIntent.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                    startActivity(newIntent);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    beeingUsed = true;
                    */
                    return true;

                }
                return false;
            }
            //---End of sweeper---
        });
    }

    public void stoutButton(View view) {
        Bundle bundle = getIntent().getBundleExtra("bundle");
        String klass = bundle.getString("klasa");

        Barbarian barbarian = (Barbarian) bundle.getSerializable("barbarian");
        Bard bard = (Bard) bundle.getSerializable("bard");
        Cleric cleric = (Cleric) bundle.getSerializable("cleric");
        Druid druid = (Druid) bundle.getSerializable("druid");
        Fighter fighter = (Fighter) bundle.getSerializable("fighter");
        Monk monk = (Monk) bundle.getSerializable("monk");
        Paladin paladin = (Paladin) bundle.getSerializable("paladin");
        Ranger ranger = (Ranger) bundle.getSerializable("ranger");
        Wizard wizard = (Wizard) bundle.getSerializable("wizard");
        Sorcerer sorcerer = (Sorcerer) bundle.getSerializable("sorcerer");
        Warlock warlock = (Warlock) bundle.getSerializable("warlock");
        Rogue rogue = (Rogue) bundle.getSerializable("rogue");


        if (klass.equals("Barbarian")) {
            barbarian.setRace("StoutHalfling");
            barbarian.setStatistics(2, barbarian.itsStatistics(2) + 1);
            barbarian.setExplorationTraits("");
            barbarian.setExplorationTraits("");
            barbarian.setExplorationTraits("");
            barbarian.setCombatTraits("<b>Stout Resilience:</b> You have advantage on saving throws against poison , and you have resistance against poison damage");
            barbarian.setCombatTraits("");

        } else if (klass.equals("bard")) {
            bard.setRace("StoutHalfling");
            bard.setStatistics(2, bard.itsStatistics(2) + 1);
            bard.setExplorationTraits("");
            bard.setExplorationTraits("");
            bard.setExplorationTraits("");
            bard.setCombatTraits("<b>Stout Resilience:</b> You have advantage on saving throws against poison , and you have resistance against poison damage");
            bard.setCombatTraits("");

        } else if (klass.equals("cleric")) {
            cleric.setRace("StoutHalfling");
            cleric.setStatistics(2, cleric.itsStatistics(2) + 1);
            cleric.setExplorationTraits("");
            cleric.setExplorationTraits("");
            cleric.setExplorationTraits("");
            cleric.setCombatTraits("<b>Stout Resilience:</b> You have advantage on saving throws against poison , and you have resistance against poison damage");
            cleric.setCombatTraits("");

        } else if (klass.equals("druid")) {
            druid.setRace("StoutHalfling");
            druid.setStatistics(2, druid.itsStatistics(2) + 1);
            druid.setExplorationTraits("");
            druid.setExplorationTraits("");
            druid.setExplorationTraits("");
            druid.setCombatTraits("<b>Stout Resilience:</b> You have advantage on saving throws against poison , and you have resistance against poison damage");
            druid.setCombatTraits("");

        } else if (klass.equals("fighter")) {
            fighter.setRace("StoutHalfling");
            fighter.setStatistics(2, fighter.itsStatistics(2) + 1);
            fighter.setExplorationTraits("");
            fighter.setExplorationTraits("");
            fighter.setExplorationTraits("");
            fighter.setCombatTraits("<b>Stout Resilience:</b> You have advantage on saving throws against poison , and you have resistance against poison damage");
            fighter.setCombatTraits("");

        } else if (klass.equals("monk")) {
            monk.setRace("StoutHalfling");
            monk.setStatistics(2, monk.itsStatistics(2) + 1);
            monk.setExplorationTraits("");
            monk.setExplorationTraits("");
            monk.setExplorationTraits("");
            monk.setCombatTraits("<b>Stout Resilience:</b> You have advantage on saving throws against poison , and you have resistance against poison damage");
            monk.setCombatTraits("");

        } else if (klass.equals("paladin")) {
            paladin.setRace("StoutHalfling");
            paladin.setStatistics(2, paladin.itsStatistics(2) + 1);
            paladin.setExplorationTraits("");
            paladin.setExplorationTraits("");
            paladin.setExplorationTraits("");
            paladin.setCombatTraits("<b>Stout Resilience:</b> You have advantage on saving throws against poison , and you have resistance against poison damage");
            paladin.setCombatTraits("");

        } else if (klass.equals("ranger")) {
            ranger.setRace("StoutHalfling");
            ranger.setStatistics(2, ranger.itsStatistics(2) + 1);
            ranger.setExplorationTraits("");
            ranger.setExplorationTraits("");
            ranger.setExplorationTraits("");
            ranger.setCombatTraits("<b>Stout Resilience:</b> You have advantage on saving throws against poison , and you have resistance against poison damage");
            ranger.setCombatTraits("");

        } else if (klass.equals("sorcerer")) {
            sorcerer.setRace("StoutHalfling");
            sorcerer.setStatistics(2, sorcerer.itsStatistics(2) + 1);
            sorcerer.setExplorationTraits("");
            sorcerer.setExplorationTraits("");
            sorcerer.setExplorationTraits("");
            sorcerer.setCombatTraits("<b>Stout Resilience:</b> You have advantage on saving throws against poison , and you have resistance against poison damage");
            sorcerer.setCombatTraits("");

        } else if (klass.equals("rogue")) {
            rogue.setRace("StoutHalfling");
            rogue.setStatistics(2, rogue.itsStatistics(2) + 1);
            rogue.setExplorationTraits("");
            rogue.setExplorationTraits("");
            rogue.setExplorationTraits("");
            rogue.setCombatTraits("<b>Stout Resilience:</b> You have advantage on saving throws against poison , and you have resistance against poison damage");
            rogue.setCombatTraits("");

        } else if (klass.equals("wizard")) {
            wizard.setRace("StoutHalfling");
            wizard.setStatistics(2, wizard.itsStatistics(2) + 1);
            wizard.setExplorationTraits("");
            wizard.setExplorationTraits("");
            wizard.setExplorationTraits("");
            wizard.setCombatTraits("<b>Stout Resilience:</b> You have advantage on saving throws against poison , and you have resistance against poison damage");
            wizard.setCombatTraits("");

        } else if (klass.equals("warlock")) {
            warlock.setRace("StoutHalfling");
            warlock.setStatistics(2, warlock.itsStatistics(2) + 1);
            warlock.setExplorationTraits("");
            warlock.setExplorationTraits("");
            warlock.setExplorationTraits("");
            warlock.setCombatTraits("<b>Stout Resilience:</b> You have advantage on saving throws against poison , and you have resistance against poison damage");
            warlock.setCombatTraits("");
        }

        Intent newIntent = new Intent(this, HillDwarfActivity.class);
        Bundle newBundle = new Bundle();
        newBundle.putString("klasa", klass);
        newBundle.putSerializable("barbarian", barbarian);
        newBundle.putSerializable("bard", bard);
        newBundle.putSerializable("cleric", cleric);
        newBundle.putSerializable("druid", druid);
        newBundle.putSerializable("fighter", fighter);
        newBundle.putSerializable("monk", monk);
        newBundle.putSerializable("paladin", paladin);
        newBundle.putSerializable("ranger", ranger);
        newBundle.putSerializable("wizard", wizard);
        newBundle.putSerializable("sorcerer", sorcerer);
        newBundle.putSerializable("warlock", warlock);
        newBundle.putSerializable("rogue", rogue);

        //newIntent.putExtra("bundle", bundle);
        //startActivity(newIntent);
    }
}
