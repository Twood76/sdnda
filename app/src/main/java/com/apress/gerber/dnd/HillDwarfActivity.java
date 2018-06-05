package com.apress.gerber.dnd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;

public class HillDwarfActivity extends AppCompatActivity {
    //Variables for Sweeper
    private ScrollView myLayout = null;
    private float x1;
    private float x2;
    private boolean beeingUsed = true;

    //end of SweepVariables
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hill_dwarf);
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
                    /*Intent newIntent = new Intent(getApplicationContext(), HalflingActivity.class);
                    Bundle bundle = getIntent().getBundleExtra("bundle");
                    newIntent.putExtra("bundle", bundle);
                    newIntent.setFlags(newIntent.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                    startActivity(newIntent);
                    overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                    beeingUsed = true;
                    return true;
                    */

                }
                //next
                if (((x2 - x1) < 0) && (beeingUsed == false) && (Math.abs(x2 - x1) > 200)) {
                    Intent newIntent = new Intent(getApplicationContext(), MountainDwarfActivity.class);
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

    public void onHillDwarfSelectButton(View view) {
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
            barbarian.setRace("HillDwarf");
            barbarian.setStatistics(4, barbarian.itsStatistics(4) + 1);
            barbarian.setMaxHp(barbarian.itsMaxHp() + 1);
            barbarian.setExplorationTraits("");
            barbarian.setExplorationTraits("");
            barbarian.setExplorationTraits("");
            barbarian.setCombatTraits("");
            barbarian.setCombatTraits("");
        } else if (klass.equals("bard")) {
            bard.setRace("HillDwarf");
            bard.setStatistics(4, bard.itsStatistics(4) + 1);
            bard.setMaxHp(bard.itsMaxHp() + 1);
            bard.setExplorationTraits("");
            bard.setExplorationTraits("");
            bard.setExplorationTraits("");
            bard.setCombatTraits("");
            bard.setCombatTraits("");
        } else if (klass.equals("cleric")) {
            cleric.setRace("HillDwarf");
            cleric.setStatistics(4, cleric.itsStatistics(4) + 1);
            cleric.setMaxHp(cleric.itsMaxHp() + 1);
            cleric.setExplorationTraits("");
            cleric.setExplorationTraits("");
            cleric.setExplorationTraits("");
            cleric.setCombatTraits("");
            cleric.setCombatTraits("");
        } else if (klass.equals("druid")) {
            druid.setRace("HillDwarf");
            druid.setStatistics(4, druid.itsStatistics(4) + 1);
            druid.setMaxHp(druid.itsMaxHp() + 1);
            druid.setExplorationTraits("");
            druid.setExplorationTraits("");
            druid.setExplorationTraits("");
            druid.setCombatTraits("");
            druid.setCombatTraits("");
        } else if (klass.equals("fighter")) {
            fighter.setRace("HillDwarf");
            fighter.setStatistics(4, fighter.itsStatistics(4) + 1);
            fighter.setMaxHp(fighter.itsMaxHp() + 1);
            fighter.setExplorationTraits("");
            fighter.setExplorationTraits("");
            fighter.setExplorationTraits("");
            fighter.setCombatTraits("");
            fighter.setCombatTraits("");
        } else if (klass.equals("monk")) {
            monk.setRace("HillDwarf");
            monk.setStatistics(4, monk.itsStatistics(4) + 1);
            monk.setMaxHp(monk.itsMaxHp() + 1);
            monk.setExplorationTraits("");
            monk.setExplorationTraits("");
            monk.setExplorationTraits("");
            monk.setCombatTraits("");
            monk.setCombatTraits("");
        } else if (klass.equals("paladin")) {
            paladin.setRace("HillDwarf");
            paladin.setStatistics(4, paladin.itsStatistics(4) + 1);
            paladin.setMaxHp(paladin.itsMaxHp() + 1);
            paladin.setExplorationTraits("");
            paladin.setExplorationTraits("");
            paladin.setExplorationTraits("");
            paladin.setCombatTraits("");
            paladin.setCombatTraits("");
        } else if (klass.equals("ranger")) {
            ranger.setRace("HillDwarf");
            ranger.setStatistics(4, ranger.itsStatistics(4) + 1);
            ranger.setMaxHp(ranger.itsMaxHp() + 1);
            ranger.setExplorationTraits("");
            ranger.setExplorationTraits("");
            ranger.setExplorationTraits("");
            ranger.setCombatTraits("");
            ranger.setCombatTraits("");
        } else if (klass.equals("sorcerer")) {
            sorcerer.setRace("HillDwarf");
            sorcerer.setStatistics(4, sorcerer.itsStatistics(4) + 1);
            sorcerer.setMaxHp(sorcerer.itsMaxHp() + 1);
            sorcerer.setExplorationTraits("");
            sorcerer.setExplorationTraits("");
            sorcerer.setExplorationTraits("");
            sorcerer.setCombatTraits("");
            sorcerer.setCombatTraits("");
        } else if (klass.equals("rogue")) {
            rogue.setRace("HillDwarf");
            rogue.setStatistics(4, rogue.itsStatistics(4) + 1);
            rogue.setMaxHp(rogue.itsMaxHp() + 1);
            rogue.setExplorationTraits("");
            rogue.setExplorationTraits("");
            rogue.setExplorationTraits("");
            rogue.setCombatTraits("");
            rogue.setCombatTraits("");
        } else if (klass.equals("wizard")) {
            wizard.setRace("HillDwarf");
            wizard.setStatistics(4, wizard.itsStatistics(4) + 1);
            wizard.setMaxHp(wizard.itsMaxHp() + 1);
            wizard.setExplorationTraits("");
            wizard.setExplorationTraits("");
            wizard.setExplorationTraits("");
            wizard.setCombatTraits("");
            wizard.setCombatTraits("");
        } else if (klass.equals("warlock")) {
            warlock.setRace("HillDwarf");
            warlock.setStatistics(4, warlock.itsStatistics(4) + 1);
            warlock.setMaxHp(warlock.itsMaxHp() + 1);
            warlock.setExplorationTraits("");
            warlock.setExplorationTraits("");
            warlock.setExplorationTraits("");
            warlock.setCombatTraits("");
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

