package com.apress.gerber.dnd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;

public class TieflingActivity extends AppCompatActivity {

    //Variables for Sweeper
    private ScrollView myLayout = null;
    private float x1;
    private float x2;
    private boolean beeingUsed = true;
    //end of SweepVariables

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiefling);

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
                    Intent newIntent = new Intent(getApplicationContext(), HalforcActivity.class);
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
                    //Intent newIntent = new Intent(getApplicationContext(), SorcererActivity.class);
                    //startActivity(newIntent);
                    //overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    beeingUsed = true;
                    return true;
                }
                return false;
            }
            //---End of sweeper---
        });
    }

    public void onTieflingSelectButton(View view) {
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
            barbarian.setStatistics(5, barbarian.itsStatistics(5) + 2);
            barbarian.setStatistics(3, barbarian.itsStatistics(3) + 1);
            barbarian.setSpeed(30);
            barbarian.setExplorationTraits("<b>DARKVISION:</b> Thanks to your infernal heritage, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            barbarian.setExplorationTraits("");
            barbarian.setExplorationTraits("");
            barbarian.setCombatTraits("<b>HELLISH RESISTANCE:</b>You have resistance to fire damage.");
            barbarian.setCombatTraits("");
            barbarian.setLanguages(0,1);
            barbarian.setLanguages(15,1);
        }
        else if(klass.equals("bard")){
            bard.setRace("Halfling");
            bard.setStatistics(5, bard.itsStatistics(5) + 2);
            bard.setStatistics(3, bard.itsStatistics(3) + 1);
            bard.setSpeed(30);
            bard.setExplorationTraits("<b>DARKVISION:</b> Thanks to your infernal heritage, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            bard.setExplorationTraits("");
            bard.setExplorationTraits("");
            bard.setCombatTraits("<b>HELLISH RESISTANCE:</b>You have resistance to fire damage.");
            bard.setCombatTraits("");
            bard.setLanguages(0,1);
            bard.setLanguages(15,1);
        }
        else if(klass.equals("cleric")){
            cleric.setRace("Halfling");
            cleric.setStatistics(5, cleric.itsStatistics(5) + 2);
            cleric.setStatistics(3, cleric.itsStatistics(3) + 1);
            cleric.setSpeed(30);
            cleric.setExplorationTraits("<b>DARKVISION:</b> Thanks to your infernal heritage, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            cleric.setExplorationTraits("");
            cleric.setExplorationTraits("");
            cleric.setCombatTraits("<b>HELLISH RESISTANCE:</b>You have resistance to fire damage.");
            cleric.setCombatTraits("");
            cleric.setLanguages(0,1);
            cleric.setLanguages(15,1);
        }
        else if(klass.equals("druid")){
            druid.setRace("Halfling");
            druid.setStatistics(5, druid.itsStatistics(5) + 2);
            druid.setStatistics(3, druid.itsStatistics(3) + 1);
            druid.setSpeed(30);
            druid.setExplorationTraits("<b>DARKVISION:</b> Thanks to your infernal heritage, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            druid.setExplorationTraits("");
            druid.setExplorationTraits("");
            druid.setCombatTraits("<b>HELLISH RESISTANCE:</b>You have resistance to fire damage.");
            druid.setCombatTraits("");
            druid.setLanguages(0,1);
            druid.setLanguages(15,1);
        }
        else if(klass.equals("fighter")){
            fighter.setRace("Halfling");
            fighter.setStatistics(5, fighter.itsStatistics(5) + 2);
            fighter.setStatistics(3, fighter.itsStatistics(3) + 1);
            fighter.setSpeed(30);
            fighter.setExplorationTraits("<b>DARKVISION:</b> Thanks to your infernal heritage, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            fighter.setExplorationTraits("");
            fighter.setExplorationTraits("");
            fighter.setCombatTraits("<b>HELLISH RESISTANCE:</b>You have resistance to fire damage.");
            fighter.setCombatTraits("");
            fighter.setLanguages(0,1);
            fighter.setLanguages(15,1);
        }
        else if(klass.equals("monk")){
            monk.setRace("Halfling");
            monk.setStatistics(5, monk.itsStatistics(5) + 2);
            monk.setStatistics(3, monk.itsStatistics(3) + 1);
            monk.setSpeed(30);
            monk.setExplorationTraits("<b>DARKVISION:</b> Thanks to your infernal heritage, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            monk.setExplorationTraits("");
            monk.setExplorationTraits("");
            monk.setCombatTraits("<b>HELLISH RESISTANCE:</b>You have resistance to fire damage.");
            monk.setCombatTraits("");
            monk.setLanguages(0,1);
            monk.setLanguages(15,1);
        }
        else if(klass.equals("paladin")){
            paladin.setRace("Halfling");
            paladin.setStatistics(5, paladin.itsStatistics(5) + 2);
            paladin.setStatistics(3, paladin.itsStatistics(3) + 1);
            paladin.setSpeed(30);
            paladin.setExplorationTraits("<b>DARKVISION:</b> Thanks to your infernal heritage, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            paladin.setExplorationTraits("");
            paladin.setExplorationTraits("");
            paladin.setCombatTraits("<b>HELLISH RESISTANCE:</b>You have resistance to fire damage.");
            paladin.setCombatTraits("");
            paladin.setLanguages(0,1);
            paladin.setLanguages(15,1);
        }
        else if(klass.equals("ranger")){
            ranger.setRace("Halfling");
            ranger.setStatistics(5, ranger.itsStatistics(5) + 2);
            ranger.setStatistics(3, ranger.itsStatistics(3) + 1);
            ranger.setSpeed(30);
            ranger.setExplorationTraits("<b>DARKVISION:</b> Thanks to your infernal heritage, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            ranger.setExplorationTraits("");
            ranger.setExplorationTraits("");
            ranger.setCombatTraits("<b>HELLISH RESISTANCE:</b>You have resistance to fire damage.");
            ranger.setCombatTraits("");
            ranger.setLanguages(0,1);
            ranger.setLanguages(15,1);
        }
        else if(klass.equals("sorcerer")){
            sorcerer.setRace("Halfling");
            sorcerer.setStatistics(5, sorcerer.itsStatistics(5) + 2);
            sorcerer.setStatistics(3, sorcerer.itsStatistics(3) + 1);
            sorcerer.setSpeed(30);
            sorcerer.setExplorationTraits("<b>DARKVISION:</b> Thanks to your infernal heritage, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            sorcerer.setExplorationTraits("");
            sorcerer.setExplorationTraits("");
            sorcerer.setCombatTraits("<b>HELLISH RESISTANCE:</b>You have resistance to fire damage.");
            sorcerer.setCombatTraits("");
            sorcerer.setLanguages(0,1);
            sorcerer.setLanguages(15,1);
        }
        else if(klass.equals("rogue")){
            rogue.setRace("Halfling");
            rogue.setStatistics(5, rogue.itsStatistics(5) + 2);
            rogue.setStatistics(3, rogue.itsStatistics(3) + 1);
            rogue.setSpeed(30);
            rogue.setExplorationTraits("<b>DARKVISION:</b> Thanks to your infernal heritage, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            rogue.setExplorationTraits("");
            rogue.setExplorationTraits("");
            rogue.setCombatTraits("<b>HELLISH RESISTANCE:</b>You have resistance to fire damage.");
            rogue.setCombatTraits("");
            rogue.setLanguages(0,1);
            rogue.setLanguages(15,1);
        }
        else if(klass.equals("wizard")){
            wizard.setRace("Halfling");
            wizard.setStatistics(5, wizard.itsStatistics(5) + 2);
            wizard.setStatistics(3, wizard.itsStatistics(3) + 1);
            wizard.setSpeed(30);
            wizard.setExplorationTraits("<b>DARKVISION:</b> Thanks to your infernal heritage, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            wizard.setExplorationTraits("");
            wizard.setExplorationTraits("");
            wizard.setCombatTraits("<b>HELLISH RESISTANCE:</b>You have resistance to fire damage.");
            wizard.setCombatTraits("");
            wizard.setLanguages(0,1);
            wizard.setLanguages(15,1);
        }
        else if(klass.equals("warlock")){
            warlock.setRace("Halfling");
            warlock.setStatistics(5, warlock.itsStatistics(5) + 2);
            warlock.setStatistics(3, warlock.itsStatistics(3) + 1);
            warlock.setSpeed(30);
            warlock.setExplorationTraits("<b>DARKVISION:</b> Thanks to your infernal heritage, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            warlock.setExplorationTraits("");
            warlock.setExplorationTraits("");
            warlock.setCombatTraits("<b>HELLISH RESISTANCE:</b>You have resistance to fire damage.");
            warlock.setCombatTraits("");
            warlock.setLanguages(0,1);
            warlock.setLanguages(15,1);
        }
    }
}
