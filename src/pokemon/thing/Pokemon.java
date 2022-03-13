/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon.thing;

/**
 *
 * @author 15735
 */
public class Pokemon {
    private int Level;
    private float Exp = 0.0f;
    private int Health, MaxHealth;
    private int id;
    private string Status;
    private int HP, ATK, DEF, SPATK, SPDEF, SPD;
    
    
    public Pokemon(int id)
    {
        this.id = id;
        this.Level = 5;
    }

    public Damage(int Dmg)
    {
        int temp = this.Health - Dmg;

        if (temp<=0)
        {
            this.Health = 0;
            this.Status = "FNT"
        }
        else
        {
         this.Health = this.Health - Dmg;
        }
    }
}
