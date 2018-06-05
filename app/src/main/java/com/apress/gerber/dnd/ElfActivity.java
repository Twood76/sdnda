package com.apress.gerber.dnd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;

public class ElfActivity extends AppCompatActivity {
    //Variables for Sweeper
    private ScrollView myLayout = null;
    private float x1;
    private float x2;
    private boolean beeingUsed = true;
    //end of SweepVariables
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elf);
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
                    Intent newIntent = new Intent(getApplicationContext(), DwarfActivity.class);
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
                    Intent newIntent = new Intent(getApplicationContext(), HalflingActivity.class);
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

    public void onElfAcceptButton(View view) {
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
            barbarian.setRace("Elf");
            barbarian.setStatistics(1, barbarian.itsStatistics(1) + 2);
            barbarian.setSpeed(30);
            barbarian.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            barbarian.setExplorationTraits("<b>KEEN SENSES:</b> You have proficiency in the Perception skill.");
            barbarian.setExplorationTraits("<b>TRANCE:</b> Elves don’t need to sleep. Instead, they meditate deeply, remaining semiconscious, for 4 hours a day. (The Common word for such meditation is “trance.”) While meditating, you can dream after a fashion; such dreams are actually mental exercises that have becom e reflexive through years of practice. After resting in this way, you gain the same benefit that a human does from 8 hours of sleep.");
            barbarian.setCombatTraits("<b>FEY ANCESTRY:</b> You have advantage on saving throws against being charmed, and magic can’t put you to sleep.");
            barbarian.setLanguages(0,1);
            barbarian.setLanguages(2,1);
        }
        else if(klass.equals("bard")){
            bard.setRace("Elf");
            bard.setStatistics(1, bard.itsStatistics(1) + 2);
            bard.setSpeed(30);
            bard.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            bard.setExplorationTraits("<b>KEEN SENSES:</b> You have proficiency in the Perception skill.");
            bard.setExplorationTraits("<b>TRANCE:</b> Elves don’t need to sleep. Instead, they meditate deeply, remaining semiconscious, for 4 hours a day. (The Common word for such meditation is “trance.”) While meditating, you can dream after a fashion; such dreams are actually mental exercises that have becom e reflexive through years of practice. After resting in this way, you gain the same benefit that a human does from 8 hours of sleep.");
            bard.setCombatTraits("<b>FEY ANCESTRY:</b> You have advantage on saving throws against being charmed, and magic can’t put you to sleep.");
            bard.setLanguages(0,1);
            bard.setLanguages(2,1);
        }
        else if(klass.equals("cleric")){
            cleric.setRace("Elf");
            cleric.setStatistics(1, cleric.itsStatistics(1) + 2);
            cleric.setSpeed(30);
            cleric.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            cleric.setExplorationTraits("<b>KEEN SENSES:</b> You have proficiency in the Perception skill.");
            cleric.setExplorationTraits("<b>TRANCE:</b> Elves don’t need to sleep. Instead, they meditate deeply, remaining semiconscious, for 4 hours a day. (The Common word for such meditation is “trance.”) While meditating, you can dream after a fashion; such dreams are actually mental exercises that have becom e reflexive through years of practice. After resting in this way, you gain the same benefit that a human does from 8 hours of sleep.");
            cleric.setCombatTraits("<b>FEY ANCESTRY:</b> You have advantage on saving throws against being charmed, and magic can’t put you to sleep.");
            cleric.setLanguages(0,1);
            cleric.setLanguages(2,1);
        }
        else if(klass.equals("druid")){
            druid.setRace("Elf");
            druid.setStatistics(1, druid.itsStatistics(1) + 2);
            druid.setSpeed(30);
            druid.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            druid.setExplorationTraits("<b>KEEN SENSES:</b> You have proficiency in the Perception skill.");
            druid.setExplorationTraits("<b>TRANCE:</b> Elves don’t need to sleep. Instead, they meditate deeply, remaining semiconscious, for 4 hours a day. (The Common word for such meditation is “trance.”) While meditating, you can dream after a fashion; such dreams are actually mental exercises that have becom e reflexive through years of practice. After resting in this way, you gain the same benefit that a human does from 8 hours of sleep.");
            druid.setCombatTraits("<b>FEY ANCESTRY:</b> You have advantage on saving throws against being charmed, and magic can’t put you to sleep.");
            druid.setLanguages(0,1);
            druid.setLanguages(2,1);
        }
        else if(klass.equals("fighter")){
            fighter.setRace("Elf");
            fighter.setStatistics(1, fighter.itsStatistics(1) + 2);
            fighter.setSpeed(30);
            fighter.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            fighter.setExplorationTraits("<b>KEEN SENSES:</b> You have proficiency in the Perception skill.");
            fighter.setExplorationTraits("<b>TRANCE:</b> Elves don’t need to sleep. Instead, they meditate deeply, remaining semiconscious, for 4 hours a day. (The Common word for such meditation is “trance.”) While meditating, you can dream after a fashion; such dreams are actually mental exercises that have becom e reflexive through years of practice. After resting in this way, you gain the same benefit that a human does from 8 hours of sleep.");
            fighter.setCombatTraits("<b>FEY ANCESTRY:</b> You have advantage on saving throws against being charmed, and magic can’t put you to sleep.");
            fighter.setLanguages(0,1);
            fighter.setLanguages(2,1);
        }
        else if(klass.equals("monk")){
            monk.setRace("Elf");
            monk.setStatistics(1, monk.itsStatistics(1) + 2);
            monk.setSpeed(30);
            monk.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            monk.setExplorationTraits("<b>KEEN SENSES:</b> You have proficiency in the Perception skill.");
            monk.setExplorationTraits("<b>TRANCE:</b> Elves don’t need to sleep. Instead, they meditate deeply, remaining semiconscious, for 4 hours a day. (The Common word for such meditation is “trance.”) While meditating, you can dream after a fashion; such dreams are actually mental exercises that have becom e reflexive through years of practice. After resting in this way, you gain the same benefit that a human does from 8 hours of sleep.");
            monk.setCombatTraits("<b>FEY ANCESTRY:</b> You have advantage on saving throws against being charmed, and magic can’t put you to sleep.");
            monk.setLanguages(0,1);
            monk.setLanguages(2,1);
        }
        else if(klass.equals("paladin")){
            paladin.setRace("Elf");
            paladin.setStatistics(1, paladin.itsStatistics(1) + 2);
            paladin.setSpeed(30);
            paladin.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            paladin.setExplorationTraits("<b>KEEN SENSES:</b> You have proficiency in the Perception skill.");
            paladin.setExplorationTraits("<b>TRANCE:</b> Elves don’t need to sleep. Instead, they meditate deeply, remaining semiconscious, for 4 hours a day. (The Common word for such meditation is “trance.”) While meditating, you can dream after a fashion; such dreams are actually mental exercises that have becom e reflexive through years of practice. After resting in this way, you gain the same benefit that a human does from 8 hours of sleep.");
            paladin.setCombatTraits("<b>FEY ANCESTRY:</b> You have advantage on saving throws against being charmed, and magic can’t put you to sleep.");
            paladin.setLanguages(0,1);
            paladin.setLanguages(2,1);
        }
        else if(klass.equals("ranger")){
            ranger.setRace("Elf");
            ranger.setStatistics(1, ranger.itsStatistics(1) + 2);
            ranger.setSpeed(30);
            ranger.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            ranger.setExplorationTraits("<b>KEEN SENSES:</b> You have proficiency in the Perception skill.");
            ranger.setExplorationTraits("<b>TRANCE:</b> Elves don’t need to sleep. Instead, they meditate deeply, remaining semiconscious, for 4 hours a day. (The Common word for such meditation is “trance.”) While meditating, you can dream after a fashion; such dreams are actually mental exercises that have becom e reflexive through years of practice. After resting in this way, you gain the same benefit that a human does from 8 hours of sleep.");
            ranger.setCombatTraits("<b>FEY ANCESTRY:</b> You have advantage on saving throws against being charmed, and magic can’t put you to sleep.");
            ranger.setLanguages(0,1);
            ranger.setLanguages(2,1);
        }
        else if(klass.equals("sorcerer")){
            sorcerer.setRace("Elf");
            sorcerer.setStatistics(1, sorcerer.itsStatistics(1) + 2);
            sorcerer.setSpeed(30);
            sorcerer.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            sorcerer.setExplorationTraits("<b>KEEN SENSES:</b> You have proficiency in the Perception skill.");
            sorcerer.setExplorationTraits("<b>TRANCE:</b> Elves don’t need to sleep. Instead, they meditate deeply, remaining semiconscious, for 4 hours a day. (The Common word for such meditation is “trance.”) While meditating, you can dream after a fashion; such dreams are actually mental exercises that have becom e reflexive through years of practice. After resting in this way, you gain the same benefit that a human does from 8 hours of sleep.");
            sorcerer.setCombatTraits("<b>FEY ANCESTRY:</b> You have advantage on saving throws against being charmed, and magic can’t put you to sleep.");
            sorcerer.setLanguages(0,1);
            sorcerer.setLanguages(2,1);
        }
        else if(klass.equals("rogue")){
            rogue.setRace("Elf");
            rogue.setStatistics(1, rogue.itsStatistics(1) + 2);
            rogue.setSpeed(30);
            rogue.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            rogue.setExplorationTraits("<b>KEEN SENSES:</b> You have proficiency in the Perception skill.");
            rogue.setExplorationTraits("<b>TRANCE:</b> Elves don’t need to sleep. Instead, they meditate deeply, remaining semiconscious, for 4 hours a day. (The Common word for such meditation is “trance.”) While meditating, you can dream after a fashion; such dreams are actually mental exercises that have becom e reflexive through years of practice. After resting in this way, you gain the same benefit that a human does from 8 hours of sleep.");
            rogue.setCombatTraits("<b>FEY ANCESTRY:</b> You have advantage on saving throws against being charmed, and magic can’t put you to sleep.");
            rogue.setLanguages(0,1);
            rogue.setLanguages(2,1);
        }
        else if(klass.equals("wizard")){
            wizard.setRace("Elf");
            wizard.setStatistics(1, wizard.itsStatistics(1) + 2);
            wizard.setSpeed(30);
            wizard.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            wizard.setExplorationTraits("<b>KEEN SENSES:</b> You have proficiency in the Perception skill.");
            wizard.setExplorationTraits("<b>TRANCE:</b> Elves don’t need to sleep. Instead, they meditate deeply, remaining semiconscious, for 4 hours a day. (The Common word for such meditation is “trance.”) While meditating, you can dream after a fashion; such dreams are actually mental exercises that have becom e reflexive through years of practice. After resting in this way, you gain the same benefit that a human does from 8 hours of sleep.");
            wizard.setCombatTraits("<b>FEY ANCESTRY:</b> You have advantage on saving throws against being charmed, and magic can’t put you to sleep.");
            wizard.setLanguages(0,1);
            wizard.setLanguages(2,1);
        }
        else if(klass.equals("warlock")){
            warlock.setRace("Elf");
            warlock.setStatistics(1, warlock.itsStatistics(1) + 2);
            warlock.setSpeed(30);
            warlock.setExplorationTraits("<b>DARKVISION:</b> Accustomed to life underground, you have superior vision in dark and dim conditions. You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can’t discern color in darkness, only shades of gray.");
            warlock.setExplorationTraits("<b>KEEN SENSES:</b> You have proficiency in the Perception skill.");
            warlock.setExplorationTraits("<b>TRANCE:</b> Elves don’t need to sleep. Instead, they meditate deeply, remaining semiconscious, for 4 hours a day. (The Common word for such meditation is “trance.”) While meditating, you can dream after a fashion; such dreams are actually mental exercises that have becom e reflexive through years of practice. After resting in this way, you gain the same benefit that a human does from 8 hours of sleep.");
            warlock.setCombatTraits("<b>FEY ANCESTRY:</b> You have advantage on saving throws against being charmed, and magic can’t put you to sleep.");
            warlock.setLanguages(0,1);
            warlock.setLanguages(2,1);
        }
        Intent newIntent = new Intent(this, HighElfActivity.class);
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

