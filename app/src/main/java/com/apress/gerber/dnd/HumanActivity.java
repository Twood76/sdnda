package com.apress.gerber.dnd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Half;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;

public class HumanActivity extends AppCompatActivity {
    //Variables for Sweeper
    private ScrollView myLayout = null;
    private float x1;
    private float x2;
    private boolean beeingUsed = true;

    //end of SweepVariables
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_human);
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
                    Intent newIntent = new Intent(getApplicationContext(), HalflingActivity.class);
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
                    Intent newIntent = new Intent(getApplicationContext(), DragonbornActivity.class);
                    Bundle bundle = getIntent().getBundleExtra("bundle");
                    newIntent.putExtra("bundle", bundle);
                    newIntent.setFlags(newIntent.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                    startActivity(newIntent);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    beeingUsed = true;
                    return true;
                }
                return false;
            }
            //---End of sweeper---
        });
    }

    public void onHumanSelectButton(View view) {
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
            barbarian.setRace("Human");
            barbarian.setStatistics(0, barbarian.itsStatistics(0) + 1);
            barbarian.setStatistics(1, barbarian.itsStatistics(1) + 1);
            barbarian.setStatistics(2, barbarian.itsStatistics(2) + 1);
            barbarian.setStatistics(3, barbarian.itsStatistics(3) + 1);
            barbarian.setStatistics(4, barbarian.itsStatistics(4) + 1);
            barbarian.setStatistics(5, barbarian.itsStatistics(5) + 1);
            barbarian.setSpeed(30);
            barbarian.setExplorationTraits("");
            barbarian.setExplorationTraits("");
            barbarian.setExplorationTraits("");
            barbarian.setCombatTraits("");
            barbarian.setCombatTraits("");
            barbarian.setLanguages(0, 1);
            barbarian.setLanguages(4, 0);
        } else if (klass.equals("bard")) {
            bard.setRace("Human");
            bard.setStatistics(0, bard.itsStatistics(0) + 1);
            bard.setStatistics(1, bard.itsStatistics(1) + 1);
            bard.setStatistics(2, bard.itsStatistics(2) + 1);
            bard.setStatistics(3, bard.itsStatistics(3) + 1);
            bard.setStatistics(4, bard.itsStatistics(4) + 1);
            bard.setStatistics(5, bard.itsStatistics(5) + 1);
            bard.setSpeed(30);
            bard.setExplorationTraits("");
            bard.setExplorationTraits("");
            bard.setExplorationTraits("");
            bard.setCombatTraits("");
            bard.setCombatTraits("");
            bard.setLanguages(0, 1);
            bard.setLanguages(4, 0);
        } else if (klass.equals("cleric")) {
            cleric.setRace("Human");
            cleric.setStatistics(0, cleric.itsStatistics(0) + 1);
            cleric.setStatistics(1, cleric.itsStatistics(1) + 1);
            cleric.setStatistics(2, cleric.itsStatistics(2) + 1);
            cleric.setStatistics(3, cleric.itsStatistics(3) + 1);
            cleric.setStatistics(4, cleric.itsStatistics(4) + 1);
            cleric.setStatistics(5, cleric.itsStatistics(5) + 1);
            cleric.setSpeed(30);
            cleric.setExplorationTraits("");
            cleric.setExplorationTraits("");
            cleric.setExplorationTraits("");
            cleric.setCombatTraits("");
            cleric.setCombatTraits("");
            cleric.setLanguages(0, 1);
            cleric.setLanguages(4, 0);
        } else if (klass.equals("druid")) {
            druid.setRace("Human");
            druid.setStatistics(0, druid.itsStatistics(0) + 1);
            druid.setStatistics(1, druid.itsStatistics(1) + 1);
            druid.setStatistics(2, druid.itsStatistics(2) + 1);
            druid.setStatistics(3, druid.itsStatistics(3) + 1);
            druid.setStatistics(4, druid.itsStatistics(4) + 1);
            druid.setStatistics(5, druid.itsStatistics(5) + 1);
            druid.setSpeed(30);
            druid.setExplorationTraits("");
            druid.setExplorationTraits("");
            druid.setExplorationTraits("");
            druid.setCombatTraits("");
            druid.setCombatTraits("");
            druid.setLanguages(0, 1);
            druid.setLanguages(4, 0);
        } else if (klass.equals("fighter")) {
            fighter.setRace("Human");
            fighter.setStatistics(0, fighter.itsStatistics(0) + 1);
            fighter.setStatistics(1, fighter.itsStatistics(1) + 1);
            fighter.setStatistics(2, fighter.itsStatistics(2) + 1);
            fighter.setStatistics(3, fighter.itsStatistics(3) + 1);
            fighter.setStatistics(4, fighter.itsStatistics(4) + 1);
            fighter.setStatistics(5, fighter.itsStatistics(5) + 1);
            fighter.setSpeed(30);
            fighter.setExplorationTraits("");
            fighter.setExplorationTraits("");
            fighter.setExplorationTraits("");
            fighter.setCombatTraits("");
            fighter.setCombatTraits("");
            fighter.setLanguages(0, 1);
            fighter.setLanguages(4, 0);
        } else if (klass.equals("monk")) {
            monk.setRace("Human");
            monk.setStatistics(0, monk.itsStatistics(0) + 1);
            monk.setStatistics(1, monk.itsStatistics(1) + 1);
            monk.setStatistics(2, monk.itsStatistics(2) + 1);
            monk.setStatistics(3, monk.itsStatistics(3) + 1);
            monk.setStatistics(4, monk.itsStatistics(4) + 1);
            monk.setStatistics(5, monk.itsStatistics(5) + 1);
            monk.setSpeed(30);
            monk.setExplorationTraits("");
            monk.setExplorationTraits("");
            monk.setExplorationTraits("");
            monk.setCombatTraits("");
            monk.setCombatTraits("");
            monk.setLanguages(0, 1);
            monk.setLanguages(4, 0);
        } else if (klass.equals("paladin")) {
            paladin.setRace("Human");
            paladin.setStatistics(0, paladin.itsStatistics(0) + 1);
            paladin.setStatistics(1, paladin.itsStatistics(1) + 1);
            paladin.setStatistics(2, paladin.itsStatistics(2) + 1);
            paladin.setStatistics(3, paladin.itsStatistics(3) + 1);
            paladin.setStatistics(4, paladin.itsStatistics(4) + 1);
            paladin.setStatistics(5, paladin.itsStatistics(5) + 1);
            paladin.setSpeed(30);
            paladin.setExplorationTraits("");
            paladin.setExplorationTraits("");
            paladin.setExplorationTraits("");
            paladin.setCombatTraits("");
            paladin.setCombatTraits("");
            paladin.setLanguages(0, 1);
            paladin.setLanguages(4, 0);
        } else if (klass.equals("ranger")) {
            ranger.setRace("Human");
            ranger.setStatistics(0, ranger.itsStatistics(0) + 1);
            ranger.setStatistics(1, ranger.itsStatistics(1) + 1);
            ranger.setStatistics(2, ranger.itsStatistics(2) + 1);
            ranger.setStatistics(3, ranger.itsStatistics(3) + 1);
            ranger.setStatistics(4, ranger.itsStatistics(4) + 1);
            ranger.setStatistics(5, ranger.itsStatistics(5) + 1);
            ranger.setSpeed(30);
            ranger.setExplorationTraits("");
            ranger.setExplorationTraits("");
            ranger.setExplorationTraits("");
            ranger.setCombatTraits("");
            ranger.setCombatTraits("");
            ranger.setLanguages(0, 1);
            ranger.setLanguages(4, 0);
        } else if (klass.equals("sorcerer")) {
            sorcerer.setRace("Human");
            sorcerer.setStatistics(0, sorcerer.itsStatistics(0) + 1);
            sorcerer.setStatistics(1, sorcerer.itsStatistics(1) + 1);
            sorcerer.setStatistics(2, sorcerer.itsStatistics(2) + 1);
            sorcerer.setStatistics(3, sorcerer.itsStatistics(3) + 1);
            sorcerer.setStatistics(4, sorcerer.itsStatistics(4) + 1);
            sorcerer.setStatistics(5, sorcerer.itsStatistics(5) + 1);
            sorcerer.setSpeed(30);
            sorcerer.setExplorationTraits("");
            sorcerer.setExplorationTraits("");
            sorcerer.setExplorationTraits("");
            sorcerer.setCombatTraits("");
            sorcerer.setCombatTraits("");
            sorcerer.setLanguages(0, 1);
            sorcerer.setLanguages(4, 0);
        } else if (klass.equals("rogue")) {
            rogue.setRace("Human");
            rogue.setStatistics(0, rogue.itsStatistics(0) + 1);
            rogue.setStatistics(1, rogue.itsStatistics(1) + 1);
            rogue.setStatistics(2, rogue.itsStatistics(2) + 1);
            rogue.setStatistics(3, rogue.itsStatistics(3) + 1);
            rogue.setStatistics(4, rogue.itsStatistics(4) + 1);
            rogue.setStatistics(5, rogue.itsStatistics(5) + 1);
            rogue.setSpeed(30);
            rogue.setExplorationTraits("");
            rogue.setExplorationTraits("");
            rogue.setExplorationTraits("");
            rogue.setCombatTraits("");
            rogue.setCombatTraits("");
            rogue.setLanguages(0, 1);
            rogue.setLanguages(4, 0);
        } else if (klass.equals("wizard")) {
            wizard.setRace("Human");
            wizard.setStatistics(0, wizard.itsStatistics(0) + 1);
            wizard.setStatistics(1, wizard.itsStatistics(1) + 1);
            wizard.setStatistics(2, wizard.itsStatistics(2) + 1);
            wizard.setStatistics(3, wizard.itsStatistics(3) + 1);
            wizard.setStatistics(4, wizard.itsStatistics(4) + 1);
            wizard.setStatistics(5, wizard.itsStatistics(5) + 1);
            wizard.setSpeed(30);
            wizard.setExplorationTraits("");
            wizard.setExplorationTraits("");
            wizard.setExplorationTraits("");
            wizard.setCombatTraits("");
            wizard.setCombatTraits("");
            wizard.setLanguages(0, 1);
            wizard.setLanguages(4, 0);
        } else if (klass.equals("warlock")) {
            warlock.setRace("Human");
            warlock.setStatistics(0, warlock.itsStatistics(0) + 1);
            warlock.setStatistics(1, warlock.itsStatistics(1) + 1);
            warlock.setStatistics(2, warlock.itsStatistics(2) + 1);
            warlock.setStatistics(3, warlock.itsStatistics(3) + 1);
            warlock.setStatistics(4, warlock.itsStatistics(4) + 1);
            warlock.setStatistics(5, warlock.itsStatistics(5) + 1);
            warlock.setSpeed(30);
            warlock.setExplorationTraits("");
            warlock.setExplorationTraits("");
            warlock.setExplorationTraits("");
            warlock.setCombatTraits("");
            warlock.setCombatTraits("");
            warlock.setLanguages(0, 1);
            warlock.setLanguages(4, 0);
        }
    }
}

