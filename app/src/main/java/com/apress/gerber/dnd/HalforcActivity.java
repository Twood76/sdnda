package com.apress.gerber.dnd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;

public class HalforcActivity extends AppCompatActivity {
    //Variables for Sweeper
    private ScrollView myLayout = null;
    private float x1;
    private float x2;
    private boolean beeingUsed = true;
    //end of SweepVariables
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halforc);
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
                    Intent newIntent = new Intent(getApplicationContext(), HalfelfActivity.class);
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
                    Intent newIntent = new Intent(getApplicationContext(), TieflingActivity.class);
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

    public void onHalfOrcSelectButton(View view) {
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
            barbarian.setRace("HalfOrc");
            barbarian.setStatistics(0, barbarian.itsStatistics(0) + 2);
            barbarian.setStatistics(2, barbarian.itsStatistics(2) + 1);
            barbarian.setSkills(7,1);
            barbarian.setSpeed(30);
            barbarian.setExplorationTraits("<b>DARKVISION:</b> Thanks to your orc blood, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            barbarian.setExplorationTraits("");
            barbarian.setExplorationTraits("");
            barbarian.setCombatTraits("<b>RELENTLESS ENDURANCE:</b>  When you are reduced to 0 hit points but not killed outright, you can drop to 1 hit point instead. You can’t use this feature again until you finish a long rest.");
            barbarian.setCombatTraits("<b>SAVAGE ATTACKS:</b> When you score a critical hit with a melee weapon attack, you can roll one of the weapon’s damage dice one additional time and add it to the extra damage of the critical hit.");
            barbarian.setLanguages(0,1);
            barbarian.setLanguages(7,1);
        }
        else if(klass.equals("bard")){
            bard.setRace("HalfOrc");
            bard.setStatistics(0, bard.itsStatistics(0) + 2);
            bard.setStatistics(2, bard.itsStatistics(2) + 1);
            bard.setSkills(7,1);
            bard.setSpeed(30);
            bard.setExplorationTraits("<b>DARKVISION:</b> Thanks to your orc blood, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            bard.setExplorationTraits("");
            bard.setExplorationTraits("");
            bard.setCombatTraits("<b>RELENTLESS ENDURANCE:</b>  When you are reduced to 0 hit points but not killed outright, you can drop to 1 hit point instead. You can’t use this feature again until you finish a long rest.");
            bard.setCombatTraits("<b>SAVAGE ATTACKS:</b> When you score a critical hit with a melee weapon attack, you can roll one of the weapon’s damage dice one additional time and add it to the extra damage of the critical hit.");
            bard.setLanguages(0,1);
            bard.setLanguages(7,1);
        }
        else if(klass.equals("cleric")){
            cleric.setRace("HalfOrc");
            cleric.setStatistics(0, cleric.itsStatistics(0) + 2);
            cleric.setStatistics(2, cleric.itsStatistics(2) + 1);
            cleric.setSkills(7,1);
            cleric.setSpeed(30);
            cleric.setExplorationTraits("<b>DARKVISION:</b> Thanks to your orc blood, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            cleric.setExplorationTraits("");
            cleric.setExplorationTraits("");
            cleric.setCombatTraits("<b>RELENTLESS ENDURANCE:</b>  When you are reduced to 0 hit points but not killed outright, you can drop to 1 hit point instead. You can’t use this feature again until you finish a long rest.");
            cleric.setCombatTraits("<b>SAVAGE ATTACKS:</b> When you score a critical hit with a melee weapon attack, you can roll one of the weapon’s damage dice one additional time and add it to the extra damage of the critical hit.");
            cleric.setLanguages(0,1);
            cleric.setLanguages(7,1);
        }
        else if(klass.equals("druid")){
            druid.setRace("HalfOrc");
            druid.setStatistics(0, druid.itsStatistics(0) + 2);
            druid.setStatistics(2, druid.itsStatistics(2) + 1);
            druid.setSkills(7,1);
            druid.setSpeed(30);
            druid.setExplorationTraits("<b>DARKVISION:</b> Thanks to your orc blood, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            druid.setExplorationTraits("");
            druid.setExplorationTraits("");
            druid.setCombatTraits("<b>RELENTLESS ENDURANCE:</b>  When you are reduced to 0 hit points but not killed outright, you can drop to 1 hit point instead. You can’t use this feature again until you finish a long rest.");
            druid.setCombatTraits("<b>SAVAGE ATTACKS:</b> When you score a critical hit with a melee weapon attack, you can roll one of the weapon’s damage dice one additional time and add it to the extra damage of the critical hit.");
            druid.setLanguages(0,1);
            druid.setLanguages(7,1);
        }
        else if(klass.equals("fighter")){
            fighter.setRace("HalfOrc");
            fighter.setStatistics(0, fighter.itsStatistics(0) + 2);
            fighter.setStatistics(2, fighter.itsStatistics(2) + 1);
            fighter.setSkills(7,1);
            fighter.setSpeed(30);
            fighter.setExplorationTraits("<b>DARKVISION:</b> Thanks to your orc blood, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            fighter.setExplorationTraits("");
            fighter.setExplorationTraits("");
            fighter.setCombatTraits("<b>RELENTLESS ENDURANCE:</b>  When you are reduced to 0 hit points but not killed outright, you can drop to 1 hit point instead. You can’t use this feature again until you finish a long rest.");
            fighter.setCombatTraits("<b>SAVAGE ATTACKS:</b> When you score a critical hit with a melee weapon attack, you can roll one of the weapon’s damage dice one additional time and add it to the extra damage of the critical hit.");
            fighter.setLanguages(0,1);
            fighter.setLanguages(7,1);
        }
        else if(klass.equals("monk")){
            monk.setRace("HalfOrc");
            monk.setStatistics(0, monk.itsStatistics(0) + 2);
            monk.setStatistics(2, monk.itsStatistics(2) + 1);
            monk.setSkills(7,1);
            monk.setSpeed(30);
            monk.setExplorationTraits("<b>DARKVISION:</b> Thanks to your orc blood, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            monk.setExplorationTraits("");
            monk.setExplorationTraits("");
            monk.setCombatTraits("<b>RELENTLESS ENDURANCE:</b>  When you are reduced to 0 hit points but not killed outright, you can drop to 1 hit point instead. You can’t use this feature again until you finish a long rest.");
            monk.setCombatTraits("<b>SAVAGE ATTACKS:</b> When you score a critical hit with a melee weapon attack, you can roll one of the weapon’s damage dice one additional time and add it to the extra damage of the critical hit.");
            monk.setLanguages(0,1);
            monk.setLanguages(7,1);
        }
        else if(klass.equals("paladin")){
            paladin.setRace("HalfOrc");
            paladin.setStatistics(0, paladin.itsStatistics(0) + 2);
            paladin.setStatistics(2, paladin.itsStatistics(2) + 1);
            paladin.setSkills(7,1);
            paladin.setSpeed(30);
            paladin.setExplorationTraits("<b>DARKVISION:</b> Thanks to your orc blood, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            paladin.setExplorationTraits("");
            paladin.setExplorationTraits("");
            paladin.setCombatTraits("<b>RELENTLESS ENDURANCE:</b>  When you are reduced to 0 hit points but not killed outright, you can drop to 1 hit point instead. You can’t use this feature again until you finish a long rest.");
            paladin.setCombatTraits("<b>SAVAGE ATTACKS:</b> When you score a critical hit with a melee weapon attack, you can roll one of the weapon’s damage dice one additional time and add it to the extra damage of the critical hit.");
            paladin.setLanguages(0,1);
            paladin.setLanguages(7,1);
        }
        else if(klass.equals("ranger")){
            ranger.setRace("HalfOrc");
            ranger.setStatistics(0, ranger.itsStatistics(0) + 2);
            ranger.setStatistics(2, ranger.itsStatistics(2) + 1);
            ranger.setSkills(7,1);
            ranger.setSpeed(30);
            ranger.setExplorationTraits("<b>DARKVISION:</b> Thanks to your orc blood, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            ranger.setExplorationTraits("");
            ranger.setExplorationTraits("");
            ranger.setCombatTraits("<b>RELENTLESS ENDURANCE:</b>  When you are reduced to 0 hit points but not killed outright, you can drop to 1 hit point instead. You can’t use this feature again until you finish a long rest.");
            ranger.setCombatTraits("<b>SAVAGE ATTACKS:</b> When you score a critical hit with a melee weapon attack, you can roll one of the weapon’s damage dice one additional time and add it to the extra damage of the critical hit.");
            ranger.setLanguages(0,1);
            ranger.setLanguages(7,1);
        }
        else if(klass.equals("sorcerer")){
            sorcerer.setRace("HalfOrc");
            sorcerer.setStatistics(0, sorcerer.itsStatistics(0) + 2);
            sorcerer.setStatistics(2, sorcerer.itsStatistics(2) + 1);
            sorcerer.setSkills(7,1);
            sorcerer.setSpeed(30);
            sorcerer.setExplorationTraits("<b>DARKVISION:</b> Thanks to your orc blood, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            sorcerer.setExplorationTraits("");
            sorcerer.setExplorationTraits("");
            sorcerer.setCombatTraits("<b>RELENTLESS ENDURANCE:</b>  When you are reduced to 0 hit points but not killed outright, you can drop to 1 hit point instead. You can’t use this feature again until you finish a long rest.");
            sorcerer.setCombatTraits("<b>SAVAGE ATTACKS:</b> When you score a critical hit with a melee weapon attack, you can roll one of the weapon’s damage dice one additional time and add it to the extra damage of the critical hit.");
            sorcerer.setLanguages(0,1);
            sorcerer.setLanguages(7,1);
        }
        else if(klass.equals("rogue")){
            rogue.setRace("HalfOrc");
            rogue.setStatistics(0, rogue.itsStatistics(0) + 2);
            rogue.setStatistics(2, rogue.itsStatistics(2) + 1);
            rogue.setSkills(7,1);
            rogue.setSpeed(30);
            rogue.setExplorationTraits("<b>DARKVISION:</b> Thanks to your orc blood, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            rogue.setExplorationTraits("");
            rogue.setExplorationTraits("");
            rogue.setCombatTraits("<b>RELENTLESS ENDURANCE:</b>  When you are reduced to 0 hit points but not killed outright, you can drop to 1 hit point instead. You can’t use this feature again until you finish a long rest.");
            rogue.setCombatTraits("<b>SAVAGE ATTACKS:</b> When you score a critical hit with a melee weapon attack, you can roll one of the weapon’s damage dice one additional time and add it to the extra damage of the critical hit.");
            rogue.setLanguages(0,1);
            rogue.setLanguages(7,1);
        }
        else if(klass.equals("wizard")){
            wizard.setRace("HalfOrc");
            wizard.setStatistics(0, wizard.itsStatistics(0) + 2);
            wizard.setStatistics(2, wizard.itsStatistics(2) + 1);
            wizard.setSkills(7,1);
            wizard.setSpeed(30);
            wizard.setExplorationTraits("<b>DARKVISION:</b> Thanks to your orc blood, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            wizard.setExplorationTraits("");
            wizard.setExplorationTraits("");
            wizard.setCombatTraits("<b>RELENTLESS ENDURANCE:</b>  When you are reduced to 0 hit points but not killed outright, you can drop to 1 hit point instead. You can’t use this feature again until you finish a long rest.");
            wizard.setCombatTraits("<b>SAVAGE ATTACKS:</b> When you score a critical hit with a melee weapon attack, you can roll one of the weapon’s damage dice one additional time and add it to the extra damage of the critical hit.");
            wizard.setLanguages(0,1);
            wizard.setLanguages(7,1);
        }
        else if(klass.equals("warlock")){
            warlock.setRace("HalfOrc");
            warlock.setStatistics(0, warlock.itsStatistics(0) + 2);
            warlock.setStatistics(2, warlock.itsStatistics(2) + 1);
            warlock.setSkills(7,1);
            warlock.setSpeed(30);
            warlock.setExplorationTraits("<b>DARKVISION:</b> Thanks to your orc blood, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            warlock.setExplorationTraits("");
            warlock.setExplorationTraits("");
            warlock.setCombatTraits("<b>RELENTLESS ENDURANCE:</b>  When you are reduced to 0 hit points but not killed outright, you can drop to 1 hit point instead. You can’t use this feature again until you finish a long rest.");
            warlock.setCombatTraits("<b>SAVAGE ATTACKS:</b> When you score a critical hit with a melee weapon attack, you can roll one of the weapon’s damage dice one additional time and add it to the extra damage of the critical hit.");
            warlock.setLanguages(0,1);
            warlock.setLanguages(7,1);
        }
    }
}
