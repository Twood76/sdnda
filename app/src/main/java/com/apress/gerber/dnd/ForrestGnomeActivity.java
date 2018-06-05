package com.apress.gerber.dnd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;

public class ForrestGnomeActivity extends AppCompatActivity {

    //Variables for Sweeper
    private ScrollView myLayout = null;
    private float x1;
    private float x2;
    private boolean beeingUsed = true;

    //end of SweepVariables
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forrest_gnome);
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
                    /*Intent newIntent = new Intent(getApplicationContext(), WoodElfActivity.class);
                    Bundle bundle = getIntent().getBundleExtra("bundle");
                    newIntent.putExtra("bundle", bundle);
                    newIntent.setFlags(newIntent.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                    startActivity(newIntent);
                    overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                    beeingUsed = true;
                    */
                    return true;

                }
                //next
                if (((x2 - x1) < 0) && (beeingUsed == false) && (Math.abs(x2 - x1) > 200)) {
                    Intent newIntent = new Intent(getApplicationContext(), RockGnomeActivity.class);
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

    public void ForestGnomeButton(View view) {
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
            barbarian.setRace("ForestGnome");
            barbarian.setStatistics(1, barbarian.itsStatistics(1) + 1);
            barbarian.setExplorationTraits("<b>Speak with Small Beasts:</b> Through sounds and gestures, you can communicate simple ideas w ith Small or smaller beasts. Forest gnomes love animals and often keep squirrels, badgers, rabbits, moles, wood peckers, and other creatures as beloved pets.");
            barbarian.setExplorationTraits("");
            barbarian.setExplorationTraits("");
            barbarian.setCombatTraits("<b>Speak with Small Beasts:</b> Through sounds and gestures, you can communicate simple ideas w ith Small or smaller beasts. Forest gnomes love animals and often keep squirrels, badgers, rabbits, moles, wood peckers, and other creatures as beloved pets.");
            barbarian.setCombatTraits("");

        } else if (klass.equals("bard")) {
            bard.setRace("ForestGnome");
            bard.setStatistics(1, bard.itsStatistics(1) + 1);
            bard.setExplorationTraits("<b>Speak with Small Beasts:</b> Through sounds and gestures, you can communicate simple ideas w ith Small or smaller beasts. Forest gnomes love animals and often keep squirrels, badgers, rabbits, moles, wood peckers, and other creatures as beloved pets.");
            bard.setExplorationTraits("");
            bard.setExplorationTraits("");
            bard.setCombatTraits("<b>Speak with Small Beasts:</b> Through sounds and gestures, you can communicate simple ideas w ith Small or smaller beasts. Forest gnomes love animals and often keep squirrels, badgers, rabbits, moles, wood peckers, and other creatures as beloved pets.");
            bard.setCombatTraits("");

        } else if (klass.equals("cleric")) {
            cleric.setRace("ForestGnome");
            cleric.setStatistics(1, cleric.itsStatistics(1) + 1);
            cleric.setExplorationTraits("<b>Speak with Small Beasts:</b> Through sounds and gestures, you can communicate simple ideas w ith Small or smaller beasts. Forest gnomes love animals and often keep squirrels, badgers, rabbits, moles, wood peckers, and other creatures as beloved pets.");
            cleric.setExplorationTraits("");
            cleric.setExplorationTraits("");
            cleric.setCombatTraits("<b>Speak with Small Beasts:</b> Through sounds and gestures, you can communicate simple ideas w ith Small or smaller beasts. Forest gnomes love animals and often keep squirrels, badgers, rabbits, moles, wood peckers, and other creatures as beloved pets.");
            cleric.setCombatTraits("");

        } else if (klass.equals("druid")) {
            druid.setRace("ForestGnome");
            druid.setStatistics(1, druid.itsStatistics(1) + 1);
            druid.setExplorationTraits("<b>Speak with Small Beasts:</b> Through sounds and gestures, you can communicate simple ideas w ith Small or smaller beasts. Forest gnomes love animals and often keep squirrels, badgers, rabbits, moles, wood peckers, and other creatures as beloved pets.");
            druid.setExplorationTraits("");
            druid.setExplorationTraits("");
            druid.setCombatTraits("<b>Speak with Small Beasts:</b> Through sounds and gestures, you can communicate simple ideas w ith Small or smaller beasts. Forest gnomes love animals and often keep squirrels, badgers, rabbits, moles, wood peckers, and other creatures as beloved pets.");
            druid.setCombatTraits("");

        } else if (klass.equals("fighter")) {
            fighter.setRace("ForestGnome");
            fighter.setStatistics(1, fighter.itsStatistics(1) + 1);
            fighter.setExplorationTraits("<b>Speak with Small Beasts:</b> Through sounds and gestures, you can communicate simple ideas w ith Small or smaller beasts. Forest gnomes love animals and often keep squirrels, badgers, rabbits, moles, wood peckers, and other creatures as beloved pets.");
            fighter.setExplorationTraits("");
            fighter.setExplorationTraits("");
            fighter.setCombatTraits("<b>Speak with Small Beasts:</b> Through sounds and gestures, you can communicate simple ideas w ith Small or smaller beasts. Forest gnomes love animals and often keep squirrels, badgers, rabbits, moles, wood peckers, and other creatures as beloved pets.");
            fighter.setCombatTraits("");

        } else if (klass.equals("monk")) {
            monk.setRace("ForestGnome");
            monk.setStatistics(1, monk.itsStatistics(1) + 1);
            monk.setExplorationTraits("<b>Speak with Small Beasts:</b> Through sounds and gestures, you can communicate simple ideas w ith Small or smaller beasts. Forest gnomes love animals and often keep squirrels, badgers, rabbits, moles, wood peckers, and other creatures as beloved pets.");
            monk.setExplorationTraits("");
            monk.setExplorationTraits("");
            monk.setCombatTraits("<b>Speak with Small Beasts:</b> Through sounds and gestures, you can communicate simple ideas w ith Small or smaller beasts. Forest gnomes love animals and often keep squirrels, badgers, rabbits, moles, wood peckers, and other creatures as beloved pets.");
            monk.setCombatTraits("");

        } else if (klass.equals("paladin")) {
            paladin.setRace("ForestGnome");
            paladin.setStatistics(1, paladin.itsStatistics(1) + 1);
            paladin.setExplorationTraits("<b>Speak with Small Beasts:</b> Through sounds and gestures, you can communicate simple ideas w ith Small or smaller beasts. Forest gnomes love animals and often keep squirrels, badgers, rabbits, moles, wood peckers, and other creatures as beloved pets.");
            paladin.setExplorationTraits("");
            paladin.setExplorationTraits("");
            paladin.setCombatTraits("<b>Speak with Small Beasts:</b> Through sounds and gestures, you can communicate simple ideas w ith Small or smaller beasts. Forest gnomes love animals and often keep squirrels, badgers, rabbits, moles, wood peckers, and other creatures as beloved pets.");
            paladin.setCombatTraits("");

        } else if (klass.equals("ranger")) {
            ranger.setRace("ForestGnome");
            ranger.setStatistics(1, ranger.itsStatistics(1) + 1);
            ranger.setExplorationTraits("<b>Speak with Small Beasts:</b> Through sounds and gestures, you can communicate simple ideas w ith Small or smaller beasts. Forest gnomes love animals and often keep squirrels, badgers, rabbits, moles, wood peckers, and other creatures as beloved pets.");
            ranger.setExplorationTraits("");
            ranger.setExplorationTraits("");
            ranger.setCombatTraits("<b>Speak with Small Beasts:</b> Through sounds and gestures, you can communicate simple ideas w ith Small or smaller beasts. Forest gnomes love animals and often keep squirrels, badgers, rabbits, moles, wood peckers, and other creatures as beloved pets.");
            ranger.setCombatTraits("");

        } else if (klass.equals("sorcerer")) {
            sorcerer.setRace("ForestGnome");
            sorcerer.setStatistics(1, sorcerer.itsStatistics(1) + 1);
            sorcerer.setExplorationTraits("<b>Speak with Small Beasts:</b> Through sounds and gestures, you can communicate simple ideas w ith Small or smaller beasts. Forest gnomes love animals and often keep squirrels, badgers, rabbits, moles, wood peckers, and other creatures as beloved pets.");
            sorcerer.setExplorationTraits("");
            sorcerer.setExplorationTraits("");
            sorcerer.setCombatTraits("<b>Speak with Small Beasts:</b> Through sounds and gestures, you can communicate simple ideas w ith Small or smaller beasts. Forest gnomes love animals and often keep squirrels, badgers, rabbits, moles, wood peckers, and other creatures as beloved pets.");
            sorcerer.setCombatTraits("");

        } else if (klass.equals("rogue")) {
            rogue.setRace("ForestGnome");
            rogue.setStatistics(1, rogue.itsStatistics(1) + 1);
            rogue.setExplorationTraits("<b>Speak with Small Beasts:</b> Through sounds and gestures, you can communicate simple ideas w ith Small or smaller beasts. Forest gnomes love animals and often keep squirrels, badgers, rabbits, moles, wood peckers, and other creatures as beloved pets.");
            rogue.setExplorationTraits("");
            rogue.setExplorationTraits("");
            rogue.setCombatTraits("<b>Speak with Small Beasts:</b> Through sounds and gestures, you can communicate simple ideas w ith Small or smaller beasts. Forest gnomes love animals and often keep squirrels, badgers, rabbits, moles, wood peckers, and other creatures as beloved pets.");
            rogue.setCombatTraits("");

        } else if (klass.equals("wizard")) {
            wizard.setRace("ForestGnome");
            wizard.setStatistics(1, wizard.itsStatistics(1) + 1);
            wizard.setExplorationTraits("<b>Speak with Small Beasts:</b> Through sounds and gestures, you can communicate simple ideas w ith Small or smaller beasts. Forest gnomes love animals and often keep squirrels, badgers, rabbits, moles, wood peckers, and other creatures as beloved pets.");
            wizard.setExplorationTraits("");
            wizard.setExplorationTraits("");
            wizard.setCombatTraits("<b>Speak with Small Beasts:</b> Through sounds and gestures, you can communicate simple ideas w ith Small or smaller beasts. Forest gnomes love animals and often keep squirrels, badgers, rabbits, moles, wood peckers, and other creatures as beloved pets.");
            wizard.setCombatTraits("");

        } else if (klass.equals("warlock")) {
            warlock.setRace("ForestGnome");
            warlock.setStatistics(1, warlock.itsStatistics(1) + 1);
            warlock.setExplorationTraits("<b>Speak with Small Beasts:</b> Through sounds and gestures, you can communicate simple ideas w ith Small or smaller beasts. Forest gnomes love animals and often keep squirrels, badgers, rabbits, moles, wood peckers, and other creatures as beloved pets.");
            warlock.setExplorationTraits("");
            warlock.setExplorationTraits("");
            warlock.setCombatTraits("<b>Speak with Small Beasts:</b> Through sounds and gestures, you can communicate simple ideas w ith Small or smaller beasts. Forest gnomes love animals and often keep squirrels, badgers, rabbits, moles, wood peckers, and other creatures as beloved pets.");
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
