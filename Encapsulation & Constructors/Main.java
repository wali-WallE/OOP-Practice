class Agent {
    private String name;
    private int health;

    public Agent(String n, int h){
        name = n;
        health = h;
    }

    public void Setname(String name){
        this.name = name;
    }

    public void Sethealth(int health){
        this.health = health;
    }

    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }

    public void Takedamage(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println(this.name + "died" );
        }else{
            System.out.println("Keep fighting" + this.name + "is alive!!");
        }
    }
}

public class Main{
    public static void main(String[] args) {
        Agent A = new Agent("Tejo", 78);

        System.out.println(A.getName());        
        System.out.println(A.getHealth());

        A.Takedamage(79);
    }
}