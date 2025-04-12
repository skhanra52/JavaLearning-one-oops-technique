package EncapsulationExample;

public class EnhancedPlayer {
    private String fullName;
    private int healthPercentage;
    private String weapon;

    public EnhancedPlayer(String fullName){
        this(fullName, 100, "Sword");
    }

    public  EnhancedPlayer(String fullName, int healthPercentage, String weapon){
        this.fullName = fullName;
        if(healthPercentage <=0){
            this.healthPercentage = 0;
        }else this.healthPercentage = Math.min(healthPercentage, 100);
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        healthPercentage = healthPercentage - damage;
        if (healthPercentage <=0){
            System.out.println("Player knocked out of game");
        }
    }

    public int healthRemaining(){
        return healthPercentage;
    }

    public void restoreHealth(int extraHealth){
        healthPercentage = healthPercentage + extraHealth;
        if(healthPercentage > 100){
            System.out.println("Player restored to 100%");
            healthPercentage = 100;
        }
    }
}
