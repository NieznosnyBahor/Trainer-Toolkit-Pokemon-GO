/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author NB
 */
public class Pokemon {
    private final int id;
    private int number;
    private String name;
    
    private int stat_att;
    private int stat_def;
    private int stat_sta;
    
    private EnumType type1;
    private EnumType type2;
    
    //private AttackFast fa[];
    //private AttackCharge ca[];
    
    // Konstruktor
    public Pokemon(int id)
    {
        this.id = id;
    }
    
    //Gettery i settery
    public int getId()                  {
        return id;
    }
    public int getNumber()              {
        return number;
    }
    public void setNumber(int number)   {
        this.number = number;
    }
    public String getName()             {
        return name;
    }
    public void setName(String name)    {
        this.name = name;
    }
    public int getStat_att()            {
        return stat_att;
    }
    public void setStat_att(int stat_att){
        this.stat_att = stat_att;
    }
    public int getStat_def()            {
        return stat_def;
    }
    public void setStat_def(int stat_def){
        this.stat_def = stat_def;
    }
    public int getStat_sta()            {
        return stat_sta;
    }
    public void setStat_sta(int stat_sta){
        this.stat_sta = stat_sta;
    }
    public EnumType getType1()          {
        return type1;
    }
    public void setType1(EnumType type1) {
        this.type1 = type1;
    }
    public EnumType getType2()          {
        return type2;
    }
    public void setType2(EnumType type2) {
        this.type2 = type2;
    }
    public void describePokemon()
    {
        System.out.println(id);
        System.out.println(number);
        System.out.println(name);
        System.out.println(stat_att + "/" + stat_def + "/" + stat_sta );
        System.out.println("*******");

    }
    //
}
