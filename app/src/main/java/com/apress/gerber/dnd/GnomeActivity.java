package com.apress.gerber.dnd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;

public class GnomeActivity extends AppCompatActivity {
    //Variables for Sweeper
    private ScrollView myLayout = null;
    private float x1;
    private float x2;
    private boolean beeingUsed = true;
    //end of SweepVariables
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gnome);

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
                    Intent newIntent = new Intent(getApplicationContext(), DragonbornActivity.class);
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
                    Intent newIntent = new Intent(getApplicationContext(), HalfelfActivity.class);
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

    public void onGnomeSelectButton(View view) {
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
            barbarian.setRace("Gnome");
            barbarian.setStatistics(3, barbarian.itsStatistics(3) + 2);
            barbarian.setSpeed(25);
            barbarian.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            barbarian.setExplorationTraits("");
            barbarian.setExplorationTraits("");
            barbarian.setCombatTraits("<b>GNOME CUNNING:</b>  You have advantage on all Intelligence, Wisdom, and Charisma saving throws against magic.");
            barbarian.setCombatTraits("");
            barbarian.setLanguages(0,1);
            barbarian.setLanguages(4,1);
        }
        else if(klass.equals("bard")){
            bard.setRace("Gnome");
            bard.setStatistics(3, bard.itsStatistics(3) + 2);
            bard.setSpeed(25);
            bard.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            bard.setExplorationTraits("");
            bard.setExplorationTraits("");
            bard.setCombatTraits("<b>GNOME CUNNING:</b>  You have advantage on all Intelligence, Wisdom, and Charisma saving throws against magic.");
            bard.setCombatTraits("");
            bard.setLanguages(0,1);
            bard.setLanguages(4,1);
        }
        else if(klass.equals("cleric")){
            cleric.setRace("Gnome");
            cleric.setStatistics(3, cleric.itsStatistics(3) + 2);
            cleric.setSpeed(25);
            cleric.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            cleric.setExplorationTraits("");
            cleric.setExplorationTraits("");
            cleric.setCombatTraits("<b>GNOME CUNNING:</b>  You have advantage on all Intelligence, Wisdom, and Charisma saving throws against magic.");
            cleric.setCombatTraits("");
            cleric.setLanguages(0,1);
            cleric.setLanguages(4,1);
        }
        else if(klass.equals("druid")){
            druid.setRace("Gnome");
            druid.setStatistics(3, druid.itsStatistics(3) + 2);
            druid.setSpeed(25);
            druid.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            druid.setExplorationTraits("");
            druid.setExplorationTraits("");
            druid.setCombatTraits("<b>GNOME CUNNING:</b>  You have advantage on all Intelligence, Wisdom, and Charisma saving throws against magic.");
            druid.setCombatTraits("");
            druid.setLanguages(0,1);
            druid.setLanguages(4,1);
        }
        else if(klass.equals("fighter")){
            fighter.setRace("Gnome");
            fighter.setStatistics(3, fighter.itsStatistics(3) + 2);
            fighter.setSpeed(25);
            fighter.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            fighter.setExplorationTraits("");
            fighter.setExplorationTraits("");
            fighter.setCombatTraits("<b>GNOME CUNNING:</b>  You have advantage on all Intelligence, Wisdom, and Charisma saving throws against magic.");
            fighter.setCombatTraits("");
            fighter.setLanguages(0,1);
            fighter.setLanguages(4,1);
        }
        else if(klass.equals("monk")){
            monk.setRace("Gnome");
            monk.setStatistics(3, monk.itsStatistics(3) + 2);
            monk.setSpeed(25);
            monk.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            monk.setExplorationTraits("");
            monk.setExplorationTraits("");
            monk.setCombatTraits("<b>GNOME CUNNING:</b>  You have advantage on all Intelligence, Wisdom, and Charisma saving throws against magic.");
            monk.setCombatTraits("");
            monk.setLanguages(0,1);
            monk.setLanguages(4,1);
        }
        else if(klass.equals("paladin")){
            paladin.setRace("Gnome");
            paladin.setStatistics(3, paladin.itsStatistics(3) + 2);
            paladin.setSpeed(25);
            paladin.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            paladin.setExplorationTraits("");
            paladin.setExplorationTraits("");
            paladin.setCombatTraits("<b>GNOME CUNNING:</b>  You have advantage on all Intelligence, Wisdom, and Charisma saving throws against magic.");
            paladin.setCombatTraits("");
            paladin.setLanguages(0,1);
            paladin.setLanguages(4,1);
        }
        else if(klass.equals("ranger")){
            ranger.setRace("Gnome");
            ranger.setStatistics(3, ranger.itsStatistics(3) + 2);
            ranger.setSpeed(25);
            ranger.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            ranger.setExplorationTraits("");
            ranger.setExplorationTraits("");
            ranger.setCombatTraits("<b>GNOME CUNNING:</b>  You have advantage on all Intelligence, Wisdom, and Charisma saving throws against magic.");
            ranger.setCombatTraits("");
            ranger.setLanguages(0,1);
            ranger.setLanguages(4,1);
        }
        else if(klass.equals("sorcerer")){
            sorcerer.setRace("Gnome");
            sorcerer.setStatistics(3, sorcerer.itsStatistics(3) + 2);
            sorcerer.setSpeed(25);
            sorcerer.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            sorcerer.setExplorationTraits("");
            sorcerer.setExplorationTraits("");
            sorcerer.setCombatTraits("<b>GNOME CUNNING:</b>  You have advantage on all Intelligence, Wisdom, and Charisma saving throws against magic.");
            sorcerer.setCombatTraits("");
            sorcerer.setLanguages(0,1);
            sorcerer.setLanguages(4,1);
        }
        else if(klass.equals("rogue")){
            rogue.setRace("Gnome");
            rogue.setStatistics(3, rogue.itsStatistics(3) + 2);
            rogue.setSpeed(25);
            rogue.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            rogue.setExplorationTraits("");
            rogue.setExplorationTraits("");
            rogue.setCombatTraits("<b>GNOME CUNNING:</b>  You have advantage on all Intelligence, Wisdom, and Charisma saving throws against magic.");
            rogue.setCombatTraits("");
            rogue.setLanguages(0,1);
            rogue.setLanguages(4,1);
        }
        else if(klass.equals("wizard")){
            wizard.setRace("Gnome");
            wizard.setStatistics(3, wizard.itsStatistics(3) + 2);
            wizard.setSpeed(25);
            wizard.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            wizard.setExplorationTraits("");
            wizard.setExplorationTraits("");
            wizard.setCombatTraits("<b>GNOME CUNNING:</b>  You have advantage on all Intelligence, Wisdom, and Charisma saving throws against magic.");
            wizard.setCombatTraits("");
            wizard.setLanguages(0,1);
            wizard.setLanguages(4,1);
        }
        else if(klass.equals("warlock")){
            warlock.setRace("Gnome");
            warlock.setStatistics(3, warlock.itsStatistics(3) + 2);
            warlock.setSpeed(25);
            warlock.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            warlock.setExplorationTraits("");
            warlock.setExplorationTraits("");
            warlock.setCombatTraits("<b>GNOME CUNNING:</b>  You have advantage on all Intelligence, Wisdom, and Charisma saving throws against magic.");
            warlock.setCombatTraits("");
            warlock.setLanguages(0,1);
            warlock.setLanguages(4,1);
        }
        Intent newIntent = new Intent(this, ForrestGnomeActivity.class);
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
