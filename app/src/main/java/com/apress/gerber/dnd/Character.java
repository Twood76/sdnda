package com.apress.gerber.dnd;

import java.io.Serializable;

/**
 * Created by Szyman on 05.12.2017.
 */

public class Character implements Serializable{
    //konstruktor
    Character(){
        //zerowanie statystyk
        for(int i=0; i<6; i++){
            Statistics[i] = 0;
        }
        //zerowanie armor profitiency
        for(int i=0; i<6; i++){
            ArmorProfitiecys[i] = 0;
        }
        //zerowanie weapon profitiency
        for(int i=0; i<6; i++){
            WeaponProfitiencys[i] = 0;
        }
        //zerowanie Tool Profitiency
        for(int i=0; i<6; i++){
            ToolProfitiencys[i] = 0;
        }
        for(int i=0; i<ExplorationTraits.length; i++){
            ExplorationTraits[i] = "";
        }
        for(int i=0; i<CombatTraits.length; i++){
            CombatTraits[i] = "";
        }

        //--------------------
        //ustawianie stringa glownych statystyk
        MainStatistics = "";
    }


    public void setStatistics(int index, int value){
        Statistics[index] = value;
    }
    public int itsStatistics(int index){
        return Statistics[index];
    }

    public void setMainStatistics(String value){
        MainStatistics = value;
    }
    public String itsMainStatistics(){
        return MainStatistics;
    }

    public void setHitDice1(int value){
        HitDice1 = value;
    }
    public int itsHitDice1(){
        return HitDice1;
    }

    public void setHitDice2(int value){
        HitDice2 = value;
    }
    public int itsHitDice2(){
        return HitDice2;
    }

    public void setMaxHp(int val){
        MaxHp = val;
    }
    public int itsMaxHp(){
        return MaxHp;
    }

    public void setHp(int val){
        Hp = val;
    }
    public int itsHp(){
        return Hp;
    }

    public void setHitDice(int value){
        HitDice = value;
    }
    public int itsHitDice() {return HitDice; }

    public void setMaxHitDice(int value){
        MaxHitDice = value;
    }
    public int itsMaxHitDice() {return MaxHitDice; }

    public void setArmorProfitiecys(int index, int value){
        ArmorProfitiecys[index] = value;
    }
    public int itsArmorProfitiencys(int index){
        return ArmorProfitiecys[index];
    }

    public void setWeaponProfitiencys(int index, int value){
        WeaponProfitiencys[index] = value;
    }
    public int itsWeaponProfitiency(int index){
        return WeaponProfitiencys[index];
    }

    public void setToolProfitiencys(int index, int value){ToolProfitiencys[index] = value;}
    public int itsToolProfitiency(int index){
        return ToolProfitiencys[index];
    }

    public void setSavingThrows(int index, int value){SavingThrows[index] = value;}
    public int itsSavingThrows(int index){
        return SavingThrows[index];
    }

    public void setSkills(int index, int value){Skills[index] = value;}
    public int itsSkills(int index){return Skills[index];}

    public void setHpOnAdvance1(int value){
        HpOnAdvance1 = value;
    }
    public int itsHpOnAdvance1() {return HpOnAdvance1; }

    public void setHpOnAdvance2(int value){
        HpOnAdvance2 = value;
    }
    public int itsHpOnAdvance2() {return HpOnAdvance2; }

    public void setProfitiencyModifier(int value){
        ProfitiencyModifier = value;
    }
    public int itsProfitiencyModifier() {return ProfitiencyModifier; }

    public void setArmorsInventory(int index1, int index2, String value){ArmorsInventory[index1][index2] = value;}
    public String itsArmorsInventory(int index1, int index2){return ArmorsInventory[index1][index2];}

    public void setWeaponsInventory(int index1, int index2, String value){WeaponsInventory[index1][index2] = value;}
    public String itsWeaponInventory(int index1, int index2){return WeaponsInventory[index1][index2];}

    public void setInventory(int index, String value){Inventory[index] = value;}
    public String itsInventory(int index){
        return Inventory[index];
    }

    public void setMoney(int index, int value){Money[index] = value;}
    public int itsMoney(int index){
        return Money[index];
    }

    public void setLanguages(int index, int value){Languages[index] = value;}
    public int itsLanguages(int index){
        return Languages[index];
    }

    public void setRace(String value){Race = value;}
    public String itsRace(){
        return Race;
    }

    public void setExplorationTraits(String value){
        for(int i =0; i< ExplorationTraits.length; i++) {
            if(ExplorationTraits[i].equals("")) {ExplorationTraits[i] = value;}
        }
    }
    public String itsExplorationTraits(int index){
        return ExplorationTraits[index];
    }

    public void setCombatTraits(String value){
        for(int i =0; i< CombatTraits.length; i++) {
            if(CombatTraits[i].equals("")) {CombatTraits[i] = value;}
        }
    }
    public String itsCombatTraits(int index){
        return CombatTraits[index];
    }

    public void setSpeed(int value){
        Speed = value;
    }
    public int itsSpeed() {return Speed; }

    public void setLevel(int value){
        Level = value;
    }
    public int itsLevel() {return Level; }

    public int itsStatisticsModifier(int index){
        if(Statistics[index] >= 10){return (int) Math.floor(Statistics[index] - 10)/2;}
        else{return 5 - (int) Math.floor(Statistics[index]/2);}
    }

    public void setSavingThrowsProfitiency(int index, int value){
        SavingThrowsProfitiency[index] = value;
    }
    public int itsSavingThrowProfitiency(int index){
        return SavingThrowsProfitiency[index];
    }

    int findFreeWeaponInventorySlot(){
        for(int i = 0 ; i< 10; i++){
            if(itsWeaponInventory(i,1).equals("")){
                return i;
            }
        }
        return 9;
    }





    /**
     Statiscics[6]
     * [0] - Strength
     * [1] - Dexterity
     * [2] - Constitution640
     * [3] - Intelligence
     * [4] - Wisdom
     * [5] - Charisma
     **/
    private int Statistics[] = new int[6];
    /****/
    private String MainStatistics = "";
    private int HitDice1 = 0;
    private int HitDice2 = 0;
    private int MaxHp =0;
    private int Hp = 0;
    private int HitDice =0;
    private int MaxHitDice =0;


    /**
     * ArmorProfitiencys[13]
     * -----light
     * [0] - Padded
     * [1] - Leather
     * [2] - Studded Leather
     * ------medium
     * [3] - Hide
     * [4] - Chain Shirt
     * [5] - Scale Mail
     * [6] - Breastplate
     * [7] - Half Plate
     * ----heavy
     * [8] - Ring Mail
     * [9] - Chain Mail
     * [10] - Splint
     * [11] - Plate
     * -----shield
     * [12] - Shield
     */
    private int ArmorProfitiecys[] = new int[13];
    /****/

    /**
     * Weapon Profitiencys
     * ----simple melee
     * [0] - Club
     * [1] - Dagger
     * [2] - Greatclub
     * [3] - Handaxe
     * [4] - Javelin
     * [5] - LightHammer
     * [6] - Mace
     * [7] - Quarterstaff
     * [8] - Sickle
     * [9] - Spear
     * [10] - Unarmed Strike
     * --simple ranged
     * [11] - Light Crossbow
     * [12] - Dart
     * [13] - Shortbow
     * [14] - Sling
     * --martial melee
     * [15] - Battleaxe
     * [16] - Flail
     * [17] - Glaive
     * [18] - Greataxe
     * [19] - Greatsword
     * [20] - Halberd
     * [21] - Lance
     * [22] - Longsword
     * [23] - Maul
     * [24] - Morningstar
     * [25] - Pike
     * [26] - Rapier
     * [27] - Scimitar
     * [28] - Shortsword
     * [29] - Trident
     * [30] - WarPick
     * [31] - Warhammer
     * [32] - Whip
     * ----martial range
     * [33] - Blowgan
     * [34] - HandCrossbow
     * [35] - HeavyCrossbow
     * [36] - Longbow
     * [37] - Net
     *
     */
    private int WeaponProfitiencys[] = new int[38];
    /***/

    /**
     * ToolProfitiency
     * [0] - Alchemist's Supplies
     * [1] - Brewer's Supplies
     * [2] - Caligrapher's Supplies
     * [3] - Carpenter's Tools
     * [4] - Cartographer's Tool
     * [5] - Cobbler's Tools
     * [6] - Cooks utensils
     * [7] - Glassbowler's tools
     * [8] - Jeweler's Tools
     * [9] - Leatherworker's tools
     * [10] - Mason's Tools
     * [11] - Painter's Supplies
     * [12] - Potter's Tools
     * [13] - Smith's Tools
     * [14] - Tinker's Tools
     * [15] - Weaver's Tools
     * [16] - Woodcarver's Tools
     * [17] - Disquise Kit
     * [18] - Forgery Kit
     * [19] - Dice Set
     * [20] - Dragonchess Set
     * [21] - Playing Card set
     * [22] - Three-Dragon Ante set
     * [23] - Herbalism Kit
     * [24] - Bagpipes
     * [25] - Drum
     * [26] - Dulcimer
     * [27] - Flute
     * [28] - Lute
     * [29] - Lyre
     * [30] - Horn
     * [31] - Pan Flute
     * [32] - Shawm
     * [33] - Viol
     * [34] - Navigators Tool
     * [35] - Poisoner's Kit
     * [36] - Thieves Tools
     * [37] - Land Vehicles
     * [38] - Water's Wehicles
     *
     */
    private int ToolProfitiencys[] = new int[39];
    /***/

    /**
     * Saving Throws[6]
     * [0] - Strength
     * [1] - Dexterity
     * [2] - Constitution
     * [3] - Intelligence
     * [4] - Wisdom
     * [5] - Charisma
     *
     */
    private int SavingThrows[] = new int[6];
    private int SavingThrowsProfitiency[] = new int[6];
    /***/

    /**
     * Skills[18]
     * [0] - Acrobatics
     * [1] - Animal Handling
     * [2] - Arcana
     * [3] - Athletics
     * [4] - Deception
     * [5] - History
     * [6] - Insight
     * [7] - Intimidation
     * [8] - Investigation
     * [9] - Medicine
     * [10] - Nature
     * [11] - Perception
     * [12] - Performance
     * [13] - Persuation
     * [14] - Religion
     * [15] - Slight of Hand
     * [16] - Stealth
     * [17] - Survival
     *
     */
    private int Skills[] = new int[18];


    private int HpOnAdvance1 = 0;
    private int HpOnAdvance2 = 0;
    private int ProfitiencyModifier = 0;

    /**
     * Armors Inventory[10][16]
     * [0] - name
     * [1] - Armor Type
     * [2] - AC
     * [3] - Strength Required
     * [4] - Stealth Modifier
     * [5-10] - Atributes
     * [10-14] - Traits
     * [15] - Atunement Required
     */
    private String ArmorsInventory[][] = new String [10][16];

    /**
     * Weapons Inventory[10][]
     * [0] - Name
     * [1] - Type
     * [2-3] - Damage
     * [4] - Damage Type
     * [5-15] - Properties
     * [16] - Range
     * [17] - Max Range
     * [18] - Traits nm
     */
    private String WeaponsInventory[][] = new String [10][25];
    /***/

    private String Inventory[] = new String[20];

    /**
     * Money
     * [0] - Copper
     * [1] - Silver
     * [2] - Electrum
     * [3] - Gold
     * [4] - Platinum
     */
    private int Money[] = new int[5];


    /**
     * Languages
     * [0] - Common
     * [1] - Dwarvish
     * [2] - Elvish
     * [3] - Giant
     * [4] - gnomish
     * [5] - goblin
     * [6] - Halfling
     * [7] - Orc
     * [8] - Abyssal
     * [9] - Celestial
     * [10] - Draconic
     * [11] - Deep-speech
     * [12] - Infernal
     * [13] - Primordial
     * [14] - Sylvan
     * [15] - Undercommon
     */
    private int Languages[] = new int[16];

    private String Race;

    String ExplorationTraits[] = new String[20];
    String CombatTraits[] = new String[20];

    int Speed = 0;
    int Level = 0;

    int DamageResistances[] = new int[13];
    /**
     * Damage Types
     * [0] - Acid
     * [1]- Bludgeoning
     * [2] - Cold
     * [3] - Fire
     * [4] - Force
     * [5] - Lightning
     * [6] - Necrotic
     * [7] - Piercing
     * [8] - Poison
     * [9] - Psychic
     * [10] - Radiant
     * [11] - Slashing
     * [12] - Thunder
     */

}
