package com.apress.gerber.dnd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;


public class RollStatsActivity extends AppCompatActivity {

    public String mainStats;
    public String choosenClass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roll_stats);
        mainStats = getIntent().getStringExtra("mainStats");


        TextView mainStatistics = findViewById(R.id.mainStatsLabel);
        TextView firstStatValue = findViewById(R.id.rolledStat1);
        TextView secondStatValue = findViewById(R.id.rolledStat2);
        TextView thirdStatValue = findViewById(R.id.rolledStat3);
        TextView fourthStatValue = findViewById(R.id.rolledStat4);
        TextView fifthStatValue = findViewById(R.id.rolledStat5);
        TextView sixthStatValue = findViewById(R.id.rolledStat6);

        String string = "Main Statistics:\n";
        string += mainStats;
        mainStatistics.setText(string);

        DiceRoll rollDice = new DiceRoll();

        int a[] = new int[6];
        a[0] = rollDice.rollXDYRemove1(4, 6);
        a[1] = rollDice.rollXDYRemove1(4, 6);
        a[2] = rollDice.rollXDYRemove1(4, 6);
        a[3] = rollDice.rollXDYRemove1(4, 6);
        a[4] = rollDice.rollXDYRemove1(4, 6);
        a[5] = rollDice.rollXDYRemove1(4, 6);
        Arrays.sort(a, 0, 6);


        firstStatValue.setText(Integer.toString(a[5]));
        secondStatValue.setText(Integer.toString(a[4]));
        thirdStatValue.setText(Integer.toString(a[3]));
        fourthStatValue.setText(Integer.toString(a[2]));
        fifthStatValue.setText(Integer.toString(a[1]));
        sixthStatValue.setText(Integer.toString(a[0]));


        final Spinner statValueSpinner1 = (Spinner) findViewById(R.id.rolledStr);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.StatsValues1, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        statValueSpinner1.setAdapter(adapter1);


        final Spinner statValueSpinner2 = (Spinner) findViewById(R.id.rolledDex);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.StatsValues2, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        statValueSpinner2.setAdapter(adapter2);

        final Spinner statValueSpinner3 = (Spinner) findViewById(R.id.rolledCon);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.StatsValues3, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        statValueSpinner3.setAdapter(adapter3);


        final Spinner statValueSpinner4 = (Spinner) findViewById(R.id.rolledInt);
        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this, R.array.StatsValues4, android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        statValueSpinner4.setAdapter(adapter4);


        final Spinner statValueSpinner5 = (Spinner) findViewById(R.id.rolledWis);
        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(this, R.array.StatsValues5, android.R.layout.simple_spinner_item);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        statValueSpinner5.setAdapter(adapter5);

        final Spinner statValueSpinner6 = (Spinner) findViewById(R.id.rolledCha);
        ArrayAdapter<CharSequence> adapter6 = ArrayAdapter.createFromResource(this, R.array.StatsValues6, android.R.layout.simple_spinner_item);
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        statValueSpinner6.setAdapter(adapter6);

        statValueSpinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                TextView chosenStat1 = findViewById(R.id.choosenStatLabel1);
                String s = (String) statValueSpinner1.getItemAtPosition(i);
                chosenStat1.setText(s);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        statValueSpinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                TextView chosenStat1 = findViewById(R.id.choosenStatLabel2);
                String s = (String) statValueSpinner2.getItemAtPosition(i);
                chosenStat1.setText(s);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        statValueSpinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                TextView chosenStat1 = findViewById(R.id.choosenStatLabel3);
                String s = (String) statValueSpinner3.getItemAtPosition(i);
                chosenStat1.setText(s);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        statValueSpinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                TextView chosenStat1 = findViewById(R.id.choosenStatLabel4);
                String s = (String) statValueSpinner4.getItemAtPosition(i);
                chosenStat1.setText(s);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        statValueSpinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                TextView chosenStat1 = findViewById(R.id.choosenStatLabel5);
                String s = (String) statValueSpinner5.getItemAtPosition(i);
                chosenStat1.setText(s);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        statValueSpinner6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                TextView chosenStat1 = findViewById(R.id.choosenStatLabel6);
                String s = (String) statValueSpinner6.getItemAtPosition(i);
                chosenStat1.setText(s);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }


    public void onAssignStatsButton(View view) {
        choosenClass = getIntent().getStringExtra("klasa");
        TextView chosenStat1 = findViewById(R.id.choosenStatLabel1);
        TextView chosenStat2 = findViewById(R.id.choosenStatLabel2);
        TextView chosenStat3 = findViewById(R.id.choosenStatLabel3);
        TextView chosenStat4 = findViewById(R.id.choosenStatLabel4);
        TextView chosenStat5 = findViewById(R.id.choosenStatLabel5);
        TextView chosenStat6 = findViewById(R.id.choosenStatLabel6);

        TextView firstStatValue = findViewById(R.id.rolledStat1);
        TextView secondStatValue = findViewById(R.id.rolledStat2);
        TextView thirdStatValue = findViewById(R.id.rolledStat3);
        TextView fourthStatValue = findViewById(R.id.rolledStat4);
        TextView fifthStatValue = findViewById(R.id.rolledStat5);
        TextView sixthStatValue = findViewById(R.id.rolledStat6);

        String tablica[] = new String[6];
        tablica[0] = (String) chosenStat1.getText();
        tablica[1] = (String) chosenStat2.getText();
        tablica[2] = (String) chosenStat3.getText();
        tablica[3] = (String) chosenStat4.getText();
        tablica[4] = (String) chosenStat5.getText();
        tablica[5] = (String) chosenStat6.getText();

        EditText editStr = (EditText) findViewById(R.id.editStr);
        EditText editDex = (EditText) findViewById(R.id.editDex);
        EditText editCon = (EditText) findViewById(R.id.editCon);
        EditText editInt = (EditText) findViewById(R.id.editInt);
        EditText editWis = (EditText) findViewById(R.id.editWis);
        EditText editCha = (EditText) findViewById(R.id.editCha);

        int manualSelect = 0;

        int counter[] = new int[6];
        for (int i = 0; i < 6; i++) {
            counter[i] = 0;
        }

        for (int i = 0; i < 6; i++) {
            if (tablica[i].equals("STR")) {
                counter[0]++;
            }
            if (tablica[i].equals("DEX")) {
                counter[1]++;
            }
            if (tablica[i].equals("CON")) {
                counter[2]++;
            }
            if (tablica[i].equals("INT")) {
                counter[3]++;
            }
            if (tablica[i].equals("WIS")) {
                counter[4]++;
            }
            if (tablica[i].equals("CHA")) {
                counter[5]++;
            }
        }

        CheckBox checkBox = findViewById(R.id.checkBox);
        if ((counter[0] != 1 || counter[1] != 1 || counter[2] != 1 || counter[3] != 1 || counter[4] != 1 || counter[5] != 1) && !checkBox.isChecked()){
                Toast toast = Toast.makeText(this, "Something's Wrong!", Toast.LENGTH_SHORT);
                toast.show();
        }
        else {


            int staty[] = new int[6];
            if(!checkBox.isChecked()) {
                /** Przypordkowywanie statystyk **/
                if (tablica[0].equals("STR")) {
                    staty[0] = Integer.parseInt((String) firstStatValue.getText());
                } else if (tablica[0].equals("DEX")) {
                    staty[1] = Integer.parseInt((String) firstStatValue.getText());
                } else if (tablica[0].equals("CON")) {
                    staty[2] = Integer.parseInt((String) firstStatValue.getText());
                } else if (tablica[0].equals("INT")) {
                    staty[3] = Integer.parseInt((String) firstStatValue.getText());
                } else if (tablica[0].equals("WIS")) {
                    staty[4] = Integer.parseInt((String) firstStatValue.getText());
                } else if (tablica[0].equals("CHA")) {
                    staty[5] = Integer.parseInt((String) firstStatValue.getText());
                }

                if (tablica[1].equals("STR")) {
                    staty[0] = Integer.parseInt((String) secondStatValue.getText());
                } else if (tablica[1].equals("DEX")) {
                    staty[1] = Integer.parseInt((String) secondStatValue.getText());
                } else if (tablica[1].equals("CON")) {
                    staty[2] = Integer.parseInt((String) secondStatValue.getText());
                } else if (tablica[1].equals("INT")) {
                    staty[3] = Integer.parseInt((String) secondStatValue.getText());
                } else if (tablica[1].equals("WIS")) {
                    staty[4] = Integer.parseInt((String) secondStatValue.getText());
                } else if (tablica[1].equals("CHA")) {
                    staty[5] = Integer.parseInt((String) secondStatValue.getText());
                }

                if (tablica[2].equals("STR")) {
                    staty[0] = Integer.parseInt((String) thirdStatValue.getText());
                } else if (tablica[2].equals("DEX")) {
                    staty[1] = Integer.parseInt((String) thirdStatValue.getText());
                } else if (tablica[2].equals("CON")) {
                    staty[2] = Integer.parseInt((String) thirdStatValue.getText());
                } else if (tablica[2].equals("INT")) {
                    staty[3] = Integer.parseInt((String) thirdStatValue.getText());
                } else if (tablica[2].equals("WIS")) {
                    staty[4] = Integer.parseInt((String) thirdStatValue.getText());
                } else if (tablica[2].equals("CHA")) {
                    staty[5] = Integer.parseInt((String) thirdStatValue.getText());
                }

                if (tablica[3].equals("STR")) {
                    staty[0] = Integer.parseInt((String) fourthStatValue.getText());
                } else if (tablica[3].equals("DEX")) {
                    staty[1] = Integer.parseInt((String) fourthStatValue.getText());
                } else if (tablica[3].equals("CON")) {
                    staty[2] = Integer.parseInt((String) fourthStatValue.getText());
                } else if (tablica[3].equals("INT")) {
                    staty[3] = Integer.parseInt((String) fourthStatValue.getText());
                } else if (tablica[3].equals("WIS")) {
                    staty[4] = Integer.parseInt((String) fourthStatValue.getText());
                } else if (tablica[3].equals("CHA")) {
                    staty[5] = Integer.parseInt((String) fourthStatValue.getText());
                }

                if (tablica[4].equals("STR")) {
                    staty[0] = Integer.parseInt((String) fifthStatValue.getText());
                } else if (tablica[4].equals("DEX")) {
                    staty[1] = Integer.parseInt((String) fifthStatValue.getText());
                } else if (tablica[4].equals("CON")) {
                    staty[2] = Integer.parseInt((String) fifthStatValue.getText());
                } else if (tablica[4].equals("INT")) {
                    staty[3] = Integer.parseInt((String) fifthStatValue.getText());
                } else if (tablica[4].equals("WIS")) {
                    staty[4] = Integer.parseInt((String) fifthStatValue.getText());
                } else if (tablica[4].equals("CHA")) {
                    staty[5] = Integer.parseInt((String) fifthStatValue.getText());
                }

                if (tablica[5].equals("STR")) {
                    staty[0] = Integer.parseInt((String) sixthStatValue.getText());
                } else if (tablica[5].equals("DEX")) {
                    staty[1] = Integer.parseInt((String) sixthStatValue.getText());
                } else if (tablica[5].equals("CON")) {
                    staty[2] = Integer.parseInt((String) sixthStatValue.getText());
                } else if (tablica[5].equals("INT")) {
                    staty[3] = Integer.parseInt((String) sixthStatValue.getText());
                } else if (tablica[5].equals("WIS")) {
                    staty[4] = Integer.parseInt((String) sixthStatValue.getText());
                } else if (tablica[5].equals("CHA")) {
                    staty[5] = Integer.parseInt((String) sixthStatValue.getText());
                }

            }
            else {

                if(!TextUtils.isDigitsOnly(editStr.getText()) || !TextUtils.isDigitsOnly(editDex.getText()) || !TextUtils.isDigitsOnly(editCon.getText()) || !TextUtils.isDigitsOnly(editInt.getText()) || !TextUtils.isDigitsOnly(editWis.getText()) || !TextUtils.isDigitsOnly(editCha.getText())){
                    Toast toast = Toast.makeText(this, "Please input a number", Toast.LENGTH_SHORT);
                    toast.show();
                    return;
                }
                else {

                    staty[0] = Integer.parseInt(editStr.getText().toString());
                    staty[1] = Integer.parseInt(editDex.getText().toString());
                    staty[2] = Integer.parseInt(editCon.getText().toString());
                    staty[3] = Integer.parseInt(editInt.getText().toString());
                    staty[4] = Integer.parseInt(editWis.getText().toString());
                    staty[5] = Integer.parseInt(editCha.getText().toString());
                }
            }



            Intent intent = new Intent(this, SelectWeaponActivity.class);
            Bundle bundle = new Bundle();

            Barbarian barbarian = new Barbarian();
            Bard bard = new Bard();
            Cleric cleric = new Cleric();
            Druid druid = new Druid();
            Fighter fighter = new Fighter();
            Monk monk = new Monk();
            Paladin paladin = new Paladin();
            Ranger ranger = new Ranger();
            Rogue rogue = new Rogue();
            Wizard wizard = new Wizard();
            Sorcerer sorcerer = new Sorcerer();
            Warlock warlock = new Warlock();

            /**Ustawianie statystyk*/
            if (choosenClass.equals("Barbarian")) {
                for (int i = 0; i < 6; i++) {
                    barbarian.setStatistics(i, staty[i]);
                }
                barbarian.setLevel(1);
                barbarian.setHitDice(barbarian.itsLevel());
                barbarian.setHitDice1(1);
                barbarian.setHitDice2(12);
                barbarian.setMaxHp(12 + barbarian.itsStatisticsModifier(2));
                for (int i = 0; i < 8; i++) {
                    barbarian.setArmorProfitiecys(i, 1);
                }
                barbarian.setArmorProfitiecys(12, 1);
                for (int i = 0; i < 38; i++) {
                    barbarian.setWeaponProfitiencys(i, 1);
                }
                for (int i = 0; i < 6; i++) {
                    barbarian.setSavingThrows(i, barbarian.itsStatisticsModifier(i));
                }
                barbarian.setSavingThrowsProfitiency(0, 1);
                barbarian.setSavingThrowsProfitiency(2, 1);

            } else if (choosenClass.equals("Bard")) {
                for (int i = 0; i < 6; i++) {
                    bard.setStatistics(i, staty[i]);
                }
                bard.setLevel(1);
                bard.setHitDice(bard.itsLevel());
                bard.setHitDice1(1);
                bard.setHitDice2(8);
                bard.setMaxHp(8 + bard.itsStatisticsModifier(2));
                for (int i = 0; i < 3; i++) {
                    bard.setArmorProfitiecys(i, 1);
                }
                for (int i = 0; i < 11; i++) {
                    bard.setWeaponProfitiencys(i, 1);
                }
                bard.setWeaponProfitiencys(34, 1);
                bard.setWeaponProfitiencys(22, 1);
                bard.setWeaponProfitiencys(26, 1);
                bard.setWeaponProfitiencys(28, 1);
                for (int i = 0; i < 6; i++) {
                    bard.setSavingThrows(i, bard.itsStatisticsModifier(i));
                }
                bard.setSavingThrowsProfitiency(1, 1);
                bard.setSavingThrowsProfitiency(5, 1);

            } else if (choosenClass.equals("Cleric")) {
                for (int i = 0; i < 6; i++) {
                    cleric.setStatistics(i, staty[i]);
                }
                cleric.setLevel(1);
                cleric.setHitDice(cleric.itsLevel());
                cleric.setHitDice1(1);
                cleric.setHitDice2(8);
                cleric.setMaxHp(8 + cleric.itsStatisticsModifier(2));
                for (int i = 0; i < 8; i++) {
                    cleric.setArmorProfitiecys(i, 1);
                }
                cleric.setArmorProfitiecys(12, 1);
                for (int i = 0; i < 11; i++) {
                    cleric.setWeaponProfitiencys(i, 1);
                }
                for (int i = 0; i < 6; i++) {
                    cleric.setSavingThrows(i, cleric.itsStatisticsModifier(i));
                }
                cleric.setSavingThrowsProfitiency(4, 1);
                cleric.setSavingThrowsProfitiency(5, 1);

            } else if (choosenClass.equals("Druid")) {
                for (int i = 0; i < 6; i++) {
                    druid.setStatistics(i, staty[i]);
                }
                druid.setLevel(1);
                druid.setHitDice(druid.itsLevel());
                druid.setHitDice1(1);
                druid.setHitDice2(8);
                druid.setMaxHp(8 + druid.itsStatisticsModifier(2));
                for (int i = 0; i < 8; i++) {
                    druid.setArmorProfitiecys(i, 1);
                }
                druid.setArmorProfitiecys(12, 1);

                druid.setWeaponProfitiencys(0, 1);
                druid.setWeaponProfitiencys(1, 1);
                druid.setWeaponProfitiencys(12, 1);
                druid.setWeaponProfitiencys(4, 1);
                druid.setWeaponProfitiencys(6, 1);
                druid.setWeaponProfitiencys(7, 1);
                druid.setWeaponProfitiencys(27, 1);
                druid.setWeaponProfitiencys(8, 1);
                druid.setWeaponProfitiencys(14, 1);
                druid.setWeaponProfitiencys(9, 1);


                for (int i = 0; i < 6; i++) {
                    druid.setSavingThrows(i, druid.itsStatisticsModifier(i));
                }
                druid.setSavingThrowsProfitiency(3, 1);
                druid.setSavingThrowsProfitiency(4, 1);
                druid.setToolProfitiencys(23, 1);

            } else if (choosenClass.equals("Fighter")) {
                for (int i = 0; i < 6; i++) {
                    fighter.setStatistics(i, staty[i]);
                }
                fighter.setLevel(1);
                fighter.setHitDice(fighter.itsLevel());
                fighter.setHitDice1(1);
                fighter.setHitDice2(10);
                fighter.setMaxHp(10 + fighter.itsStatisticsModifier(2));
                for (int i = 0; i < 13; i++) {
                    fighter.setArmorProfitiecys(i, 1);
                }
                for (int i = 0; i < 38; i++) {
                    fighter.setWeaponProfitiencys(i, 1);
                }
                for (int i = 0; i < 6; i++) {
                    fighter.setSavingThrows(i, fighter.itsStatisticsModifier(i));
                }
                fighter.setSavingThrowsProfitiency(0, 1);
                fighter.setSavingThrowsProfitiency(2, 1);

            } else if (choosenClass.equals("Monk")) {
                for (int i = 0; i < 6; i++) {
                    monk.setStatistics(i, staty[i]);
                }
                monk.setLevel(1);
                monk.setHitDice(monk.itsLevel());
                monk.setHitDice1(1);
                monk.setHitDice2(8);
                monk.setMaxHp(8 + monk.itsStatisticsModifier(2));

                for (int i = 0; i < 11; i++) {
                    monk.setWeaponProfitiencys(i, 1);
                }
                monk.setWeaponProfitiencys(28, 1);
                for (int i = 0; i < 6; i++) {
                    monk.setSavingThrows(i, monk.itsStatisticsModifier(i));
                }
                monk.setSavingThrowsProfitiency(0, 1);
                monk.setSavingThrowsProfitiency(1, 1);

            } else if (choosenClass.equals("Paladin")) {
                for (int i = 0; i < 6; i++) {
                    paladin.setStatistics(i, staty[i]);
                }
                paladin.setLevel(1);
                paladin.setHitDice(paladin.itsLevel());
                paladin.setHitDice1(1);
                paladin.setHitDice2(10);
                paladin.setMaxHp(10 + paladin.itsStatisticsModifier(2));
                for (int i = 0; i < 12; i++) {
                    paladin.setArmorProfitiecys(i, 1);
                }

                for (int i = 0; i < 38; i++) {
                    paladin.setWeaponProfitiencys(i, 1);
                }
                for (int i = 0; i < 6; i++) {
                    paladin.setSavingThrows(i, paladin.itsStatisticsModifier(i));
                }
                paladin.setSavingThrowsProfitiency(4, 1);
                paladin.setSavingThrowsProfitiency(5, 1);

            } else if (choosenClass.equals("Ranger")) {
                for (int i = 0; i < 6; i++) {
                    ranger.setStatistics(i, staty[i]);
                }
                ranger.setLevel(1);
                ranger.setHitDice(ranger.itsLevel());
                ranger.setHitDice1(1);
                ranger.setHitDice2(10);
                ranger.setMaxHp(10 + ranger.itsStatisticsModifier(2));
                for (int i = 0; i < 8; i++) {
                    ranger.setArmorProfitiecys(i, 1);
                }
                ranger.setArmorProfitiecys(12, 1);
                for (int i = 0; i < 38; i++) {
                    ranger.setWeaponProfitiencys(i, 1);
                }
                for (int i = 0; i < 6; i++) {
                    ranger.setSavingThrows(i, ranger.itsStatisticsModifier(i));
                }
                ranger.setSavingThrowsProfitiency(0, 1);
                ranger.setSavingThrowsProfitiency(1, 1);

            } else if (choosenClass.equals("Rogue")) {
                for (int i = 0; i < 6; i++) {
                    rogue.setStatistics(i, staty[i]);
                }
                rogue.setLevel(1);
                rogue.setHitDice(rogue.itsLevel());
                rogue.setHitDice1(1);
                rogue.setHitDice2(8);
                rogue.setMaxHp(8 + rogue.itsStatisticsModifier(2));
                for (int i = 0; i < 3; i++) {
                    rogue.setArmorProfitiecys(i, 1);
                }

                for (int i = 0; i < 11; i++) {
                    rogue.setWeaponProfitiencys(i, 1);
                }
                rogue.setWeaponProfitiencys(34, 1);
                rogue.setWeaponProfitiencys(22, 1);
                rogue.setWeaponProfitiencys(26, 1);
                rogue.setWeaponProfitiencys(19, 1);
                for (int i = 0; i < 6; i++) {
                    rogue.setSavingThrows(i, rogue.itsStatisticsModifier(i));
                }
                rogue.setSavingThrowsProfitiency(1, 1);
                rogue.setSavingThrowsProfitiency(3, 1);
                rogue.setToolProfitiencys(36,1);

            } else if (choosenClass.equals("Wizard")) {
                for (int i = 0; i < 6; i++) {
                    wizard.setStatistics(i, staty[i]);
                }
                wizard.setLevel(1);
                wizard.setHitDice(wizard.itsLevel());
                wizard.setHitDice1(1);
                wizard.setHitDice2(6);
                wizard.setMaxHp(6 + wizard.itsStatisticsModifier(2));

                wizard.setWeaponProfitiencys(1, 1);
                wizard.setWeaponProfitiencys(12, 1);
                wizard.setWeaponProfitiencys(14, 1);
                wizard.setWeaponProfitiencys(7, 1);
                wizard.setWeaponProfitiencys(11, 1);

                for (int i = 0; i < 6; i++) {
                    wizard.setSavingThrows(i, wizard.itsStatisticsModifier(i));
                }
                wizard.setSavingThrowsProfitiency(3, 1);
                wizard.setSavingThrowsProfitiency(4, 1);

            } else if (choosenClass.equals("Sorcerer")) {
                for (int i = 0; i < 6; i++) {
                    sorcerer.setStatistics(i, staty[i]);
                }
                sorcerer.setLevel(1);
                sorcerer.setHitDice(sorcerer.itsLevel());
                sorcerer.setHitDice1(1);
                sorcerer.setHitDice2(6);
                sorcerer.setMaxHp(6 + sorcerer.itsStatisticsModifier(2));

                sorcerer.setWeaponProfitiencys(1, 1);
                sorcerer.setWeaponProfitiencys(12, 1);
                sorcerer.setWeaponProfitiencys(14, 1);
                sorcerer.setWeaponProfitiencys(7, 1);
                sorcerer.setWeaponProfitiencys(11, 1);
                for (int i = 0; i < 6; i++) {
                    sorcerer.setSavingThrows(i, sorcerer.itsStatisticsModifier(i));
                }
                sorcerer.setSavingThrowsProfitiency(2, 1);
                sorcerer.setSavingThrowsProfitiency(5, 1);

            } else if (choosenClass.equals("Warlock")) {
                for (int i = 0; i < 6; i++) {
                    warlock.setStatistics(i, staty[i]);
                }
                warlock.setLevel(1);
                warlock.setHitDice(warlock.itsLevel());
                warlock.setHitDice1(1);
                warlock.setHitDice2(8);
                warlock.setMaxHp(8 + warlock.itsStatisticsModifier(2));
                for (int i = 0; i < 3; i++) {
                    warlock.setArmorProfitiecys(i, 1);
                }

                for (int i = 0; i < 11; i++) {
                    warlock.setWeaponProfitiencys(i, 1);
                }
                for (int i = 0; i < 6; i++) {
                    warlock.setSavingThrows(i, warlock.itsStatisticsModifier(i));
                }
                warlock.setSavingThrowsProfitiency(4, 1);
                warlock.setSavingThrowsProfitiency(5, 1);

            }


            bundle.putString("klasa", choosenClass);
            bundle.putSerializable("barbarian", barbarian);
            intent.putExtra("bundle", bundle);
            startActivity(intent);

        }

    }


    public void onCHeckBoxClick(View view) {

        Spinner stat1 = (Spinner) findViewById(R.id.rolledStr);
        Spinner stat2 = (Spinner) findViewById(R.id.rolledDex);
        Spinner stat3 = (Spinner) findViewById(R.id.rolledCon);
        Spinner stat4 = (Spinner) findViewById(R.id.rolledInt);
        Spinner stat5 = (Spinner) findViewById(R.id.rolledWis);
        Spinner stat6 = (Spinner) findViewById(R.id.rolledCha);
        EditText editStr = (EditText) findViewById(R.id.editStr);
        EditText editDex = (EditText) findViewById(R.id.editDex);
        EditText editCon = (EditText) findViewById(R.id.editCon);
        EditText editInt = (EditText) findViewById(R.id.editInt);
        EditText editWis = (EditText) findViewById(R.id.editWis);
        EditText editCha = (EditText) findViewById(R.id.editCha);
        CheckBox checkBox = view.findViewById(R.id.checkBox);
        if(checkBox.isChecked()){
            //Toast toast = Toast.makeText(this,"selcted", Toast.LENGTH_SHORT);
            //toast.show();
            editStr.setEnabled(true);
            editDex.setEnabled(true);
            editCon.setEnabled(true);
            editInt.setEnabled(true);
            editWis.setEnabled(true);
            editCha.setEnabled(true);
            stat1.setEnabled(false);
            stat2.setEnabled(false);
            stat3.setEnabled(false);
            stat4.setEnabled(false);
            stat5.setEnabled(false);
            stat6.setEnabled(false);

        }
        else{
            Toast toast = Toast.makeText(this,"unselcted", Toast.LENGTH_SHORT);
            toast.show();
            editStr.setEnabled(false);
            editDex.setEnabled(false);
            editCon.setEnabled(false);
            editInt.setEnabled(false);
            editWis.setEnabled(false);
            editCha.setEnabled(false);
            stat1.setEnabled(true);
            stat2.setEnabled(true);
            stat3.setEnabled(true);
            stat4.setEnabled(true);
            stat5.setEnabled(true);
            stat6.setEnabled(true);
        }
    }

}
