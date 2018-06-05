package com.apress.gerber.dnd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;

public class DragonbornActivity extends AppCompatActivity {
    //Variables for Sweeper
    private ScrollView myLayout = null;
    private float x1;
    private float x2;
    private boolean beeingUsed = true;
    //end of SweepVariables
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dragonborn);

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
                    Intent newIntent = new Intent(getApplicationContext(), HumanActivity.class);
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
                    Intent newIntent = new Intent(getApplicationContext(), GnomeActivity.class);
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

    public void DragonbornonSelectButton(View view) {
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
            barbarian.setRace("Dragonborn");
            barbarian.setStatistics(0, barbarian.itsStatistics(0) + 2);
            barbarian.setStatistics(5, barbarian.itsStatistics(5) + 1);
            barbarian.setSpeed(30);
            barbarian.setExplorationTraits("");
            barbarian.setExplorationTraits("");
            barbarian.setExplorationTraits("<b>BREATH WEAPON:</b> You can use your action to exhale destructive energy. Your draconic ancestry determines the size, shape, and damage type of the exhalation. When you use your breath weapon, each creature in the area of the exhalation must make a saving throw, the type of which is determined by your draconic ancestry. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest.");
            barbarian.setCombatTraits("<b>DRACONIC ANCESTRY:</b> You have draconic ancestry. Choose one type of dragon from the Draconic Ancestry table. Your breath weapon and damage resistance are determined by the dragon type, as shown in the table. \\n<b>Dragon\\t\\tDamage Type\\t\\tBreath Weapon</b>\n" +
                    "        \\nBlack\\t\\t\\tAcid\\t\\t\\t\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nBlue\\t\\t\\t\\tLightning\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nBrass\\t\\t\\tFire\\t\\t\\t\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nBronze\\t\\tLightning\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nCopper\\t\\tAcid\\t\\t\\t\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nGold\\t\\t\\tFire\\t\\t\\t\\t\\t\\t\\t15 ft. cone (Dex. save)\n" +
                    "        \\nGreen\\t\\t\\tPoison\\t\\t\\t\\t\\t15 ft. cone (Con. save)\n" +
                    "        \\nRed\\t\\t\\t\\tFire\\t\\t\\t\\t\\t\\t\\t15 ft. cone (Dex. save)\n" +
                    "        \\nSilver\\t\\t\\tCold\\t\\t\\t\\t\\t\\t15 ft. cone (Con. save)\n" +
                    "        \\nBrass\\t\\t\\tCold\\t\\t\\t\\t\\t\\t15 ft. cone (Con. save)");
            barbarian.setCombatTraits("<b>BREATH WEAPON:</b> You can use your action to exhale destructive energy. Your draconic ancestry determines the size, shape, and damage type of the exhalation. When you use your breath weapon, each creature in the area of the exhalation must make a saving throw, the type of which is determined by your draconic ancestry. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest. ");
            barbarian.setCombatTraits("<b>DAMAGE RESISTANCE:</b> You have resistance to the damage type associated with your draconic ancestry.");
            barbarian.setLanguages(0,1);
            barbarian.setLanguages(10,1);
        }
        else if(klass.equals("bard")){
            bard.setRace("Dragonborn");
            bard.setStatistics(0, bard.itsStatistics(0) + 2);
            bard.setStatistics(5, bard.itsStatistics(5) + 1);
            bard.setSpeed(30);
            bard.setExplorationTraits("");
            bard.setExplorationTraits("");
            bard.setExplorationTraits("<b>BREATH WEAPON:</b> You can use your action to exhale destructive energy. Your draconic ancestry determines the size, shape, and damage type of the exhalation. When you use your breath weapon, each creature in the area of the exhalation must make a saving throw, the type of which is determined by your draconic ancestry. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest.");
            bard.setCombatTraits("<b>DRACONIC ANCESTRY:</b> You have draconic ancestry. Choose one type of dragon from the Draconic Ancestry table. Your breath weapon and damage resistance are determined by the dragon type, as shown in the table. \\n<b>Dragon\\t\\tDamage Type\\t\\tBreath Weapon</b>\n" +
                    "        \\nBlack\\t\\t\\tAcid\\t\\t\\t\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nBlue\\t\\t\\t\\tLightning\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nBrass\\t\\t\\tFire\\t\\t\\t\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nBronze\\t\\tLightning\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nCopper\\t\\tAcid\\t\\t\\t\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nGold\\t\\t\\tFire\\t\\t\\t\\t\\t\\t\\t15 ft. cone (Dex. save)\n" +
                    "        \\nGreen\\t\\t\\tPoison\\t\\t\\t\\t\\t15 ft. cone (Con. save)\n" +
                    "        \\nRed\\t\\t\\t\\tFire\\t\\t\\t\\t\\t\\t\\t15 ft. cone (Dex. save)\n" +
                    "        \\nSilver\\t\\t\\tCold\\t\\t\\t\\t\\t\\t15 ft. cone (Con. save)\n" +
                    "        \\nBrass\\t\\t\\tCold\\t\\t\\t\\t\\t\\t15 ft. cone (Con. save)");
            bard.setCombatTraits("<b>BREATH WEAPON:</b> You can use your action to exhale destructive energy. Your draconic ancestry determines the size, shape, and damage type of the exhalation. When you use your breath weapon, each creature in the area of the exhalation must make a saving throw, the type of which is determined by your draconic ancestry. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest. ");
            bard.setCombatTraits("<b>DAMAGE RESISTANCE:</b> You have resistance to the damage type associated with your draconic ancestry.");
            bard.setLanguages(0,1);
            bard.setLanguages(10,1);
        }
        else if(klass.equals("cleric")){
            cleric.setRace("Dragonborn");
            cleric.setStatistics(0, cleric.itsStatistics(0) + 2);
            cleric.setStatistics(5, cleric.itsStatistics(5) + 1);
            cleric.setSpeed(30);
            cleric.setExplorationTraits("");
            cleric.setExplorationTraits("");
            cleric.setExplorationTraits("<b>BREATH WEAPON:</b> You can use your action to exhale destructive energy. Your draconic ancestry determines the size, shape, and damage type of the exhalation. When you use your breath weapon, each creature in the area of the exhalation must make a saving throw, the type of which is determined by your draconic ancestry. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest.");
            cleric.setCombatTraits("<b>DRACONIC ANCESTRY:</b> You have draconic ancestry. Choose one type of dragon from the Draconic Ancestry table. Your breath weapon and damage resistance are determined by the dragon type, as shown in the table. \\n<b>Dragon\\t\\tDamage Type\\t\\tBreath Weapon</b>\n" +
                    "        \\nBlack\\t\\t\\tAcid\\t\\t\\t\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nBlue\\t\\t\\t\\tLightning\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nBrass\\t\\t\\tFire\\t\\t\\t\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nBronze\\t\\tLightning\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nCopper\\t\\tAcid\\t\\t\\t\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nGold\\t\\t\\tFire\\t\\t\\t\\t\\t\\t\\t15 ft. cone (Dex. save)\n" +
                    "        \\nGreen\\t\\t\\tPoison\\t\\t\\t\\t\\t15 ft. cone (Con. save)\n" +
                    "        \\nRed\\t\\t\\t\\tFire\\t\\t\\t\\t\\t\\t\\t15 ft. cone (Dex. save)\n" +
                    "        \\nSilver\\t\\t\\tCold\\t\\t\\t\\t\\t\\t15 ft. cone (Con. save)\n" +
                    "        \\nBrass\\t\\t\\tCold\\t\\t\\t\\t\\t\\t15 ft. cone (Con. save)");
            cleric.setCombatTraits("<b>BREATH WEAPON:</b> You can use your action to exhale destructive energy. Your draconic ancestry determines the size, shape, and damage type of the exhalation. When you use your breath weapon, each creature in the area of the exhalation must make a saving throw, the type of which is determined by your draconic ancestry. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest. ");
            cleric.setCombatTraits("<b>DAMAGE RESISTANCE:</b> You have resistance to the damage type associated with your draconic ancestry.");
            cleric.setLanguages(0,1);
            cleric.setLanguages(10,1);
        }
        else if(klass.equals("druid")){
            druid.setRace("Dragonborn");
            druid.setStatistics(0, druid.itsStatistics(0) + 2);
            druid.setStatistics(5, druid.itsStatistics(5) + 1);
            druid.setSpeed(30);
            druid.setExplorationTraits("");
            druid.setExplorationTraits("");
            druid.setExplorationTraits("<b>BREATH WEAPON:</b> You can use your action to exhale destructive energy. Your draconic ancestry determines the size, shape, and damage type of the exhalation. When you use your breath weapon, each creature in the area of the exhalation must make a saving throw, the type of which is determined by your draconic ancestry. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest.");
            druid.setCombatTraits("<b>DRACONIC ANCESTRY:</b> You have draconic ancestry. Choose one type of dragon from the Draconic Ancestry table. Your breath weapon and damage resistance are determined by the dragon type, as shown in the table. \\n<b>Dragon\\t\\tDamage Type\\t\\tBreath Weapon</b>\n" +
                    "        \\nBlack\\t\\t\\tAcid\\t\\t\\t\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nBlue\\t\\t\\t\\tLightning\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nBrass\\t\\t\\tFire\\t\\t\\t\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nBronze\\t\\tLightning\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nCopper\\t\\tAcid\\t\\t\\t\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nGold\\t\\t\\tFire\\t\\t\\t\\t\\t\\t\\t15 ft. cone (Dex. save)\n" +
                    "        \\nGreen\\t\\t\\tPoison\\t\\t\\t\\t\\t15 ft. cone (Con. save)\n" +
                    "        \\nRed\\t\\t\\t\\tFire\\t\\t\\t\\t\\t\\t\\t15 ft. cone (Dex. save)\n" +
                    "        \\nSilver\\t\\t\\tCold\\t\\t\\t\\t\\t\\t15 ft. cone (Con. save)\n" +
                    "        \\nBrass\\t\\t\\tCold\\t\\t\\t\\t\\t\\t15 ft. cone (Con. save)");
            druid.setCombatTraits("<b>BREATH WEAPON:</b> You can use your action to exhale destructive energy. Your draconic ancestry determines the size, shape, and damage type of the exhalation. When you use your breath weapon, each creature in the area of the exhalation must make a saving throw, the type of which is determined by your draconic ancestry. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest. ");
            druid.setCombatTraits("<b>DAMAGE RESISTANCE:</b> You have resistance to the damage type associated with your draconic ancestry.");
            druid.setLanguages(0,1);
            druid.setLanguages(10,1);
        }
        else if(klass.equals("fighter")){
            fighter.setRace("Dragonborn");
            fighter.setStatistics(0, fighter.itsStatistics(0) + 2);
            fighter.setStatistics(5, fighter.itsStatistics(5) + 1);
            fighter.setSpeed(30);
            fighter.setExplorationTraits("");
            fighter.setExplorationTraits("");
            fighter.setExplorationTraits("<b>BREATH WEAPON:</b> You can use your action to exhale destructive energy. Your draconic ancestry determines the size, shape, and damage type of the exhalation. When you use your breath weapon, each creature in the area of the exhalation must make a saving throw, the type of which is determined by your draconic ancestry. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest.");
            fighter.setCombatTraits("<b>DRACONIC ANCESTRY:</b> You have draconic ancestry. Choose one type of dragon from the Draconic Ancestry table. Your breath weapon and damage resistance are determined by the dragon type, as shown in the table. \\n<b>Dragon\\t\\tDamage Type\\t\\tBreath Weapon</b>\n" +
                    "        \\nBlack\\t\\t\\tAcid\\t\\t\\t\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nBlue\\t\\t\\t\\tLightning\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nBrass\\t\\t\\tFire\\t\\t\\t\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nBronze\\t\\tLightning\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nCopper\\t\\tAcid\\t\\t\\t\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nGold\\t\\t\\tFire\\t\\t\\t\\t\\t\\t\\t15 ft. cone (Dex. save)\n" +
                    "        \\nGreen\\t\\t\\tPoison\\t\\t\\t\\t\\t15 ft. cone (Con. save)\n" +
                    "        \\nRed\\t\\t\\t\\tFire\\t\\t\\t\\t\\t\\t\\t15 ft. cone (Dex. save)\n" +
                    "        \\nSilver\\t\\t\\tCold\\t\\t\\t\\t\\t\\t15 ft. cone (Con. save)\n" +
                    "        \\nBrass\\t\\t\\tCold\\t\\t\\t\\t\\t\\t15 ft. cone (Con. save)");
            fighter.setCombatTraits("<b>BREATH WEAPON:</b> You can use your action to exhale destructive energy. Your draconic ancestry determines the size, shape, and damage type of the exhalation. When you use your breath weapon, each creature in the area of the exhalation must make a saving throw, the type of which is determined by your draconic ancestry. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest. ");
            fighter.setCombatTraits("<b>DAMAGE RESISTANCE:</b> You have resistance to the damage type associated with your draconic ancestry.");
            fighter.setLanguages(0,1);
            fighter.setLanguages(10,1);
        }
        else if(klass.equals("monk")){
            monk.setRace("Dragonborn");
            monk.setStatistics(0, monk.itsStatistics(0) + 2);
            monk.setStatistics(5, monk.itsStatistics(5) + 1);
            monk.setSpeed(30);
            monk.setExplorationTraits("");
            monk.setExplorationTraits("");
            monk.setExplorationTraits("<b>BREATH WEAPON:</b> You can use your action to exhale destructive energy. Your draconic ancestry determines the size, shape, and damage type of the exhalation. When you use your breath weapon, each creature in the area of the exhalation must make a saving throw, the type of which is determined by your draconic ancestry. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest.");
            monk.setCombatTraits("<b>DRACONIC ANCESTRY:</b> You have draconic ancestry. Choose one type of dragon from the Draconic Ancestry table. Your breath weapon and damage resistance are determined by the dragon type, as shown in the table. \\n<b>Dragon\\t\\tDamage Type\\t\\tBreath Weapon</b>\n" +
                    "        \\nBlack\\t\\t\\tAcid\\t\\t\\t\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nBlue\\t\\t\\t\\tLightning\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nBrass\\t\\t\\tFire\\t\\t\\t\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nBronze\\t\\tLightning\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nCopper\\t\\tAcid\\t\\t\\t\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nGold\\t\\t\\tFire\\t\\t\\t\\t\\t\\t\\t15 ft. cone (Dex. save)\n" +
                    "        \\nGreen\\t\\t\\tPoison\\t\\t\\t\\t\\t15 ft. cone (Con. save)\n" +
                    "        \\nRed\\t\\t\\t\\tFire\\t\\t\\t\\t\\t\\t\\t15 ft. cone (Dex. save)\n" +
                    "        \\nSilver\\t\\t\\tCold\\t\\t\\t\\t\\t\\t15 ft. cone (Con. save)\n" +
                    "        \\nBrass\\t\\t\\tCold\\t\\t\\t\\t\\t\\t15 ft. cone (Con. save)");
            monk.setCombatTraits("<b>BREATH WEAPON:</b> You can use your action to exhale destructive energy. Your draconic ancestry determines the size, shape, and damage type of the exhalation. When you use your breath weapon, each creature in the area of the exhalation must make a saving throw, the type of which is determined by your draconic ancestry. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest. ");
            monk.setCombatTraits("<b>DAMAGE RESISTANCE:</b> You have resistance to the damage type associated with your draconic ancestry.");
            monk.setLanguages(0,1);
            monk.setLanguages(10,1);
        }
        else if(klass.equals("paladin")){
            paladin.setRace("Dragonborn");
            paladin.setStatistics(0, paladin.itsStatistics(0) + 2);
            paladin.setStatistics(5, paladin.itsStatistics(5) + 1);
            paladin.setSpeed(30);
            paladin.setExplorationTraits("");
            paladin.setExplorationTraits("");
            paladin.setExplorationTraits("<b>BREATH WEAPON:</b> You can use your action to exhale destructive energy. Your draconic ancestry determines the size, shape, and damage type of the exhalation. When you use your breath weapon, each creature in the area of the exhalation must make a saving throw, the type of which is determined by your draconic ancestry. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest.");
            paladin.setCombatTraits("<b>DRACONIC ANCESTRY:</b> You have draconic ancestry. Choose one type of dragon from the Draconic Ancestry table. Your breath weapon and damage resistance are determined by the dragon type, as shown in the table. \\n<b>Dragon\\t\\tDamage Type\\t\\tBreath Weapon</b>\n" +
                    "        \\nBlack\\t\\t\\tAcid\\t\\t\\t\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nBlue\\t\\t\\t\\tLightning\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nBrass\\t\\t\\tFire\\t\\t\\t\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nBronze\\t\\tLightning\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nCopper\\t\\tAcid\\t\\t\\t\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nGold\\t\\t\\tFire\\t\\t\\t\\t\\t\\t\\t15 ft. cone (Dex. save)\n" +
                    "        \\nGreen\\t\\t\\tPoison\\t\\t\\t\\t\\t15 ft. cone (Con. save)\n" +
                    "        \\nRed\\t\\t\\t\\tFire\\t\\t\\t\\t\\t\\t\\t15 ft. cone (Dex. save)\n" +
                    "        \\nSilver\\t\\t\\tCold\\t\\t\\t\\t\\t\\t15 ft. cone (Con. save)\n" +
                    "        \\nBrass\\t\\t\\tCold\\t\\t\\t\\t\\t\\t15 ft. cone (Con. save)");
            paladin.setCombatTraits("<b>BREATH WEAPON:</b> You can use your action to exhale destructive energy. Your draconic ancestry determines the size, shape, and damage type of the exhalation. When you use your breath weapon, each creature in the area of the exhalation must make a saving throw, the type of which is determined by your draconic ancestry. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest. ");
            paladin.setCombatTraits("<b>DAMAGE RESISTANCE:</b> You have resistance to the damage type associated with your draconic ancestry.");
            paladin.setLanguages(0,1);
            paladin.setLanguages(10,1);
        }
        else if(klass.equals("ranger")){
            ranger.setRace("Dragonborn");
            ranger.setStatistics(0, ranger.itsStatistics(0) + 2);
            ranger.setStatistics(5, ranger.itsStatistics(5) + 1);
            ranger.setSpeed(30);
            ranger.setExplorationTraits("");
            ranger.setExplorationTraits("");
            ranger.setExplorationTraits("<b>BREATH WEAPON:</b> You can use your action to exhale destructive energy. Your draconic ancestry determines the size, shape, and damage type of the exhalation. When you use your breath weapon, each creature in the area of the exhalation must make a saving throw, the type of which is determined by your draconic ancestry. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest.");
            ranger.setCombatTraits("<b>DRACONIC ANCESTRY:</b> You have draconic ancestry. Choose one type of dragon from the Draconic Ancestry table. Your breath weapon and damage resistance are determined by the dragon type, as shown in the table. \\n<b>Dragon\\t\\tDamage Type\\t\\tBreath Weapon</b>\n" +
                    "        \\nBlack\\t\\t\\tAcid\\t\\t\\t\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nBlue\\t\\t\\t\\tLightning\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nBrass\\t\\t\\tFire\\t\\t\\t\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nBronze\\t\\tLightning\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nCopper\\t\\tAcid\\t\\t\\t\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nGold\\t\\t\\tFire\\t\\t\\t\\t\\t\\t\\t15 ft. cone (Dex. save)\n" +
                    "        \\nGreen\\t\\t\\tPoison\\t\\t\\t\\t\\t15 ft. cone (Con. save)\n" +
                    "        \\nRed\\t\\t\\t\\tFire\\t\\t\\t\\t\\t\\t\\t15 ft. cone (Dex. save)\n" +
                    "        \\nSilver\\t\\t\\tCold\\t\\t\\t\\t\\t\\t15 ft. cone (Con. save)\n" +
                    "        \\nBrass\\t\\t\\tCold\\t\\t\\t\\t\\t\\t15 ft. cone (Con. save)");
            ranger.setCombatTraits("<b>BREATH WEAPON:</b> You can use your action to exhale destructive energy. Your draconic ancestry determines the size, shape, and damage type of the exhalation. When you use your breath weapon, each creature in the area of the exhalation must make a saving throw, the type of which is determined by your draconic ancestry. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest. ");
            ranger.setCombatTraits("<b>DAMAGE RESISTANCE:</b> You have resistance to the damage type associated with your draconic ancestry.");
            ranger.setLanguages(0,1);
            ranger.setLanguages(10,1);
        }
        else if(klass.equals("sorcerer")){
            sorcerer.setRace("Dragonborn");
            sorcerer.setStatistics(0, sorcerer.itsStatistics(0) + 2);
            sorcerer.setStatistics(5, sorcerer.itsStatistics(5) + 1);
            sorcerer.setSpeed(30);
            sorcerer.setExplorationTraits("");
            sorcerer.setExplorationTraits("");
            sorcerer.setExplorationTraits("<b>BREATH WEAPON:</b> You can use your action to exhale destructive energy. Your draconic ancestry determines the size, shape, and damage type of the exhalation. When you use your breath weapon, each creature in the area of the exhalation must make a saving throw, the type of which is determined by your draconic ancestry. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest.");
            sorcerer.setCombatTraits("<b>DRACONIC ANCESTRY:</b> You have draconic ancestry. Choose one type of dragon from the Draconic Ancestry table. Your breath weapon and damage resistance are determined by the dragon type, as shown in the table. \\n<b>Dragon\\t\\tDamage Type\\t\\tBreath Weapon</b>\n" +
                    "        \\nBlack\\t\\t\\tAcid\\t\\t\\t\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nBlue\\t\\t\\t\\tLightning\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nBrass\\t\\t\\tFire\\t\\t\\t\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nBronze\\t\\tLightning\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nCopper\\t\\tAcid\\t\\t\\t\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nGold\\t\\t\\tFire\\t\\t\\t\\t\\t\\t\\t15 ft. cone (Dex. save)\n" +
                    "        \\nGreen\\t\\t\\tPoison\\t\\t\\t\\t\\t15 ft. cone (Con. save)\n" +
                    "        \\nRed\\t\\t\\t\\tFire\\t\\t\\t\\t\\t\\t\\t15 ft. cone (Dex. save)\n" +
                    "        \\nSilver\\t\\t\\tCold\\t\\t\\t\\t\\t\\t15 ft. cone (Con. save)\n" +
                    "        \\nBrass\\t\\t\\tCold\\t\\t\\t\\t\\t\\t15 ft. cone (Con. save)");
            sorcerer.setCombatTraits("<b>BREATH WEAPON:</b> You can use your action to exhale destructive energy. Your draconic ancestry determines the size, shape, and damage type of the exhalation. When you use your breath weapon, each creature in the area of the exhalation must make a saving throw, the type of which is determined by your draconic ancestry. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest. ");
            sorcerer.setCombatTraits("<b>DAMAGE RESISTANCE:</b> You have resistance to the damage type associated with your draconic ancestry.");
            sorcerer.setLanguages(0,1);
            sorcerer.setLanguages(10,1);
        }
        else if(klass.equals("rogue")){
            rogue.setRace("Dragonborn");
            rogue.setStatistics(0, rogue.itsStatistics(0) + 2);
            rogue.setStatistics(5, rogue.itsStatistics(5) + 1);
            rogue.setSpeed(30);
            rogue.setExplorationTraits("");
            rogue.setExplorationTraits("");
            rogue.setExplorationTraits("<b>BREATH WEAPON:</b> You can use your action to exhale destructive energy. Your draconic ancestry determines the size, shape, and damage type of the exhalation. When you use your breath weapon, each creature in the area of the exhalation must make a saving throw, the type of which is determined by your draconic ancestry. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest.");
            rogue.setCombatTraits("<b>DRACONIC ANCESTRY:</b> You have draconic ancestry. Choose one type of dragon from the Draconic Ancestry table. Your breath weapon and damage resistance are determined by the dragon type, as shown in the table. \\n<b>Dragon\\t\\tDamage Type\\t\\tBreath Weapon</b>\n" +
                    "        \\nBlack\\t\\t\\tAcid\\t\\t\\t\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nBlue\\t\\t\\t\\tLightning\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nBrass\\t\\t\\tFire\\t\\t\\t\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nBronze\\t\\tLightning\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nCopper\\t\\tAcid\\t\\t\\t\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nGold\\t\\t\\tFire\\t\\t\\t\\t\\t\\t\\t15 ft. cone (Dex. save)\n" +
                    "        \\nGreen\\t\\t\\tPoison\\t\\t\\t\\t\\t15 ft. cone (Con. save)\n" +
                    "        \\nRed\\t\\t\\t\\tFire\\t\\t\\t\\t\\t\\t\\t15 ft. cone (Dex. save)\n" +
                    "        \\nSilver\\t\\t\\tCold\\t\\t\\t\\t\\t\\t15 ft. cone (Con. save)\n" +
                    "        \\nBrass\\t\\t\\tCold\\t\\t\\t\\t\\t\\t15 ft. cone (Con. save)");
            rogue.setCombatTraits("<b>BREATH WEAPON:</b> You can use your action to exhale destructive energy. Your draconic ancestry determines the size, shape, and damage type of the exhalation. When you use your breath weapon, each creature in the area of the exhalation must make a saving throw, the type of which is determined by your draconic ancestry. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest. ");
            rogue.setCombatTraits("<b>DAMAGE RESISTANCE:</b> You have resistance to the damage type associated with your draconic ancestry.");
            rogue.setLanguages(0,1);
            rogue.setLanguages(10,1);
        }
        else if(klass.equals("wizard")){
            wizard.setRace("Dragonborn");
            wizard.setStatistics(0, wizard.itsStatistics(0) + 2);
            wizard.setStatistics(5, wizard.itsStatistics(5) + 1);
            wizard.setSpeed(30);
            wizard.setExplorationTraits("");
            wizard.setExplorationTraits("");
            wizard.setExplorationTraits("<b>BREATH WEAPON:</b> You can use your action to exhale destructive energy. Your draconic ancestry determines the size, shape, and damage type of the exhalation. When you use your breath weapon, each creature in the area of the exhalation must make a saving throw, the type of which is determined by your draconic ancestry. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest.");
            wizard.setCombatTraits("<b>DRACONIC ANCESTRY:</b> You have draconic ancestry. Choose one type of dragon from the Draconic Ancestry table. Your breath weapon and damage resistance are determined by the dragon type, as shown in the table. \\n<b>Dragon\\t\\tDamage Type\\t\\tBreath Weapon</b>\n" +
                    "        \\nBlack\\t\\t\\tAcid\\t\\t\\t\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nBlue\\t\\t\\t\\tLightning\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nBrass\\t\\t\\tFire\\t\\t\\t\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nBronze\\t\\tLightning\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nCopper\\t\\tAcid\\t\\t\\t\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nGold\\t\\t\\tFire\\t\\t\\t\\t\\t\\t\\t15 ft. cone (Dex. save)\n" +
                    "        \\nGreen\\t\\t\\tPoison\\t\\t\\t\\t\\t15 ft. cone (Con. save)\n" +
                    "        \\nRed\\t\\t\\t\\tFire\\t\\t\\t\\t\\t\\t\\t15 ft. cone (Dex. save)\n" +
                    "        \\nSilver\\t\\t\\tCold\\t\\t\\t\\t\\t\\t15 ft. cone (Con. save)\n" +
                    "        \\nBrass\\t\\t\\tCold\\t\\t\\t\\t\\t\\t15 ft. cone (Con. save)");
            wizard.setCombatTraits("<b>BREATH WEAPON:</b> You can use your action to exhale destructive energy. Your draconic ancestry determines the size, shape, and damage type of the exhalation. When you use your breath weapon, each creature in the area of the exhalation must make a saving throw, the type of which is determined by your draconic ancestry. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest. ");
            wizard.setCombatTraits("<b>DAMAGE RESISTANCE:</b> You have resistance to the damage type associated with your draconic ancestry.");
            wizard.setLanguages(0,1);
            wizard.setLanguages(10,1);
        }

        else if(klass.equals("warlock")){
            warlock.setRace("Dragonborn");
            warlock.setStatistics(0, warlock.itsStatistics(0) + 2);
            warlock.setStatistics(5, warlock.itsStatistics(5) + 1);
            warlock.setSpeed(30);
            warlock.setExplorationTraits("");
            warlock.setExplorationTraits("");
            warlock.setExplorationTraits("<b>BREATH WEAPON:</b> You can use your action to exhale destructive energy. Your draconic ancestry determines the size, shape, and damage type of the exhalation. When you use your breath weapon, each creature in the area of the exhalation must make a saving throw, the type of which is determined by your draconic ancestry. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest.");
            warlock.setCombatTraits("<b>DRACONIC ANCESTRY:</b> You have draconic ancestry. Choose one type of dragon from the Draconic Ancestry table. Your breath weapon and damage resistance are determined by the dragon type, as shown in the table. \\n<b>Dragon\\t\\tDamage Type\\t\\tBreath Weapon</b>\n" +
                    "        \\nBlack\\t\\t\\tAcid\\t\\t\\t\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nBlue\\t\\t\\t\\tLightning\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nBrass\\t\\t\\tFire\\t\\t\\t\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nBronze\\t\\tLightning\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nCopper\\t\\tAcid\\t\\t\\t\\t\\t\\t\\t5 by 30 ft. line (Dex. save)\n" +
                    "        \\nGold\\t\\t\\tFire\\t\\t\\t\\t\\t\\t\\t15 ft. cone (Dex. save)\n" +
                    "        \\nGreen\\t\\t\\tPoison\\t\\t\\t\\t\\t15 ft. cone (Con. save)\n" +
                    "        \\nRed\\t\\t\\t\\tFire\\t\\t\\t\\t\\t\\t\\t15 ft. cone (Dex. save)\n" +
                    "        \\nSilver\\t\\t\\tCold\\t\\t\\t\\t\\t\\t15 ft. cone (Con. save)\n" +
                    "        \\nBrass\\t\\t\\tCold\\t\\t\\t\\t\\t\\t15 ft. cone (Con. save)");
            warlock.setCombatTraits("<b>BREATH WEAPON:</b> You can use your action to exhale destructive energy. Your draconic ancestry determines the size, shape, and damage type of the exhalation. When you use your breath weapon, each creature in the area of the exhalation must make a saving throw, the type of which is determined by your draconic ancestry. The DC for this saving throw equals 8 + your Constitution modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, and half as much damage on a successful one. The damage increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon, you can’t use it again until you complete a short or long rest. ");
            warlock.setCombatTraits("<b>DAMAGE RESISTANCE:</b> You have resistance to the damage type associated with your draconic ancestry.");
            warlock.setLanguages(0,1);
            warlock.setLanguages(10,1);
        }
    }
}

