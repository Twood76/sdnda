package com.apress.gerber.dnd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;

public class HalflingActivity extends AppCompatActivity {
    //Variables for Sweeper
    private ScrollView myLayout = null;
    private float x1;
    private float x2;
    private boolean beeingUsed = true;
    //end of SweepVariables
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halfling);

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
                    Intent newIntent = new Intent(getApplicationContext(), ElfActivity.class);
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
                    Intent newIntent = new Intent(getApplicationContext(), HumanActivity.class);
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

    public void onHalflingSelectButton(View view) {
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


        if(klass.equals("Barbarian")){
            barbarian.setRace("Halfling");
            barbarian.setStatistics(1, barbarian.itsStatistics(1) + 2);
            barbarian.setSpeed(25);
            barbarian.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            barbarian.setExplorationTraits("<b>LUCKY:</b> W hen you roll a 1 on an attack roll, ability check, or saving throw, you can reroll the die and must use the new roll.");
            barbarian.setExplorationTraits("<b>HALFLING NIMBLENESS:</b> You can move through the space of any creature that is of a size larger than yours.");
            barbarian.setCombatTraits("<b>BRAVE:</b> You have advantage on saving throws against being frightened.");
            barbarian.setCombatTraits("<b>HALFLING NIMBLENESS:</b> You can move through the space of any creature that is of a size larger than yours.");
            barbarian.setLanguages(0,1);
            barbarian.setLanguages(4,1);
        }
        else if(klass.equals("bard")){
            bard.setRace("Halfling");
            bard.setStatistics(1, bard.itsStatistics(1) + 2);
            bard.setSpeed(25);
            bard.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            bard.setExplorationTraits("<b>LUCKY:</b> W hen you roll a 1 on an attack roll, ability check, or saving throw, you can reroll the die and must use the new roll.");
            bard.setExplorationTraits("<b>HALFLING NIMBLENESS:</b> You can move through the space of any creature that is of a size larger than yours.");
            bard.setCombatTraits("<b>BRAVE:</b> You have advantage on saving throws against being frightened.");
            bard.setCombatTraits("<b>HALFLING NIMBLENESS:</b> You can move through the space of any creature that is of a size larger than yours.");
            bard.setLanguages(0,1);
            bard.setLanguages(4,1);
        }
        else if(klass.equals("cleric")){
            cleric.setRace("Halfling");
            cleric.setStatistics(1, cleric.itsStatistics(1) + 2);
            cleric.setSpeed(25);
            cleric.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            cleric.setExplorationTraits("<b>LUCKY:</b> W hen you roll a 1 on an attack roll, ability check, or saving throw, you can reroll the die and must use the new roll.");
            cleric.setExplorationTraits("<b>HALFLING NIMBLENESS:</b> You can move through the space of any creature that is of a size larger than yours.");
            cleric.setCombatTraits("<b>BRAVE:</b> You have advantage on saving throws against being frightened.");
            cleric.setCombatTraits("<b>HALFLING NIMBLENESS:</b> You can move through the space of any creature that is of a size larger than yours.");
            cleric.setLanguages(0,1);
            cleric.setLanguages(4,1);
        }
        else if(klass.equals("druid")){
            druid.setRace("Halfling");
            druid.setStatistics(1, druid.itsStatistics(1) + 2);
            druid.setSpeed(25);
            druid.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            druid.setExplorationTraits("<b>LUCKY:</b> W hen you roll a 1 on an attack roll, ability check, or saving throw, you can reroll the die and must use the new roll.");
            druid.setExplorationTraits("<b>HALFLING NIMBLENESS:</b> You can move through the space of any creature that is of a size larger than yours.");
            druid.setCombatTraits("<b>BRAVE:</b> You have advantage on saving throws against being frightened.");
            druid.setCombatTraits("<b>HALFLING NIMBLENESS:</b> You can move through the space of any creature that is of a size larger than yours.");
            druid.setLanguages(0,1);
            druid.setLanguages(4,1);
        }
        else if(klass.equals("fighter")){
            fighter.setRace("Halfling");
            fighter.setStatistics(1, fighter.itsStatistics(1) + 2);
            fighter.setSpeed(25);
            fighter.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            fighter.setExplorationTraits("<b>LUCKY:</b> W hen you roll a 1 on an attack roll, ability check, or saving throw, you can reroll the die and must use the new roll.");
            fighter.setExplorationTraits("<b>HALFLING NIMBLENESS:</b> You can move through the space of any creature that is of a size larger than yours.");
            fighter.setCombatTraits("<b>BRAVE:</b> You have advantage on saving throws against being frightened.");
            fighter.setCombatTraits("<b>HALFLING NIMBLENESS:</b> You can move through the space of any creature that is of a size larger than yours.");
            fighter.setLanguages(0,1);
            fighter.setLanguages(4,1);
        }
        else if(klass.equals("monk")){
            monk.setRace("Halfling");
            monk.setStatistics(1, monk.itsStatistics(1) + 2);
            monk.setSpeed(25);
            monk.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            monk.setExplorationTraits("<b>LUCKY:</b> W hen you roll a 1 on an attack roll, ability check, or saving throw, you can reroll the die and must use the new roll.");
            monk.setExplorationTraits("<b>HALFLING NIMBLENESS:</b> You can move through the space of any creature that is of a size larger than yours.");
            monk.setCombatTraits("<b>BRAVE:</b> You have advantage on saving throws against being frightened.");
            monk.setCombatTraits("<b>HALFLING NIMBLENESS:</b> You can move through the space of any creature that is of a size larger than yours.");
            monk.setLanguages(0,1);
            monk.setLanguages(4,1);
        }
        else if(klass.equals("paladin")){
            paladin.setRace("Halfling");
            paladin.setStatistics(1, paladin.itsStatistics(1) + 2);
            paladin.setSpeed(25);
            paladin.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            paladin.setExplorationTraits("<b>LUCKY:</b> W hen you roll a 1 on an attack roll, ability check, or saving throw, you can reroll the die and must use the new roll.");
            paladin.setExplorationTraits("<b>HALFLING NIMBLENESS:</b> You can move through the space of any creature that is of a size larger than yours.");
            paladin.setCombatTraits("<b>BRAVE:</b> You have advantage on saving throws against being frightened.");
            paladin.setCombatTraits("<b>HALFLING NIMBLENESS:</b> You can move through the space of any creature that is of a size larger than yours.");
            paladin.setLanguages(0,1);
            paladin.setLanguages(4,1);
        }
        else if(klass.equals("ranger")){
            ranger.setRace("Halfling");
            ranger.setStatistics(1, ranger.itsStatistics(1) + 2);
            ranger.setSpeed(25);
            ranger.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            ranger.setExplorationTraits("<b>LUCKY:</b> W hen you roll a 1 on an attack roll, ability check, or saving throw, you can reroll the die and must use the new roll.");
            ranger.setExplorationTraits("<b>HALFLING NIMBLENESS:</b> You can move through the space of any creature that is of a size larger than yours.");
            ranger.setCombatTraits("<b>BRAVE:</b> You have advantage on saving throws against being frightened.");
            ranger.setCombatTraits("<b>HALFLING NIMBLENESS:</b> You can move through the space of any creature that is of a size larger than yours.");
            ranger.setLanguages(0,1);
            ranger.setLanguages(4,1);
        }
        else if(klass.equals("sorcerer")){
            sorcerer.setRace("Halfling");
            sorcerer.setStatistics(1, sorcerer.itsStatistics(1) + 2);
            sorcerer.setSpeed(25);
            sorcerer.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            sorcerer.setExplorationTraits("<b>LUCKY:</b> W hen you roll a 1 on an attack roll, ability check, or saving throw, you can reroll the die and must use the new roll.");
            sorcerer.setExplorationTraits("<b>HALFLING NIMBLENESS:</b> You can move through the space of any creature that is of a size larger than yours.");
            sorcerer.setCombatTraits("<b>BRAVE:</b> You have advantage on saving throws against being frightened.");
            sorcerer.setCombatTraits("<b>HALFLING NIMBLENESS:</b> You can move through the space of any creature that is of a size larger than yours.");
            sorcerer.setLanguages(0,1);
            sorcerer.setLanguages(4,1);
        }
        else if(klass.equals("rogue")){
            rogue.setRace("Halfling");
            rogue.setStatistics(1, rogue.itsStatistics(1) + 2);
            rogue.setSpeed(25);
            rogue.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            rogue.setExplorationTraits("<b>LUCKY:</b> W hen you roll a 1 on an attack roll, ability check, or saving throw, you can reroll the die and must use the new roll.");
            rogue.setExplorationTraits("<b>HALFLING NIMBLENESS:</b> You can move through the space of any creature that is of a size larger than yours.");
            rogue.setCombatTraits("<b>BRAVE:</b> You have advantage on saving throws against being frightened.");
            rogue.setCombatTraits("<b>HALFLING NIMBLENESS:</b> You can move through the space of any creature that is of a size larger than yours.");
            rogue.setLanguages(0,1);
            rogue.setLanguages(4,1);
        }
        else if(klass.equals("wizard")){
            wizard.setRace("Halfling");
            wizard.setStatistics(1, wizard.itsStatistics(1) + 2);
            wizard.setSpeed(25);
            wizard.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            wizard.setExplorationTraits("<b>LUCKY:</b> W hen you roll a 1 on an attack roll, ability check, or saving throw, you can reroll the die and must use the new roll.");
            wizard.setExplorationTraits("<b>HALFLING NIMBLENESS:</b> You can move through the space of any creature that is of a size larger than yours.");
            wizard.setCombatTraits("<b>BRAVE:</b> You have advantage on saving throws against being frightened.");
            wizard.setCombatTraits("<b>HALFLING NIMBLENESS:</b> You can move through the space of any creature that is of a size larger than yours.");
            wizard.setLanguages(0,1);
            wizard.setLanguages(4,1);
        }
        else if(klass.equals("warlock")){
            warlock.setRace("Halfling");
            warlock.setStatistics(1, warlock.itsStatistics(1) + 2);
            warlock.setSpeed(25);
            warlock.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            warlock.setExplorationTraits("<b>LUCKY:</b> W hen you roll a 1 on an attack roll, ability check, or saving throw, you can reroll the die and must use the new roll.");
            warlock.setExplorationTraits("<b>HALFLING NIMBLENESS:</b> You can move through the space of any creature that is of a size larger than yours.");
            warlock.setCombatTraits("<b>BRAVE:</b> You have advantage on saving throws against being frightened.");
            warlock.setCombatTraits("<b>HALFLING NIMBLENESS:</b> You can move through the space of any creature that is of a size larger than yours.");
            warlock.setLanguages(0,1);
            warlock.setLanguages(4,1);
        }
        Intent newIntent = new Intent(this, LightfootHalflingActivity.class);
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

        newIntent.putExtra("bundle", bundle);
        startActivity(newIntent);
    }
}

