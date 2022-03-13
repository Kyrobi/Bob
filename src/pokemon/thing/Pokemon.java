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
    private int Health;
    private int id;
    private int HP, ATK, DEF, SPATK, SPDEF, SPD;
    
    
    public Pokemon(int id)
    {
        this.id = id;
        this.Level = 5;
    }
}
