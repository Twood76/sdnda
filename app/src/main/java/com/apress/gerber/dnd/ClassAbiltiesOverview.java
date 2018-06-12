package com.apress.gerber.dnd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TextView;


public class ClassAbiltiesOverview extends AppCompatActivity {

    //Variables for Sweeper
    ScrollView myLayout = null;
    private float x1;
    private float x2;
    private float y1;
    private float y2;
    private boolean beeingUsed = true;
    String whichClass = "asd";

    //end of SweepVariables

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_abilties_overview);
        whichClass = getIntent().getStringExtra("whichClass");

        Button previousButton = findViewById(R.id.previousButton);
        Button nextButton = findViewById(R.id.nextButton);

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

        TextView table2value4Label = findViewById(R.id.table2_value4_label);
        TextView table2Value4_1 = findViewById(R.id.table2_value4_1);
        TextView table2Value4_2 = findViewById(R.id.table2_value4_2);
        TextView table2Value4_3 = findViewById(R.id.table2_value4_3);
        TextView table2Value4_4 = findViewById(R.id.table2_value4_4);
        TextView table2Value4_5 = findViewById(R.id.table2_value4_5);
        TextView table2Value4_6 = findViewById(R.id.table2_value4_6);
        TextView table2Value4_7 = findViewById(R.id.table2_value4_7);
        TextView table2Value4_8 = findViewById(R.id.table2_value4_8);
        TextView table2Value4_9 = findViewById(R.id.table2_value4_9);
        TextView table2Value4_10 = findViewById(R.id.table2_value4_10);
        TextView table2Value4_11 = findViewById(R.id.table2_value4_11);
        TextView table2Value4_12 = findViewById(R.id.table2_value4_12);
        TextView table2Value4_13 = findViewById(R.id.table2_value4_13);
        TextView table2Value4_14 = findViewById(R.id.table2_value4_14);
        TextView table2Value4_15 = findViewById(R.id.table2_value4_15);
        TextView table2Value4_16 = findViewById(R.id.table2_value4_16);
        TextView table2Value4_17 = findViewById(R.id.table2_value4_17);
        TextView table2Value4_18 = findViewById(R.id.table2_value4_18);
        TextView table2Value4_19 = findViewById(R.id.table2_value4_19);
        TextView table2Value4_20 = findViewById(R.id.table2_value4_20);

        TextView level1label = findViewById(R.id.lvl1_label);
        TextView level2label = findViewById(R.id.lvl2_label);
        TextView level3label = findViewById(R.id.lvl3_label);
        TextView level4label = findViewById(R.id.lvl4_label);
        TextView level5label = findViewById(R.id.lvl5_label);
        TextView level6label = findViewById(R.id.lvl6_label);
        TextView level7label = findViewById(R.id.lvl7_label);
        TextView level8label = findViewById(R.id.lvl8_label);
        TextView level9label = findViewById(R.id.lvl9_label);
        TextView level10label = findViewById(R.id.lvl10_label);
        TextView level11label = findViewById(R.id.lvl11_label);
        TextView level12label = findViewById(R.id.lvl12_label);
        TextView level13label = findViewById(R.id.lvl13_label);
        TextView level14label = findViewById(R.id.lvl14_label);
        TextView level15label = findViewById(R.id.lvl15_label);
        TextView level16label = findViewById(R.id.lvl16_label);
        TextView level17label = findViewById(R.id.lvl17_label);
        TextView level18label = findViewById(R.id.lvl18_label);
        TextView level19label = findViewById(R.id.lvl19_label);
        TextView level20label = findViewById(R.id.lvl20_label);

        TableLayout table2 = findViewById(R.id.table2);

        switch(whichClass){
            case("barbarian"):
                previousButton.setVisibility(View.INVISIBLE);
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

                table2Title.setText(R.string.cleric_table2_label);
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

            case("druid"):
                activityTitle.setText(R.string.druid);
                feature1.setText(R.string.druid_1st_lvl_abilities);
                feature2.setText(R.string.druid_2nd_lvl_abilities);
                feature3.setText(R.string.druid_3rd_lvl_abilities);
                feature4.setText(R.string.druid_4th_lvl_abilities);
                feature5.setText(R.string.druid_5th_lvl_abilities);
                feature6.setText(R.string.druid_6th_lvl_abilities);
                feature7.setText(R.string.druid_7th_lvl_abilities);
                feature8.setText(R.string.druid_8th_lvl_abilities);
                feature9.setText(R.string.druid_9th_lvl_abilities);
                feature10.setText(R.string.druid_10th_lvl_abilities);
                feature11.setText(R.string.druid_11th_lvl_abilities);
                feature12.setText(R.string.druid_12th_lvl_abilities);
                feature13.setText(R.string.druid_13th_lvl_abilities);
                feature14.setText(R.string.druid_14th_lvl_abilities);
                feature15.setText(R.string.druid_15th_lvl_abilities);
                feature16.setText(R.string.druid_16th_lvl_abilities);
                feature17.setText(R.string.druid_17th_lvl_abilities);
                feature18.setText(R.string.druid_18th_lvl_abilities);
                feature19.setText(R.string.druid_19th_lvl_abilities);
                feature20.setText(R.string.druid_20th_lvl_abilities);
                //----------------------------------------------------------2nd table

                table2Title.setText(R.string.bard_table2_label);
                table2Title.setTextSize(20);

                table2LvlLabel.setText(R.string.lvl);
                table2value2Label.setText(R.string.druid_table2_value2_label);
                table2Value2_1.setText(R.string.druid_table2_value2_1to3_values);
                table2Value2_2.setText(R.string.druid_table2_value2_1to3_values);
                table2Value2_3.setText(R.string.druid_table2_value2_1to3_values);
                table2Value2_4.setText(R.string.druid_table2_value2_4to9_values);
                table2Value2_5.setText(R.string.druid_table2_value2_4to9_values);
                table2Value2_6.setText(R.string.druid_table2_value2_4to9_values);
                table2Value2_7.setText(R.string.druid_table2_value2_4to9_values);
                table2Value2_8.setText(R.string.druid_table2_value2_4to9_values);
                table2Value2_9.setText(R.string.druid_table2_value2_4to9_values);
                table2Value2_10.setText(R.string.druid_table2_value2_10to20_values);
                table2Value2_11.setText(R.string.druid_table2_value2_10to20_values);
                table2Value2_12.setText(R.string.druid_table2_value2_10to20_values);
                table2Value2_13.setText(R.string.druid_table2_value2_10to20_values);
                table2Value2_14.setText(R.string.druid_table2_value2_10to20_values);
                table2Value2_15.setText(R.string.druid_table2_value2_10to20_values);
                table2Value2_16.setText(R.string.druid_table2_value2_10to20_values);
                table2Value2_17.setText(R.string.druid_table2_value2_10to20_values);
                table2Value2_18.setText(R.string.druid_table2_value2_10to20_values);
                table2Value2_19.setText(R.string.druid_table2_value2_10to20_values);
                table2Value2_20.setText(R.string.druid_table2_value2_10to20_values);
                break;

            case("fighter"):
                activityTitle.setText(R.string.fighter);
                feature1.setText(R.string.fighter_1st_lvl_abilities);
                feature2.setText(R.string.fighter_2nd_lvl_abilities);
                feature3.setText(R.string.fighter_3rd_lvl_abilities);
                feature4.setText(R.string.fighter_4th_lvl_abilities);
                feature5.setText(R.string.fighter_5th_lvl_abilities);
                feature6.setText(R.string.fighter_6th_lvl_abilities);
                feature7.setText(R.string.fighter_7th_lvl_abilities);
                feature8.setText(R.string.fighter_8th_lvl_abilities);
                feature9.setText(R.string.fighter_9th_lvl_abilities);
                feature10.setText(R.string.fighter_10th_lvl_abilities);
                feature11.setText(R.string.fighter_11th_lvl_abilities);
                feature12.setText(R.string.fighter_12th_lvl_abilities);
                feature13.setText(R.string.fighter_13th_lvl_abilities);
                feature14.setText(R.string.fighter_14th_lvl_abilities);
                feature15.setText(R.string.fighter_15th_lvl_abilities);
                feature16.setText(R.string.fighter_16th_lvl_abilities);
                feature17.setText(R.string.fighter_17th_lvl_abilities);
                feature18.setText(R.string.fighter_18th_lvl_abilities);
                feature19.setText(R.string.fighter_19th_lvl_abilities);
                feature20.setText(R.string.fighter_20th_lvl_abilities);

                //----------------------------------------------------------2nd table
                table2Title.setTextSize(1);
                level1label.setTextSize(1);
                level2label.setTextSize(1);
                level3label.setTextSize(1);
                level4label.setTextSize(1);
                level5label.setTextSize(1);
                level6label.setTextSize(1);
                level7label.setTextSize(1);
                level8label.setTextSize(1);
                level9label.setTextSize(1);
                level10label.setTextSize(1);
                level11label.setTextSize(1);
                level12label.setTextSize(1);
                level13label.setTextSize(1);
                level14label.setTextSize(1);
                level15label.setTextSize(1);
                level16label.setTextSize(1);
                level17label.setTextSize(1);
                level18label.setTextSize(1);
                level19label.setTextSize(1);
                level20label.setTextSize(1);

                table2value2Label.setTextSize(1);
                table2value3Label.setTextSize(1);

                table2Value2_1.setTextSize(1);
                table2Value2_2.setTextSize(1);
                table2Value2_3.setTextSize(1);
                table2Value2_4.setTextSize(1);
                table2Value2_5.setTextSize(1);
                table2Value2_6.setTextSize(1);
                table2Value2_7.setTextSize(1);
                table2Value2_8.setTextSize(1);
                table2Value2_9.setTextSize(1);
                table2Value2_10.setTextSize(1);
                table2Value2_11.setTextSize(1);
                table2Value2_12.setTextSize(1);
                table2Value2_13.setTextSize(1);
                table2Value2_14.setTextSize(1);
                table2Value2_15.setTextSize(1);
                table2Value2_16.setTextSize(1);
                table2Value2_17.setTextSize(1);
                table2Value2_18.setTextSize(1);
                table2Value2_19.setTextSize(1);
                table2Value2_20.setTextSize(1);

                table2Value3_1.setTextSize(1);
                table2Value3_2.setTextSize(1);
                table2Value3_3.setTextSize(1);
                table2Value3_4.setTextSize(1);
                table2Value3_5.setTextSize(1);
                table2Value3_6.setTextSize(1);
                table2Value3_7.setTextSize(1);
                table2Value3_8.setTextSize(1);
                table2Value3_9.setTextSize(1);
                table2Value3_10.setTextSize(1);
                table2Value3_11.setTextSize(1);
                table2Value3_12.setTextSize(1);
                table2Value3_13.setTextSize(1);
                table2Value3_14.setTextSize(1);
                table2Value3_15.setTextSize(1);
                table2Value3_16.setTextSize(1);
                table2Value3_17.setTextSize(1);
                table2Value3_18.setTextSize(1);
                table2Value3_19.setTextSize(1);
                table2Value3_20.setTextSize(1);

                table2value4Label.setTextSize(1);
                table2Value4_1.setTextSize(1);
                table2Value4_2.setTextSize(1);
                table2Value4_3.setTextSize(1);
                table2Value4_4.setTextSize(1);
                table2Value4_5.setTextSize(1);
                table2Value4_6.setTextSize(1);
                table2Value4_7.setTextSize(1);
                table2Value4_8.setTextSize(1);
                table2Value4_9.setTextSize(1);
                table2Value4_10.setTextSize(1);
                table2Value4_11.setTextSize(1);
                table2Value4_12.setTextSize(1);
                table2Value4_13.setTextSize(1);
                table2Value4_14.setTextSize(1);
                table2Value4_15.setTextSize(1);
                table2Value4_16.setTextSize(1);
                table2Value4_17.setTextSize(1);
                table2Value4_18.setTextSize(1);
                table2Value4_19.setTextSize(1);
                table2Value4_20.setTextSize(1);

                table2.setVisibility(View.INVISIBLE);
                break;

            case("monk"):
                activityTitle.setText(R.string.monk);
                feature1.setText(R.string.monk_1st_lvl_abilities);
                feature2.setText(R.string.monk_2nd_lvl_abilities);
                feature3.setText(R.string.monk_3rd_lvl_abilities);
                feature4.setText(R.string.monk_4th_lvl_abilities);
                feature5.setText(R.string.monk_5th_lvl_abilities);
                feature6.setText(R.string.monk_6th_lvl_abilities);
                feature7.setText(R.string.monk_7th_lvl_abilities);
                feature8.setText(R.string.monk_8th_lvl_abilities);
                feature9.setText(R.string.monk_9th_lvl_abilities);
                feature10.setText(R.string.monk_10th_lvl_abilities);
                feature11.setText(R.string.monk_11th_lvl_abilities);
                feature12.setText(R.string.monk_12th_lvl_abilities);
                feature13.setText(R.string.monk_13th_lvl_abilities);
                feature14.setText(R.string.monk_14th_lvl_abilities);
                feature15.setText(R.string.monk_15th_lvl_abilities);
                feature16.setText(R.string.monk_16th_lvl_abilities);
                feature17.setText(R.string.monk_17th_lvl_abilities);
                feature18.setText(R.string.monk_18th_lvl_abilities);
                feature19.setText(R.string.monk_19th_lvl_abilities);
                feature20.setText(R.string.monk_20th_lvl_abilities);
                //----------------------------------------------------------2nd table

                table2Title.setText(R.string.monk_table2_label);
                table2Title.setTextSize(20);

                table2LvlLabel.setText(R.string.lvl);
                table2value2Label.setText(R.string.monk_table2_value2_label);
                table2Value2_1.setText(R.string.monk_table2_value2_1to4_values);
                table2Value2_2.setText(R.string.monk_table2_value2_1to4_values);
                table2Value2_3.setText(R.string.monk_table2_value2_1to4_values);
                table2Value2_4.setText(R.string.monk_table2_value2_1to4_values);
                table2Value2_5.setText(R.string.monk_table2_value2_5to10_values);
                table2Value2_6.setText(R.string.monk_table2_value2_5to10_values);
                table2Value2_7.setText(R.string.monk_table2_value2_5to10_values);
                table2Value2_8.setText(R.string.monk_table2_value2_5to10_values);
                table2Value2_9.setText(R.string.monk_table2_value2_5to10_values);
                table2Value2_10.setText(R.string.monk_table2_value2_5to10_values);
                table2Value2_11.setText(R.string.monk_table2_value2_11to16_values);
                table2Value2_12.setText(R.string.monk_table2_value2_11to16_values);
                table2Value2_13.setText(R.string.monk_table2_value2_11to16_values);
                table2Value2_14.setText(R.string.monk_table2_value2_11to16_values);
                table2Value2_15.setText(R.string.monk_table2_value2_11to16_values);
                table2Value2_16.setText(R.string.monk_table2_value2_11to16_values);
                table2Value2_17.setText(R.string.monk_table2_value2_17to20_values);
                table2Value2_18.setText(R.string.monk_table2_value2_17to20_values);
                table2Value2_19.setText(R.string.monk_table2_value2_17to20_values);
                table2Value2_20.setText(R.string.monk_table2_value2_17to20_values);


                table2value3Label.setText(R.string.monk_table2_value3_label);
                table2Value3_1.setText(R.string.monk_table2_value3_1values);
                table2Value3_2.setText(R.string.monk_table2_value3_2values);
                table2Value3_3.setText(R.string.monk_table2_value3_3values);
                table2Value3_4.setText(R.string.monk_table2_value3_4values);
                table2Value3_5.setText(R.string.monk_table2_value3_5values);
                table2Value3_6.setText(R.string.monk_table2_value3_6values);
                table2Value3_7.setText(R.string.monk_table2_value3_7values);
                table2Value3_8.setText(R.string.monk_table2_value3_8values);
                table2Value3_9.setText(R.string.monk_table2_value3_9values);
                table2Value3_10.setText(R.string.monk_table2_value3_10values);
                table2Value3_11.setText(R.string.monk_table2_value3_11values);
                table2Value3_12.setText(R.string.monk_table2_value3_12values);
                table2Value3_13.setText(R.string.monk_table2_value3_13values);
                table2Value3_14.setText(R.string.monk_table2_value3_14values);
                table2Value3_15.setText(R.string.monk_table2_value3_15values);
                table2Value3_16.setText(R.string.monk_table2_value3_16values);
                table2Value3_17.setText(R.string.monk_table2_value3_17values);
                table2Value3_18.setText(R.string.monk_table2_value3_18values);
                table2Value3_19.setText(R.string.monk_table2_value3_19values);
                table2Value3_20.setText(R.string.monk_table2_value3_20values);
                break;

            case("paladin"):
                activityTitle.setText(R.string.paladin);
                feature1.setText(R.string.paladin_1st_lvl_abilities);
                feature2.setText(R.string.paladin_2nd_lvl_abilities);
                feature3.setText(R.string.paladin_3rd_lvl_abilities);
                feature4.setText(R.string.paladin_4th_lvl_abilities);
                feature5.setText(R.string.paladin_5th_lvl_abilities);
                feature6.setText(R.string.paladin_6th_lvl_abilities);
                feature7.setText(R.string.paladin_7th_lvl_abilities);
                feature8.setText(R.string.paladin_8th_lvl_abilities);
                feature9.setText(R.string.paladin_9th_lvl_abilities);
                feature10.setText(R.string.paladin_10th_lvl_abilities);
                feature11.setText(R.string.paladin_11th_lvl_abilities);
                feature12.setText(R.string.paladin_12th_lvl_abilities);
                feature13.setText(R.string.paladin_13th_lvl_abilities);
                feature14.setText(R.string.paladin_14th_lvl_abilities);
                feature15.setText(R.string.paladin_15th_lvl_abilities);
                feature16.setText(R.string.paladin_16th_lvl_abilities);
                feature17.setText(R.string.paladin_17th_lvl_abilities);
                feature18.setText(R.string.paladin_18th_lvl_abilities);
                feature19.setText(R.string.paladin_19th_lvl_abilities);
                feature20.setText(R.string.paladin_20th_lvl_abilities);

                //----------------------------------------------------------2nd table
                table2Title.setTextSize(1);
                level1label.setTextSize(1);
                level2label.setTextSize(1);
                level3label.setTextSize(1);
                level4label.setTextSize(1);
                level5label.setTextSize(1);
                level6label.setTextSize(1);
                level7label.setTextSize(1);
                level8label.setTextSize(1);
                level9label.setTextSize(1);
                level10label.setTextSize(1);
                level11label.setTextSize(1);
                level12label.setTextSize(1);
                level13label.setTextSize(1);
                level14label.setTextSize(1);
                level15label.setTextSize(1);
                level16label.setTextSize(1);
                level17label.setTextSize(1);
                level18label.setTextSize(1);
                level19label.setTextSize(1);
                level20label.setTextSize(1);

                table2value2Label.setTextSize(1);
                table2value3Label.setTextSize(1);

                table2Value2_1.setTextSize(1);
                table2Value2_2.setTextSize(1);
                table2Value2_3.setTextSize(1);
                table2Value2_4.setTextSize(1);
                table2Value2_5.setTextSize(1);
                table2Value2_6.setTextSize(1);
                table2Value2_7.setTextSize(1);
                table2Value2_8.setTextSize(1);
                table2Value2_9.setTextSize(1);
                table2Value2_10.setTextSize(1);
                table2Value2_11.setTextSize(1);
                table2Value2_12.setTextSize(1);
                table2Value2_13.setTextSize(1);
                table2Value2_14.setTextSize(1);
                table2Value2_15.setTextSize(1);
                table2Value2_16.setTextSize(1);
                table2Value2_17.setTextSize(1);
                table2Value2_18.setTextSize(1);
                table2Value2_19.setTextSize(1);
                table2Value2_20.setTextSize(1);

                table2Value3_1.setTextSize(1);
                table2Value3_2.setTextSize(1);
                table2Value3_3.setTextSize(1);
                table2Value3_4.setTextSize(1);
                table2Value3_5.setTextSize(1);
                table2Value3_6.setTextSize(1);
                table2Value3_7.setTextSize(1);
                table2Value3_8.setTextSize(1);
                table2Value3_9.setTextSize(1);
                table2Value3_10.setTextSize(1);
                table2Value3_11.setTextSize(1);
                table2Value3_12.setTextSize(1);
                table2Value3_13.setTextSize(1);
                table2Value3_14.setTextSize(1);
                table2Value3_15.setTextSize(1);
                table2Value3_16.setTextSize(1);
                table2Value3_17.setTextSize(1);
                table2Value3_18.setTextSize(1);
                table2Value3_19.setTextSize(1);
                table2Value3_20.setTextSize(1);

                table2value4Label.setTextSize(1);
                table2Value4_1.setTextSize(1);
                table2Value4_2.setTextSize(1);
                table2Value4_3.setTextSize(1);
                table2Value4_4.setTextSize(1);
                table2Value4_5.setTextSize(1);
                table2Value4_6.setTextSize(1);
                table2Value4_7.setTextSize(1);
                table2Value4_8.setTextSize(1);
                table2Value4_9.setTextSize(1);
                table2Value4_10.setTextSize(1);
                table2Value4_11.setTextSize(1);
                table2Value4_12.setTextSize(1);
                table2Value4_13.setTextSize(1);
                table2Value4_14.setTextSize(1);
                table2Value4_15.setTextSize(1);
                table2Value4_16.setTextSize(1);
                table2Value4_17.setTextSize(1);
                table2Value4_18.setTextSize(1);
                table2Value4_19.setTextSize(1);
                table2Value4_20.setTextSize(1);

                table2.setVisibility(View.INVISIBLE);
                break;

            case("ranger"):
                activityTitle.setText(R.string.ranger);
                feature1.setText(R.string.ranger_1st_lvl_abilities);
                feature2.setText(R.string.ranger_2nd_lvl_abilities);
                feature3.setText(R.string.ranger_3rd_lvl_abilities);
                feature4.setText(R.string.ranger_4th_lvl_abilities);
                feature5.setText(R.string.ranger_5th_lvl_abilities);
                feature6.setText(R.string.ranger_6th_lvl_abilities);
                feature7.setText(R.string.ranger_7th_lvl_abilities);
                feature8.setText(R.string.ranger_8th_lvl_abilities);
                feature9.setText(R.string.ranger_9th_lvl_abilities);
                feature10.setText(R.string.ranger_10th_lvl_abilities);
                feature11.setText(R.string.ranger_11th_lvl_abilities);
                feature12.setText(R.string.ranger_12th_lvl_abilities);
                feature13.setText(R.string.ranger_13th_lvl_abilities);
                feature14.setText(R.string.ranger_14th_lvl_abilities);
                feature15.setText(R.string.ranger_15th_lvl_abilities);
                feature16.setText(R.string.ranger_16th_lvl_abilities);
                feature17.setText(R.string.ranger_17th_lvl_abilities);
                feature18.setText(R.string.ranger_18th_lvl_abilities);
                feature19.setText(R.string.ranger_19th_lvl_abilities);
                feature20.setText(R.string.ranger_20th_lvl_abilities);
                //----------------------------------------------------------2nd table

                table2Title.setText(R.string.ranger_table2_label);
                table2Title.setTextSize(20);

                table2LvlLabel.setText(R.string.lvl);
                table2value2Label.setText(R.string.ranger_table2_value2_label);
                table2Value2_1.setText(R.string.ranger_table2_value2_1_values);
                table2Value2_2.setText(R.string.ranger_table2_value2_2_values);
                table2Value2_3.setText(R.string.ranger_table2_value2_3to4_values);
                table2Value2_4.setText(R.string.ranger_table2_value2_3to4_values);
                table2Value2_5.setText(R.string.ranger_table2_value2_5to6_values);
                table2Value2_6.setText(R.string.ranger_table2_value2_5to6_values);
                table2Value2_7.setText(R.string.ranger_table2_value2_7to8_values);
                table2Value2_8.setText(R.string.ranger_table2_value2_7to8_values);
                table2Value2_9.setText(R.string.ranger_table2_value2_9to10_values);
                table2Value2_10.setText(R.string.ranger_table2_value2_9to10_values);
                table2Value2_11.setText(R.string.ranger_table2_value2_11to12_values);
                table2Value2_12.setText(R.string.ranger_table2_value2_11to12_values);
                table2Value2_13.setText(R.string.ranger_table2_value2_13to14_values);
                table2Value2_14.setText(R.string.ranger_table2_value2_13to14_values);
                table2Value2_15.setText(R.string.ranger_table2_value2_15to16_values);
                table2Value2_16.setText(R.string.ranger_table2_value2_15to16_values);
                table2Value2_17.setText(R.string.ranger_table2_value2_17to18_values);
                table2Value2_18.setText(R.string.ranger_table2_value2_17to18_values);
                table2Value2_19.setText(R.string.ranger_table2_value2_19to20_values);
                table2Value2_20.setText(R.string.ranger_table2_value2_19to20_values);
                break;

            case("rogue"):
                activityTitle.setText(R.string.rogue);
                feature1.setText(R.string.rogue_1st_lvl_abilities);
                feature2.setText(R.string.rogue_2nd_lvl_abilities);
                feature3.setText(R.string.rogue_3rd_lvl_abilities);
                feature4.setText(R.string.rogue_4th_lvl_abilities);
                feature5.setText(R.string.rogue_5th_lvl_abilities);
                feature6.setText(R.string.rogue_6th_lvl_abilities);
                feature7.setText(R.string.rogue_7th_lvl_abilities);
                feature8.setText(R.string.rogue_8th_lvl_abilities);
                feature9.setText(R.string.rogue_9th_lvl_abilities);
                feature10.setText(R.string.rogue_10th_lvl_abilities);
                feature11.setText(R.string.rogue_11th_lvl_abilities);
                feature12.setText(R.string.rogue_12th_lvl_abilities);
                feature13.setText(R.string.rogue_13th_lvl_abilities);
                feature14.setText(R.string.rogue_14th_lvl_abilities);
                feature15.setText(R.string.rogue_15th_lvl_abilities);
                feature16.setText(R.string.rogue_16th_lvl_abilities);
                feature17.setText(R.string.rogue_17th_lvl_abilities);
                feature18.setText(R.string.rogue_18th_lvl_abilities);
                feature19.setText(R.string.rogue_19th_lvl_abilities);
                feature20.setText(R.string.rogue_20th_lvl_abilities);
                //----------------------------------------------------------2nd table

                table2Title.setText(R.string.rogue_table2_label);
                table2Title.setTextSize(20);

                table2LvlLabel.setText(R.string.lvl);
                table2value2Label.setText(R.string.rogue_table2_value2_label);
                table2Value2_1.setText(R.string.rogue_table2_value2_1to2_values);
                table2Value2_2.setText(R.string.rogue_table2_value2_1to2_values);
                table2Value2_3.setText(R.string.rogue_table2_value2_3to4_values);
                table2Value2_4.setText(R.string.rogue_table2_value2_3to4_values);
                table2Value2_5.setText(R.string.rogue_table2_value2_5to6_values);
                table2Value2_6.setText(R.string.rogue_table2_value2_5to6_values);
                table2Value2_7.setText(R.string.rogue_table2_value2_7to8_values);
                table2Value2_8.setText(R.string.rogue_table2_value2_7to8_values);
                table2Value2_9.setText(R.string.rogue_table2_value2_9to10_values);
                table2Value2_10.setText(R.string.rogue_table2_value2_9to10_values);
                table2Value2_11.setText(R.string.rogue_table2_value2_11to12_values);
                table2Value2_12.setText(R.string.rogue_table2_value2_11to12_values);
                table2Value2_13.setText(R.string.rogue_table2_value2_13to14_values);
                table2Value2_14.setText(R.string.rogue_table2_value2_13to14_values);
                table2Value2_15.setText(R.string.rogue_table2_value2_15to16_values);
                table2Value2_16.setText(R.string.rogue_table2_value2_15to16_values);
                table2Value2_17.setText(R.string.rogue_table2_value2_17to18_values);
                table2Value2_18.setText(R.string.rogue_table2_value2_17to18_values);
                table2Value2_19.setText(R.string.rogue_table2_value2_19to20_values);
                table2Value2_20.setText(R.string.rogue_table2_value2_19to20_values);
                break;

            case("sorcerer"):
                activityTitle.setText(R.string.sorcerer);
                feature1.setText(R.string.sorcerer_1st_lvl_abilities);
                feature2.setText(R.string.sorcerer_2nd_lvl_abilities);
                feature3.setText(R.string.sorcerer_3rd_lvl_abilities);
                feature4.setText(R.string.sorcerer_4th_lvl_abilities);
                feature5.setText(R.string.sorcerer_5th_lvl_abilities);
                feature6.setText(R.string.sorcerer_6th_lvl_abilities);
                feature7.setText(R.string.sorcerer_7th_lvl_abilities);
                feature8.setText(R.string.sorcerer_8th_lvl_abilities);
                feature9.setText(R.string.sorcerer_9th_lvl_abilities);
                feature10.setText(R.string.sorcerer_10th_lvl_abilities);
                feature11.setText(R.string.sorcerer_11th_lvl_abilities);
                feature12.setText(R.string.sorcerer_12th_lvl_abilities);
                feature13.setText(R.string.sorcerer_13th_lvl_abilities);
                feature14.setText(R.string.sorcerer_14th_lvl_abilities);
                feature15.setText(R.string.sorcerer_15th_lvl_abilities);
                feature16.setText(R.string.sorcerer_16th_lvl_abilities);
                feature17.setText(R.string.sorcerer_17th_lvl_abilities);
                feature18.setText(R.string.sorcerer_18th_lvl_abilities);
                feature19.setText(R.string.sorcerer_19th_lvl_abilities);
                feature20.setText(R.string.sorcerer_20th_lvl_abilities);
                //----------------------------------------------------------2nd table

                table2Title.setText(R.string.sorcerer_table2_label);
                table2Title.setTextSize(20);

                table2LvlLabel.setText(R.string.lvl);
                table2value2Label.setText(R.string.sorcerer_table2_value2_label);
                table2Value2_1.setText(R.string.sorcerer_table2_value2_1);
                table2Value2_2.setText(R.string.sorcerer_table2_value2_2);
                table2Value2_3.setText(R.string.sorcerer_table2_value2_3);
                table2Value2_4.setText(R.string.sorcerer_table2_value2_4);
                table2Value2_5.setText(R.string.sorcerer_table2_value2_5);
                table2Value2_6.setText(R.string.sorcerer_table2_value2_6);
                table2Value2_7.setText(R.string.sorcerer_table2_value2_7);
                table2Value2_8.setText(R.string.sorcerer_table2_value2_8);
                table2Value2_9.setText(R.string.sorcerer_table2_value2_9);
                table2Value2_10.setText(R.string.sorcerer_table2_value2_10);
                table2Value2_11.setText(R.string.sorcerer_table2_value2_11);
                table2Value2_12.setText(R.string.sorcerer_table2_value2_12);
                table2Value2_13.setText(R.string.sorcerer_table2_value2_13);
                table2Value2_14.setText(R.string.sorcerer_table2_value2_14);
                table2Value2_15.setText(R.string.sorcerer_table2_value2_15);
                table2Value2_16.setText(R.string.sorcerer_table2_value2_16);
                table2Value2_17.setText(R.string.sorcerer_table2_value2_17);
                table2Value2_18.setText(R.string.sorcerer_table2_value2_18);
                table2Value2_19.setText(R.string.sorcerer_table2_value2_19);
                table2Value2_20.setText(R.string.sorcerer_table2_value2_20);


                table2value3Label.setText(R.string.sorcerer_table2_value3_label);
                table2Value3_1.setText(R.string.sorcerer_table2_value3_1to3_values);
                table2Value3_2.setText(R.string.sorcerer_table2_value3_1to3_values);
                table2Value3_3.setText(R.string.sorcerer_table2_value3_1to3_values);
                table2Value3_4.setText(R.string.sorcerer_table2_value3_4to9_values);
                table2Value3_5.setText(R.string.sorcerer_table2_value3_4to9_values);
                table2Value3_6.setText(R.string.sorcerer_table2_value3_4to9_values);
                table2Value3_7.setText(R.string.sorcerer_table2_value3_4to9_values);
                table2Value3_8.setText(R.string.sorcerer_table2_value3_4to9_values);
                table2Value3_9.setText(R.string.sorcerer_table2_value3_4to9_values);
                table2Value3_10.setText(R.string.sorcerer_table2_value3_10to20_values);
                table2Value3_11.setText(R.string.sorcerer_table2_value3_10to20_values);
                table2Value3_12.setText(R.string.sorcerer_table2_value3_10to20_values);
                table2Value3_13.setText(R.string.sorcerer_table2_value3_10to20_values);
                table2Value3_14.setText(R.string.sorcerer_table2_value3_10to20_values);
                table2Value3_15.setText(R.string.sorcerer_table2_value3_10to20_values);
                table2Value3_16.setText(R.string.sorcerer_table2_value3_10to20_values);
                table2Value3_17.setText(R.string.sorcerer_table2_value3_10to20_values);
                table2Value3_18.setText(R.string.sorcerer_table2_value3_10to20_values);
                table2Value3_19.setText(R.string.sorcerer_table2_value3_10to20_values);
                table2Value3_20.setText(R.string.sorcerer_table2_value3_10to20_values);

                table2value4Label.setText(R.string.sorcerer_table2_value4_label);
                table2Value4_1.setText(R.string.sorcerer_table2_value4_1values);
                table2Value4_2.setText(R.string.sorcerer_table2_value4_2values);
                table2Value4_3.setText(R.string.sorcerer_table2_value4_3values);
                table2Value4_4.setText(R.string.sorcerer_table2_value4_4values);
                table2Value4_5.setText(R.string.sorcerer_table2_value4_5values);
                table2Value4_6.setText(R.string.sorcerer_table2_value4_6values);
                table2Value4_7.setText(R.string.sorcerer_table2_value4_7values);
                table2Value4_8.setText(R.string.sorcerer_table2_value4_8values);
                table2Value4_9.setText(R.string.sorcerer_table2_value4_9values);
                table2Value4_10.setText(R.string.sorcerer_table2_value4_10values);
                table2Value4_11.setText(R.string.sorcerer_table2_value4_11to12values);
                table2Value4_12.setText(R.string.sorcerer_table2_value4_11to12values);
                table2Value4_13.setText(R.string.sorcerer_table2_value4_13to14values);
                table2Value4_14.setText(R.string.sorcerer_table2_value4_13to14values);
                table2Value4_15.setText(R.string.sorcerer_table2_value4_15to16values);
                table2Value4_16.setText(R.string.sorcerer_table2_value4_15to16values);
                table2Value4_17.setText(R.string.sorcerer_table2_value4_17to20values);
                table2Value4_18.setText(R.string.sorcerer_table2_value4_17to20values);
                table2Value4_19.setText(R.string.sorcerer_table2_value4_17to20values);
                table2Value4_20.setText(R.string.sorcerer_table2_value4_17to20values);


                break;

            case("warlock"):
                activityTitle.setText(R.string.warlock);
                feature1.setText(R.string.warlock_1st_lvl_abilities);
                feature2.setText(R.string.warlock_2nd_lvl_abilities);
                feature3.setText(R.string.warlock_3rd_lvl_abilities);
                feature4.setText(R.string.warlock_4th_lvl_abilities);
                feature5.setText(R.string.warlock_5th_lvl_abilities);
                feature6.setText(R.string.warlock_6th_lvl_abilities);
                feature7.setText(R.string.warlock_7th_lvl_abilities);
                feature8.setText(R.string.warlock_8th_lvl_abilities);
                feature9.setText(R.string.warlock_9th_lvl_abilities);
                feature10.setText(R.string.warlock_10th_lvl_abilities);
                feature11.setText(R.string.warlock_11th_lvl_abilities);
                feature12.setText(R.string.warlock_12th_lvl_abilities);
                feature13.setText(R.string.warlock_13th_lvl_abilities);
                feature14.setText(R.string.warlock_14th_lvl_abilities);
                feature15.setText(R.string.warlock_15th_lvl_abilities);
                feature16.setText(R.string.warlock_16th_lvl_abilities);
                feature17.setText(R.string.warlock_17th_lvl_abilities);
                feature18.setText(R.string.warlock_18th_lvl_abilities);
                feature19.setText(R.string.warlock_19th_lvl_abilities);
                feature20.setText(R.string.warlock_20th_lvl_abilities);
                //----------------------------------------------------------2nd table

                table2Title.setText(R.string.warlock_table2_label);
                table2Title.setTextSize(20);

                table2LvlLabel.setText(R.string.lvl);
                table2value2Label.setText(R.string.warlock_table2_value2_label);
                table2Value2_1.setText(R.string.warlock_table2_value2_1);
                table2Value2_2.setText(R.string.warlock_table2_value2_2to4);
                table2Value2_3.setText(R.string.warlock_table2_value2_2to4);
                table2Value2_4.setText(R.string.warlock_table2_value2_2to4);
                table2Value2_5.setText(R.string.warlock_table2_value2_5to6);
                table2Value2_6.setText(R.string.warlock_table2_value2_5to6);
                table2Value2_7.setText(R.string.warlock_table2_value2_7to8);
                table2Value2_8.setText(R.string.warlock_table2_value2_7to8);
                table2Value2_9.setText(R.string.warlock_table2_value2_9to11);
                table2Value2_10.setText(R.string.warlock_table2_value2_9to11);
                table2Value2_11.setText(R.string.warlock_table2_value2_9to11);
                table2Value2_12.setText(R.string.warlock_table2_value2_12to14);
                table2Value2_13.setText(R.string.warlock_table2_value2_12to14);
                table2Value2_14.setText(R.string.warlock_table2_value2_12to14);
                table2Value2_15.setText(R.string.warlock_table2_value2_15to17);
                table2Value2_16.setText(R.string.warlock_table2_value2_15to17);
                table2Value2_17.setText(R.string.warlock_table2_value2_15to17);
                table2Value2_18.setText(R.string.warlock_table2_value2_18to20);
                table2Value2_19.setText(R.string.warlock_table2_value2_18to20);
                table2Value2_20.setText(R.string.warlock_table2_value2_18to20);


                table2value3Label.setText(R.string.warlock_table2_value3_label);
                table2Value3_1.setText(R.string.warlock_table2_value3_1to3_values);
                table2Value3_2.setText(R.string.warlock_table2_value3_1to3_values);
                table2Value3_3.setText(R.string.warlock_table2_value3_1to3_values);
                table2Value3_4.setText(R.string.warlock_table2_value3_4to9_values);
                table2Value3_5.setText(R.string.warlock_table2_value3_4to9_values);
                table2Value3_6.setText(R.string.warlock_table2_value3_4to9_values);
                table2Value3_7.setText(R.string.warlock_table2_value3_4to9_values);
                table2Value3_8.setText(R.string.warlock_table2_value3_4to9_values);
                table2Value3_9.setText(R.string.warlock_table2_value3_4to9_values);
                table2Value3_10.setText(R.string.warlock_table2_value3_10to20_values);
                table2Value3_11.setText(R.string.warlock_table2_value3_10to20_values);
                table2Value3_12.setText(R.string.warlock_table2_value3_10to20_values);
                table2Value3_13.setText(R.string.warlock_table2_value3_10to20_values);
                table2Value3_14.setText(R.string.warlock_table2_value3_10to20_values);
                table2Value3_15.setText(R.string.warlock_table2_value3_10to20_values);
                table2Value3_16.setText(R.string.warlock_table2_value3_10to20_values);
                table2Value3_17.setText(R.string.warlock_table2_value3_10to20_values);
                table2Value3_18.setText(R.string.warlock_table2_value3_10to20_values);
                table2Value3_19.setText(R.string.warlock_table2_value3_10to20_values);
                table2Value3_20.setText(R.string.warlock_table2_value3_10to20_values);

                table2value4Label.setText(R.string.warlock_table2_value4_label);
                table2Value4_1.setText(R.string.warlock_table2_value4_1values);
                table2Value4_2.setText(R.string.warlock_table2_value4_2values);
                table2Value4_3.setText(R.string.warlock_table2_value4_3values);
                table2Value4_4.setText(R.string.warlock_table2_value4_4values);
                table2Value4_5.setText(R.string.warlock_table2_value4_5values);
                table2Value4_6.setText(R.string.warlock_table2_value4_6values);
                table2Value4_7.setText(R.string.warlock_table2_value4_7values);
                table2Value4_8.setText(R.string.warlock_table2_value4_8values);
                table2Value4_9.setText(R.string.warlock_table2_value4_9to10_values);
                table2Value4_10.setText(R.string.warlock_table2_value4_9to10_values);
                table2Value4_11.setText(R.string.warlock_table2_value4_11to12values);
                table2Value4_12.setText(R.string.warlock_table2_value4_11to12values);
                table2Value4_13.setText(R.string.warlock_table2_value4_13to14values);
                table2Value4_14.setText(R.string.warlock_table2_value4_13to14values);
                table2Value4_15.setText(R.string.warlock_table2_value4_15to16values);
                table2Value4_16.setText(R.string.warlock_table2_value4_15to16values);
                table2Value4_17.setText(R.string.warlock_table2_value4_17to18values);
                table2Value4_18.setText(R.string.warlock_table2_value4_17to18values);
                table2Value4_19.setText(R.string.warlock_table2_value4_19to20values);
                table2Value4_20.setText(R.string.warlock_table2_value4_19to20values);
                break;

            case("wizard"):
                nextButton.setVisibility(View.INVISIBLE);
                activityTitle.setText(R.string.wizard);
                feature1.setText(R.string.wizard_1st_lvl_abilities);
                feature2.setText(R.string.wizard_2nd_lvl_abilities);
                feature3.setText(R.string.wizard_3rd_lvl_abilities);
                feature4.setText(R.string.wizard_4th_lvl_abilities);
                feature5.setText(R.string.wizard_5th_lvl_abilities);
                feature6.setText(R.string.wizard_6th_lvl_abilities);
                feature7.setText(R.string.wizard_7th_lvl_abilities);
                feature8.setText(R.string.wizard_8th_lvl_abilities);
                feature9.setText(R.string.wizard_9th_lvl_abilities);
                feature10.setText(R.string.wizard_10th_lvl_abilities);
                feature11.setText(R.string.wizard_11th_lvl_abilities);
                feature12.setText(R.string.wizard_12th_lvl_abilities);
                feature13.setText(R.string.wizard_13th_lvl_abilities);
                feature14.setText(R.string.wizard_14th_lvl_abilities);
                feature15.setText(R.string.wizard_15th_lvl_abilities);
                feature16.setText(R.string.wizard_16th_lvl_abilities);
                feature17.setText(R.string.wizard_17th_lvl_abilities);
                feature18.setText(R.string.wizard_18th_lvl_abilities);
                feature19.setText(R.string.wizard_19th_lvl_abilities);
                feature20.setText(R.string.wizard_20th_lvl_abilities);
                //----------------------------------------------------------2nd table

                table2Title.setText(R.string.wizard_table2_label);
                table2Title.setTextSize(20);

                table2LvlLabel.setText(R.string.lvl);
                table2value2Label.setText(R.string.wizard_table2_value2_label);
                table2Value2_1.setText(R.string.wizard_table2_value2_1to3_values);
                table2Value2_2.setText(R.string.wizard_table2_value2_1to3_values);
                table2Value2_3.setText(R.string.wizard_table2_value2_1to3_values);
                table2Value2_4.setText(R.string.wizard_table2_value2_4to9_values);
                table2Value2_5.setText(R.string.wizard_table2_value2_4to9_values);
                table2Value2_6.setText(R.string.wizard_table2_value2_4to9_values);
                table2Value2_7.setText(R.string.wizard_table2_value2_4to9_values);
                table2Value2_8.setText(R.string.wizard_table2_value2_4to9_values);
                table2Value2_9.setText(R.string.wizard_table2_value2_4to9_values);
                table2Value2_10.setText(R.string.wizard_table2_value2_10to20_values);
                table2Value2_11.setText(R.string.wizard_table2_value2_10to20_values);
                table2Value2_12.setText(R.string.wizard_table2_value2_10to20_values);
                table2Value2_13.setText(R.string.wizard_table2_value2_10to20_values);
                table2Value2_14.setText(R.string.wizard_table2_value2_10to20_values);
                table2Value2_15.setText(R.string.wizard_table2_value2_10to20_values);
                table2Value2_16.setText(R.string.wizard_table2_value2_10to20_values);
                table2Value2_17.setText(R.string.wizard_table2_value2_10to20_values);
                table2Value2_18.setText(R.string.wizard_table2_value2_10to20_values);
                table2Value2_19.setText(R.string.wizard_table2_value2_10to20_values);
                table2Value2_20.setText(R.string.wizard_table2_value2_10to20_values);
                break;

        }

        //Sweep Screen - got to setOnTouchListener to existin label (layout) deciding which area should be listen for touch events
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
                    Intent newIntent = new Intent(getApplicationContext(), ClassOverviewUniversalActivity.class);
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
                    Intent newIntent = new Intent(getApplicationContext(), ClassFeatures.class);
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
        Intent newIntent = new Intent(getApplicationContext(), ClassAbiltiesOverview.class);

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

        Intent newIntent = new Intent(getApplicationContext(), ClassAbiltiesOverview.class);
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
