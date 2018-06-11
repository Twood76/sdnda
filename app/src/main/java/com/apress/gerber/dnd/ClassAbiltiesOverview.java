package com.apress.gerber.dnd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TextView;

public class ClassAbiltiesOverview extends AppCompatActivity {

    //Variables for Sweeper
    ScrollView myLayout = null;
    private float x1;
    private float x2;
    private boolean beeingUsed = true;
    String whichClass = "asd";

    //end of SweepVariables

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_abilties_overview);
        whichClass = getIntent().getStringExtra("whichClass");

        TextView activityTitle = findViewById(R.id.ActivityTitle);
        TextView feature1 = findViewById(R.id.featuresLvl1);
        TextView feature2 = findViewById(R.id.featuresLvl2);
        TextView feature3 = findViewById(R.id.featuresLvl3);
        TextView feature4 = findViewById(R.id.featuresLvl4);
        TextView feature5 = findViewById(R.id.featuresLvl5);
        TextView feature6 = findViewById(R.id.featuresLvl6);
        TextView feature7 = findViewById(R.id.featuresLvl7);
        TextView feature8 = findViewById(R.id.featuresLvl8);
        TextView feature9 = findViewById(R.id.featuresLvl9);
        TextView feature10 = findViewById(R.id.featuresLvl10);
        TextView feature11 = findViewById(R.id.featuresLvl11);
        TextView feature12 = findViewById(R.id.featuresLvl12);
        TextView feature13 = findViewById(R.id.featuresLvl13);
        TextView feature14 = findViewById(R.id.featuresLvl14);
        TextView feature15 = findViewById(R.id.featuresLvl15);
        TextView feature16 = findViewById(R.id.featuresLvl16);
        TextView feature17 = findViewById(R.id.featuresLvl17);
        TextView feature18 = findViewById(R.id.featuresLvl18);
        TextView feature19 = findViewById(R.id.featuresLvl19);
        TextView feature20 = findViewById(R.id.featuresLvl20);

        TextView table2Title = findViewById(R.id.table2_title);
        TableLayout table2 = findViewById(R.id.table2);
        TextView table2LvlLabel = findViewById(R.id.lvl_label);


        TextView table2value2Label = findViewById(R.id.table2_title2);
        TextView table2Value2_1 = findViewById(R.id.table2_value2_1);
        TextView table2Value2_2 = findViewById(R.id.table2_value2_2);
        TextView table2Value2_3 = findViewById(R.id.table2_value2_3);
        TextView table2Value2_4 = findViewById(R.id.table2_value2_4);
        TextView table2Value2_5 = findViewById(R.id.table2_value2_5);
        TextView table2Value2_6 = findViewById(R.id.table2_value2_6);
        TextView table2Value2_7 = findViewById(R.id.table2_value2_7);
        TextView table2Value2_8 = findViewById(R.id.table2_value2_8);
        TextView table2Value2_9 = findViewById(R.id.table2_value2_9);
        TextView table2Value2_10 = findViewById(R.id.table2_value2_10);
        TextView table2Value2_11 = findViewById(R.id.table2_value2_11);
        TextView table2Value2_12 = findViewById(R.id.table2_value2_12);
        TextView table2Value2_13 = findViewById(R.id.table2_value2_13);
        TextView table2Value2_14 = findViewById(R.id.table2_value2_14);
        TextView table2Value2_15 = findViewById(R.id.table2_value2_15);
        TextView table2Value2_16 = findViewById(R.id.table2_value2_16);
        TextView table2Value2_17 = findViewById(R.id.table2_value2_17);
        TextView table2Value2_18 = findViewById(R.id.table2_value2_18);
        TextView table2Value2_19 = findViewById(R.id.table2_value2_19);
        TextView table2Value2_20 = findViewById(R.id.table2_value2_20);


        TextView table2value3Label = findViewById(R.id.table2_value3_label);
        TextView table2Value3_1 = findViewById(R.id.table2_value3_1);
        TextView table2Value3_2 = findViewById(R.id.table2_value3_2);
        TextView table2Value3_3 = findViewById(R.id.table2_value3_3);
        TextView table2Value3_4 = findViewById(R.id.table2_value3_4);
        TextView table2Value3_5 = findViewById(R.id.table2_value3_5);
        TextView table2Value3_6 = findViewById(R.id.table2_value3_6);
        TextView table2Value3_7 = findViewById(R.id.table2_value3_7);
        TextView table2Value3_8 = findViewById(R.id.table2_value3_8);
        TextView table2Value3_9 = findViewById(R.id.table2_value3_9);
        TextView table2Value3_10 = findViewById(R.id.table2_value3_10);
        TextView table2Value3_11 = findViewById(R.id.table2_value3_11);
        TextView table2Value3_12 = findViewById(R.id.table2_value3_12);
        TextView table2Value3_13 = findViewById(R.id.table2_value3_13);
        TextView table2Value3_14 = findViewById(R.id.table2_value3_14);
        TextView table2Value3_15 = findViewById(R.id.table2_value3_15);
        TextView table2Value3_16 = findViewById(R.id.table2_value3_16);
        TextView table2Value3_17 = findViewById(R.id.table2_value3_17);
        TextView table2Value3_18 = findViewById(R.id.table2_value3_18);
        TextView table2Value3_19 = findViewById(R.id.table2_value3_19);
        TextView table2Value3_20 = findViewById(R.id.table2_value3_20);



        switch(whichClass){
            case("barbarian"):
                activityTitle.setText(R.string.barbarian);
                feature1.setText(R.string.barbarian_1st_lvl_abilities);
                feature2.setText(R.string.barbarian_2nd_lvl_abilities);
                feature3.setText(R.string.barbarian_3rd_lvl_abilities);
                feature4.setText(R.string.barbarian_4th_lvl_abilities);
                feature5.setText(R.string.barbarian_5th_lvl_abilities);
                feature6.setText(R.string.barbarian_6th_lvl_abilities);
                feature7.setText(R.string.barbarian_7th_lvl_abilities);
                feature8.setText(R.string.barbarian_8th_lvl_abilities);
                feature9.setText(R.string.barbarian_9th_lvl_abilities);
                feature10.setText(R.string.barbarian_10th_lvl_abilities);
                feature11.setText(R.string.barbarian_11th_lvl_abilities);
                feature12.setText(R.string.barbarian_12th_lvl_abilities);
                feature13.setText(R.string.barbarian_13th_lvl_abilities);
                feature14.setText(R.string.barbarian_14th_lvl_abilities);
                feature15.setText(R.string.barbarian_15th_lvl_abilities);
                feature16.setText(R.string.barbarian_16th_lvl_abilities);
                feature17.setText(R.string.barbarian_17th_lvl_abilities);
                feature18.setText(R.string.barbarian_18th_lvl_abilities);
                feature19.setText(R.string.barbarian_19th_lvl_abilities);
                feature20.setText(R.string.barbarian_20th_lvl_abilities);
                //----------------------------------------------------------2nd table

                table2Title.setText(R.string.barbarian_table2_label);
                table2Title.setTextSize(20);

                table2LvlLabel.setText(R.string.lvl);
                table2value2Label.setText(R.string.barbarian_table2_value2_label);
                table2Value2_1.setText(R.string.barbarian_table2_value2_1to2_values);
                table2Value2_2.setText(R.string.barbarian_table2_value2_1to2_values);
                table2Value2_3.setText(R.string.barbarian_table2_value2_3to5_values);
                table2Value2_4.setText(R.string.barbarian_table2_value2_3to5_values);
                table2Value2_5.setText(R.string.barbarian_table2_value2_3to5_values);
                table2Value2_6.setText(R.string.barbarian_table2_value2_6to11_values);
                table2Value2_7.setText(R.string.barbarian_table2_value2_6to11_values);
                table2Value2_8.setText(R.string.barbarian_table2_value2_6to11_values);
                table2Value2_9.setText(R.string.barbarian_table2_value2_6to11_values);
                table2Value2_10.setText(R.string.barbarian_table2_value2_6to11_values);
                table2Value2_11.setText(R.string.barbarian_table2_value2_6to11_values);
                table2Value2_12.setText(R.string.barbarian_table2_value2_12to16_values);
                table2Value2_13.setText(R.string.barbarian_table2_value2_12to16_values);
                table2Value2_14.setText(R.string.barbarian_table2_value2_12to16_values);
                table2Value2_15.setText(R.string.barbarian_table2_value2_12to16_values);
                table2Value2_16.setText(R.string.barbarian_table2_value2_12to16_values);
                table2Value2_17.setText(R.string.barbarian_table2_value2_17to19_values);
                table2Value2_18.setText(R.string.barbarian_table2_value2_17to19_values);
                table2Value2_19.setText(R.string.barbarian_table2_value2_17to19_values);
                table2Value2_20.setText(R.string.barbarian_table2_value2_20value);


                table2value3Label.setText(R.string.barbarian_table2_value3_label);
                table2Value3_1.setText(R.string.barbarian_table2_value3_1to8_values);
                table2Value3_2.setText(R.string.barbarian_table2_value3_1to8_values);
                table2Value3_3.setText(R.string.barbarian_table2_value3_1to8_values);
                table2Value3_4.setText(R.string.barbarian_table2_value3_1to8_values);
                table2Value3_5.setText(R.string.barbarian_table2_value3_1to8_values);
                table2Value3_6.setText(R.string.barbarian_table2_value3_1to8_values);
                table2Value3_7.setText(R.string.barbarian_table2_value3_1to8_values);
                table2Value3_8.setText(R.string.barbarian_table2_value3_1to8_values);
                table2Value3_9.setText(R.string.barbarian_table2_value3_9to15_values);
                table2Value3_10.setText(R.string.barbarian_table2_value3_9to15_values);
                table2Value3_11.setText(R.string.barbarian_table2_value3_9to15_values);
                table2Value3_12.setText(R.string.barbarian_table2_value3_9to15_values);
                table2Value3_13.setText(R.string.barbarian_table2_value3_9to15_values);
                table2Value3_14.setText(R.string.barbarian_table2_value3_9to15_values);
                table2Value3_15.setText(R.string.barbarian_table2_value3_9to15_values);
                table2Value3_16.setText(R.string.barbarian_table2_value3_16to20_values);
                table2Value3_17.setText(R.string.barbarian_table2_value3_16to20_values);
                table2Value3_18.setText(R.string.barbarian_table2_value3_16to20_values);
                table2Value3_19.setText(R.string.barbarian_table2_value3_16to20_values);
                table2Value3_20.setText(R.string.barbarian_table2_value3_16to20_values);
                break;

            case("bard"):
                activityTitle.setText(R.string.bard);
                feature1.setText(R.string.bard_1st_lvl_abilities);
                feature2.setText(R.string.bard_2nd_lvl_abilities);
                feature3.setText(R.string.bard_3rd_lvl_abilities);
                feature4.setText(R.string.bard_4th_lvl_abilities);
                feature5.setText(R.string.bard_5th_lvl_abilities);
                feature6.setText(R.string.bard_6th_lvl_abilities);
                feature7.setText(R.string.bard_7th_lvl_abilities);
                feature8.setText(R.string.bard_8th_lvl_abilities);
                feature9.setText(R.string.bard_9th_lvl_abilities);
                feature10.setText(R.string.bard_10th_lvl_abilities);
                feature11.setText(R.string.bard_11th_lvl_abilities);
                feature12.setText(R.string.bard_12th_lvl_abilities);
                feature13.setText(R.string.bard_13th_lvl_abilities);
                feature14.setText(R.string.bard_14th_lvl_abilities);
                feature15.setText(R.string.bard_15th_lvl_abilities);
                feature16.setText(R.string.bard_16th_lvl_abilities);
                feature17.setText(R.string.bard_17th_lvl_abilities);
                feature18.setText(R.string.bard_18th_lvl_abilities);
                feature19.setText(R.string.bard_19th_lvl_abilities);
                feature20.setText(R.string.bard_20th_lvl_abilities);
                //----------------------------------------------------------2nd table

                table2Title.setText(R.string.bard_table2_label);
                table2Title.setTextSize(20);

                table2LvlLabel.setText(R.string.lvl);
                table2value2Label.setText(R.string.bard_table2_value2_label);
                table2Value2_1.setText(R.string.bard_table2_value2_1to3_values);
                table2Value2_2.setText(R.string.bard_table2_value2_1to3_values);
                table2Value2_3.setText(R.string.bard_table2_value2_1to3_values);
                table2Value2_4.setText(R.string.bard_table2_value2_4to9_values);
                table2Value2_5.setText(R.string.bard_table2_value2_4to9_values);
                table2Value2_6.setText(R.string.bard_table2_value2_4to9_values);
                table2Value2_7.setText(R.string.bard_table2_value2_4to9_values);
                table2Value2_8.setText(R.string.bard_table2_value2_4to9_values);
                table2Value2_9.setText(R.string.bard_table2_value2_4to9_values);
                table2Value2_10.setText(R.string.bard_table2_value2_10to20_values);
                table2Value2_11.setText(R.string.bard_table2_value2_10to20_values);
                table2Value2_12.setText(R.string.bard_table2_value2_10to20_values);
                table2Value2_13.setText(R.string.bard_table2_value2_10to20_values);
                table2Value2_14.setText(R.string.bard_table2_value2_10to20_values);
                table2Value2_15.setText(R.string.bard_table2_value2_10to20_values);
                table2Value2_16.setText(R.string.bard_table2_value2_10to20_values);
                table2Value2_17.setText(R.string.bard_table2_value2_10to20_values);
                table2Value2_18.setText(R.string.bard_table2_value2_10to20_values);
                table2Value2_19.setText(R.string.bard_table2_value2_10to20_values);
                table2Value2_20.setText(R.string.bard_table2_value2_10to20_values);


                table2value3Label.setText(R.string.bard_table2_value3_label);
                table2Value3_1.setText(R.string.bard_table2_value3_1values);
                table2Value3_2.setText(R.string.bard_table2_value3_2values);
                table2Value3_3.setText(R.string.bard_table2_value3_3values);
                table2Value3_4.setText(R.string.bard_table2_value3_4values);
                table2Value3_5.setText(R.string.bard_table2_value3_5values);
                table2Value3_6.setText(R.string.bard_table2_value3_6values);
                table2Value3_7.setText(R.string.bard_table2_value3_7values);
                table2Value3_8.setText(R.string.bard_table2_value3_8values);
                table2Value3_9.setText(R.string.bard_table2_value3_9values);
                table2Value3_10.setText(R.string.bard_table2_value3_10values);
                table2Value3_11.setText(R.string.bard_table2_value3_11to12values);
                table2Value3_12.setText(R.string.bard_table2_value3_11to12values);
                table2Value3_13.setText(R.string.bard_table2_value3_13values);
                table2Value3_14.setText(R.string.bard_table2_value3_14values);
                table2Value3_15.setText(R.string.bard_table2_value3_15to16values);
                table2Value3_16.setText(R.string.bard_table2_value3_15to16values);
                table2Value3_17.setText(R.string.bard_table2_value3_17values);
                table2Value3_18.setText(R.string.bard_table2_value3_18to20values);
                table2Value3_19.setText(R.string.bard_table2_value3_18to20values);
                table2Value3_20.setText(R.string.bard_table2_value3_18to20values);
                break;

            case("cleric"):
                activityTitle.setText(R.string.cleric);
                feature1.setText(R.string.cleric_1st_lvl_abilities);
                feature2.setText(R.string.cleric_2nd_lvl_abilities);
                feature3.setText(R.string.cleric_3rd_lvl_abilities);
                feature4.setText(R.string.cleric_4th_lvl_abilities);
                feature5.setText(R.string.cleric_5th_lvl_abilities);
                feature6.setText(R.string.cleric_6th_lvl_abilities);
                feature7.setText(R.string.cleric_7th_lvl_abilities);
                feature8.setText(R.string.cleric_8th_lvl_abilities);
                feature9.setText(R.string.cleric_9th_lvl_abilities);
                feature10.setText(R.string.cleric_10th_lvl_abilities);
                feature11.setText(R.string.cleric_11th_lvl_abilities);
                feature12.setText(R.string.cleric_12th_lvl_abilities);
                feature13.setText(R.string.cleric_13th_lvl_abilities);
                feature14.setText(R.string.cleric_14th_lvl_abilities);
                feature15.setText(R.string.cleric_15th_lvl_abilities);
                feature16.setText(R.string.cleric_16th_lvl_abilities);
                feature17.setText(R.string.cleric_17th_lvl_abilities);
                feature18.setText(R.string.cleric_18th_lvl_abilities);
                feature19.setText(R.string.cleric_19th_lvl_abilities);
                feature20.setText(R.string.cleric_20th_lvl_abilities);
                //----------------------------------------------------------2nd table

                table2Title.setText(R.string.bard_table2_label);
                table2Title.setTextSize(20);

                table2LvlLabel.setText(R.string.lvl);
                table2value2Label.setText(R.string.cleric_table2_value2_label);
                table2Value2_1.setText(R.string.cleric_table2_value2_1to3_values);
                table2Value2_2.setText(R.string.cleric_table2_value2_1to3_values);
                table2Value2_3.setText(R.string.cleric_table2_value2_1to3_values);
                table2Value2_4.setText(R.string.cleric_table2_value2_4to9_values);
                table2Value2_5.setText(R.string.cleric_table2_value2_4to9_values);
                table2Value2_6.setText(R.string.cleric_table2_value2_4to9_values);
                table2Value2_7.setText(R.string.cleric_table2_value2_4to9_values);
                table2Value2_8.setText(R.string.cleric_table2_value2_4to9_values);
                table2Value2_9.setText(R.string.cleric_table2_value2_4to9_values);
                table2Value2_10.setText(R.string.cleric_table2_value2_10to20_values);
                table2Value2_11.setText(R.string.cleric_table2_value2_10to20_values);
                table2Value2_12.setText(R.string.cleric_table2_value2_10to20_values);
                table2Value2_13.setText(R.string.cleric_table2_value2_10to20_values);
                table2Value2_14.setText(R.string.cleric_table2_value2_10to20_values);
                table2Value2_15.setText(R.string.cleric_table2_value2_10to20_values);
                table2Value2_16.setText(R.string.cleric_table2_value2_10to20_values);
                table2Value2_17.setText(R.string.cleric_table2_value2_10to20_values);
                table2Value2_18.setText(R.string.cleric_table2_value2_10to20_values);
                table2Value2_19.setText(R.string.cleric_table2_value2_10to20_values);
                table2Value2_20.setText(R.string.cleric_table2_value2_10to20_values);
                break;
        }

        //Sweep Screen - got to setOnTouchListener to existin label (layout) deciding which area should be listen for touch events
        myLayout = (ScrollView) findViewById(R.id.scrollId);
        myLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if ((motionEvent.getAction() == MotionEvent.ACTION_DOWN)) {
                    x1 = motionEvent.getX();
                    beeingUsed = true;
                }
                if ((motionEvent.getAction() == MotionEvent.ACTION_UP)) {
                    x2 = motionEvent.getX();
                    beeingUsed = false;
                }
                //previous
                if (((x2 - x1) > 0) && beeingUsed == false && (Math.abs(x2 - x1) > 200)) {
                    Intent newIntent = new Intent(getApplicationContext(), ClassOverviewUniversalActivity.class);
                    newIntent.setFlags(newIntent.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                    startActivity(newIntent);
                    overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                    beeingUsed = true;
                    return true;


                }
                //next
                if (((x2 - x1) < 0) && (beeingUsed == false) && (Math.abs(x2 - x1) > 200)) {
                    Intent newIntent = new Intent(getApplicationContext(), BarbarianClassFeatures.class);
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
        Intent newIntent = new Intent(getApplicationContext(), ClassAbiltiesOverview.class);

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

        Intent newIntent = new Intent(getApplicationContext(), ClassAbiltiesOverview.class);
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
