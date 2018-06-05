package com.apress.gerber.dnd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;

public class DrowElfActivity extends AppCompatActivity {
    //Variables for Sweeper
    private ScrollView myLayout = null;
    private float x1;
    private float x2;
    private boolean beeingUsed = true;

    //end of SweepVariables
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drow_elf);
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
                    Intent newIntent = new Intent(getApplicationContext(), WoodElfActivity.class);
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
                    return true;
                    */
                }
                return false;
            }
            //---End of sweeper---
        });
    }

    public void onDrowElfSelectButton(View view) {
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
            barbarian.setRace("DrowElf");
            barbarian.setStatistics(5, barbarian.itsStatistics(5) + 1);
            barbarian.setWeaponProfitiencys(26,1);
            barbarian.setWeaponProfitiencys(28,1);
            barbarian.setWeaponProfitiencys(34,1);
            barbarian.setWeaponProfitiencys(35,1);
            barbarian.setExplorationTraits("<b>SUPERIOR DARKVISION: </b>Your darkvision has a radius of 120 feet.");
            barbarian.setExplorationTraits("<b>DROW MAGIC: </b>You know the dancing lights cantrip. When you reach 3rd level, you can cast the faerie fire spell once per day. When you reach 5th level, you can also cast the darkness spell once per day. Charisma is your spellcasting ability for these spells.");
            barbarian.setExplorationTraits("");
            barbarian.setCombatTraits("<b>DROW MAGIC: </b>You know the dancing lights cantrip. When you reach 3rd level, you can cast the faerie fire spell once per day. When you reach 5th level, you can also cast the darkness spell once per day. Charisma is your spellcasting ability for these spells.");
            barbarian.setCombatTraits("");

        } else if (klass.equals("bard")) {
            bard.setRace("DrowElf");
            bard.setStatistics(5, bard.itsStatistics(5) + 1);
            bard.setWeaponProfitiencys(26,1);
            bard.setWeaponProfitiencys(28,1);
            bard.setWeaponProfitiencys(34,1);
            bard.setWeaponProfitiencys(35,1);
            bard.setExplorationTraits("<b>SUPERIOR DARKVISION: </b>Your darkvision has a radius of 120 feet.");
            bard.setExplorationTraits("<b>DROW MAGIC: </b>You know the dancing lights cantrip. When you reach 3rd level, you can cast the faerie fire spell once per day. When you reach 5th level, you can also cast the darkness spell once per day. Charisma is your spellcasting ability for these spells.");
            bard.setExplorationTraits("");
            bard.setCombatTraits("<b>DROW MAGIC: </b>You know the dancing lights cantrip. When you reach 3rd level, you can cast the faerie fire spell once per day. When you reach 5th level, you can also cast the darkness spell once per day. Charisma is your spellcasting ability for these spells.");
            bard.setCombatTraits("");

        } else if (klass.equals("cleric")) {
            cleric.setRace("DrowElf");
            cleric.setStatistics(5, cleric.itsStatistics(5) + 1);
            cleric.setWeaponProfitiencys(26,1);
            cleric.setWeaponProfitiencys(28,1);
            cleric.setWeaponProfitiencys(34,1);
            cleric.setWeaponProfitiencys(35,1);
            cleric.setExplorationTraits("<b>SUPERIOR DARKVISION: </b>Your darkvision has a radius of 120 feet.");
            cleric.setExplorationTraits("<b>DROW MAGIC: </b>You know the dancing lights cantrip. When you reach 3rd level, you can cast the faerie fire spell once per day. When you reach 5th level, you can also cast the darkness spell once per day. Charisma is your spellcasting ability for these spells.");
            cleric.setExplorationTraits("");
            cleric.setCombatTraits("<b>DROW MAGIC: </b>You know the dancing lights cantrip. When you reach 3rd level, you can cast the faerie fire spell once per day. When you reach 5th level, you can also cast the darkness spell once per day. Charisma is your spellcasting ability for these spells.");
            cleric.setCombatTraits("");

        } else if (klass.equals("druid")) {
            druid.setRace("DrowElf");
            druid.setStatistics(5, druid.itsStatistics(5) + 1);
            druid.setWeaponProfitiencys(26,1);
            druid.setWeaponProfitiencys(28,1);
            druid.setWeaponProfitiencys(34,1);
            druid.setWeaponProfitiencys(35,1);
            druid.setExplorationTraits("<b>SUPERIOR DARKVISION: </b>Your darkvision has a radius of 120 feet.");
            druid.setExplorationTraits("<b>DROW MAGIC: </b>You know the dancing lights cantrip. When you reach 3rd level, you can cast the faerie fire spell once per day. When you reach 5th level, you can also cast the darkness spell once per day. Charisma is your spellcasting ability for these spells.");
            druid.setExplorationTraits("");
            druid.setCombatTraits("<b>DROW MAGIC: </b>You know the dancing lights cantrip. When you reach 3rd level, you can cast the faerie fire spell once per day. When you reach 5th level, you can also cast the darkness spell once per day. Charisma is your spellcasting ability for these spells.");
            druid.setCombatTraits("");

        } else if (klass.equals("fighter")) {
            fighter.setRace("DrowElf");
            fighter.setStatistics(5, fighter.itsStatistics(5) + 1);
            fighter.setWeaponProfitiencys(26,1);
            fighter.setWeaponProfitiencys(28,1);
            fighter.setWeaponProfitiencys(34,1);
            fighter.setWeaponProfitiencys(35,1);
            fighter.setExplorationTraits("<b>SUPERIOR DARKVISION: </b>Your darkvision has a radius of 120 feet.");
            fighter.setExplorationTraits("<b>DROW MAGIC: </b>You know the dancing lights cantrip. When you reach 3rd level, you can cast the faerie fire spell once per day. When you reach 5th level, you can also cast the darkness spell once per day. Charisma is your spellcasting ability for these spells.");
            fighter.setExplorationTraits("");
            fighter.setCombatTraits("<b>DROW MAGIC: </b>You know the dancing lights cantrip. When you reach 3rd level, you can cast the faerie fire spell once per day. When you reach 5th level, you can also cast the darkness spell once per day. Charisma is your spellcasting ability for these spells.");
            fighter.setCombatTraits("");

        } else if (klass.equals("monk")) {
            monk.setRace("DrowElf");
            monk.setStatistics(5, monk.itsStatistics(5) + 1);
            monk.setWeaponProfitiencys(26,1);
            monk.setWeaponProfitiencys(28,1);
            monk.setWeaponProfitiencys(34,1);
            monk.setWeaponProfitiencys(35,1);
            monk.setExplorationTraits("<b>SUPERIOR DARKVISION: </b>Your darkvision has a radius of 120 feet.");
            monk.setExplorationTraits("<b>DROW MAGIC: </b>You know the dancing lights cantrip. When you reach 3rd level, you can cast the faerie fire spell once per day. When you reach 5th level, you can also cast the darkness spell once per day. Charisma is your spellcasting ability for these spells.");
            monk.setExplorationTraits("");
            monk.setCombatTraits("<b>DROW MAGIC: </b>You know the dancing lights cantrip. When you reach 3rd level, you can cast the faerie fire spell once per day. When you reach 5th level, you can also cast the darkness spell once per day. Charisma is your spellcasting ability for these spells.");
            monk.setCombatTraits("");

        } else if (klass.equals("paladin")) {
            paladin.setRace("DrowElf");
            paladin.setStatistics(5, paladin.itsStatistics(5) + 1);
            paladin.setWeaponProfitiencys(26,1);
            paladin.setWeaponProfitiencys(28,1);
            paladin.setWeaponProfitiencys(34,1);
            paladin.setWeaponProfitiencys(35,1);
            paladin.setExplorationTraits("<b>SUPERIOR DARKVISION: </b>Your darkvision has a radius of 120 feet.");
            paladin.setExplorationTraits("<b>DROW MAGIC: </b>You know the dancing lights cantrip. When you reach 3rd level, you can cast the faerie fire spell once per day. When you reach 5th level, you can also cast the darkness spell once per day. Charisma is your spellcasting ability for these spells.");
            paladin.setExplorationTraits("");
            paladin.setCombatTraits("<b>DROW MAGIC: </b>You know the dancing lights cantrip. When you reach 3rd level, you can cast the faerie fire spell once per day. When you reach 5th level, you can also cast the darkness spell once per day. Charisma is your spellcasting ability for these spells.");
            paladin.setCombatTraits("");

        } else if (klass.equals("ranger")) {
            ranger.setRace("DrowElf");
            ranger.setStatistics(5, ranger.itsStatistics(5) + 1);
            ranger.setWeaponProfitiencys(26,1);
            ranger.setWeaponProfitiencys(28,1);
            ranger.setWeaponProfitiencys(34,1);
            ranger.setWeaponProfitiencys(35,1);
            ranger.setExplorationTraits("<b>SUPERIOR DARKVISION: </b>Your darkvision has a radius of 120 feet.");
            ranger.setExplorationTraits("<b>DROW MAGIC: </b>You know the dancing lights cantrip. When you reach 3rd level, you can cast the faerie fire spell once per day. When you reach 5th level, you can also cast the darkness spell once per day. Charisma is your spellcasting ability for these spells.");
            ranger.setExplorationTraits("");
            ranger.setCombatTraits("<b>DROW MAGIC: </b>You know the dancing lights cantrip. When you reach 3rd level, you can cast the faerie fire spell once per day. When you reach 5th level, you can also cast the darkness spell once per day. Charisma is your spellcasting ability for these spells.");
            ranger.setCombatTraits("");

        } else if (klass.equals("sorcerer")) {
            sorcerer.setRace("DrowElf");
            sorcerer.setStatistics(5, sorcerer.itsStatistics(5) + 1);
            sorcerer.setWeaponProfitiencys(26,1);
            sorcerer.setWeaponProfitiencys(28,1);
            sorcerer.setWeaponProfitiencys(34,1);
            sorcerer.setWeaponProfitiencys(35,1);
            sorcerer.setExplorationTraits("<b>SUPERIOR DARKVISION: </b>Your darkvision has a radius of 120 feet.");
            sorcerer.setExplorationTraits("<b>DROW MAGIC: </b>You know the dancing lights cantrip. When you reach 3rd level, you can cast the faerie fire spell once per day. When you reach 5th level, you can also cast the darkness spell once per day. Charisma is your spellcasting ability for these spells.");
            sorcerer.setExplorationTraits("");
            sorcerer.setCombatTraits("<b>DROW MAGIC: </b>You know the dancing lights cantrip. When you reach 3rd level, you can cast the faerie fire spell once per day. When you reach 5th level, you can also cast the darkness spell once per day. Charisma is your spellcasting ability for these spells.");
            sorcerer.setCombatTraits("");

        } else if (klass.equals("rogue")) {
            rogue.setRace("DrowElf");
            rogue.setStatistics(5, rogue.itsStatistics(5) + 1);
            rogue.setWeaponProfitiencys(26,1);
            rogue.setWeaponProfitiencys(28,1);
            rogue.setWeaponProfitiencys(34,1);
            rogue.setWeaponProfitiencys(35,1);
            rogue.setExplorationTraits("<b>SUPERIOR DARKVISION: </b>Your darkvision has a radius of 120 feet.");
            rogue.setExplorationTraits("<b>DROW MAGIC: </b>You know the dancing lights cantrip. When you reach 3rd level, you can cast the faerie fire spell once per day. When you reach 5th level, you can also cast the darkness spell once per day. Charisma is your spellcasting ability for these spells.");
            rogue.setExplorationTraits("");
            rogue.setCombatTraits("<b>DROW MAGIC: </b>You know the dancing lights cantrip. When you reach 3rd level, you can cast the faerie fire spell once per day. When you reach 5th level, you can also cast the darkness spell once per day. Charisma is your spellcasting ability for these spells.");
            rogue.setCombatTraits("");

        } else if (klass.equals("wizard")) {
            wizard.setRace("DrowElf");
            wizard.setStatistics(5, wizard.itsStatistics(5) + 1);
            wizard.setWeaponProfitiencys(26,1);
            wizard.setWeaponProfitiencys(28,1);
            wizard.setWeaponProfitiencys(34,1);
            wizard.setWeaponProfitiencys(35,1);
            wizard.setExplorationTraits("<b>SUPERIOR DARKVISION: </b>Your darkvision has a radius of 120 feet.");
            wizard.setExplorationTraits("<b>DROW MAGIC: </b>You know the dancing lights cantrip. When you reach 3rd level, you can cast the faerie fire spell once per day. When you reach 5th level, you can also cast the darkness spell once per day. Charisma is your spellcasting ability for these spells.");
            wizard.setExplorationTraits("");
            wizard.setCombatTraits("<b>DROW MAGIC: </b>You know the dancing lights cantrip. When you reach 3rd level, you can cast the faerie fire spell once per day. When you reach 5th level, you can also cast the darkness spell once per day. Charisma is your spellcasting ability for these spells.");
            wizard.setCombatTraits("");

        } else if (klass.equals("warlock")) {
            warlock.setRace("DrowElf");
            warlock.setStatistics(5, warlock.itsStatistics(5) + 1);
            warlock.setWeaponProfitiencys(26,1);
            warlock.setWeaponProfitiencys(28,1);
            warlock.setWeaponProfitiencys(34,1);
            warlock.setWeaponProfitiencys(35,1);
            warlock.setExplorationTraits("<b>SUPERIOR DARKVISION: </b>Your darkvision has a radius of 120 feet.");
            warlock.setExplorationTraits("<b>DROW MAGIC: </b>You know the dancing lights cantrip. When you reach 3rd level, you can cast the faerie fire spell once per day. When you reach 5th level, you can also cast the darkness spell once per day. Charisma is your spellcasting ability for these spells.");
            warlock.setExplorationTraits("");
            warlock.setCombatTraits("<b>DROW MAGIC: </b>You know the dancing lights cantrip. When you reach 3rd level, you can cast the faerie fire spell once per day. When you reach 5th level, you can also cast the darkness spell once per day. Charisma is your spellcasting ability for these spells.");
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