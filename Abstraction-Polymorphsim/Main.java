abstract class Agent {
    private String name;
    private int health;

    public Agent(String n, int h) {
        this.name = n;
        this.health = h;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            this.health = 0;
            System.out.println("character died");
        } else {
            System.out.println("Keep fighting you are alive!! HP: " + this.health);
        }
    }

    public abstract void useUltimate(int orbcnt);
}

class Duelist extends Agent{
    Duelist(String n, int h){
        super(n, h);
    }

    @Override 
    public void takeDamage(int damage){
        int Ttldmg = damage - 5;
        super.takeDamage(Ttldmg);
        System.out.println("Duelist mitigation appplied");
    }

    public void useUltimate(int orbcnt){
        if(orbcnt == 5){
            System.out.println("Ult Activated");
        }else{
            System.out.println("Ultimate is not ready");
        }
    }
}

class Sentinal extends Agent{
    Sentinal(String n, int h){
        super(n,h);
    }

    @Override
    public void takeDamage(int damage){
        if((getHealth() - damage <= 0)){
            super.takeDamage(damage);
        }else{
            int healing = 50;
            if(getHealth() - damage <= 50){
                int Ttldmg = damage - healing;
                super.takeDamage(Ttldmg);
            }else{
            super.takeDamage(damage);
            }
        }
    }
    public void useUltimate(int orbcnt){
        if(orbcnt == 7){
            System.out.println("Ult Activated");
        }else {
            System.out.println("Ultimate is not ready!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Agent D = new Duelist("Reyna", 78);
        Agent S = new Sentinal("Cypher", 78);
        System.out.println(D.getName());
        D.takeDamage(23);

        D.useUltimate(5);

        System.out.println(S.getName());
        S.takeDamage(77);
        S.useUltimate(6);
    }
}