package com.apress.gerber.dnd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;

public class MountainDwarfActivity extends AppCompatActivity {
    //Variables for Sweeper
    private ScrollView myLayout = null;
    private float x1;
    private float x2;
    private boolean beeingUsed = true;

    //end of SweepVariables
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountain_dwarf);
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
                    Intent newIntent = new Intent(getApplicationContext(), HillDwarfActivity.class);
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
                   /* Intent newIntent = new Intent(getApplicationContext(), DragonbornActivity.class);
                    Bundle bundle = getIntent().getBundleExtra("bundle");
                    newIntent.putExtra("bundle", bundle);
                    newIntent.setFlags(newIntent.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                    startActivity(newIntent);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    beeingUsed = true;
                   */ return true;
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
            barbarian.setRace("MountainDwarf");
            barbarian.setStatistics(0, barbarian.itsStatistics(0) + 2);
            for(int i = 0; i < 8; i++){
                barbarian.setArmorProfitiecys(i,1);
            }
            barbarian.setExplorationTraits("");
            barbarian.setExplorationTraits("");
            barbarian.setExplorationTraits("");
            barbarian.setCombatTraits("");
            barbarian.setCombatTraits("");
        } else if (klass.equals("bard")) {
            bard.setRace("MountainDwarf");
            bard.setStatistics(0, bard.itsStatistics(0) + 2);
            for(int i = 0; i < 8; i++){
                bard.setArmorProfitiecys(i,1);
            }
            bard.setExplorationTraits("");
            bard.setExplorationTraits("");
            bard.setExplorationTraits("");
            bard.setCombatTraits("");
            bard.setCombatTraits("");
        } else if (klass.equals("cleric")) {
            cleric.setRace("MountainDwarf");
            cleric.setStatistics(0, cleric.itsStatistics(0) + 2);
            for(int i = 0; i < 8; i++){
                cleric.setArmorProfitiecys(i,1);
            }
            cleric.setExplorationTraits("");
            cleric.setExplorationTraits("");
            cleric.setExplorationTraits("");
            cleric.setCombatTraits("");
            cleric.setCombatTraits("");
        } else if (klass.equals("druid")) {
            druid.setRace("MountainDwarf");
            druid.setStatistics(0, druid.itsStatistics(0) + 2);
            for(int i = 0; i < 8; i++){
                druid.setArmorProfitiecys(i,1);
            }
            druid.setExplorationTraits("");
            druid.setExplorationTraits("");
            druid.setExplorationTraits("");
            druid.setCombatTraits("");
            druid.setCombatTraits("");

        } else if (klass.equals("fighter")) {
            fighter.setRace("MountainDwarf");
            fighter.setStatistics(0, fighter.itsStatistics(0) + 2);
            for(int i = 0; i < 8; i++){
                fighter.setArmorProfitiecys(i,1);
            }
            fighter.setExplorationTraits("");
            fighter.setExplorationTraits("");
            fighter.setExplorationTraits("");
            fighter.setCombatTraits("");
            fighter.setCombatTraits("");
        } else if (klass.equals("monk")) {
            monk.setRace("MountainDwarf");
            monk.setStatistics(0, monk.itsStatistics(0) + 2);
            for(int i = 0; i < 8; i++){
                monk.setArmorProfitiecys(i,1);
            }
            monk.setExplorationTraits("");
            monk.setExplorationTraits("");
            monk.setExplorationTraits("");
            monk.setCombatTraits("");
            monk.setCombatTraits("");
        } else if (klass.equals("paladin")) {
            paladin.setRace("MountainDwarf");
            paladin.setStatistics(0, paladin.itsStatistics(0) + 2);
            for(int i = 0; i < 8; i++){
                paladin.setArmorProfitiecys(i,1);
            }
            paladin.setExplorationTraits("");
            paladin.setExplorationTraits("");
            paladin.setExplorationTraits("");
            paladin.setCombatTraits("");
            paladin.setCombatTraits("");
        } else if (klass.equals("ranger")) {
            ranger.setRace("MountainDwarf");
            ranger.setStatistics(0, ranger.itsStatistics(0) + 2);
            for(int i = 0; i < 8; i++){
                ranger.setArmorProfitiecys(i,1);
            }
            ranger.setExplorationTraits("");
            ranger.setExplorationTraits("");
            ranger.setExplorationTraits("");
            ranger.setCombatTraits("");
            ranger.setCombatTraits("");
        } else if (klass.equals("sorcerer")) {
            sorcerer.setRace("MountainDwarf");
            sorcerer.setStatistics(0, sorcerer.itsStatistics(0) + 2);
            for(int i = 0; i < 8; i++){
                sorcerer.setArmorProfitiecys(i,1);
            }
            sorcerer.setExplorationTraits("");
            sorcerer.setExplorationTraits("");
            sorcerer.setExplorationTraits("");
            sorcerer.setCombatTraits("");
            sorcerer.setCombatTraits("");
        } else if (klass.equals("rogue")) {
            rogue.setRace("MountainDwarf");
            rogue.setStatistics(0, rogue.itsStatistics(0) + 2);
            for(int i = 0; i < 8; i++){
                rogue.setArmorProfitiecys(i,1);
            }
            rogue.setExplorationTraits("");
            rogue.setExplorationTraits("");
            rogue.setExplorationTraits("");
            rogue.setCombatTraits("");
            rogue.setCombatTraits("");
        } else if (klass.equals("wizard")) {
            wizard.setRace("MountainDwarf");
            wizard.setStatistics(0, wizard.itsStatistics(0) + 2);
            for(int i = 0; i < 8; i++){
                wizard.setArmorProfitiecys(i,1);
            }
            wizard.setExplorationTraits("");
            wizard.setExplorationTraits("");
            wizard.setExplorationTraits("");
            wizard.setCombatTraits("");
            wizard.setCombatTraits("");
        } else if (klass.equals("warlock")) {
            warlock.setRace("HillDwarf");
            warlock.setStatistics(0, warlock.itsStatistics(0) + 2);
            for(int i = 0; i < 8; i++){
                warlock.setArmorProfitiecys(i,1);
            }
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


