package com.apress.gerber.dnd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;

public class WoodElfActivity extends AppCompatActivity {
    //Variables for Sweeper
    private ScrollView myLayout = null;
    private float x1;
    private float x2;
    private boolean beeingUsed = true;

    //end of SweepVariables
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wood_elf);
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
                    Intent newIntent = new Intent(getApplicationContext(), HighElfActivity.class);
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
                    Intent newIntent = new Intent(getApplicationContext(), DrowElfActivity.class);
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

    public void onWoodElfSelectButton(View view) {
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
            barbarian.setRace("WoodElf");
            barbarian.setStatistics(4, barbarian.itsStatistics(4) + 1);
            barbarian.setWeaponProfitiencys(22,1);
            barbarian.setWeaponProfitiencys(28,1);
            barbarian.setWeaponProfitiencys(13,1);
            barbarian.setWeaponProfitiencys(36,1);
            barbarian.setSpeed(35);
            barbarian.setExplorationTraits("<b>MASK OF THE WILD: </b>Mask of the Wild. You can attempt to hide even when you are only lightly obscured by foliage, heavy rain, falling snow , mist, and other natural phenomena.");
            barbarian.setExplorationTraits("");
            barbarian.setExplorationTraits("");
            barbarian.setCombatTraits("");
            barbarian.setCombatTraits("");

        } else if (klass.equals("bard")) {
            bard.setRace("WoodElf");
            bard.setStatistics(4, bard.itsStatistics(4) + 1);
            bard.setWeaponProfitiencys(22,1);
            bard.setWeaponProfitiencys(28,1);
            bard.setWeaponProfitiencys(13,1);
            bard.setWeaponProfitiencys(36,1);
            bard.setSpeed(35);
            bard.setExplorationTraits("<b>MASK OF THE WILD: </b>Mask of the Wild. You can attempt to hide even when you are only lightly obscured by foliage, heavy rain, falling snow , mist, and other natural phenomena.");
            bard.setExplorationTraits("");
            bard.setExplorationTraits("");
            bard.setCombatTraits("");
            bard.setCombatTraits("");

        } else if (klass.equals("cleric")) {
            cleric.setRace("WoodElf");
            cleric.setStatistics(4, cleric.itsStatistics(4) + 1);
            cleric.setWeaponProfitiencys(22,1);
            cleric.setWeaponProfitiencys(28,1);
            cleric.setWeaponProfitiencys(13,1);
            cleric.setWeaponProfitiencys(36,1);
            cleric.setSpeed(35);
            cleric.setExplorationTraits("<b>MASK OF THE WILD: </b>Mask of the Wild. You can attempt to hide even when you are only lightly obscured by foliage, heavy rain, falling snow , mist, and other natural phenomena.");
            cleric.setExplorationTraits("");
            cleric.setExplorationTraits("");
            cleric.setCombatTraits("");
            cleric.setCombatTraits("");

        } else if (klass.equals("druid")) {
            druid.setRace("WoodElf");
            druid.setStatistics(4, druid.itsStatistics(4) + 1);
            druid.setWeaponProfitiencys(22,1);
            druid.setWeaponProfitiencys(28,1);
            druid.setWeaponProfitiencys(13,1);
            druid.setWeaponProfitiencys(36,1);
            druid.setSpeed(35);
            druid.setExplorationTraits("<b>MASK OF THE WILD: </b>Mask of the Wild. You can attempt to hide even when you are only lightly obscured by foliage, heavy rain, falling snow , mist, and other natural phenomena.");
            druid.setExplorationTraits("");
            druid.setExplorationTraits("");
            druid.setCombatTraits("");
            druid.setCombatTraits("");

        } else if (klass.equals("fighter")) {
            fighter.setRace("WoodElf");
            fighter.setStatistics(4, fighter.itsStatistics(4) + 1);
            fighter.setWeaponProfitiencys(22,1);
            fighter.setWeaponProfitiencys(28,1);
            fighter.setWeaponProfitiencys(13,1);
            fighter.setWeaponProfitiencys(36,1);
            fighter.setSpeed(35);
            fighter.setExplorationTraits("<b>MASK OF THE WILD: </b>Mask of the Wild. You can attempt to hide even when you are only lightly obscured by foliage, heavy rain, falling snow , mist, and other natural phenomena.");
            fighter.setExplorationTraits("");
            fighter.setExplorationTraits("");
            fighter.setCombatTraits("");
            fighter.setCombatTraits("");

        } else if (klass.equals("monk")) {
            monk.setRace("WoodElf");
            monk.setStatistics(4, monk.itsStatistics(4) + 1);
            monk.setWeaponProfitiencys(22,1);
            monk.setWeaponProfitiencys(28,1);
            monk.setWeaponProfitiencys(13,1);
            monk.setWeaponProfitiencys(36,1);
            monk.setSpeed(35);
            monk.setExplorationTraits("<b>MASK OF THE WILD: </b>Mask of the Wild. You can attempt to hide even when you are only lightly obscured by foliage, heavy rain, falling snow , mist, and other natural phenomena.");
            monk.setExplorationTraits("");
            monk.setExplorationTraits("");
            monk.setCombatTraits("");
            monk.setCombatTraits("");

        } else if (klass.equals("paladin")) {
            paladin.setRace("WoodElf");
            paladin.setStatistics(4, paladin.itsStatistics(4) + 1);
            paladin.setWeaponProfitiencys(22,1);
            paladin.setWeaponProfitiencys(28,1);
            paladin.setWeaponProfitiencys(13,1);
            paladin.setWeaponProfitiencys(36,1);
            paladin.setSpeed(35);
            paladin.setExplorationTraits("<b>MASK OF THE WILD: </b>Mask of the Wild. You can attempt to hide even when you are only lightly obscured by foliage, heavy rain, falling snow , mist, and other natural phenomena.");
            paladin.setExplorationTraits("");
            paladin.setExplorationTraits("");
            paladin.setCombatTraits("");
            paladin.setCombatTraits("");

        } else if (klass.equals("ranger")) {
            ranger.setRace("WoodElf");
            ranger.setStatistics(4, ranger.itsStatistics(4) + 1);
            ranger.setWeaponProfitiencys(22,1);
            ranger.setWeaponProfitiencys(28,1);
            ranger.setWeaponProfitiencys(13,1);
            ranger.setWeaponProfitiencys(36,1);
            ranger.setSpeed(35);
            ranger.setExplorationTraits("<b>MASK OF THE WILD: </b>Mask of the Wild. You can attempt to hide even when you are only lightly obscured by foliage, heavy rain, falling snow , mist, and other natural phenomena.");
            ranger.setExplorationTraits("");
            ranger.setExplorationTraits("");
            ranger.setCombatTraits("");
            ranger.setCombatTraits("");

        } else if (klass.equals("sorcerer")) {
            sorcerer.setRace("WoodElf");
            sorcerer.setStatistics(4, sorcerer.itsStatistics(4) + 1);
            sorcerer.setWeaponProfitiencys(22,1);
            sorcerer.setWeaponProfitiencys(28,1);
            sorcerer.setWeaponProfitiencys(13,1);
            sorcerer.setWeaponProfitiencys(36,1);
            sorcerer.setSpeed(35);
            sorcerer.setExplorationTraits("<b>MASK OF THE WILD: </b>Mask of the Wild. You can attempt to hide even when you are only lightly obscured by foliage, heavy rain, falling snow , mist, and other natural phenomena.");
            sorcerer.setExplorationTraits("");
            sorcerer.setExplorationTraits("");
            sorcerer.setCombatTraits("");
            sorcerer.setCombatTraits("");

        } else if (klass.equals("rogue")) {
            rogue.setRace("WoodElf");
            rogue.setStatistics(4, rogue.itsStatistics(4) + 1);
            rogue.setWeaponProfitiencys(22,1);
            rogue.setWeaponProfitiencys(28,1);
            rogue.setWeaponProfitiencys(13,1);
            rogue.setWeaponProfitiencys(36,1);
            rogue.setSpeed(35);
            rogue.setExplorationTraits("<b>MASK OF THE WILD: </b>Mask of the Wild. You can attempt to hide even when you are only lightly obscured by foliage, heavy rain, falling snow , mist, and other natural phenomena.");
            rogue.setExplorationTraits("");
            rogue.setExplorationTraits("");
            rogue.setCombatTraits("");
            rogue.setCombatTraits("");

        } else if (klass.equals("wizard")) {
            wizard.setRace("WoodElf");
            wizard.setStatistics(4, wizard.itsStatistics(4) + 1);
            wizard.setWeaponProfitiencys(22,1);
            wizard.setWeaponProfitiencys(28,1);
            wizard.setWeaponProfitiencys(13,1);
            wizard.setWeaponProfitiencys(36,1);
            wizard.setSpeed(35);
            wizard.setExplorationTraits("<b>MASK OF THE WILD: </b>Mask of the Wild. You can attempt to hide even when you are only lightly obscured by foliage, heavy rain, falling snow , mist, and other natural phenomena.");
            wizard.setExplorationTraits("");
            wizard.setExplorationTraits("");
            wizard.setCombatTraits("");
            wizard.setCombatTraits("");

        } else if (klass.equals("warlock")) {
            warlock.setRace("WoodElf");
            warlock.setStatistics(4, warlock.itsStatistics(4) + 1);
            warlock.setWeaponProfitiencys(22,1);
            warlock.setWeaponProfitiencys(28,1);
            warlock.setWeaponProfitiencys(13,1);
            warlock.setWeaponProfitiencys(36,1);
            warlock.setSpeed(35);
            warlock.setExplorationTraits("<b>MASK OF THE WILD: </b>Mask of the Wild. You can attempt to hide even when you are only lightly obscured by foliage, heavy rain, falling snow , mist, and other natural phenomena.");
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