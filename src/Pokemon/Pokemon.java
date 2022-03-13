package Pokemon;

public class Pokemon {

    private int Level;
    private int Exp = 0;
    private int Health, MaxHealth;
    private int Id;
    private String Status;
    private int HP, ATK, DEF, SPATK, SPDEF, SPD;

    public Pokemon(int id)
    {
        this.Id = id;
        this.Level = 5;
    }

    public void Damage(int Dmg)
    {
        int temp = this.Health - Dmg;

        if (temp<=0)
        {
            this.Health = 0;
            this.Status = "FNT";
        }
        else
        {
            this.Health = this.Health - Dmg;
        }
    }

    public void test(){
        System.out.println("Test works!");
    }
}
