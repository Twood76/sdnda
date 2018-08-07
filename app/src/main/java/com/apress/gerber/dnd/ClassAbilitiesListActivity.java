package com.apress.gerber.dnd;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;

public class ClassAbilitiesListActivity extends AppCompatActivity {

    //Variables for Sweeper
    ScrollView myLayout = null;
    private float x1;
    private float x2;
    private float y1;
    private float y2;
    private boolean beeingUsed = true;
    String whichClass = "asd";
    String whichSchool = "";


    //end of SweepVariables

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_abilities_list);
        whichClass = getIntent().getStringExtra("whichClass");

        TextView activityTitle = findViewById(R.id.ActivityTitle);


        Space spaceAboveLvl1 = findViewById(R.id.spaceAbove1stLvlLabel);
        TextView lvl1label = findViewById(R.id.lvl1Abilities);
        Button ability1_1 = findViewById(R.id.abilityButton1_1);
        TextView abilityDescription1_1 = findViewById(R.id.abilityDescription1_1);
        Space spaceBetweenButtons1 = findViewById(R.id.spaceBetweenButtonsLvl1);
        Button ability1_2 = findViewById(R.id.abilityButton1_2);
        TextView abilityDescription1_2 = findViewById(R.id.abilityDescription1_2);
        Space spaceBetweenButtons1_2 = findViewById(R.id.spaceBetweenButtonsLvl1_2);
        Button ability1_3 = findViewById(R.id.abilityButton1_3);
        TextView abilityDescription1_3 = findViewById(R.id.abilityDescription1_3);
        Space spaceBelowLvl1 = findViewById(R.id.spaceBelow1stLvlLabel);

        Space spaceAboveLvl2 = findViewById(R.id.spaceAbove2ndLvlLabel);
        TextView lvl2label = findViewById(R.id.lvl2Abilities);
        Button ability2_1 = findViewById(R.id.abilityButton2_1);
        TextView abilityDescription2_1 = findViewById(R.id.abilityDescription2_1);
        Space spaceBetweenButtons2 = findViewById(R.id.spaceBetweenButtonsLvl2);
        Button ability2_2 = findViewById(R.id.abilityButton2_2);
        TextView abilityDescription2_2 = findViewById(R.id.abilityDescription2_2);
        Space spaceBelowLvl2 = findViewById(R.id.spaceBelow2ndLvlLabel);


        Space spaceAboveLvl3 = findViewById(R.id.spaceAbove3rdLvlLabel);
        TextView lvl3label = findViewById(R.id.lvl3Abilities);
        Button ability3_1 = findViewById(R.id.abilityButton3_1);
        TextView abilityDescription3_1 = findViewById(R.id.abilityDescription3_1);


        Space spaceAboveLvl4 = findViewById(R.id.spaceAbove4thLvlLabel);
        TextView lvl4label = findViewById(R.id.lvl4Abilities);
        Button ability4_1 = findViewById(R.id.abilityButton4_1);
        Space spaceBelowLvl4 = findViewById(R.id.spaceBelow4thLvlLabel);
        TextView abilityDescription4_1 = findViewById(R.id.abilityDescription4_1);


        Space spaceAboveLvl5 = findViewById(R.id.spaceAbove5thLvlLabel);
        TextView lvl5label = findViewById(R.id.lvl5Abilities);
        Button ability5_1 = findViewById(R.id.abilityButton5_1);
        Space spaceBelowLvl5 = findViewById(R.id.spaceBelow5thLvlLabel);
        TextView abilityDescription5_1 = findViewById(R.id.abilityDescription5_1);


        Space spaceAboveLvl6 = findViewById(R.id.spaceAbove6thLvlLabel);
        TextView lvl6label = findViewById(R.id.lvl6Abilities);
        Button ability6_1 = findViewById(R.id.abilityButton6_1);
        Space spaceBelowLvl6 = findViewById(R.id.spaceBelow6thLvlLabel);
        TextView abilityDescription6_1 = findViewById(R.id.abilityDescription6_1);


        Space spaceAboveLvl7 = findViewById(R.id.spaceAbove7thLvlLabel);
        TextView lvl7label = findViewById(R.id.lvl7Abilities);
        Button ability7_1 = findViewById(R.id.abilityButton7_1);
        TextView abilityDescription7_1 = findViewById(R.id.abilityDescription7_1);
        Space spaceBetweenButtons7 = findViewById(R.id.spaceBetweenButtonsLvl7);
        TextView abilityDescription7_2 = findViewById(R.id.abilityDescription7_2);
        Button ability7_2 = findViewById(R.id.abilityButton7_2);
        Space spaceBelowLvl7 = findViewById(R.id.spaceBelow7thLvlLabel);


        Space spaceAboveLvl8 = findViewById(R.id.spaceAbove8thLvlLabel);
        TextView lvl8label = findViewById(R.id.lvl8Abilities);
        Button ability8_1 = findViewById(R.id.abilityButton8_1);
        Space spaceBelowLvl8 = findViewById(R.id.spaceBelow8thLvlLabel);
        TextView abilityDescription8_1 = findViewById(R.id.abilityDescription8_1);

        Space spaceAboveLvl9 = findViewById(R.id.spaceAbove9thLvlLabel);
        TextView lvl9label = findViewById(R.id.lvl9Abilities);
        Button ability9_1 = findViewById(R.id.abilityButton9_1);
        Space spaceBelowLvl9 = findViewById(R.id.spaceBelow9thLvlLabel);
        TextView abilityDescription9_1 = findViewById(R.id.abilityDescription9_1);


        Space spaceAboveLvl10 = findViewById(R.id.spaceAbove10thLvlLabel);
        TextView lvl10label = findViewById(R.id.lvl10Abilities);
        Button ability10_1 = findViewById(R.id.abilityButton10_1);
        Space spaceBelowLvl10 = findViewById(R.id.spaceBelow10thLvlLabel);
        TextView abilityDescription10_1 = findViewById(R.id.abilityDescription10_1);


        Space spaceAboveLvl11 = findViewById(R.id.spaceAbove11thLvlLabel);
        TextView lvl11label = findViewById(R.id.lvl11Abilities);
        Button ability11_1 = findViewById(R.id.abilityButton11_1);
        Space spaceBelowLvl11 = findViewById(R.id.spaceBelow11thLvlLabel);
        TextView abilityDescription11_1 = findViewById(R.id.abilityDescription11_1);

        Space spaceAboveLvl13 = findViewById(R.id.spaceAbove13thLvlLabel);
        TextView lvl13label = findViewById(R.id.lvl13Abilities);
        Button ability13_1 = findViewById(R.id.abilityButton13_1);
        Space spaceBelowLvl13 = findViewById(R.id.spaceBelow13thLvlLabel);
        TextView abilityDescription13_1 = findViewById(R.id.abilityDescription13_1);


        Space spaceAboveLvl14 = findViewById(R.id.spaceAbove14thLvlLabel);
        TextView lvl14label = findViewById(R.id.lvl14Abilities);
        Button ability14_1 = findViewById(R.id.abilityButton14_1);
        Space spaceBelowLvl14 = findViewById(R.id.spaceBelow14thLvlLabel);
        TextView abilityDescription14_1 = findViewById(R.id.abilityDescription14_1);


        Space spaceAboveLvl15 = findViewById(R.id.spaceAbove15thLvlLabel);
        TextView lvl15label = findViewById(R.id.lvl15Abilities);
        Button ability15_1 = findViewById(R.id.abilityButton15_1);
        Space spaceBelowLvl15 = findViewById(R.id.spaceBelow15thLvlLabel);
        TextView abilityDescription15_1 = findViewById(R.id.abilityDescription15_1);


        Space spaceAboveLvl18 = findViewById(R.id.spaceAbove18thLvlLabel);
        TextView lvl18label = findViewById(R.id.lvl18Abilities);
        Button ability18_1 = findViewById(R.id.abilityButton18_1);
        TextView abilityDescription18_1 = findViewById(R.id.abilityDescription18_1);
        Space spaceBetweenButtons18 = findViewById(R.id.spaceBetweenButtonsLvl18);
        TextView abilityDescription18_2 = findViewById(R.id.abilityDescription18_2);
        Button ability18_2 = findViewById(R.id.abilityButton18_2);
        Space spaceBelowLvl18 = findViewById(R.id.spaceBelow18thLvlLabel);


        Space spaceAboveLvl20 = findViewById(R.id.spaceAbove20thLvlLabel);
        TextView lvl20label = findViewById(R.id.lvl20Abilities);
        Button ability20_1 = findViewById(R.id.abilityButton20_1);
        Space spaceBelowLvl20 = findViewById(R.id.spaceBelow20thLvlLabel);
        TextView abilityDescription20_1 = findViewById(R.id.abilityDescription20_1);


        TextView classSchoolTitle = findViewById(R.id.ClassSchoolsTitle);
        TextView classSchoolDescription = findViewById(R.id.ClassSchoolsDescription);

        TextView chosenClassSchoolTitle = findViewById(R.id.chosenClassSchoolTitle);
        TextView chosenClassSchoolDescription = findViewById(R.id.chosenClassSchoolsDescription);


        Button classSchoolButton1 = findViewById(R.id.abilityCassSchoolButton1);
        Space spaceBelowClassSchool1 = findViewById(R.id.spaceBelowClassSchool1);
        Button classSchoolButton2 = findViewById(R.id.abilityCassSchoolButton2);
        Space spaceBelowClassSchool2 = findViewById(R.id.spaceBelowClassSchool2);
        Button classSchoolButton3 = findViewById(R.id.abilityCassSchoolButton3);
        Space spaceBelowClassSchool3 = findViewById(R.id.spaceBelowClassSchool3);
        Button classSchoolButton4 = findViewById(R.id.abilityCassSchoolButton4);
        Space spaceBelowClassSchool4 = findViewById(R.id.spaceBelowClassSchool4);
        Button classSchoolButton5 = findViewById(R.id.abilityCassSchoolButton5);
        Space spaceBelowClassSchool5 = findViewById(R.id.spaceBelowClassSchool5);
        Button classSchoolButton6 = findViewById(R.id.abilityCassSchoolButton6);
        Space spaceBelowClassSchool6 = findViewById(R.id.spaceBelowClassSchool6);
        Button classSchoolButton7 = findViewById(R.id.abilityCassSchoolButton7);
        Space spaceBelowClassSchool7 = findViewById(R.id.spaceBelowClassSchool7);
        Button classSchoolButton8 = findViewById(R.id.abilityCassSchoolButton8);

        abilityDescription1_1.setTextSize(0);
        abilityDescription1_2.setTextSize(0);
        abilityDescription1_3.setTextSize(0);
        abilityDescription2_1.setTextSize(0);
        abilityDescription2_2.setTextSize(0);
        abilityDescription3_1.setTextSize(0);
        abilityDescription4_1.setTextSize(0);
        abilityDescription5_1.setTextSize(0);
        abilityDescription6_1.setTextSize(0);
        abilityDescription7_1.setTextSize(0);
        abilityDescription7_2.setTextSize(0);
        abilityDescription8_1.setTextSize(0);
        abilityDescription9_1.setTextSize(0);
        abilityDescription10_1.setTextSize(0);
        abilityDescription11_1.setTextSize(0);
        abilityDescription13_1.setTextSize(0);
        abilityDescription14_1.setTextSize(0);
        abilityDescription15_1.setTextSize(0);
        abilityDescription18_1.setTextSize(0);
        abilityDescription18_2.setTextSize(0);
        abilityDescription20_1.setTextSize(0);

        spaceBelowClassSchool1.getLayoutParams().height = 0;
        spaceBelowClassSchool2.getLayoutParams().height = 0;
        spaceBelowClassSchool3.getLayoutParams().height = 0;
        spaceBelowClassSchool4.getLayoutParams().height = 0;
        spaceBelowClassSchool5.getLayoutParams().height = 0;
        spaceBelowClassSchool6.getLayoutParams().height = 0;
        spaceBelowClassSchool7.getLayoutParams().height = 0;

        chosenClassSchoolTitle.setTextSize(0);
        chosenClassSchoolDescription.setTextSize(0);

        Space spaceAbove1stLvlLabelSchools = findViewById(R.id.spaceAbove1stLvlLabelSchools);
        TextView lvl1AbilitiesSchools = findViewById(R.id.lvl1AbilitiesSchools);
        Space spaceBelow1stLvlLabelSchools = findViewById(R.id.spaceBelow1stLvlLabelSchools);
        Button abilityButton1_1Schools = findViewById(R.id.abilityButton1_1Schools);
        TextView abilityDescription1_1Schools = findViewById(R.id.abilityDescription1_1Schools);

        spaceAbove1stLvlLabelSchools.getLayoutParams().height = 0;
        lvl1AbilitiesSchools.setTextSize(0);
        spaceBelow1stLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton1_1Schools.getLayoutParams().height = 0;
        abilityDescription1_1Schools.setTextSize(0);

        Space spaceBetween1stLvlLabelSchools = findViewById(R.id.spaceBetween1stLvlLabelSchools);
        Button abilityButton1_2Schools = findViewById(R.id.abilityButton1_2Schools);
        TextView abilityDescription1_2Schools = findViewById(R.id.abilityDescription1_2Schools);

        spaceBetween1stLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton1_2Schools.getLayoutParams().height = 0;
        abilityDescription1_2Schools.setTextSize(0);

        Space spaceAbove2ndLvlLabelSchools = findViewById(R.id.spaceAbove2ndLvlLabelSchools);
        TextView lvl2AbilitiesSchools = findViewById(R.id.lvl2AbilitiesSchools);
        Space spaceBelow2ndLvlLabelSchools = findViewById(R.id.spaceBelow2ndLvlLabelSchools);
        Button abilityButton2_1Schools = findViewById(R.id.abilityButton2_1Schools);
        TextView abilityDescription2_1Schools = findViewById(R.id.abilityDescription2_1Schools);

        spaceAbove2ndLvlLabelSchools.getLayoutParams().height = 0;
        lvl2AbilitiesSchools.setTextSize(0);
        spaceBelow2ndLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton2_1Schools.getLayoutParams().height = 0;
        abilityDescription2_1Schools.setTextSize(0);

        Space spaceBetween2ndLvlLabelSchools = findViewById(R.id.spaceBetween2ndLvlLabelSchools);
        Button abilityButton2_2Schools = findViewById(R.id.abilityButton2_2Schools);
        TextView abilityDescription2_2Schools = findViewById(R.id.abilityDescription2_2Schools);
        spaceBetween2ndLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton2_2Schools.getLayoutParams().height = 0;
        abilityDescription2_2Schools.setTextSize(0);



        Space spaceAbove3rdLvlLabelSchools = findViewById(R.id.spaceAbove3rdLvlLabelSchools);
        TextView lvl3AbilitiesSchools = findViewById(R.id.lvl3AbilitiesSchools);
        Space spaceBelow3rdLvlLabelSchools = findViewById(R.id.spaceBelow3rdLvlLabelSchools);
        Button abilityButton3_1Schools = findViewById(R.id.abilityButton3_1Schools);
        TextView abilityDescription3_1Schools = findViewById(R.id.abilityDescription3_1Schools);

        Space spaceBetweenLvl3ButtonSchools = findViewById(R.id.spaceBetween3LvlButtonsSchools);
        Button abilityButton3_2Schools = findViewById(R.id.abilityButton3_2Schools);
        TextView abilityDescription3_2Schools = findViewById(R.id.abilityDescription3_2Schools);

        spaceAbove3rdLvlLabelSchools.getLayoutParams().height = 0;
        lvl3AbilitiesSchools.setTextSize(0);
        spaceBelow3rdLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton3_1Schools.getLayoutParams().height = 0;
        abilityDescription3_1Schools.setTextSize(0);

        spaceBetweenLvl3ButtonSchools.getLayoutParams().height = 0;
        abilityButton3_2Schools.getLayoutParams().height = 0;
        abilityDescription3_2Schools.setTextSize(0);

        Space spaceAbove6thLvlLabelSchools = findViewById(R.id.spaceAbove6thLvlLabelSchools);
        TextView lvl6AbilitiesSchools = findViewById(R.id.lvl6AbilitiesSchools);
        Space spaceBelow6thLvlLabelSchools = findViewById(R.id.spaceBelow6thLvlLabelSchools);
        Button abilityButton6_1Schools = findViewById(R.id.abilityButton6_1Schools);
        TextView abilityDescription6_1Schools = findViewById(R.id.abilityDescription6_1Schools);

        spaceAbove6thLvlLabelSchools.getLayoutParams().height = 0;
        lvl6AbilitiesSchools.setTextSize(0);
        spaceBelow6thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton6_1Schools.getLayoutParams().height = 0;
        abilityDescription6_1Schools.setTextSize(0);

        Space spaceAbove7thLvlLabelSchools = findViewById(R.id.spaceAbove7thLvlLabelSchools);
        TextView lvl7AbilitiesSchools = findViewById(R.id.lvl7AbilitiesSchools);
        Space spaceBelow7thLvlLabelSchools = findViewById(R.id.spaceBelow7thLvlLabelSchools);
        Button abilityButton7_1Schools = findViewById(R.id.abilityButton7_1Schools);
        TextView abilityDescription7_1Schools = findViewById(R.id.abilityDescription7_1Schools);

        spaceAbove7thLvlLabelSchools.getLayoutParams().height = 0;
        lvl7AbilitiesSchools.setTextSize(0);
        spaceBelow7thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton7_1Schools.getLayoutParams().height = 0;
        abilityDescription7_1Schools.setTextSize(0);

        Space spaceAbove8thLvlLabelSchools = findViewById(R.id.spaceAbove8thLvlLabelSchools);
        TextView lvl8AbilitiesSchools = findViewById(R.id.lvl8AbilitiesSchools);
        Space spaceBelow8thLvlLabelSchools = findViewById(R.id.spaceBelow8thLvlLabelSchools);
        Button abilityButton8_1Schools = findViewById(R.id.abilityButton8_1Schools);
        TextView abilityDescription8_1Schools = findViewById(R.id.abilityDescription8_1Schools);

        spaceAbove8thLvlLabelSchools.getLayoutParams().height = 0;
        lvl8AbilitiesSchools.setTextSize(0);
        spaceBelow8thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton8_1Schools.getLayoutParams().height = 0;
        abilityDescription8_1Schools.setTextSize(0);

        Space spaceAbove9thLvlLabelSchools = findViewById(R.id.spaceAbove9thLvlLabelSchools);
        TextView lvl9AbilitiesSchools = findViewById(R.id.lvl9AbilitiesSchools);
        Space spaceBelow9thLvlLabelSchools = findViewById(R.id.spaceBelow9thLvlLabelSchools);
        Button abilityButton9_1Schools = findViewById(R.id.abilityButton9_1Schools);
        TextView abilityDescription9_1Schools = findViewById(R.id.abilityDescription9_1Schools);

        spaceAbove9thLvlLabelSchools.getLayoutParams().height = 0;
        lvl9AbilitiesSchools.setTextSize(0);
        spaceBelow9thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton9_1Schools.getLayoutParams().height = 0;
        abilityDescription9_1Schools.setTextSize(0);

        Space spaceAbove10thLvlLabelSchools = findViewById(R.id.spaceAbove10thLvlLabelSchools);
        TextView lvl10AbilitiesSchools = findViewById(R.id.lvl10AbilitiesSchools);
        Space spaceBelow10thLvlLabelSchools = findViewById(R.id.spaceBelow10thLvlLabelSchools);
        Button abilityButton10_1Schools = findViewById(R.id.abilityButton10_1Schools);
        TextView abilityDescription10_1Schools = findViewById(R.id.abilityDescription10_1Schools);

        spaceAbove10thLvlLabelSchools.getLayoutParams().height = 0;
        lvl10AbilitiesSchools.setTextSize(0);
        spaceBelow10thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton10_1Schools.getLayoutParams().height = 0;
        abilityDescription10_1Schools.setTextSize(0);

        Space spaceAbove11thLvlLabelSchools = findViewById(R.id.spaceAbove11thLvlLabelSchools);
        TextView lvl11AbilitiesSchools = findViewById(R.id.lvl11AbilitiesSchools);
        Space spaceBelow11thLvlLabelSchools = findViewById(R.id.spaceBelow11thLvlLabelSchools);
        Button abilityButton11_1Schools = findViewById(R.id.abilityButton11_1Schools);
        TextView abilityDescription11_1Schools = findViewById(R.id.abilityDescription11_1Schools);

        spaceAbove11thLvlLabelSchools.getLayoutParams().height = 0;
        lvl11AbilitiesSchools.setTextSize(0);
        spaceBelow11thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton11_1Schools.getLayoutParams().height = 0;
        abilityDescription11_1Schools.setTextSize(0);

        Space spaceAbove13thLvlLabelSchools = findViewById(R.id.spaceAbove13thLvlLabelSchools);
        TextView lvl13AbilitiesSchools = findViewById(R.id.lvl13AbilitiesSchools);
        Space spaceBelow13thLvlLabelSchools = findViewById(R.id.spaceBelow13thLvlLabelSchools);
        Button abilityButton13_1Schools = findViewById(R.id.abilityButton13_1Schools);
        TextView abilityDescription13_1Schools = findViewById(R.id.abilityDescription13_1Schools);

        spaceAbove13thLvlLabelSchools.getLayoutParams().height = 0;
        lvl13AbilitiesSchools.setTextSize(0);
        spaceBelow13thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton13_1Schools.getLayoutParams().height = 0;
        abilityDescription13_1Schools.setTextSize(0);

        Space spaceAbove14thLvlLabelSchools = findViewById(R.id.spaceAbove14thLvlLabelSchools);
        TextView lvl14AbilitiesSchools = findViewById(R.id.lvl14AbilitiesSchools);
        Space spaceBelow14thLvlLabelSchools = findViewById(R.id.spaceBelow14thLvlLabelSchools);
        Button abilityButton14_1Schools = findViewById(R.id.abilityButton14_1Schools);
        TextView abilityDescription14_1Schools = findViewById(R.id.abilityDescription14_1Schools);

        spaceAbove14thLvlLabelSchools.getLayoutParams().height = 0;
        lvl14AbilitiesSchools.setTextSize(0);
        spaceBelow14thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton14_1Schools.getLayoutParams().height = 0;
        abilityDescription14_1Schools.setTextSize(0);

        Space spaceAbove15thLvlLabelSchools = findViewById(R.id.spaceAbove15thLvlLabelSchools);
        TextView lvl15AbilitiesSchools = findViewById(R.id.lvl15AbilitiesSchools);
        Space spaceBelow15thLvlLabelSchools = findViewById(R.id.spaceBelow15thLvlLabelSchools);
        Button abilityButton15_1Schools = findViewById(R.id.abilityButton15_1Schools);
        TextView abilityDescription15_1Schools = findViewById(R.id.abilityDescription15_1Schools);

        spaceAbove15thLvlLabelSchools.getLayoutParams().height = 0;
        lvl15AbilitiesSchools.setTextSize(0);
        spaceBelow15thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton15_1Schools.getLayoutParams().height = 0;
        abilityDescription15_1Schools.setTextSize(0);

        Space spaceAbove17thLvlLabelSchools = findViewById(R.id.spaceAbove17thLvlLabelSchools);
        TextView lvl17AbilitiesSchools = findViewById(R.id.lvl17AbilitiesSchools);
        Space spaceBelow17thLvlLabelSchools = findViewById(R.id.spaceBelow17thLvlLabelSchools);
        Button abilityButton17_1Schools = findViewById(R.id.abilityButton17_1Schools);
        TextView abilityDescription17_1Schools = findViewById(R.id.abilityDescription17_1Schools);

        spaceAbove17thLvlLabelSchools.getLayoutParams().height = 0;
        lvl17AbilitiesSchools.setTextSize(0);
        spaceBelow17thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton17_1Schools.getLayoutParams().height = 0;
        abilityDescription17_1Schools.setTextSize(0);

        Space spaceAbove18thLvlLabelSchools = findViewById(R.id.spaceAbove18thLvlLabelSchools);
        TextView lvl18AbilitiesSchools = findViewById(R.id.lvl18AbilitiesSchools);
        Space spaceBelow18thLvlLabelSchools = findViewById(R.id.spaceBelow18thLvlLabelSchools);
        Button abilityButton18_1Schools = findViewById(R.id.abilityButton18_1Schools);
        TextView abilityDescription18_1Schools = findViewById(R.id.abilityDescription18_1Schools);

        spaceAbove18thLvlLabelSchools.getLayoutParams().height = 0;
        lvl18AbilitiesSchools.setTextSize(0);
        spaceBelow18thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton18_1Schools.getLayoutParams().height = 0;
        abilityDescription18_1Schools.setTextSize(0);

        Space spaceAbove20thLvlLabelSchools = findViewById(R.id.spaceAbove20thLvlLabelSchools);
        TextView lvl20AbilitiesSchools = findViewById(R.id.lvl20AbilitiesSchools);
        Space spaceBelow20thLvlLabelSchools = findViewById(R.id.spaceBelow20thLvlLabelSchools);
        Button abilityButton20_1Schools = findViewById(R.id.abilityButton20_1Schools);
        TextView abilityDescription20_1Schools = findViewById(R.id.abilityDescription20_1Schools);

        spaceAbove20thLvlLabelSchools.getLayoutParams().height = 0;
        lvl20AbilitiesSchools.setTextSize(0);
        spaceBelow20thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton20_1Schools.getLayoutParams().height = 0;
        abilityDescription20_1Schools.setTextSize(0);

        switch (whichClass) {
            case ("barbarian"):
                activityTitle.setText(R.string.barbarian);

                ability1_1.setText(R.string.barbarianRageTitle);
                ability1_2.setText(R.string.barbarianUnarmoredDefensTitle);
                spaceBetweenButtons1_2.getLayoutParams().height = 0;
                ability1_3.getLayoutParams().height = 1;
                ability1_3.setVisibility(View.INVISIBLE);

                ability2_1.setText(R.string.barbarianRecklessAttackTitle);
                ability2_2.setText(R.string.barbarianDangerSenseTitle);

                spaceAboveLvl3.getLayoutParams().height = 0;
                lvl3label.setTextSize(0);
                lvl3label.setVisibility(View.INVISIBLE);
                ability3_1.getLayoutParams().height = 0;
                ability3_1.setVisibility(View.INVISIBLE);

                spaceAboveLvl4.getLayoutParams().height = 0;
                lvl4label.setTextSize(0);
                lvl4label.setVisibility(View.INVISIBLE);
                spaceBelowLvl4.getLayoutParams().height = 0;
                ability4_1.getLayoutParams().height = 0;
                ability4_1.setVisibility(View.INVISIBLE);

                spaceAboveLvl5.getLayoutParams().height = 0;
                lvl5label.setTextSize(0);
                lvl5label.setVisibility(View.INVISIBLE);
                spaceBelowLvl5.getLayoutParams().height = 0;
                ability5_1.getLayoutParams().height = 0;
                ability5_1.setVisibility(View.INVISIBLE);

                spaceAboveLvl6.getLayoutParams().height = 0;
                lvl6label.setTextSize(0);
                lvl6label.setVisibility(View.INVISIBLE);
                spaceBelowLvl6.getLayoutParams().height = 0;
                ability6_1.getLayoutParams().height = 0;
                ability6_1.setVisibility(View.INVISIBLE);

                ability7_1.setText(R.string.barbarianFeralInstinctTitle);
                spaceBetweenButtons7.getLayoutParams().height = 0;
                ability7_2.getLayoutParams().height = 0;
                ability7_2.setVisibility(View.INVISIBLE);

                spaceAboveLvl8.getLayoutParams().height = 0;
                lvl8label.setTextSize(0);
                lvl8label.setVisibility(View.INVISIBLE);
                spaceBelowLvl8.getLayoutParams().height = 0;
                ability8_1.getLayoutParams().height = 0;
                ability8_1.setVisibility(View.INVISIBLE);

                ability9_1.setText(R.string.barbarianBrutalCriticalTitle);

                spaceAboveLvl10.getLayoutParams().height = 0;
                lvl10label.setTextSize(0);
                lvl10label.setVisibility(View.INVISIBLE);
                spaceBelowLvl10.getLayoutParams().height = 0;
                ability10_1.getLayoutParams().height = 0;
                ability10_1.setVisibility(View.INVISIBLE);

                ability11_1.setText(R.string.barbarianRelentlessRageTitle);

                spaceAboveLvl13.getLayoutParams().height = 0;
                lvl13label.setTextSize(0);
                lvl13label.setVisibility(View.INVISIBLE);
                spaceBelowLvl13.getLayoutParams().height = 0;
                ability13_1.getLayoutParams().height = 0;
                ability13_1.setVisibility(View.INVISIBLE);

                spaceAboveLvl14.getLayoutParams().height = 0;
                lvl14label.setTextSize(0);
                lvl14label.setVisibility(View.INVISIBLE);
                spaceBelowLvl14.getLayoutParams().height = 0;
                ability14_1.getLayoutParams().height = 0;
                ability14_1.setVisibility(View.INVISIBLE);

                ability15_1.setText(R.string.barbarianPersistentRageTitle);

                ability18_1.setText(R.string.barbarianIndomitableMightTitle);
                spaceBetweenButtons18.getLayoutParams().height = 0;
                ability18_2.getLayoutParams().height = 0;
                ability18_2.setVisibility(View.INVISIBLE);

                ability20_1.setText(R.string.barbarianPrimalChampionTitle);

                classSchoolTitle.setText(R.string.barbarianPrimalPathTitle);
                classSchoolDescription.setText(R.string.barbarianPrimalPath);

                classSchoolButton1.setText(R.string.barbarianPathOfTheBerserkerTitle);
                spaceBelowClassSchool1.getLayoutParams().height = 10;
                classSchoolButton2.setText(R.string.barbarianPathOfTheTotemWarriorTitle);
                classSchoolButton3.getLayoutParams().height = 0;
                classSchoolButton3.setVisibility(View.INVISIBLE);
                classSchoolButton4.getLayoutParams().height = 0;
                classSchoolButton4.setVisibility(View.INVISIBLE);
                classSchoolButton5.getLayoutParams().height = 0;
                classSchoolButton5.setVisibility(View.INVISIBLE);
                classSchoolButton6.getLayoutParams().height = 0;
                classSchoolButton6.setVisibility(View.INVISIBLE);
                classSchoolButton7.getLayoutParams().height = 0;
                classSchoolButton7.setVisibility(View.INVISIBLE);
                classSchoolButton8.getLayoutParams().height = 0;
                classSchoolButton8.setVisibility(View.INVISIBLE);


                break;
            case ("bard"):
                activityTitle.setText(R.string.bard);
                spaceAboveLvl1.getLayoutParams().height = 0;


                ability1_1.setText(R.string.bardBardicInspirationTitle);
                spaceBetweenButtons1.getLayoutParams().height = 0;
                ability1_2.getLayoutParams().height = 1;
                ability1_2.setVisibility(View.INVISIBLE);
                spaceBetweenButtons1_2.getLayoutParams().height = 0;
                ability1_3.getLayoutParams().height = 1;
                ability1_3.setVisibility(View.INVISIBLE);

                ability2_1.setText(R.string.bardJackOfAllTradesTitle);
                ability2_2.setText(R.string.bardSongOfRestTitle);

                ability3_1.setText(R.string.bardExpertiseTitle);


                spaceAboveLvl4.getLayoutParams().height = 0;
                lvl4label.setTextSize(0);
                lvl4label.setVisibility(View.INVISIBLE);
                spaceBelowLvl4.getLayoutParams().height = 0;
                ability4_1.getLayoutParams().height = 0;
                ability4_1.setVisibility(View.INVISIBLE);

                ability5_1.setText(R.string.bardFontOfInspirationTitle);

                ability6_1.setText(R.string.bardCountercharmTitle);

                spaceAboveLvl7.getLayoutParams().height = 0;
                lvl7label.setTextSize(0);
                lvl7label.setVisibility(View.INVISIBLE);
                spaceBelowLvl7.getLayoutParams().height = 0;
                ability7_1.getLayoutParams().height = 0;
                ability7_1.setVisibility(View.INVISIBLE);
                spaceBetweenButtons7.getLayoutParams().height = 0;
                ability7_2.getLayoutParams().height = 0;
                ability7_2.setVisibility(View.INVISIBLE);

                spaceAboveLvl8.getLayoutParams().height = 0;
                lvl8label.setTextSize(0);
                lvl8label.setVisibility(View.INVISIBLE);
                spaceBelowLvl8.getLayoutParams().height = 0;
                ability8_1.getLayoutParams().height = 0;
                ability8_1.setVisibility(View.INVISIBLE);

                spaceAboveLvl9.getLayoutParams().height = 0;
                lvl9label.setTextSize(0);
                lvl9label.setVisibility(View.INVISIBLE);
                spaceBelowLvl9.getLayoutParams().height = 0;
                ability9_1.getLayoutParams().height = 0;
                ability9_1.setVisibility(View.INVISIBLE);


                ability10_1.setText(R.string.bardMagicalSecretsTitle);

                spaceAboveLvl11.getLayoutParams().height = 0;
                lvl11label.setTextSize(0);
                lvl11label.setVisibility(View.INVISIBLE);
                spaceBelowLvl11.getLayoutParams().height = 0;
                ability11_1.getLayoutParams().height = 0;
                ability11_1.setVisibility(View.INVISIBLE);

                spaceAboveLvl13.getLayoutParams().height = 0;
                lvl13label.setTextSize(0);
                lvl13label.setVisibility(View.INVISIBLE);
                spaceBelowLvl13.getLayoutParams().height = 0;
                ability13_1.getLayoutParams().height = 0;
                ability13_1.setVisibility(View.INVISIBLE);

                spaceAboveLvl14.getLayoutParams().height = 0;
                lvl14label.setTextSize(0);
                lvl14label.setVisibility(View.INVISIBLE);
                spaceBelowLvl14.getLayoutParams().height = 0;
                ability14_1.getLayoutParams().height = 0;
                ability14_1.setVisibility(View.INVISIBLE);

                spaceAboveLvl15.getLayoutParams().height = 0;
                lvl15label.setTextSize(0);
                lvl15label.setVisibility(View.INVISIBLE);
                spaceBelowLvl15.getLayoutParams().height = 0;
                ability15_1.getLayoutParams().height = 0;
                ability15_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl18.getLayoutParams().height = 0;
                lvl18label.setTextSize(0);
                lvl18label.setVisibility(View.INVISIBLE);
                spaceBelowLvl18.getLayoutParams().height = 0;
                ability18_1.getLayoutParams().height = 0;
                ability18_1.setVisibility(View.INVISIBLE);
                spaceBetweenButtons18.getLayoutParams().height = 0;
                ability18_2.getLayoutParams().height = 0;
                ability18_2.setVisibility(View.INVISIBLE);

                ability20_1.setText(R.string.bardSuperriorInspirationTitle);

                classSchoolTitle.setText(R.string.bardBardCollegeTitlle);
                classSchoolDescription.setText(R.string.bardBardCollege);

                classSchoolButton1.setText(R.string.bardCollegeOfLoreTitle);
                spaceBelowClassSchool1.getLayoutParams().height = 10;
                classSchoolButton2.setText(R.string.bardCollegeOfValorTitle);
                classSchoolButton3.getLayoutParams().height = 0;
                classSchoolButton3.setVisibility(View.INVISIBLE);
                classSchoolButton4.getLayoutParams().height = 0;
                classSchoolButton4.setVisibility(View.INVISIBLE);
                classSchoolButton5.getLayoutParams().height = 0;
                classSchoolButton5.setVisibility(View.INVISIBLE);
                classSchoolButton6.getLayoutParams().height = 0;
                classSchoolButton6.setVisibility(View.INVISIBLE);
                classSchoolButton7.getLayoutParams().height = 0;
                classSchoolButton8.getLayoutParams().height = 0;
                classSchoolButton8.setVisibility(View.INVISIBLE);
                break;


            case ("cleric"):
                activityTitle.setText(R.string.cleric);

                spaceAboveLvl1.getLayoutParams().height = 0;
                lvl1label.setTextSize(0);
                lvl1label.setVisibility(View.INVISIBLE);
                spaceBelowLvl1.getLayoutParams().height = 0;
                ability1_1.getLayoutParams().height = 0;
                ability1_1.setVisibility(View.INVISIBLE);
                spaceBetweenButtons1.getLayoutParams().height = 0;
                ability1_2.getLayoutParams().height = 0;
                ability1_2.setVisibility(View.INVISIBLE);
                spaceBetweenButtons1_2.getLayoutParams().height = 0;
                ability1_3.getLayoutParams().height = 0;
                ability1_3.setVisibility(View.INVISIBLE);

                ability2_1.setText(R.string.clericChannelDivinityTiutle);
                ability2_2.setText(R.string.clericChannelDivinityTurnUndeadTitle);

                spaceAboveLvl3.getLayoutParams().height = 0;
                lvl3label.setTextSize(0);
                lvl3label.setVisibility(View.INVISIBLE);
                ability3_1.getLayoutParams().height = 0;
                ability3_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl4.getLayoutParams().height = 0;
                lvl4label.setTextSize(0);
                lvl4label.setVisibility(View.INVISIBLE);
                spaceBelowLvl4.getLayoutParams().height = 0;
                ability4_1.getLayoutParams().height = 0;
                ability4_1.setVisibility(View.INVISIBLE);

                ability5_1.setText(R.string.clericDestroyUndeadTitle);

                spaceAboveLvl6.getLayoutParams().height = 0;
                lvl6label.setTextSize(0);
                lvl6label.setVisibility(View.INVISIBLE);
                spaceBelowLvl6.getLayoutParams().height = 0;
                ability6_1.getLayoutParams().height = 0;
                ability6_1.setVisibility(View.INVISIBLE);

                spaceAboveLvl7.getLayoutParams().height = 0;
                lvl7label.setTextSize(0);
                lvl7label.setVisibility(View.INVISIBLE);
                spaceBelowLvl7.getLayoutParams().height = 0;
                ability7_1.getLayoutParams().height = 0;
                ability7_1.setVisibility(View.INVISIBLE);
                spaceBetweenButtons7.getLayoutParams().height = 0;
                ability7_2.getLayoutParams().height = 0;
                ability7_2.setVisibility(View.INVISIBLE);


                spaceAboveLvl8.getLayoutParams().height = 0;
                lvl8label.setTextSize(0);
                lvl8label.setVisibility(View.INVISIBLE);
                spaceBelowLvl8.getLayoutParams().height = 0;
                ability8_1.getLayoutParams().height = 0;
                ability8_1.setVisibility(View.INVISIBLE);

                spaceAboveLvl9.getLayoutParams().height = 0;
                lvl9label.setTextSize(0);
                lvl9label.setVisibility(View.INVISIBLE);
                spaceBelowLvl9.getLayoutParams().height = 0;
                ability9_1.getLayoutParams().height = 0;
                ability9_1.setVisibility(View.INVISIBLE);

                ability10_1.setText(R.string.clericDivineInterventionTitle);

                spaceAboveLvl11.getLayoutParams().height = 0;
                lvl11label.setTextSize(0);
                lvl11label.setVisibility(View.INVISIBLE);
                spaceBelowLvl11.getLayoutParams().height = 0;
                ability11_1.getLayoutParams().height = 0;
                ability11_1.setVisibility(View.INVISIBLE);

                spaceAboveLvl13.getLayoutParams().height = 0;
                lvl13label.setTextSize(0);
                lvl13label.setVisibility(View.INVISIBLE);
                spaceBelowLvl13.getLayoutParams().height = 0;
                ability13_1.getLayoutParams().height = 0;
                ability13_1.setVisibility(View.INVISIBLE);

                spaceAboveLvl14.getLayoutParams().height = 0;
                lvl14label.setTextSize(0);
                lvl14label.setVisibility(View.INVISIBLE);
                spaceBelowLvl14.getLayoutParams().height = 0;
                ability14_1.getLayoutParams().height = 0;
                ability14_1.setVisibility(View.INVISIBLE);

                spaceAboveLvl15.getLayoutParams().height = 0;
                lvl15label.setTextSize(0);
                lvl15label.setVisibility(View.INVISIBLE);
                spaceBelowLvl15.getLayoutParams().height = 0;
                ability15_1.getLayoutParams().height = 0;
                ability15_1.setVisibility(View.INVISIBLE);

                spaceAboveLvl18.getLayoutParams().height = 0;
                lvl18label.setTextSize(0);
                lvl18label.setVisibility(View.INVISIBLE);
                spaceBelowLvl18.getLayoutParams().height = 0;
                ability18_1.getLayoutParams().height = 0;
                ability18_1.setVisibility(View.INVISIBLE);
                spaceBetweenButtons18.getLayoutParams().height = 0;
                ability18_2.getLayoutParams().height = 0;
                ability18_2.setVisibility(View.INVISIBLE);

                spaceAboveLvl20.getLayoutParams().height = 0;
                lvl20label.setTextSize(0);
                lvl20label.setVisibility(View.INVISIBLE);
                spaceBelowLvl20.getLayoutParams().height = 0;
                ability20_1.getLayoutParams().height = 0;
                ability20_1.setVisibility(View.INVISIBLE);

                classSchoolTitle.setText(R.string.clericDivineDomainsTitle);
                classSchoolDescription.setText(R.string.clericDivineDomain);

                classSchoolButton1.setText(R.string.clericKnowledgeDomainTitle);
                spaceBelowClassSchool1.getLayoutParams().height = 10;
                classSchoolButton2.setText(R.string.clericLightDomainTitle);
                spaceBelowClassSchool2.getLayoutParams().height = 10;
                classSchoolButton3.setText(R.string.clericLifeDomainTitle);
                spaceBelowClassSchool3.getLayoutParams().height = 10;
                classSchoolButton4.setText(R.string.clericNatureDomainTitle);
                spaceBelowClassSchool4.getLayoutParams().height = 10;
                classSchoolButton5.setText(R.string.clericTempestDomainTitle);
                spaceBelowClassSchool5.getLayoutParams().height = 10;
                classSchoolButton6.setText(R.string.clericTrickeryDomainTitle);
                spaceBelowClassSchool6.getLayoutParams().height = 10;
                classSchoolButton7.setText(R.string.clericWarDomainTitle);
                classSchoolButton8.getLayoutParams().height = 0;
                classSchoolButton8.setVisibility(View.INVISIBLE);
                break;

            case ("druid"):
                activityTitle.setText(R.string.druid);

                spaceAboveLvl1.getLayoutParams().height = 0;
                lvl1label.setTextSize(0);
                lvl1label.setVisibility(View.INVISIBLE);
                spaceBelowLvl1.getLayoutParams().height = 0;
                ability1_1.getLayoutParams().height = 0;
                ability1_1.setVisibility(View.INVISIBLE);
                spaceBetweenButtons1.getLayoutParams().height = 0;
                ability1_2.getLayoutParams().height = 0;
                ability1_2.setVisibility(View.INVISIBLE);
                spaceBetweenButtons1_2.getLayoutParams().height = 0;
                ability1_3.getLayoutParams().height = 1;
                ability1_3.setVisibility(View.INVISIBLE);

                ability2_1.setText(R.string.druidWildShapeTitle);
                spaceBetweenButtons2.getLayoutParams().height = 0;
                ability2_2.getLayoutParams().height = 0;
                ability2_2.setVisibility(View.INVISIBLE);

                spaceAboveLvl3.getLayoutParams().height = 0;
                lvl3label.setTextSize(0);
                lvl3label.setVisibility(View.INVISIBLE);
                ability3_1.getLayoutParams().height = 0;
                ability3_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl4.getLayoutParams().height = 0;
                lvl4label.setTextSize(0);
                lvl4label.setVisibility(View.INVISIBLE);
                spaceBelowLvl4.getLayoutParams().height = 0;
                ability4_1.getLayoutParams().height = 0;
                ability4_1.setVisibility(View.INVISIBLE);

                spaceAboveLvl5.getLayoutParams().height = 0;
                lvl5label.setTextSize(0);
                lvl5label.setVisibility(View.INVISIBLE);
                spaceBelowLvl5.getLayoutParams().height = 0;
                ability5_1.getLayoutParams().height = 0;
                ability5_1.setVisibility(View.INVISIBLE);

                spaceAboveLvl6.getLayoutParams().height = 0;
                lvl6label.setTextSize(0);
                lvl6label.setVisibility(View.INVISIBLE);
                spaceBelowLvl6.getLayoutParams().height = 0;
                ability6_1.getLayoutParams().height = 0;
                ability6_1.setVisibility(View.INVISIBLE);

                spaceAboveLvl7.getLayoutParams().height = 0;
                lvl7label.setTextSize(0);
                lvl7label.setVisibility(View.INVISIBLE);
                spaceBelowLvl7.getLayoutParams().height = 0;
                ability7_1.getLayoutParams().height = 0;
                ability7_1.setVisibility(View.INVISIBLE);
                spaceBetweenButtons7.getLayoutParams().height = 0;
                ability7_2.getLayoutParams().height = 0;
                ability7_2.setVisibility(View.INVISIBLE);


                spaceAboveLvl8.getLayoutParams().height = 0;
                lvl8label.setTextSize(0);
                lvl8label.setVisibility(View.INVISIBLE);
                spaceBelowLvl8.getLayoutParams().height = 0;
                ability8_1.getLayoutParams().height = 0;
                ability8_1.setVisibility(View.INVISIBLE);

                spaceAboveLvl9.getLayoutParams().height = 0;
                lvl9label.setTextSize(0);
                lvl9label.setVisibility(View.INVISIBLE);
                spaceBelowLvl9.getLayoutParams().height = 0;
                ability9_1.getLayoutParams().height = 0;
                ability9_1.setVisibility(View.INVISIBLE);

                spaceAboveLvl10.getLayoutParams().height = 0;
                lvl10label.setTextSize(0);
                lvl10label.setVisibility(View.INVISIBLE);
                spaceBelowLvl10.getLayoutParams().height = 0;
                ability10_1.getLayoutParams().height = 0;
                ability10_1.setVisibility(View.INVISIBLE);

                spaceAboveLvl11.getLayoutParams().height = 0;
                lvl11label.setTextSize(0);
                lvl11label.setVisibility(View.INVISIBLE);
                spaceBelowLvl11.getLayoutParams().height = 0;
                ability11_1.getLayoutParams().height = 0;
                ability11_1.setVisibility(View.INVISIBLE);

                spaceAboveLvl13.getLayoutParams().height = 0;
                lvl13label.setTextSize(0);
                lvl13label.setVisibility(View.INVISIBLE);
                spaceBelowLvl13.getLayoutParams().height = 0;
                ability13_1.getLayoutParams().height = 0;
                ability13_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl14.getLayoutParams().height = 0;
                lvl14label.setTextSize(0);
                lvl14label.setVisibility(View.INVISIBLE);
                spaceBelowLvl14.getLayoutParams().height = 0;
                ability14_1.getLayoutParams().height = 0;
                ability14_1.setVisibility(View.INVISIBLE);

                spaceAboveLvl15.getLayoutParams().height = 0;
                lvl15label.setTextSize(0);
                lvl15label.setVisibility(View.INVISIBLE);
                spaceBelowLvl15.getLayoutParams().height = 0;
                ability15_1.getLayoutParams().height = 0;
                ability15_1.setVisibility(View.INVISIBLE);


                ability18_1.setText(R.string.druidTimelessBodyTitle);
                ability18_2.setText(R.string.druidBeastSpellsTitle);

                ability20_1.setText(R.string.druidArchdruidTitle);

                classSchoolTitle.setText(R.string.druidDruidCircleTitle);
                classSchoolDescription.setText(R.string.druidDruidCircle);

                classSchoolButton1.setText(R.string.druidCircleOfTheLandTitle);
                spaceBelowClassSchool1.getLayoutParams().height = 10;
                classSchoolButton2.setText(R.string.druidCircleOfTheMoonTitle);
                classSchoolButton3.getLayoutParams().height = 0;
                classSchoolButton3.setVisibility(View.INVISIBLE);
                classSchoolButton4.getLayoutParams().height = 0;
                classSchoolButton4.setVisibility(View.INVISIBLE);
                classSchoolButton5.getLayoutParams().height = 0;
                classSchoolButton5.setVisibility(View.INVISIBLE);
                classSchoolButton6.getLayoutParams().height = 0;
                classSchoolButton6.setVisibility(View.INVISIBLE);
                classSchoolButton7.getLayoutParams().height = 0;
                classSchoolButton7.getLayoutParams().height = 0;
                classSchoolButton8.setVisibility(View.INVISIBLE);
                break;


            case ("fighter"):
                activityTitle.setText(R.string.fighter);


                ability1_1.setText(R.string.fighterFightingStyleTitle);
                ability1_2.setText(R.string.fighterSecondWindTitle);
                spaceBetweenButtons1_2.getLayoutParams().height = 0;
                ability1_3.getLayoutParams().height = 1;
                ability1_3.setVisibility(View.INVISIBLE);

                ability2_1.setText(R.string.fighterActionSurgeTitle);
                spaceBetweenButtons2.getLayoutParams().height = 0;
                ability2_2.getLayoutParams().height = 0;
                ability2_2.setVisibility(View.INVISIBLE);

                spaceAboveLvl3.getLayoutParams().height = 0;
                lvl3label.setTextSize(0);
                lvl3label.setVisibility(View.INVISIBLE);
                ability3_1.getLayoutParams().height = 0;
                ability3_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl4.getLayoutParams().height = 0;
                lvl4label.setTextSize(0);
                lvl4label.setVisibility(View.INVISIBLE);
                spaceBelowLvl4.getLayoutParams().height = 0;
                ability4_1.getLayoutParams().height = 0;
                ability4_1.setVisibility(View.INVISIBLE);

                spaceAboveLvl5.getLayoutParams().height = 0;
                lvl5label.setTextSize(0);
                lvl5label.setVisibility(View.INVISIBLE);
                spaceBelowLvl5.getLayoutParams().height = 0;
                ability5_1.getLayoutParams().height = 0;
                ability5_1.setVisibility(View.INVISIBLE);

                spaceAboveLvl6.getLayoutParams().height = 0;
                lvl6label.setTextSize(0);
                lvl6label.setVisibility(View.INVISIBLE);
                spaceBelowLvl6.getLayoutParams().height = 0;
                ability6_1.getLayoutParams().height = 0;
                ability6_1.setVisibility(View.INVISIBLE);

                spaceAboveLvl7.getLayoutParams().height = 0;
                lvl7label.setTextSize(0);
                lvl7label.setVisibility(View.INVISIBLE);
                spaceBelowLvl7.getLayoutParams().height = 0;
                ability7_1.getLayoutParams().height = 0;
                ability7_1.setVisibility(View.INVISIBLE);
                spaceBetweenButtons7.getLayoutParams().height = 0;
                ability7_2.getLayoutParams().height = 0;
                ability7_2.setVisibility(View.INVISIBLE);


                spaceAboveLvl8.getLayoutParams().height = 0;
                lvl8label.setTextSize(0);
                lvl8label.setVisibility(View.INVISIBLE);
                spaceBelowLvl8.getLayoutParams().height = 0;
                ability8_1.getLayoutParams().height = 0;
                ability8_1.setVisibility(View.INVISIBLE);


                ability9_1.setText(R.string.fighterIndomitableTitle);

                spaceAboveLvl10.getLayoutParams().height = 0;
                lvl10label.setTextSize(0);
                lvl10label.setVisibility(View.INVISIBLE);
                spaceBelowLvl10.getLayoutParams().height = 0;
                ability10_1.getLayoutParams().height = 0;
                ability10_1.setVisibility(View.INVISIBLE);

                spaceAboveLvl11.getLayoutParams().height = 0;
                lvl11label.setTextSize(0);
                lvl11label.setVisibility(View.INVISIBLE);
                spaceBelowLvl11.getLayoutParams().height = 0;
                ability11_1.getLayoutParams().height = 0;
                ability11_1.setVisibility(View.INVISIBLE);

                spaceAboveLvl13.getLayoutParams().height = 0;
                lvl13label.setTextSize(0);
                lvl13label.setVisibility(View.INVISIBLE);
                spaceBelowLvl13.getLayoutParams().height = 0;
                ability13_1.getLayoutParams().height = 0;
                ability13_1.setVisibility(View.INVISIBLE);

                spaceAboveLvl14.getLayoutParams().height = 0;
                lvl14label.setTextSize(0);
                lvl14label.setVisibility(View.INVISIBLE);
                spaceBelowLvl14.getLayoutParams().height = 0;
                ability14_1.getLayoutParams().height = 0;
                ability14_1.setVisibility(View.INVISIBLE);

                spaceAboveLvl15.getLayoutParams().height = 0;
                lvl15label.setTextSize(0);
                lvl15label.setVisibility(View.INVISIBLE);
                spaceBelowLvl15.getLayoutParams().height = 0;
                ability15_1.getLayoutParams().height = 0;
                ability15_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl18.getLayoutParams().height = 0;
                lvl18label.setTextSize(0);
                lvl18label.setVisibility(View.INVISIBLE);
                spaceBelowLvl18.getLayoutParams().height = 0;
                ability18_1.getLayoutParams().height = 0;
                ability18_1.setVisibility(View.INVISIBLE);
                spaceBetweenButtons18.getLayoutParams().height = 0;
                ability18_2.getLayoutParams().height = 0;
                ability18_2.setVisibility(View.INVISIBLE);


                spaceAboveLvl20.getLayoutParams().height = 0;
                lvl20label.setTextSize(0);
                lvl20label.setVisibility(View.INVISIBLE);
                spaceBelowLvl20.getLayoutParams().height = 0;
                ability20_1.getLayoutParams().height = 0;
                ability20_1.setVisibility(View.INVISIBLE);

                classSchoolTitle.setText(R.string.fighterMartialArchetypeTitle);
                classSchoolDescription.setText(R.string.fighterMartialArchetype);

                classSchoolButton1.setText(R.string.fighterChampionTitle);
                spaceBelowClassSchool1.getLayoutParams().height = 10;
                classSchoolButton2.setText(R.string.fighterBattleMasterTitle);
                spaceBelowClassSchool2.getLayoutParams().height = 10;
                classSchoolButton3.setText(R.string.fighterEldritchKnightTitle);
                classSchoolButton4.getLayoutParams().height = 0;
                classSchoolButton4.setVisibility(View.INVISIBLE);
                classSchoolButton5.getLayoutParams().height = 0;
                classSchoolButton5.setVisibility(View.INVISIBLE);
                classSchoolButton6.getLayoutParams().height = 0;
                classSchoolButton6.setVisibility(View.INVISIBLE);
                classSchoolButton7.getLayoutParams().height = 0;
                classSchoolButton8.getLayoutParams().height = 0;
                classSchoolButton8.setVisibility(View.INVISIBLE);
                break;

            case ("monk"):
                activityTitle.setText(R.string.monk);

                ability1_1.setText(R.string.monkUnarmoredDefenceTitle);
                ability1_2.setText(R.string.monkMartialArtstitle);
                spaceBetweenButtons1_2.getLayoutParams().height = 0;
                ability1_3.getLayoutParams().height = 1;
                ability1_3.setVisibility(View.INVISIBLE);


                ability2_1.setText(R.string.monkKiTitle);
                ability2_2.setText(R.string.monkUnarmoredMovementTitle);

                ability3_1.setText(R.string.monkDeflectMissilesTille);


                ability4_1.setText(R.string.monkSlowFallTitle);


                ability5_1.setText(R.string.monkStunningStrikeTitle);


                ability6_1.setText(R.string.monkKiEmpoweredStrikesTitle);


                ability7_1.setText(R.string.monkEvasionTitle);
                ability7_2.setText(R.string.monkStillnessOfMindTitle);


                spaceAboveLvl8.getLayoutParams().height = 0;
                lvl8label.setTextSize(0);
                lvl8label.setVisibility(View.INVISIBLE);
                spaceBelowLvl8.getLayoutParams().height = 0;
                ability8_1.getLayoutParams().height = 0;
                ability8_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl9.getLayoutParams().height = 0;
                lvl9label.setTextSize(0);
                lvl9label.setVisibility(View.INVISIBLE);
                spaceBelowLvl9.getLayoutParams().height = 0;
                ability9_1.getLayoutParams().height = 0;
                ability9_1.setVisibility(View.INVISIBLE);


                ability10_1.setText(R.string.monkPurityOfBodyTitle);

                spaceAboveLvl11.getLayoutParams().height = 0;
                lvl11label.setTextSize(0);
                lvl11label.setVisibility(View.INVISIBLE);
                spaceBelowLvl11.getLayoutParams().height = 0;
                ability11_1.getLayoutParams().height = 0;
                ability11_1.setVisibility(View.INVISIBLE);


                ability13_1.setText(R.string.monkTongueOfTheSunAndMoonTitle);


                ability14_1.setText(R.string.monkDiamondSoulTitle);


                ability15_1.setText(R.string.monkTimelessBodyTitle);


                ability18_1.setText(R.string.monkEmptyBodyTitle);
                spaceBetweenButtons18.getLayoutParams().height = 0;
                ability18_2.getLayoutParams().height = 0;
                ability18_2.setVisibility(View.INVISIBLE);


                ability20_1.setText(R.string.monkPerfectSelfTitle);

                classSchoolTitle.setText(R.string.monkMonasticTraditionsTitle);
                classSchoolDescription.setText(R.string.monkMonasticTraditions);

                classSchoolButton1.setText(R.string.monkWayOfTheOpenHandTitle);
                spaceBelowClassSchool1.getLayoutParams().height = 10;
                classSchoolButton2.setText(R.string.monkWayOfShadowTitle);
                spaceBelowClassSchool2.getLayoutParams().height = 10;
                classSchoolButton3.setText(R.string.monkWayOfTheFourElementsTitle);
                classSchoolButton4.getLayoutParams().height = 0;
                classSchoolButton4.setVisibility(View.INVISIBLE);
                classSchoolButton5.getLayoutParams().height = 0;
                classSchoolButton5.setVisibility(View.INVISIBLE);
                classSchoolButton6.getLayoutParams().height = 0;
                classSchoolButton6.setVisibility(View.INVISIBLE);
                classSchoolButton7.getLayoutParams().height = 0;
                classSchoolButton8.getLayoutParams().height = 0;
                classSchoolButton8.setVisibility(View.INVISIBLE);
                break;

            case ("paladin"):
                activityTitle.setText(R.string.paladin);

                ability1_1.setText(R.string.paladinDivineSenseTitle);
                ability1_2.setText(R.string.paladinLayOnHandsTitle);
                spaceBetweenButtons1_2.getLayoutParams().height = 0;
                ability1_3.getLayoutParams().height = 1;
                ability1_3.setVisibility(View.INVISIBLE);


                ability2_1.setText(R.string.paladinFightingStyleTitle);
                ability2_2.setText(R.string.paladinDivineSmiteTitle);

                ability3_1.setText(R.string.paladinDivineHealthTitle);


                spaceAboveLvl4.getLayoutParams().height = 0;
                lvl4label.setTextSize(0);
                lvl4label.setVisibility(View.INVISIBLE);
                spaceBelowLvl4.getLayoutParams().height = 0;
                ability4_1.getLayoutParams().height = 0;
                ability4_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl5.getLayoutParams().height = 0;
                lvl5label.setTextSize(0);
                lvl5label.setVisibility(View.INVISIBLE);
                spaceBelowLvl5.getLayoutParams().height = 0;
                ability5_1.getLayoutParams().height = 0;
                ability5_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl6.getLayoutParams().height = 0;
                lvl6label.setTextSize(0);
                lvl6label.setVisibility(View.INVISIBLE);
                spaceBelowLvl6.getLayoutParams().height = 0;
                ability6_1.getLayoutParams().height = 0;
                ability6_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl7.getLayoutParams().height = 0;
                lvl7label.setTextSize(0);
                lvl7label.setVisibility(View.INVISIBLE);
                spaceBelowLvl7.getLayoutParams().height = 0;
                ability7_1.getLayoutParams().height = 0;
                ability7_1.setVisibility(View.INVISIBLE);
                spaceBetweenButtons7.getLayoutParams().height = 0;
                ability7_2.getLayoutParams().height = 0;
                ability7_2.setVisibility(View.INVISIBLE);


                spaceAboveLvl8.getLayoutParams().height = 0;
                lvl8label.setTextSize(0);
                lvl8label.setVisibility(View.INVISIBLE);
                spaceBelowLvl8.getLayoutParams().height = 0;
                ability8_1.getLayoutParams().height = 0;
                ability8_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl9.getLayoutParams().height = 0;
                lvl9label.setTextSize(0);
                lvl9label.setVisibility(View.INVISIBLE);
                spaceBelowLvl9.getLayoutParams().height = 0;
                ability9_1.getLayoutParams().height = 0;
                ability9_1.setVisibility(View.INVISIBLE);


                ability10_1.setText(R.string.paladinAuraOfCourageTitle);

                spaceAboveLvl11.getLayoutParams().height = 0;
                lvl11label.setTextSize(0);
                lvl11label.setVisibility(View.INVISIBLE);
                spaceBelowLvl11.getLayoutParams().height = 0;
                ability11_1.getLayoutParams().height = 0;
                ability11_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl13.getLayoutParams().height = 0;
                lvl13label.setTextSize(0);
                lvl13label.setVisibility(View.INVISIBLE);
                spaceBelowLvl13.getLayoutParams().height = 0;
                ability13_1.getLayoutParams().height = 0;
                ability13_1.setVisibility(View.INVISIBLE);


                ability14_1.setText(R.string.paladinCleansingTouchTitle);


                spaceAboveLvl15.getLayoutParams().height = 0;
                lvl15label.setTextSize(0);
                lvl15label.setVisibility(View.INVISIBLE);
                spaceBelowLvl15.getLayoutParams().height = 0;
                ability15_1.getLayoutParams().height = 0;
                ability15_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl18.getLayoutParams().height = 0;
                lvl18label.setTextSize(0);
                lvl18label.setVisibility(View.INVISIBLE);
                spaceBelowLvl18.getLayoutParams().height = 0;
                ability18_1.getLayoutParams().height = 0;
                ability18_1.setVisibility(View.INVISIBLE);
                spaceBetweenButtons18.getLayoutParams().height = 0;
                ability18_2.getLayoutParams().height = 0;
                ability18_2.setVisibility(View.INVISIBLE);


                spaceAboveLvl20.getLayoutParams().height = 0;
                lvl20label.setTextSize(0);
                lvl20label.setVisibility(View.INVISIBLE);
                spaceBelowLvl20.getLayoutParams().height = 0;
                ability20_1.getLayoutParams().height = 0;
                ability20_1.setVisibility(View.INVISIBLE);

                classSchoolTitle.setText(R.string.paladinSacredOathsTitle);
                classSchoolDescription.setText(R.string.paladinSacredOaths);

                classSchoolButton1.setText(R.string.paladinOathOfDeviotionTitle);
                spaceBelowClassSchool1.getLayoutParams().height = 10;
                classSchoolButton2.setText(R.string.paladinOathOfTheAncientsTitle);
                spaceBelowClassSchool2.getLayoutParams().height = 10;
                classSchoolButton3.setText(R.string.paladinOathOfVengenceTitle);
                classSchoolButton4.getLayoutParams().height = 0;
                classSchoolButton4.setVisibility(View.INVISIBLE);
                classSchoolButton5.getLayoutParams().height = 0;
                classSchoolButton5.setVisibility(View.INVISIBLE);
                classSchoolButton6.getLayoutParams().height = 0;
                classSchoolButton6.setVisibility(View.INVISIBLE);
                classSchoolButton7.getLayoutParams().height = 0;
                classSchoolButton8.getLayoutParams().height = 0;
                classSchoolButton8.setVisibility(View.INVISIBLE);
                break;

            case ("ranger"):
                activityTitle.setText(R.string.ranger);

                ability1_1.setText(R.string.rangerFavoredEnemyTitle);
                ability1_2.setText(R.string.rangerNaturalExplorerTitle);
                spaceBetweenButtons1_2.getLayoutParams().height = 0;
                ability1_3.getLayoutParams().height = 1;
                ability1_3.setVisibility(View.INVISIBLE);

                ability2_1.setText(R.string.rangerFightingStyleTitle);
                spaceBetweenButtons2.getLayoutParams().height = 0;
                ability2_2.getLayoutParams().height = 0;
                ability2_2.setVisibility(View.INVISIBLE);

                spaceAboveLvl3.getLayoutParams().height = 0;
                lvl3label.setTextSize(0);
                lvl3label.setVisibility(View.INVISIBLE);
                ability3_1.getLayoutParams().height = 0;
                ability3_1.setVisibility(View.INVISIBLE);

                spaceAboveLvl4.getLayoutParams().height = 0;
                lvl4label.setTextSize(0);
                lvl4label.setVisibility(View.INVISIBLE);
                spaceBelowLvl4.getLayoutParams().height = 0;
                ability4_1.getLayoutParams().height = 0;
                ability4_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl5.getLayoutParams().height = 0;
                lvl5label.setTextSize(0);
                lvl5label.setVisibility(View.INVISIBLE);
                spaceBelowLvl5.getLayoutParams().height = 0;
                ability5_1.getLayoutParams().height = 0;
                ability5_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl6.getLayoutParams().height = 0;
                lvl6label.setTextSize(0);
                lvl6label.setVisibility(View.INVISIBLE);
                spaceBelowLvl6.getLayoutParams().height = 0;
                ability6_1.getLayoutParams().height = 0;
                ability6_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl7.getLayoutParams().height = 0;
                lvl7label.setTextSize(0);
                lvl7label.setVisibility(View.INVISIBLE);
                spaceBelowLvl7.getLayoutParams().height = 0;
                ability7_1.getLayoutParams().height = 0;
                ability7_1.setVisibility(View.INVISIBLE);
                spaceBetweenButtons7.getLayoutParams().height = 0;
                ability7_2.getLayoutParams().height = 0;
                ability7_2.setVisibility(View.INVISIBLE);


                ability8_1.setText(R.string.rangerLandsStrideTitle);


                spaceAboveLvl9.getLayoutParams().height = 0;
                lvl9label.setTextSize(0);
                lvl9label.setVisibility(View.INVISIBLE);
                spaceBelowLvl9.getLayoutParams().height = 0;
                ability9_1.getLayoutParams().height = 0;
                ability9_1.setVisibility(View.INVISIBLE);


                ability10_1.setText(R.string.rangerHideInPlainSightTitle);

                spaceAboveLvl11.getLayoutParams().height = 0;
                lvl11label.setTextSize(0);
                lvl11label.setVisibility(View.INVISIBLE);
                spaceBelowLvl11.getLayoutParams().height = 0;
                ability11_1.getLayoutParams().height = 0;
                ability11_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl13.getLayoutParams().height = 0;
                lvl13label.setTextSize(0);
                lvl13label.setVisibility(View.INVISIBLE);
                spaceBelowLvl13.getLayoutParams().height = 0;
                ability13_1.getLayoutParams().height = 0;
                ability13_1.setVisibility(View.INVISIBLE);


                ability14_1.setText(R.string.rangerVanishTitle);


                spaceAboveLvl15.getLayoutParams().height = 0;
                lvl15label.setTextSize(0);
                lvl15label.setVisibility(View.INVISIBLE);
                spaceBelowLvl15.getLayoutParams().height = 0;
                ability15_1.getLayoutParams().height = 0;
                ability15_1.setVisibility(View.INVISIBLE);


                ability18_1.setText(R.string.rangerFeralSensesTitle);
                spaceBetweenButtons18.getLayoutParams().height = 0;
                ability18_2.getLayoutParams().height = 0;
                ability18_2.setVisibility(View.INVISIBLE);


                ability20_1.setText(R.string.rangerFoeSlayerTitle);

                classSchoolTitle.setText(R.string.rangerRangerArchetypesTitle);
                classSchoolDescription.setText(R.string.rangerRangerArchetype);

                classSchoolButton1.setText(R.string.rangerHunterTitle);
                spaceBelowClassSchool1.getLayoutParams().height = 10;
                classSchoolButton2.setText(R.string.rangerBeastMasterTitle);
                classSchoolButton3.getLayoutParams().height = 0;
                classSchoolButton3.setVisibility(View.INVISIBLE);
                classSchoolButton4.getLayoutParams().height = 0;
                classSchoolButton4.setVisibility(View.INVISIBLE);
                classSchoolButton5.getLayoutParams().height = 0;
                classSchoolButton5.setVisibility(View.INVISIBLE);
                classSchoolButton6.getLayoutParams().height = 0;
                classSchoolButton6.setVisibility(View.INVISIBLE);
                classSchoolButton7.getLayoutParams().height = 0;
                classSchoolButton8.getLayoutParams().height = 0;
                classSchoolButton8.setVisibility(View.INVISIBLE);
                break;

            case ("rogue"):
                activityTitle.setText(R.string.rogue);

                ability1_1.setText(R.string.rogueExpertiseTitle);
                ability1_2.setText(R.string.rogueSneakAttackTitle);
                ability1_3.setText(R.string.rogueThievesCantTitle);

                ability2_1.setText(R.string.rogueCunningActionTitle);
                spaceBetweenButtons2.getLayoutParams().height = 0;
                ability2_2.getLayoutParams().height = 0;
                ability2_2.setVisibility(View.INVISIBLE);

                spaceAboveLvl3.getLayoutParams().height = 0;
                lvl3label.setTextSize(0);
                lvl3label.setVisibility(View.INVISIBLE);
                ability3_1.getLayoutParams().height = 0;
                ability3_1.setVisibility(View.INVISIBLE);

                spaceAboveLvl4.getLayoutParams().height = 0;
                lvl4label.setTextSize(0);
                lvl4label.setVisibility(View.INVISIBLE);
                spaceBelowLvl4.getLayoutParams().height = 0;
                ability4_1.getLayoutParams().height = 0;
                ability4_1.setVisibility(View.INVISIBLE);


                ability5_1.setText(R.string.rogueUncannyDodgeTitle);


                spaceAboveLvl6.getLayoutParams().height = 0;
                lvl6label.setTextSize(0);
                lvl6label.setVisibility(View.INVISIBLE);
                spaceBelowLvl6.getLayoutParams().height = 0;
                ability6_1.getLayoutParams().height = 0;
                ability6_1.setVisibility(View.INVISIBLE);


                ability7_1.setText(R.string.rogueEvasionTitle);
                spaceBetweenButtons7.getLayoutParams().height = 0;
                ability7_2.getLayoutParams().height = 0;
                ability7_2.setVisibility(View.INVISIBLE);


                ability8_1.setText(R.string.rogueReliableTalentTitle);


                spaceAboveLvl9.getLayoutParams().height = 0;
                lvl9label.setTextSize(0);
                lvl9label.setVisibility(View.INVISIBLE);
                spaceBelowLvl9.getLayoutParams().height = 0;
                ability9_1.getLayoutParams().height = 0;
                ability9_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl10.getLayoutParams().height = 0;
                lvl10label.setTextSize(0);
                lvl10label.setVisibility(View.INVISIBLE);
                spaceBelowLvl10.getLayoutParams().height = 0;
                ability10_1.getLayoutParams().height = 0;
                ability10_1.setVisibility(View.INVISIBLE);

                spaceAboveLvl11.getLayoutParams().height = 0;
                lvl11label.setTextSize(0);
                lvl11label.setVisibility(View.INVISIBLE);
                spaceBelowLvl11.getLayoutParams().height = 0;
                ability11_1.getLayoutParams().height = 0;
                ability11_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl13.getLayoutParams().height = 0;
                lvl13label.setTextSize(0);
                lvl13label.setVisibility(View.INVISIBLE);
                spaceBelowLvl13.getLayoutParams().height = 0;
                ability13_1.getLayoutParams().height = 0;
                ability13_1.setVisibility(View.INVISIBLE);


                ability14_1.setText(R.string.rogueBlindSenseTitle);


                ability15_1.setText(R.string.rogueSlipperyMindTitle);

                ability18_1.setText(R.string.rogueElusiveTitle);
                spaceBetweenButtons18.getLayoutParams().height = 0;
                ability18_2.getLayoutParams().height = 0;
                ability18_2.setVisibility(View.INVISIBLE);


                ability20_1.setText(R.string.rogueStrokeOfLuckTitle);

                classSchoolTitle.setText(R.string.rogueRoguishArchetypesTitle);
                classSchoolDescription.setText(R.string.rogueRoguishArchetypes);

                classSchoolButton1.setText(R.string.rogueThiefTitle);
                spaceBelowClassSchool1.getLayoutParams().height = 10;
                classSchoolButton2.setText(R.string.rogueAssassinTitle);
                spaceBelowClassSchool2.getLayoutParams().height = 10;
                classSchoolButton3.setText(R.string.rogueArcaneTricksterTitle);
                classSchoolButton4.getLayoutParams().height = 0;
                classSchoolButton4.setVisibility(View.INVISIBLE);
                classSchoolButton5.getLayoutParams().height = 0;
                classSchoolButton5.setVisibility(View.INVISIBLE);
                classSchoolButton6.getLayoutParams().height = 0;
                classSchoolButton6.setVisibility(View.INVISIBLE);
                classSchoolButton7.getLayoutParams().height = 0;
                classSchoolButton8.getLayoutParams().height = 0;
                classSchoolButton8.setVisibility(View.INVISIBLE);

                break;

            case ("sorcerer"):
                activityTitle.setText(R.string.sorcerer);

                spaceAboveLvl1.getLayoutParams().height = 0;
                lvl1label.setTextSize(0);
                lvl1label.setVisibility(View.INVISIBLE);
                spaceBelowLvl1.getLayoutParams().height = 0;
                ability1_1.getLayoutParams().height = 0;
                ability1_1.setVisibility(View.INVISIBLE);
                spaceBetweenButtons1.getLayoutParams().height = 0;
                ability1_2.getLayoutParams().height = 0;
                ability1_2.setVisibility(View.INVISIBLE);
                spaceBetweenButtons1_2.getLayoutParams().height = 0;
                ability1_3.getLayoutParams().height = 1;
                ability1_3.setVisibility(View.INVISIBLE);

                ability2_1.setText(R.string.sorcererFontOfMagicTitle);
                spaceBetweenButtons2.getLayoutParams().height = 0;
                ability2_2.getLayoutParams().height = 0;
                ability2_2.setVisibility(View.INVISIBLE);

                ability3_1.setText(R.string.sorcererMetamagicTitle);

                spaceAboveLvl4.getLayoutParams().height = 0;
                lvl4label.setTextSize(0);
                lvl4label.setVisibility(View.INVISIBLE);
                spaceBelowLvl4.getLayoutParams().height = 0;
                ability4_1.getLayoutParams().height = 0;
                ability4_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl5.getLayoutParams().height = 0;
                lvl5label.setTextSize(0);
                lvl5label.setVisibility(View.INVISIBLE);
                spaceBelowLvl5.getLayoutParams().height = 0;
                ability5_1.getLayoutParams().height = 0;
                ability5_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl6.getLayoutParams().height = 0;
                lvl6label.setTextSize(0);
                lvl6label.setVisibility(View.INVISIBLE);
                spaceBelowLvl6.getLayoutParams().height = 0;
                ability6_1.getLayoutParams().height = 0;
                ability6_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl7.getLayoutParams().height = 0;
                lvl7label.setTextSize(0);
                lvl7label.setVisibility(View.INVISIBLE);
                spaceBelowLvl7.getLayoutParams().height = 0;
                ability7_1.getLayoutParams().height = 0;
                ability7_1.setVisibility(View.INVISIBLE);
                spaceBetweenButtons7.getLayoutParams().height = 0;
                ability7_2.getLayoutParams().height = 0;
                ability7_2.setVisibility(View.INVISIBLE);


                spaceAboveLvl8.getLayoutParams().height = 0;
                lvl8label.setTextSize(0);
                lvl8label.setVisibility(View.INVISIBLE);
                spaceBelowLvl8.getLayoutParams().height = 0;
                ability8_1.getLayoutParams().height = 0;
                ability8_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl9.getLayoutParams().height = 0;
                lvl9label.setTextSize(0);
                lvl9label.setVisibility(View.INVISIBLE);
                spaceBelowLvl9.getLayoutParams().height = 0;
                ability9_1.getLayoutParams().height = 0;
                ability9_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl10.getLayoutParams().height = 0;
                lvl10label.setTextSize(0);
                lvl10label.setVisibility(View.INVISIBLE);
                spaceBelowLvl10.getLayoutParams().height = 0;
                ability10_1.getLayoutParams().height = 0;
                ability10_1.setVisibility(View.INVISIBLE);

                spaceAboveLvl11.getLayoutParams().height = 0;
                lvl11label.setTextSize(0);
                lvl11label.setVisibility(View.INVISIBLE);
                spaceBelowLvl11.getLayoutParams().height = 0;
                ability11_1.getLayoutParams().height = 0;
                ability11_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl13.getLayoutParams().height = 0;
                lvl13label.setTextSize(0);
                lvl13label.setVisibility(View.INVISIBLE);
                spaceBelowLvl13.getLayoutParams().height = 0;
                ability13_1.getLayoutParams().height = 0;
                ability13_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl14.getLayoutParams().height = 0;
                lvl14label.setTextSize(0);
                lvl14label.setVisibility(View.INVISIBLE);
                spaceBelowLvl14.getLayoutParams().height = 0;
                ability14_1.getLayoutParams().height = 0;
                ability14_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl15.getLayoutParams().height = 0;
                lvl15label.setTextSize(0);
                lvl15label.setVisibility(View.INVISIBLE);
                spaceBelowLvl15.getLayoutParams().height = 0;
                ability15_1.getLayoutParams().height = 0;
                ability15_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl18.getLayoutParams().height = 0;
                lvl18label.setTextSize(0);
                lvl18label.setVisibility(View.INVISIBLE);
                spaceBelowLvl18.getLayoutParams().height = 0;
                ability18_1.getLayoutParams().height = 0;
                ability18_1.setVisibility(View.INVISIBLE);
                spaceBetweenButtons18.getLayoutParams().height = 0;
                ability18_2.getLayoutParams().height = 0;
                ability18_2.setVisibility(View.INVISIBLE);


                ability20_1.setText(R.string.sorcererSorcerousRestorationTitle);

                classSchoolTitle.setText(R.string.sorcererSorcerousOriginTitle);
                classSchoolDescription.setText(R.string.sorcererSorcerousOrigin);

                classSchoolButton1.setText(R.string.sorcererDraconicBloodlineTitle);
                spaceBelowClassSchool1.getLayoutParams().height = 10;
                classSchoolButton2.setText(R.string.sorcererWildMagicTitle);
                classSchoolButton3.getLayoutParams().height = 0;
                classSchoolButton3.setVisibility(View.INVISIBLE);
                classSchoolButton4.getLayoutParams().height = 0;
                classSchoolButton4.setVisibility(View.INVISIBLE);
                classSchoolButton5.getLayoutParams().height = 0;
                classSchoolButton5.setVisibility(View.INVISIBLE);
                classSchoolButton6.getLayoutParams().height = 0;
                classSchoolButton6.setVisibility(View.INVISIBLE);
                classSchoolButton7.getLayoutParams().height = 0;
                classSchoolButton8.getLayoutParams().height = 0;
                classSchoolButton8.setVisibility(View.INVISIBLE);


                break;

            case ("warlock"):
                activityTitle.setText(R.string.warlock);

                ability1_1.setText(R.string.warlockOtherwordlyPatronsTitle);
                spaceBetweenButtons1.getLayoutParams().height = 0;
                ability1_2.getLayoutParams().height = 0;
                ability1_2.setVisibility(View.INVISIBLE);
                spaceBetweenButtons1_2.getLayoutParams().height = 0;
                ability1_3.getLayoutParams().height = 1;
                ability1_3.setVisibility(View.INVISIBLE);

                ability2_1.setText(R.string.warlockEldrichtInvocationTitle);
                spaceBetweenButtons2.getLayoutParams().height = 0;
                ability2_2.getLayoutParams().height = 0;
                ability2_2.setVisibility(View.INVISIBLE);

                ability3_1.setText(R.string.warlockPactBoonTitle);

                spaceAboveLvl4.getLayoutParams().height = 0;
                lvl4label.setTextSize(0);
                lvl4label.setVisibility(View.INVISIBLE);
                spaceBelowLvl4.getLayoutParams().height = 0;
                ability4_1.getLayoutParams().height = 0;
                ability4_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl5.getLayoutParams().height = 0;
                lvl5label.setTextSize(0);
                lvl5label.setVisibility(View.INVISIBLE);
                spaceBelowLvl5.getLayoutParams().height = 0;
                ability5_1.getLayoutParams().height = 0;
                ability5_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl6.getLayoutParams().height = 0;
                lvl6label.setTextSize(0);
                lvl6label.setVisibility(View.INVISIBLE);
                spaceBelowLvl6.getLayoutParams().height = 0;
                ability6_1.getLayoutParams().height = 0;
                ability6_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl7.getLayoutParams().height = 0;
                lvl7label.setTextSize(0);
                lvl7label.setVisibility(View.INVISIBLE);
                spaceBelowLvl7.getLayoutParams().height = 0;
                ability7_1.getLayoutParams().height = 0;
                ability7_1.setVisibility(View.INVISIBLE);
                spaceBetweenButtons7.getLayoutParams().height = 0;
                ability7_2.getLayoutParams().height = 0;
                ability7_2.setVisibility(View.INVISIBLE);


                spaceAboveLvl8.getLayoutParams().height = 0;
                lvl8label.setTextSize(0);
                lvl8label.setVisibility(View.INVISIBLE);
                spaceBelowLvl8.getLayoutParams().height = 0;
                ability8_1.getLayoutParams().height = 0;
                ability8_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl9.getLayoutParams().height = 0;
                lvl9label.setTextSize(0);
                lvl9label.setVisibility(View.INVISIBLE);
                spaceBelowLvl9.getLayoutParams().height = 0;
                ability9_1.getLayoutParams().height = 0;
                ability9_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl10.getLayoutParams().height = 0;
                lvl10label.setTextSize(0);
                lvl10label.setVisibility(View.INVISIBLE);
                spaceBelowLvl10.getLayoutParams().height = 0;
                ability10_1.getLayoutParams().height = 0;
                ability10_1.setVisibility(View.INVISIBLE);

                ability11_1.setText(R.string.warlockMysticArcanumTitle);


                spaceAboveLvl13.getLayoutParams().height = 0;
                lvl13label.setTextSize(0);
                lvl13label.setVisibility(View.INVISIBLE);
                spaceBelowLvl13.getLayoutParams().height = 0;
                ability13_1.getLayoutParams().height = 0;
                ability13_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl14.getLayoutParams().height = 0;
                lvl14label.setTextSize(0);
                lvl14label.setVisibility(View.INVISIBLE);
                spaceBelowLvl14.getLayoutParams().height = 0;
                ability14_1.getLayoutParams().height = 0;
                ability14_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl15.getLayoutParams().height = 0;
                lvl15label.setTextSize(0);
                lvl15label.setVisibility(View.INVISIBLE);
                spaceBelowLvl15.getLayoutParams().height = 0;
                ability15_1.getLayoutParams().height = 0;
                ability15_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl18.getLayoutParams().height = 0;
                lvl18label.setTextSize(0);
                lvl18label.setVisibility(View.INVISIBLE);
                spaceBelowLvl18.getLayoutParams().height = 0;
                ability18_1.getLayoutParams().height = 0;
                ability18_1.setVisibility(View.INVISIBLE);
                spaceBetweenButtons18.getLayoutParams().height = 0;
                ability18_2.getLayoutParams().height = 0;
                ability18_2.setVisibility(View.INVISIBLE);


                ability20_1.setText(R.string.warlockEldritchMasterTitle);

                classSchoolTitle.setText(R.string.warlockOtherwordlyPatronsTitle);
                classSchoolDescription.setText(R.string.warlockOtherwordlyPatrons);

                classSchoolButton1.setText(R.string.warlockArchfeyTitle);
                spaceBelowClassSchool1.getLayoutParams().height = 10;
                classSchoolButton2.setText(R.string.warlockFiendTitle);
                spaceBelowClassSchool2.getLayoutParams().height = 10;
                classSchoolButton3.setText(R.string.warlockGreatOldOneTitle);
                classSchoolButton4.getLayoutParams().height = 0;
                classSchoolButton4.setVisibility(View.INVISIBLE);
                classSchoolButton5.getLayoutParams().height = 0;
                classSchoolButton5.setVisibility(View.INVISIBLE);
                classSchoolButton6.getLayoutParams().height = 0;
                classSchoolButton6.setVisibility(View.INVISIBLE);
                classSchoolButton7.getLayoutParams().height = 0;
                classSchoolButton8.getLayoutParams().height = 0;
                classSchoolButton8.setVisibility(View.INVISIBLE);


                break;

            case ("wizard"):
                activityTitle.setText(R.string.wizard);

                ability1_1.setText(R.string.wizardArcaneRecoveryTitle);
                spaceBetweenButtons1.getLayoutParams().height = 0;
                ability1_2.getLayoutParams().height = 0;
                ability1_2.setVisibility(View.INVISIBLE);
                spaceBetweenButtons1_2.getLayoutParams().height = 0;
                ability1_3.getLayoutParams().height = 1;
                ability1_3.setVisibility(View.INVISIBLE);


                spaceAboveLvl2.getLayoutParams().height = 0;
                lvl2label.setTextSize(0);
                lvl2label.setVisibility(View.INVISIBLE);
                spaceBelowLvl2.getLayoutParams().height = 0;
                ability2_1.getLayoutParams().height = 0;
                ability2_1.setVisibility(View.INVISIBLE);
                spaceBetweenButtons2.getLayoutParams().height = 0;
                ability2_2.getLayoutParams().height = 0;
                ability2_2.setVisibility(View.INVISIBLE);

                spaceAboveLvl3.getLayoutParams().height = 0;
                lvl3label.setTextSize(0);
                lvl3label.setVisibility(View.INVISIBLE);
                ability3_1.getLayoutParams().height = 0;
                ability3_1.setVisibility(View.INVISIBLE);

                spaceAboveLvl4.getLayoutParams().height = 0;
                lvl4label.setTextSize(0);
                lvl4label.setVisibility(View.INVISIBLE);
                spaceBelowLvl4.getLayoutParams().height = 0;
                ability4_1.getLayoutParams().height = 0;
                ability4_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl5.getLayoutParams().height = 0;
                lvl5label.setTextSize(0);
                lvl5label.setVisibility(View.INVISIBLE);
                spaceBelowLvl5.getLayoutParams().height = 0;
                ability5_1.getLayoutParams().height = 0;
                ability5_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl6.getLayoutParams().height = 0;
                lvl6label.setTextSize(0);
                lvl6label.setVisibility(View.INVISIBLE);
                spaceBelowLvl6.getLayoutParams().height = 0;
                ability6_1.getLayoutParams().height = 0;
                ability6_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl7.getLayoutParams().height = 0;
                lvl7label.setTextSize(0);
                lvl7label.setVisibility(View.INVISIBLE);
                spaceBelowLvl7.getLayoutParams().height = 0;
                ability7_1.getLayoutParams().height = 0;
                ability7_1.setVisibility(View.INVISIBLE);
                spaceBetweenButtons7.getLayoutParams().height = 0;
                ability7_2.getLayoutParams().height = 0;
                ability7_2.setVisibility(View.INVISIBLE);


                spaceAboveLvl8.getLayoutParams().height = 0;
                lvl8label.setTextSize(0);
                lvl8label.setVisibility(View.INVISIBLE);
                spaceBelowLvl8.getLayoutParams().height = 0;
                ability8_1.getLayoutParams().height = 0;
                ability8_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl9.getLayoutParams().height = 0;
                lvl9label.setTextSize(0);
                lvl9label.setVisibility(View.INVISIBLE);
                spaceBelowLvl9.getLayoutParams().height = 0;
                ability9_1.getLayoutParams().height = 0;
                ability9_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl10.getLayoutParams().height = 0;
                lvl10label.setTextSize(0);
                lvl10label.setVisibility(View.INVISIBLE);
                spaceBelowLvl10.getLayoutParams().height = 0;
                ability10_1.getLayoutParams().height = 0;
                ability10_1.setVisibility(View.INVISIBLE);

                spaceAboveLvl11.getLayoutParams().height = 0;
                lvl11label.setTextSize(0);
                lvl11label.setVisibility(View.INVISIBLE);
                spaceBelowLvl11.getLayoutParams().height = 0;
                ability11_1.getLayoutParams().height = 0;
                ability11_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl13.getLayoutParams().height = 0;
                lvl13label.setTextSize(0);
                lvl13label.setVisibility(View.INVISIBLE);
                spaceBelowLvl13.getLayoutParams().height = 0;
                ability13_1.getLayoutParams().height = 0;
                ability13_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl14.getLayoutParams().height = 0;
                lvl14label.setTextSize(0);
                lvl14label.setVisibility(View.INVISIBLE);
                spaceBelowLvl14.getLayoutParams().height = 0;
                ability14_1.getLayoutParams().height = 0;
                ability14_1.setVisibility(View.INVISIBLE);


                spaceAboveLvl15.getLayoutParams().height = 0;
                lvl15label.setTextSize(0);
                lvl15label.setVisibility(View.INVISIBLE);
                spaceBelowLvl15.getLayoutParams().height = 0;
                ability15_1.getLayoutParams().height = 0;
                ability15_1.setVisibility(View.INVISIBLE);


                ability18_1.setText(R.string.wizardSpellMasteryTitle);
                spaceBetweenButtons18.getLayoutParams().height = 0;
                ability18_2.getLayoutParams().height = 0;
                ability18_2.setVisibility(View.INVISIBLE);


                ability20_1.setText(R.string.wizardSignatureSpellsTitle);

                classSchoolTitle.setText(R.string.wizardArcaneTraditionsTitle);
                classSchoolDescription.setText(R.string.wizardArcaneTraditions);

                classSchoolButton1.setText(R.string.wizardSchoolofAbjurationTitle);
                spaceBelowClassSchool1.getLayoutParams().height = 10;
                classSchoolButton2.setText(R.string.wizardSchoolOfConjurationTitle);
                spaceBelowClassSchool2.getLayoutParams().height = 10;
                classSchoolButton3.setText(R.string.wizardSchoolOfDivinationTitle);
                spaceBelowClassSchool3.getLayoutParams().height = 10;
                classSchoolButton4.setText(R.string.wizardSchoolOfEnchantmentTitle);
                spaceBelowClassSchool4.getLayoutParams().height = 10;
                classSchoolButton5.setText(R.string.wizardSchoolOfEvocationTitle);
                spaceBelowClassSchool5.getLayoutParams().height = 10;
                classSchoolButton6.setText(R.string.wizardSchoolOfIllusionTitle);
                spaceBelowClassSchool6.getLayoutParams().height = 10;
                classSchoolButton7.setText(R.string.wizardSchoolOfNecromancyTitle);
                spaceBelowClassSchool7.getLayoutParams().height = 10;
                classSchoolButton8.setText(R.string.wizardSchoolOfTransmutationTitle);


        }
    }

    public void onAbilityButton1_1(View view) {
        TextView abilityDescription1_1 = findViewById(R.id.abilityDescription1_1);
        if (abilityDescription1_1.getTextSize() == 0) {
            switch (whichClass) {
                case ("barbarian"):
                    abilityDescription1_1.setTextSize(15);
                    abilityDescription1_1.setText(R.string.barbarianRage);
                    break;
                case ("bard"):
                    abilityDescription1_1.setTextSize(15);
                    abilityDescription1_1.setText(R.string.bardBardicInspiration);
                    break;
                case ("fighter"):
                    abilityDescription1_1.setTextSize(15);
                    abilityDescription1_1.setText(R.string.fighterFightingStyle);
                    break;
                case ("monk"):
                    abilityDescription1_1.setTextSize(15);
                    abilityDescription1_1.setText(R.string.monkUnarmoredDefense);
                    break;
                case ("paladin"):
                    abilityDescription1_1.setTextSize(15);
                    abilityDescription1_1.setText(R.string.paladinDivineSense);
                    break;
                case ("ranger"):
                    abilityDescription1_1.setTextSize(15);
                    abilityDescription1_1.setText(R.string.rangerFavoredEnemy);
                    break;
                case ("rogue"):
                    abilityDescription1_1.setTextSize(15);
                    abilityDescription1_1.setText(R.string.rogueExpertise);
                    break;
                case ("warlock"):
                    abilityDescription1_1.setTextSize(15);
                    abilityDescription1_1.setText(R.string.warlockOtherwordlyPatrons);
                    break;
                case ("wizard"):
                    abilityDescription1_1.setTextSize(15);
                    abilityDescription1_1.setText(R.string.wizardArcaneRecovery);
                    break;
            }
        } else {
            abilityDescription1_1.setTextSize(0);
        }
    }

    public void onAbilityButton1_2(View view) {
        TextView abilityDescription1_2 = findViewById(R.id.abilityDescription1_2);
        if (abilityDescription1_2.getTextSize() == 0) {
            switch (whichClass) {
                case ("barbarian"):
                    abilityDescription1_2.setTextSize(15);
                    abilityDescription1_2.setText(R.string.barbarianUnarmoredDefense);
                    break;
                case ("fighter"):
                    abilityDescription1_2.setTextSize(15);
                    abilityDescription1_2.setText(R.string.fighterSecondWind);
                    break;
                case ("monk"):
                    abilityDescription1_2.setTextSize(15);
                    abilityDescription1_2.setText(R.string.monkMartialArts);
                    break;
                case ("paladin"):
                    abilityDescription1_2.setTextSize(15);
                    abilityDescription1_2.setText(R.string.paladinLayOnHands);
                    break;
                case ("ranger"):
                    abilityDescription1_2.setTextSize(15);
                    abilityDescription1_2.setText(R.string.rangerNaturalExplorer);
                    break;
                case ("rogue"):
                    abilityDescription1_2.setTextSize(15);
                    abilityDescription1_2.setText(R.string.rogueSneakAttack);
                    break;
            }
        } else {
            abilityDescription1_2.setTextSize(0);
        }
    }

    public void onAbilityButton1_3(View view) {
        TextView abilityDescription1_3 = findViewById(R.id.abilityDescription1_3);
        if (abilityDescription1_3.getTextSize() == 0) {
            switch (whichClass) {
                case ("rogue"):
                    abilityDescription1_3.setTextSize(15);
                    abilityDescription1_3.setText(R.string.rogueThievesCant);
            }
        } else {
            abilityDescription1_3.setTextSize(0);
        }
    }


    public void onAbilityButton2_1(View view) {
        TextView abilityDescription2_1 = findViewById(R.id.abilityDescription2_1);
        if (abilityDescription2_1.getTextSize() == 0) {
            switch (whichClass) {
                case ("barbarian"):
                    abilityDescription2_1.setTextSize(15);
                    abilityDescription2_1.setText(R.string.barbarianRecklessAttack);
                    break;
                case ("bard"):
                    abilityDescription2_1.setTextSize(15);
                    abilityDescription2_1.setText(R.string.bardJackOfAllTrades);
                    break;
                case ("cleric"):
                    abilityDescription2_1.setTextSize(15);
                    abilityDescription2_1.setText(R.string.clericChannelDivinity);
                    break;
                case ("druid"):
                    abilityDescription2_1.setTextSize(15);
                    abilityDescription2_1.setText(R.string.druidWIldShape);
                    break;
                case ("fighter"):
                    abilityDescription2_1.setTextSize(15);
                    abilityDescription2_1.setText(R.string.fighterActionSurge);
                    break;
                case ("monk"):
                    abilityDescription2_1.setTextSize(15);
                    abilityDescription2_1.setText(R.string.monkKi);
                    break;
                case ("paladin"):
                    abilityDescription2_1.setTextSize(15);
                    abilityDescription2_1.setText(R.string.paladinFightingStyle);
                    break;
                case ("ranger"):
                    abilityDescription2_1.setTextSize(15);
                    abilityDescription2_1.setText(R.string.rangerFightingStyle);
                    break;
                case ("rogue"):
                    abilityDescription2_1.setTextSize(15);
                    abilityDescription2_1.setText(R.string.rogueCunningAction);
                    break;
                case ("sorcerer"):
                    abilityDescription2_1.setTextSize(15);
                    abilityDescription2_1.setText(R.string.sorcererFontOfMagic);
                    break;
                case ("warlock"):
                    abilityDescription2_1.setTextSize(15);
                    abilityDescription2_1.setText(R.string.warlockEldrichtInvocation);
                    break;

            }
        } else {
            abilityDescription2_1.setTextSize(0);
        }
    }

    public void onAbilityButton2_2(View view) {
        TextView abilityDescription2_2 = findViewById(R.id.abilityDescription2_2);
        if (abilityDescription2_2.getTextSize() == 0) {
            switch (whichClass) {
                case ("barbarian"):
                    abilityDescription2_2.setTextSize(15);
                    abilityDescription2_2.setText(R.string.barbarianDangerSense);
                    break;
                case ("bard"):
                    abilityDescription2_2.setTextSize(15);
                    abilityDescription2_2.setText(R.string.bardSongOfRest);
                    break;
                case ("cleric"):
                    abilityDescription2_2.setTextSize(15);
                    abilityDescription2_2.setText(R.string.clericChannelDivinityTurnUndead);
                    break;
                case ("monk"):
                    abilityDescription2_2.setTextSize(15);
                    abilityDescription2_2.setText(R.string.monkUnarmoredMovement);
                    break;
                case ("paladin"):
                    abilityDescription2_2.setTextSize(15);
                    abilityDescription2_2.setText(R.string.paladinDivineSense);
                    break;
            }
        } else {
            abilityDescription2_2.setTextSize(0);
        }
    }

    public void onAbilityButton3_1(View view) {
        TextView abilityDescription3_1 = findViewById(R.id.abilityDescription3_1);
        if (abilityDescription3_1.getTextSize() == 0) {
            switch (whichClass) {
                case ("bard"):
                    abilityDescription3_1.setTextSize(15);
                    abilityDescription3_1.setText(R.string.bardExperise);
                    break;
                case ("monk"):
                    abilityDescription3_1.setTextSize(15);
                    abilityDescription3_1.setText(R.string.monkDeflectMissiles);
                    break;
                case ("paladin"):
                    abilityDescription3_1.setTextSize(15);
                    abilityDescription3_1.setText(R.string.paladinDivineHealth);
                    break;
                case ("sorcerer"):
                    abilityDescription3_1.setTextSize(15);
                    abilityDescription3_1.setText(R.string.sorcererMetamagic);
                    break;
                case ("warlock"):
                    abilityDescription3_1.setTextSize(15);
                    abilityDescription3_1.setText(R.string.warlockPactBoon);
                    break;
            }
        } else {
            abilityDescription3_1.setTextSize(0);
        }
    }


    public void onAbilityButton4_1(View view) {
        TextView abilityDescription4_1 = findViewById(R.id.abilityDescription4_1);
        if (abilityDescription4_1.getTextSize() == 0) {
            switch (whichClass) {
                case ("monk"):
                    abilityDescription4_1.setTextSize(15);
                    abilityDescription4_1.setText(R.string.monkSlowFall);
                    break;
            }
        } else {
            abilityDescription4_1.setTextSize(0);
        }
    }


    public void onAbilityButton5_1(View view) {
        TextView abilityDescription5_1 = findViewById(R.id.abilityDescription5_1);
        if (abilityDescription5_1.getTextSize() == 0) {
            switch (whichClass) {
                case ("bard"):
                    abilityDescription5_1.setTextSize(15);
                    abilityDescription5_1.setText(R.string.bardFontOfInspiration);
                    break;
                case ("cleric"):
                    abilityDescription5_1.setTextSize(15);
                    abilityDescription5_1.setText(R.string.clericDestroyUndead);
                    break;
                case ("monk"):
                    abilityDescription5_1.setTextSize(15);
                    abilityDescription5_1.setText(R.string.monkStunningStrike);
                    break;
                case ("rogue"):
                    abilityDescription5_1.setTextSize(15);
                    abilityDescription5_1.setText(R.string.rogueUncannyDodge);
                    break;
            }
        } else {
            abilityDescription5_1.setTextSize(0);
        }
    }

    public void onAbilityButton6_1(View view) {
        TextView abilityDescription6_1 = findViewById(R.id.abilityDescription6_1);
        if (abilityDescription6_1.getTextSize() == 0) {
            switch (whichClass) {
                case ("bard"):
                    abilityDescription6_1.setTextSize(15);
                    abilityDescription6_1.setText(R.string.bardCounterCharm);
                    break;
                case ("monk"):
                    abilityDescription6_1.setTextSize(15);
                    abilityDescription6_1.setText(R.string.monkKiEmpoweredStrikes);
                    break;
            }
        }
        else {
            abilityDescription6_1.setTextSize(0);
        }
    }


    public void onAbilityButton7_1(View view) {
        TextView abilityDescription7_1 = findViewById(R.id.abilityDescription7_1);
        if (abilityDescription7_1.getTextSize() == 0) {
            switch (whichClass) {
                case ("barbarian"):
                    abilityDescription7_1.setTextSize(15);
                    abilityDescription7_1.setText(R.string.barbarianFeralInstinct);
                    break;
                case ("monk"):
                    abilityDescription7_1.setTextSize(15);
                    abilityDescription7_1.setText(R.string.monkEvasion);
                    break;
                case ("rogue"):
                    abilityDescription7_1.setTextSize(15);
                    abilityDescription7_1.setText(R.string.rogueEvasion);
                    break;
            }
        } else {
            abilityDescription7_1.setTextSize(0);
        }
    }

    public void onAbilityButton7_2(View view) {
        TextView abilityDescription7_2 = findViewById(R.id.abilityDescription7_2);
        if (abilityDescription7_2.getTextSize() == 0) {
            switch (whichClass) {
                case ("monk"):
                    abilityDescription7_2.setTextSize(15);
                    abilityDescription7_2.setText(R.string.monkStillnessOfMind);
                    break;
            }
        } else {
            abilityDescription7_2.setTextSize(0);
        }
    }


    public void onAbilityButton8_1(View view) {
        TextView abilityDescription8_1 = findViewById(R.id.abilityDescription8_1);
        if (abilityDescription8_1.getTextSize() == 0) {
            switch (whichClass) {
                case ("ranger"):
                    abilityDescription8_1.setTextSize(15);
                    abilityDescription8_1.setText(R.string.rangerLandsStride);
                    break;
                case ("rogue"):
                    abilityDescription8_1.setTextSize(15);
                    abilityDescription8_1.setText(R.string.rogueReliableTalent);
                    break;
            }
        } else {
            abilityDescription8_1.setTextSize(0);
        }
    }


    public void onAbilityButton9_1(View view) {
        TextView abilityDescription9_1 = findViewById(R.id.abilityDescription9_1);
        if (abilityDescription9_1.getTextSize() == 0) {
            switch (whichClass) {
                case ("barbarian"):
                    abilityDescription9_1.setTextSize(15);
                    abilityDescription9_1.setText(R.string.barbarianBrutalCritical);
                    break;
                case ("fighter"):
                    abilityDescription9_1.setTextSize(15);
                    abilityDescription9_1.setText(R.string.fighterIndomitable);
                    break;
            }
        } else {
            abilityDescription9_1.setTextSize(0);
        }
    }

    public void onAbilityButton10_1(View view) {
        TextView abilityDescription10_1 = findViewById(R.id.abilityDescription10_1);
        if (abilityDescription10_1.getTextSize() == 0) {
            switch (whichClass) {
                case ("bard"):
                    abilityDescription10_1.setTextSize(15);
                    abilityDescription10_1.setText(R.string.bardMagicalSecrets);
                    break;
                case ("cleric"):
                    abilityDescription10_1.setTextSize(15);
                    abilityDescription10_1.setText(R.string.clericDivineIntervention);
                    break;
                case ("monk"):
                    abilityDescription10_1.setTextSize(15);
                    abilityDescription10_1.setText(R.string.monkPurityOfBody);
                    break;
                case ("paladin"):
                    abilityDescription10_1.setTextSize(15);
                    abilityDescription10_1.setText(R.string.paladinAuraOfCourage);
                    break;
                case ("ranger"):
                    abilityDescription10_1.setTextSize(15);
                    abilityDescription10_1.setText(R.string.rangerHideInPlainSight);
                    break;
            }
        } else {
            abilityDescription10_1.setTextSize(0);
        }
    }

    public void onAbilityButton11_1(View view) {
        TextView abilityDescription11_1 = findViewById(R.id.abilityDescription11_1);
        if (abilityDescription11_1.getTextSize() == 0) {
            switch (whichClass) {
                case ("barbarian"):
                    abilityDescription11_1.setTextSize(15);
                    abilityDescription11_1.setText(R.string.barbarianRelentlessRage);
                    break;
                case ("warlock"):
                    abilityDescription11_1.setTextSize(15);
                    abilityDescription11_1.setText(R.string.warlockMysticArcanum);
                    break;
            }
        } else {
            abilityDescription11_1.setTextSize(0);
        }
    }

    public void onAbilityButton13_1(View view) {
        TextView abilityDescription13_1 = findViewById(R.id.abilityDescription13_1);
        if (abilityDescription13_1.getTextSize() == 0) {
            switch (whichClass) {
                case ("monk"):
                    abilityDescription13_1.setTextSize(15);
                    abilityDescription13_1.setText(R.string.monkTongueOfTheSunAndMoon);
                    break;
            }
        } else {
            abilityDescription13_1.setTextSize(0);
        }
    }

    public void onAbilityButton14_1(View view) {
        TextView abilityDescription14_1 = findViewById(R.id.abilityDescription14_1);
        if (abilityDescription14_1.getTextSize() == 0) {
            switch (whichClass) {
                case ("monk"):
                    abilityDescription14_1.setTextSize(15);
                    abilityDescription14_1.setText(R.string.monkDiamondSoul);
                    break;
                case ("paladin"):
                    abilityDescription14_1.setTextSize(15);
                    abilityDescription14_1.setText(R.string.paladinCleansingTouch);
                    break;
                case ("ranger"):
                    abilityDescription14_1.setTextSize(15);
                    abilityDescription14_1.setText(R.string.rangerVanish);
                    break;
                case ("rogue"):
                    abilityDescription14_1.setTextSize(15);
                    abilityDescription14_1.setText(R.string.rogueBlindSense);
                    break;
            }
        } else {
            abilityDescription14_1.setTextSize(0);
        }
    }

    public void onAbilityButton15_1(View view) {
        TextView abilityDescription15_1 = findViewById(R.id.abilityDescription15_1);
        if (abilityDescription15_1.getTextSize() == 0) {
            switch (whichClass) {
                case ("barbarian"):
                    abilityDescription15_1.setTextSize(15);
                    abilityDescription15_1.setText(R.string.barbarianPersistentRage);
                    break;
                case ("monk"):
                    abilityDescription15_1.setTextSize(15);
                    abilityDescription15_1.setText(R.string.monkTimelessBody);
                    break;
                case ("rogue"):
                    abilityDescription15_1.setTextSize(15);
                    abilityDescription15_1.setText(R.string.rogueSlipperyMind);
                    break;
            }
        } else {
            abilityDescription15_1.setTextSize(0);
        }
    }


    public void onAbilityButton18_1(View view) {
        TextView abilityDescription18_1 = findViewById(R.id.abilityDescription18_1);
        if (abilityDescription18_1.getTextSize() == 0) {
            switch (whichClass) {
                case ("barbarian"):
                    abilityDescription18_1.setTextSize(15);
                    abilityDescription18_1.setText(R.string.barbarianIndomitableMight);
                    break;
                case ("druid"):
                    abilityDescription18_1.setTextSize(15);
                    abilityDescription18_1.setText(R.string.druidTimelessBody);
                    break;
                case ("monk"):
                    abilityDescription18_1.setTextSize(15);
                    abilityDescription18_1.setText(R.string.monkEmptyBody);
                    break;
                case ("ranger"):
                    abilityDescription18_1.setTextSize(15);
                    abilityDescription18_1.setText(R.string.rangerFeralSenses);
                    break;
                case ("rogue"):
                    abilityDescription18_1.setTextSize(15);
                    abilityDescription18_1.setText(R.string.rogueElusive);
                    break;
                case ("wizard"):
                    abilityDescription18_1.setTextSize(15);
                    abilityDescription18_1.setText(R.string.wizardSpellMastery);
                    break;

            }
        } else {
            abilityDescription18_1.setTextSize(0);
        }
    }


    public void onAbilityButton18_2(View view) {
        TextView abilityDescription18_2 = findViewById(R.id.abilityDescription18_2);
        if (abilityDescription18_2.getTextSize() == 0) {
            switch (whichClass) {
                case ("druid"):
                    abilityDescription18_2.setTextSize(15);
                    abilityDescription18_2.setText(R.string.druidBeastSpells);
                    break;
            }
        } else {
            abilityDescription18_2.setTextSize(0);
        }
    }


    public void onAbilityButton20_1(View view) {
        TextView abilityDescription20_1 = findViewById(R.id.abilityDescription20_1);
        if (abilityDescription20_1.getTextSize() == 0) {
            switch (whichClass) {
                case ("barbarian"):
                    abilityDescription20_1.setTextSize(15);
                    abilityDescription20_1.setText(R.string.barbarianPrimalChampion);
                    break;
                case ("bard"):
                    abilityDescription20_1.setTextSize(15);
                    abilityDescription20_1.setText(R.string.bardSuperiorInspiration);
                    break;
                case ("druid"):
                    abilityDescription20_1.setTextSize(15);
                    abilityDescription20_1.setText(R.string.druidArchdruid);
                    break;
                case ("monk"):
                    abilityDescription20_1.setTextSize(15);
                    abilityDescription20_1.setText(R.string.monkPerfectSelf);
                    break;
                case ("ranger"):
                    abilityDescription20_1.setTextSize(15);
                    abilityDescription20_1.setText(R.string.rangerFoeSlayer);
                    break;
                case ("rogue"):
                    abilityDescription20_1.setTextSize(15);
                    abilityDescription20_1.setText(R.string.rogueStrokeOfLuck);
                    break;
                case ("sorcerer"):
                    abilityDescription20_1.setTextSize(15);
                    abilityDescription20_1.setText(R.string.sorcererSorcerousRestoration);
                    break;
                case ("warlock"):
                    abilityDescription20_1.setTextSize(15);
                    abilityDescription20_1.setText(R.string.warlockEldritchMaster);
                    break;
                case ("wizard"):
                    abilityDescription20_1.setTextSize(15);
                    abilityDescription20_1.setText(R.string.wizardSignatureSpells);
                    break;
            }
        } else {
            abilityDescription20_1.setTextSize(0);
        }
    }


    public void onAbilityClassSchoolButton1(View view) {
        TextView classSchoolTitle = findViewById(R.id.chosenClassSchoolTitle);
        TextView classSchoolDescription = findViewById(R.id.chosenClassSchoolsDescription);
        Button classSchoolButton1 = findViewById(R.id.abilityCassSchoolButton1);
        Button classSchoolButton2 = findViewById(R.id.abilityCassSchoolButton2);
        Button classSchoolButton3 = findViewById(R.id.abilityCassSchoolButton3);
        Button classSchoolButton4 = findViewById(R.id.abilityCassSchoolButton4);
        Button classSchoolButton5 = findViewById(R.id.abilityCassSchoolButton5);
        Button classSchoolButton6 = findViewById(R.id.abilityCassSchoolButton6);
        Button classSchoolButton7 = findViewById(R.id.abilityCassSchoolButton7);
        Button classSchoolButton8 = findViewById(R.id.abilityCassSchoolButton8);


        Space spaceAbove1stLvlLabelSchools = findViewById(R.id.spaceAbove1stLvlLabelSchools);
        TextView lvl1AbilitiesSchools = findViewById(R.id.lvl1AbilitiesSchools);
        Space spaceBelow1stLvlLabelSchools = findViewById(R.id.spaceBelow1stLvlLabelSchools);
        Button abilityButton1_1Schools = findViewById(R.id.abilityButton1_1Schools);

        Space spaceBetween1stLvlLabelSchools = findViewById(R.id.spaceBetween1stLvlLabelSchools);
        Button abilityButton1_2Schools = findViewById(R.id.abilityButton1_2Schools);

        Space spaceAbove2ndLvlLabelSchools = findViewById(R.id.spaceAbove2ndLvlLabelSchools);
        TextView lvl2AbilitiesSchools = findViewById(R.id.lvl2AbilitiesSchools);
        Space spaceBelow2ndLvlLabelSchools = findViewById(R.id.spaceBelow2ndLvlLabelSchools);
        Button abilityButton2_1Schools = findViewById(R.id.abilityButton2_1Schools);
        Button abilityButton2_2Schools = findViewById(R.id.abilityButton2_2Schools);

        Space spaceAbove3rdLvlLabelSchools = findViewById(R.id.spaceAbove3rdLvlLabelSchools);
        TextView lvl3AbilitiesSchools = findViewById(R.id.lvl3AbilitiesSchools);
        Space spaceBelow3rdLvlLabelSchools = findViewById(R.id.spaceBelow3rdLvlLabelSchools);
        Button abilityButton3_1Schools = findViewById(R.id.abilityButton3_1Schools);
        Space spaceBetweenLvl3ButtonSchools = findViewById(R.id.spaceBetween3LvlButtonsSchools);
        Button abilityButton3_2Schools = findViewById(R.id.abilityButton3_2Schools);

        Space spaceAbove6thLvlLabelSchools = findViewById(R.id.spaceAbove6thLvlLabelSchools);
        TextView lvl6AbilitiesSchools = findViewById(R.id.lvl6AbilitiesSchools);
        Space spaceBelow6thLvlLabelSchools = findViewById(R.id.spaceBelow6thLvlLabelSchools);
        Button abilityButton6_1Schools = findViewById(R.id.abilityButton6_1Schools);

        Space spaceAbove7thLvlLabelSchools = findViewById(R.id.spaceAbove7thLvlLabelSchools);
        TextView lvl7AbilitiesSchools = findViewById(R.id.lvl7AbilitiesSchools);
        Space spaceBelow7thLvlLabelSchools = findViewById(R.id.spaceBelow7thLvlLabelSchools);
        Button abilityButton7_1Schools = findViewById(R.id.abilityButton7_1Schools);


        Space spaceAbove8thLvlLabelSchools = findViewById(R.id.spaceAbove8thLvlLabelSchools);
        TextView lvl8AbilitiesSchools = findViewById(R.id.lvl8AbilitiesSchools);
        Space spaceBelow8thLvlLabelSchools = findViewById(R.id.spaceBelow8thLvlLabelSchools);
        Button abilityButton8_1Schools = findViewById(R.id.abilityButton8_1Schools);


        Space spaceAbove10thLvlLabelSchools = findViewById(R.id.spaceAbove10thLvlLabelSchools);
        TextView lvl10AbilitiesSchools = findViewById(R.id.lvl10AbilitiesSchools);
        Space spaceBelow10thLvlLabelSchools = findViewById(R.id.spaceBelow10thLvlLabelSchools);
        Button abilityButton10_1Schools = findViewById(R.id.abilityButton10_1Schools);

        Space spaceAbove11thLvlLabelSchools = findViewById(R.id.spaceAbove11thLvlLabelSchools);
        TextView lvl11AbilitiesSchools = findViewById(R.id.lvl11AbilitiesSchools);
        Space spaceBelow11thLvlLabelSchools = findViewById(R.id.spaceBelow11thLvlLabelSchools);
        Button abilityButton11_1Schools = findViewById(R.id.abilityButton11_1Schools);

        Space spaceAbove14thLvlLabelSchools = findViewById(R.id.spaceAbove14thLvlLabelSchools);
        TextView lvl14AbilitiesSchools = findViewById(R.id.lvl14AbilitiesSchools);
        Space spaceBelow14thLvlLabelSchools = findViewById(R.id.spaceBelow14thLvlLabelSchools);
        Button abilityButton14_1Schools = findViewById(R.id.abilityButton14_1Schools);

        Space spaceAbove15thLvlLabelSchools = findViewById(R.id.spaceAbove15thLvlLabelSchools);
        TextView lvl15AbilitiesSchools = findViewById(R.id.lvl15AbilitiesSchools);
        Space spaceBelow15thLvlLabelSchools = findViewById(R.id.spaceBelow15thLvlLabelSchools);
        Button abilityButton15_1Schools = findViewById(R.id.abilityButton15_1Schools);

        Space spaceAbove17thLvlLabelSchools = findViewById(R.id.spaceAbove17thLvlLabelSchools);
        TextView lvl17AbilitiesSchools = findViewById(R.id.lvl17AbilitiesSchools);
        Space spaceBelow17thLvlLabelSchools = findViewById(R.id.spaceBelow17thLvlLabelSchools);
        Button abilityButton17_1Schools = findViewById(R.id.abilityButton17_1Schools);

        Space spaceAbove18thLvlLabelSchools = findViewById(R.id.spaceAbove18thLvlLabelSchools);
        TextView lvl18AbilitiesSchools = findViewById(R.id.lvl18AbilitiesSchools);
        Space spaceBelow18thLvlLabelSchools = findViewById(R.id.spaceBelow18thLvlLabelSchools);
        Button abilityButton18_1Schools = findViewById(R.id.abilityButton18_1Schools);

        classSchoolButton2.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton3.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton4.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton5.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton6.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton7.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton8.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton1.setBackgroundColor(Color.parseColor("#63a6f2"));

        TextView abilityDescription1_1Schools = findViewById(R.id.abilityDescription1_1Schools);
        spaceAbove1stLvlLabelSchools.getLayoutParams().height = 0;
        lvl1AbilitiesSchools.setTextSize(0);
        spaceBelow1stLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton1_1Schools.getLayoutParams().height = 0;
        abilityDescription1_1Schools.setTextSize(0);


        TextView abilityDescription1_2Schools = findViewById(R.id.abilityDescription1_2Schools);
        spaceBetween1stLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton1_2Schools.getLayoutParams().height = 0;
        abilityDescription1_2Schools.setTextSize(0);

        TextView abilityDescription2_1Schools = findViewById(R.id.abilityDescription2_1Schools);
        spaceAbove2ndLvlLabelSchools.getLayoutParams().height = 0;
        lvl2AbilitiesSchools.setTextSize(0);
        spaceBelow2ndLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton2_1Schools.getLayoutParams().height = 0;
        abilityDescription2_1Schools.setTextSize(0);

        Space spaceBetween2ndLvlLabelSchools = findViewById(R.id.spaceBetween2ndLvlLabelSchools);
        TextView abilityDescription2_2Schools = findViewById(R.id.abilityDescription2_2Schools);
        spaceBetween2ndLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton2_2Schools.getLayoutParams().height = 0;
        abilityDescription2_2Schools.setTextSize(0);

        TextView abilityDescription3_1Schools = findViewById(R.id.abilityDescription3_1Schools);
        TextView abilityDescription3_2Schools = findViewById(R.id.abilityDescription3_2Schools);
        spaceAbove3rdLvlLabelSchools.getLayoutParams().height = 0;
        lvl3AbilitiesSchools.setTextSize(0);
        spaceBelow3rdLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton3_1Schools.getLayoutParams().height = 0;
        abilityDescription3_1Schools.setTextSize(0);
        spaceBetweenLvl3ButtonSchools.getLayoutParams().height = 0;
        abilityButton3_2Schools.getLayoutParams().height = 0;
        abilityDescription3_2Schools.setTextSize(0);

        TextView abilityDescription6_1Schools = findViewById(R.id.abilityDescription6_1Schools);
        spaceAbove6thLvlLabelSchools.getLayoutParams().height = 0;
        lvl6AbilitiesSchools.setTextSize(0);
        spaceBelow6thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton6_1Schools.getLayoutParams().height = 0;
        abilityDescription6_1Schools.setTextSize(0);

        TextView abilityDescription7_1Schools = findViewById(R.id.abilityDescription7_1Schools);
        spaceAbove7thLvlLabelSchools.getLayoutParams().height = 0;
        lvl7AbilitiesSchools.setTextSize(0);
        spaceBelow7thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton7_1Schools.getLayoutParams().height = 0;
        abilityDescription7_1Schools.setTextSize(0);

        TextView abilityDescription8_1Schools = findViewById(R.id.abilityDescription8_1Schools);
        spaceAbove8thLvlLabelSchools.getLayoutParams().height = 0;
        lvl8AbilitiesSchools.setTextSize(0);
        spaceBelow8thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton8_1Schools.getLayoutParams().height = 0;
        abilityDescription8_1Schools.setTextSize(0);

        Space spaceAbove9thLvlLabelSchools = findViewById(R.id.spaceAbove9thLvlLabelSchools);
        TextView lvl9AbilitiesSchools = findViewById(R.id.lvl9AbilitiesSchools);
        Space spaceBelow9thLvlLabelSchools = findViewById(R.id.spaceBelow9thLvlLabelSchools);
        Button abilityButton9_1Schools = findViewById(R.id.abilityButton9_1Schools);
        TextView abilityDescription9_1Schools = findViewById(R.id.abilityDescription9_1Schools);

        spaceAbove9thLvlLabelSchools.getLayoutParams().height = 0;
        lvl9AbilitiesSchools.setTextSize(0);
        spaceBelow9thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton9_1Schools.getLayoutParams().height = 0;
        abilityDescription9_1Schools.setTextSize(0);

        TextView abilityDescription10_1Schools = findViewById(R.id.abilityDescription10_1Schools);
        spaceAbove10thLvlLabelSchools.getLayoutParams().height = 0;
        lvl10AbilitiesSchools.setTextSize(0);
        spaceBelow10thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton10_1Schools.getLayoutParams().height = 0;
        abilityDescription10_1Schools.setTextSize(0);

        TextView abilityDescription11_1Schools = findViewById(R.id.abilityDescription11_1Schools);
        spaceAbove11thLvlLabelSchools.getLayoutParams().height = 0;
        lvl11AbilitiesSchools.setTextSize(0);
        spaceBelow11thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton11_1Schools.getLayoutParams().height = 0;
        abilityDescription11_1Schools.setTextSize(0);

        Space spaceAbove13thLvlLabelSchools = findViewById(R.id.spaceAbove13thLvlLabelSchools);
        TextView lvl13AbilitiesSchools = findViewById(R.id.lvl13AbilitiesSchools);
        Space spaceBelow13thLvlLabelSchools = findViewById(R.id.spaceBelow13thLvlLabelSchools);
        Button abilityButton13_1Schools = findViewById(R.id.abilityButton13_1Schools);
        TextView abilityDescription13_1Schools = findViewById(R.id.abilityDescription13_1Schools);

        spaceAbove13thLvlLabelSchools.getLayoutParams().height = 0;
        lvl13AbilitiesSchools.setTextSize(0);
        spaceBelow13thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton13_1Schools.getLayoutParams().height = 0;
        abilityDescription13_1Schools.setTextSize(0);

        TextView abilityDescription14_1Schools = findViewById(R.id.abilityDescription14_1Schools);
        spaceAbove14thLvlLabelSchools.getLayoutParams().height = 0;
        lvl14AbilitiesSchools.setTextSize(0);
        spaceBelow14thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton14_1Schools.getLayoutParams().height = 0;
        abilityDescription14_1Schools.setTextSize(0);

        TextView abilityDescription15_1Schools = findViewById(R.id.abilityDescription15_1Schools);
        spaceAbove15thLvlLabelSchools.getLayoutParams().height = 0;
        lvl15AbilitiesSchools.setTextSize(0);
        spaceBelow15thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton15_1Schools.getLayoutParams().height = 0;
        abilityDescription15_1Schools.setTextSize(0);

        TextView abilityDescription17_1Schools = findViewById(R.id.abilityDescription17_1Schools);
        spaceAbove17thLvlLabelSchools.getLayoutParams().height = 0;
        lvl17AbilitiesSchools.setTextSize(0);
        spaceBelow17thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton17_1Schools.getLayoutParams().height = 0;
        abilityDescription17_1Schools.setTextSize(0);

        TextView abilityDescription18_1Schools = findViewById(R.id.abilityDescription18_1Schools);
        spaceAbove18thLvlLabelSchools.getLayoutParams().height = 0;
        lvl18AbilitiesSchools.setTextSize(0);
        spaceBelow18thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton18_1Schools.getLayoutParams().height = 0;
        abilityDescription18_1Schools.setTextSize(0);

        Space spaceAbove20thLvlLabelSchools = findViewById(R.id.spaceAbove20thLvlLabelSchools);
        TextView lvl20AbilitiesSchools = findViewById(R.id.lvl20AbilitiesSchools);
        Space spaceBelow20thLvlLabelSchools = findViewById(R.id.spaceBelow20thLvlLabelSchools);
        Button abilityButton20_1Schools = findViewById(R.id.abilityButton20_1Schools);
        TextView abilityDescription20_1Schools = findViewById(R.id.abilityDescription20_1Schools);

        spaceAbove20thLvlLabelSchools.getLayoutParams().height = 0;
        lvl20AbilitiesSchools.setTextSize(0);
        spaceBelow20thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton20_1Schools.getLayoutParams().height = 0;
        abilityDescription20_1Schools.setTextSize(0);


        switch (whichClass) {
            case ("barbarian"):
                whichSchool = "PathOfBerserker";
                classSchoolTitle.setText(R.string.barbarianPathOfTheBerserkerTitle);
                classSchoolTitle.setTextSize(30);
                classSchoolDescription.setText(R.string.barbarianPathOfBerserker);
                classSchoolDescription.setTextSize(20);

                spaceAbove3rdLvlLabelSchools.getLayoutParams().height = 10;
                lvl3AbilitiesSchools.setTextSize(20);
                spaceBelow3rdLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton3_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton3_1Schools.setText(R.string.barbarianPathOfTheBerserkerFrenzyTitle);

                spaceAbove6thLvlLabelSchools.getLayoutParams().height = 10;
                lvl6AbilitiesSchools.setTextSize(20);
                spaceBelow6thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton6_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton6_1Schools.setText(R.string.barbarianPathOfTheBerserkerMindlessRageTitle);

                spaceAbove10thLvlLabelSchools.getLayoutParams().height = 10;
                lvl10AbilitiesSchools.setTextSize(20);
                spaceBelow10thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton10_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton10_1Schools.setText(R.string.barbarianPathOfTheBerserkerIntimidatingPresenceTitle);

                spaceAbove14thLvlLabelSchools.getLayoutParams().height = 10;
                lvl14AbilitiesSchools.setTextSize(20);
                spaceBelow14thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton14_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton14_1Schools.setText(R.string.barbarianPathOfTheBerserkerRetaliationTitle);
                break;
            case ("bard"):
                whichSchool = "CollegeOfLore";
                classSchoolTitle.setText(R.string.bardCollegeOfLoreTitle);
                classSchoolTitle.setTextSize(30);
                classSchoolDescription.setText(R.string.bardCollegeOfLore);
                classSchoolDescription.setTextSize(20);

                spaceAbove3rdLvlLabelSchools.getLayoutParams().height = 10;
                lvl3AbilitiesSchools.setTextSize(20);
                spaceBelow3rdLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton3_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton3_1Schools.setText(R.string.bardCollegeOfLoreBonusProfitienciesTitle);

                spaceBetweenLvl3ButtonSchools.getLayoutParams().height = 10;
                abilityButton3_2Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton3_2Schools.setText(R.string.bardCollegeOfLoreCuttingWordsTitle);

                spaceAbove6thLvlLabelSchools.getLayoutParams().height = 10;
                lvl6AbilitiesSchools.setTextSize(20);
                spaceBelow6thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton6_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton6_1Schools.setText(R.string.bardCollegeOfLoreAdditionalMagicalSecretsTitle);

                spaceAbove14thLvlLabelSchools.getLayoutParams().height = 10;
                lvl14AbilitiesSchools.setTextSize(20);
                spaceBelow14thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton14_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton14_1Schools.setText(R.string.bardCollegeOfLorePeerlessSkillTitle);


                break;
            case ("cleric"):
                whichSchool = "KnowledgeDomain";
                classSchoolTitle.setText(R.string.clericKnowledgeDomainTitle);
                classSchoolTitle.setTextSize(30);
                classSchoolDescription.setText(R.string.clericKnowledgeDomain);
                classSchoolDescription.setTextSize(20);

                spaceAbove1stLvlLabelSchools.getLayoutParams().height = 10;
                lvl1AbilitiesSchools.setTextSize(20);
                spaceBelow1stLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton1_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton1_1Schools.setText(R.string.clericKnowledgeDomainBlessingOfKnowledgeTitle);

                spaceAbove2ndLvlLabelSchools.getLayoutParams().height = 10;
                lvl2AbilitiesSchools.setTextSize(20);
                spaceBelow2ndLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton2_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton2_1Schools.setText(R.string.clericKnowledgeDomainChannelDivinityKnowledgeOfTheAgesTitle);


                spaceAbove6thLvlLabelSchools.getLayoutParams().height = 10;
                lvl6AbilitiesSchools.setTextSize(20);
                spaceBelow6thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton6_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton6_1Schools.setText(R.string.clericKnowledgeDomainChannelDivinityReadThoughtsTitle);

                spaceAbove8thLvlLabelSchools.getLayoutParams().height = 10;
                lvl8AbilitiesSchools.setTextSize(20);
                spaceBelow8thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton8_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton8_1Schools.setText(R.string.clericKnowledgeDomainPotentSpellcastingTitle);

                spaceAbove17thLvlLabelSchools.getLayoutParams().height = 10;
                lvl17AbilitiesSchools.setTextSize(20);
                spaceBelow17thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton17_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton17_1Schools.setText(R.string.clericKnowledgeDomainVisionOfThePastTitle);
            break;

            case ("druid"):
                whichSchool = "CircleOfTheLand";
                classSchoolTitle.setText(R.string.druidCircleOfTheLandTitle);
                classSchoolTitle.setTextSize(30);
                classSchoolDescription.setText(R.string.druidCircleOfTheLand);
                classSchoolDescription.setTextSize(20);


                spaceAbove2ndLvlLabelSchools.getLayoutParams().height = 10;
                lvl2AbilitiesSchools.setTextSize(20);
                spaceBelow2ndLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton2_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton2_1Schools.setText(R.string.druidCircleOfTheLandBonusCantripTitle);

                spaceBetween2ndLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton2_2Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton2_2Schools.setText(R.string.druidCircleOfTheLandNaturalRecoveryTitle);


                spaceAbove3rdLvlLabelSchools.getLayoutParams().height = 10;
                lvl3AbilitiesSchools.setTextSize(20);
                spaceBelow3rdLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton3_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton3_1Schools.setText(R.string.druidCircleOfTheLandCircleSpellsTitle);

                spaceAbove6thLvlLabelSchools.getLayoutParams().height = 10;
                lvl6AbilitiesSchools.setTextSize(20);
                spaceBelow6thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton6_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton6_1Schools.setText(R.string.druidCircleOfTheLandLandsStrideTitle);

                spaceAbove10thLvlLabelSchools.getLayoutParams().height = 10;
                lvl10AbilitiesSchools.setTextSize(20);
                spaceBelow10thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton10_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton10_1Schools.setText(R.string.druidCircleOfTheLandNaturesWardTitle);

                spaceAbove14thLvlLabelSchools.getLayoutParams().height = 10;
                lvl14AbilitiesSchools.setTextSize(20);
                spaceBelow14thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton14_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton14_1Schools.setText(R.string.druidCircleOfTheLandNaturesSanctuaryTitle);
            break;

            case ("fighter"):
                whichSchool = "Champion";
                classSchoolTitle.setText(R.string.fighterChampionTitle);
                classSchoolTitle.setTextSize(30);
                classSchoolDescription.setText(R.string.fighterChampion);
                classSchoolDescription.setTextSize(20);


                spaceAbove3rdLvlLabelSchools.getLayoutParams().height = 10;
                lvl3AbilitiesSchools.setTextSize(20);
                spaceBelow3rdLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton3_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton3_1Schools.setText(R.string.fighterChampionImprovedCriticalTitle);


                spaceAbove7thLvlLabelSchools.getLayoutParams().height = 10;
                lvl7AbilitiesSchools.setTextSize(20);
                spaceBelow7thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton7_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton7_1Schools.setText(R.string.fighterChampionRemarkableAthleteTitle);


                spaceAbove10thLvlLabelSchools.getLayoutParams().height = 10;
                lvl10AbilitiesSchools.setTextSize(20);
                spaceBelow10thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton10_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton10_1Schools.setText(R.string.fighterChampionAdditionalFightingStyleTitle);

                spaceAbove15thLvlLabelSchools.getLayoutParams().height = 10;
                lvl15AbilitiesSchools.setTextSize(20);
                spaceBelow15thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton15_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton15_1Schools.setText(R.string.fighterChampionSuperiorCriticalTitle);

                spaceAbove18thLvlLabelSchools.getLayoutParams().height = 10;
                lvl18AbilitiesSchools.setTextSize(20);
                spaceBelow18thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton18_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton18_1Schools.setText(R.string.fighterChampionSurvivorTitle);
                break;

            case ("monk"):
                whichSchool = "WayOfTheOpenHand";
                classSchoolTitle.setText(R.string.monkWayOfTheOpenHandTitle);
                classSchoolTitle.setTextSize(30);
                classSchoolDescription.setText(R.string.monkWayOfTheOpenHand);
                classSchoolDescription.setTextSize(20);


                spaceAbove3rdLvlLabelSchools.getLayoutParams().height = 10;
                lvl3AbilitiesSchools.setTextSize(20);
                spaceBelow3rdLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton3_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton3_1Schools.setText(R.string.monkWayOfTheOpenHandOpenHandTechniqueTitle);


                spaceAbove6thLvlLabelSchools.getLayoutParams().height = 10;
                lvl6AbilitiesSchools.setTextSize(20);
                spaceBelow6thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton6_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton6_1Schools.setText(R.string.monkWayOfTheOpenHandWholenessOfBodyTitle);


                spaceAbove11thLvlLabelSchools.getLayoutParams().height = 10;
                lvl11AbilitiesSchools.setTextSize(20);
                spaceBelow11thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton11_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton11_1Schools.setText(R.string.monkWayOfTheOpenHandTranquilityTitle);



                spaceAbove17thLvlLabelSchools.getLayoutParams().height = 10;
                lvl17AbilitiesSchools.setTextSize(20);
                spaceBelow17thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton17_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton17_1Schools.setText(R.string.monkWayOfTheOpenHandQuiveringPalmTitle);
                break;

            case ("paladin"):
                whichSchool = "OathOfDevotion";
                classSchoolTitle.setText(R.string.paladinOathOfDeviotionTitle);
                classSchoolTitle.setTextSize(30);
                classSchoolDescription.setText(R.string.paladinOathOfDeviotion);
                classSchoolDescription.setTextSize(20);


                spaceAbove3rdLvlLabelSchools.getLayoutParams().height = 10;
                lvl3AbilitiesSchools.setTextSize(20);
                spaceBelow3rdLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton3_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton3_1Schools.setText(R.string.paladinOathOfDeviotionOathSpellsTitle);

                spaceBetweenLvl3ButtonSchools.getLayoutParams().height = 10;
                abilityButton3_2Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton3_2Schools.setText(R.string.paladinOathOfDeviotionChannelDivinityTitle);



                spaceAbove7thLvlLabelSchools.getLayoutParams().height = 10;
                lvl7AbilitiesSchools.setTextSize(20);
                spaceBelow7thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton7_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton7_1Schools.setText(R.string.paladinOathOfDevotionAuraOfDevotionTitle);



                spaceAbove15thLvlLabelSchools.getLayoutParams().height = 10;
                lvl15AbilitiesSchools.setTextSize(20);
                spaceBelow15thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton15_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton15_1Schools.setText(R.string.paladinOathOfDevotionPurityOfSpiritTitle);

                spaceAbove20thLvlLabelSchools.getLayoutParams().height = 10;
                lvl20AbilitiesSchools.setTextSize(20);
                spaceBelow20thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton20_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton20_1Schools.setText(R.string.paladinOathOfDevotionHolyNimbusTitle);
                break;

            case ("ranger"):
                whichSchool = "Hunter";
                classSchoolTitle.setText(R.string.rangerHunterTitle);
                classSchoolTitle.setTextSize(30);
                classSchoolDescription.setText(R.string.rangerHunter);
                classSchoolDescription.setTextSize(20);


                spaceAbove3rdLvlLabelSchools.getLayoutParams().height = 10;
                lvl3AbilitiesSchools.setTextSize(20);
                spaceBelow3rdLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton3_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton3_1Schools.setText(R.string.rangerHunterHuntersPreyTitle);



                spaceAbove7thLvlLabelSchools.getLayoutParams().height = 10;
                lvl7AbilitiesSchools.setTextSize(20);
                spaceBelow7thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton7_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton7_1Schools.setText(R.string.rangerHunterDefensiveTacticsTitle);


                spaceAbove11thLvlLabelSchools.getLayoutParams().height = 10;
                lvl11AbilitiesSchools.setTextSize(20);
                spaceBelow11thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton11_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton11_1Schools.setText(R.string.rangerHunterMultiattackTitle);

                spaceAbove15thLvlLabelSchools.getLayoutParams().height = 10;
                lvl15AbilitiesSchools.setTextSize(20);
                spaceBelow15thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton15_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton15_1Schools.setText(R.string.rangerHunterSuperiorHunterDefenseTitle);
                break;

            case ("rogue"):
                whichSchool = "Thief";
                classSchoolTitle.setText(R.string.rogueThiefTitle);
                classSchoolTitle.setTextSize(30);
                classSchoolDescription.setText(R.string.rogueThief);
                classSchoolDescription.setTextSize(20);


                spaceAbove3rdLvlLabelSchools.getLayoutParams().height = 10;
                lvl3AbilitiesSchools.setTextSize(20);
                spaceBelow3rdLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton3_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton3_1Schools.setText(R.string.rogueThiefFastHandsTitle);

                spaceBetweenLvl3ButtonSchools.getLayoutParams().height = 10;
                abilityButton3_2Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton3_2Schools.setText(R.string.rogueThiefSecondStoryWorkTitle);



                spaceAbove9thLvlLabelSchools.getLayoutParams().height = 10;
                lvl9AbilitiesSchools.setTextSize(20);
                spaceBelow9thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton9_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton9_1Schools.setText(R.string.rogueThiefSupremeSneakTitle);


                spaceAbove13thLvlLabelSchools.getLayoutParams().height = 10;
                lvl13AbilitiesSchools.setTextSize(20);
                spaceBelow13thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton13_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton13_1Schools.setText(R.string.rogueThiefUseMagicDeviceTitle);

                spaceAbove17thLvlLabelSchools.getLayoutParams().height = 10;
                lvl17AbilitiesSchools.setTextSize(20);
                spaceBelow17thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton17_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton17_1Schools.setText(R.string.rogueThiefThiefsReflexTitle);
                break;

            case ("sorcerer"):
                whichSchool = "DraconicBloodline";
                classSchoolTitle.setText(R.string.sorcererDraconicBloodlineTitle);
                classSchoolTitle.setTextSize(30);
                classSchoolDescription.setText(R.string.sorcererDraconicBloodline);
                classSchoolDescription.setTextSize(20);


                spaceAbove1stLvlLabelSchools.getLayoutParams().height = 10;
                lvl1AbilitiesSchools.setTextSize(20);
                spaceBelow1stLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton1_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton1_1Schools.setText(R.string.sorcererDraconicBloodlineDragonAncestorTitle);

                spaceBetween1stLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton1_2Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton1_2Schools.setText(R.string.sorcererDraconicBloodlineDraconicResilenceTitle);



                spaceAbove6thLvlLabelSchools.getLayoutParams().height = 10;
                lvl6AbilitiesSchools.setTextSize(20);
                spaceBelow6thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton6_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton6_1Schools.setText(R.string.sorcererDraconicBloodlineElementalAffinityTitle);




                spaceAbove14thLvlLabelSchools.getLayoutParams().height = 10;
                lvl14AbilitiesSchools.setTextSize(20);
                spaceBelow14thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton14_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton14_1Schools.setText(R.string.sorcererDraconicBloodlineDragonWingsTitle);

                spaceAbove18thLvlLabelSchools.getLayoutParams().height = 10;
                lvl18AbilitiesSchools.setTextSize(20);
                spaceBelow18thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton18_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton18_1Schools.setText(R.string.sorcererDraconicBloodlineDraconicPresenceTitle);
                break;

            case ("warlock"):
                whichSchool = "TheArchfey";
                classSchoolTitle.setText(R.string.warlockArchfeyTitle);
                classSchoolTitle.setTextSize(30);
                classSchoolDescription.setText(R.string.warlockArchfey);
                classSchoolDescription.setTextSize(20);


                spaceAbove1stLvlLabelSchools.getLayoutParams().height = 10;
                lvl1AbilitiesSchools.setTextSize(20);
                spaceBelow1stLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton1_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton1_1Schools.setText(R.string.warlockArchfeyExpendedSpelllistTitle);

                spaceBetween1stLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton1_2Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton1_2Schools.setText(R.string.warlockArchfeyFeyPresenceTitle);



                spaceAbove6thLvlLabelSchools.getLayoutParams().height = 10;
                lvl6AbilitiesSchools.setTextSize(20);
                spaceBelow6thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton6_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton6_1Schools.setText(R.string.warlockArchfeyMistyEscapeTitle);


                spaceAbove10thLvlLabelSchools.getLayoutParams().height = 10;
                lvl10AbilitiesSchools.setTextSize(20);
                spaceBelow10thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton10_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton10_1Schools.setText(R.string.walockArchfeyBeguilingDefensesTitle);


                spaceAbove14thLvlLabelSchools.getLayoutParams().height = 10;
                lvl14AbilitiesSchools.setTextSize(20);
                spaceBelow14thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton14_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton14_1Schools.setText(R.string.warlockArchfeyDarkDeliriumTitle);

                break;

            case ("wizard"):
                whichSchool = "SchoolOfAbjuration";
                classSchoolTitle.setText(R.string.wizardSchoolofAbjurationTitle);
                classSchoolTitle.setTextSize(30);
                classSchoolDescription.setText(R.string.wizardSchoolofAbjuration);
                classSchoolDescription.setTextSize(20);


                spaceAbove2ndLvlLabelSchools.getLayoutParams().height = 10;
                lvl2AbilitiesSchools.setTextSize(20);
                spaceBelow2ndLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton2_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton2_1Schools.setText(R.string.wizardSchoolOfAbjurationAbjurantServantTitle);

                spaceBetween2ndLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton2_2Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton2_2Schools.setText(R.string.wizardSchoolOfAbjurationArcaneWardTitle);


                spaceAbove6thLvlLabelSchools.getLayoutParams().height = 10;
                lvl6AbilitiesSchools.setTextSize(20);
                spaceBelow6thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton6_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton6_1Schools.setText(R.string.wizardSchoolOfAbjurationProjectWardTitle);


                spaceAbove10thLvlLabelSchools.getLayoutParams().height = 10;
                lvl10AbilitiesSchools.setTextSize(20);
                spaceBelow10thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton10_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton10_1Schools.setText(R.string.wizardSchoolOfAbjurationImprovedAbjurationTitle);


                spaceAbove14thLvlLabelSchools.getLayoutParams().height = 10;
                lvl14AbilitiesSchools.setTextSize(20);
                spaceBelow14thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton14_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton14_1Schools.setText(R.string.wizardSchoolOfAbjurationSpellResistanceTitle);

                break;


        }
    }

    public void onAbilityClassSchoolButton2(View view) {
        TextView classSchoolTitle = findViewById(R.id.chosenClassSchoolTitle);
        TextView classSchoolDescription = findViewById(R.id.chosenClassSchoolsDescription);
        Button classSchoolButton1 = findViewById(R.id.abilityCassSchoolButton1);
        Button classSchoolButton2 = findViewById(R.id.abilityCassSchoolButton2);
        Button classSchoolButton3 = findViewById(R.id.abilityCassSchoolButton3);
        Button classSchoolButton4 = findViewById(R.id.abilityCassSchoolButton4);
        Button classSchoolButton5 = findViewById(R.id.abilityCassSchoolButton5);
        Button classSchoolButton6 = findViewById(R.id.abilityCassSchoolButton6);
        Button classSchoolButton7 = findViewById(R.id.abilityCassSchoolButton7);
        Button classSchoolButton8 = findViewById(R.id.abilityCassSchoolButton8);


        Space spaceAbove1stLvlLabelSchools = findViewById(R.id.spaceAbove1stLvlLabelSchools);
        TextView lvl1AbilitiesSchools = findViewById(R.id.lvl1AbilitiesSchools);
        Space spaceBelow1stLvlLabelSchools = findViewById(R.id.spaceBelow1stLvlLabelSchools);
        Button abilityButton1_1Schools = findViewById(R.id.abilityButton1_1Schools);

        Space spaceBetween1stLvlLabelSchools = findViewById(R.id.spaceBetween1stLvlLabelSchools);
        Button abilityButton1_2Schools = findViewById(R.id.abilityButton1_2Schools);

        Space spaceAbove2ndLvlLabelSchools = findViewById(R.id.spaceAbove2ndLvlLabelSchools);
        TextView lvl2AbilitiesSchools = findViewById(R.id.lvl2AbilitiesSchools);
        Space spaceBelow2ndLvlLabelSchools = findViewById(R.id.spaceBelow2ndLvlLabelSchools);
        Button abilityButton2_1Schools = findViewById(R.id.abilityButton2_1Schools);
        Button abilityButton2_2Schools = findViewById(R.id.abilityButton2_2Schools);

        Space spaceAbove3rdLvlLabelSchools = findViewById(R.id.spaceAbove3rdLvlLabelSchools);
        TextView lvl3AbilitiesSchools = findViewById(R.id.lvl3AbilitiesSchools);
        Space spaceBelow3rdLvlLabelSchools = findViewById(R.id.spaceBelow3rdLvlLabelSchools);
        Button abilityButton3_1Schools = findViewById(R.id.abilityButton3_1Schools);
        Space spaceBetweenLvl3ButtonSchools = findViewById(R.id.spaceBetween3LvlButtonsSchools);
        Button abilityButton3_2Schools = findViewById(R.id.abilityButton3_2Schools);

        Space spaceAbove6thLvlLabelSchools = findViewById(R.id.spaceAbove6thLvlLabelSchools);
        TextView lvl6AbilitiesSchools = findViewById(R.id.lvl6AbilitiesSchools);
        Space spaceBelow6thLvlLabelSchools = findViewById(R.id.spaceBelow6thLvlLabelSchools);
        Button abilityButton6_1Schools = findViewById(R.id.abilityButton6_1Schools);

        Space spaceAbove7thLvlLabelSchools = findViewById(R.id.spaceAbove7thLvlLabelSchools);
        TextView lvl7AbilitiesSchools = findViewById(R.id.lvl7AbilitiesSchools);
        Space spaceBelow7thLvlLabelSchools = findViewById(R.id.spaceBelow7thLvlLabelSchools);
        Button abilityButton7_1Schools = findViewById(R.id.abilityButton7_1Schools);


        Space spaceAbove8thLvlLabelSchools = findViewById(R.id.spaceAbove8thLvlLabelSchools);
        TextView lvl8AbilitiesSchools = findViewById(R.id.lvl8AbilitiesSchools);
        Space spaceBelow8thLvlLabelSchools = findViewById(R.id.spaceBelow8thLvlLabelSchools);
        Button abilityButton8_1Schools = findViewById(R.id.abilityButton8_1Schools);


        Space spaceAbove10thLvlLabelSchools = findViewById(R.id.spaceAbove10thLvlLabelSchools);
        TextView lvl10AbilitiesSchools = findViewById(R.id.lvl10AbilitiesSchools);
        Space spaceBelow10thLvlLabelSchools = findViewById(R.id.spaceBelow10thLvlLabelSchools);
        Button abilityButton10_1Schools = findViewById(R.id.abilityButton10_1Schools);

        Space spaceAbove11thLvlLabelSchools = findViewById(R.id.spaceAbove11thLvlLabelSchools);
        TextView lvl11AbilitiesSchools = findViewById(R.id.lvl11AbilitiesSchools);
        Space spaceBelow11thLvlLabelSchools = findViewById(R.id.spaceBelow11thLvlLabelSchools);
        Button abilityButton11_1Schools = findViewById(R.id.abilityButton11_1Schools);

        Space spaceAbove14thLvlLabelSchools = findViewById(R.id.spaceAbove14thLvlLabelSchools);
        TextView lvl14AbilitiesSchools = findViewById(R.id.lvl14AbilitiesSchools);
        Space spaceBelow14thLvlLabelSchools = findViewById(R.id.spaceBelow14thLvlLabelSchools);
        Button abilityButton14_1Schools = findViewById(R.id.abilityButton14_1Schools);

        Space spaceAbove15thLvlLabelSchools = findViewById(R.id.spaceAbove15thLvlLabelSchools);
        TextView lvl15AbilitiesSchools = findViewById(R.id.lvl15AbilitiesSchools);
        Space spaceBelow15thLvlLabelSchools = findViewById(R.id.spaceBelow15thLvlLabelSchools);
        Button abilityButton15_1Schools = findViewById(R.id.abilityButton15_1Schools);

        Space spaceAbove17thLvlLabelSchools = findViewById(R.id.spaceAbove17thLvlLabelSchools);
        TextView lvl17AbilitiesSchools = findViewById(R.id.lvl17AbilitiesSchools);
        Space spaceBelow17thLvlLabelSchools = findViewById(R.id.spaceBelow17thLvlLabelSchools);
        Button abilityButton17_1Schools = findViewById(R.id.abilityButton17_1Schools);

        Space spaceAbove18thLvlLabelSchools = findViewById(R.id.spaceAbove18thLvlLabelSchools);
        TextView lvl18AbilitiesSchools = findViewById(R.id.lvl18AbilitiesSchools);
        Space spaceBelow18thLvlLabelSchools = findViewById(R.id.spaceBelow18thLvlLabelSchools);
        Button abilityButton18_1Schools = findViewById(R.id.abilityButton18_1Schools);

        classSchoolButton1.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton3.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton4.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton5.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton6.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton7.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton8.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton2.setBackgroundColor(Color.parseColor("#63a6f2"));

        TextView abilityDescription1_1Schools = findViewById(R.id.abilityDescription1_1Schools);
        spaceAbove1stLvlLabelSchools.getLayoutParams().height = 0;
        lvl1AbilitiesSchools.setTextSize(0);
        spaceBelow1stLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton1_1Schools.getLayoutParams().height = 0;
        abilityDescription1_1Schools.setTextSize(0);

        TextView abilityDescription1_2Schools = findViewById(R.id.abilityDescription1_2Schools);
        spaceBetween1stLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton1_2Schools.getLayoutParams().height = 0;
        abilityDescription1_2Schools.setTextSize(0);

        TextView abilityDescription2_1Schools = findViewById(R.id.abilityDescription2_1Schools);
        spaceAbove2ndLvlLabelSchools.getLayoutParams().height = 0;
        lvl2AbilitiesSchools.setTextSize(0);
        spaceBelow2ndLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton2_1Schools.getLayoutParams().height = 0;
        abilityDescription2_1Schools.setTextSize(0);

        Space spaceBetween2ndLvlLabelSchools = findViewById(R.id.spaceBetween2ndLvlLabelSchools);
        TextView abilityDescription2_2Schools = findViewById(R.id.abilityDescription2_2Schools);
        spaceBetween2ndLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton2_2Schools.getLayoutParams().height = 0;
        abilityDescription2_2Schools.setTextSize(0);

        TextView abilityDescription3_1Schools = findViewById(R.id.abilityDescription3_1Schools);
        TextView abilityDescription3_2Schools = findViewById(R.id.abilityDescription3_2Schools);
        spaceAbove3rdLvlLabelSchools.getLayoutParams().height = 0;
        lvl3AbilitiesSchools.setTextSize(0);
        spaceBelow3rdLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton3_1Schools.getLayoutParams().height = 0;
        abilityDescription3_1Schools.setTextSize(0);
        spaceBetweenLvl3ButtonSchools.getLayoutParams().height = 0;
        abilityButton3_2Schools.getLayoutParams().height = 0;
        abilityDescription3_2Schools.setTextSize(0);

        TextView abilityDescription6_1Schools = findViewById(R.id.abilityDescription6_1Schools);
        spaceAbove6thLvlLabelSchools.getLayoutParams().height = 0;
        lvl6AbilitiesSchools.setTextSize(0);
        spaceBelow6thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton6_1Schools.getLayoutParams().height = 0;
        abilityDescription6_1Schools.setTextSize(0);

        TextView abilityDescription7_1Schools = findViewById(R.id.abilityDescription7_1Schools);
        spaceAbove7thLvlLabelSchools.getLayoutParams().height = 0;
        lvl7AbilitiesSchools.setTextSize(0);
        spaceBelow7thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton7_1Schools.getLayoutParams().height = 0;
        abilityDescription7_1Schools.setTextSize(0);

        TextView abilityDescription8_1Schools = findViewById(R.id.abilityDescription8_1Schools);
        spaceAbove8thLvlLabelSchools.getLayoutParams().height = 0;
        lvl8AbilitiesSchools.setTextSize(0);
        spaceBelow8thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton8_1Schools.getLayoutParams().height = 0;
        abilityDescription8_1Schools.setTextSize(0);

        Space spaceAbove9thLvlLabelSchools = findViewById(R.id.spaceAbove9thLvlLabelSchools);
        TextView lvl9AbilitiesSchools = findViewById(R.id.lvl9AbilitiesSchools);
        Space spaceBelow9thLvlLabelSchools = findViewById(R.id.spaceBelow9thLvlLabelSchools);
        Button abilityButton9_1Schools = findViewById(R.id.abilityButton9_1Schools);
        TextView abilityDescription9_1Schools = findViewById(R.id.abilityDescription9_1Schools);

        spaceAbove9thLvlLabelSchools.getLayoutParams().height = 0;
        lvl9AbilitiesSchools.setTextSize(0);
        spaceBelow9thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton9_1Schools.getLayoutParams().height = 0;
        abilityDescription9_1Schools.setTextSize(0);

        TextView abilityDescription10_1Schools = findViewById(R.id.abilityDescription10_1Schools);
        spaceAbove10thLvlLabelSchools.getLayoutParams().height = 0;
        lvl10AbilitiesSchools.setTextSize(0);
        spaceBelow10thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton10_1Schools.getLayoutParams().height = 0;
        abilityDescription10_1Schools.setTextSize(0);

        TextView abilityDescription11_1Schools = findViewById(R.id.abilityDescription11_1Schools);
        spaceAbove11thLvlLabelSchools.getLayoutParams().height = 0;
        lvl11AbilitiesSchools.setTextSize(0);
        spaceBelow11thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton11_1Schools.getLayoutParams().height = 0;
        abilityDescription11_1Schools.setTextSize(0);

        Space spaceAbove13thLvlLabelSchools = findViewById(R.id.spaceAbove13thLvlLabelSchools);
        TextView lvl13AbilitiesSchools = findViewById(R.id.lvl13AbilitiesSchools);
        Space spaceBelow13thLvlLabelSchools = findViewById(R.id.spaceBelow13thLvlLabelSchools);
        Button abilityButton13_1Schools = findViewById(R.id.abilityButton13_1Schools);
        TextView abilityDescription13_1Schools = findViewById(R.id.abilityDescription13_1Schools);

        spaceAbove13thLvlLabelSchools.getLayoutParams().height = 0;
        lvl13AbilitiesSchools.setTextSize(0);
        spaceBelow13thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton13_1Schools.getLayoutParams().height = 0;
        abilityDescription13_1Schools.setTextSize(0);

        TextView abilityDescription14_1Schools = findViewById(R.id.abilityDescription14_1Schools);
        spaceAbove14thLvlLabelSchools.getLayoutParams().height = 0;
        lvl14AbilitiesSchools.setTextSize(0);
        spaceBelow14thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton14_1Schools.getLayoutParams().height = 0;
        abilityDescription14_1Schools.setTextSize(0);

        TextView abilityDescription15_1Schools = findViewById(R.id.abilityDescription15_1Schools);
        spaceAbove15thLvlLabelSchools.getLayoutParams().height = 0;
        lvl15AbilitiesSchools.setTextSize(0);
        spaceBelow15thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton15_1Schools.getLayoutParams().height = 0;
        abilityDescription15_1Schools.setTextSize(0);

        TextView abilityDescription17_1Schools = findViewById(R.id.abilityDescription17_1Schools);
        spaceAbove17thLvlLabelSchools.getLayoutParams().height = 0;
        lvl17AbilitiesSchools.setTextSize(0);
        spaceBelow17thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton17_1Schools.getLayoutParams().height = 0;
        abilityDescription17_1Schools.setTextSize(0);

        TextView abilityDescription18_1Schools = findViewById(R.id.abilityDescription18_1Schools);
        spaceAbove18thLvlLabelSchools.getLayoutParams().height = 0;
        lvl18AbilitiesSchools.setTextSize(0);
        spaceBelow18thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton18_1Schools.getLayoutParams().height = 0;
        abilityDescription18_1Schools.setTextSize(0);

        Space spaceAbove20thLvlLabelSchools = findViewById(R.id.spaceAbove20thLvlLabelSchools);
        TextView lvl20AbilitiesSchools = findViewById(R.id.lvl20AbilitiesSchools);
        Space spaceBelow20thLvlLabelSchools = findViewById(R.id.spaceBelow20thLvlLabelSchools);
        Button abilityButton20_1Schools = findViewById(R.id.abilityButton20_1Schools);
        TextView abilityDescription20_1Schools = findViewById(R.id.abilityDescription20_1Schools);

        spaceAbove20thLvlLabelSchools.getLayoutParams().height = 0;
        lvl20AbilitiesSchools.setTextSize(0);
        spaceBelow20thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton20_1Schools.getLayoutParams().height = 0;
        abilityDescription20_1Schools.setTextSize(0);

        switch (whichClass) {
            case ("barbarian"):
                whichSchool = "PathOfTheTotemWarrior";
                classSchoolTitle.setText(R.string.barbarianPathOfTheTotemWarriorTitle);
                classSchoolTitle.setTextSize(30);
                classSchoolDescription.setText(R.string.barbarianPathOfTheTotemWarrior);
                classSchoolDescription.setTextSize(20);



                spaceAbove3rdLvlLabelSchools.getLayoutParams().height = 10;
                lvl3AbilitiesSchools.setTextSize(20);
                spaceBelow3rdLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton3_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton3_1Schools.setText(R.string.barbarianPathOfTheTotemWarriorSpiritSeekerTitle);

                spaceBetweenLvl3ButtonSchools.getLayoutParams().height = 10;
                abilityButton3_2Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton3_2Schools.setText(R.string.barbarianPathOfTheTotemWarriorTotemSpiritTitle);

                spaceAbove6thLvlLabelSchools.getLayoutParams().height = 10;
                lvl6AbilitiesSchools.setTextSize(20);
                spaceBelow6thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton6_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton6_1Schools.setText(R.string.barbarianPathOfTheTotemWarriorAspectOfTheBeastTitle);

                spaceAbove10thLvlLabelSchools.getLayoutParams().height = 10;
                lvl10AbilitiesSchools.setTextSize(20);
                spaceBelow10thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton10_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton10_1Schools.setText(R.string.barbarianPathOfTheTotemWarriorSpiritWalkerTitle);

                spaceAbove14thLvlLabelSchools.getLayoutParams().height = 10;
                lvl14AbilitiesSchools.setTextSize(20);
                spaceBelow14thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton14_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton14_1Schools.setText(R.string.barbarianPathOfTheTotemWarriorTotemicAttunementTitle);
                break;
            case ("bard"):
                whichSchool = "CollegeOfValor";
                classSchoolTitle.setText(R.string.bardCollegeOfValorTitle);
                classSchoolTitle.setTextSize(30);
                classSchoolDescription.setText(R.string.bardCollegeOfValor);
                classSchoolDescription.setTextSize(20);

                spaceAbove3rdLvlLabelSchools.getLayoutParams().height = 10;
                lvl3AbilitiesSchools.setTextSize(20);
                spaceBelow3rdLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton3_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton3_1Schools.setText(R.string.bardCollegeOfValorBonusProfitienciesTitle);

                spaceBetweenLvl3ButtonSchools.getLayoutParams().height = 10;
                abilityButton3_2Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton3_2Schools.setText(R.string.bardCollegeOfValorCombatInspirationTitle);

                spaceAbove6thLvlLabelSchools.getLayoutParams().height = 10;
                lvl6AbilitiesSchools.setTextSize(20);
                spaceBelow6thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton6_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton6_1Schools.setText(R.string.bardCollegeOfValorExtraAttackTitle);

                spaceAbove14thLvlLabelSchools.getLayoutParams().height = 10;
                lvl14AbilitiesSchools.setTextSize(20);
                spaceBelow14thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton14_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton14_1Schools.setText(R.string.bardCollegeOfValorBattleMagicTitle);
                break;
            case ("cleric"):
                whichSchool = "LightDomain";
                classSchoolTitle.setText(R.string.clericLightDomainTitle);
                classSchoolTitle.setTextSize(30);
                classSchoolDescription.setText(R.string.clericLightDomain);
                classSchoolDescription.setTextSize(20);

                spaceAbove1stLvlLabelSchools.getLayoutParams().height = 10;
                lvl1AbilitiesSchools.setTextSize(20);
                spaceBelow1stLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton1_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton1_1Schools.setText(R.string.clericLightDomainBonusCantripTitle);

                spaceBetween1stLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton1_2Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton1_2Schools.setText(R.string.clericLightDomainWardingFlareTitle);

                spaceAbove2ndLvlLabelSchools.getLayoutParams().height = 10;
                lvl2AbilitiesSchools.setTextSize(20);
                spaceBelow2ndLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton2_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton2_1Schools.setText(R.string.clericLightDomainChannelDivinityRadianceOfTheDawnTitle);


                spaceAbove6thLvlLabelSchools.getLayoutParams().height = 10;
                lvl6AbilitiesSchools.setTextSize(20);
                spaceBelow6thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton6_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton6_1Schools.setText(R.string.clericLightDomainImprovedFlareTitle);

                spaceAbove8thLvlLabelSchools.getLayoutParams().height = 10;
                lvl8AbilitiesSchools.setTextSize(20);
                spaceBelow8thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton8_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton8_1Schools.setText(R.string.clericLightDomainPotentSpellcastingTitle);

                spaceAbove17thLvlLabelSchools.getLayoutParams().height = 10;
                lvl17AbilitiesSchools.setTextSize(20);
                spaceBelow17thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton17_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton17_1Schools.setText(R.string.clericLightDomainCoronaOfLightTitle);
                break;
            case ("druid"):
                whichSchool = "CircleOfTheMoon";
                classSchoolTitle.setText(R.string.druidCircleOfTheMoonTitle);
                classSchoolTitle.setTextSize(30);
                classSchoolDescription.setText(R.string.druidCircleOfTheMoon);
                classSchoolDescription.setTextSize(20);


                spaceAbove2ndLvlLabelSchools.getLayoutParams().height = 10;
                lvl2AbilitiesSchools.setTextSize(20);
                spaceBelow2ndLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton2_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton2_1Schools.setText(R.string.druidCircleOfTheMoonCombatWildShapeTitle);

                spaceBetween2ndLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton2_2Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton2_2Schools.setText(R.string.druidCircleOfTheMoonCircleFormsTitle);


                spaceAbove6thLvlLabelSchools.getLayoutParams().height = 10;
                lvl6AbilitiesSchools.setTextSize(20);
                spaceBelow6thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton6_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton6_1Schools.setText(R.string.druidCircleOfTheMoonPrimalStrikeTitle);

                spaceAbove10thLvlLabelSchools.getLayoutParams().height = 10;
                lvl10AbilitiesSchools.setTextSize(20);
                spaceBelow10thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton10_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton10_1Schools.setText(R.string.druidCircleOfTheMoonElementalWildshapeTitle);

                spaceAbove14thLvlLabelSchools.getLayoutParams().height = 10;
                lvl14AbilitiesSchools.setTextSize(20);
                spaceBelow14thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton14_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton14_1Schools.setText(R.string.druidCircleOfTheMoonThousandFormsTitle);
                break;

            case ("fighter"):
                whichSchool = "BattleMaster";
                classSchoolTitle.setText(R.string.fighterBattleMasterTitle);
                classSchoolTitle.setTextSize(30);
                classSchoolDescription.setText(R.string.fighterBattleMaster);
                classSchoolDescription.setTextSize(20);


                spaceAbove3rdLvlLabelSchools.getLayoutParams().height = 10;
                lvl3AbilitiesSchools.setTextSize(20);
                spaceBelow3rdLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton3_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton3_1Schools.setText(R.string.fighterBattleMasterCombatSuperiorityTitle);

                spaceBetweenLvl3ButtonSchools.getLayoutParams().height = 10;
                abilityButton3_2Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton3_2Schools.setText(R.string.fighterBattleMasterStudentOfWarTitle);


                spaceAbove7thLvlLabelSchools.getLayoutParams().height = 10;
                lvl7AbilitiesSchools.setTextSize(20);
                spaceBelow7thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton7_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton7_1Schools.setText(R.string.fighterBattleMasterKnowYourEnemyTitle);


                spaceAbove10thLvlLabelSchools.getLayoutParams().height = 10;
                lvl10AbilitiesSchools.setTextSize(20);
                spaceBelow10thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton10_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton10_1Schools.setText(R.string.fighterBattleMasterImprovedCombarSuperiorityTitle);

                spaceAbove15thLvlLabelSchools.getLayoutParams().height = 10;
                lvl15AbilitiesSchools.setTextSize(20);
                spaceBelow15thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton15_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton15_1Schools.setText(R.string.fighterBattleMasterRelentlessTitle);
                break;


            case ("monk"):
                whichSchool = "WayOfShadows";
                classSchoolTitle.setText(R.string.monkWayOfShadowTitle);
                classSchoolTitle.setTextSize(30);
                classSchoolDescription.setText(R.string.monkWayOfShadow);
                classSchoolDescription.setTextSize(20);


                spaceAbove3rdLvlLabelSchools.getLayoutParams().height = 10;
                lvl3AbilitiesSchools.setTextSize(20);
                spaceBelow3rdLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton3_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton3_1Schools.setText(R.string.monkWayOfShadowsShadowArtsTitle);


                spaceAbove6thLvlLabelSchools.getLayoutParams().height = 10;
                lvl6AbilitiesSchools.setTextSize(20);
                spaceBelow6thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton6_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton6_1Schools.setText(R.string.monkWayOfShadowsShadowStepTitle);


                spaceAbove11thLvlLabelSchools.getLayoutParams().height = 10;
                lvl11AbilitiesSchools.setTextSize(20);
                spaceBelow11thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton11_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton11_1Schools.setText(R.string.clericTrickeryDomainChannelDivinityCloakOfShadowsTitle);



                spaceAbove17thLvlLabelSchools.getLayoutParams().height = 10;
                lvl17AbilitiesSchools.setTextSize(20);
                spaceBelow17thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton17_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton17_1Schools.setText(R.string.monkWayOfShadowOpportunistTitle);
                break;

            case ("paladin"):
                whichSchool = "OathOfTheAncients";
                classSchoolTitle.setText(R.string.paladinOathOfTheAncientsTitle);
                classSchoolTitle.setTextSize(30);
                classSchoolDescription.setText(R.string.paladinOathOfTheAncients);
                classSchoolDescription.setTextSize(20);


                spaceAbove3rdLvlLabelSchools.getLayoutParams().height = 10;
                lvl3AbilitiesSchools.setTextSize(20);
                spaceBelow3rdLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton3_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton3_1Schools.setText(R.string.paladinOathOfTheAncientsSpellsTitle);

                spaceBetweenLvl3ButtonSchools.getLayoutParams().height = 10;
                abilityButton3_2Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton3_2Schools.setText(R.string.paladinOathOfTheAncientsChannelDivinityTitle);



                spaceAbove7thLvlLabelSchools.getLayoutParams().height = 10;
                lvl7AbilitiesSchools.setTextSize(20);
                spaceBelow7thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton7_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton7_1Schools.setText(R.string.paladinOathOfTheAncientsAuraOfWardingTitle);



                spaceAbove15thLvlLabelSchools.getLayoutParams().height = 10;
                lvl15AbilitiesSchools.setTextSize(20);
                spaceBelow15thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton15_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton15_1Schools.setText(R.string.paladinOathOfTheAncientsUndyingSentinelTitle);

                spaceAbove20thLvlLabelSchools.getLayoutParams().height = 10;
                lvl20AbilitiesSchools.setTextSize(20);
                spaceBelow20thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton20_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton20_1Schools.setText(R.string.paladinOathOfTheAncientsElderChampionTitle);
                break;

            case ("ranger"):
                whichSchool = "BeastMaster";
                classSchoolTitle.setText(R.string.rangerBeastMasterTitle);
                classSchoolTitle.setTextSize(30);
                classSchoolDescription.setText(R.string.rangerBeastMaster);
                classSchoolDescription.setTextSize(20);


                spaceAbove3rdLvlLabelSchools.getLayoutParams().height = 10;
                lvl3AbilitiesSchools.setTextSize(20);
                spaceBelow3rdLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton3_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton3_1Schools.setText(R.string.rangerBeastMasterRangersCompanionTitle);



                spaceAbove7thLvlLabelSchools.getLayoutParams().height = 10;
                lvl7AbilitiesSchools.setTextSize(20);
                spaceBelow7thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton7_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton7_1Schools.setText(R.string.rangerBeastMasterExceptionalTrainingTitle);


                spaceAbove11thLvlLabelSchools.getLayoutParams().height = 10;
                lvl11AbilitiesSchools.setTextSize(20);
                spaceBelow11thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton11_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton11_1Schools.setText(R.string.rangerBeastMasterBestialFuryTitle);

                spaceAbove15thLvlLabelSchools.getLayoutParams().height = 10;
                lvl15AbilitiesSchools.setTextSize(20);
                spaceBelow15thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton15_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton15_1Schools.setText(R.string.rangerBeastMasterShareSpellsTitle);
                break;

            case ("rogue"):
                whichSchool = "Assassin";
                classSchoolTitle.setText(R.string.rogueAssassinTitle);
                classSchoolTitle.setTextSize(30);
                classSchoolDescription.setText(R.string.rogueAssassin);
                classSchoolDescription.setTextSize(20);


                spaceAbove3rdLvlLabelSchools.getLayoutParams().height = 10;
                lvl3AbilitiesSchools.setTextSize(20);
                spaceBelow3rdLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton3_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton3_1Schools.setText(R.string.rogueAssassinBonusProficiencyTitle);

                spaceBetweenLvl3ButtonSchools.getLayoutParams().height = 10;
                abilityButton3_2Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton3_2Schools.setText(R.string.rogueAssassinAssassinateTitle);



                spaceAbove9thLvlLabelSchools.getLayoutParams().height = 10;
                lvl9AbilitiesSchools.setTextSize(20);
                spaceBelow9thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton9_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton9_1Schools.setText(R.string.rogueAssassinInfiltrationExpertiseTitle);


                spaceAbove13thLvlLabelSchools.getLayoutParams().height = 10;
                lvl13AbilitiesSchools.setTextSize(20);
                spaceBelow13thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton13_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton13_1Schools.setText(R.string.rogueAssassinImpostorTitle);

                spaceAbove17thLvlLabelSchools.getLayoutParams().height = 10;
                lvl17AbilitiesSchools.setTextSize(20);
                spaceBelow17thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton17_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton17_1Schools.setText(R.string.rogueAssassinDeathStrikeTitle);
                break;

            case ("sorcerer"):
                whichSchool = "WildMagic";
                classSchoolTitle.setText(R.string.sorcererWildMagicTitle);
                classSchoolTitle.setTextSize(30);
                classSchoolDescription.setText(R.string.sorcererWildMagic);
                classSchoolDescription.setTextSize(20);


                spaceAbove1stLvlLabelSchools.getLayoutParams().height = 10;
                lvl1AbilitiesSchools.setTextSize(20);
                spaceBelow1stLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton1_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton1_1Schools.setText(R.string.sorcererWildMagicWildMagicSurgeTitle);

                spaceBetween1stLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton1_2Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton1_2Schools.setText(R.string.sorcererWildMagicTidesOfChaosTitle);



                spaceAbove6thLvlLabelSchools.getLayoutParams().height = 10;
                lvl6AbilitiesSchools.setTextSize(20);
                spaceBelow6thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton6_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton6_1Schools.setText(R.string.sorcererWildMagicBendLuckTitle);




                spaceAbove14thLvlLabelSchools.getLayoutParams().height = 10;
                lvl14AbilitiesSchools.setTextSize(20);
                spaceBelow14thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton14_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton14_1Schools.setText(R.string.sorcererWildMagicControlledChaosTitle);

                spaceAbove18thLvlLabelSchools.getLayoutParams().height = 10;
                lvl18AbilitiesSchools.setTextSize(20);
                spaceBelow18thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton18_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton18_1Schools.setText(R.string.sorcererWildMagicSpellBombardmentTitle);
                break;

            case ("warlock"):
                whichSchool = "TheFiend";
                classSchoolTitle.setText(R.string.warlockFiendTitle);
                classSchoolTitle.setTextSize(30);
                classSchoolDescription.setText(R.string.warlockFiend);
                classSchoolDescription.setTextSize(20);


                spaceAbove1stLvlLabelSchools.getLayoutParams().height = 10;
                lvl1AbilitiesSchools.setTextSize(20);
                spaceBelow1stLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton1_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton1_1Schools.setText(R.string.warlockFiendExpandedSpellListTitle);

                spaceBetween1stLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton1_2Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton1_2Schools.setText(R.string.warlockFiendDarkOnesBlessingTitle);



                spaceAbove6thLvlLabelSchools.getLayoutParams().height = 10;
                lvl6AbilitiesSchools.setTextSize(20);
                spaceBelow6thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton6_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton6_1Schools.setText(R.string.warlockFiendDarkOnesOwnLuckTitle);


                spaceAbove10thLvlLabelSchools.getLayoutParams().height = 10;
                lvl10AbilitiesSchools.setTextSize(20);
                spaceBelow10thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton10_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton10_1Schools.setText(R.string.warlockFiendFiendishReplenishTitle);

                spaceAbove14thLvlLabelSchools.getLayoutParams().height = 10;
                lvl14AbilitiesSchools.setTextSize(20);
                spaceBelow14thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton14_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton14_1Schools.setText(R.string.warlockFiendHurlThroughTItle);

                break;

            case ("wizard"):
                whichSchool = "SchoolOfConjuration";
                classSchoolTitle.setText(R.string.wizardSchoolOfConjurationTitle);
                classSchoolTitle.setTextSize(30);
                classSchoolDescription.setText(R.string.wizardSchoolOfConjuration);
                classSchoolDescription.setTextSize(20);


                spaceAbove2ndLvlLabelSchools.getLayoutParams().height = 10;
                lvl2AbilitiesSchools.setTextSize(20);
                spaceBelow2ndLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton2_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton2_1Schools.setText(R.string.wizardSchoolOfConjurationConjurationServantTitle);

                spaceBetween2ndLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton2_2Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton2_2Schools.setText(R.string.wizardSchooldOfConjurationMinorConjurationTitle);


                spaceAbove6thLvlLabelSchools.getLayoutParams().height = 10;
                lvl6AbilitiesSchools.setTextSize(20);
                spaceBelow6thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton6_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton6_1Schools.setText(R.string.wizardSchoolOfConjurationBenignTranspositionTitle);


                spaceAbove10thLvlLabelSchools.getLayoutParams().height = 10;
                lvl10AbilitiesSchools.setTextSize(20);
                spaceBelow10thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton10_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton10_1Schools.setText(R.string.wizardSchoolOfConjurationFocusedConjurationTitle);


                spaceAbove14thLvlLabelSchools.getLayoutParams().height = 10;
                lvl14AbilitiesSchools.setTextSize(20);
                spaceBelow14thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton14_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton14_1Schools.setText(R.string.wizardSchoolOfConjurationDurableSummonsTitle);

                break;


        }
    }

    public void onAbilityClassSchoolButton3(View view) {
        TextView classSchoolTitle = findViewById(R.id.chosenClassSchoolTitle);
        TextView classSchoolDescription = findViewById(R.id.chosenClassSchoolsDescription);
        Button classSchoolButton1 = findViewById(R.id.abilityCassSchoolButton1);
        Button classSchoolButton2 = findViewById(R.id.abilityCassSchoolButton2);
        Button classSchoolButton3 = findViewById(R.id.abilityCassSchoolButton3);
        Button classSchoolButton4 = findViewById(R.id.abilityCassSchoolButton4);
        Button classSchoolButton5 = findViewById(R.id.abilityCassSchoolButton5);
        Button classSchoolButton6 = findViewById(R.id.abilityCassSchoolButton6);
        Button classSchoolButton7 = findViewById(R.id.abilityCassSchoolButton7);
        Button classSchoolButton8 = findViewById(R.id.abilityCassSchoolButton8);


        Space spaceAbove1stLvlLabelSchools = findViewById(R.id.spaceAbove1stLvlLabelSchools);
        TextView lvl1AbilitiesSchools = findViewById(R.id.lvl1AbilitiesSchools);
        Space spaceBelow1stLvlLabelSchools = findViewById(R.id.spaceBelow1stLvlLabelSchools);
        Button abilityButton1_1Schools = findViewById(R.id.abilityButton1_1Schools);

        Space spaceBetween1stLvlLabelSchools = findViewById(R.id.spaceBetween1stLvlLabelSchools);
        Button abilityButton1_2Schools = findViewById(R.id.abilityButton1_2Schools);

        Space spaceAbove2ndLvlLabelSchools = findViewById(R.id.spaceAbove2ndLvlLabelSchools);
        TextView lvl2AbilitiesSchools = findViewById(R.id.lvl2AbilitiesSchools);
        Space spaceBelow2ndLvlLabelSchools = findViewById(R.id.spaceBelow2ndLvlLabelSchools);
        Button abilityButton2_1Schools = findViewById(R.id.abilityButton2_1Schools);
        Button abilityButton2_2Schools = findViewById(R.id.abilityButton2_2Schools);

        Space spaceAbove3rdLvlLabelSchools = findViewById(R.id.spaceAbove3rdLvlLabelSchools);
        TextView lvl3AbilitiesSchools = findViewById(R.id.lvl3AbilitiesSchools);
        Space spaceBelow3rdLvlLabelSchools = findViewById(R.id.spaceBelow3rdLvlLabelSchools);
        Button abilityButton3_1Schools = findViewById(R.id.abilityButton3_1Schools);
        Space spaceBetweenLvl3ButtonSchools = findViewById(R.id.spaceBetween3LvlButtonsSchools);
        Button abilityButton3_2Schools = findViewById(R.id.abilityButton3_2Schools);

        Space spaceAbove6thLvlLabelSchools = findViewById(R.id.spaceAbove6thLvlLabelSchools);
        TextView lvl6AbilitiesSchools = findViewById(R.id.lvl6AbilitiesSchools);
        Space spaceBelow6thLvlLabelSchools = findViewById(R.id.spaceBelow6thLvlLabelSchools);
        Button abilityButton6_1Schools = findViewById(R.id.abilityButton6_1Schools);

        Space spaceAbove7thLvlLabelSchools = findViewById(R.id.spaceAbove7thLvlLabelSchools);
        TextView lvl7AbilitiesSchools = findViewById(R.id.lvl7AbilitiesSchools);
        Space spaceBelow7thLvlLabelSchools = findViewById(R.id.spaceBelow7thLvlLabelSchools);
        Button abilityButton7_1Schools = findViewById(R.id.abilityButton7_1Schools);


        Space spaceAbove8thLvlLabelSchools = findViewById(R.id.spaceAbove8thLvlLabelSchools);
        TextView lvl8AbilitiesSchools = findViewById(R.id.lvl8AbilitiesSchools);
        Space spaceBelow8thLvlLabelSchools = findViewById(R.id.spaceBelow8thLvlLabelSchools);
        Button abilityButton8_1Schools = findViewById(R.id.abilityButton8_1Schools);


        Space spaceAbove10thLvlLabelSchools = findViewById(R.id.spaceAbove10thLvlLabelSchools);
        TextView lvl10AbilitiesSchools = findViewById(R.id.lvl10AbilitiesSchools);
        Space spaceBelow10thLvlLabelSchools = findViewById(R.id.spaceBelow10thLvlLabelSchools);
        Button abilityButton10_1Schools = findViewById(R.id.abilityButton10_1Schools);

        Space spaceAbove11thLvlLabelSchools = findViewById(R.id.spaceAbove11thLvlLabelSchools);
        TextView lvl11AbilitiesSchools = findViewById(R.id.lvl11AbilitiesSchools);
        Space spaceBelow11thLvlLabelSchools = findViewById(R.id.spaceBelow11thLvlLabelSchools);
        Button abilityButton11_1Schools = findViewById(R.id.abilityButton11_1Schools);

        Space spaceAbove14thLvlLabelSchools = findViewById(R.id.spaceAbove14thLvlLabelSchools);
        TextView lvl14AbilitiesSchools = findViewById(R.id.lvl14AbilitiesSchools);
        Space spaceBelow14thLvlLabelSchools = findViewById(R.id.spaceBelow14thLvlLabelSchools);
        Button abilityButton14_1Schools = findViewById(R.id.abilityButton14_1Schools);

        Space spaceAbove15thLvlLabelSchools = findViewById(R.id.spaceAbove15thLvlLabelSchools);
        TextView lvl15AbilitiesSchools = findViewById(R.id.lvl15AbilitiesSchools);
        Space spaceBelow15thLvlLabelSchools = findViewById(R.id.spaceBelow15thLvlLabelSchools);
        Button abilityButton15_1Schools = findViewById(R.id.abilityButton15_1Schools);

        Space spaceAbove17thLvlLabelSchools = findViewById(R.id.spaceAbove17thLvlLabelSchools);
        TextView lvl17AbilitiesSchools = findViewById(R.id.lvl17AbilitiesSchools);
        Space spaceBelow17thLvlLabelSchools = findViewById(R.id.spaceBelow17thLvlLabelSchools);
        Button abilityButton17_1Schools = findViewById(R.id.abilityButton17_1Schools);

        Space spaceAbove18thLvlLabelSchools = findViewById(R.id.spaceAbove18thLvlLabelSchools);
        TextView lvl18AbilitiesSchools = findViewById(R.id.lvl18AbilitiesSchools);
        Space spaceBelow18thLvlLabelSchools = findViewById(R.id.spaceBelow18thLvlLabelSchools);
        Button abilityButton18_1Schools = findViewById(R.id.abilityButton18_1Schools);

        classSchoolButton1.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton2.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton4.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton5.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton6.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton7.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton8.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton3.setBackgroundColor(Color.parseColor("#63a6f2"));

        TextView abilityDescription1_1Schools = findViewById(R.id.abilityDescription1_1Schools);
        spaceAbove1stLvlLabelSchools.getLayoutParams().height = 0;
        lvl1AbilitiesSchools.setTextSize(0);
        spaceBelow1stLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton1_1Schools.getLayoutParams().height = 0;
        abilityDescription1_1Schools.setTextSize(0);

        TextView abilityDescription1_2Schools = findViewById(R.id.abilityDescription1_2Schools);
        spaceBetween1stLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton1_2Schools.getLayoutParams().height = 0;
        abilityDescription1_2Schools.setTextSize(0);

        TextView abilityDescription2_1Schools = findViewById(R.id.abilityDescription2_1Schools);
        spaceAbove2ndLvlLabelSchools.getLayoutParams().height = 0;
        lvl2AbilitiesSchools.setTextSize(0);
        spaceBelow2ndLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton2_1Schools.getLayoutParams().height = 0;
        abilityDescription2_1Schools.setTextSize(0);

        Space spaceBetween2ndLvlLabelSchools = findViewById(R.id.spaceBetween2ndLvlLabelSchools);
        TextView abilityDescription2_2Schools = findViewById(R.id.abilityDescription2_2Schools);
        spaceBetween2ndLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton2_2Schools.getLayoutParams().height = 0;
        abilityDescription2_2Schools.setTextSize(0);

        TextView abilityDescription3_1Schools = findViewById(R.id.abilityDescription3_1Schools);
        TextView abilityDescription3_2Schools = findViewById(R.id.abilityDescription3_2Schools);
        spaceAbove3rdLvlLabelSchools.getLayoutParams().height = 0;
        lvl3AbilitiesSchools.setTextSize(0);
        spaceBelow3rdLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton3_1Schools.getLayoutParams().height = 0;
        abilityDescription3_1Schools.setTextSize(0);
        spaceBetweenLvl3ButtonSchools.getLayoutParams().height = 0;
        abilityButton3_2Schools.getLayoutParams().height = 0;
        abilityDescription3_2Schools.setTextSize(0);

        TextView abilityDescription6_1Schools = findViewById(R.id.abilityDescription6_1Schools);
        spaceAbove6thLvlLabelSchools.getLayoutParams().height = 0;
        lvl6AbilitiesSchools.setTextSize(0);
        spaceBelow6thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton6_1Schools.getLayoutParams().height = 0;
        abilityDescription6_1Schools.setTextSize(0);

        TextView abilityDescription7_1Schools = findViewById(R.id.abilityDescription7_1Schools);
        spaceAbove7thLvlLabelSchools.getLayoutParams().height = 0;
        lvl7AbilitiesSchools.setTextSize(0);
        spaceBelow7thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton7_1Schools.getLayoutParams().height = 0;
        abilityDescription7_1Schools.setTextSize(0);

        TextView abilityDescription8_1Schools = findViewById(R.id.abilityDescription8_1Schools);
        spaceAbove8thLvlLabelSchools.getLayoutParams().height = 0;
        lvl8AbilitiesSchools.setTextSize(0);
        spaceBelow8thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton8_1Schools.getLayoutParams().height = 0;
        abilityDescription8_1Schools.setTextSize(0);

        Space spaceAbove9thLvlLabelSchools = findViewById(R.id.spaceAbove9thLvlLabelSchools);
        TextView lvl9AbilitiesSchools = findViewById(R.id.lvl9AbilitiesSchools);
        Space spaceBelow9thLvlLabelSchools = findViewById(R.id.spaceBelow9thLvlLabelSchools);
        Button abilityButton9_1Schools = findViewById(R.id.abilityButton9_1Schools);
        TextView abilityDescription9_1Schools = findViewById(R.id.abilityDescription9_1Schools);

        spaceAbove9thLvlLabelSchools.getLayoutParams().height = 0;
        lvl9AbilitiesSchools.setTextSize(0);
        spaceBelow9thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton9_1Schools.getLayoutParams().height = 0;
        abilityDescription9_1Schools.setTextSize(0);

        TextView abilityDescription10_1Schools = findViewById(R.id.abilityDescription10_1Schools);
        spaceAbove10thLvlLabelSchools.getLayoutParams().height = 0;
        lvl10AbilitiesSchools.setTextSize(0);
        spaceBelow10thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton10_1Schools.getLayoutParams().height = 0;
        abilityDescription10_1Schools.setTextSize(0);

        TextView abilityDescription11_1Schools = findViewById(R.id.abilityDescription11_1Schools);
        spaceAbove11thLvlLabelSchools.getLayoutParams().height = 0;
        lvl11AbilitiesSchools.setTextSize(0);
        spaceBelow11thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton11_1Schools.getLayoutParams().height = 0;
        abilityDescription11_1Schools.setTextSize(0);

        Space spaceAbove13thLvlLabelSchools = findViewById(R.id.spaceAbove13thLvlLabelSchools);
        TextView lvl13AbilitiesSchools = findViewById(R.id.lvl13AbilitiesSchools);
        Space spaceBelow13thLvlLabelSchools = findViewById(R.id.spaceBelow13thLvlLabelSchools);
        Button abilityButton13_1Schools = findViewById(R.id.abilityButton13_1Schools);
        TextView abilityDescription13_1Schools = findViewById(R.id.abilityDescription13_1Schools);

        spaceAbove13thLvlLabelSchools.getLayoutParams().height = 0;
        lvl13AbilitiesSchools.setTextSize(0);
        spaceBelow13thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton13_1Schools.getLayoutParams().height = 0;
        abilityDescription13_1Schools.setTextSize(0);

        TextView abilityDescription14_1Schools = findViewById(R.id.abilityDescription14_1Schools);
        spaceAbove14thLvlLabelSchools.getLayoutParams().height = 0;
        lvl14AbilitiesSchools.setTextSize(0);
        spaceBelow14thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton14_1Schools.getLayoutParams().height = 0;
        abilityDescription14_1Schools.setTextSize(0);

        TextView abilityDescription15_1Schools = findViewById(R.id.abilityDescription15_1Schools);
        spaceAbove15thLvlLabelSchools.getLayoutParams().height = 0;
        lvl15AbilitiesSchools.setTextSize(0);
        spaceBelow15thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton15_1Schools.getLayoutParams().height = 0;
        abilityDescription15_1Schools.setTextSize(0);

        TextView abilityDescription17_1Schools = findViewById(R.id.abilityDescription17_1Schools);
        spaceAbove17thLvlLabelSchools.getLayoutParams().height = 0;
        lvl17AbilitiesSchools.setTextSize(0);
        spaceBelow17thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton17_1Schools.getLayoutParams().height = 0;
        abilityDescription17_1Schools.setTextSize(0);

        TextView abilityDescription18_1Schools = findViewById(R.id.abilityDescription18_1Schools);
        spaceAbove18thLvlLabelSchools.getLayoutParams().height = 0;
        lvl18AbilitiesSchools.setTextSize(0);
        spaceBelow18thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton18_1Schools.getLayoutParams().height = 0;
        abilityDescription18_1Schools.setTextSize(0);

        Space spaceAbove20thLvlLabelSchools = findViewById(R.id.spaceAbove20thLvlLabelSchools);
        TextView lvl20AbilitiesSchools = findViewById(R.id.lvl20AbilitiesSchools);
        Space spaceBelow20thLvlLabelSchools = findViewById(R.id.spaceBelow20thLvlLabelSchools);
        Button abilityButton20_1Schools = findViewById(R.id.abilityButton20_1Schools);
        TextView abilityDescription20_1Schools = findViewById(R.id.abilityDescription20_1Schools);

        spaceAbove20thLvlLabelSchools.getLayoutParams().height = 0;
        lvl20AbilitiesSchools.setTextSize(0);
        spaceBelow20thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton20_1Schools.getLayoutParams().height = 0;
        abilityDescription20_1Schools.setTextSize(0);

        switch (whichClass) {
            case ("cleric"):
                whichSchool = "LifeDomain";
                classSchoolTitle.setText(R.string.clericLifeDomainTitle);
                classSchoolTitle.setTextSize(30);
                classSchoolDescription.setText(R.string.clericLifeDomain);
                classSchoolDescription.setTextSize(20);

                spaceAbove1stLvlLabelSchools.getLayoutParams().height = 10;
                lvl1AbilitiesSchools.setTextSize(20);
                spaceBelow1stLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton1_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton1_1Schools.setText(R.string.clericLifeDomainBonusProfitioencyTitle);

                spaceBetween1stLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton1_2Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton1_2Schools.setText(R.string.clericLifeDomainDiscipleOfLifeTitle);

                spaceAbove2ndLvlLabelSchools.getLayoutParams().height = 10;
                lvl2AbilitiesSchools.setTextSize(20);
                spaceBelow2ndLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton2_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton2_1Schools.setText(R.string.clericLifeDomainChannelDivinityPreserveLifeTitle);


                spaceAbove6thLvlLabelSchools.getLayoutParams().height = 10;
                lvl6AbilitiesSchools.setTextSize(20);
                spaceBelow6thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton6_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton6_1Schools.setText(R.string.clericLifeDomainBlessedHealerTitle);

                spaceAbove8thLvlLabelSchools.getLayoutParams().height = 10;
                lvl8AbilitiesSchools.setTextSize(20);
                spaceBelow8thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton8_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton8_1Schools.setText(R.string.clericLifeDomainDivineStrikeTitle);

                spaceAbove17thLvlLabelSchools.getLayoutParams().height = 10;
                lvl17AbilitiesSchools.setTextSize(20);
                spaceBelow17thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton17_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton17_1Schools.setText(R.string.clericLifeDomainSupremeHealingTitle);
                break;

            case ("fighter"):
                whichSchool = "EldritchKnight";
                classSchoolTitle.setText(R.string.fighterEldritchKnightTitle);
                classSchoolTitle.setTextSize(30);
                classSchoolDescription.setText(R.string.fighterEldritchKnight);
                classSchoolDescription.setTextSize(20);


                spaceAbove3rdLvlLabelSchools.getLayoutParams().height = 10;
                lvl3AbilitiesSchools.setTextSize(20);
                spaceBelow3rdLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton3_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton3_1Schools.setText(R.string.fighterEldrichtKnightWeaponBoundTitle);



                spaceAbove7thLvlLabelSchools.getLayoutParams().height = 10;
                lvl7AbilitiesSchools.setTextSize(20);
                spaceBelow7thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton7_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton7_1Schools.setText(R.string.fighterEldritchKnightWarMagicTitle);


                spaceAbove10thLvlLabelSchools.getLayoutParams().height = 10;
                lvl10AbilitiesSchools.setTextSize(20);
                spaceBelow10thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton10_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton10_1Schools.setText(R.string.fighterEldrichtKnightEldritchStrikeTitle);

                spaceAbove15thLvlLabelSchools.getLayoutParams().height = 10;
                lvl15AbilitiesSchools.setTextSize(20);
                spaceBelow15thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton15_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton15_1Schools.setText(R.string.fighterEldritchKnightArcaneChargeTitle);

                spaceAbove18thLvlLabelSchools.getLayoutParams().height = 10;
                lvl18AbilitiesSchools.setTextSize(20);
                spaceBelow18thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton18_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton18_1Schools.setText(R.string.fighterEldritchKnightImprovedWarMagicTitle);
                break;

            case ("monk"):
                whichSchool = "WayOfFourElements";
                classSchoolTitle.setText(R.string.monkWayOfTheFourElementsTitle);
                classSchoolTitle.setTextSize(30);
                classSchoolDescription.setText(R.string.monkWayOfTheFourElements);
                classSchoolDescription.setTextSize(20);


                spaceAbove3rdLvlLabelSchools.getLayoutParams().height = 10;
                lvl3AbilitiesSchools.setTextSize(20);
                spaceBelow3rdLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton3_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton3_1Schools.setText(R.string.monkWayOfTheFourElementsDiscipleOfTheElementTitle);

                spaceBetweenLvl3ButtonSchools.getLayoutParams().height = 10;
                abilityButton3_2Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton3_2Schools.setText(R.string.monkWayOfFourElementsElementalDisciplinesTitle);

                break;

            case ("paladin"):
                whichSchool = "OathOfVengeance";
                classSchoolTitle.setText(R.string.paladinOathOfVengenceTitle);
                classSchoolTitle.setTextSize(30);
                classSchoolDescription.setText(R.string.paladinOathOfVengence);
                classSchoolDescription.setTextSize(20);


                spaceAbove3rdLvlLabelSchools.getLayoutParams().height = 10;
                lvl3AbilitiesSchools.setTextSize(20);
                spaceBelow3rdLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton3_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton3_1Schools.setText(R.string.paladinOathOfVengenceSpellsTitle);

                spaceBetweenLvl3ButtonSchools.getLayoutParams().height = 10;
                abilityButton3_2Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton3_2Schools.setText(R.string.paladinOathOfVengenceChannelDivinityTitle);



                spaceAbove7thLvlLabelSchools.getLayoutParams().height = 10;
                lvl7AbilitiesSchools.setTextSize(20);
                spaceBelow7thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton7_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton7_1Schools.setText(R.string.paladinOathOFVengenceRelentlessAvengerTitle);



                spaceAbove15thLvlLabelSchools.getLayoutParams().height = 10;
                lvl15AbilitiesSchools.setTextSize(20);
                spaceBelow15thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton15_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton15_1Schools.setText(R.string.paladinOathOfVengenceSoulOfVengeanceTitle);

                spaceAbove20thLvlLabelSchools.getLayoutParams().height = 10;
                lvl20AbilitiesSchools.setTextSize(20);
                spaceBelow20thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton20_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton20_1Schools.setText(R.string.paladinOathOfVengenaceAvengingAngelTitle);
                break;

            case ("rogue"):
                whichSchool = "ArcaneTrickster";
                classSchoolTitle.setText(R.string.rogueArcaneTricksterTitle);
                classSchoolTitle.setTextSize(30);
                classSchoolDescription.setText(R.string.rogueArcaneTrickster);
                classSchoolDescription.setTextSize(20);


                spaceAbove3rdLvlLabelSchools.getLayoutParams().height = 10;
                lvl3AbilitiesSchools.setTextSize(20);
                spaceBelow3rdLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton3_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton3_1Schools.setText(R.string.rogueArcaneTricksterMageHandLegerdemainTitle);



                spaceAbove9thLvlLabelSchools.getLayoutParams().height = 10;
                lvl9AbilitiesSchools.setTextSize(20);
                spaceBelow9thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton9_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton9_1Schools.setText(R.string.rogueArcaneTricksterMagicalAmbushTitle);


                spaceAbove13thLvlLabelSchools.getLayoutParams().height = 10;
                lvl13AbilitiesSchools.setTextSize(20);
                spaceBelow13thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton13_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton13_1Schools.setText(R.string.rogueArcaneTricksterVersatileTricksterTitle);

                spaceAbove17thLvlLabelSchools.getLayoutParams().height = 10;
                lvl17AbilitiesSchools.setTextSize(20);
                spaceBelow17thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton17_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton17_1Schools.setText(R.string.rogueArcaneTricksterSpellThiefTitle);
                break;

            case ("warlock"):
                whichSchool = "TheGreatOldOne";
                classSchoolTitle.setText(R.string.warlockGreatOldOneTitle);
                classSchoolTitle.setTextSize(30);
                classSchoolDescription.setText(R.string.warlockGreatOldOne);
                classSchoolDescription.setTextSize(20);


                spaceAbove1stLvlLabelSchools.getLayoutParams().height = 10;
                lvl1AbilitiesSchools.setTextSize(20);
                spaceBelow1stLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton1_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton1_1Schools.setText(R.string.warlockGreatOldOneExpendedSpellListTitle);

                spaceBetween1stLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton1_2Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton1_2Schools.setText(R.string.warlockGreatOldOneAwakenedMindTitle);



                spaceAbove6thLvlLabelSchools.getLayoutParams().height = 10;
                lvl6AbilitiesSchools.setTextSize(20);
                spaceBelow6thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton6_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton6_1Schools.setText(R.string.warlockGreatOldOneEntropicWardTitle);


                spaceAbove10thLvlLabelSchools.getLayoutParams().height = 10;
                lvl10AbilitiesSchools.setTextSize(20);
                spaceBelow10thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton10_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton10_1Schools.setText(R.string.warlockGreatOldOneThoughtShieldTitle);

                spaceAbove14thLvlLabelSchools.getLayoutParams().height = 10;
                lvl14AbilitiesSchools.setTextSize(20);
                spaceBelow14thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton14_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton14_1Schools.setText(R.string.warlockGreatOldOneGreatThrallTitle);

                break;

            case ("wizard"):
                whichSchool = "SchoolOfDivination";
                classSchoolTitle.setText(R.string.wizardSchoolOfDivinationTitle);
                classSchoolTitle.setTextSize(30);
                classSchoolDescription.setText(R.string.wizardSchoolOfDivination);
                classSchoolDescription.setTextSize(20);


                spaceAbove2ndLvlLabelSchools.getLayoutParams().height = 10;
                lvl2AbilitiesSchools.setTextSize(20);
                spaceBelow2ndLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton2_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton2_1Schools.setText(R.string.wizardSchoolOfDivinationDivinationSavantTitle);

                spaceBetween2ndLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton2_2Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton2_2Schools.setText(R.string.wizardSchoolOfDivinationPortendTitle);


                spaceAbove6thLvlLabelSchools.getLayoutParams().height = 10;
                lvl6AbilitiesSchools.setTextSize(20);
                spaceBelow6thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton6_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton6_1Schools.setText(R.string.wizardSchoolOfDivinationExpertDivinationTitle);


                spaceAbove10thLvlLabelSchools.getLayoutParams().height = 10;
                lvl10AbilitiesSchools.setTextSize(20);
                spaceBelow10thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton10_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton10_1Schools.setText(R.string.wizardSchoolOfDivinationTheThirdEyeTitle);


                spaceAbove14thLvlLabelSchools.getLayoutParams().height = 10;
                lvl14AbilitiesSchools.setTextSize(20);
                spaceBelow14thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton14_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton14_1Schools.setText(R.string.wizardSchoolOfDivinationGreaterPortentTitle);

                break;

        }
    }

    public void onAbilityClassSchoolButton4(View view) {
        TextView classSchoolTitle = findViewById(R.id.chosenClassSchoolTitle);
        TextView classSchoolDescription = findViewById(R.id.chosenClassSchoolsDescription);
        Button classSchoolButton1 = findViewById(R.id.abilityCassSchoolButton1);
        Button classSchoolButton2 = findViewById(R.id.abilityCassSchoolButton2);
        Button classSchoolButton3 = findViewById(R.id.abilityCassSchoolButton3);
        Button classSchoolButton4 = findViewById(R.id.abilityCassSchoolButton4);
        Button classSchoolButton5 = findViewById(R.id.abilityCassSchoolButton5);
        Button classSchoolButton6 = findViewById(R.id.abilityCassSchoolButton6);
        Button classSchoolButton7 = findViewById(R.id.abilityCassSchoolButton7);
        Button classSchoolButton8 = findViewById(R.id.abilityCassSchoolButton8);


        Space spaceAbove1stLvlLabelSchools = findViewById(R.id.spaceAbove1stLvlLabelSchools);
        TextView lvl1AbilitiesSchools = findViewById(R.id.lvl1AbilitiesSchools);
        Space spaceBelow1stLvlLabelSchools = findViewById(R.id.spaceBelow1stLvlLabelSchools);
        Button abilityButton1_1Schools = findViewById(R.id.abilityButton1_1Schools);

        Space spaceBetween1stLvlLabelSchools = findViewById(R.id.spaceBetween1stLvlLabelSchools);
        Button abilityButton1_2Schools = findViewById(R.id.abilityButton1_2Schools);

        Space spaceAbove2ndLvlLabelSchools = findViewById(R.id.spaceAbove2ndLvlLabelSchools);
        TextView lvl2AbilitiesSchools = findViewById(R.id.lvl2AbilitiesSchools);
        Space spaceBelow2ndLvlLabelSchools = findViewById(R.id.spaceBelow2ndLvlLabelSchools);
        Button abilityButton2_1Schools = findViewById(R.id.abilityButton2_1Schools);

        Button abilityButton2_2Schools = findViewById(R.id.abilityButton2_2Schools);


        Space spaceAbove3rdLvlLabelSchools = findViewById(R.id.spaceAbove3rdLvlLabelSchools);
        TextView lvl3AbilitiesSchools = findViewById(R.id.lvl3AbilitiesSchools);
        Space spaceBelow3rdLvlLabelSchools = findViewById(R.id.spaceBelow3rdLvlLabelSchools);
        Button abilityButton3_1Schools = findViewById(R.id.abilityButton3_1Schools);
        Space spaceBetweenLvl3ButtonSchools = findViewById(R.id.spaceBetween3LvlButtonsSchools);
        Button abilityButton3_2Schools = findViewById(R.id.abilityButton3_2Schools);

        Space spaceAbove6thLvlLabelSchools = findViewById(R.id.spaceAbove6thLvlLabelSchools);
        TextView lvl6AbilitiesSchools = findViewById(R.id.lvl6AbilitiesSchools);
        Space spaceBelow6thLvlLabelSchools = findViewById(R.id.spaceBelow6thLvlLabelSchools);
        Button abilityButton6_1Schools = findViewById(R.id.abilityButton6_1Schools);




        Space spaceAbove8thLvlLabelSchools = findViewById(R.id.spaceAbove8thLvlLabelSchools);
        TextView lvl8AbilitiesSchools = findViewById(R.id.lvl8AbilitiesSchools);
        Space spaceBelow8thLvlLabelSchools = findViewById(R.id.spaceBelow8thLvlLabelSchools);
        Button abilityButton8_1Schools = findViewById(R.id.abilityButton8_1Schools);


        Space spaceAbove10thLvlLabelSchools = findViewById(R.id.spaceAbove10thLvlLabelSchools);
        TextView lvl10AbilitiesSchools = findViewById(R.id.lvl10AbilitiesSchools);
        Space spaceBelow10thLvlLabelSchools = findViewById(R.id.spaceBelow10thLvlLabelSchools);
        Button abilityButton10_1Schools = findViewById(R.id.abilityButton10_1Schools);


        Space spaceAbove14thLvlLabelSchools = findViewById(R.id.spaceAbove14thLvlLabelSchools);
        TextView lvl14AbilitiesSchools = findViewById(R.id.lvl14AbilitiesSchools);
        Space spaceBelow14thLvlLabelSchools = findViewById(R.id.spaceBelow14thLvlLabelSchools);
        Button abilityButton14_1Schools = findViewById(R.id.abilityButton14_1Schools);


        Space spaceAbove17thLvlLabelSchools = findViewById(R.id.spaceAbove17thLvlLabelSchools);
        TextView lvl17AbilitiesSchools = findViewById(R.id.lvl17AbilitiesSchools);
        Space spaceBelow17thLvlLabelSchools = findViewById(R.id.spaceBelow17thLvlLabelSchools);
        Button abilityButton17_1Schools = findViewById(R.id.abilityButton17_1Schools);



        classSchoolButton1.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton2.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton3.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton5.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton6.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton7.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton8.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton4.setBackgroundColor(Color.parseColor("#63a6f2"));

        TextView abilityDescription1_1Schools = findViewById(R.id.abilityDescription1_1Schools);
        spaceAbove1stLvlLabelSchools.getLayoutParams().height = 0;
        lvl1AbilitiesSchools.setTextSize(0);
        spaceBelow1stLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton1_1Schools.getLayoutParams().height = 0;
        abilityDescription1_1Schools.setTextSize(0);

        TextView abilityDescription1_2Schools = findViewById(R.id.abilityDescription1_2Schools);
        spaceBetween1stLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton1_2Schools.getLayoutParams().height = 0;
        abilityDescription1_2Schools.setTextSize(0);

        TextView abilityDescription2_1Schools = findViewById(R.id.abilityDescription2_1Schools);
        spaceAbove2ndLvlLabelSchools.getLayoutParams().height = 0;
        lvl2AbilitiesSchools.setTextSize(0);
        spaceBelow2ndLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton2_1Schools.getLayoutParams().height = 0;
        abilityDescription2_1Schools.setTextSize(0);

        Space spaceBetween2ndLvlLabelSchools = findViewById(R.id.spaceBetween2ndLvlLabelSchools);
        TextView abilityDescription2_2Schools = findViewById(R.id.abilityDescription2_2Schools);
        spaceBetween2ndLvlLabelSchools.getLayoutParams().height = 0;
        abilityDescription2_2Schools.setTextSize(0);

        TextView abilityDescription3_1Schools = findViewById(R.id.abilityDescription3_1Schools);
        TextView abilityDescription3_2Schools = findViewById(R.id.abilityDescription3_2Schools);
        spaceAbove3rdLvlLabelSchools.getLayoutParams().height = 0;
        lvl3AbilitiesSchools.setTextSize(0);
        spaceBelow3rdLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton3_1Schools.getLayoutParams().height = 0;
        abilityDescription3_1Schools.setTextSize(0);
        spaceBetweenLvl3ButtonSchools.getLayoutParams().height = 0;
        abilityButton3_2Schools.getLayoutParams().height = 0;
        abilityDescription3_2Schools.setTextSize(0);

        TextView abilityDescription6_1Schools = findViewById(R.id.abilityDescription6_1Schools);
        spaceAbove6thLvlLabelSchools.getLayoutParams().height = 0;
        lvl6AbilitiesSchools.setTextSize(0);
        spaceBelow6thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton6_1Schools.getLayoutParams().height = 0;
        abilityDescription6_1Schools.setTextSize(0);

        TextView abilityDescription7_1Schools = findViewById(R.id.abilityDescription7_1Schools);
        abilityDescription7_1Schools.setTextSize(0);

        TextView abilityDescription8_1Schools = findViewById(R.id.abilityDescription8_1Schools);
        spaceAbove8thLvlLabelSchools.getLayoutParams().height = 0;
        lvl8AbilitiesSchools.setTextSize(0);
        spaceBelow8thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton8_1Schools.getLayoutParams().height = 0;
        abilityDescription8_1Schools.setTextSize(0);

        Space spaceAbove9thLvlLabelSchools = findViewById(R.id.spaceAbove9thLvlLabelSchools);
        TextView lvl9AbilitiesSchools = findViewById(R.id.lvl9AbilitiesSchools);
        Space spaceBelow9thLvlLabelSchools = findViewById(R.id.spaceBelow9thLvlLabelSchools);
        Button abilityButton9_1Schools = findViewById(R.id.abilityButton9_1Schools);
        TextView abilityDescription9_1Schools = findViewById(R.id.abilityDescription9_1Schools);

        spaceAbove9thLvlLabelSchools.getLayoutParams().height = 0;
        lvl9AbilitiesSchools.setTextSize(0);
        spaceBelow9thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton9_1Schools.getLayoutParams().height = 0;
        abilityDescription9_1Schools.setTextSize(0);

        TextView abilityDescription10_1Schools = findViewById(R.id.abilityDescription10_1Schools);
        spaceAbove10thLvlLabelSchools.getLayoutParams().height = 0;
        lvl10AbilitiesSchools.setTextSize(0);
        spaceBelow10thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton10_1Schools.getLayoutParams().height = 0;
        abilityDescription10_1Schools.setTextSize(0);

        TextView abilityDescription11_1Schools = findViewById(R.id.abilityDescription11_1Schools);
        abilityDescription11_1Schools.setTextSize(0);

        Space spaceAbove13thLvlLabelSchools = findViewById(R.id.spaceAbove13thLvlLabelSchools);
        TextView lvl13AbilitiesSchools = findViewById(R.id.lvl13AbilitiesSchools);
        Space spaceBelow13thLvlLabelSchools = findViewById(R.id.spaceBelow13thLvlLabelSchools);
        Button abilityButton13_1Schools = findViewById(R.id.abilityButton13_1Schools);
        TextView abilityDescription13_1Schools = findViewById(R.id.abilityDescription13_1Schools);

        spaceAbove13thLvlLabelSchools.getLayoutParams().height = 0;
        lvl13AbilitiesSchools.setTextSize(0);
        spaceBelow13thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton13_1Schools.getLayoutParams().height = 0;
        abilityDescription13_1Schools.setTextSize(0);

        TextView abilityDescription14_1Schools = findViewById(R.id.abilityDescription14_1Schools);
        spaceAbove14thLvlLabelSchools.getLayoutParams().height = 0;
        lvl14AbilitiesSchools.setTextSize(0);
        spaceBelow14thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton14_1Schools.getLayoutParams().height = 0;
        abilityDescription14_1Schools.setTextSize(0);

        TextView abilityDescription15_1Schools = findViewById(R.id.abilityDescription15_1Schools);
        abilityDescription15_1Schools.setTextSize(0);

        TextView abilityDescription17_1Schools = findViewById(R.id.abilityDescription17_1Schools);
        spaceAbove17thLvlLabelSchools.getLayoutParams().height = 0;
        lvl17AbilitiesSchools.setTextSize(0);
        spaceBelow17thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton17_1Schools.getLayoutParams().height = 0;
        abilityDescription17_1Schools.setTextSize(0);

        TextView abilityDescription18_1Schools = findViewById(R.id.abilityDescription18_1Schools);
        abilityDescription18_1Schools.setTextSize(0);

        Space spaceAbove20thLvlLabelSchools = findViewById(R.id.spaceAbove20thLvlLabelSchools);
        TextView lvl20AbilitiesSchools = findViewById(R.id.lvl20AbilitiesSchools);
        Space spaceBelow20thLvlLabelSchools = findViewById(R.id.spaceBelow20thLvlLabelSchools);
        Button abilityButton20_1Schools = findViewById(R.id.abilityButton20_1Schools);
        TextView abilityDescription20_1Schools = findViewById(R.id.abilityDescription20_1Schools);

        spaceAbove20thLvlLabelSchools.getLayoutParams().height = 0;
        lvl20AbilitiesSchools.setTextSize(0);
        spaceBelow20thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton20_1Schools.getLayoutParams().height = 0;
        abilityDescription20_1Schools.setTextSize(0);

        switch (whichClass) {
            case ("cleric"):
                whichSchool = "NatureDomain";
                classSchoolTitle.setText(R.string.clericNatureDomainTitle);
                classSchoolTitle.setTextSize(30);
                classSchoolDescription.setText(R.string.clericNatureDomain);
                classSchoolDescription.setTextSize(20);

                spaceAbove1stLvlLabelSchools.getLayoutParams().height = 10;
                lvl1AbilitiesSchools.setTextSize(20);
                spaceBelow1stLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton1_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton1_1Schools.setText(R.string.clericNatureDomainAcolyteOfNatureTitle);

                spaceBetween1stLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton1_2Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton1_2Schools.setText(R.string.clericNatureDomainBonusProfitiencyTitle);

                spaceAbove2ndLvlLabelSchools.getLayoutParams().height = 10;
                lvl2AbilitiesSchools.setTextSize(20);
                spaceBelow2ndLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton2_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton2_1Schools.setText(R.string.clericNatureDomainChannelDivinityCharmAnimalsAndPlantsTitle);


                spaceAbove6thLvlLabelSchools.getLayoutParams().height = 10;
                lvl6AbilitiesSchools.setTextSize(20);
                spaceBelow6thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton6_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton6_1Schools.setText(R.string.clericNatureDomainDampenElementsTitle);

                spaceAbove8thLvlLabelSchools.getLayoutParams().height = 10;
                lvl8AbilitiesSchools.setTextSize(20);
                spaceBelow8thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton8_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton8_1Schools.setText(R.string.clericNatureDomainDivineStrikeTitle);

                spaceAbove17thLvlLabelSchools.getLayoutParams().height = 10;
                lvl17AbilitiesSchools.setTextSize(20);
                spaceBelow17thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton17_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton17_1Schools.setText(R.string.clericNatureDomainMasterOfNatureTitle);
                break;

            case ("wizard"):
                whichSchool = "SchoolOfEnchantment";
                classSchoolTitle.setText(R.string.wizardSchoolOfEnchantmentTitle);
                classSchoolTitle.setTextSize(30);
                classSchoolDescription.setText(R.string.wizardSchoolOfEnchantment);
                classSchoolDescription.setTextSize(20);


                spaceAbove2ndLvlLabelSchools.getLayoutParams().height = 10;
                lvl2AbilitiesSchools.setTextSize(20);
                spaceBelow2ndLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton2_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton2_1Schools.setText(R.string.wizardSchoolOfEnchantmentEnchantedSavantTitle);

                spaceBetween2ndLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton2_2Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton2_2Schools.setText(R.string.wizardSchoolOfEnchantmentHypnoticGazeTitle);


                spaceAbove6thLvlLabelSchools.getLayoutParams().height = 10;
                lvl6AbilitiesSchools.setTextSize(20);
                spaceBelow6thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton6_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton6_1Schools.setText(R.string.wizardSchoolOfEnchantmentInstinctiveCharmTitle);


                spaceAbove10thLvlLabelSchools.getLayoutParams().height = 10;
                lvl10AbilitiesSchools.setTextSize(20);
                spaceBelow10thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton10_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton10_1Schools.setText(R.string.wizardSchoolOfEnchantmentSplitEnchantmentTitle);


                spaceAbove14thLvlLabelSchools.getLayoutParams().height = 10;
                lvl14AbilitiesSchools.setTextSize(20);
                spaceBelow14thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton14_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton14_1Schools.setText(R.string.wizardSchoolOfEnchantmentAlterMemoriesTitle);

                break;
        }
    }

    public void onAbilityClassSchoolButton5(View view) {
        TextView classSchoolTitle = findViewById(R.id.chosenClassSchoolTitle);
        TextView classSchoolDescription = findViewById(R.id.chosenClassSchoolsDescription);
        Button classSchoolButton1 = findViewById(R.id.abilityCassSchoolButton1);
        Button classSchoolButton2 = findViewById(R.id.abilityCassSchoolButton2);
        Button classSchoolButton3 = findViewById(R.id.abilityCassSchoolButton3);
        Button classSchoolButton4 = findViewById(R.id.abilityCassSchoolButton4);
        Button classSchoolButton5 = findViewById(R.id.abilityCassSchoolButton5);
        Button classSchoolButton6 = findViewById(R.id.abilityCassSchoolButton6);
        Button classSchoolButton7 = findViewById(R.id.abilityCassSchoolButton7);
        Button classSchoolButton8 = findViewById(R.id.abilityCassSchoolButton8);


        Space spaceAbove1stLvlLabelSchools = findViewById(R.id.spaceAbove1stLvlLabelSchools);
        TextView lvl1AbilitiesSchools = findViewById(R.id.lvl1AbilitiesSchools);
        Space spaceBelow1stLvlLabelSchools = findViewById(R.id.spaceBelow1stLvlLabelSchools);
        Button abilityButton1_1Schools = findViewById(R.id.abilityButton1_1Schools);

        Space spaceBetween1stLvlLabelSchools = findViewById(R.id.spaceBetween1stLvlLabelSchools);
        Button abilityButton1_2Schools = findViewById(R.id.abilityButton1_2Schools);

        Space spaceAbove2ndLvlLabelSchools = findViewById(R.id.spaceAbove2ndLvlLabelSchools);
        TextView lvl2AbilitiesSchools = findViewById(R.id.lvl2AbilitiesSchools);
        Space spaceBelow2ndLvlLabelSchools = findViewById(R.id.spaceBelow2ndLvlLabelSchools);
        Button abilityButton2_1Schools = findViewById(R.id.abilityButton2_1Schools);
        Button abilityButton2_2Schools = findViewById(R.id.abilityButton2_2Schools);

        Space spaceAbove3rdLvlLabelSchools = findViewById(R.id.spaceAbove3rdLvlLabelSchools);
        TextView lvl3AbilitiesSchools = findViewById(R.id.lvl3AbilitiesSchools);
        Space spaceBelow3rdLvlLabelSchools = findViewById(R.id.spaceBelow3rdLvlLabelSchools);
        Button abilityButton3_1Schools = findViewById(R.id.abilityButton3_1Schools);
        Space spaceBetweenLvl3ButtonSchools = findViewById(R.id.spaceBetween3LvlButtonsSchools);
        Button abilityButton3_2Schools = findViewById(R.id.abilityButton3_2Schools);

        Space spaceAbove6thLvlLabelSchools = findViewById(R.id.spaceAbove6thLvlLabelSchools);
        TextView lvl6AbilitiesSchools = findViewById(R.id.lvl6AbilitiesSchools);
        Space spaceBelow6thLvlLabelSchools = findViewById(R.id.spaceBelow6thLvlLabelSchools);
        Button abilityButton6_1Schools = findViewById(R.id.abilityButton6_1Schools);



        Space spaceAbove8thLvlLabelSchools = findViewById(R.id.spaceAbove8thLvlLabelSchools);
        TextView lvl8AbilitiesSchools = findViewById(R.id.lvl8AbilitiesSchools);
        Space spaceBelow8thLvlLabelSchools = findViewById(R.id.spaceBelow8thLvlLabelSchools);
        Button abilityButton8_1Schools = findViewById(R.id.abilityButton8_1Schools);


        Space spaceAbove10thLvlLabelSchools = findViewById(R.id.spaceAbove10thLvlLabelSchools);
        TextView lvl10AbilitiesSchools = findViewById(R.id.lvl10AbilitiesSchools);
        Space spaceBelow10thLvlLabelSchools = findViewById(R.id.spaceBelow10thLvlLabelSchools);
        Button abilityButton10_1Schools = findViewById(R.id.abilityButton10_1Schools);



        Space spaceAbove14thLvlLabelSchools = findViewById(R.id.spaceAbove14thLvlLabelSchools);
        TextView lvl14AbilitiesSchools = findViewById(R.id.lvl14AbilitiesSchools);
        Space spaceBelow14thLvlLabelSchools = findViewById(R.id.spaceBelow14thLvlLabelSchools);
        Button abilityButton14_1Schools = findViewById(R.id.abilityButton14_1Schools);



        Space spaceAbove17thLvlLabelSchools = findViewById(R.id.spaceAbove17thLvlLabelSchools);
        TextView lvl17AbilitiesSchools = findViewById(R.id.lvl17AbilitiesSchools);
        Space spaceBelow17thLvlLabelSchools = findViewById(R.id.spaceBelow17thLvlLabelSchools);
        Button abilityButton17_1Schools = findViewById(R.id.abilityButton17_1Schools);



        classSchoolButton1.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton2.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton3.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton4.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton6.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton7.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton8.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton5.setBackgroundColor(Color.parseColor("#63a6f2"));

        TextView abilityDescription1_1Schools = findViewById(R.id.abilityDescription1_1Schools);
        spaceAbove1stLvlLabelSchools.getLayoutParams().height = 0;
        lvl1AbilitiesSchools.setTextSize(0);
        spaceBelow1stLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton1_1Schools.getLayoutParams().height = 0;
        abilityDescription1_1Schools.setTextSize(0);

        TextView abilityDescription1_2Schools = findViewById(R.id.abilityDescription1_2Schools);
        spaceBetween1stLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton1_2Schools.getLayoutParams().height = 0;
        abilityDescription1_2Schools.setTextSize(0);

        TextView abilityDescription2_1Schools = findViewById(R.id.abilityDescription2_1Schools);
        spaceAbove2ndLvlLabelSchools.getLayoutParams().height = 0;
        lvl2AbilitiesSchools.setTextSize(0);
        spaceBelow2ndLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton2_1Schools.getLayoutParams().height = 0;
        abilityDescription2_1Schools.setTextSize(0);

        Space spaceBetween2ndLvlLabelSchools = findViewById(R.id.spaceBetween2ndLvlLabelSchools);
        TextView abilityDescription2_2Schools = findViewById(R.id.abilityDescription2_2Schools);
        spaceBetween2ndLvlLabelSchools.getLayoutParams().height = 0;
        abilityDescription2_2Schools.setTextSize(0);

        TextView abilityDescription3_1Schools = findViewById(R.id.abilityDescription3_1Schools);
        TextView abilityDescription3_2Schools = findViewById(R.id.abilityDescription3_2Schools);
        spaceAbove3rdLvlLabelSchools.getLayoutParams().height = 0;
        lvl3AbilitiesSchools.setTextSize(0);
        spaceBelow3rdLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton3_1Schools.getLayoutParams().height = 0;
        abilityDescription3_1Schools.setTextSize(0);
        spaceBetweenLvl3ButtonSchools.getLayoutParams().height = 0;
        abilityButton3_2Schools.getLayoutParams().height = 0;
        abilityDescription3_2Schools.setTextSize(0);

        TextView abilityDescription6_1Schools = findViewById(R.id.abilityDescription6_1Schools);
        spaceAbove6thLvlLabelSchools.getLayoutParams().height = 0;
        lvl6AbilitiesSchools.setTextSize(0);
        spaceBelow6thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton6_1Schools.getLayoutParams().height = 0;
        abilityDescription6_1Schools.setTextSize(0);

        TextView abilityDescription7_1Schools = findViewById(R.id.abilityDescription7_1Schools);
        abilityDescription7_1Schools.setTextSize(0);

        TextView abilityDescription8_1Schools = findViewById(R.id.abilityDescription8_1Schools);
        spaceAbove8thLvlLabelSchools.getLayoutParams().height = 0;
        lvl8AbilitiesSchools.setTextSize(0);
        spaceBelow8thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton8_1Schools.getLayoutParams().height = 0;
        abilityDescription8_1Schools.setTextSize(0);

        Space spaceAbove9thLvlLabelSchools = findViewById(R.id.spaceAbove9thLvlLabelSchools);
        TextView lvl9AbilitiesSchools = findViewById(R.id.lvl9AbilitiesSchools);
        Space spaceBelow9thLvlLabelSchools = findViewById(R.id.spaceBelow9thLvlLabelSchools);
        Button abilityButton9_1Schools = findViewById(R.id.abilityButton9_1Schools);
        TextView abilityDescription9_1Schools = findViewById(R.id.abilityDescription9_1Schools);

        spaceAbove9thLvlLabelSchools.getLayoutParams().height = 0;
        lvl9AbilitiesSchools.setTextSize(0);
        spaceBelow9thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton9_1Schools.getLayoutParams().height = 0;
        abilityDescription9_1Schools.setTextSize(0);

        TextView abilityDescription10_1Schools = findViewById(R.id.abilityDescription10_1Schools);
        spaceAbove10thLvlLabelSchools.getLayoutParams().height = 0;
        lvl10AbilitiesSchools.setTextSize(0);
        spaceBelow10thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton10_1Schools.getLayoutParams().height = 0;
        abilityDescription10_1Schools.setTextSize(0);

        TextView abilityDescription11_1Schools = findViewById(R.id.abilityDescription11_1Schools);
        abilityDescription11_1Schools.setTextSize(0);

        Space spaceAbove13thLvlLabelSchools = findViewById(R.id.spaceAbove13thLvlLabelSchools);
        TextView lvl13AbilitiesSchools = findViewById(R.id.lvl13AbilitiesSchools);
        Space spaceBelow13thLvlLabelSchools = findViewById(R.id.spaceBelow13thLvlLabelSchools);
        Button abilityButton13_1Schools = findViewById(R.id.abilityButton13_1Schools);
        TextView abilityDescription13_1Schools = findViewById(R.id.abilityDescription13_1Schools);

        spaceAbove13thLvlLabelSchools.getLayoutParams().height = 0;
        lvl13AbilitiesSchools.setTextSize(0);
        spaceBelow13thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton13_1Schools.getLayoutParams().height = 0;
        abilityDescription13_1Schools.setTextSize(0);

        TextView abilityDescription14_1Schools = findViewById(R.id.abilityDescription14_1Schools);
        spaceAbove14thLvlLabelSchools.getLayoutParams().height = 0;
        lvl14AbilitiesSchools.setTextSize(0);
        spaceBelow14thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton14_1Schools.getLayoutParams().height = 0;
        abilityDescription14_1Schools.setTextSize(0);

        TextView abilityDescription15_1Schools = findViewById(R.id.abilityDescription15_1Schools);
        abilityDescription15_1Schools.setTextSize(0);

        TextView abilityDescription17_1Schools = findViewById(R.id.abilityDescription17_1Schools);
        spaceAbove17thLvlLabelSchools.getLayoutParams().height = 0;
        lvl17AbilitiesSchools.setTextSize(0);
        spaceBelow17thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton17_1Schools.getLayoutParams().height = 0;
        abilityDescription17_1Schools.setTextSize(0);

        TextView abilityDescription18_1Schools = findViewById(R.id.abilityDescription18_1Schools);
        abilityDescription18_1Schools.setTextSize(0);

        Space spaceAbove20thLvlLabelSchools = findViewById(R.id.spaceAbove20thLvlLabelSchools);
        TextView lvl20AbilitiesSchools = findViewById(R.id.lvl20AbilitiesSchools);
        Space spaceBelow20thLvlLabelSchools = findViewById(R.id.spaceBelow20thLvlLabelSchools);
        Button abilityButton20_1Schools = findViewById(R.id.abilityButton20_1Schools);
        TextView abilityDescription20_1Schools = findViewById(R.id.abilityDescription20_1Schools);

        spaceAbove20thLvlLabelSchools.getLayoutParams().height = 0;
        lvl20AbilitiesSchools.setTextSize(0);
        spaceBelow20thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton20_1Schools.getLayoutParams().height = 0;
        abilityDescription20_1Schools.setTextSize(0);

        switch (whichClass) {
            case ("cleric"):
                whichSchool = "TempestDomain";
                classSchoolTitle.setText(R.string.clericTempestDomainTitle);
                classSchoolTitle.setTextSize(30);
                classSchoolDescription.setText(R.string.clericTempestDomain);
                classSchoolDescription.setTextSize(20);

                spaceAbove1stLvlLabelSchools.getLayoutParams().height = 10;
                lvl1AbilitiesSchools.setTextSize(20);
                spaceBelow1stLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton1_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton1_1Schools.setText(R.string.clericTempestDomainBonusProfitiencyTitle);

                spaceBetween1stLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton1_2Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton1_2Schools.setText(R.string.clericTempestDomainWrathOfTheStormTitle);

                spaceAbove2ndLvlLabelSchools.getLayoutParams().height = 10;
                lvl2AbilitiesSchools.setTextSize(20);
                spaceBelow2ndLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton2_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton2_1Schools.setText(R.string.clericTempestDomainChannelDivinityDestructiveWrathTitle);


                spaceAbove6thLvlLabelSchools.getLayoutParams().height = 10;
                lvl6AbilitiesSchools.setTextSize(20);
                spaceBelow6thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton6_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton6_1Schools.setText(R.string.clericTempestDomainThunderboltStrikeTitle);

                spaceAbove8thLvlLabelSchools.getLayoutParams().height = 10;
                lvl8AbilitiesSchools.setTextSize(20);
                spaceBelow8thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton8_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton8_1Schools.setText(R.string.clericTempestDomainDivineStrikeTitle);

                spaceAbove17thLvlLabelSchools.getLayoutParams().height = 10;
                lvl17AbilitiesSchools.setTextSize(20);
                spaceBelow17thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton17_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton17_1Schools.setText(R.string.clericTempestDomainStormbornTitle);
                break;

            case ("wizard"):
                whichSchool = "SchoolOfEvocation";
                classSchoolTitle.setText(R.string.wizardSchoolOfEvocationTitle);
                classSchoolTitle.setTextSize(30);
                classSchoolDescription.setText(R.string.wizardSchoolOfEvocation);
                classSchoolDescription.setTextSize(20);


                spaceAbove2ndLvlLabelSchools.getLayoutParams().height = 10;
                lvl2AbilitiesSchools.setTextSize(20);
                spaceBelow2ndLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton2_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton2_1Schools.setText(R.string.wizardSchoolOfEvocationEvocationSavantTitle);

                spaceBetween2ndLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton2_2Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton2_2Schools.setText(R.string.wizardSchoolOfEvocationSculptSpellsTitle);


                spaceAbove6thLvlLabelSchools.getLayoutParams().height = 10;
                lvl6AbilitiesSchools.setTextSize(20);
                spaceBelow6thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton6_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton6_1Schools.setText(R.string.wizardSchoolOfEvocationPotentCantripTitle);


                spaceAbove10thLvlLabelSchools.getLayoutParams().height = 10;
                lvl10AbilitiesSchools.setTextSize(20);
                spaceBelow10thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton10_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton10_1Schools.setText(R.string.wizardSchoolOfEvocationEmpoweredEvocationTitle);


                spaceAbove14thLvlLabelSchools.getLayoutParams().height = 10;
                lvl14AbilitiesSchools.setTextSize(20);
                spaceBelow14thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton14_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton14_1Schools.setText(R.string.wizardSchoolOfEvocationOverchannelTitle);

                break;
        }
    }

    public void onAbilityClassSchoolButton6(View view) {
        TextView classSchoolTitle = findViewById(R.id.chosenClassSchoolTitle);
        TextView classSchoolDescription = findViewById(R.id.chosenClassSchoolsDescription);
        Button classSchoolButton1 = findViewById(R.id.abilityCassSchoolButton1);
        Button classSchoolButton2 = findViewById(R.id.abilityCassSchoolButton2);
        Button classSchoolButton3 = findViewById(R.id.abilityCassSchoolButton3);
        Button classSchoolButton4 = findViewById(R.id.abilityCassSchoolButton4);
        Button classSchoolButton5 = findViewById(R.id.abilityCassSchoolButton5);
        Button classSchoolButton6 = findViewById(R.id.abilityCassSchoolButton6);
        Button classSchoolButton7 = findViewById(R.id.abilityCassSchoolButton7);
        Button classSchoolButton8 = findViewById(R.id.abilityCassSchoolButton8);


        Space spaceAbove1stLvlLabelSchools = findViewById(R.id.spaceAbove1stLvlLabelSchools);
        TextView lvl1AbilitiesSchools = findViewById(R.id.lvl1AbilitiesSchools);
        Space spaceBelow1stLvlLabelSchools = findViewById(R.id.spaceBelow1stLvlLabelSchools);
        Button abilityButton1_1Schools = findViewById(R.id.abilityButton1_1Schools);

        Space spaceBetween1stLvlLabelSchools = findViewById(R.id.spaceBetween1stLvlLabelSchools);
        Button abilityButton1_2Schools = findViewById(R.id.abilityButton1_2Schools);

        Space spaceAbove2ndLvlLabelSchools = findViewById(R.id.spaceAbove2ndLvlLabelSchools);
        TextView lvl2AbilitiesSchools = findViewById(R.id.lvl2AbilitiesSchools);
        Space spaceBelow2ndLvlLabelSchools = findViewById(R.id.spaceBelow2ndLvlLabelSchools);
        Button abilityButton2_1Schools = findViewById(R.id.abilityButton2_1Schools);
        Button abilityButton2_2Schools = findViewById(R.id.abilityButton2_2Schools);


        Space spaceAbove3rdLvlLabelSchools = findViewById(R.id.spaceAbove3rdLvlLabelSchools);
        TextView lvl3AbilitiesSchools = findViewById(R.id.lvl3AbilitiesSchools);
        Space spaceBelow3rdLvlLabelSchools = findViewById(R.id.spaceBelow3rdLvlLabelSchools);
        Button abilityButton3_1Schools = findViewById(R.id.abilityButton3_1Schools);
        Space spaceBetweenLvl3ButtonSchools = findViewById(R.id.spaceBetween3LvlButtonsSchools);
        Button abilityButton3_2Schools = findViewById(R.id.abilityButton3_2Schools);

        Space spaceAbove6thLvlLabelSchools = findViewById(R.id.spaceAbove6thLvlLabelSchools);
        TextView lvl6AbilitiesSchools = findViewById(R.id.lvl6AbilitiesSchools);
        Space spaceBelow6thLvlLabelSchools = findViewById(R.id.spaceBelow6thLvlLabelSchools);
        Button abilityButton6_1Schools = findViewById(R.id.abilityButton6_1Schools);



        Space spaceAbove8thLvlLabelSchools = findViewById(R.id.spaceAbove8thLvlLabelSchools);
        TextView lvl8AbilitiesSchools = findViewById(R.id.lvl8AbilitiesSchools);
        Space spaceBelow8thLvlLabelSchools = findViewById(R.id.spaceBelow8thLvlLabelSchools);
        Button abilityButton8_1Schools = findViewById(R.id.abilityButton8_1Schools);


        Space spaceAbove10thLvlLabelSchools = findViewById(R.id.spaceAbove10thLvlLabelSchools);
        TextView lvl10AbilitiesSchools = findViewById(R.id.lvl10AbilitiesSchools);
        Space spaceBelow10thLvlLabelSchools = findViewById(R.id.spaceBelow10thLvlLabelSchools);
        Button abilityButton10_1Schools = findViewById(R.id.abilityButton10_1Schools);



        Space spaceAbove14thLvlLabelSchools = findViewById(R.id.spaceAbove14thLvlLabelSchools);
        TextView lvl14AbilitiesSchools = findViewById(R.id.lvl14AbilitiesSchools);
        Space spaceBelow14thLvlLabelSchools = findViewById(R.id.spaceBelow14thLvlLabelSchools);
        Button abilityButton14_1Schools = findViewById(R.id.abilityButton14_1Schools);


        Space spaceAbove17thLvlLabelSchools = findViewById(R.id.spaceAbove17thLvlLabelSchools);
        TextView lvl17AbilitiesSchools = findViewById(R.id.lvl17AbilitiesSchools);
        Space spaceBelow17thLvlLabelSchools = findViewById(R.id.spaceBelow17thLvlLabelSchools);
        Button abilityButton17_1Schools = findViewById(R.id.abilityButton17_1Schools);

        classSchoolButton1.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton2.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton3.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton4.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton5.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton7.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton8.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton6.setBackgroundColor(Color.parseColor("#63a6f2"));

        TextView abilityDescription1_1Schools = findViewById(R.id.abilityDescription1_1Schools);
        spaceAbove1stLvlLabelSchools.getLayoutParams().height = 0;
        lvl1AbilitiesSchools.setTextSize(0);
        spaceBelow1stLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton1_1Schools.getLayoutParams().height = 0;
        abilityDescription1_1Schools.setTextSize(0);

        TextView abilityDescription1_2Schools = findViewById(R.id.abilityDescription1_2Schools);
        spaceBetween1stLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton1_2Schools.getLayoutParams().height = 0;
        abilityDescription1_2Schools.setTextSize(0);

        TextView abilityDescription2_1Schools = findViewById(R.id.abilityDescription2_1Schools);
        spaceAbove2ndLvlLabelSchools.getLayoutParams().height = 0;
        lvl2AbilitiesSchools.setTextSize(0);
        spaceBelow2ndLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton2_1Schools.getLayoutParams().height = 0;
        abilityDescription2_1Schools.setTextSize(0);

        Space spaceBetween2ndLvlLabelSchools = findViewById(R.id.spaceBetween2ndLvlLabelSchools);
        TextView abilityDescription2_2Schools = findViewById(R.id.abilityDescription2_2Schools);
        spaceBetween2ndLvlLabelSchools.getLayoutParams().height = 0;
        abilityDescription2_2Schools.setTextSize(0);

        TextView abilityDescription3_1Schools = findViewById(R.id.abilityDescription3_1Schools);
        TextView abilityDescription3_2Schools = findViewById(R.id.abilityDescription3_2Schools);
        spaceAbove3rdLvlLabelSchools.getLayoutParams().height = 0;
        lvl3AbilitiesSchools.setTextSize(0);
        spaceBelow3rdLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton3_1Schools.getLayoutParams().height = 0;
        abilityDescription3_1Schools.setTextSize(0);
        spaceBetweenLvl3ButtonSchools.getLayoutParams().height = 0;
        abilityButton3_2Schools.getLayoutParams().height = 0;
        abilityDescription3_2Schools.setTextSize(0);

        TextView abilityDescription6_1Schools = findViewById(R.id.abilityDescription6_1Schools);
        spaceAbove6thLvlLabelSchools.getLayoutParams().height = 0;
        lvl6AbilitiesSchools.setTextSize(0);
        spaceBelow6thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton6_1Schools.getLayoutParams().height = 0;
        abilityDescription6_1Schools.setTextSize(0);

        TextView abilityDescription7_1Schools = findViewById(R.id.abilityDescription7_1Schools);
        abilityDescription7_1Schools.setTextSize(0);

        TextView abilityDescription8_1Schools = findViewById(R.id.abilityDescription8_1Schools);
        spaceAbove8thLvlLabelSchools.getLayoutParams().height = 0;
        lvl8AbilitiesSchools.setTextSize(0);
        spaceBelow8thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton8_1Schools.getLayoutParams().height = 0;
        abilityDescription8_1Schools.setTextSize(0);

        Space spaceAbove9thLvlLabelSchools = findViewById(R.id.spaceAbove9thLvlLabelSchools);
        TextView lvl9AbilitiesSchools = findViewById(R.id.lvl9AbilitiesSchools);
        Space spaceBelow9thLvlLabelSchools = findViewById(R.id.spaceBelow9thLvlLabelSchools);
        Button abilityButton9_1Schools = findViewById(R.id.abilityButton9_1Schools);
        TextView abilityDescription9_1Schools = findViewById(R.id.abilityDescription9_1Schools);

        spaceAbove9thLvlLabelSchools.getLayoutParams().height = 0;
        lvl9AbilitiesSchools.setTextSize(0);
        spaceBelow9thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton9_1Schools.getLayoutParams().height = 0;
        abilityDescription9_1Schools.setTextSize(0);

        TextView abilityDescription10_1Schools = findViewById(R.id.abilityDescription10_1Schools);
        spaceAbove10thLvlLabelSchools.getLayoutParams().height = 0;
        lvl10AbilitiesSchools.setTextSize(0);
        spaceBelow10thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton10_1Schools.getLayoutParams().height = 0;
        abilityDescription10_1Schools.setTextSize(0);

        TextView abilityDescription11_1Schools = findViewById(R.id.abilityDescription11_1Schools);
        abilityDescription11_1Schools.setTextSize(0);

        Space spaceAbove13thLvlLabelSchools = findViewById(R.id.spaceAbove13thLvlLabelSchools);
        TextView lvl13AbilitiesSchools = findViewById(R.id.lvl13AbilitiesSchools);
        Space spaceBelow13thLvlLabelSchools = findViewById(R.id.spaceBelow13thLvlLabelSchools);
        Button abilityButton13_1Schools = findViewById(R.id.abilityButton13_1Schools);
        TextView abilityDescription13_1Schools = findViewById(R.id.abilityDescription13_1Schools);

        spaceAbove13thLvlLabelSchools.getLayoutParams().height = 0;
        lvl13AbilitiesSchools.setTextSize(0);
        spaceBelow13thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton13_1Schools.getLayoutParams().height = 0;
        abilityDescription13_1Schools.setTextSize(0);

        TextView abilityDescription14_1Schools = findViewById(R.id.abilityDescription14_1Schools);
        spaceAbove14thLvlLabelSchools.getLayoutParams().height = 0;
        lvl14AbilitiesSchools.setTextSize(0);
        spaceBelow14thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton14_1Schools.getLayoutParams().height = 0;
        abilityDescription14_1Schools.setTextSize(0);

        TextView abilityDescription15_1Schools = findViewById(R.id.abilityDescription15_1Schools);
        abilityDescription15_1Schools.setTextSize(0);

        TextView abilityDescription17_1Schools = findViewById(R.id.abilityDescription17_1Schools);
        spaceAbove17thLvlLabelSchools.getLayoutParams().height = 0;
        lvl17AbilitiesSchools.setTextSize(0);
        spaceBelow17thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton17_1Schools.getLayoutParams().height = 0;
        abilityDescription17_1Schools.setTextSize(0);

        TextView abilityDescription18_1Schools = findViewById(R.id.abilityDescription18_1Schools);
        abilityDescription18_1Schools.setTextSize(0);

        Space spaceAbove20thLvlLabelSchools = findViewById(R.id.spaceAbove20thLvlLabelSchools);
        TextView lvl20AbilitiesSchools = findViewById(R.id.lvl20AbilitiesSchools);
        Space spaceBelow20thLvlLabelSchools = findViewById(R.id.spaceBelow20thLvlLabelSchools);
        Button abilityButton20_1Schools = findViewById(R.id.abilityButton20_1Schools);
        TextView abilityDescription20_1Schools = findViewById(R.id.abilityDescription20_1Schools);

        spaceAbove20thLvlLabelSchools.getLayoutParams().height = 0;
        lvl20AbilitiesSchools.setTextSize(0);
        spaceBelow20thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton20_1Schools.getLayoutParams().height = 0;
        abilityDescription20_1Schools.setTextSize(0);

        switch (whichClass) {
            case ("cleric"):
                whichSchool = "TrickeryDomain";
                classSchoolTitle.setText(R.string.clericTrickeryDomainTitle);
                classSchoolTitle.setTextSize(30);
                classSchoolDescription.setText(R.string.clericTrickeryDomain);
                classSchoolDescription.setTextSize(20);

                spaceAbove1stLvlLabelSchools.getLayoutParams().height = 10;
                lvl1AbilitiesSchools.setTextSize(20);
                spaceBelow1stLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton1_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton1_1Schools.setText(R.string.clericTrickeryDomainBlessingOfTheTricksterTitle);


                spaceAbove2ndLvlLabelSchools.getLayoutParams().height = 10;
                lvl2AbilitiesSchools.setTextSize(20);
                spaceBelow2ndLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton2_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton2_1Schools.setText(R.string.clericTrickeryDomainChannelDivinityInvokeDuplicityTitle);


                spaceAbove6thLvlLabelSchools.getLayoutParams().height = 10;
                lvl6AbilitiesSchools.setTextSize(20);
                spaceBelow6thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton6_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton6_1Schools.setText(R.string.clericTrickeryDomainChannelDivinityCloakOfShadowsTitle);

                spaceAbove8thLvlLabelSchools.getLayoutParams().height = 10;
                lvl8AbilitiesSchools.setTextSize(20);
                spaceBelow8thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton8_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton8_1Schools.setText(R.string.clericTrickeryDomainDivineStrikeTitle);

                spaceAbove17thLvlLabelSchools.getLayoutParams().height = 10;
                lvl17AbilitiesSchools.setTextSize(20);
                spaceBelow17thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton17_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton17_1Schools.setText(R.string.clericTrickeryDomainImprovedDuplicityTitle);
                break;

            case ("wizard"):
                whichSchool = "SchoolOfIllusion";
                classSchoolTitle.setText(R.string.wizardSchoolOfIllusionTitle);
                classSchoolTitle.setTextSize(30);
                classSchoolDescription.setText(R.string.wizardSchoolOfIllusion);
                classSchoolDescription.setTextSize(20);


                spaceAbove2ndLvlLabelSchools.getLayoutParams().height = 10;
                lvl2AbilitiesSchools.setTextSize(20);
                spaceBelow2ndLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton2_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton2_1Schools.setText(R.string.wizardSWchoolOfIllusionIllusionSavantTitle);

                spaceBetween2ndLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton2_2Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton2_2Schools.setText(R.string.wizardSchoolOfIllusionImprovedMinorIllusionTitle);


                spaceAbove6thLvlLabelSchools.getLayoutParams().height = 10;
                lvl6AbilitiesSchools.setTextSize(20);
                spaceBelow6thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton6_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton6_1Schools.setText(R.string.wizardSchoolOfIllusionMalleableIllusionTitle);


                spaceAbove10thLvlLabelSchools.getLayoutParams().height = 10;
                lvl10AbilitiesSchools.setTextSize(20);
                spaceBelow10thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton10_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton10_1Schools.setText(R.string.wizardChoolOfIllusionIllusorySelfTitle);


                spaceAbove14thLvlLabelSchools.getLayoutParams().height = 10;
                lvl14AbilitiesSchools.setTextSize(20);
                spaceBelow14thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton14_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton14_1Schools.setText(R.string.wizardSchoolOfIllusionIllusoryRealityTitle);

                break;

        }
    }

    public void onAbilityClassSchoolButton7(View view) {
        TextView classSchoolTitle = findViewById(R.id.chosenClassSchoolTitle);
        TextView classSchoolDescription = findViewById(R.id.chosenClassSchoolsDescription);
        Button classSchoolButton1 = findViewById(R.id.abilityCassSchoolButton1);
        Button classSchoolButton2 = findViewById(R.id.abilityCassSchoolButton2);
        Button classSchoolButton3 = findViewById(R.id.abilityCassSchoolButton3);
        Button classSchoolButton4 = findViewById(R.id.abilityCassSchoolButton4);
        Button classSchoolButton5 = findViewById(R.id.abilityCassSchoolButton5);
        Button classSchoolButton6 = findViewById(R.id.abilityCassSchoolButton6);
        Button classSchoolButton7 = findViewById(R.id.abilityCassSchoolButton7);
        Button classSchoolButton8 = findViewById(R.id.abilityCassSchoolButton8);


        Space spaceAbove1stLvlLabelSchools = findViewById(R.id.spaceAbove1stLvlLabelSchools);
        TextView lvl1AbilitiesSchools = findViewById(R.id.lvl1AbilitiesSchools);
        Space spaceBelow1stLvlLabelSchools = findViewById(R.id.spaceBelow1stLvlLabelSchools);
        Button abilityButton1_1Schools = findViewById(R.id.abilityButton1_1Schools);

        Space spaceBetween1stLvlLabelSchools = findViewById(R.id.spaceBetween1stLvlLabelSchools);
        Button abilityButton1_2Schools = findViewById(R.id.abilityButton1_2Schools);

        Space spaceAbove2ndLvlLabelSchools = findViewById(R.id.spaceAbove2ndLvlLabelSchools);
        TextView lvl2AbilitiesSchools = findViewById(R.id.lvl2AbilitiesSchools);
        Space spaceBelow2ndLvlLabelSchools = findViewById(R.id.spaceBelow2ndLvlLabelSchools);
        Button abilityButton2_1Schools = findViewById(R.id.abilityButton2_1Schools);
        Button abilityButton2_2Schools = findViewById(R.id.abilityButton2_2Schools);

        Space spaceAbove3rdLvlLabelSchools = findViewById(R.id.spaceAbove3rdLvlLabelSchools);
        TextView lvl3AbilitiesSchools = findViewById(R.id.lvl3AbilitiesSchools);
        Space spaceBelow3rdLvlLabelSchools = findViewById(R.id.spaceBelow3rdLvlLabelSchools);
        Button abilityButton3_1Schools = findViewById(R.id.abilityButton3_1Schools);
        Space spaceBetweenLvl3ButtonSchools = findViewById(R.id.spaceBetween3LvlButtonsSchools);
        Button abilityButton3_2Schools = findViewById(R.id.abilityButton3_2Schools);

        Space spaceAbove6thLvlLabelSchools = findViewById(R.id.spaceAbove6thLvlLabelSchools);
        TextView lvl6AbilitiesSchools = findViewById(R.id.lvl6AbilitiesSchools);
        Space spaceBelow6thLvlLabelSchools = findViewById(R.id.spaceBelow6thLvlLabelSchools);
        Button abilityButton6_1Schools = findViewById(R.id.abilityButton6_1Schools);

        Space spaceAbove7thLvlLabelSchools = findViewById(R.id.spaceAbove7thLvlLabelSchools);
        TextView lvl7AbilitiesSchools = findViewById(R.id.lvl7AbilitiesSchools);
        Space spaceBelow7thLvlLabelSchools = findViewById(R.id.spaceBelow7thLvlLabelSchools);
        Button abilityButton7_1Schools = findViewById(R.id.abilityButton7_1Schools);


        Space spaceAbove8thLvlLabelSchools = findViewById(R.id.spaceAbove8thLvlLabelSchools);
        TextView lvl8AbilitiesSchools = findViewById(R.id.lvl8AbilitiesSchools);
        Space spaceBelow8thLvlLabelSchools = findViewById(R.id.spaceBelow8thLvlLabelSchools);
        Button abilityButton8_1Schools = findViewById(R.id.abilityButton8_1Schools);


        Space spaceAbove10thLvlLabelSchools = findViewById(R.id.spaceAbove10thLvlLabelSchools);
        TextView lvl10AbilitiesSchools = findViewById(R.id.lvl10AbilitiesSchools);
        Space spaceBelow10thLvlLabelSchools = findViewById(R.id.spaceBelow10thLvlLabelSchools);
        Button abilityButton10_1Schools = findViewById(R.id.abilityButton10_1Schools);

        Space spaceAbove11thLvlLabelSchools = findViewById(R.id.spaceAbove11thLvlLabelSchools);
        TextView lvl11AbilitiesSchools = findViewById(R.id.lvl11AbilitiesSchools);
        Space spaceBelow11thLvlLabelSchools = findViewById(R.id.spaceBelow11thLvlLabelSchools);
        Button abilityButton11_1Schools = findViewById(R.id.abilityButton11_1Schools);

        Space spaceAbove14thLvlLabelSchools = findViewById(R.id.spaceAbove14thLvlLabelSchools);
        TextView lvl14AbilitiesSchools = findViewById(R.id.lvl14AbilitiesSchools);
        Space spaceBelow14thLvlLabelSchools = findViewById(R.id.spaceBelow14thLvlLabelSchools);
        Button abilityButton14_1Schools = findViewById(R.id.abilityButton14_1Schools);

        Space spaceAbove15thLvlLabelSchools = findViewById(R.id.spaceAbove15thLvlLabelSchools);
        TextView lvl15AbilitiesSchools = findViewById(R.id.lvl15AbilitiesSchools);
        Space spaceBelow15thLvlLabelSchools = findViewById(R.id.spaceBelow15thLvlLabelSchools);
        Button abilityButton15_1Schools = findViewById(R.id.abilityButton15_1Schools);

        Space spaceAbove17thLvlLabelSchools = findViewById(R.id.spaceAbove17thLvlLabelSchools);
        TextView lvl17AbilitiesSchools = findViewById(R.id.lvl17AbilitiesSchools);
        Space spaceBelow17thLvlLabelSchools = findViewById(R.id.spaceBelow17thLvlLabelSchools);
        Button abilityButton17_1Schools = findViewById(R.id.abilityButton17_1Schools);

        Space spaceAbove18thLvlLabelSchools = findViewById(R.id.spaceAbove18thLvlLabelSchools);
        TextView lvl18AbilitiesSchools = findViewById(R.id.lvl18AbilitiesSchools);
        Space spaceBelow18thLvlLabelSchools = findViewById(R.id.spaceBelow18thLvlLabelSchools);
        Button abilityButton18_1Schools = findViewById(R.id.abilityButton18_1Schools);

        classSchoolButton1.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton2.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton3.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton4.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton5.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton6.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton8.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton7.setBackgroundColor(Color.parseColor("#63a6f2"));

        TextView abilityDescription1_1Schools = findViewById(R.id.abilityDescription1_1Schools);
        spaceAbove1stLvlLabelSchools.getLayoutParams().height = 0;
        lvl1AbilitiesSchools.setTextSize(0);
        spaceBelow1stLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton1_1Schools.getLayoutParams().height = 0;
        abilityDescription1_1Schools.setTextSize(0);

        TextView abilityDescription1_2Schools = findViewById(R.id.abilityDescription1_2Schools);
        spaceBetween1stLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton1_2Schools.getLayoutParams().height = 0;
        abilityDescription1_2Schools.setTextSize(0);

        TextView abilityDescription2_1Schools = findViewById(R.id.abilityDescription2_1Schools);
        spaceAbove2ndLvlLabelSchools.getLayoutParams().height = 0;
        lvl2AbilitiesSchools.setTextSize(0);
        spaceBelow2ndLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton2_1Schools.getLayoutParams().height = 0;
        abilityDescription2_1Schools.setTextSize(0);

        Space spaceBetween2ndLvlLabelSchools = findViewById(R.id.spaceBetween2ndLvlLabelSchools);
        TextView abilityDescription2_2Schools = findViewById(R.id.abilityDescription2_2Schools);
        spaceBetween2ndLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton2_2Schools.getLayoutParams().height = 0;
        abilityDescription2_2Schools.setTextSize(0);

        TextView abilityDescription3_1Schools = findViewById(R.id.abilityDescription3_1Schools);
        TextView abilityDescription3_2Schools = findViewById(R.id.abilityDescription3_2Schools);
        spaceAbove3rdLvlLabelSchools.getLayoutParams().height = 0;
        lvl3AbilitiesSchools.setTextSize(0);
        spaceBelow3rdLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton3_1Schools.getLayoutParams().height = 0;
        abilityDescription3_1Schools.setTextSize(0);
        spaceBetweenLvl3ButtonSchools.getLayoutParams().height = 0;
        abilityButton3_2Schools.getLayoutParams().height = 0;
        abilityDescription3_2Schools.setTextSize(0);

        TextView abilityDescription6_1Schools = findViewById(R.id.abilityDescription6_1Schools);
        spaceAbove6thLvlLabelSchools.getLayoutParams().height = 0;
        lvl6AbilitiesSchools.setTextSize(0);
        spaceBelow6thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton6_1Schools.getLayoutParams().height = 0;
        abilityDescription6_1Schools.setTextSize(0);

        TextView abilityDescription7_1Schools = findViewById(R.id.abilityDescription7_1Schools);
        spaceAbove7thLvlLabelSchools.getLayoutParams().height = 0;
        lvl7AbilitiesSchools.setTextSize(0);
        spaceBelow7thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton7_1Schools.getLayoutParams().height = 0;
        abilityDescription7_1Schools.setTextSize(0);

        TextView abilityDescription8_1Schools = findViewById(R.id.abilityDescription8_1Schools);
        spaceAbove8thLvlLabelSchools.getLayoutParams().height = 0;
        lvl8AbilitiesSchools.setTextSize(0);
        spaceBelow8thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton8_1Schools.getLayoutParams().height = 0;
        abilityDescription8_1Schools.setTextSize(0);

        Space spaceAbove9thLvlLabelSchools = findViewById(R.id.spaceAbove9thLvlLabelSchools);
        TextView lvl9AbilitiesSchools = findViewById(R.id.lvl9AbilitiesSchools);
        Space spaceBelow9thLvlLabelSchools = findViewById(R.id.spaceBelow9thLvlLabelSchools);
        Button abilityButton9_1Schools = findViewById(R.id.abilityButton9_1Schools);
        TextView abilityDescription9_1Schools = findViewById(R.id.abilityDescription9_1Schools);

        spaceAbove9thLvlLabelSchools.getLayoutParams().height = 0;
        lvl9AbilitiesSchools.setTextSize(0);
        spaceBelow9thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton9_1Schools.getLayoutParams().height = 0;
        abilityDescription9_1Schools.setTextSize(0);

        TextView abilityDescription10_1Schools = findViewById(R.id.abilityDescription10_1Schools);
        spaceAbove10thLvlLabelSchools.getLayoutParams().height = 0;
        lvl10AbilitiesSchools.setTextSize(0);
        spaceBelow10thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton10_1Schools.getLayoutParams().height = 0;
        abilityDescription10_1Schools.setTextSize(0);

        TextView abilityDescription11_1Schools = findViewById(R.id.abilityDescription11_1Schools);
        spaceAbove11thLvlLabelSchools.getLayoutParams().height = 0;
        lvl11AbilitiesSchools.setTextSize(0);
        spaceBelow11thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton11_1Schools.getLayoutParams().height = 0;
        abilityDescription11_1Schools.setTextSize(0);

        Space spaceAbove13thLvlLabelSchools = findViewById(R.id.spaceAbove13thLvlLabelSchools);
        TextView lvl13AbilitiesSchools = findViewById(R.id.lvl13AbilitiesSchools);
        Space spaceBelow13thLvlLabelSchools = findViewById(R.id.spaceBelow13thLvlLabelSchools);
        Button abilityButton13_1Schools = findViewById(R.id.abilityButton13_1Schools);
        TextView abilityDescription13_1Schools = findViewById(R.id.abilityDescription13_1Schools);

        spaceAbove13thLvlLabelSchools.getLayoutParams().height = 0;
        lvl13AbilitiesSchools.setTextSize(0);
        spaceBelow13thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton13_1Schools.getLayoutParams().height = 0;
        abilityDescription13_1Schools.setTextSize(0);

        TextView abilityDescription14_1Schools = findViewById(R.id.abilityDescription14_1Schools);
        spaceAbove14thLvlLabelSchools.getLayoutParams().height = 0;
        lvl14AbilitiesSchools.setTextSize(0);
        spaceBelow14thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton14_1Schools.getLayoutParams().height = 0;
        abilityDescription14_1Schools.setTextSize(0);

        TextView abilityDescription15_1Schools = findViewById(R.id.abilityDescription15_1Schools);
        spaceAbove15thLvlLabelSchools.getLayoutParams().height = 0;
        lvl15AbilitiesSchools.setTextSize(0);
        spaceBelow15thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton15_1Schools.getLayoutParams().height = 0;
        abilityDescription15_1Schools.setTextSize(0);

        TextView abilityDescription17_1Schools = findViewById(R.id.abilityDescription17_1Schools);
        spaceAbove17thLvlLabelSchools.getLayoutParams().height = 0;
        lvl17AbilitiesSchools.setTextSize(0);
        spaceBelow17thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton17_1Schools.getLayoutParams().height = 0;
        abilityDescription17_1Schools.setTextSize(0);

        TextView abilityDescription18_1Schools = findViewById(R.id.abilityDescription18_1Schools);
        spaceAbove18thLvlLabelSchools.getLayoutParams().height = 0;
        lvl18AbilitiesSchools.setTextSize(0);
        spaceBelow18thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton18_1Schools.getLayoutParams().height = 0;
        abilityDescription18_1Schools.setTextSize(0);

        Space spaceAbove20thLvlLabelSchools = findViewById(R.id.spaceAbove20thLvlLabelSchools);
        TextView lvl20AbilitiesSchools = findViewById(R.id.lvl20AbilitiesSchools);
        Space spaceBelow20thLvlLabelSchools = findViewById(R.id.spaceBelow20thLvlLabelSchools);
        Button abilityButton20_1Schools = findViewById(R.id.abilityButton20_1Schools);
        TextView abilityDescription20_1Schools = findViewById(R.id.abilityDescription20_1Schools);

        spaceAbove20thLvlLabelSchools.getLayoutParams().height = 0;
        lvl20AbilitiesSchools.setTextSize(0);
        spaceBelow20thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton20_1Schools.getLayoutParams().height = 0;
        abilityDescription20_1Schools.setTextSize(0);


        switch (whichClass) {
            case ("cleric"):
                whichSchool = "WarDomain";
                classSchoolTitle.setText(R.string.clericWarDomainTitle);
                classSchoolTitle.setTextSize(30);
                classSchoolDescription.setText(R.string.clericWarDomain);
                classSchoolDescription.setTextSize(20);

                spaceAbove1stLvlLabelSchools.getLayoutParams().height = 10;
                lvl1AbilitiesSchools.setTextSize(20);
                spaceBelow1stLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton1_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton1_1Schools.setText(R.string.clericWarDomainBonusProfitiencysTitle);

                spaceBetween1stLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton1_2Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton1_2Schools.setText(R.string.clericWarDomainWarPriestTitle);



                spaceAbove2ndLvlLabelSchools.getLayoutParams().height = 10;
                lvl2AbilitiesSchools.setTextSize(20);
                spaceBelow2ndLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton2_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton2_1Schools.setText(R.string.clericWarDomainChannelDivinityGuidedStrikeTitle);


                spaceAbove6thLvlLabelSchools.getLayoutParams().height = 10;
                lvl6AbilitiesSchools.setTextSize(20);
                spaceBelow6thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton6_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton6_1Schools.setText(R.string.clericWarDomainChannelDivinityWarGodsBlessingTitle);

                spaceAbove8thLvlLabelSchools.getLayoutParams().height = 10;
                lvl8AbilitiesSchools.setTextSize(20);
                spaceBelow8thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton8_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton8_1Schools.setText(R.string.clkericWarDomainDivineStrikeTitle);

                spaceAbove17thLvlLabelSchools.getLayoutParams().height = 10;
                lvl17AbilitiesSchools.setTextSize(20);
                spaceBelow17thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton17_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton17_1Schools.setText(R.string.clericWarDomainAvatarOfBattleTitle);
                break;

            case ("wizard"):
                whichSchool = "SchoolOfNecromancy";
                classSchoolTitle.setText(R.string.wizardSchoolOfNecromancyTitle);
                classSchoolTitle.setTextSize(30);
                classSchoolDescription.setText(R.string.wizardSchoolOfNecromancy);
                classSchoolDescription.setTextSize(20);


                spaceAbove2ndLvlLabelSchools.getLayoutParams().height = 10;
                lvl2AbilitiesSchools.setTextSize(20);
                spaceBelow2ndLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton2_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton2_1Schools.setText(R.string.wizardSchoolOfNecromancyNecromancySavantTitle);

                spaceBetween2ndLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton2_2Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton2_2Schools.setText(R.string.wizardSchoolOfNecromancyGrimHarvestTitle);


                spaceAbove6thLvlLabelSchools.getLayoutParams().height = 10;
                lvl6AbilitiesSchools.setTextSize(20);
                spaceBelow6thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton6_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton6_1Schools.setText(R.string.wizardSchoolOfNecromancyUndeadThrallsTitle);


                spaceAbove10thLvlLabelSchools.getLayoutParams().height = 10;
                lvl10AbilitiesSchools.setTextSize(20);
                spaceBelow10thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton10_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton10_1Schools.setText(R.string.wizardSchoolOfNecromancyInuredToUndeadTitle);


                spaceAbove14thLvlLabelSchools.getLayoutParams().height = 10;
                lvl14AbilitiesSchools.setTextSize(20);
                spaceBelow14thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton14_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton14_1Schools.setText(R.string.wizardSchoolOfNecromancyCommandUndeadTitle);

                break;
        }
    }

    public void onAbilityClassSchoolButton8(View view) {
        TextView classSchoolTitle = findViewById(R.id.chosenClassSchoolTitle);
        TextView classSchoolDescription = findViewById(R.id.chosenClassSchoolsDescription);
        Button classSchoolButton1 = findViewById(R.id.abilityCassSchoolButton1);
        Button classSchoolButton2 = findViewById(R.id.abilityCassSchoolButton2);
        Button classSchoolButton3 = findViewById(R.id.abilityCassSchoolButton3);
        Button classSchoolButton4 = findViewById(R.id.abilityCassSchoolButton4);
        Button classSchoolButton5 = findViewById(R.id.abilityCassSchoolButton5);
        Button classSchoolButton6 = findViewById(R.id.abilityCassSchoolButton6);
        Button classSchoolButton7 = findViewById(R.id.abilityCassSchoolButton7);
        Button classSchoolButton8 = findViewById(R.id.abilityCassSchoolButton8);


        Space spaceAbove1stLvlLabelSchools = findViewById(R.id.spaceAbove1stLvlLabelSchools);
        TextView lvl1AbilitiesSchools = findViewById(R.id.lvl1AbilitiesSchools);
        Space spaceBelow1stLvlLabelSchools = findViewById(R.id.spaceBelow1stLvlLabelSchools);
        Button abilityButton1_1Schools = findViewById(R.id.abilityButton1_1Schools);

        Space spaceBetween1stLvlLabelSchools = findViewById(R.id.spaceBetween1stLvlLabelSchools);
        Button abilityButton1_2Schools = findViewById(R.id.abilityButton1_2Schools);

        Space spaceAbove2ndLvlLabelSchools = findViewById(R.id.spaceAbove2ndLvlLabelSchools);
        TextView lvl2AbilitiesSchools = findViewById(R.id.lvl2AbilitiesSchools);
        Space spaceBelow2ndLvlLabelSchools = findViewById(R.id.spaceBelow2ndLvlLabelSchools);
        Button abilityButton2_1Schools = findViewById(R.id.abilityButton2_1Schools);
        Button abilityButton2_2Schools = findViewById(R.id.abilityButton2_2Schools);

        Space spaceAbove3rdLvlLabelSchools = findViewById(R.id.spaceAbove3rdLvlLabelSchools);
        TextView lvl3AbilitiesSchools = findViewById(R.id.lvl3AbilitiesSchools);
        Space spaceBelow3rdLvlLabelSchools = findViewById(R.id.spaceBelow3rdLvlLabelSchools);
        Button abilityButton3_1Schools = findViewById(R.id.abilityButton3_1Schools);
        Space spaceBetweenLvl3ButtonSchools = findViewById(R.id.spaceBetween3LvlButtonsSchools);
        Button abilityButton3_2Schools = findViewById(R.id.abilityButton3_2Schools);

        Space spaceAbove6thLvlLabelSchools = findViewById(R.id.spaceAbove6thLvlLabelSchools);
        TextView lvl6AbilitiesSchools = findViewById(R.id.lvl6AbilitiesSchools);
        Space spaceBelow6thLvlLabelSchools = findViewById(R.id.spaceBelow6thLvlLabelSchools);
        Button abilityButton6_1Schools = findViewById(R.id.abilityButton6_1Schools);

        Space spaceAbove7thLvlLabelSchools = findViewById(R.id.spaceAbove7thLvlLabelSchools);
        TextView lvl7AbilitiesSchools = findViewById(R.id.lvl7AbilitiesSchools);
        Space spaceBelow7thLvlLabelSchools = findViewById(R.id.spaceBelow7thLvlLabelSchools);
        Button abilityButton7_1Schools = findViewById(R.id.abilityButton7_1Schools);


        Space spaceAbove8thLvlLabelSchools = findViewById(R.id.spaceAbove8thLvlLabelSchools);
        TextView lvl8AbilitiesSchools = findViewById(R.id.lvl8AbilitiesSchools);
        Space spaceBelow8thLvlLabelSchools = findViewById(R.id.spaceBelow8thLvlLabelSchools);
        Button abilityButton8_1Schools = findViewById(R.id.abilityButton8_1Schools);


        Space spaceAbove10thLvlLabelSchools = findViewById(R.id.spaceAbove10thLvlLabelSchools);
        TextView lvl10AbilitiesSchools = findViewById(R.id.lvl10AbilitiesSchools);
        Space spaceBelow10thLvlLabelSchools = findViewById(R.id.spaceBelow10thLvlLabelSchools);
        Button abilityButton10_1Schools = findViewById(R.id.abilityButton10_1Schools);

        Space spaceAbove11thLvlLabelSchools = findViewById(R.id.spaceAbove11thLvlLabelSchools);
        TextView lvl11AbilitiesSchools = findViewById(R.id.lvl11AbilitiesSchools);
        Space spaceBelow11thLvlLabelSchools = findViewById(R.id.spaceBelow11thLvlLabelSchools);
        Button abilityButton11_1Schools = findViewById(R.id.abilityButton11_1Schools);

        Space spaceAbove14thLvlLabelSchools = findViewById(R.id.spaceAbove14thLvlLabelSchools);
        TextView lvl14AbilitiesSchools = findViewById(R.id.lvl14AbilitiesSchools);
        Space spaceBelow14thLvlLabelSchools = findViewById(R.id.spaceBelow14thLvlLabelSchools);
        Button abilityButton14_1Schools = findViewById(R.id.abilityButton14_1Schools);

        Space spaceAbove15thLvlLabelSchools = findViewById(R.id.spaceAbove15thLvlLabelSchools);
        TextView lvl15AbilitiesSchools = findViewById(R.id.lvl15AbilitiesSchools);
        Space spaceBelow15thLvlLabelSchools = findViewById(R.id.spaceBelow15thLvlLabelSchools);
        Button abilityButton15_1Schools = findViewById(R.id.abilityButton15_1Schools);

        Space spaceAbove17thLvlLabelSchools = findViewById(R.id.spaceAbove17thLvlLabelSchools);
        TextView lvl17AbilitiesSchools = findViewById(R.id.lvl17AbilitiesSchools);
        Space spaceBelow17thLvlLabelSchools = findViewById(R.id.spaceBelow17thLvlLabelSchools);
        Button abilityButton17_1Schools = findViewById(R.id.abilityButton17_1Schools);

        Space spaceAbove18thLvlLabelSchools = findViewById(R.id.spaceAbove18thLvlLabelSchools);
        TextView lvl18AbilitiesSchools = findViewById(R.id.lvl18AbilitiesSchools);
        Space spaceBelow18thLvlLabelSchools = findViewById(R.id.spaceBelow18thLvlLabelSchools);
        Button abilityButton18_1Schools = findViewById(R.id.abilityButton18_1Schools);

        classSchoolButton1.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton2.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton3.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton4.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton5.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton6.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton7.setBackgroundColor(getResources().getColor(android.R.color.holo_purple));
        classSchoolButton8.setBackgroundColor(Color.parseColor("#63a6f2"));

        TextView abilityDescription1_1Schools = findViewById(R.id.abilityDescription1_1Schools);
        spaceAbove1stLvlLabelSchools.getLayoutParams().height = 0;
        lvl1AbilitiesSchools.setTextSize(0);
        spaceBelow1stLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton1_1Schools.getLayoutParams().height = 0;
        abilityDescription1_1Schools.setTextSize(0);

        TextView abilityDescription1_2Schools = findViewById(R.id.abilityDescription1_2Schools);
        spaceBetween1stLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton1_2Schools.getLayoutParams().height = 0;
        abilityDescription1_2Schools.setTextSize(0);

        TextView abilityDescription2_1Schools = findViewById(R.id.abilityDescription2_1Schools);
        spaceAbove2ndLvlLabelSchools.getLayoutParams().height = 0;
        lvl2AbilitiesSchools.setTextSize(0);
        spaceBelow2ndLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton2_1Schools.getLayoutParams().height = 0;
        abilityDescription2_1Schools.setTextSize(0);

        Space spaceBetween2ndLvlLabelSchools = findViewById(R.id.spaceBetween2ndLvlLabelSchools);
        TextView abilityDescription2_2Schools = findViewById(R.id.abilityDescription2_2Schools);
        spaceBetween2ndLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton2_2Schools.getLayoutParams().height = 0;
        abilityDescription2_2Schools.setTextSize(0);

        TextView abilityDescription3_1Schools = findViewById(R.id.abilityDescription3_1Schools);
        TextView abilityDescription3_2Schools = findViewById(R.id.abilityDescription3_2Schools);
        spaceAbove3rdLvlLabelSchools.getLayoutParams().height = 0;
        lvl3AbilitiesSchools.setTextSize(0);
        spaceBelow3rdLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton3_1Schools.getLayoutParams().height = 0;
        abilityDescription3_1Schools.setTextSize(0);
        spaceBetweenLvl3ButtonSchools.getLayoutParams().height = 0;
        abilityButton3_2Schools.getLayoutParams().height = 0;
        abilityDescription3_2Schools.setTextSize(0);

        TextView abilityDescription6_1Schools = findViewById(R.id.abilityDescription6_1Schools);
        spaceAbove6thLvlLabelSchools.getLayoutParams().height = 0;
        lvl6AbilitiesSchools.setTextSize(0);
        spaceBelow6thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton6_1Schools.getLayoutParams().height = 0;
        abilityDescription6_1Schools.setTextSize(0);

        TextView abilityDescription7_1Schools = findViewById(R.id.abilityDescription7_1Schools);
        spaceAbove7thLvlLabelSchools.getLayoutParams().height = 0;
        lvl7AbilitiesSchools.setTextSize(0);
        spaceBelow7thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton7_1Schools.getLayoutParams().height = 0;
        abilityDescription7_1Schools.setTextSize(0);

        TextView abilityDescription8_1Schools = findViewById(R.id.abilityDescription8_1Schools);
        spaceAbove8thLvlLabelSchools.getLayoutParams().height = 0;
        lvl8AbilitiesSchools.setTextSize(0);
        spaceBelow8thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton8_1Schools.getLayoutParams().height = 0;
        abilityDescription8_1Schools.setTextSize(0);

        Space spaceAbove9thLvlLabelSchools = findViewById(R.id.spaceAbove9thLvlLabelSchools);
        TextView lvl9AbilitiesSchools = findViewById(R.id.lvl9AbilitiesSchools);
        Space spaceBelow9thLvlLabelSchools = findViewById(R.id.spaceBelow9thLvlLabelSchools);
        Button abilityButton9_1Schools = findViewById(R.id.abilityButton9_1Schools);
        TextView abilityDescription9_1Schools = findViewById(R.id.abilityDescription9_1Schools);

        spaceAbove9thLvlLabelSchools.getLayoutParams().height = 0;
        lvl9AbilitiesSchools.setTextSize(0);
        spaceBelow9thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton9_1Schools.getLayoutParams().height = 0;
        abilityDescription9_1Schools.setTextSize(0);

        TextView abilityDescription10_1Schools = findViewById(R.id.abilityDescription10_1Schools);
        spaceAbove10thLvlLabelSchools.getLayoutParams().height = 0;
        lvl10AbilitiesSchools.setTextSize(0);
        spaceBelow10thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton10_1Schools.getLayoutParams().height = 0;
        abilityDescription10_1Schools.setTextSize(0);

        TextView abilityDescription11_1Schools = findViewById(R.id.abilityDescription11_1Schools);
        spaceAbove11thLvlLabelSchools.getLayoutParams().height = 0;
        lvl11AbilitiesSchools.setTextSize(0);
        spaceBelow11thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton11_1Schools.getLayoutParams().height = 0;
        abilityDescription11_1Schools.setTextSize(0);

        Space spaceAbove13thLvlLabelSchools = findViewById(R.id.spaceAbove13thLvlLabelSchools);
        TextView lvl13AbilitiesSchools = findViewById(R.id.lvl13AbilitiesSchools);
        Space spaceBelow13thLvlLabelSchools = findViewById(R.id.spaceBelow13thLvlLabelSchools);
        Button abilityButton13_1Schools = findViewById(R.id.abilityButton13_1Schools);
        TextView abilityDescription13_1Schools = findViewById(R.id.abilityDescription13_1Schools);

        spaceAbove13thLvlLabelSchools.getLayoutParams().height = 0;
        lvl13AbilitiesSchools.setTextSize(0);
        spaceBelow13thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton13_1Schools.getLayoutParams().height = 0;
        abilityDescription13_1Schools.setTextSize(0);

        TextView abilityDescription14_1Schools = findViewById(R.id.abilityDescription14_1Schools);
        spaceAbove14thLvlLabelSchools.getLayoutParams().height = 0;
        lvl14AbilitiesSchools.setTextSize(0);
        spaceBelow14thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton14_1Schools.getLayoutParams().height = 0;
        abilityDescription14_1Schools.setTextSize(0);

        TextView abilityDescription15_1Schools = findViewById(R.id.abilityDescription15_1Schools);
        spaceAbove15thLvlLabelSchools.getLayoutParams().height = 0;
        lvl15AbilitiesSchools.setTextSize(0);
        spaceBelow15thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton15_1Schools.getLayoutParams().height = 0;
        abilityDescription15_1Schools.setTextSize(0);

        TextView abilityDescription17_1Schools = findViewById(R.id.abilityDescription17_1Schools);
        spaceAbove17thLvlLabelSchools.getLayoutParams().height = 0;
        lvl17AbilitiesSchools.setTextSize(0);
        spaceBelow17thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton17_1Schools.getLayoutParams().height = 0;
        abilityDescription17_1Schools.setTextSize(0);

        TextView abilityDescription18_1Schools = findViewById(R.id.abilityDescription18_1Schools);
        spaceAbove18thLvlLabelSchools.getLayoutParams().height = 0;
        lvl18AbilitiesSchools.setTextSize(0);
        spaceBelow18thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton18_1Schools.getLayoutParams().height = 0;
        abilityDescription18_1Schools.setTextSize(0);

        Space spaceAbove20thLvlLabelSchools = findViewById(R.id.spaceAbove20thLvlLabelSchools);
        TextView lvl20AbilitiesSchools = findViewById(R.id.lvl20AbilitiesSchools);
        Space spaceBelow20thLvlLabelSchools = findViewById(R.id.spaceBelow20thLvlLabelSchools);
        Button abilityButton20_1Schools = findViewById(R.id.abilityButton20_1Schools);
        TextView abilityDescription20_1Schools = findViewById(R.id.abilityDescription20_1Schools);

        spaceAbove20thLvlLabelSchools.getLayoutParams().height = 0;
        lvl20AbilitiesSchools.setTextSize(0);
        spaceBelow20thLvlLabelSchools.getLayoutParams().height = 0;
        abilityButton20_1Schools.getLayoutParams().height = 0;
        abilityDescription20_1Schools.setTextSize(0);

        switch (whichClass) {

            case ("wizard"):
                whichSchool = "SchoolOfTransmutation";
                classSchoolTitle.setText(R.string.wizardSchoolOfTransmutationTitle);
                classSchoolTitle.setTextSize(30);
                classSchoolDescription.setText(R.string.wizardSchoolOfTransmutation);
                classSchoolDescription.setTextSize(20);


                spaceAbove2ndLvlLabelSchools.getLayoutParams().height = 10;
                lvl2AbilitiesSchools.setTextSize(20);
                spaceBelow2ndLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton2_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton2_1Schools.setText(R.string.wizardSchoolOfTransmutaiotnTransmutationSavantTitle);

                spaceBetween2ndLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton2_2Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton2_2Schools.setText(R.string.wizardSchoolOfTransmutationMinorAlchemyTitle);


                spaceAbove6thLvlLabelSchools.getLayoutParams().height = 10;
                lvl6AbilitiesSchools.setTextSize(20);
                spaceBelow6thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton6_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton6_1Schools.setText(R.string.wizardSchoolOfTransmutationTransmutersStoneTitle);


                spaceAbove10thLvlLabelSchools.getLayoutParams().height = 10;
                lvl10AbilitiesSchools.setTextSize(20);
                spaceBelow10thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton10_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton10_1Schools.setText(R.string.wizardSchoolOfTransmutationShapeChangerTitle);


                spaceAbove14thLvlLabelSchools.getLayoutParams().height = 10;
                lvl14AbilitiesSchools.setTextSize(20);
                spaceBelow14thLvlLabelSchools.getLayoutParams().height = 10;
                abilityButton14_1Schools.getLayoutParams().height = LinearLayout.LayoutParams.WRAP_CONTENT;
                abilityButton14_1Schools.setText(R.string.wizardSchoolOfTransmutationMasterTransmuterTitle);

                break;
        }
    }


    public void onChooseButtonclick(View view) {
    }

    public void onNextButton(View view) {
        Intent newIntent = new Intent(getApplicationContext(), ClassAbilitiesListActivity.class);

        switch (whichClass) {
            case ("barbarian"):
                whichClass = "bard";
                newIntent.putExtra("whichClass", whichClass);
                break;

            case ("bard"):
                whichClass = "cleric";
                newIntent.putExtra("whichClass", whichClass);
                break;

            case ("cleric"):
                whichClass = "druid";
                newIntent.putExtra("whichClass", whichClass);
                break;

            case ("druid"):
                whichClass = "fighter";
                newIntent.putExtra("whichClass", whichClass);
                break;

            case ("fighter"):
                whichClass = "monk";
                newIntent.putExtra("whichClass", whichClass);
                break;

            case ("monk"):
                whichClass = "paladin";
                newIntent.putExtra("whichClass", whichClass);
                break;

            case ("paladin"):
                whichClass = "ranger";
                newIntent.putExtra("whichClass", whichClass);
                break;

            case ("ranger"):
                whichClass = "rogue";
                newIntent.putExtra("whichClass", whichClass);
                break;

            case ("rogue"):
                whichClass = "sorcerer";
                newIntent.putExtra("whichClass", whichClass);
                break;

            case ("sorcerer"):
                whichClass = "warlock";
                newIntent.putExtra("whichClass", whichClass);
                break;


            case ("warlock"):
                whichClass = "wizard";
                newIntent.putExtra("whichClass", whichClass);
                break;
        }
        startActivity(newIntent);
    }

    public void onPreviousButton(View view) {
        Intent newIntent = new Intent(getApplicationContext(), ClassAbilitiesListActivity.class);
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


    public void onAbilityButton1_1Schools(View view) {
        TextView abilityDescription1_1Schools = findViewById(R.id.abilityDescription1_1Schools);
        if (abilityDescription1_1Schools.getTextSize() == 0) {
            switch (whichSchool) {
                case ("KnowledgeDomain"):
                    abilityDescription1_1Schools.setTextSize(15);
                    abilityDescription1_1Schools.setText(R.string.clericKnowledgeDomainBlessingofKnowledge);
                    break;
                case ("LightDomain"):
                    abilityDescription1_1Schools.setTextSize(15);
                    abilityDescription1_1Schools.setText(R.string.clericLightDomainBonusCantrip);
                    break;
                case ("LifeDomain"):
                    abilityDescription1_1Schools.setTextSize(15);
                    abilityDescription1_1Schools.setText(R.string.clericLifeDomainBonusProfitiency);
                    break;
                case ("NatureDomain"):
                    abilityDescription1_1Schools.setTextSize(15);
                    abilityDescription1_1Schools.setText(R.string.clericNatureDomainAcolyteOfNature);
                    break;
                case ("TempestDomain"):
                    abilityDescription1_1Schools.setTextSize(15);
                    abilityDescription1_1Schools.setText(R.string.clericTempestDomainBonusProfitiency);
                    break;
                case ("TrickeryDomain"):
                    abilityDescription1_1Schools.setTextSize(15);
                    abilityDescription1_1Schools.setText(R.string.clericTrickeryDomainBlessingOfTheTrickster);
                    break;
                case ("WarDomain"):
                    abilityDescription1_1Schools.setTextSize(15);
                    abilityDescription1_1Schools.setText(R.string.clericWarDomainBonusProfitiency);
                    break;
                case ("DraconicBloodline"):
                    abilityDescription1_1Schools.setTextSize(15);
                    abilityDescription1_1Schools.setText(R.string.sorcererDraconicBloodlineDragonAncestor);
                    break;
                case ("WildMagic"):
                    abilityDescription1_1Schools.setTextSize(15);
                    abilityDescription1_1Schools.setText(R.string.sorcererWildMagicWildMagicSurge);
                    break;
                case ("TheArchfey"):
                    abilityDescription1_1Schools.setTextSize(15);
                    abilityDescription1_1Schools.setText(R.string.warlockArchfeyExpendedSpelllist);
                    break;
                case ("TheFiend"):
                    abilityDescription1_1Schools.setTextSize(15);
                    abilityDescription1_1Schools.setText(R.string.warlockFiendExpandedSpellList);
                    break;
                case ("TheGreatOldOne"):
                    abilityDescription1_1Schools.setTextSize(15);
                    abilityDescription1_1Schools.setText(R.string.warlockGreatOldOneExpendedSpellList);
                    break;
            }

        }
        else {
            abilityDescription1_1Schools.setTextSize(0);
        }
    }

    public void onAbilityButton1_2Schools(View view) {
        TextView abilityDescription1_2Schools = findViewById(R.id.abilityDescription1_2Schools);
        if (abilityDescription1_2Schools.getTextSize() == 0) {
            switch (whichSchool) {
                case ("LightDomain"):
                    abilityDescription1_2Schools.setTextSize(15);
                    abilityDescription1_2Schools.setText(R.string.clericLightDomainWardingFlare);
                    break;
                case ("LifeDomain"):
                    abilityDescription1_2Schools.setTextSize(15);
                    abilityDescription1_2Schools.setText(R.string.clericLifeDomainDiscipleOfLife);
                    break;
                case ("NatureDomain"):
                    abilityDescription1_2Schools.setTextSize(15);
                    abilityDescription1_2Schools.setText(R.string.clericNatureDomainBonusProfitiency);
                    break;
                case ("TempestDomain"):
                    abilityDescription1_2Schools.setTextSize(15);
                    abilityDescription1_2Schools.setText(R.string.clericTempestDomainWrathOfTheStorm);
                    break;
                case ("WarDomain"):
                    abilityDescription1_2Schools.setTextSize(15);
                    abilityDescription1_2Schools.setText(R.string.clericWarDomainWarPriest);
                    break;
                case ("DraconicBloodline"):
                    abilityDescription1_2Schools.setTextSize(15);
                    abilityDescription1_2Schools.setText(R.string.sorcererDraconicBloodlineDraconicResilence);
                    break;
                case ("WildMagic"):
                    abilityDescription1_2Schools.setTextSize(15);
                    abilityDescription1_2Schools.setText(R.string.sorcererWildMagicTidesOfChaos);
                    break;
                case ("TheArchfey"):
                    abilityDescription1_2Schools.setTextSize(15);
                    abilityDescription1_2Schools.setText(R.string.warlockArchfeyFeyPresence);
                    break;
                case ("TheFiend"):
                    abilityDescription1_2Schools.setTextSize(15);
                    abilityDescription1_2Schools.setText(R.string.warlockFiendDarkOnesBlessing);
                    break;
                case ("TheGreatOldOne"):
                    abilityDescription1_2Schools.setTextSize(15);
                    abilityDescription1_2Schools.setText(R.string.warlockGreatOldOneAwakenedMind);
                    break;

            }

        }
        else {
            abilityDescription1_2Schools.setTextSize(0);
        }
    }

    public void onAbilityButton2_1Schools(View view) {
        TextView abilityDescription2_1Schools = findViewById(R.id.abilityDescription2_1Schools);
        if (abilityDescription2_1Schools.getTextSize() == 0) {
            switch (whichSchool) {
                case ("KnowledgeDomain"):
                    abilityDescription2_1Schools.setTextSize(15);
                    abilityDescription2_1Schools.setText(R.string.clericKnowledgeDomainChannelDivinityKnowledgeOfTheAges);
                    break;
                case ("LightDomain"):
                    abilityDescription2_1Schools.setTextSize(15);
                    abilityDescription2_1Schools.setText(R.string.clericLightDomainChannelDivinityRadianceOfTheDawn);
                    break;
                case ("LifeDomain"):
                    abilityDescription2_1Schools.setTextSize(15);
                    abilityDescription2_1Schools.setText(R.string.clericLifeDomainPreserveLife);
                    break;
                case ("NatureDomain"):
                    abilityDescription2_1Schools.setTextSize(15);
                    abilityDescription2_1Schools.setText(R.string.clericNatureDomainChannelDivinityCharmAnimalsAndPlants);
                    break;
                case ("TempestDomain"):
                    abilityDescription2_1Schools.setTextSize(15);
                    abilityDescription2_1Schools.setText(R.string.clericTempestDomainChannelDivinityDestructiveWrath);
                    break;
                case ("TrickeryDomain"):
                    abilityDescription2_1Schools.setTextSize(15);
                    abilityDescription2_1Schools.setText(R.string.clericTrickeryDomainChannelDivinityInvokeDuplicity);
                    break;
                case ("WarDomain"):
                    abilityDescription2_1Schools.setTextSize(15);
                    abilityDescription2_1Schools.setText(R.string.clericWarDomainChannelDivinityGuidedStrike);
                    break;
                case ("CircleOfTheLand"):
                    abilityDescription2_1Schools.setTextSize(15);
                    abilityDescription2_1Schools.setText(R.string.druidCircleOfTheLandBonusCantrip);
                    break;
                case ("CircleOfTheMoon"):
                    abilityDescription2_1Schools.setTextSize(15);
                    abilityDescription2_1Schools.setText(R.string.druidCircleOfTheMoonCombatWildShape);
                    break;
                case ("SchoolOfAbjuration"):
                    abilityDescription2_1Schools.setTextSize(15);
                    abilityDescription2_1Schools.setText(R.string.wizardSchoolOfAbjurationAbjurantServant);
                    break;
                case ("SchoolOfConjuration"):
                    abilityDescription2_1Schools.setTextSize(15);
                    abilityDescription2_1Schools.setText(R.string.wizardSchoolOfConjurationConjurationServant);
                    break;
                case ("SchoolOfDivination"):
                    abilityDescription2_1Schools.setTextSize(15);
                    abilityDescription2_1Schools.setText(R.string.wizardSchoolOfDivinationDivinationSavant);
                    break;
                case ("SchoolOfEnchantment"):
                    abilityDescription2_1Schools.setTextSize(15);
                    abilityDescription2_1Schools.setText(R.string.wizardSchoolOfEnchantmentEnchantedSavant);
                    break;
                case ("SchoolOfEvocation"):
                    abilityDescription2_1Schools.setTextSize(15);
                    abilityDescription2_1Schools.setText(R.string.wizardSchoolOfEvocationEvocationSavant);
                    break;
                case ("SchoolOfIllusion"):
                    abilityDescription2_1Schools.setTextSize(15);
                    abilityDescription2_1Schools.setText(R.string.wizardSWchoolOfIllusionIllusionSavant);
                    break;
                case ("SchoolOfNecromancy"):
                    abilityDescription2_1Schools.setTextSize(15);
                    abilityDescription2_1Schools.setText(R.string.wizardSchoolOfNecromancyNecromancySavant);
                    break;
                case ("SchoolOfTransmutation"):
                    abilityDescription2_1Schools.setTextSize(15);
                    abilityDescription2_1Schools.setText(R.string.wizardSchoolOfTransmutaiotnTransmutationSavant);
                    break;

            }

        }
        else {
            abilityDescription2_1Schools.setTextSize(0);
        }
    }

    public void onAbilityButton2_2Schools(View view) {
        TextView abilityDescription2_2Schools = findViewById(R.id.abilityDescription2_2Schools);
        if (abilityDescription2_2Schools.getTextSize() == 0) {
            switch (whichSchool) {
                case ("CircleOfTheLand"):
                    abilityDescription2_2Schools.setTextSize(15);
                    abilityDescription2_2Schools.setText(R.string.druidCircleOfTheLandNaturalRecovery);
                    break;
                case ("CircleOfTheMoon"):
                    abilityDescription2_2Schools.setTextSize(15);
                    abilityDescription2_2Schools.setText(R.string.druidCircleOfTheMoonCircleForms);
                    break;
                case ("SchoolOfAbjuration"):
                    abilityDescription2_2Schools.setTextSize(15);
                    abilityDescription2_2Schools.setText(R.string.wizardSchoolOfAbjurationArcaneWard);
                    break;
                case ("SchoolOfConjuration"):
                    abilityDescription2_2Schools.setTextSize(15);
                    abilityDescription2_2Schools.setText(R.string.wizardSchooldOfConjurationMinorConjuration);
                    break;
                case ("SchoolOfDivination"):
                    abilityDescription2_2Schools.setTextSize(15);
                    abilityDescription2_2Schools.setText(R.string.wizardSchoolOfDivinationPortend);
                    break;
                case ("SchoolOfEnchantment"):
                    abilityDescription2_2Schools.setTextSize(15);
                    abilityDescription2_2Schools.setText(R.string.wizardSchoolOfEnchantmentHypnoticGaze);
                    break;
                case ("SchoolOfEvocation"):
                    abilityDescription2_2Schools.setTextSize(15);
                        abilityDescription2_2Schools.setText(R.string.wizardSchoolOfEvocationSculptSpells);
                    break;
                case ("SchoolOfIllusion"):
                    abilityDescription2_2Schools.setTextSize(15);
                    abilityDescription2_2Schools.setText(R.string.wizardSchoolOfIllusionImprovedMinorIllusion);
                    break;
                case ("SchoolOfNecromancy"):
                    abilityDescription2_2Schools.setTextSize(15);
                    abilityDescription2_2Schools.setText(R.string.wizardSchoolOfNecromancyGrimHarvest);
                    break;
                case ("SchoolOfTransmutation"):
                    abilityDescription2_2Schools.setTextSize(15);
                    abilityDescription2_2Schools.setText(R.string.wizardSchoolOfTransmutationMinorAlchemy);
                    break;
            }

        }
        else {
            abilityDescription2_2Schools.setTextSize(0);
        }
    }


    public void onAbilityButton3_1Schools(View view) {
        TextView abilityDescription3_1Schools = findViewById(R.id.abilityDescription3_1Schools);
        if (abilityDescription3_1Schools.getTextSize() == 0) {
            switch (whichSchool) {
                case ("PathOfBerserker"):
                    abilityDescription3_1Schools.setTextSize(15);
                    abilityDescription3_1Schools.setText(R.string.barbarianPathOfTheBerserkerFrenzy);
                    break;
                case ("PathOfTheTotemWarrior"):
                    abilityDescription3_1Schools.setTextSize(15);
                    abilityDescription3_1Schools.setText(R.string.barbarianSpiritSeeker);
                    break;
                case ("CollegeOfLore"):
                    abilityDescription3_1Schools.setTextSize(15);
                    abilityDescription3_1Schools.setText(R.string.bardCollegeOfLoreBonusProfitiences);
                    break;
                case ("CollegeOfValor"):
                    abilityDescription3_1Schools.setTextSize(15);
                    abilityDescription3_1Schools.setText(R.string.bardCollegeOfValorBonusBrofitiencies);
                    break;
                case ("CircleOfTheLand"):
                    abilityDescription3_1Schools.setTextSize(15);
                    abilityDescription3_1Schools.setText(R.string.druidCircleOfTheLandCircleSpells);
                    break;
                case ("Champion"):
                    abilityDescription3_1Schools.setTextSize(15);
                    abilityDescription3_1Schools.setText(R.string.fighterChampionImprovedCritical);
                    break;
                case ("BattleMaster"):
                    abilityDescription3_1Schools.setTextSize(15);
                    abilityDescription3_1Schools.setText(R.string.fighterBattleMasterCombatSuperiority);
                    break;
                case ("EldritchKnight"):
                    abilityDescription3_1Schools.setTextSize(15);
                    abilityDescription3_1Schools.setText(R.string.fighterEldritchKnightWeaponBound);
                    break;
                case ("WayOfTheOpenHand"):
                    abilityDescription3_1Schools.setTextSize(15);
                    abilityDescription3_1Schools.setText(R.string.monkWayOfTheOpenHandOpenHandTechnique);
                    break;
                case ("WayOfShadows"):
                    abilityDescription3_1Schools.setTextSize(15);
                    abilityDescription3_1Schools.setText(R.string.monkWayOfShadowShadowArts);
                    break;
                case ("WayOfFourElements"):
                    abilityDescription3_1Schools.setTextSize(15);
                    abilityDescription3_1Schools.setText(R.string.monkWayOfTheFourElementsDiscipleOfTheElement);
                    break;
                case ("OathOfDevotion"):
                    abilityDescription3_1Schools.setTextSize(15);
                    abilityDescription3_1Schools.setText(R.string.paladinOathOfDeviotionOathSpells);
                    break;
                case ("OathOfTheAncients"):
                    abilityDescription3_1Schools.setTextSize(15);
                    abilityDescription3_1Schools.setText(R.string.paladinOathOfTheAncientsSpells);
                    break;
                case ("OathOfVengeance"):
                    abilityDescription3_1Schools.setTextSize(15);
                    abilityDescription3_1Schools.setText(R.string.paladinOathOfVengenceSpells);
                    break;
                case ("Hunter"):
                    abilityDescription3_1Schools.setTextSize(15);
                    abilityDescription3_1Schools.setText(R.string.rangerHunterHuntersPrey);
                    break;
                case ("BeastMaster"):
                    abilityDescription3_1Schools.setTextSize(15);
                    abilityDescription3_1Schools.setText(R.string.rangerBeastMasterRangersCompanion);
                    break;
                case ("Thief"):
                    abilityDescription3_1Schools.setTextSize(15);
                    abilityDescription3_1Schools.setText(R.string.rogueThiefFastHands);
                    break;
                case ("Assassin"):
                    abilityDescription3_1Schools.setTextSize(15);
                    abilityDescription3_1Schools.setText(R.string.rogueAssassinBonusProficiency);
                    break;
                case ("ArcaneTrickster"):
                    abilityDescription3_1Schools.setTextSize(15);
                    abilityDescription3_1Schools.setText(R.string.rogueArcaneTricksterMageHandLegerdemain);
                    break;
            }

        }
        else {
            abilityDescription3_1Schools.setTextSize(0);
        }
    }

    public void onAbilityButton3_2Schools(View view) {
        TextView abilityDescription3_2Schools = findViewById(R.id.abilityDescription3_2Schools);
        if (abilityDescription3_2Schools.getTextSize() == 0) {
            switch (whichSchool) {
                case ("CollegeOfLore"):
                    abilityDescription3_2Schools.setTextSize(15);
                    abilityDescription3_2Schools.setText(R.string.bardCollegeOfLoreCuttingWords);
                    break;
                case ("PathOfTheTotemWarrior"):
                    abilityDescription3_2Schools.setTextSize(15);
                    abilityDescription3_2Schools.setText(R.string.barbarianPathOfTheTotemWarriorTotemSpirit);
                    break;
                case ("CollegeOfValor"):
                    abilityDescription3_2Schools.setTextSize(15);
                    abilityDescription3_2Schools.setText(R.string.bardCollegeOfValorCombatInspiration);
                    break;
                case ("BattleMaster"):
                    abilityDescription3_2Schools.setTextSize(15);
                    abilityDescription3_2Schools.setText(R.string.fighterBattleMasterStudentOfWar);
                    break;
                case ("WayOfFourElements"):
                    abilityDescription3_2Schools.setTextSize(15);
                    abilityDescription3_2Schools.setText(R.string.monkWayOfFourElementsElementalDisciplines);
                    break;
                case ("OathOfDevotion"):
                    abilityDescription3_2Schools.setTextSize(15);
                    abilityDescription3_2Schools.setText(R.string.paladinOathOfDeviotionChannelDivinity);
                    break;
                case ("OathOfTheAncients"):
                    abilityDescription3_2Schools.setTextSize(15);
                    abilityDescription3_2Schools.setText(R.string.paladinOathOfTheAncientsChannelDivinity);
                    break;
                case ("OathOfVengeance"):
                    abilityDescription3_2Schools.setTextSize(15);
                    abilityDescription3_2Schools.setText(R.string.paladinOathOfVengenceChannelDivinity);
                    break;
                case ("Thief"):
                    abilityDescription3_2Schools.setTextSize(15);
                    abilityDescription3_2Schools.setText(R.string.rogueThiefSecondStoryWork);
                    break;
                case ("Assassin"):
                    abilityDescription3_2Schools.setTextSize(15);
                    abilityDescription3_2Schools.setText(R.string.rogueAssassinAssassinate);
                    break;

            }

        }
        else {
            abilityDescription3_2Schools.setTextSize(0);
        }
    }

    public void onAbilityButton6_1Schools(View view) {
        TextView abilityDescription6_1Schools = findViewById(R.id.abilityDescription6_1Schools);
        if (abilityDescription6_1Schools.getTextSize() == 0) {
            switch (whichSchool) {
                case ("PathOfBerserker"):
                    abilityDescription6_1Schools.setTextSize(15);
                    abilityDescription6_1Schools.setText(R.string.barbarianPathOfTheBerserkerMindlessRage);
                    break;
                case ("CollegeOfLore"):
                    abilityDescription6_1Schools.setTextSize(15);
                    abilityDescription6_1Schools.setText(R.string.bardCollegeOfLoreAdditionalMagicalSecrets);
                    break;
                case ("PathOfTheTotemWarrior"):
                    abilityDescription6_1Schools.setTextSize(15);
                    abilityDescription6_1Schools.setText(R.string.barbarianAspectOfTheBeast);
                    break;
                case ("CollegeOfValor"):
                    abilityDescription6_1Schools.setTextSize(15);
                    abilityDescription6_1Schools.setText(R.string.bardCollegeOfValorExtraAttack);
                    break;
                case ("KnowledgeDomain"):
                    abilityDescription6_1Schools.setTextSize(15);
                    abilityDescription6_1Schools.setText(R.string.clericKnowledgeDomainChannelDivinityReadThoughs);
                    break;
                case ("LightDomain"):
                    abilityDescription6_1Schools.setTextSize(15);
                    abilityDescription6_1Schools.setText(R.string.clericImprovedFlare);
                    break;
                case ("LifeDomain"):
                    abilityDescription6_1Schools.setTextSize(15);
                    abilityDescription6_1Schools.setText(R.string.clericLifeDomainBlessedHealer);
                    break;
                case ("NatureDomain"):
                    abilityDescription6_1Schools.setTextSize(15);
                    abilityDescription6_1Schools.setText(R.string.clericDampenElements);
                    break;
                case ("TempestDomain"):
                    abilityDescription6_1Schools.setTextSize(15);
                    abilityDescription6_1Schools.setText(R.string.clericTempestDomainThunderboltStrike);
                    break;
                case ("TrickeryDomain"):
                    abilityDescription6_1Schools.setTextSize(15);
                    abilityDescription6_1Schools.setText(R.string.clericTrickeryDomainChannelDivinityCloakOfShadow);
                    break;
                case ("WarDomain"):
                    abilityDescription6_1Schools.setTextSize(15);
                    abilityDescription6_1Schools.setText(R.string.clericWarDomainChannelDivinityWarGodsBlessing);
                    break;
                case ("CircleOfTheLand"):
                    abilityDescription6_1Schools.setTextSize(15);
                    abilityDescription6_1Schools.setText(R.string.rangerLandsStride);
                    break;
                case ("CircleOfTheMoon"):
                    abilityDescription6_1Schools.setTextSize(15);
                    abilityDescription6_1Schools.setText(R.string.druidCircleOfTheMoonPrimalStrike);
                    break;
                case ("WayOfTheOpenHand"):
                    abilityDescription6_1Schools.setTextSize(15);
                    abilityDescription6_1Schools.setText(R.string.monkWayOfTheOpenHandWholenessOfBody);
                    break;
                case ("WayOfShadows"):
                    abilityDescription6_1Schools.setTextSize(15);
                    abilityDescription6_1Schools.setText(R.string.monkWayOfShadowShadowStep);
                    break;
                case ("DraconicBloodline"):
                    abilityDescription6_1Schools.setTextSize(15);
                    abilityDescription6_1Schools.setText(R.string.sorcererDraconicBloodlineElementalAffinity);
                    break;
                case ("WildMagic"):
                    abilityDescription6_1Schools.setTextSize(15);
                    abilityDescription6_1Schools.setText(R.string.sorcererWildMagicBendLuck);
                    break;
                case ("TheArchfey"):
                    abilityDescription6_1Schools.setTextSize(15);
                    abilityDescription6_1Schools.setText(R.string.warlockArchfeyMistyEscape);
                    break;
                case ("TheFiend"):
                    abilityDescription6_1Schools.setTextSize(15);
                    abilityDescription6_1Schools.setText(R.string.warlockFiendDarkOnesOwnLuck);
                    break;
                case ("TheGreatOldOne"):
                    abilityDescription6_1Schools.setTextSize(15);
                    abilityDescription6_1Schools.setText(R.string.warlockGreatOldOneEntropicWard);
                    break;
                case ("SchoolOfAbjuration"):
                    abilityDescription6_1Schools.setTextSize(15);
                    abilityDescription6_1Schools.setText(R.string.wizardSchoolOfAbjurationProjectWard);
                    break;
                case ("SchoolOfConjuration"):
                    abilityDescription6_1Schools.setTextSize(15);
                    abilityDescription6_1Schools.setText(R.string.wizardSchoolOfConjurationBenignTransposition);
                    break;
                case ("SchoolOfDivination"):
                    abilityDescription6_1Schools.setTextSize(15);
                    abilityDescription6_1Schools.setText(R.string.wizardSchoolOfDivinationExpertDivination);
                    break;
                case ("SchoolOfEnchantment"):
                    abilityDescription6_1Schools.setTextSize(15);
                    abilityDescription6_1Schools.setText(R.string.wizardSchoolOfEnchantmentInstinctiveCharm);
                    break;
                case ("SchoolOfEvocation"):
                    abilityDescription6_1Schools.setTextSize(15);
                    abilityDescription6_1Schools.setText(R.string.wizardSchoolOfEvocationPotentCantrip);
                    break;
                case ("SchoolOfIllusion"):
                    abilityDescription6_1Schools.setTextSize(15);
                    abilityDescription6_1Schools.setText(R.string.wizardSchoolOfIllusionMalleableIllusion);
                    break;
                case ("SchoolOfNecromancy"):
                    abilityDescription6_1Schools.setTextSize(15);
                    abilityDescription6_1Schools.setText(R.string.wizardSchoolOfNecromancyUndeadThralls);
                    break;
                case ("SchoolOfTransmutation"):
                    abilityDescription6_1Schools.setTextSize(15);
                    abilityDescription6_1Schools.setText(R.string.wizardSchoolOfTransmutationTransmutersStone);
                    break;
            }
        }
        else {
            abilityDescription6_1Schools.setTextSize(0);
        }
    }

    public void onAbilityButton7_1Schools(View view) {
        TextView abilityDescription7_1Schools = findViewById(R.id.abilityDescription7_1Schools);
        if (abilityDescription7_1Schools.getTextSize() == 0) {
            switch (whichSchool) {
                case ("Champion"):
                    abilityDescription7_1Schools.setTextSize(15);
                    abilityDescription7_1Schools.setText(R.string.fighterChampionRemarkableAthlete);
                    break;
                case ("BattleMaster"):
                    abilityDescription7_1Schools.setTextSize(15);
                    abilityDescription7_1Schools.setText(R.string.fighterBattleMasterKnowYourEnemy);
                    break;
                case ("EldritchKnight"):
                    abilityDescription7_1Schools.setTextSize(15);
                    abilityDescription7_1Schools.setText(R.string.fighterEldritchKnightWarMagic);
                    break;
                case ("OathOfDevotion"):
                    abilityDescription7_1Schools.setTextSize(15);
                    abilityDescription7_1Schools.setText(R.string.paladinOathOfDevotionAuraofDevotion);
                    break;
                case ("OathOfTheAncients"):
                    abilityDescription7_1Schools.setTextSize(15);
                    abilityDescription7_1Schools.setText(R.string.paladinOathOfTheAncientsAuraOfWarding);
                    break;
                case ("OathOfVengeance"):
                    abilityDescription7_1Schools.setTextSize(15);
                    abilityDescription7_1Schools.setText(R.string.paladinOathOFVengenceRelentlessAvenger);
                    break;
                case ("Hunter"):
                    abilityDescription7_1Schools.setTextSize(15);
                    abilityDescription7_1Schools.setText(R.string.rangerHunterDefensiveTactics);
                    break;
                case ("BeastMaster"):
                    abilityDescription7_1Schools.setTextSize(15);
                    abilityDescription7_1Schools.setText(R.string.rangerBeastMasterExceptionalTraining);
                    break;
            }
        }
        else {
            abilityDescription7_1Schools.setTextSize(0);
        }
    }

    public void onAbilityButton8_1Schools(View view) {
        TextView abilityDescription8_1Schools = findViewById(R.id.abilityDescription8_1Schools);
        if (abilityDescription8_1Schools.getTextSize() == 0) {
            switch (whichSchool) {
                case ("KnowledgeDomain"):
                    abilityDescription8_1Schools.setTextSize(15);
                    abilityDescription8_1Schools.setText(R.string.clericKnowledgeDomainPotentSpellcasting);
                    break;
                case ("LightDomain"):
                    abilityDescription8_1Schools.setTextSize(15);
                    abilityDescription8_1Schools.setText(R.string.clericLightDomainPotentSpellcasting);
                    break;
                case ("LifeDomain"):
                    abilityDescription8_1Schools.setTextSize(15);
                    abilityDescription8_1Schools.setText(R.string.clericLifeDomainDivineStrike);
                    break;
                case ("NatureDomain"):
                    abilityDescription8_1Schools.setTextSize(15);
                    abilityDescription8_1Schools.setText(R.string.clericNatureDomainDivineStrike);
                    break;
                case ("TempestDomain"):
                    abilityDescription8_1Schools.setTextSize(15);
                    abilityDescription8_1Schools.setText(R.string.clericTempestDomainDivineStrike);
                    break;
                case ("TrickeryDomain"):
                    abilityDescription8_1Schools.setTextSize(15);
                    abilityDescription8_1Schools.setText(R.string.clericTrickeryDomainDivineStrike);
                    break;
                case ("WarDomain"):
                    abilityDescription8_1Schools.setTextSize(15);
                    abilityDescription8_1Schools.setText(R.string.clericWarDomainDivineStrike);
                    break;
            }

        }
        else {
            abilityDescription8_1Schools.setTextSize(0);
        }
    }

    public void onAbilityButton9_1Schools(View view) {
        TextView abilityDescription9_1Schools = findViewById(R.id.abilityDescription9_1Schools);
        if (abilityDescription9_1Schools.getTextSize() == 0) {
            switch (whichSchool) {
                case ("Thief"):
                    abilityDescription9_1Schools.setTextSize(15);
                    abilityDescription9_1Schools.setText(R.string.rogueThiefSupremeSneak);
                    break;
                case ("Assassin"):
                    abilityDescription9_1Schools.setTextSize(15);
                    abilityDescription9_1Schools.setText(R.string.rogueAssassinInfiltrationExpertise);
                    break;
                case ("ArcaneTrickster"):
                    abilityDescription9_1Schools.setTextSize(15);
                    abilityDescription9_1Schools.setText(R.string.rogueArcaneTricksterMagicalAmbush);
                    break;
            }
        }
        else {
            abilityDescription9_1Schools.setTextSize(0);
        }
    }

    public void onAbilityButton10_1Schools(View view) {
        TextView abilityDescription10_1Schools = findViewById(R.id.abilityDescription10_1Schools);
        if (abilityDescription10_1Schools.getTextSize() == 0) {
            switch (whichSchool) {
                case ("PathOfBerserker"):
                    abilityDescription10_1Schools.setTextSize(15);
                    abilityDescription10_1Schools.setText(R.string.barbarianPathOfTheBerserkerIntimidatingPresence);
                    break;
                case ("PathOfTheTotemWarrior"):
                    abilityDescription10_1Schools.setTextSize(15);
                    abilityDescription10_1Schools.setText(R.string.barbarianSpiritWalker);
                    break;
                case ("CircleOfTheLand"):
                    abilityDescription10_1Schools.setTextSize(15);
                    abilityDescription10_1Schools.setText(R.string.druidCircleOfTheLandNaturesWard);
                    break;
                case ("CircleOfTheMoon"):
                    abilityDescription10_1Schools.setTextSize(15);
                    abilityDescription10_1Schools.setText(R.string.druidCircleOfTheMoonElementalWldShape);
                    break;
                case ("Champion"):
                    abilityDescription10_1Schools.setTextSize(15);
                    abilityDescription10_1Schools.setText(R.string.fighterChampionAdditionalFightingStyle);
                    break;
                case ("BattleMaster"):
                    abilityDescription10_1Schools.setTextSize(15);
                    abilityDescription10_1Schools.setText(R.string.fighterBattleMasterImprovedCombatSuperiority);
                    break;
                case ("EldritchKnight"):
                    abilityDescription10_1Schools.setTextSize(15);
                    abilityDescription10_1Schools.setText(R.string.fighterEldritchKnightEldritchStrike);
                    break;
                case ("TheArchfey"):
                    abilityDescription10_1Schools.setTextSize(15);
                    abilityDescription10_1Schools.setText(R.string.walockArchfeyBeguilingDefenses);
                    break;
                case ("TheFiend"):
                    abilityDescription10_1Schools.setTextSize(15);
                    abilityDescription10_1Schools.setText(R.string.warlockFiendFiendishReplenish);
                    break;
                case ("TheGreatOldOne"):
                    abilityDescription10_1Schools.setTextSize(15);
                    abilityDescription10_1Schools.setText(R.string.warlockGreatOldOneThoughtShield);
                    break;
                case ("SchoolOfAbjuration"):
                    abilityDescription10_1Schools.setTextSize(15);
                    abilityDescription10_1Schools.setText(R.string.wizardSchoolOfAbjurationImprovedAbjuration);
                    break;
                case ("SchoolOfConjuration"):
                    abilityDescription10_1Schools.setTextSize(15);
                    abilityDescription10_1Schools.setText(R.string.wizardSchoolOfConjurationFocusedConjuration);
                    break;
                case ("SchoolOfDivination"):
                    abilityDescription10_1Schools.setTextSize(15);
                    abilityDescription10_1Schools.setText(R.string.wizardSchoolOfDivinationTheThirdEye);
                    break;
                case ("SchoolOfEnchantment"):
                    abilityDescription10_1Schools.setTextSize(15);
                    abilityDescription10_1Schools.setText(R.string.wizardSchoolOfEnchantmentSplitEnchantment);
                    break;
                case ("SchoolOfEvocation"):
                    abilityDescription10_1Schools.setTextSize(15);
                    abilityDescription10_1Schools.setText(R.string.wizardSchoolOfEvocationEmpoweredEvocation);
                    break;
                case ("SchoolOfIllusion"):
                    abilityDescription10_1Schools.setTextSize(15);
                    abilityDescription10_1Schools.setText(R.string.wizardChoolOfIllusionIllusorySelf);
                    break;
                case ("SchoolOfNecromancy"):
                    abilityDescription10_1Schools.setTextSize(15);
                    abilityDescription10_1Schools.setText(R.string.wizardSchoolOfNecromancyInuredToUndead);
                    break;
                case ("SchoolOfTransmutation"):
                    abilityDescription10_1Schools.setTextSize(15);
                    abilityDescription10_1Schools.setText(R.string.wizardSchoolOfTransmutationShapeChanger);
                    break;
            }
        }
        else {
            abilityDescription10_1Schools.setTextSize(0);
        }
    }

    public void onAbilityButton11_1Schools(View view) {
        TextView abilityDescription11_1Schools = findViewById(R.id.abilityDescription11_1Schools);
        if (abilityDescription11_1Schools.getTextSize() == 0) {
            switch (whichSchool) {
                case ("WayOfTheOpenHand"):
                    abilityDescription11_1Schools.setTextSize(15);
                    abilityDescription11_1Schools.setText(R.string.monkWayOfTheOpenHandTranquility);
                    break;
                case ("WayOfShadows"):
                    abilityDescription11_1Schools.setTextSize(15);
                    abilityDescription11_1Schools.setText(R.string.monkWayOfShadowCloakOfShadows);
                    break;
                case ("Hunter"):
                    abilityDescription11_1Schools.setTextSize(15);
                    abilityDescription11_1Schools.setText(R.string.rangerHunterMultiattack);
                    break;
                case ("BeastMaster"):
                    abilityDescription11_1Schools.setTextSize(15);
                    abilityDescription11_1Schools.setText(R.string.rangerBeastMasterBestialFury);
                    break;
            }
        }
        else {
            abilityDescription11_1Schools.setTextSize(0);
        }
    }

    public void onAbilityButton13_1Schools(View view) {
        TextView abilityDescription13_1Schools = findViewById(R.id.abilityDescription13_1Schools);
        if (abilityDescription13_1Schools.getTextSize() == 0) {
            switch (whichSchool) {
                case ("Thief"):
                    abilityDescription13_1Schools.setTextSize(15);
                    abilityDescription13_1Schools.setText(R.string.rogueThiefUseMagicDevice);
                    break;
                case ("Assassin"):
                    abilityDescription13_1Schools.setTextSize(15);
                    abilityDescription13_1Schools.setText(R.string.rogueAssassinImpostor);
                    break;
                case ("ArcaneTrickster"):
                    abilityDescription13_1Schools.setTextSize(15);
                    abilityDescription13_1Schools.setText(R.string.rogueArcaneTricksterVersatileTrickster);
                    break;
            }
        }
        else {
            abilityDescription13_1Schools.setTextSize(0);
        }
    }

    public void onAbilityButton14_1Schools(View view) {
        TextView abilityDescription14_1Schools = findViewById(R.id.abilityDescription14_1Schools);
        if (abilityDescription14_1Schools.getTextSize() == 0) {
            switch (whichSchool) {
                case ("PathOfBerserker"):
                    abilityDescription14_1Schools.setTextSize(15);
                    abilityDescription14_1Schools.setText(R.string.barbarianPathOfTheBerserkerRetaliation);
                    break;
                case ("CollegeOfLore"):
                    abilityDescription14_1Schools.setTextSize(15);
                    abilityDescription14_1Schools.setText(R.string.bardCollegeOfLorePeerlessSkill);
                    break;
                case ("PathOfTheTotemWarrior"):
                    abilityDescription14_1Schools.setTextSize(15);
                    abilityDescription14_1Schools.setText(R.string.barbarianTotemicAtunement);
                    break;
                case ("CollegeOfValor"):
                    abilityDescription14_1Schools.setTextSize(15);
                    abilityDescription14_1Schools.setText(R.string.bardCollegeOfValorBattleMagic);
                    break;
                case ("CircleOfTheLand"):
                    abilityDescription14_1Schools.setTextSize(15);
                    abilityDescription14_1Schools.setText(R.string.druidCircleOfTheLandNaturesSanctuary);
                    break;
                case ("CircleOfTheMoon"):
                    abilityDescription14_1Schools.setTextSize(15);
                    abilityDescription14_1Schools.setText(R.string.druidCircleOfTheMoonThousandForms);
                    break;
                case ("DraconicBloodline"):
                    abilityDescription14_1Schools.setTextSize(15);
                    abilityDescription14_1Schools.setText(R.string.sorcererDraconicBloodlineDragonWings);
                    break;
                case ("WildMagic"):
                    abilityDescription14_1Schools.setTextSize(15);
                    abilityDescription14_1Schools.setText(R.string.sorcererWildMagicControlledChaos);
                    break;
                case ("TheArchfey"):
                    abilityDescription14_1Schools.setTextSize(15);
                    abilityDescription14_1Schools.setText(R.string.warlockArchfeyDarkDelirium);
                    break;
                case ("TheFiend"):
                    abilityDescription14_1Schools.setTextSize(15);
                    abilityDescription14_1Schools.setText(R.string.warlockFiendHurlThrough);
                    break;
                case ("TheGreatOldOne"):
                    abilityDescription14_1Schools.setTextSize(15);
                    abilityDescription14_1Schools.setText(R.string.warlockGreatOldOneGreatThrall);
                    break;
                case ("SchoolOfAbjuration"):
                    abilityDescription14_1Schools.setTextSize(15);
                    abilityDescription14_1Schools.setText(R.string.wizardSchoolOfAbjurationSpellResistance);
                    break;
                case ("SchoolOfConjuration"):
                    abilityDescription14_1Schools.setTextSize(15);
                    abilityDescription14_1Schools.setText(R.string.wizardSchoolOfConjurationDurableSummons);
                    break;
                case ("SchoolOfDivination"):
                    abilityDescription14_1Schools.setTextSize(15);
                    abilityDescription14_1Schools.setText(R.string.wizardSchoolOfDivinationGreaterPortent);
                    break;
                case ("SchoolOfEnchantment"):
                    abilityDescription14_1Schools.setTextSize(15);
                    abilityDescription14_1Schools.setText(R.string.wizardSchoolOfEnchantmentAlterMemories);
                    break;
                case ("SchoolOfEvocation"):
                    abilityDescription14_1Schools.setTextSize(15);
                    abilityDescription14_1Schools.setText(R.string.wizardSchoolOfEvocationOverchannel);
                    break;
                case ("SchoolOfIllusion"):
                    abilityDescription14_1Schools.setTextSize(15);
                    abilityDescription14_1Schools.setText(R.string.wizardSchoolOfIllusionIllusoryReality);
                    break;
                case ("SchoolOfNecromancy"):
                    abilityDescription14_1Schools.setTextSize(15);
                    abilityDescription14_1Schools.setText(R.string.wizardSchoolOfNecromancyCommandUndead);
                    break;
                case ("SchoolOfTransmutation"):
                    abilityDescription14_1Schools.setTextSize(15);
                    abilityDescription14_1Schools.setText(R.string.wizardSchoolOfTransmutationMasterTransmuter);
                    break;
            }
        }
        else {
            abilityDescription14_1Schools.setTextSize(0);
        }
    }

    public void onAbilityButton15_1Schools(View view) {
        TextView abilityDescription15_1Schools = findViewById(R.id.abilityDescription15_1Schools);
        if (abilityDescription15_1Schools.getTextSize() == 0) {
            switch (whichSchool) {
                case ("Champion"):
                    abilityDescription15_1Schools.setTextSize(15);
                    abilityDescription15_1Schools.setText(R.string.fighterChampionSuperiorCritical);
                    break;
                case ("BattleMaster"):
                    abilityDescription15_1Schools.setTextSize(15);
                    abilityDescription15_1Schools.setText(R.string.fighterBattleMasterRelentless);
                    break;
                case ("EldritchKnight"):
                    abilityDescription15_1Schools.setTextSize(15);
                    abilityDescription15_1Schools.setText(R.string.fighterEldritchKnightArcaneCharge);
                    break;
                case ("OathOfDevotion"):
                    abilityDescription15_1Schools.setTextSize(15);
                    abilityDescription15_1Schools.setText(R.string.paladinOathOfDevotionPurityOfSpirit);
                    break;
                case ("OathOfTheAncients"):
                    abilityDescription15_1Schools.setTextSize(15);
                    abilityDescription15_1Schools.setText(R.string.paladinOathOfTheAncientsUndyingSentinel);
                    break;
                case ("OathOfVengeance"):
                    abilityDescription15_1Schools.setTextSize(15);
                    abilityDescription15_1Schools.setText(R.string.paladinOathOfVengenceSoulOfVengeance);
                    break;
                case ("Hunter"):
                    abilityDescription15_1Schools.setTextSize(15);
                    abilityDescription15_1Schools.setText(R.string.rangerHunterSuperiorHunterDefense);
                    break;
                case ("BeastMaster"):
                    abilityDescription15_1Schools.setTextSize(15);
                    abilityDescription15_1Schools.setText(R.string.rangerBeastMasterShareSpells);
                    break;

            }
        }
        else {
            abilityDescription15_1Schools.setTextSize(0);
        }

    }

    public void onAbilityButton17_1Schools(View view) {
        TextView abilityDescription17_1Schools = findViewById(R.id.abilityDescription17_1Schools);
        if (abilityDescription17_1Schools.getTextSize() == 0) {
            switch (whichSchool) {
                case ("KnowledgeDomain"):
                    abilityDescription17_1Schools.setTextSize(15);
                    abilityDescription17_1Schools.setText(R.string.clericKnowledgeDomainVisionOfThePast);
                    break;
                case ("LightDomain"):
                    abilityDescription17_1Schools.setTextSize(15);
                    abilityDescription17_1Schools.setText(R.string.clericCoronaOfLight);
                    break;
                case ("LifeDomain"):
                    abilityDescription17_1Schools.setTextSize(15);
                    abilityDescription17_1Schools.setText(R.string.clericLifeDomainSupremeHealing);
                    break;
                case ("NatureDomain"):
                    abilityDescription17_1Schools.setTextSize(15);
                    abilityDescription17_1Schools.setText(R.string.clericMasterOfNature);
                    break;
                case ("TempestDomain"):
                    abilityDescription17_1Schools.setTextSize(15);
                    abilityDescription17_1Schools.setText(R.string.clericTempestDomainStormborn);
                    break;
                case ("TrickeryDomain"):
                    abilityDescription17_1Schools.setTextSize(15);
                    abilityDescription17_1Schools.setText(R.string.clericTrickeryDomainImproveDuplicity);
                    break;
                case ("WarDomain"):
                    abilityDescription17_1Schools.setTextSize(15);
                    abilityDescription17_1Schools.setText(R.string.clericWarDomainAvatarOfBattle);
                    break;
                case ("WayOfTheOpenHand"):
                    abilityDescription17_1Schools.setTextSize(15);
                    abilityDescription17_1Schools.setText(R.string.monkWayOfTheOpenHandQuiveringPalm);
                    break;
                case ("WayOfShadows"):
                    abilityDescription17_1Schools.setTextSize(15);
                    abilityDescription17_1Schools.setText(R.string.monkWayOfShadowOpportunist);
                    break;
                case ("Thief"):
                    abilityDescription17_1Schools.setTextSize(15);
                    abilityDescription17_1Schools.setText(R.string.rogueThiefThiefsReflex);
                    break;
                case ("Assassin"):
                    abilityDescription17_1Schools.setTextSize(15);
                    abilityDescription17_1Schools.setText(R.string.rogueAssassinDeathStrike);
                    break;
                case ("ArcaneTrickster"):
                    abilityDescription17_1Schools.setTextSize(15);
                    abilityDescription17_1Schools.setText(R.string.rogueArcaneTricksterSpellThief);
                    break;
            }

        }
        else {
            abilityDescription17_1Schools.setTextSize(0);
        }
    }

    public void onAbilityButton18_1Schools(View view) {
        TextView abilityDescription18_1Schools = findViewById(R.id.abilityDescription18_1Schools);
        if (abilityDescription18_1Schools.getTextSize() == 0) {
            switch (whichSchool) {
                case ("Champion"):
                    abilityDescription18_1Schools.setTextSize(15);
                    abilityDescription18_1Schools.setText(R.string.fighterChampionSurvivor);
                    break;
                case ("EldritchKnight"):
                    abilityDescription18_1Schools.setTextSize(15);
                    abilityDescription18_1Schools.setText(R.string.fighterEldrichtKnightImprovedWarMagic);
                    break;
                case ("DraconicBloodline"):
                    abilityDescription18_1Schools.setTextSize(15);
                    abilityDescription18_1Schools.setText(R.string.sorcererDraconicBloodlineDraconicPresence);
                    break;
                case ("WildMagic"):
                    abilityDescription18_1Schools.setTextSize(15);
                    abilityDescription18_1Schools.setText(R.string.sorcererWildMagicSpellBombardment);
                    break;
            }
        }
        else {
            abilityDescription18_1Schools.setTextSize(0);
        }
    }

    public void onAbilityButton20_1Schools(View view) {
        TextView abilityDescription20_1Schools = findViewById(R.id.abilityDescription20_1Schools);
        if (abilityDescription20_1Schools.getTextSize() == 0) {
            switch (whichSchool) {
                case ("OathOfDevotion"):
                    abilityDescription20_1Schools.setTextSize(15);
                    abilityDescription20_1Schools.setText(R.string.paladinOathOfDevotionHolyNimbus);
                    break;
                case ("OathOfTheAncients"):
                    abilityDescription20_1Schools.setTextSize(15);
                    abilityDescription20_1Schools.setText(R.string.paladinOathOfTheAncientsElderChampion);
                    break;
                case ("OathOfVengeance"):
                    abilityDescription20_1Schools.setTextSize(15);
                    abilityDescription20_1Schools.setText(R.string.paladinOathOfVengenaceAvengingAngel);
                    break;

            }
        }
        else {
            abilityDescription20_1Schools.setTextSize(0);
        }
    }



}