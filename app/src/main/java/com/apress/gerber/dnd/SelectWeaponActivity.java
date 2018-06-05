package com.apress.gerber.dnd;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class SelectWeaponActivity extends AppCompatActivity {

    int whichOneIsIt;

    Bundle bundle;
    String klass;
    Barbarian barbarian;
    Bard bard;
    Cleric cleric ;
    Druid druid ;
    Fighter fighter;
    Monk monk ;
    Paladin paladin;
    Ranger ranger;
    Wizard wizard;
    Sorcerer sorcerer;
    Warlock warlock;
    Rogue rogue;

    CheckBox clubCB;
    CheckBox daggerCB;
    CheckBox GreatclubCB;
    CheckBox HandaxeCB;
    CheckBox JavelinCB;
    CheckBox LightHammerCB;
    CheckBox MaceCB;
    CheckBox QuarterStaffCB;
    CheckBox SickleCB;
    CheckBox SpearCB;
    CheckBox UnarmedCB ;
    CheckBox LightCrossbowCB;
    CheckBox DartCB;
    CheckBox ShortbowCB;
    CheckBox SlingCB;
    CheckBox BattleaxeCB;
    CheckBox FlailCB;
    CheckBox GlaiveCB;
    CheckBox GreataxeCB;
    CheckBox GreatswordCB;
    CheckBox HalberdCB;
    CheckBox LanceCB;
    CheckBox LongswordCB;
    CheckBox MaulCB;
    CheckBox MorningstarCB;
    CheckBox PikeCB;
    CheckBox RapierCB;
    CheckBox ScimitarCB;
    CheckBox ShortswordCB;
    CheckBox TridentCB;
    CheckBox WarPickCB ;
    CheckBox WarhammerCB;
    CheckBox WhipCB ;
    CheckBox BlowgunCB ;
    CheckBox HandCrossbowCB ;
    CheckBox HeavyCrossbowCB ;
    CheckBox LongbowCB ;
    CheckBox NetCB;


    CheckBox Daggerx2CB;
    CheckBox Clubx2CB;
    CheckBox Handaxex2CB;
    CheckBox LightHammex2CB ;
    CheckBox Sicklex2CB;
    CheckBox Scimitarx2CB ;
    CheckBox Shortswordx2CB;
    CheckBox HandCrossbowx2CB ;

    TextView TaskDescription;

    boolean DualChoosen = false;

    String Weapon1 [] = new String [25];


    void whichIsChoosen(){
        for(int i = 0; i<25; i++){
            Weapon1[i] = "";
        }
        if(clubCB.isChecked()==true){
            Weapon1[0] = "Club";
            Weapon1[1] = "Club";
            Weapon1[2] = "1";
            Weapon1[3] = "4";
            Weapon1[4] = "Bludgeoning";
            Weapon1[5] = "Light";
            Weapon1[13]= "0";
            Weapon1[14]= "0";
            Weapon1[15]= "0";
            Weapon1[16]= "0";
            Weapon1[24]= "0";

            if(Clubx2CB.isChecked() == true){
                DualChoosen = true;
            }
        }
        else if(daggerCB.isChecked() == true){
            Weapon1[0] = "Dagger";
            Weapon1[1] = "Dagger";
            Weapon1[2] = "1";
            Weapon1[3] = "4";
            Weapon1[4] = "Piercing";
            Weapon1[5] = "Finesse";
            Weapon1[6] = "Light";
            Weapon1[7] = "Thrown";
            Weapon1[13]= "0";
            Weapon1[14]= "0";
            Weapon1[15]= "20";
            Weapon1[16]= "60";
            Weapon1[24]= "1";
            if(Clubx2CB.isChecked() == true){
                DualChoosen = true;
            }
        }
        else if(GreatswordCB.isChecked() == true){
            Weapon1[0] = "Greatclub";
            Weapon1[1] = "Greatclub";
            Weapon1[2] = "1";
            Weapon1[3] = "8";
            Weapon1[4] = "Bludgeoning";
            Weapon1[5] = "Two-Handed";
            Weapon1[6] = "";
            Weapon1[7] = "";
            Weapon1[13]= "0";
            Weapon1[14]= "0";
            Weapon1[15]= "0";
            Weapon1[16]= "0";
            Weapon1[24]= "0";

        }
        else if(HandaxeCB.isChecked() == true){
            Weapon1[0] = "Handaxe";
            Weapon1[1] = "Handaxe";
            Weapon1[2] = "1";
            Weapon1[3] = "6";
            Weapon1[4] = "Slashing";
            Weapon1[5] = "Light";
            Weapon1[6] = "Thrown";
            Weapon1[7] = "";
            Weapon1[13]= "0";
            Weapon1[14]= "0";
            Weapon1[15]= "20";
            Weapon1[16]= "60";
            Weapon1[24]= "1";
            if(Handaxex2CB.isChecked()==true){
                DualChoosen = true;
            }
        }
        else if(JavelinCB.isChecked() == true){
            Weapon1[0] = "Javelin";
            Weapon1[1] = "Javelin";
            Weapon1[2] = "1";
            Weapon1[3] = "6";
            Weapon1[4] = "Piercing";
            Weapon1[5] = "Thrown";
            Weapon1[6] = "";
            Weapon1[7] = "";
            Weapon1[13]= "0";
            Weapon1[14]= "0";
            Weapon1[15]= "30";
            Weapon1[16]= "120";
            Weapon1[24]= "1";
        }
        else if(LightHammerCB.isChecked() == true){
            Weapon1[0] = "Lighthammer";
            Weapon1[1] = "Lighthammer";
            Weapon1[2] = "1";
            Weapon1[3] = "4";
            Weapon1[4] = "Bludgeoning";
            Weapon1[5] = "Light";
            Weapon1[6] = "Thrown";
            Weapon1[7] = "";
            Weapon1[13]= "0";
            Weapon1[14]= "0";
            Weapon1[15]= "20";
            Weapon1[16]= "60";
            Weapon1[24]= "1";
            if(LightHammex2CB.isChecked() == true){
                DualChoosen = true;
            }
        }
        else if(MaceCB.isChecked()){
            Weapon1[0] = "Mace";
            Weapon1[1] = "Mace";
            Weapon1[2] = "1";
            Weapon1[3] = "6";
            Weapon1[4] = "Bludgeoning";
            Weapon1[5] = "";
            Weapon1[6] = "";
            Weapon1[7] = "";
            Weapon1[13]= "0";
            Weapon1[14]= "0";
            Weapon1[15]= "0";
            Weapon1[16]= "0";
            Weapon1[24]= "0";
        }
        else if(QuarterStaffCB.isChecked()){
            Weapon1[0] = "Quarterstaff";
            Weapon1[1] = "Quarterstaff";
            Weapon1[2] = "1";
            Weapon1[3] = "6";
            Weapon1[4] = "Bludgeoning";
            Weapon1[5] = "Versatile";
            Weapon1[6] = "";
            Weapon1[7] = "";
            Weapon1[13]= "1";
            Weapon1[14]= "8";
            Weapon1[15]= "0";
            Weapon1[16]= "0";
            Weapon1[24]= "0";
        }
        else if(SickleCB.isChecked()){
            Weapon1[0] = "Sickle";
            Weapon1[1] = "Sickle";
            Weapon1[2] = "1";
            Weapon1[3] = "4";
            Weapon1[4] = "Slashing";
            Weapon1[5] = "Light";
            Weapon1[6] = "";
            Weapon1[7] = "";
            Weapon1[13]= "0";
            Weapon1[14]= "0";
            Weapon1[15]= "0";
            Weapon1[16]= "0";
            Weapon1[24]= "0";
            if(Sicklex2CB.isChecked()){
                DualChoosen = true;
            }
        }
        else if(SpearCB.isChecked()){
            Weapon1[0] = "Spear";
            Weapon1[1] = "Spear";
            Weapon1[2] = "1";
            Weapon1[3] = "6";
            Weapon1[4] = "Slashing";
            Weapon1[5] = "Thrown";
            Weapon1[6] = "";
            Weapon1[7] = "";
            Weapon1[13]= "0";
            Weapon1[14]= "0";
            Weapon1[15]= "20";
            Weapon1[16]= "60";
            Weapon1[24]= "1";
        }
        else if(LightCrossbowCB.isChecked()){
            Weapon1[0] = "Light Crossbow";
            Weapon1[1] = "Light Crossbow";
            Weapon1[2] = "1";
            Weapon1[3] = "8";
            Weapon1[4] = "Piercing";
            Weapon1[5] = "Ammunition";
            Weapon1[6] = "Two-Handed";
            Weapon1[7] = "";
            Weapon1[13]= "0";
            Weapon1[14]= "0";
            Weapon1[15]= "80";
            Weapon1[16]= "320";
            Weapon1[24]= "0";
        }
        else if(DartCB.isChecked()){
            Weapon1[0] = "Dart";
            Weapon1[1] = "Dart";
            Weapon1[2] = "1";
            Weapon1[3] = "4";
            Weapon1[4] = "Piercing";
            Weapon1[5] = "Finesse";
            Weapon1[6] = "Thrown";
            Weapon1[7] = "";
            Weapon1[13]= "0";
            Weapon1[14]= "0";
            Weapon1[15]= "20";
            Weapon1[16]= "60";
            Weapon1[24]= "1";
        }
        else if(ShortswordCB.isChecked()){
            Weapon1[0] = "Shortbow";
            Weapon1[1] = "Shortbow";
            Weapon1[2] = "1";
            Weapon1[3] = "6";
            Weapon1[4] = "Piercing";
            Weapon1[5] = "Ammunition";
            Weapon1[6] = "Two-Handed";
            Weapon1[7] = "";
            Weapon1[13]= "0";
            Weapon1[14]= "0";
            Weapon1[15]= "80";
            Weapon1[16]= "320";
            Weapon1[24]= "0";
        }
        else if(SlingCB.isChecked()){
            Weapon1[0] = "Sling";
            Weapon1[1] = "Sling";
            Weapon1[2] = "1";
            Weapon1[3] = "4";
            Weapon1[4] = "Bludgeoning";
            Weapon1[5] = "Ammunition";
            Weapon1[6] = "";
            Weapon1[7] = "";
            Weapon1[13]= "0";
            Weapon1[14]= "0";
            Weapon1[15]= "30";
            Weapon1[16]= "120";
            Weapon1[24]= "0";
        }
        else if(BattleaxeCB.isChecked()){
            Weapon1[0] = "Battleaxe";
            Weapon1[1] = "Battleaxe";
            Weapon1[2] = "1";
            Weapon1[3] = "8";
            Weapon1[4] = "Slashing";
            Weapon1[5] = "Versatile";
            Weapon1[6] = "";
            Weapon1[7] = "";
            Weapon1[13]= "1";
            Weapon1[14]= "10";
            Weapon1[15]= "0";
            Weapon1[16]= "0";
            Weapon1[24]= "0";
        }
        else if(FlailCB.isChecked()){
            Weapon1[0] = "Flail";
            Weapon1[1] = "Flail";
            Weapon1[2] = "1";
            Weapon1[3] = "8";
            Weapon1[4] = "Bludgeoning";
            Weapon1[5] = "";
            Weapon1[6] = "";
            Weapon1[7] = "";
            Weapon1[13]= "0";
            Weapon1[14]= "0";
            Weapon1[15]= "0";
            Weapon1[16]= "0";
            Weapon1[24]= "0";
        }
        else if(GlaiveCB.isChecked()){
            Weapon1[0] = "Glaive";
            Weapon1[1] = "Glaive";
            Weapon1[2] = "1";
            Weapon1[3] = "10";
            Weapon1[4] = "Slashing";
            Weapon1[5] = "Heavy";
            Weapon1[6] = "Reach";
            Weapon1[7] = "Two-Handed";
            Weapon1[13]= "0";
            Weapon1[14]= "0";
            Weapon1[15]= "0";
            Weapon1[16]= "0";
            Weapon1[24]= "0";
        }
        else if(GreatswordCB.isChecked()){
            Weapon1[0] = "Greataxe";
            Weapon1[1] = "Greataxe";
            Weapon1[2] = "1";
            Weapon1[3] = "12";
            Weapon1[4] = "Slashing";
            Weapon1[5] = "Heavy";
            Weapon1[6] = "Two-Handed";
            Weapon1[7] = "";
            Weapon1[13]= "0";
            Weapon1[14]= "0";
            Weapon1[15]= "0";
            Weapon1[16]= "0";
            Weapon1[24]= "0";
        }
        else if(GreatswordCB.isChecked()){
            Weapon1[0] = "Greatsword";
            Weapon1[1] = "Greatsword";
            Weapon1[2] = "1";
            Weapon1[3] = "6";
            Weapon1[4] = "Slashing";
            Weapon1[5] = "Heavy";
            Weapon1[6] = "Two-Handed";
            Weapon1[7] = "";
            Weapon1[13]= "0";
            Weapon1[14]= "0";
            Weapon1[15]= "0";
            Weapon1[16]= "0";
            Weapon1[24]= "0";
        }
        else if(HalberdCB.isChecked()){
            Weapon1[0] = "Halberd";
            Weapon1[1] = "Halberd";
            Weapon1[2] = "1";
            Weapon1[3] = "10";
            Weapon1[4] = "Slashing";
            Weapon1[5] = "Heavy";
            Weapon1[6] = "Reach";
            Weapon1[7] = "Two-Handed";
            Weapon1[13]= "0";
            Weapon1[14]= "0";
            Weapon1[15]= "0";
            Weapon1[16]= "0";
            Weapon1[24]= "0";
        }
        else if(LanceCB.isChecked()){
            Weapon1[0] = "Lance";
            Weapon1[1] = "Lance";
            Weapon1[2] = "1";
            Weapon1[3] = "12";
            Weapon1[4] = "Piercing";
            Weapon1[5] = "Reach";
            Weapon1[6] = "";
            Weapon1[7] = "";
            Weapon1[13]= "0";
            Weapon1[14]= "0";
            Weapon1[15]= "0";
            Weapon1[16]= "0";
            Weapon1[24]= "0";
        }
        else if(LongswordCB.isChecked()){
            Weapon1[0] = "Longsword";
            Weapon1[1] = "Longsword";
            Weapon1[2] = "1";
            Weapon1[3] = "8";
            Weapon1[4] = "Slashing";
            Weapon1[5] = "Versatile";
            Weapon1[6] = "";
            Weapon1[7] = "";
            Weapon1[13]= "1";
            Weapon1[14]= "10";
            Weapon1[15]= "0";
            Weapon1[16]= "0";
            Weapon1[24]= "0";
        }
        else if(MaulCB.isChecked()){
            Weapon1[0] = "Maul";
            Weapon1[1] = "Maul";
            Weapon1[2] = "2";
            Weapon1[3] = "6";
            Weapon1[4] = "Bludgeoning";
            Weapon1[5] = "Heavy";
            Weapon1[6] = "Two-Handed";
            Weapon1[7] = "";
            Weapon1[13]= "0";
            Weapon1[14]= "0";
            Weapon1[15]= "0";
            Weapon1[16]= "0";
            Weapon1[24]= "0";
        }
        else if(MorningstarCB.isChecked()){
            Weapon1[0] = "Morningstar";
            Weapon1[1] = "Morningstar";
            Weapon1[2] = "1";
            Weapon1[3] = "8";
            Weapon1[4] = "Piercing";
            Weapon1[5] = "";
            Weapon1[6] = "";
            Weapon1[7] = "";
            Weapon1[13]= "0";
            Weapon1[14]= "0";
            Weapon1[15]= "0";
            Weapon1[16]= "0";
            Weapon1[24]= "0";
        }
        else if(PikeCB.isChecked()){
            Weapon1[0] = "Pike";
            Weapon1[1] = "Pike";
            Weapon1[2] = "1";
            Weapon1[3] = "10";
            Weapon1[4] = "Piercing";
            Weapon1[5] = "Heavy";
            Weapon1[6] = "Reach";
            Weapon1[7] = "Two-Handed";
            Weapon1[13]= "0";
            Weapon1[14]= "0";
            Weapon1[15]= "0";
            Weapon1[16]= "0";
            Weapon1[24]= "0";
        }
        else if(RapierCB.isChecked()){
            Weapon1[0] = "Rapier";
            Weapon1[1] = "Rapier";
            Weapon1[2] = "1";
            Weapon1[3] = "8";
            Weapon1[4] = "Piercing";
            Weapon1[5] = "Finesse";
            Weapon1[6] = "";
            Weapon1[7] = "";
            Weapon1[13]= "0";
            Weapon1[14]= "0";
            Weapon1[15]= "0";
            Weapon1[16]= "0";
            Weapon1[24]= "0";
        }
        else if(ScimitarCB.isChecked()){
            Weapon1[0] = "Scimitar";
            Weapon1[1] = "Scimitar";
            Weapon1[2] = "1";
            Weapon1[3] = "6";
            Weapon1[4] = "Slashing";
            Weapon1[5] = "Finesse";
            Weapon1[6] = "Light";
            Weapon1[7] = "";
            Weapon1[13]= "0";
            Weapon1[14]= "0";
            Weapon1[15]= "0";
            Weapon1[16]= "0";
            Weapon1[24]= "0";
            if(Scimitarx2CB.isChecked()){
                DualChoosen = true;
            }
        }
        else if(ShortswordCB.isChecked()){
            Weapon1[0] = "Shortsword";
            Weapon1[1] = "Shortsword";
            Weapon1[2] = "1";
            Weapon1[3] = "6";
            Weapon1[4] = "Piercing";
            Weapon1[5] = "Finesse";
            Weapon1[6] = "Light";
            Weapon1[7] = "";
            Weapon1[13]= "0";
            Weapon1[14]= "0";
            Weapon1[15]= "0";
            Weapon1[16]= "0";
            Weapon1[24]= "0";
            if(Shortswordx2CB.isChecked()){
                DualChoosen = true;
            }
        }
        else if(TridentCB.isChecked()){
            Weapon1[0] = "Trident";
            Weapon1[1] = "Trindent";
            Weapon1[2] = "1";
            Weapon1[3] = "6";
            Weapon1[4] = "Piercing";
            Weapon1[5] = "Thrown";
            Weapon1[6] = "Versatile";
            Weapon1[7] = "";
            Weapon1[13]= "1";
            Weapon1[14]= "8";
            Weapon1[15]= "20";
            Weapon1[16]= "60";
            Weapon1[24]= "1";
        }
        else if(WarPickCB.isChecked()){
            Weapon1[0] = "Warpick";
            Weapon1[1] = "Warpick";
            Weapon1[2] = "1";
            Weapon1[3] = "8";
            Weapon1[4] = "Piercing";
            Weapon1[5] = "";
            Weapon1[6] = "";
            Weapon1[7] = "";
            Weapon1[13]= "0";
            Weapon1[14]= "0";
            Weapon1[15]= "0";
            Weapon1[16]= "0";
            Weapon1[24]= "0";
        }
        else if(WarhammerCB.isChecked()){
            Weapon1[0] = "Warhammer";
            Weapon1[1] = "Warhammer";
            Weapon1[2] = "1";
            Weapon1[3] = "8";
            Weapon1[4] = "Bludgeoning";
            Weapon1[5] = "Versatile";
            Weapon1[6] = "";
            Weapon1[7] = "";
            Weapon1[13]= "0";
            Weapon1[14]= "10";
            Weapon1[15]= "0";
            Weapon1[16]= "0";
            Weapon1[24]= "0";
        }
        else if(WhipCB.isChecked()){
            Weapon1[0] = "Whip";
            Weapon1[1] = "Whip";
            Weapon1[2] = "1";
            Weapon1[3] = "4";
            Weapon1[4] = "Finesse";
            Weapon1[5] = "Reach";
            Weapon1[6] = "";
            Weapon1[7] = "";
            Weapon1[13]= "0";
            Weapon1[14]= "0";
            Weapon1[15]= "0";
            Weapon1[16]= "0";
            Weapon1[24]= "0";
        }
        else if(BlowgunCB.isChecked()){
            Weapon1[0] = "Blowgun";
            Weapon1[1] = "Blowgun";
            Weapon1[2] = "1";
            Weapon1[3] = "1";
            Weapon1[4] = "Piercing";
            Weapon1[5] = "Ammunition";
            Weapon1[6] = "Loaded";
            Weapon1[7] = "";
            Weapon1[13]= "0";
            Weapon1[14]= "0";
            Weapon1[15]= "25";
            Weapon1[16]= "100";
            Weapon1[24]= "0";
        }
        else if(HandCrossbowCB.isChecked()){
            Weapon1[0] = "Hand Crossbow";
            Weapon1[1] = "Hand Crossbow";
            Weapon1[2] = "1";
            Weapon1[3] = "6";
            Weapon1[4] = "Piercing";
            Weapon1[5] = "Ammunition";
            Weapon1[6] = "Light";
            Weapon1[7] = "Loaded";
            Weapon1[13]= "0";
            Weapon1[14]= "0";
            Weapon1[15]= "30";
            Weapon1[16]= "120";
            Weapon1[24]= "0";
            if(HandCrossbowx2CB.isChecked()){
                DualChoosen = true;
            }
        }
        else if(HeavyCrossbowCB.isChecked()){
            Weapon1[0] = "Heavy Crossbow";
            Weapon1[1] = "Heavy Crossbow";
            Weapon1[2] = "1";
            Weapon1[3] = "10";
            Weapon1[4] = "Piercing";
            Weapon1[5] = "Ammunition";
            Weapon1[6] = "Two-Handed";
            Weapon1[7] = "Heavy";
            Weapon1[13]= "0";
            Weapon1[14]= "0";
            Weapon1[15]= "100";
            Weapon1[16]= "400";
            Weapon1[24]= "0";
        }
        else if(LongbowCB.isChecked()){
            Weapon1[0] = "Longbow";
            Weapon1[1] = "Longbow";
            Weapon1[2] = "1";
            Weapon1[3] = "8";
            Weapon1[4] = "Ammunition";
            Weapon1[5] = "Heavy";
            Weapon1[6] = "Two-Handed";
            Weapon1[7] = "";
            Weapon1[13]= "0";
            Weapon1[14]= "0";
            Weapon1[15]= "150";
            Weapon1[16]= "600";
            Weapon1[24]= "0";
        }
        else if(NetCB.isChecked()){
            Weapon1[0] = "Net";
            Weapon1[1] = "Net";
            Weapon1[2] = "0";
            Weapon1[3] = "0";
            Weapon1[4] = "";
            Weapon1[5] = "Special";
            Weapon1[6] = "Thrown";
            Weapon1[7] = "";
            Weapon1[13]= "0";
            Weapon1[14]= "0";
            Weapon1[15]= "5";
            Weapon1[16]= "15";
            Weapon1[24]= "0";
        }


    }


    void uncheckAll(){
        /**simple**/
        clubCB.setChecked(false);
        daggerCB.setChecked(false);
        GreataxeCB.setChecked(false);
        HandaxeCB.setChecked(false);
        JavelinCB.setChecked(false);
        LightHammerCB.setChecked(false);
        GreatclubCB.setChecked(false);
        MaceCB.setChecked(false);
        QuarterStaffCB.setChecked(false);
        SickleCB.setChecked(false);
        SpearCB.setChecked(false);
        UnarmedCB.setChecked(false);
        /**Simple Ranged**/
        LightCrossbowCB.setChecked(false);
        DartCB.setChecked(false);
        ShortbowCB.setChecked(false);
        SlingCB.setChecked(false);
        /**Martial**/
        BattleaxeCB.setChecked(false);
        FlailCB.setChecked(false);
        GlaiveCB.setChecked(false);
        GreatswordCB.setChecked(false);
        HalberdCB.setChecked(false);
        LanceCB.setChecked(false);
        LongswordCB.setChecked(false);
        MaulCB.setChecked(false);
        MorningstarCB.setChecked(false);
        PikeCB.setChecked(false);
        RapierCB.setChecked(false);
        ScimitarCB.setChecked(false);
        ShortswordCB.setChecked(false);
        TridentCB.setChecked(false);
        WarPickCB.setChecked(false);
        WarhammerCB.setChecked(false);
        WhipCB.setChecked(false);
        /**Martial Ranged**/
        BlowgunCB.setChecked(false);
        HandCrossbowCB.setChecked(false);
        HeavyCrossbowCB.setChecked(false);
        LongbowCB.setChecked(false);
        NetCB.setChecked(false);



        Daggerx2CB.setChecked(false);
        Clubx2CB.setChecked(false);
        Handaxex2CB.setChecked(false);
        LightHammex2CB.setChecked(false);
        Sicklex2CB.setChecked(false);
        Scimitarx2CB.setChecked(false);
        Shortswordx2CB.setChecked(false);
        HandCrossbowx2CB.setChecked(false);
    }

    void disablell(){
        clubCB.setEnabled(false);
        daggerCB.setEnabled(false);
        GreataxeCB.setEnabled(false);
        HandaxeCB.setEnabled(false);
        JavelinCB.setEnabled(false);
        LightHammerCB.setEnabled(false);
        GreatclubCB.setEnabled(false);
        MaceCB.setEnabled(false);
        QuarterStaffCB.setEnabled(false);
        SickleCB.setEnabled(false);
        SpearCB.setEnabled(false);
        UnarmedCB.setEnabled(false);
        /**Simple Ranged**/
        LightCrossbowCB.setEnabled(false);
        DartCB.setEnabled(false);
        ShortbowCB.setEnabled(false);
        SlingCB.setEnabled(false);
        /**Martial**/
        BattleaxeCB.setEnabled(false);
        FlailCB.setEnabled(false);
        GlaiveCB.setEnabled(false);
        GreatswordCB.setEnabled(false);
        HalberdCB.setEnabled(false);
        LanceCB.setEnabled(false);
        LongswordCB.setEnabled(false);
        MaulCB.setEnabled(false);
        MorningstarCB.setEnabled(false);
        PikeCB.setEnabled(false);
        RapierCB.setEnabled(false);
        ScimitarCB.setEnabled(false);
        ShortswordCB.setEnabled(false);
        TridentCB.setEnabled(false);
        WarPickCB.setEnabled(false);
        WarhammerCB.setEnabled(false);
        WhipCB.setEnabled(false);
        /**Martial Ranged**/
        BlowgunCB.setEnabled(false);
        HandCrossbowCB.setEnabled(false);
        HeavyCrossbowCB.setEnabled(false);
        LongbowCB.setEnabled(false);
        NetCB.setEnabled(false);



        Daggerx2CB.setEnabled(false);
        Clubx2CB.setEnabled(false);
        Handaxex2CB.setEnabled(false);
        LightHammex2CB.setEnabled(false);
        Sicklex2CB.setEnabled(false);
        Scimitarx2CB.setEnabled(false);
        Shortswordx2CB.setEnabled(false);
        HandCrossbowx2CB.setEnabled(false);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_weapon);

        whichOneIsIt = 1;

         bundle = getIntent().getBundleExtra("bundle");
         klass = bundle.getString("klasa");

         barbarian = (Barbarian) bundle.getSerializable("barbarian");
         bard = (Bard) bundle.getSerializable("bard");
         cleric = (Cleric) bundle.getSerializable("cleric");
         druid = (Druid) bundle.getSerializable("druid");
         fighter = (Fighter) bundle.getSerializable("fighter");
         monk = (Monk) bundle.getSerializable("monk");
         paladin = (Paladin) bundle.getSerializable("paladin");
         ranger = (Ranger) bundle.getSerializable("ranger");
         wizard = (Wizard) bundle.getSerializable("wizard");
         sorcerer = (Sorcerer) bundle.getSerializable("sorcerer");
         warlock = (Warlock) bundle.getSerializable("warlock");
         rogue = (Rogue) bundle.getSerializable("rogue");

         TaskDescription = findViewById(R.id.taskDescription);

         clubCB = (CheckBox) findViewById(R.id.weaponName1);
         daggerCB = (CheckBox) findViewById(R.id.weaponName2);
         GreatclubCB = (CheckBox) findViewById(R.id.weaponName3);
         HandaxeCB = findViewById(R.id.weaponName4);
         JavelinCB = (CheckBox) findViewById(R.id.weaponName5);
         LightHammerCB = (CheckBox) findViewById(R.id.weaponName6);
         MaceCB = (CheckBox) findViewById(R.id.weaponName7);
         QuarterStaffCB = (CheckBox) findViewById(R.id.weaponName8);
         SickleCB = (CheckBox) findViewById(R.id.weaponName9);
         SpearCB = (CheckBox) findViewById(R.id.weaponName10);
         UnarmedCB = (CheckBox) findViewById(R.id.weaponName11);
         LightCrossbowCB = (CheckBox) findViewById(R.id.weaponNameB1);
         DartCB = (CheckBox) findViewById(R.id.weaponNameB2);
         ShortbowCB = (CheckBox) findViewById(R.id.weaponNameB3);
         SlingCB = (CheckBox) findViewById(R.id.weaponNameB4);
         BattleaxeCB = (CheckBox) findViewById(R.id.weaponNameC1);
         FlailCB = (CheckBox) findViewById(R.id.weaponNameC2);
         GlaiveCB = (CheckBox) findViewById(R.id.weaponNameC3);
         GreataxeCB = (CheckBox) findViewById(R.id.weaponNameC4);
         GreatswordCB = (CheckBox) findViewById(R.id.weaponNameC5);
         HalberdCB = (CheckBox) findViewById(R.id.weaponNameC6);
         LanceCB = (CheckBox) findViewById(R.id.weaponNameC7);
         LongswordCB = (CheckBox) findViewById(R.id.weaponNameC8);
         MaulCB = (CheckBox) findViewById(R.id.weaponNameC9);
         MorningstarCB = (CheckBox) findViewById(R.id.weaponNameC10);
         PikeCB = (CheckBox) findViewById(R.id.weaponNameC11);
         RapierCB = (CheckBox) findViewById(R.id.weaponNameC12);
         ScimitarCB = (CheckBox) findViewById(R.id.weaponNameC13);
         ShortswordCB = (CheckBox) findViewById(R.id.weaponNameC14);
         TridentCB = (CheckBox) findViewById(R.id.weaponNameC15);
         WarPickCB = (CheckBox) findViewById(R.id.weaponNameC16);
         WarhammerCB = (CheckBox) findViewById(R.id.weaponNameC17);
         WhipCB = (CheckBox) findViewById(R.id.weaponNameC18);
         BlowgunCB = (CheckBox) findViewById(R.id.weaponNameD1);
         HandCrossbowCB = (CheckBox) findViewById(R.id.weaponNameD2);
         HeavyCrossbowCB = (CheckBox) findViewById(R.id.weaponNameD3);
         LongbowCB = (CheckBox) findViewById(R.id.weaponNameD4);
         NetCB = (CheckBox) findViewById(R.id.weaponNameD5);


         Daggerx2CB = (CheckBox) findViewById(R.id.daggerX2);
         Clubx2CB = (CheckBox) findViewById(R.id.clubx2);
         Handaxex2CB = (CheckBox) findViewById(R.id.handaxeX2);
         LightHammex2CB = (CheckBox) findViewById(R.id.lightHammerX2);
         Sicklex2CB = (CheckBox) findViewById(R.id.sickleX2);

         Scimitarx2CB = (CheckBox) findViewById(R.id.scimitarX2);
         Shortswordx2CB = (CheckBox) findViewById(R.id.shortSwordX2);
         HandCrossbowx2CB = (CheckBox) findViewById(R.id.handCrossbowx2);

        if(klass.equals("Barbarian")){
            GreataxeCB.setEnabled(true);
            /**Martial**/
            BattleaxeCB.setEnabled(true);
            FlailCB.setEnabled(true);
            GlaiveCB.setEnabled(true);
            GreatswordCB.setEnabled(true);
            HalberdCB.setEnabled(true);
            LanceCB.setEnabled(true);
            LongswordCB.setEnabled(true);
            MaulCB.setEnabled(true);
            MorningstarCB.setEnabled(true);
            PikeCB.setEnabled(true);
            RapierCB.setEnabled(true);
            ScimitarCB.setEnabled(true);
            ShortswordCB.setEnabled(true);
            TridentCB.setEnabled(true);
            WarPickCB.setEnabled(true);
            WarhammerCB.setEnabled(true);
            WhipCB.setEnabled(true);
            /**Martial Ranged**/
            BlowgunCB.setEnabled(true);
            HandCrossbowCB.setEnabled(true);
            HeavyCrossbowCB.setEnabled(true);
            LongbowCB.setEnabled(true);
            NetCB.setEnabled(true);

            TaskDescription.setText("Choose Greataxe or any Martial Weapon.");
        }
        else if(klass.equals("Bard")){
            RapierCB.setEnabled(true);
            ShortswordCB.setEnabled(true);
            /**siumple**/
            clubCB.setEnabled(true);
            daggerCB.setEnabled(true);
            GreataxeCB.setEnabled(true);
            HandaxeCB.setEnabled(true);
            JavelinCB.setEnabled(true);
            LightHammerCB.setEnabled(true);
            GreatclubCB.setEnabled(true);
            MaceCB.setEnabled(true);
            QuarterStaffCB.setEnabled(true);
            SickleCB.setEnabled(true);
            SpearCB.setEnabled(true);
            UnarmedCB.setEnabled(true);
            LightCrossbowCB.setEnabled(true);
            DartCB.setEnabled(true);
            ShortbowCB.setEnabled(true);
            SlingCB.setEnabled(true);

            TaskDescription.setText("Choose Rapier, Shortsword or any Simple Weapon");
        }
        else if(klass.equals("Cleric")){
            MaceCB.setEnabled(true);
            WarhammerCB.setEnabled(true);
            TaskDescription.setText("Choose Mace or Warhammer");
        }
        else if(klass.equals("Druid")){
            /**siumple**/
            clubCB.setEnabled(true);
            daggerCB.setEnabled(true);
            GreataxeCB.setEnabled(true);
            HandaxeCB.setEnabled(true);
            JavelinCB.setEnabled(true);
            LightHammerCB.setEnabled(true);
            GreatclubCB.setEnabled(true);
            MaceCB.setEnabled(true);
            QuarterStaffCB.setEnabled(true);
            SickleCB.setEnabled(true);
            SpearCB.setEnabled(true);
            UnarmedCB.setEnabled(true);
            LightCrossbowCB.setEnabled(true);
            DartCB.setEnabled(true);
            ShortbowCB.setEnabled(true);
            SlingCB.setEnabled(true);
            TaskDescription.setText("Choose Club, Dagger, Dart, Javelin, Mace, Quarterstaff, Scimitar, Sickle, Sling or Spear");
        }
        else if(klass.equals("Fighter")){
            BattleaxeCB.setEnabled(true);
            FlailCB.setEnabled(true);
            GlaiveCB.setEnabled(true);
            GreatswordCB.setEnabled(true);
            HalberdCB.setEnabled(true);
            LanceCB.setEnabled(true);
            LongswordCB.setEnabled(true);
            MaulCB.setEnabled(true);
            MorningstarCB.setEnabled(true);
            PikeCB.setEnabled(true);
            RapierCB.setEnabled(true);
            ScimitarCB.setEnabled(true);
            ShortswordCB.setEnabled(true);
            TridentCB.setEnabled(true);
            WarPickCB.setEnabled(true);
            WarhammerCB.setEnabled(true);
            WhipCB.setEnabled(true);
            /**Martial Ranged**/
            BlowgunCB.setEnabled(true);
            HandCrossbowCB.setEnabled(true);
            HeavyCrossbowCB.setEnabled(true);
            LongbowCB.setEnabled(true);
            NetCB.setEnabled(true);

            Scimitarx2CB.setEnabled(true);
            Shortswordx2CB.setEnabled(true);
            HandCrossbowx2CB.setEnabled(true);

            TaskDescription.setText("Choose Martial Weapon. If you choose one Martial Weapon you will additionaly get a Shield. You can also choose 2xMartial Weapon.");

        }
        else if(klass.equals("Monk")){
            clubCB.setEnabled(true);
            daggerCB.setEnabled(true);
            GreataxeCB.setEnabled(true);
            HandaxeCB.setEnabled(true);
            JavelinCB.setEnabled(true);
            LightHammerCB.setEnabled(true);
            GreatclubCB.setEnabled(true);
            MaceCB.setEnabled(true);
            QuarterStaffCB.setEnabled(true);
            SickleCB.setEnabled(true);
            SpearCB.setEnabled(true);
            UnarmedCB.setEnabled(true);
            LightCrossbowCB.setEnabled(true);
            DartCB.setEnabled(true);
            ShortbowCB.setEnabled(true);
            SlingCB.setEnabled(true);
            TaskDescription.setText("Choose Shortsword or any Simple Weapon");
        }
        else if(klass.equals("Paladin")){
            BattleaxeCB.setEnabled(true);
            FlailCB.setEnabled(true);
            GlaiveCB.setEnabled(true);
            GreatswordCB.setEnabled(true);
            HalberdCB.setEnabled(true);
            LanceCB.setEnabled(true);
            LongswordCB.setEnabled(true);
            MaulCB.setEnabled(true);
            MorningstarCB.setEnabled(true);
            PikeCB.setEnabled(true);
            RapierCB.setEnabled(true);
            ScimitarCB.setEnabled(true);
            ShortswordCB.setEnabled(true);
            TridentCB.setEnabled(true);
            WarPickCB.setEnabled(true);
            WarhammerCB.setEnabled(true);
            WhipCB.setEnabled(true);
            /**Martial Ranged**/
            BlowgunCB.setEnabled(true);
            HandCrossbowCB.setEnabled(true);
            HeavyCrossbowCB.setEnabled(true);
            LongbowCB.setEnabled(true);
            NetCB.setEnabled(true);

            Scimitarx2CB.setEnabled(true);
            Shortswordx2CB.setEnabled(true);
            HandCrossbowx2CB.setEnabled(true);
            TaskDescription.setText("Choos Martial Weapon. If you choose only one Martial Weapon you will additionaly get a Shield. You can also choose 2xMartial Weapon.");
        }
        else if(klass.equals("Ranger")){
            clubCB.setEnabled(true);
            daggerCB.setEnabled(true);
            GreataxeCB.setEnabled(true);
            HandaxeCB.setEnabled(true);
            JavelinCB.setEnabled(true);
            LightHammerCB.setEnabled(true);
            GreatclubCB.setEnabled(true);
            MaceCB.setEnabled(true);
            QuarterStaffCB.setEnabled(true);
            SickleCB.setEnabled(true);
            SpearCB.setEnabled(true);
            UnarmedCB.setEnabled(true);

            Daggerx2CB.setEnabled(true);
            Clubx2CB.setEnabled(true);
            Handaxex2CB.setEnabled(true);
            LightHammex2CB.setEnabled(true);
            Sicklex2CB.setEnabled(true);

            ShortswordCB.setEnabled(true);
            Shortswordx2CB.setEnabled(true);
            TaskDescription.setText("Choose 2xShort Swords or 2x any Simple Weapon");
        }
        else if(klass.equals("Rogue")){
            RapierCB.setEnabled(true);
            ShortswordCB.setEnabled(true);
            TaskDescription.setText("Choose Rapier or Shortsword");
        }
        else if(klass.equals("Sorcerer")){
            clubCB.setEnabled(true);
            daggerCB.setEnabled(true);
            GreataxeCB.setEnabled(true);
            HandaxeCB.setEnabled(true);
            JavelinCB.setEnabled(true);
            LightHammerCB.setEnabled(true);
            GreatclubCB.setEnabled(true);
            MaceCB.setEnabled(true);
            QuarterStaffCB.setEnabled(true);
            SickleCB.setEnabled(true);
            SpearCB.setEnabled(true);
            UnarmedCB.setEnabled(true);
            LightCrossbowCB.setEnabled(true);
            DartCB.setEnabled(true);
            ShortbowCB.setEnabled(true);
            SlingCB.setEnabled(true);

            LightCrossbowCB.setEnabled(true);
            TaskDescription.setText("Choose Light Crossbow and 20 bolts or any Simple Weapon");
        }
        else if(klass.equals("Wizard")){
            QuarterStaffCB.setEnabled(true);
            daggerCB.setEnabled(true);
            TaskDescription.setText("Choose Quarterstaff or Dagger");
        }
        else if(klass.equals("Warlock")){
            clubCB.setEnabled(true);
            daggerCB.setEnabled(true);
            GreataxeCB.setEnabled(true);
            HandaxeCB.setEnabled(true);
            JavelinCB.setEnabled(true);
            LightHammerCB.setEnabled(true);
            GreatclubCB.setEnabled(true);
            MaceCB.setEnabled(true);
            QuarterStaffCB.setEnabled(true);
            SickleCB.setEnabled(true);
            SpearCB.setEnabled(true);
            UnarmedCB.setEnabled(true);
            LightCrossbowCB.setEnabled(true);
            DartCB.setEnabled(true);
            ShortbowCB.setEnabled(true);
            SlingCB.setEnabled(true);

            LightCrossbowCB.setEnabled(true);
            TaskDescription.setText("Choose Light Crossbow and 20 bolts or any Simple Weapon");
        }



    }

    public void selectWeaponButton(View view) {

        whichOneIsIt = 1;
        int freeSlot = 0;

        int howManyChecked = 0;
        if(clubCB.isChecked() == true){howManyChecked++;}
        if(daggerCB.isChecked() == true){howManyChecked++;}
        if(GreataxeCB.isChecked() == true){howManyChecked++;}
        if(HandaxeCB.isChecked() == true){howManyChecked++;}
        if(JavelinCB.isChecked() == true){howManyChecked++;}
        if(LightHammerCB.isChecked() == true){howManyChecked++;}
        if(GreatclubCB.isChecked() == true){howManyChecked++;}
        if(MaceCB.isChecked() == true){howManyChecked++;}
        if(QuarterStaffCB.isChecked() == true){howManyChecked++;}
        if(SickleCB.isChecked() == true){howManyChecked++;}
        if(SpearCB.isChecked() == true){howManyChecked++;}
        if(UnarmedCB.isChecked() == true){howManyChecked++;}


        /**Simple Ranged**/

        if(LightCrossbowCB.isChecked() == true){howManyChecked++;}
        if(DartCB.isChecked() == true){howManyChecked++;}
        if(ShortbowCB.isChecked() == true){howManyChecked++;}
        if(SlingCB.isChecked() == true){howManyChecked++;}
        /**Martial**/

        if(BattleaxeCB.isChecked() == true){howManyChecked++;}
        if(FlailCB.isChecked() == true){howManyChecked++;}
        if(GlaiveCB.isChecked() == true){howManyChecked++;}
        if(GreatswordCB.isChecked() == true){howManyChecked++;}
        if(HalberdCB.isChecked() == true){howManyChecked++;}
        if(LanceCB.isChecked() == true){howManyChecked++;}
        if(LongswordCB.isChecked() == true){howManyChecked++;}
        if(MaulCB.isChecked() == true){howManyChecked++;}
        if(MorningstarCB.isChecked() == true){howManyChecked++;}
        if(PikeCB.isChecked() == true){howManyChecked++;}
        if(RapierCB.isChecked() == true){howManyChecked++;}
        if(ScimitarCB.isChecked() == true){howManyChecked++;}
        if(ShortswordCB.isChecked() == true){howManyChecked++;}
        if(TridentCB.isChecked() == true){howManyChecked++;}
        if(WarPickCB.isChecked() == true){howManyChecked++;}
        if(WarhammerCB.isChecked() == true){howManyChecked++;}
        if(WhipCB.isChecked() == true){howManyChecked++;}
        /**Martial Ranged**/

        if(BlowgunCB.isChecked() == true){howManyChecked++;}
        if(HandCrossbowCB.isChecked() == true){howManyChecked++;}
        if(HeavyCrossbowCB.isChecked() == true){howManyChecked++;}
        if(LongbowCB.isChecked() == true){howManyChecked++;}
        if(NetCB.isChecked() == true){howManyChecked++;}


        if(howManyChecked == 0)
        {
            if(Daggerx2CB.isChecked() == true){howManyChecked++;}
            if(Clubx2CB.isChecked() == true){howManyChecked++;}
            if(Handaxex2CB.isChecked() == true){howManyChecked++;}
            if(LightHammex2CB.isChecked() == true){howManyChecked++;}
            if(Sicklex2CB.isChecked() == true){howManyChecked++;}
            if(Scimitarx2CB.isChecked() == true){howManyChecked++;}
            if(Shortswordx2CB.isChecked() == true){howManyChecked++;}
            if(HandCrossbowx2CB.isChecked() == true){howManyChecked++;}
        }
        else if(howManyChecked > 1){
            Toast toast = Toast.makeText(this, "Please Select only one weapon",Toast.LENGTH_SHORT);
            toast.show();
            uncheckAll();
        }
        else{
            whichIsChoosen();
            if(klass.equals("Barbarian")){
                freeSlot = barbarian.findFreeWeaponInventorySlot();
                for(int i = 0; i<25; i++){
                    barbarian.setWeaponsInventory(freeSlot,i,Weapon1[i]);
                }
                if(DualChoosen == true){
                    freeSlot = barbarian.findFreeWeaponInventorySlot();
                    for(int i = 0; i<25; i++){
                        barbarian.setWeaponsInventory(freeSlot,i,Weapon1[i]);
                    }
                }
            }
            else if(klass.equals("Bard")){
                freeSlot = bard.findFreeWeaponInventorySlot();
                for(int i = 0; i<25; i++){
                    bard.setWeaponsInventory(freeSlot,i,Weapon1[i]);
                }
                if(DualChoosen == true){
                    freeSlot = bard.findFreeWeaponInventorySlot();
                    for(int i = 0; i<25; i++){
                        bard.setWeaponsInventory(freeSlot,i,Weapon1[i]);
                    }
                }
            }
            else if(klass.equals("Cleric")){
                freeSlot = cleric.findFreeWeaponInventorySlot();
                for(int i = 0; i<25; i++){
                    cleric.setWeaponsInventory(freeSlot,i,Weapon1[i]);
                }
                if(DualChoosen == true){
                    freeSlot = cleric.findFreeWeaponInventorySlot();
                    for(int i = 0; i<25; i++){
                        cleric.setWeaponsInventory(freeSlot,i,Weapon1[i]);
                    }
                }
            }
            else if(klass.equals("Druid")){
                freeSlot = druid.findFreeWeaponInventorySlot();
                for(int i = 0; i<25; i++){
                    druid.setWeaponsInventory(freeSlot,i,Weapon1[i]);
                }
                if(DualChoosen == true){
                    freeSlot = druid.findFreeWeaponInventorySlot();
                    for(int i = 0; i<25; i++){
                        druid.setWeaponsInventory(freeSlot,i,Weapon1[i]);
                    }
                }
            }
            else if(klass.equals("Fighter")){
                freeSlot = fighter.findFreeWeaponInventorySlot();
                for(int i = 0; i<25; i++){
                    fighter.setWeaponsInventory(freeSlot,i,Weapon1[i]);
                }
                if(DualChoosen == true){
                    freeSlot = fighter.findFreeWeaponInventorySlot();
                    for(int i = 0; i<25; i++){
                        fighter.setWeaponsInventory(freeSlot,i,Weapon1[i]);
                    }
                }
            }
            else if(klass.equals("Monk")){
                freeSlot = monk.findFreeWeaponInventorySlot();
                for(int i = 0; i<25; i++){
                    monk.setWeaponsInventory(freeSlot,i,Weapon1[i]);
                }
                if(DualChoosen == true){
                    freeSlot = monk.findFreeWeaponInventorySlot();
                    for(int i = 0; i<25; i++){
                        monk.setWeaponsInventory(freeSlot,i,Weapon1[i]);
                    }
                }
            }
            else if(klass.equals("Paladin")){
                freeSlot = paladin.findFreeWeaponInventorySlot();
                for(int i = 0; i<25; i++){
                    paladin.setWeaponsInventory(freeSlot,i,Weapon1[i]);
                }
                if(DualChoosen == true){
                    freeSlot = paladin.findFreeWeaponInventorySlot();
                    for(int i = 0; i<25; i++){
                        paladin.setWeaponsInventory(freeSlot,i,Weapon1[i]);
                    }
                }
            }
            else if(klass.equals("Ranger")){
                freeSlot = ranger.findFreeWeaponInventorySlot();
                for(int i = 0; i<25; i++){
                    ranger.setWeaponsInventory(freeSlot,i,Weapon1[i]);
                }
                if(DualChoosen == true){
                    freeSlot = ranger.findFreeWeaponInventorySlot();
                    for(int i = 0; i<25; i++){
                        ranger.setWeaponsInventory(freeSlot,i,Weapon1[i]);
                    }
                }
            }
            else if(klass.equals("Rogue")){
                freeSlot = rogue.findFreeWeaponInventorySlot();
                for(int i = 0; i<25; i++){
                    rogue.setWeaponsInventory(freeSlot,i,Weapon1[i]);
                }
                if(DualChoosen == true){
                    freeSlot = rogue.findFreeWeaponInventorySlot();
                    for(int i = 0; i<25; i++){
                        rogue.setWeaponsInventory(freeSlot,i,Weapon1[i]);
                    }
                }
            }
            else if(klass.equals("Sorcerer")){
                freeSlot = sorcerer.findFreeWeaponInventorySlot();
                for(int i = 0; i<25; i++){
                    sorcerer.setWeaponsInventory(freeSlot,i,Weapon1[i]);
                }
                if(DualChoosen == true){
                    freeSlot = sorcerer.findFreeWeaponInventorySlot();
                    for(int i = 0; i<25; i++){
                        sorcerer.setWeaponsInventory(freeSlot,i,Weapon1[i]);
                    }
                }
            }
            else if(klass.equals("Wizard")){
                freeSlot = wizard.findFreeWeaponInventorySlot();
                for(int i = 0; i<25; i++){
                    wizard.setWeaponsInventory(freeSlot,i,Weapon1[i]);
                }
                if(DualChoosen == true){
                    freeSlot = wizard.findFreeWeaponInventorySlot();
                    for(int i = 0; i<25; i++){
                        wizard.setWeaponsInventory(freeSlot,i,Weapon1[i]);
                    }
                }
            }
            else if(klass.equals("Warlock")){
                freeSlot = warlock.findFreeWeaponInventorySlot();
                for(int i = 0; i<25; i++){
                    warlock.setWeaponsInventory(freeSlot,i,Weapon1[i]);
                }
                if(DualChoosen == true){
                    freeSlot = warlock.findFreeWeaponInventorySlot();
                    for(int i = 0; i<25; i++){
                        warlock.setWeaponsInventory(freeSlot,i,Weapon1[i]);
                    }
                }
            }

            if(klass.equals("Bard") || klass.equals("Monk") || klass.equals("Ranger") || klass.equals("Sorcerer") || klass.equals("Wizard") || klass.equals("Warlock")){
                //Intent implementation here
            }
            else if(whichOneIsIt == 1){
                uncheckAll();
                disablell();
                Toast toast = Toast.makeText(this, "Great. Your weapon has been added to your inventory. Check in description on top of this window if you can choose more weapons.", Toast.LENGTH_LONG);
                toast.show();
                if(klass.equals("Barbarian")){
                    /**siumple**/
                    clubCB.setEnabled(true);
                    daggerCB.setEnabled(true);
                    GreataxeCB.setEnabled(true);
                    HandaxeCB.setEnabled(true);
                    JavelinCB.setEnabled(true);
                    LightHammerCB.setEnabled(true);
                    GreatclubCB.setEnabled(true);
                    MaceCB.setEnabled(true);
                    QuarterStaffCB.setEnabled(true);
                    SickleCB.setEnabled(true);
                    SpearCB.setEnabled(true);
                    UnarmedCB.setEnabled(true);
                    LightCrossbowCB.setEnabled(true);
                    DartCB.setEnabled(true);
                    ShortbowCB.setEnabled(true);
                    SlingCB.setEnabled(true);
                    TaskDescription.setText("Choose 2xHandaxe or any Simple Weapon");
                }
                else if(klass.equals("Cleric")){
                    clubCB.setEnabled(true);
                    daggerCB.setEnabled(true);
                    GreataxeCB.setEnabled(true);
                    HandaxeCB.setEnabled(true);
                    JavelinCB.setEnabled(true);
                    LightHammerCB.setEnabled(true);
                    GreatclubCB.setEnabled(true);
                    MaceCB.setEnabled(true);
                    QuarterStaffCB.setEnabled(true);
                    SickleCB.setEnabled(true);
                    SpearCB.setEnabled(true);
                    UnarmedCB.setEnabled(true);
                    LightCrossbowCB.setEnabled(true);
                    DartCB.setEnabled(true);
                    ShortbowCB.setEnabled(true);
                    SlingCB.setEnabled(true);
                    LightCrossbowCB.setEnabled(true);
                    TaskDescription.setText("Choose Light Crossbow(20 bolts) or any Simple Weapon");
                }
                else if(klass.equals("Druid")){
                    ScimitarCB.setEnabled(true);
                    clubCB.setEnabled(true);
                    daggerCB.setEnabled(true);
                    GreataxeCB.setEnabled(true);
                    HandaxeCB.setEnabled(true);
                    JavelinCB.setEnabled(true);
                    LightHammerCB.setEnabled(true);
                    GreatclubCB.setEnabled(true);
                    MaceCB.setEnabled(true);
                    QuarterStaffCB.setEnabled(true);
                    SickleCB.setEnabled(true);
                    SpearCB.setEnabled(true);
                    UnarmedCB.setEnabled(true);
                    TaskDescription.setText("Choose a Scimitar or any Simple Melee Weapon");
                }
                else if(klass.equals("Fighter")){
                    LightCrossbowCB.setEnabled(true);
                    Handaxex2CB.setEnabled(true);
                    HandaxeCB.setEnabled(true);
                    TaskDescription.setText("Choose Light Crossbow(20 bolts) or 2x Handaxe");
                }
                else if(klass.equals("Paladin")){

                }

            }
        }

    }
}
