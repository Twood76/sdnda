package com.apress.gerber.dnd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;

public class HighElfActivity extends AppCompatActivity {
    //Variables for Sweeper
    private ScrollView myLayout = null;
    private float x1;
    private float x2;
    private boolean beeingUsed = true;

    //end of SweepVariables
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_elf);
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
                   /* Intent newIntent = new Intent(getApplicationContext(), HillDwarfActivity.class);
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
                    Intent newIntent = new Intent(getApplicationContext(), WoodElfActivity.class);
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

    public void onHighElfSelectButton(View view) {
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
            barbarian.setRace("HighElf");
            barbarian.setStatistics(3, barbarian.itsStatistics(3) + 1);
            barbarian.setWeaponProfitiencys(22,1);
            barbarian.setWeaponProfitiencys(28,1);
            barbarian.setWeaponProfitiencys(13,1);
            barbarian.setWeaponProfitiencys(36,1);
            barbarian.setExplorationTraits("You know one cantrip of your choice from the wizard spell list. Intelligence is your spellcasting ability for it.");
            barbarian.setExplorationTraits("");
            barbarian.setExplorationTraits("");
            barbarian.setCombatTraits("You know one cantrip of your choice from the wizard spell list. Intelligence is your spellcasting ability for it.");
            barbarian.setCombatTraits("");
        } else if (klass.equals("bard")) {
            bard.setRace("HighElf");
            bard.setStatistics(3, bard.itsStatistics(3) + 1);
            bard.setWeaponProfitiencys(22,1);
            bard.setWeaponProfitiencys(28,1);
            bard.setWeaponProfitiencys(13,1);
            bard.setWeaponProfitiencys(36,1);
            bard.setExplorationTraits("You know one cantrip of your choice from the wizard spell list. Intelligence is your spellcasting ability for it.");
            bard.setExplorationTraits("");
            bard.setExplorationTraits("");
            bard.setCombatTraits("You know one cantrip of your choice from the wizard spell list. Intelligence is your spellcasting ability for it.");
            bard.setCombatTraits("");

        } else if (klass.equals("cleric")) {
            cleric.setRace("HighElf");
            cleric.setStatistics(3, cleric.itsStatistics(3) + 1);
            cleric.setWeaponProfitiencys(22,1);
            cleric.setWeaponProfitiencys(28,1);
            cleric.setWeaponProfitiencys(13,1);
            cleric.setWeaponProfitiencys(36,1);
            cleric.setExplorationTraits("You know one cantrip of your choice from the wizard spell list. Intelligence is your spellcasting ability for it.");
            cleric.setExplorationTraits("");
            cleric.setExplorationTraits("");
            cleric.setCombatTraits("You know one cantrip of your choice from the wizard spell list. Intelligence is your spellcasting ability for it.");
            cleric.setCombatTraits("");

        } else if (klass.equals("druid")) {
            druid.setRace("HighElf");
            druid.setStatistics(3, druid.itsStatistics(3) + 1);
            druid.setWeaponProfitiencys(22,1);
            druid.setWeaponProfitiencys(28,1);
            druid.setWeaponProfitiencys(13,1);
            druid.setWeaponProfitiencys(36,1);
            druid.setExplorationTraits("You know one cantrip of your choice from the wizard spell list. Intelligence is your spellcasting ability for it.");
            druid.setExplorationTraits("");
            druid.setExplorationTraits("");
            druid.setCombatTraits("You know one cantrip of your choice from the wizard spell list. Intelligence is your spellcasting ability for it.");
            druid.setCombatTraits("");

        } else if (klass.equals("fighter")) {
            fighter.setRace("HighElf");
            fighter.setStatistics(3, fighter.itsStatistics(3) + 1);
            fighter.setWeaponProfitiencys(22,1);
            fighter.setWeaponProfitiencys(28,1);
            fighter.setWeaponProfitiencys(13,1);
            fighter.setWeaponProfitiencys(36,1);
            fighter.setExplorationTraits("You know one cantrip of your choice from the wizard spell list. Intelligence is your spellcasting ability for it.");
            fighter.setExplorationTraits("");
            fighter.setExplorationTraits("");
            fighter.setCombatTraits("You know one cantrip of your choice from the wizard spell list. Intelligence is your spellcasting ability for it.");
            fighter.setCombatTraits("");

        } else if (klass.equals("monk")) {
            monk.setRace("HighElf");
            monk.setStatistics(3, monk.itsStatistics(3) + 1);
            monk.setWeaponProfitiencys(22,1);
            monk.setWeaponProfitiencys(28,1);
            monk.setWeaponProfitiencys(13,1);
            monk.setWeaponProfitiencys(36,1);
            monk.setExplorationTraits("You know one cantrip of your choice from the wizard spell list. Intelligence is your spellcasting ability for it.");
            monk.setExplorationTraits("");
            monk.setExplorationTraits("");
            monk.setCombatTraits("You know one cantrip of your choice from the wizard spell list. Intelligence is your spellcasting ability for it.");
            monk.setCombatTraits("");

        } else if (klass.equals("paladin")) {
            paladin.setRace("HighElf");
            paladin.setStatistics(3, paladin.itsStatistics(3) + 1);
            paladin.setWeaponProfitiencys(22,1);
            paladin.setWeaponProfitiencys(28,1);
            paladin.setWeaponProfitiencys(13,1);
            paladin.setWeaponProfitiencys(36,1);
            paladin.setExplorationTraits("You know one cantrip of your choice from the wizard spell list. Intelligence is your spellcasting ability for it.");
            paladin.setExplorationTraits("");
            paladin.setExplorationTraits("");
            paladin.setCombatTraits("You know one cantrip of your choice from the wizard spell list. Intelligence is your spellcasting ability for it.");
            paladin.setCombatTraits("");

        } else if (klass.equals("ranger")) {
            ranger.setRace("HighElf");
            ranger.setStatistics(3, ranger.itsStatistics(3) + 1);
            ranger.setWeaponProfitiencys(22,1);
            ranger.setWeaponProfitiencys(28,1);
            ranger.setWeaponProfitiencys(13,1);
            ranger.setWeaponProfitiencys(36,1);
            ranger.setExplorationTraits("You know one cantrip of your choice from the wizard spell list. Intelligence is your spellcasting ability for it.");
            ranger.setExplorationTraits("");
            ranger.setExplorationTraits("");
            ranger.setCombatTraits("You know one cantrip of your choice from the wizard spell list. Intelligence is your spellcasting ability for it.");
            ranger.setCombatTraits("");

        } else if (klass.equals("sorcerer")) {
            sorcerer.setRace("HighElf");
            sorcerer.setStatistics(3, sorcerer.itsStatistics(3) + 1);
            sorcerer.setWeaponProfitiencys(22,1);
            sorcerer.setWeaponProfitiencys(28,1);
            sorcerer.setWeaponProfitiencys(13,1);
            sorcerer.setWeaponProfitiencys(36,1);
            sorcerer.setExplorationTraits("You know one cantrip of your choice from the wizard spell list. Intelligence is your spellcasting ability for it.");
            sorcerer.setExplorationTraits("");
            sorcerer.setExplorationTraits("");
            sorcerer.setCombatTraits("You know one cantrip of your choice from the wizard spell list. Intelligence is your spellcasting ability for it.");
            sorcerer.setCombatTraits("");

        } else if (klass.equals("rogue")) {
            rogue.setRace("HighElf");
            rogue.setStatistics(3, rogue.itsStatistics(3) + 1);
            rogue.setWeaponProfitiencys(22,1);
            rogue.setWeaponProfitiencys(28,1);
            rogue.setWeaponProfitiencys(13,1);
            rogue.setWeaponProfitiencys(36,1);
            rogue.setExplorationTraits("You know one cantrip of your choice from the wizard spell list. Intelligence is your spellcasting ability for it.");
            rogue.setExplorationTraits("");
            rogue.setExplorationTraits("");
            rogue.setCombatTraits("You know one cantrip of your choice from the wizard spell list. Intelligence is your spellcasting ability for it.");
            rogue.setCombatTraits("");

        } else if (klass.equals("wizard")) {
            wizard.setRace("HighElf");
            wizard.setStatistics(3, wizard.itsStatistics(3) + 1);
            wizard.setWeaponProfitiencys(22,1);
            wizard.setWeaponProfitiencys(28,1);
            wizard.setWeaponProfitiencys(13,1);
            wizard.setWeaponProfitiencys(36,1);
            wizard.setExplorationTraits("You know one cantrip of your choice from the wizard spell list. Intelligence is your spellcasting ability for it.");
            wizard.setExplorationTraits("");
            wizard.setExplorationTraits("");
            wizard.setCombatTraits("You know one cantrip of your choice from the wizard spell list. Intelligence is your spellcasting ability for it.");
            wizard.setCombatTraits("");

        } else if (klass.equals("warlock")) {
            warlock.setRace("HighElf");
            warlock.setStatistics(3, warlock.itsStatistics(3) + 1);
            warlock.setWeaponProfitiencys(22,1);
            warlock.setWeaponProfitiencys(28,1);
            warlock.setWeaponProfitiencys(13,1);
            warlock.setWeaponProfitiencys(36,1);
            warlock.setExplorationTraits("You know one cantrip of your choice from the warlock spell list. Intelligence is your spellcasting ability for it.");
            warlock.setExplorationTraits("");
            warlock.setExplorationTraits("");
            warlock.setCombatTraits("You know one cantrip of your choice from the warlock spell list. Intelligence is your spellcasting ability for it.");
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


