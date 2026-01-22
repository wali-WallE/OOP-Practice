class Agent {
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
}

class Duelist extends Agent {
    Duelist(String n, int h) {
        super(n, h);
    }

    @Override
    public void takeDamage(int damage) {
        int Ttldmg = damage - 5;
        super.takeDamage(Ttldmg);
    }
}

public class Main {
    public static void main(String[] args) {
        Agent A = new Agent("Tejo", 78);
        System.out.println(A.getName());
        System.out.println(A.getHealth());
        A.takeDamage(23);

        Duelist D = new Duelist("Reyna", 78);
        System.out.println(D.getName());
        System.out.println(D.getHealth());
        D.takeDamage(23);
    }

}