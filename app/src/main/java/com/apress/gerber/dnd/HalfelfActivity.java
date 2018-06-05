package com.apress.gerber.dnd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;

public class HalfelfActivity extends AppCompatActivity {
    //Variables for Sweeper
    private ScrollView myLayout = null;
    private float x1;
    private float x2;
    private boolean beeingUsed = true;
    //end of SweepVariables
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halfelf);
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
                    Intent newIntent = new Intent(getApplicationContext(), GnomeActivity.class);
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
                    Intent newIntent = new Intent(getApplicationContext(), HalforcActivity.class);
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

    public void onHalfelfSelectButton(View view) {
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
            barbarian.setRace("Halfelf");
            barbarian.setStatistics(5, barbarian.itsStatistics(5) + 2);
            barbarian.setSpeed(30);
            barbarian.setExplorationTraits("<b>DARKVISION:</b> Thanks to your elf blood, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            barbarian.setExplorationTraits("");
            barbarian.setExplorationTraits("");
            barbarian.setCombatTraits("<b>FEY ANCESTRY:</b> You have advantage on saving throws against being charmed, and magic can’t put you to sleep.");
            barbarian.setCombatTraits("");
            barbarian.setLanguages(0,1);
            barbarian.setLanguages(2,1);
        }
        else if(klass.equals("bard")){
            bard.setRace("Halfelf");
            bard.setStatistics(5, bard.itsStatistics(5) + 2);
            bard.setSpeed(30);
            bard.setExplorationTraits("<b>DARKVISION:</b> Thanks to your elf blood, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            bard.setExplorationTraits("");
            bard.setExplorationTraits("");
            bard.setCombatTraits("<b>FEY ANCESTRY:</b> You have advantage on saving throws against being charmed, and magic can’t put you to sleep.");
            bard.setCombatTraits("");
            bard.setLanguages(0,1);
            bard.setLanguages(2,1);
        }
        else if(klass.equals("cleric")){
            cleric.setRace("Halfelf");
            cleric.setStatistics(5, cleric.itsStatistics(5) + 2);
            cleric.setSpeed(30);
            cleric.setExplorationTraits("<b>DARKVISION:</b> Thanks to your elf blood, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            cleric.setExplorationTraits("");
            cleric.setExplorationTraits("");
            cleric.setCombatTraits("<b>FEY ANCESTRY:</b> You have advantage on saving throws against being charmed, and magic can’t put you to sleep.");
            cleric.setCombatTraits("");
            cleric.setLanguages(0,1);
            cleric.setLanguages(2,1);
        }
        else if(klass.equals("druid")){
            druid.setRace("Halfelf");
            druid.setStatistics(5, druid.itsStatistics(5) + 2);
            druid.setSpeed(30);
            druid.setExplorationTraits("<b>DARKVISION:</b> Thanks to your elf blood, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            druid.setExplorationTraits("");
            druid.setExplorationTraits("");
            druid.setCombatTraits("<b>FEY ANCESTRY:</b> You have advantage on saving throws against being charmed, and magic can’t put you to sleep.");
            druid.setCombatTraits("");
            druid.setLanguages(0,1);
            druid.setLanguages(2,1);
        }
        else if(klass.equals("fighter")){
            fighter.setRace("Halfelf");
            fighter.setStatistics(5, fighter.itsStatistics(5) + 2);
            fighter.setSpeed(30);
            fighter.setExplorationTraits("<b>DARKVISION:</b> Thanks to your elf blood, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            fighter.setExplorationTraits("");
            fighter.setExplorationTraits("");
            fighter.setCombatTraits("<b>FEY ANCESTRY:</b> You have advantage on saving throws against being charmed, and magic can’t put you to sleep.");
            fighter.setCombatTraits("");
            fighter.setLanguages(0,1);
            fighter.setLanguages(2,1);
        }
        else if(klass.equals("monk")){
            monk.setRace("Halfelf");
            monk.setStatistics(5, monk.itsStatistics(5) + 2);
            monk.setSpeed(30);
            monk.setExplorationTraits("<b>DARKVISION:</b> Thanks to your elf blood, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            monk.setExplorationTraits("");
            monk.setExplorationTraits("");
            monk.setCombatTraits("<b>FEY ANCESTRY:</b> You have advantage on saving throws against being charmed, and magic can’t put you to sleep.");
            monk.setCombatTraits("");
            monk.setLanguages(0,1);
            monk.setLanguages(2,1);
        }
        else if(klass.equals("paladin")){
            paladin.setRace("Halfelf");
            paladin.setStatistics(5, paladin.itsStatistics(5) + 2);
            paladin.setSpeed(30);
            paladin.setExplorationTraits("<b>DARKVISION:</b> Thanks to your elf blood, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            paladin.setExplorationTraits("");
            paladin.setExplorationTraits("");
            paladin.setCombatTraits("<b>FEY ANCESTRY:</b> You have advantage on saving throws against being charmed, and magic can’t put you to sleep.");
            paladin.setCombatTraits("");
            paladin.setLanguages(0,1);
            paladin.setLanguages(2,1);
        }
        else if(klass.equals("ranger")){
            ranger.setRace("Halfelf");
            ranger.setStatistics(5, ranger.itsStatistics(5) + 2);
            ranger.setSpeed(30);
            ranger.setExplorationTraits("<b>DARKVISION:</b> Thanks to your elf blood, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            ranger.setExplorationTraits("");
            ranger.setExplorationTraits("");
            ranger.setCombatTraits("<b>FEY ANCESTRY:</b> You have advantage on saving throws against being charmed, and magic can’t put you to sleep.");
            ranger.setCombatTraits("");
            ranger.setLanguages(0,1);
            ranger.setLanguages(2,1);
        }
        else if(klass.equals("sorcerer")){
            sorcerer.setRace("Halfelf");
            sorcerer.setStatistics(5, sorcerer.itsStatistics(5) + 2);
            sorcerer.setSpeed(30);
            sorcerer.setExplorationTraits("<b>DARKVISION:</b> Thanks to your elf blood, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            sorcerer.setExplorationTraits("");
            sorcerer.setExplorationTraits("");
            sorcerer.setCombatTraits("<b>FEY ANCESTRY:</b> You have advantage on saving throws against being charmed, and magic can’t put you to sleep.");
            sorcerer.setCombatTraits("");
            sorcerer.setLanguages(0,1);
            sorcerer.setLanguages(2,1);
        }
        else if(klass.equals("rogue")){
            rogue.setRace("Halfelf");
            rogue.setStatistics(5, rogue.itsStatistics(5) + 2);
            rogue.setSpeed(30);
            rogue.setExplorationTraits("<b>DARKVISION:</b> Thanks to your elf blood, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            rogue.setExplorationTraits("");
            rogue.setExplorationTraits("");
            rogue.setCombatTraits("<b>FEY ANCESTRY:</b> You have advantage on saving throws against being charmed, and magic can’t put you to sleep.");
            rogue.setCombatTraits("");
            rogue.setLanguages(0,1);
            rogue.setLanguages(2,1);
        }
        else if(klass.equals("wizard")){
            wizard.setRace("Halfelf");
            wizard.setStatistics(5, wizard.itsStatistics(5) + 2);
            wizard.setSpeed(30);
            wizard.setExplorationTraits("<b>DARKVISION:</b> Thanks to your elf blood, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            wizard.setExplorationTraits("");
            wizard.setExplorationTraits("");
            wizard.setCombatTraits("<b>FEY ANCESTRY:</b> You have advantage on saving throws against being charmed, and magic can’t put you to sleep.");
            wizard.setCombatTraits("");
            wizard.setLanguages(0,1);
            wizard.setLanguages(2,1);
        }
        else if(klass.equals("warlock")){
            warlock.setRace("Halfelf");
            warlock.setStatistics(5, warlock.itsStatistics(5) + 2);
            warlock.setSpeed(30);
            warlock.setExplorationTraits("<b>DARKVISION:</b> Thanks to your elf blood, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            warlock.setExplorationTraits("");
            warlock.setExplorationTraits("");
            warlock.setCombatTraits("<b>FEY ANCESTRY:</b> You have advantage on saving throws against being charmed, and magic can’t put you to sleep.");
            warlock.setCombatTraits("");
            warlock.setLanguages(0,1);
            warlock.setLanguages(2,1);
        }
    }
}

