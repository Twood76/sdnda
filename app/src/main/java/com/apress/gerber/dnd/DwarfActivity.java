package com.apress.gerber.dnd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;

import java.io.Serializable;

public class DwarfActivity extends AppCompatActivity {
    //Variables for Sweeper
    private ScrollView myLayout = null;
    private float x1;
    private float x2;
    private boolean beeingUsed = true;
    //end of SweepVariables
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dwarf);
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
                    //Intent newIntent = new Intent(getApplicationContext(), BardActivity.class);
                    //startActivity(newIntent);
                    //overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                    //beeingUsed = true;
                    return true;


                }
                //next
                if (((x2 - x1) < 0) && (beeingUsed == false) && (Math.abs(x2 - x1) > 200)) {
                    Intent newIntent = new Intent(getApplicationContext(), ElfActivity.class);
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

    public void onDwarfSelectButton(View view) {
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
            barbarian.setRace("Dwarf");
            barbarian.setStatistics(2, barbarian.itsStatistics(2) + 2);
            barbarian.setSpeed(25);
            barbarian.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            barbarian.setExplorationTraits("<b>STONE CUNNING:</b> Whenever you make an Intelligence (History) check related to the origin of stonework, you are considered proficient in the History skill and add double your proficiency bonus to the check, instead of your normal proficiency bonus.");
            barbarian.setCombatTraits("<b>DWARVEN RESILENCE:</b> You have advantage on saving throws against poison, and you have resistance against poison damage (explained in chapter 9).");
            barbarian.setLanguages(0, 1);
            barbarian.setLanguages(1, 1);
            barbarian.setWeaponProfitiencys(15,1);
            barbarian.setWeaponProfitiencys(3,1);
            barbarian.setWeaponProfitiencys(5,1);
        } else if (klass.equals("bard")) {
            bard.setRace("Dwarf");
            bard.setStatistics(2, bard.itsStatistics(2) + 2);
            bard.setSpeed(25);
            bard.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            bard.setExplorationTraits("<b>STONE CUNNING:</b> Whenever you make an Intelligence (History) check related to the origin of stonework, you are considered proficient in the History skill and add double your proficiency bonus to the check, instead of your normal proficiency bonus.");
            bard.setCombatTraits("<b>DWARVEN RESILENCE:</b> You have advantage on saving throws against poison, and you have resistance against poison damage (explained in chapter 9).");
            bard.setLanguages(0, 1);
            bard.setLanguages(1, 1);
            bard.setWeaponProfitiencys(15,1);
            bard.setWeaponProfitiencys(3,1);
            bard.setWeaponProfitiencys(5,1);
        } else if (klass.equals("cleric")) {
            cleric.setRace("Dwarf");
            cleric.setStatistics(2, cleric.itsStatistics(2) + 2);
            cleric.setSpeed(25);
            cleric.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            cleric.setExplorationTraits("<b>STONE CUNNING:</b> Whenever you make an Intelligence (History) check related to the origin of stonework, you are considered proficient in the History skill and add double your proficiency bonus to the check, instead of your normal proficiency bonus.");
            cleric.setCombatTraits("<b>DWARVEN RESILENCE:</b> You have advantage on saving throws against poison, and you have resistance against poison damage (explained in chapter 9).");
            cleric.setLanguages(0, 1);
            cleric.setLanguages(1, 1);
            cleric.setWeaponProfitiencys(15,1);
            cleric.setWeaponProfitiencys(3,1);
            cleric.setWeaponProfitiencys(5,1);
        } else if (klass.equals("druid")) {
            druid.setRace("Dwarf");
            druid.setStatistics(2, druid.itsStatistics(2) + 2);
            druid.setSpeed(25);
            druid.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            druid.setExplorationTraits("<b>STONE CUNNING:</b> Whenever you make an Intelligence (History) check related to the origin of stonework, you are considered proficient in the History skill and add double your proficiency bonus to the check, instead of your normal proficiency bonus.");
            druid.setCombatTraits("<b>DWARVEN RESILENCE:</b> You have advantage on saving throws against poison, and you have resistance against poison damage (explained in chapter 9).");
            druid.setLanguages(0, 1);
            druid.setLanguages(1, 1);
            druid.setWeaponProfitiencys(15,1);
            druid.setWeaponProfitiencys(3,1);
            druid.setWeaponProfitiencys(5,1);
        } else if (klass.equals("fighter")) {
            fighter.setRace("Dwarf");
            fighter.setStatistics(2, fighter.itsStatistics(2) + 2);
            fighter.setSpeed(25);
            fighter.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            fighter.setExplorationTraits("<b>STONE CUNNING:</b> Whenever you make an Intelligence (History) check related to the origin of stonework, you are considered proficient in the History skill and add double your proficiency bonus to the check, instead of your normal proficiency bonus.");
            fighter.setCombatTraits("<b>DWARVEN RESILENCE:</b> You have advantage on saving throws against poison, and you have resistance against poison damage (explained in chapter 9).");
            fighter.setLanguages(0, 1);
            fighter.setLanguages(1, 1);
            fighter.setWeaponProfitiencys(15,1);
            fighter.setWeaponProfitiencys(3,1);
            fighter.setWeaponProfitiencys(5,1);
        } else if (klass.equals("monk")) {
            monk.setRace("Dwarf");
            monk.setStatistics(2, monk.itsStatistics(2) + 2);
            monk.setSpeed(25);
            monk.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            monk.setExplorationTraits("<b>STONE CUNNING:</b> Whenever you make an Intelligence (History) check related to the origin of stonework, you are considered proficient in the History skill and add double your proficiency bonus to the check, instead of your normal proficiency bonus.");
            monk.setCombatTraits("<b>DWARVEN RESILENCE:</b> You have advantage on saving throws against poison, and you have resistance against poison damage (explained in chapter 9).");
            monk.setLanguages(0, 1);
            monk.setLanguages(1, 1);
            monk.setWeaponProfitiencys(15,1);
            monk.setWeaponProfitiencys(3,1);
            monk.setWeaponProfitiencys(5,1);
        } else if (klass.equals("paladin")) {
            paladin.setRace("Dwarf");
            paladin.setStatistics(2, paladin.itsStatistics(2) + 2);
            paladin.setSpeed(25);
            paladin.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            paladin.setExplorationTraits("<b>STONE CUNNING:</b> Whenever you make an Intelligence (History) check related to the origin of stonework, you are considered proficient in the History skill and add double your proficiency bonus to the check, instead of your normal proficiency bonus.");
            paladin.setCombatTraits("<b>DWARVEN RESILENCE:</b> You have advantage on saving throws against poison, and you have resistance against poison damage (explained in chapter 9).");
            paladin.setLanguages(0, 1);
            paladin.setLanguages(1, 1);
            paladin.setWeaponProfitiencys(15,1);
            paladin.setWeaponProfitiencys(3,1);
            paladin.setWeaponProfitiencys(5,1);
        } else if (klass.equals("ranger")) {
            ranger.setRace("Dwarf");
            ranger.setStatistics(2, ranger.itsStatistics(2) + 2);
            ranger.setSpeed(25);
            ranger.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            ranger.setExplorationTraits("<b>STONE CUNNING:</b> Whenever you make an Intelligence (History) check related to the origin of stonework, you are considered proficient in the History skill and add double your proficiency bonus to the check, instead of your normal proficiency bonus.");
            ranger.setCombatTraits("<b>DWARVEN RESILENCE:</b> You have advantage on saving throws against poison, and you have resistance against poison damage (explained in chapter 9).");
            ranger.setLanguages(0, 1);
            ranger.setLanguages(1, 1);
            ranger.setWeaponProfitiencys(15,1);
            ranger.setWeaponProfitiencys(3,1);
            ranger.setWeaponProfitiencys(5,1);
        } else if (klass.equals("sorcerer")) {
            sorcerer.setRace("Dwarf");
            sorcerer.setStatistics(2, sorcerer.itsStatistics(2) + 2);
            sorcerer.setSpeed(25);
            sorcerer.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            sorcerer.setExplorationTraits("<b>STONE CUNNING:</b> Whenever you make an Intelligence (History) check related to the origin of stonework, you are considered proficient in the History skill and add double your proficiency bonus to the check, instead of your normal proficiency bonus.");
            sorcerer.setCombatTraits("<b>DWARVEN RESILENCE:</b> You have advantage on saving throws against poison, and you have resistance against poison damage (explained in chapter 9).");
            sorcerer.setLanguages(0, 1);
            sorcerer.setLanguages(1, 1);
            sorcerer.setWeaponProfitiencys(15,1);
            sorcerer.setWeaponProfitiencys(3,1);
            sorcerer.setWeaponProfitiencys(5,1);
        } else if (klass.equals("rogue")) {
            rogue.setRace("Dwarf");
            rogue.setStatistics(2, rogue.itsStatistics(2) + 2);
            rogue.setSpeed(25);
            rogue.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            rogue.setExplorationTraits("<b>STONE CUNNING:</b> Whenever you make an Intelligence (History) check related to the origin of stonework, you are considered proficient in the History skill and add double your proficiency bonus to the check, instead of your normal proficiency bonus.");
            rogue.setCombatTraits("<b>DWARVEN RESILENCE:</b> You have advantage on saving throws against poison, and you have resistance against poison damage (explained in chapter 9).");
            rogue.setLanguages(0, 1);
            rogue.setLanguages(1, 1);
            rogue.setWeaponProfitiencys(15,1);
            rogue.setWeaponProfitiencys(3,1);
            rogue.setWeaponProfitiencys(5,1);
        } else if (klass.equals("wizard")) {
            wizard.setRace("Dwarf");
            wizard.setStatistics(2, wizard.itsStatistics(2) + 2);
            wizard.setSpeed(25);
            wizard.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            wizard.setExplorationTraits("<b>STONE CUNNING:</b> Whenever you make an Intelligence (History) check related to the origin of stonework, you are considered proficient in the History skill and add double your proficiency bonus to the check, instead of your normal proficiency bonus.");
            wizard.setCombatTraits("<b>DWARVEN RESILENCE:</b> You have advantage on saving throws against poison, and you have resistance against poison damage (explained in chapter 9).");
            wizard.setLanguages(0, 1);
            wizard.setLanguages(1, 1);
            wizard.setWeaponProfitiencys(15,1);
            wizard.setWeaponProfitiencys(3,1);
            wizard.setWeaponProfitiencys(5,1);
        } else if (klass.equals("warlock")) {
            warlock.setRace("Dwarf");
            warlock.setStatistics(2, warlock.itsStatistics(2) + 2);
            warlock.setSpeed(25);
            warlock.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            warlock.setExplorationTraits("<b>STONE CUNNING:</b> Whenever you make an Intelligence (History) check related to the origin of stonework, you are considered proficient in the History skill and add double your proficiency bonus to the check, instead of your normal proficiency bonus.");
            warlock.setCombatTraits("<b>DWARVEN RESILENCE:</b> You have advantage on saving throws against poison, and you have resistance against poison damage (explained in chapter 9).");
            warlock.setLanguages(0, 1);
            warlock.setLanguages(1, 1);
            warlock.setWeaponProfitiencys(15,1);
            warlock.setWeaponProfitiencys(3,1);
            warlock.setWeaponProfitiencys(5,1);
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

        newIntent.putExtra("bundle", bundle);
        startActivity(newIntent);
    }


    


}

