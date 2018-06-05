package com.apress.gerber.dnd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;

public class RockGnomeActivity extends AppCompatActivity {

    //Variables for Sweeper
    private ScrollView myLayout = null;
    private float x1;
    private float x2;
    private boolean beeingUsed = true;

    //end of SweepVariables
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock_gnome);
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
                    Intent newIntent = new Intent(getApplicationContext(), ForrestGnomeActivity.class);
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
                    /*
                    Intent newIntent = new Intent(getApplicationContext(), StoutHalflingActivity.class);
                    Bundle bundle = getIntent().getBundleExtra("bundle");
                    newIntent.putExtra("bundle", bundle);
                    newIntent.setFlags(newIntent.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                    startActivity(newIntent);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    beeingUsed = true;
                    */
                    return true;

                }
                return false;
            }
            //---End of sweeper---
        });
    }

    public void RockGnomeButton(View view) {
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
            barbarian.setRace("RockGnome");
            barbarian.setStatistics(3, barbarian.itsStatistics(3) + 1);
            barbarian.setExplorationTraits("<b>Artificer’s Lore:</b> Whenever you make an Intelligence (History) check related to magic items, alchemical objects, or technological devices, you can add twice your proficiency bonus, instead of any proficiency bonus you normally apply.");
            barbarian.setExplorationTraits("");
            barbarian.setExplorationTraits("");
            barbarian.setCombatTraits("<b>NATURALLY STEALTHY</b> You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you.");
            barbarian.setCombatTraits("");

        } else if (klass.equals("bard")) {
            bard.setRace("RockGnome");
            bard.setStatistics(3, bard.itsStatistics(3) + 1);
            bard.setExplorationTraits("<b>Artificer’s Lore:</b> Whenever you make an Intelligence (History) check related to magic items, alchemical objects, or technological devices, you can add twice your proficiency bonus, instead of any proficiency bonus you normally apply.");
            bard.setExplorationTraits("");
            bard.setExplorationTraits("");
            bard.setCombatTraits("<b>NATURALLY STEALTHY</b> You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you.");
            bard.setCombatTraits("");


        } else if (klass.equals("cleric")) {
            cleric.setRace("RockGnome");
            cleric.setStatistics(3, cleric.itsStatistics(3) + 1);
            cleric.setExplorationTraits("<b>Artificer’s Lore:</b> Whenever you make an Intelligence (History) check related to magic items, alchemical objects, or technological devices, you can add twice your proficiency bonus, instead of any proficiency bonus you normally apply.");
            cleric.setExplorationTraits("");
            cleric.setExplorationTraits("");
            cleric.setCombatTraits("<b>NATURALLY STEALTHY</b> You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you.");
            cleric.setCombatTraits("");


        } else if (klass.equals("druid")) {
            druid.setRace("RockGnome");
            druid.setStatistics(3, druid.itsStatistics(3) + 1);
            druid.setExplorationTraits("<b>Artificer’s Lore:</b> Whenever you make an Intelligence (History) check related to magic items, alchemical objects, or technological devices, you can add twice your proficiency bonus, instead of any proficiency bonus you normally apply.");
            druid.setExplorationTraits("");
            druid.setExplorationTraits("");
            druid.setCombatTraits("<b>NATURALLY STEALTHY</b> You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you.");
            druid.setCombatTraits("");


        } else if (klass.equals("fighter")) {
            fighter.setRace("RockGnome");
            fighter.setStatistics(3, fighter.itsStatistics(3) + 1);
            fighter.setExplorationTraits("<b>Artificer’s Lore:</b> Whenever you make an Intelligence (History) check related to magic items, alchemical objects, or technological devices, you can add twice your proficiency bonus, instead of any proficiency bonus you normally apply.");
            fighter.setExplorationTraits("");
            fighter.setExplorationTraits("");
            fighter.setCombatTraits("<b>NATURALLY STEALTHY</b> You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you.");
            fighter.setCombatTraits("");


        } else if (klass.equals("monk")) {
            monk.setRace("RockGnome");
            monk.setStatistics(3, monk.itsStatistics(3) + 1);
            monk.setExplorationTraits("<b>Artificer’s Lore:</b> Whenever you make an Intelligence (History) check related to magic items, alchemical objects, or technological devices, you can add twice your proficiency bonus, instead of any proficiency bonus you normally apply.");
            monk.setExplorationTraits("");
            monk.setExplorationTraits("");
            monk.setCombatTraits("<b>NATURALLY STEALTHY</b> You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you.");
            monk.setCombatTraits("");

        } else if (klass.equals("paladin")) {
            paladin.setRace("RockGnome");
            paladin.setStatistics(3, paladin.itsStatistics(3) + 1);
            paladin.setExplorationTraits("<b>Artificer’s Lore:</b> Whenever you make an Intelligence (History) check related to magic items, alchemical objects, or technological devices, you can add twice your proficiency bonus, instead of any proficiency bonus you normally apply.");
            paladin.setExplorationTraits("");
            paladin.setExplorationTraits("");
            paladin.setCombatTraits("<b>NATURALLY STEALTHY</b> You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you.");
            paladin.setCombatTraits("");


        } else if (klass.equals("ranger")) {
            ranger.setRace("RockGnome");
            ranger.setStatistics(3, ranger.itsStatistics(3) + 1);
            ranger.setExplorationTraits("<b>Artificer’s Lore:</b> Whenever you make an Intelligence (History) check related to magic items, alchemical objects, or technological devices, you can add twice your proficiency bonus, instead of any proficiency bonus you normally apply.");
            ranger.setExplorationTraits("");
            ranger.setExplorationTraits("");
            ranger.setCombatTraits("<b>NATURALLY STEALTHY</b> You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you.");
            ranger.setCombatTraits("");


        } else if (klass.equals("sorcerer")) {
            sorcerer.setRace("RockGnome");
            sorcerer.setStatistics(3, sorcerer.itsStatistics(3) + 1);
            sorcerer.setExplorationTraits("<b>Artificer’s Lore:</b> Whenever you make an Intelligence (History) check related to magic items, alchemical objects, or technological devices, you can add twice your proficiency bonus, instead of any proficiency bonus you normally apply.");
            sorcerer.setExplorationTraits("");
            sorcerer.setExplorationTraits("");
            sorcerer.setCombatTraits("<b>NATURALLY STEALTHY</b> You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you.");
            sorcerer.setCombatTraits("");


        } else if (klass.equals("rogue")) {
            rogue.setRace("RockGnome");
            rogue.setStatistics(3, rogue.itsStatistics(3) + 1);
            rogue.setExplorationTraits("<b>Artificer’s Lore:</b> Whenever you make an Intelligence (History) check related to magic items, alchemical objects, or technological devices, you can add twice your proficiency bonus, instead of any proficiency bonus you normally apply.");
            rogue.setExplorationTraits("");
            rogue.setExplorationTraits("");
            rogue.setCombatTraits("<b>NATURALLY STEALTHY</b> You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you.");
            rogue.setCombatTraits("");


        } else if (klass.equals("wizard")) {
            wizard.setRace("RockGnome");
            wizard.setStatistics(3, wizard.itsStatistics(3) + 1);
            wizard.setExplorationTraits("<b>Artificer’s Lore:</b> Whenever you make an Intelligence (History) check related to magic items, alchemical objects, or technological devices, you can add twice your proficiency bonus, instead of any proficiency bonus you normally apply.");
            wizard.setExplorationTraits("");
            wizard.setExplorationTraits("");
            wizard.setCombatTraits("<b>NATURALLY STEALTHY</b> You can attempt to hide even when you are obscured only by a creature that is at least one size larger than you.");
            wizard.setCombatTraits("");


        } else if (klass.equals("warlock")) {
            warlock.setRace("RockGnome");
            warlock.setStatistics(3, warlock.itsStatistics(3) + 1);
            warlock.setExplorationTraits("<b>Artificer’s Lore:</b> Whenever you make an Intelligence (History) check related to magic items, alchemical objects, or technological devices, you can add twice your proficiency bonus, instead of any proficiency bonus you normally apply.");
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