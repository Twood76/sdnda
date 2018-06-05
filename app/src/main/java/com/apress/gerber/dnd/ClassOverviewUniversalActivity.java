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

public class ClassOverviewUniversalActivity extends AppCompatActivity {

    //Variables for Sweeper
    private ScrollView myLayout = null;
    private float x1;
    private float x2;
    private float y1;
    private float y2;
    private boolean beeingUsed = true;
    private String whichClass = "asd";
    //end of SweepVariables

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_overview_universal);
        whichClass = getIntent().getStringExtra("whichClass");


        TextView title = findViewById(R.id.title);
        TextView description1 = findViewById(R.id.classDescription);
        ImageView imageView1 = findViewById(R.id.classImageView);
        TextView creatingClassDescription = findViewById(R.id.creatingClassDescription);
        Button previousButton = findViewById(R.id.previousButton);
        Button nextButton = findViewById(R.id.nextButton);

        if(whichClass.equals("barbarian")){
            //title
            title.setTextSize(35);
            title.setText("BARBARIAN");
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
        }
        else if(whichClass.equals("bard")){
            title.setTextSize(35);
            title.setText("BARD");
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
        }
        else if(whichClass.equals("cleric")){
            title.setTextSize(35);
            title.setText("CLERIC");
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
        }
        else if(whichClass.equals("druid")){
            title.setTextSize(35);
            title.setText("DRUID");
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
        }
        else if(whichClass.equals("fighter")){
            title.setTextSize(35);
            title.setText("FIGHTER");
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
        }
        else if(whichClass.equals("monk")){
            title.setTextSize(35);
            title.setText("MONK");
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
        }
        else if(whichClass.equals("paladin")){
            title.setTextSize(35);
            title.setText("PALADIN");
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
        }
        else if(whichClass.equals("ranger")){
            title.setTextSize(35);
            title.setText("RANGER");
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
        }
        else if(whichClass.equals("rogue")){
            title.setTextSize(35);
            title.setText("ROGUE");
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
        }
        else if(whichClass.equals("sorcerer")){
            title.setTextSize(35);
            title.setText("SORCERER");
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
        }
        else if(whichClass.equals("warlock")){
            title.setTextSize(35);
            title.setText("WARLOCK");
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
        }
        else if(whichClass.equals("wizard")){
            title.setTextSize(35);
            title.setText("WIZARD");
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


        }




        myLayout = (ScrollView) findViewById(R.id.scrollId);
        myLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
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
                if (((x2 - x1) > 0) && beeingUsed == false && (Math.abs(x2 - x1) > 300) && (Math.abs(y2 - y1) < 300)) {
                    //Intent newIntent = new Intent(getApplicationContext(), weaponsActivity.class);
                    //startActivity(newIntent);
                    //overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                    beeingUsed = true;
                    return true;
                }
                //next
                if (((x2 - x1) < 0) && (beeingUsed == false) && (Math.abs(x2 - x1) > 300) && (Math.abs(y2 - y1) < 300)) {
                    Intent newIntent = new Intent(getApplicationContext(), barbarianClassOverview.class);
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
        if(whichClass.equals("barbarian")) {
            whichClass = "bard";
            Intent newIntent = new Intent(getApplicationContext(), ClassOverviewUniversalActivity.class);
            newIntent.putExtra("whichClass", whichClass);
            startActivity(newIntent);
        }
        else if(whichClass.equals("bard")) {
            whichClass = "cleric";
            Intent newIntent = new Intent(getApplicationContext(), ClassOverviewUniversalActivity.class);
            newIntent.putExtra("whichClass", whichClass);
            startActivity(newIntent);
        }
        else if(whichClass.equals("cleric")) {
            whichClass = "druid";
            Intent newIntent = new Intent(getApplicationContext(), ClassOverviewUniversalActivity.class);
            newIntent.putExtra("whichClass", whichClass);
            startActivity(newIntent);
        }
        else if(whichClass.equals("druid")) {
            whichClass = "fighter";
            Intent newIntent = new Intent(getApplicationContext(), ClassOverviewUniversalActivity.class);
            newIntent.putExtra("whichClass", whichClass);
            startActivity(newIntent);
        }
        else if(whichClass.equals("fighter")) {
            whichClass = "monk";
            Intent newIntent = new Intent(getApplicationContext(), ClassOverviewUniversalActivity.class);
            newIntent.putExtra("whichClass", whichClass);
            startActivity(newIntent);
        }
        else if(whichClass.equals("monk")) {
            whichClass = "paladin";
            Intent newIntent = new Intent(getApplicationContext(), ClassOverviewUniversalActivity.class);
            newIntent.putExtra("whichClass", whichClass);
            startActivity(newIntent);
        }
        else if(whichClass.equals("paladin")) {
            whichClass = "ranger";
            Intent newIntent = new Intent(getApplicationContext(), ClassOverviewUniversalActivity.class);
            newIntent.putExtra("whichClass", whichClass);
            startActivity(newIntent);
        }
        else if(whichClass.equals("ranger")) {
            whichClass = "rogue";
            Intent newIntent = new Intent(getApplicationContext(), ClassOverviewUniversalActivity.class);
            newIntent.putExtra("whichClass", whichClass);
            startActivity(newIntent);
        }
        else if(whichClass.equals("rogue")) {
            whichClass = "sorcerer";
            Intent newIntent = new Intent(getApplicationContext(), ClassOverviewUniversalActivity.class);
            newIntent.putExtra("whichClass", whichClass);
            startActivity(newIntent);
        }
        else if(whichClass.equals("sorcerer")) {
            whichClass = "warlock";
            Intent newIntent = new Intent(getApplicationContext(), ClassOverviewUniversalActivity.class);
            newIntent.putExtra("whichClass", whichClass);
            startActivity(newIntent);
        }
        else if(whichClass.equals("warlock")) {
            whichClass = "wizard";
            Intent newIntent = new Intent(getApplicationContext(), ClassOverviewUniversalActivity.class);
            newIntent.putExtra("whichClass", whichClass);
            startActivity(newIntent);
        }



    }

    public void onPreviousButton(View view) {
        if(whichClass.equals("bard")) {
            whichClass = "barbarian";
            Intent newIntent = new Intent(getApplicationContext(), ClassOverviewUniversalActivity.class);
            newIntent.putExtra("whichClass", whichClass);
            startActivity(newIntent);
        }
        else if(whichClass.equals("cleric")) {
            whichClass = "bard";
            Intent newIntent = new Intent(getApplicationContext(), ClassOverviewUniversalActivity.class);
            newIntent.putExtra("whichClass", whichClass);
            startActivity(newIntent);
        }
        else if(whichClass.equals("druid")) {
            whichClass = "cleric";
            Intent newIntent = new Intent(getApplicationContext(), ClassOverviewUniversalActivity.class);
            newIntent.putExtra("whichClass", whichClass);
            startActivity(newIntent);
        }
        else if(whichClass.equals("fighter")) {
            whichClass = "druid";
            Intent newIntent = new Intent(getApplicationContext(), ClassOverviewUniversalActivity.class);
            newIntent.putExtra("whichClass", whichClass);
            startActivity(newIntent);
        }
        else if(whichClass.equals("monk")) {
            whichClass = "fighter";
            Intent newIntent = new Intent(getApplicationContext(), ClassOverviewUniversalActivity.class);
            newIntent.putExtra("whichClass", whichClass);
            startActivity(newIntent);
        }
        else if(whichClass.equals("paladin")) {
            whichClass = "monk";
            Intent newIntent = new Intent(getApplicationContext(), ClassOverviewUniversalActivity.class);
            newIntent.putExtra("whichClass", whichClass);
            startActivity(newIntent);
        }
        else if(whichClass.equals("ranger")) {
            whichClass = "paladin";
            Intent newIntent = new Intent(getApplicationContext(), ClassOverviewUniversalActivity.class);
            newIntent.putExtra("whichClass", whichClass);
            startActivity(newIntent);
        }
        else if(whichClass.equals("rogue")) {
            whichClass = "ranger";
            Intent newIntent = new Intent(getApplicationContext(), ClassOverviewUniversalActivity.class);
            newIntent.putExtra("whichClass", whichClass);
            startActivity(newIntent);
        }
        else if(whichClass.equals("sorcerer")) {
            whichClass = "rogue";
            Intent newIntent = new Intent(getApplicationContext(), ClassOverviewUniversalActivity.class);
            newIntent.putExtra("whichClass", whichClass);
            startActivity(newIntent);
        }
        else if(whichClass.equals("warlock")) {
            whichClass = "sorcerer";
            Intent newIntent = new Intent(getApplicationContext(), ClassOverviewUniversalActivity.class);
            newIntent.putExtra("whichClass", whichClass);
            startActivity(newIntent);
        }
        else if(whichClass.equals("wizard")) {
            whichClass = "warlock";
            Intent newIntent = new Intent(getApplicationContext(), ClassOverviewUniversalActivity.class);
            newIntent.putExtra("whichClass", whichClass);
            startActivity(newIntent);
        }
    }
}