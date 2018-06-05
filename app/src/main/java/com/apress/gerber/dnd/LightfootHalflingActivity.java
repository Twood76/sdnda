package com.apress.gerber.dnd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;

public class LightfootHalflingActivity extends AppCompatActivity {

    //Variables for Sweeper
    private ScrollView myLayout = null;
    private float x1;
    private float x2;
    private boolean beeingUsed = true;

    //end of SweepVariables
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lightfoot_halfling);
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
                    Intent newIntent = new Intent(getApplicationContext(), StoutHalflingActivity.class);
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

    public void lightfootButton(View view) {
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
            barbarian.setRace("LightfootHalfling");
            barbarian.setStatistics(5, barbarian.itsStatistics(5) + 1);
            barbarian.setExplorationTraits("<b>NATURALLY STEALTHY</b> You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you.");
            barbarian.setExplorationTraits("<b>Tinker</b> You have proficiency with artisan’s tools (tinker’s tools). Using those tools, you can spend 1 hour and 10 gp worth of materials to construct a Tiny clock work device (AC 5, 1 hp). The device ceases to function after 24 hours (unless you spend 1 hour repairing it to keep the device functioning), or when you use your action to dismantle it; at that time, you can reclaim the materials used to create it. You can have up to three such devices active at a time. When you create a device, choose one of the following options:\n" +
                    "        \n\t\t<b>-Clockwork Toy:</b> This toy is a clock work animal, monster, or person , such as a frog, mouse, bird, dragon, or soldier. When placed on the ground, the toy moves 5 feet across the ground on each of your turns in a random direction. It makes noises as appropriate to the creature it represents.\n" +
                    "        \n\t\t<b>-Fire Starter:</b> The device produces a miniature flame, which you can use to light a candle, torch, or campfire. U sing the device requires your action.\n" +
                    "        \n\t\t<b>-Music Box:</b>> When opened, this music box plays a single song at a moderate volume. The box stops playing when it reaches the songs end or when it is closed.");
            barbarian.setExplorationTraits("");
            barbarian.setCombatTraits("");
            barbarian.setCombatTraits("");

        } else if (klass.equals("bard")) {
            bard.setRace("LightfootHalfling");
            bard.setStatistics(5, bard.itsStatistics(5) + 1);
            bard.setExplorationTraits("<b>NATURALLY STEALTHY</b> You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you.");
            bard.setExplorationTraits("");
            bard.setExplorationTraits("");
            bard.setCombatTraits("<b>NATURALLY STEALTHY</b> You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you.");
            bard.setCombatTraits("");

        } else if (klass.equals("cleric")) {
            cleric.setRace("LightfootHalfling");
            cleric.setStatistics(5, cleric.itsStatistics(5) + 1);
            cleric.setExplorationTraits("<b>NATURALLY STEALTHY</b> You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you.");
            cleric.setExplorationTraits("");
            cleric.setExplorationTraits("");
            cleric.setCombatTraits("<b>NATURALLY STEALTHY</b> You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you.");
            cleric.setCombatTraits("");

        } else if (klass.equals("druid")) {
            druid.setRace("LightfootHalfling");
            druid.setStatistics(5, druid.itsStatistics(5) + 1);
            druid.setExplorationTraits("<b>NATURALLY STEALTHY</b> You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you.");
            druid.setExplorationTraits("");
            druid.setExplorationTraits("");
            druid.setCombatTraits("<b>NATURALLY STEALTHY</b> You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you.");
            druid.setCombatTraits("");

        } else if (klass.equals("fighter")) {
            fighter.setRace("LightfootHalfling");
            fighter.setStatistics(5, fighter.itsStatistics(5) + 1);
            fighter.setExplorationTraits("<b>NATURALLY STEALTHY</b> You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you.");
            fighter.setExplorationTraits("");
            fighter.setExplorationTraits("");
            fighter.setCombatTraits("<b>NATURALLY STEALTHY</b> You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you.");
            fighter.setCombatTraits("");

        } else if (klass.equals("monk")) {
            monk.setRace("LightfootHalfling");
            monk.setStatistics(5, monk.itsStatistics(5) + 1);
            monk.setExplorationTraits("<b>NATURALLY STEALTHY</b> You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you.");
            monk.setExplorationTraits("");
            monk.setExplorationTraits("");
            monk.setCombatTraits("<b>NATURALLY STEALTHY</b> You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you.");
            monk.setCombatTraits("");

        } else if (klass.equals("paladin")) {
            paladin.setRace("LightfootHalfling");
            paladin.setStatistics(5, paladin.itsStatistics(5) + 1);
            paladin.setExplorationTraits("<b>NATURALLY STEALTHY</b> You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you.");
            paladin.setExplorationTraits("");
            paladin.setExplorationTraits("");
            paladin.setCombatTraits("<b>NATURALLY STEALTHY</b> You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you.");
            paladin.setCombatTraits("");

        } else if (klass.equals("ranger")) {
            ranger.setRace("LightfootHalfling");
            ranger.setStatistics(5, ranger.itsStatistics(5) + 1);
            ranger.setExplorationTraits("<b>NATURALLY STEALTHY</b> You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you.");
            ranger.setExplorationTraits("");
            ranger.setExplorationTraits("");
            ranger.setCombatTraits("<b>NATURALLY STEALTHY</b> You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you.");
            ranger.setCombatTraits("");

        } else if (klass.equals("sorcerer")) {
            sorcerer.setRace("LightfootHalfling");
            sorcerer.setStatistics(5, sorcerer.itsStatistics(5) + 1);
            sorcerer.setExplorationTraits("<b>NATURALLY STEALTHY</b> You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you.");
            sorcerer.setExplorationTraits("");
            sorcerer.setExplorationTraits("");
            sorcerer.setCombatTraits("<b>NATURALLY STEALTHY</b> You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you.");
            sorcerer.setCombatTraits("");

        } else if (klass.equals("rogue")) {
            rogue.setRace("LightfootHalfling");
            rogue.setStatistics(5, rogue.itsStatistics(5) + 1);
            rogue.setExplorationTraits("<b>NATURALLY STEALTHY</b> You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you.");
            rogue.setExplorationTraits("");
            rogue.setExplorationTraits("");
            rogue.setCombatTraits("<b>NATURALLY STEALTHY</b> You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you.");
            rogue.setCombatTraits("");

        } else if (klass.equals("wizard")) {
            wizard.setRace("LightfootHalfling");
            wizard.setStatistics(5, wizard.itsStatistics(5) + 1);
            wizard.setExplorationTraits("<b>NATURALLY STEALTHY</b> You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you.");
            wizard.setExplorationTraits("");
            wizard.setExplorationTraits("");
            wizard.setCombatTraits("<b>NATURALLY STEALTHY</b> You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you.");
            wizard.setCombatTraits("");

        } else if (klass.equals("warlock")) {
            warlock.setRace("LightfootHalfling");
            warlock.setStatistics(5, warlock.itsStatistics(5) + 1);
            warlock.setExplorationTraits("<b>NATURALLY STEALTHY</b> You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you.");
            warlock.setExplorationTraits("");
            warlock.setExplorationTraits("");
            warlock.setCombatTraits("<b>NATURALLY STEALTHY</b> You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you.");
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