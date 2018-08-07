package com.apress.gerber.dnd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class ClassFeatures extends AppCompatActivity {

    //Variables for Sweeper
    private float x1;
    private float x2;
    private float y1;
    private float y2;
    private boolean beeingUsed = true;
    private String whichClass = "asd";
    ScrollView myLayout = null;
    //end of SweepVariables

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_features);
        whichClass = getIntent().getStringExtra("whichClass");

        TextView activityTitle = findViewById(R.id.ActivityTitle);
        TextView titleDescription = findViewById(R.id.titleDescription);
        TextView Hp = findViewById(R.id.hitPointsDescription);
        TextView profitiency = findViewById(R.id.profitienciesDescription);
        TextView eq = findViewById(R.id.eqDescription);

        Button previousButton = findViewById(R.id.previousButton);
        Button nextButton = findViewById(R.id.nextButton);

        switch (whichClass) {
            case("barbarian"):
                //title
                activityTitle.setText(R.string.barbarian);
                titleDescription.setText(R.string.barbarianFeaturesTitleDescription);
                //Hp
                Hp.setText(R.string.barbarianHp);
               //Profitiency
                profitiency.setText(R.string.barbarianProfitiencysDescription);
                //Eq
                eq.setText(R.string.barbarianEquipment);

                //hidePreviousButton
                previousButton.setVisibility(View.INVISIBLE);
                break;

            case("bard"):
                //title
                activityTitle.setText(R.string.bard);
                titleDescription.setText(R.string.bardFeaturesTitleDescription);
                //Hp
                Hp.setText(R.string.barbarianHp);
                //Profitiency
                profitiency.setText(R.string.bardProfitiencysDescription);
                //Eq
                eq.setText(R.string.bardEquipment);
                break;

            case("cleric"):
                //title
                activityTitle.setText(R.string.cleric);
                titleDescription.setText(R.string.clericFeaturesTitleDescription);
                //Hp
                Hp.setText(R.string.barbarianHp);
                //Profitiency
                profitiency.setText(R.string.clericProfitiencysDescription);
                //Eq
                eq.setText(R.string.clericEquipment);
                break;

            case("druid"):
                //title
                activityTitle.setText(R.string.druid);
                titleDescription.setText(R.string.druidFeaturesTitleDescription);
                //Hp
                Hp.setText(R.string.barbarianHp);
                //Profitiency
                profitiency.setText(R.string.druidProfitiencysDescription);
                //Eq
                eq.setText(R.string.druidEquipment);
                break;

            case("fighter"):
                //title
                activityTitle.setText(R.string.fighter);
                titleDescription.setText(R.string.fighterFeaturesTitleDescription);
                //Hp
                Hp.setText(R.string.barbarianHp);
                //Profitiency
                profitiency.setText(R.string.fighterProfitiencysDescription);
                //Eq
                eq.setText(R.string.fighterEquipment);
                break;

            case("monk"):
                //title
                activityTitle.setText(R.string.monk);
                titleDescription.setText(R.string.monkFeaturesTitleDescription);
                //Hp
                Hp.setText(R.string.barbarianHp);
                //Profitiency
                profitiency.setText(R.string.monkProfitiencysDescription);
                //Eq
                eq.setText(R.string.monkEquipment);
                break;

            case("paladin"):
                //title
                activityTitle.setText(R.string.paladin);
                titleDescription.setText(R.string.paladinFeaturesTitleDescription);
                //Hp
                Hp.setText(R.string.barbarianHp);
                //Profitiency
                profitiency.setText(R.string.paladinProfitiencysDescription);
                //Eq
                eq.setText(R.string.paladinEquipment);
                break;

            case("ranger"):
                //title
                activityTitle.setText(R.string.ranger);
                titleDescription.setText(R.string.rangerFeaturesTitleDescription);
                //Hp
                Hp.setText(R.string.barbarianHp);
                //Profitiency
                profitiency.setText(R.string.rangerProfitiencysDescription);
                //Eq
                eq.setText(R.string.rangerEquipment);
                break;

            case("rogue"):
                //title
                activityTitle.setText(R.string.rogue);
                titleDescription.setText(R.string.rogueFeaturesTitleDescription);
                //Hp
                Hp.setText(R.string.barbarianHp);
                //Profitiency
                profitiency.setText(R.string.rogueProfitiencysDescription);
                //Eq
                eq.setText(R.string.rogueEquipment);
                break;

            case("sorcerer"):
                //title
                activityTitle.setText(R.string.sorcerer);
                titleDescription.setText(R.string.sorcererFeaturesTitleDescription);
                //Hp
                Hp.setText(R.string.barbarianHp);
                //Profitiency
                profitiency.setText(R.string.sorcererProfitiencysDescription);
                //Eq
                eq.setText(R.string.sorcererEquipment);
                break;

            case("warlock"):
                //title
                activityTitle.setText(R.string.warlock);
                titleDescription.setText(R.string.warlockFeaturesTitleDescription);
                //Hp
                Hp.setText(R.string.barbarianHp);
                //Profitiency
                profitiency.setText(R.string.warlockProfitiencysDescription);
                //Eq
                eq.setText(R.string.warlockEquipment);
                break;

            case("wizard"):
                //title
                activityTitle.setText(R.string.wizard);
                titleDescription.setText(R.string.wizardFeaturesTitleDescription);
                //Hp
                Hp.setText(R.string.barbarianHp);
                //Profitiency
                profitiency.setText(R.string.wizardProfitiencysDescription);
                //Eq
                eq.setText(R.string.wizardEquipment);
                break;
        }



        myLayout = findViewById(R.id.scrollId);
        myLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                view.performClick();
                if ((motionEvent.getAction() == MotionEvent.ACTION_DOWN)) {
                    x1 = motionEvent.getX();
                    y1 = motionEvent.getY();
                    beeingUsed = true;
                }
                if ((motionEvent.getAction() == MotionEvent.ACTION_UP)) {
                    x2 = motionEvent.getX();
                    y2 = motionEvent.getY();
                    beeingUsed = false;
                }
                //previous
                if (((x2 - x1) > 0) && !beeingUsed && (Math.abs(x2 - x1) > 300) && (Math.abs(y2 - y1) < 300)) {
                    Intent newIntent = new Intent(getApplicationContext(), ClassAbiltiesOverview.class);
                    newIntent.setFlags(newIntent.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                    switch(whichClass){
                        case("barbarian"):
                            newIntent.putExtra("whichClass", whichClass);
                            break;

                        case("bard"):
                            newIntent.putExtra("whichClass", whichClass);
                            break;

                        case("cleric"):
                            newIntent.putExtra("whichClass", whichClass);
                            break;

                        case("druid"):
                            newIntent.putExtra("whichClass", whichClass);
                            break;

                        case("fighter"):
                            newIntent.putExtra("whichClass", whichClass);
                            break;

                        case("monk"):
                            newIntent.putExtra("whichClass", whichClass);
                            break;

                        case("paladin"):
                            newIntent.putExtra("whichClass", whichClass);
                            break;

                        case("ranger"):
                            newIntent.putExtra("whichClass", whichClass);
                            break;

                        case("rogue"):
                            newIntent.putExtra("whichClass", whichClass);
                            break;

                        case("sorcerer"):
                            newIntent.putExtra("whichClass", whichClass);
                            break;

                        case("warlock"):
                            newIntent.putExtra("whichClass", whichClass);
                            break;

                        case("wizard"):
                            newIntent.putExtra("whichClass", whichClass);
                            break;
                    }
                    startActivity(newIntent);
                    overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                }
                //next
                if (((x2 - x1) < 0) && !beeingUsed  && (Math.abs(x2 - x1) > 300) && (Math.abs(y2 - y1) < 300)) {
                    Intent newIntent = new Intent(getApplicationContext(), ClassAbilitiesListActivity.class);
                    newIntent.setFlags(newIntent.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                    switch(whichClass){
                        case("barbarian"):
                            newIntent.putExtra("whichClass", whichClass);
                            break;

                        case("bard"):
                            newIntent.putExtra("whichClass", whichClass);
                            break;

                        case("cleric"):
                            newIntent.putExtra("whichClass", whichClass);
                            break;

                        case("druid"):
                            newIntent.putExtra("whichClass", whichClass);
                            break;

                        case("fighter"):
                            newIntent.putExtra("whichClass", whichClass);
                            break;

                        case("monk"):
                            newIntent.putExtra("whichClass", whichClass);
                            break;

                        case("paladin"):
                            newIntent.putExtra("whichClass", whichClass);
                            break;

                        case("ranger"):
                            newIntent.putExtra("whichClass", whichClass);
                            break;

                        case("rogue"):
                            newIntent.putExtra("whichClass", whichClass);
                            break;

                        case("sorcerer"):
                            newIntent.putExtra("whichClass", whichClass);
                            break;

                        case("warlock"):
                            newIntent.putExtra("whichClass", whichClass);
                            break;

                        case("wizard"):
                            newIntent.putExtra("whichClass", whichClass);
                            break;
                    }
                    startActivity(newIntent);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }
                return false;
            }
            //---End of sweeper---
        });
    }

    public void onChooseButtonclick(View view) {
        if(whichClass.equals("barbarian")){
            Intent i = new Intent(this, RollStatsActivity.class);
            String klasa = "Barbarian";
            String mainStats = "Strength/Constitution";
            i.putExtra("klasa", klasa);
            i.putExtra("mainStats", mainStats);
            startActivity(i);
        }
    }

    public void onNextButton(View view) {
        Intent newIntent = new Intent(getApplicationContext(), ClassFeatures.class);

        switch(whichClass){
            case("barbarian"):
                whichClass = "bard";
                newIntent.putExtra("whichClass", whichClass);
                break;

            case("bard"):
                whichClass = "cleric";
                newIntent.putExtra("whichClass", whichClass);
                break;

            case("cleric"):
                whichClass = "druid";
                newIntent.putExtra("whichClass", whichClass);
                break;

            case("druid"):
                whichClass = "fighter";
                newIntent.putExtra("whichClass", whichClass);
                break;

            case("fighter"):
                whichClass = "monk";
                newIntent.putExtra("whichClass", whichClass);
                break;

            case("monk"):
                whichClass = "paladin";
                newIntent.putExtra("whichClass", whichClass);
                break;

            case("paladin"):
                whichClass = "ranger";
                newIntent.putExtra("whichClass", whichClass);
                break;

            case("ranger"):
                whichClass = "rogue";
                newIntent.putExtra("whichClass", whichClass);
                break;

            case("rogue"):
                whichClass = "sorcerer";
                newIntent.putExtra("whichClass", whichClass);
                break;

            case("sorcerer"):
                whichClass = "warlock";
                newIntent.putExtra("whichClass", whichClass);
                break;


            case("warlock"):
                whichClass = "wizard";
                newIntent.putExtra("whichClass", whichClass);
                break;
        }
        startActivity(newIntent);
    }

    public void onPreviousButton(View view) {

        Intent newIntent = new Intent(getApplicationContext(), ClassFeatures.class);
        switch (whichClass) {
            case ("bard"):
                whichClass = "barbarian";
                newIntent.putExtra("whichClass", whichClass);
                break;

            case ("cleric"):
                whichClass = "bard";
                newIntent.putExtra("whichClass", whichClass);
                break;

            case ("druid"):
                whichClass = "cleric";
                newIntent.putExtra("whichClass", whichClass);
                break;
            case ("fighter"):
                whichClass = "druid";
                newIntent.putExtra("whichClass", whichClass);
                break;

            case ("monk"):
                whichClass = "fighter";
                newIntent.putExtra("whichClass", whichClass);
                break;
            case ("paladin"):
                whichClass = "monk";
                newIntent.putExtra("whichClass", whichClass);
                break;
            case ("ranger"):
                whichClass = "paladin";
                newIntent.putExtra("whichClass", whichClass);
                break;
            case ("rogue"):
                whichClass = "ranger";
                newIntent.putExtra("whichClass", whichClass);
                break;
            case ("sorcerer"):
                whichClass = "rogue";
                newIntent.putExtra("whichClass", whichClass);
                break;
            case ("warlock"):
                whichClass = "sorcerer";
                newIntent.putExtra("whichClass", whichClass);
                break;

            case ("wizard"):
                whichClass = "warlock";
                newIntent.putExtra("whichClass", whichClass);
                break;
        }
        startActivity(newIntent);
    }
}