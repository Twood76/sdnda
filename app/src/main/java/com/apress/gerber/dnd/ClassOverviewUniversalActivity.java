package com.apress.gerber.dnd;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class ClassOverviewUniversalActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_class_overview_universal);
        whichClass = getIntent().getStringExtra("whichClass");

        TextView activityTitle = findViewById(R.id.ActivityTitle);
        TextView title = findViewById(R.id.title);
        TextView description1 = findViewById(R.id.classDescription);
        ImageView imageView1 = findViewById(R.id.classImageView);
        TextView creatingClassDescription = findViewById(R.id.creatingClassDescription);
        Button previousButton = findViewById(R.id.previousButton);
        Button nextButton = findViewById(R.id.nextButton);

        switch (whichClass) {
            case("barbarian"):
                //title
                activityTitle.setText(R.string.barbarian);
                title.setTextSize(35);
                title.setText(R.string.barbarian);
                //description
                description1.setTextSize(20);
                description1.setText(R.string.barbarian_introducion1);
                //imageView
                imageView1.setImageResource(R.drawable.barbarianimage);
                //classDescription
                creatingClassDescription.setTextSize(20);
                creatingClassDescription.setText(R.string.creating_barbarian_string);
                //hidePreviousButton
                previousButton.setVisibility(View.INVISIBLE);
                previousButton.setHeight(1);
                break;

            case("bard"):
                activityTitle.setText(R.string.bard);
                title.setTextSize(35);
                title.setText(R.string.bard);
                //description
                description1.setTextSize(20);
                description1.setText(R.string.bardOverview);
                //imageView
                imageView1.setImageResource(R.drawable.bard);
                imageView1.getLayoutParams().height = 900;
                //classDescription
                creatingClassDescription.setTextSize(20);
                creatingClassDescription.setText(R.string.bardCreating);
                //hidePreviousButton
                previousButton.setVisibility(View.VISIBLE);
                previousButton.setHeight(1);
                break;

            case("cleric"):
                activityTitle.setText(R.string.cleric);
                title.setTextSize(35);
                title.setText(R.string.cleric);
                //description
                description1.setTextSize(20);
                description1.setText(R.string.clericOverview);
                //imageView
                imageView1.setImageResource(R.drawable.cleric);
                imageView1.getLayoutParams().height = 900;
                //classDescription
                creatingClassDescription.setTextSize(20);
                creatingClassDescription.setText(R.string.clericCreating);
                //hidePreviousButton
                previousButton.setVisibility(View.VISIBLE);
                previousButton.setHeight(1);
                break;

            case("druid"):
                activityTitle.setText(R.string.druid);
                title.setTextSize(35);
                title.setText(R.string.druid);
                //description
                description1.setTextSize(20);
                description1.setText(R.string.druid_introduction);
                //imageView
                imageView1.setImageResource(R.drawable.druid);
                imageView1.getLayoutParams().height = 900;
                //classDescription
                creatingClassDescription.setTextSize(20);
                creatingClassDescription.setText(R.string.creating_druid_string);
                //hidePreviousButton
                previousButton.setVisibility(View.VISIBLE);
                previousButton.setHeight(1);
                break;

            case("fighter"):
                activityTitle.setText(R.string.fighter);
                title.setTextSize(35);
                title.setText(R.string.fighter);
                //description
                description1.setTextSize(20);
                description1.setText(R.string.fighter_introduction);
                //imageView
                imageView1.setImageResource(R.drawable.fighter);
                imageView1.getLayoutParams().height = 900;
                //classDescription
                creatingClassDescription.setTextSize(20);
                creatingClassDescription.setText(R.string.creating_fighter_string);
                //hidePreviousButton
                previousButton.setVisibility(View.VISIBLE);
                previousButton.setHeight(1);
                break;

            case("monk"):
                activityTitle.setText(R.string.monk);
                title.setTextSize(35);
                title.setText(R.string.monk);
                //description
                description1.setTextSize(20);
                description1.setText(R.string.monk_introduction);
                //imageView
                imageView1.setImageResource(R.drawable.monk);
                imageView1.getLayoutParams().height = 900;
                //classDescription
                creatingClassDescription.setTextSize(20);
                creatingClassDescription.setText(R.string.creating_monk_string);
                //hidePreviousButton
                previousButton.setVisibility(View.VISIBLE);
                previousButton.setHeight(1);
                break;
            case("paladin"):
                activityTitle.setText(R.string.paladin);
                title.setTextSize(35);
                title.setText(R.string.paladin);
                //description
                description1.setTextSize(20);
                description1.setText(R.string.paladin_introduction);
                //imageView
                imageView1.setImageResource(R.drawable.paladin);
                imageView1.getLayoutParams().height = 900;
                //classDescription
                creatingClassDescription.setTextSize(20);
                creatingClassDescription.setText(R.string.creating_paladin_string);
                //hidePreviousButton
                previousButton.setVisibility(View.VISIBLE);
                previousButton.setHeight(1);
                break;

            case("ranger"):
                activityTitle.setText(R.string.ranger);
                title.setTextSize(35);
                title.setText(R.string.ranger);
                //description
                description1.setTextSize(20);
                description1.setText(R.string.ranger_introduction);
                //imageView
                imageView1.setImageResource(R.drawable.ranger);
                imageView1.getLayoutParams().height = 900;
                //classDescription
                creatingClassDescription.setTextSize(20);
                creatingClassDescription.setText(R.string.creating_renger_string);
                //hidePreviousButton
                previousButton.setVisibility(View.VISIBLE);
                previousButton.setHeight(1);
                break;

            case("rogue"):
                activityTitle.setText(R.string.rogue);
                title.setTextSize(35);
                title.setText(R.string.rogue);
                //description
                description1.setTextSize(20);
                description1.setText(R.string.rogue_introduction);
                //imageView
                imageView1.setImageResource(R.drawable.rogue);
                imageView1.getLayoutParams().height = 900;
                //classDescription
                creatingClassDescription.setTextSize(20);
                creatingClassDescription.setText(R.string.creating_rogue_string);
                //hidePreviousButton
                previousButton.setVisibility(View.VISIBLE);
                previousButton.setHeight(1);
                break;

            case("sorcerer"):
                activityTitle.setText(R.string.sorcerer);
                title.setTextSize(35);
                title.setText(R.string.sorcerer);
                //description
                description1.setTextSize(20);
                description1.setText(R.string.sorcerer_introduction);
                //imageView
                imageView1.setImageResource(R.drawable.sorcerer);
                imageView1.getLayoutParams().height = 900;
                //classDescription
                creatingClassDescription.setTextSize(20);
                creatingClassDescription.setText(R.string.create_sorcerer_string);
                //hidePreviousButton
                previousButton.setVisibility(View.VISIBLE);
                previousButton.setHeight(1);
                break;

            case("warlock"):
                activityTitle.setText(R.string.warlock);
                title.setTextSize(35);
                title.setText(R.string.warlock);
                //description
                description1.setTextSize(20);
                description1.setText(R.string.warlock_introduction);
                //imageView
                imageView1.setImageResource(R.drawable.warlock);
                imageView1.getLayoutParams().height = 900;
                //classDescription
                creatingClassDescription.setTextSize(20);
                creatingClassDescription.setText(R.string.creating_warlock_string);
                //hidePreviousButton
                previousButton.setVisibility(View.VISIBLE);
                previousButton.setHeight(1);
                break;

            case("wizard"):
                activityTitle.setText(R.string.wizard);
                title.setTextSize(35);
                title.setText(R.string.wizard);
                //description
                description1.setTextSize(20);
                description1.setText(R.string.wizard_introduction);
                //imageView
                imageView1.setImageResource(R.drawable.wizard);
                imageView1.getLayoutParams().height = 900;
                //classDescription
                creatingClassDescription.setTextSize(20);
                creatingClassDescription.setText(R.string.creating_wizard_string);
                //hidePreviousButton
                previousButton.setVisibility(View.VISIBLE);
                previousButton.setHeight(1);
                nextButton.setVisibility(View.INVISIBLE);
                break;
        }



        myLayout = findViewById(R.id.scrollId);
        myLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent newIntent;
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
                    //Intent newIntent = new Intent(getApplicationContext(), weaponsActivity.class);
                    //startActivity(newIntent);
                    //overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                    beeingUsed = true;
                    return true;
                }
                //next
                if (((x2 - x1) < 0) && !beeingUsed  && (Math.abs(x2 - x1) > 300) && (Math.abs(y2 - y1) < 300)) {
                    switch(whichClass){
                        case("barbarian"):
                        newIntent = new Intent(getApplicationContext(), ClassAbiltiesOverview.class);
                        newIntent.setFlags(newIntent.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                        newIntent.putExtra("whichClass", whichClass);
                        startActivity(newIntent);
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                        break;

                        case("bard"):
                            newIntent = new Intent(getApplicationContext(), ClassAbiltiesOverview.class);
                            newIntent.setFlags(newIntent.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                            newIntent.putExtra("whichClass", whichClass);
                            startActivity(newIntent);
                            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                            break;
                    }
                    beeingUsed = true;
                    return true;
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
        Intent newIntent = new Intent(getApplicationContext(), ClassOverviewUniversalActivity.class);

        switch(whichClass){
            case("barbarian"):
                whichClass = "bard";
                newIntent.putExtra("whichClass", whichClass);
                startActivity(newIntent);
                break;

            case("bard"):
                whichClass = "cleric";
                newIntent.putExtra("whichClass", whichClass);
                startActivity(newIntent);
                break;

            case("cleric"):
                whichClass = "druid";
                newIntent.putExtra("whichClass", whichClass);
                startActivity(newIntent);
                break;

            case("druid"):
                whichClass = "fighter";
                newIntent.putExtra("whichClass", whichClass);
                startActivity(newIntent);
                break;

            case("fighter"):
                whichClass = "monk";
                newIntent.putExtra("whichClass", whichClass);
                startActivity(newIntent);
                break;

            case("monk"):
                whichClass = "paladin";
                newIntent.putExtra("whichClass", whichClass);
                startActivity(newIntent);
                break;

            case("paladin"):
                whichClass = "ranger";
                newIntent.putExtra("whichClass", whichClass);
                startActivity(newIntent);
                break;

            case("ranger"):
                whichClass = "rogue";
                newIntent.putExtra("whichClass", whichClass);
                startActivity(newIntent);
                break;

            case("rogue"):
                whichClass = "sorcerer";
                newIntent.putExtra("whichClass", whichClass);
                startActivity(newIntent);
                break;

            case("sorcerer"):
                whichClass = "warlock";
                newIntent.putExtra("whichClass", whichClass);
                startActivity(newIntent);
                break;


            case("warlock"):
                whichClass = "wizard";
                newIntent.putExtra("whichClass", whichClass);
                startActivity(newIntent);
                break;
        }
    }

    public void onPreviousButton(View view) {

        Intent newIntent = new Intent(getApplicationContext(), ClassOverviewUniversalActivity.class);
        switch (whichClass) {
            case ("bard"):
                whichClass = "barbarian";
                newIntent.putExtra("whichClass", whichClass);
                startActivity(newIntent);
                break;

            case ("cleric"):
                whichClass = "bard";
                newIntent.putExtra("whichClass", whichClass);
                startActivity(newIntent);
                break;

            case ("druid"):
                whichClass = "cleric";
                newIntent.putExtra("whichClass", whichClass);
                startActivity(newIntent);
                break;
            case ("fighter"):
                whichClass = "druid";
                newIntent.putExtra("whichClass", whichClass);
                startActivity(newIntent);
                break;

            case ("monk"):
                whichClass = "fighter";
                newIntent.putExtra("whichClass", whichClass);
                startActivity(newIntent);
                break;
            case ("paladin"):
                whichClass = "monk";
                newIntent.putExtra("whichClass", whichClass);
                startActivity(newIntent);
                break;
            case ("ranger"):
                whichClass = "paladin";
                newIntent.putExtra("whichClass", whichClass);
                startActivity(newIntent);
                break;
            case ("rogue"):
                whichClass = "ranger";
                newIntent.putExtra("whichClass", whichClass);
                startActivity(newIntent);
                break;
            case ("sorcerer"):
                whichClass = "rogue";
                newIntent.putExtra("whichClass", whichClass);
                startActivity(newIntent);
            case ("warlock"):
                whichClass = "sorcerer";
                newIntent.putExtra("whichClass", whichClass);
                startActivity(newIntent);
                break;

            case ("wizard"):
                whichClass = "warlock";
                newIntent.putExtra("whichClass", whichClass);
                startActivity(newIntent);
                break;
        }
    }
}