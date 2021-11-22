package Memento;

import java.util.ArrayList;

public class State {
    private int health;
    private int mana;
    private String status;

    public State (int hp, int mp, String sc){
        this.health = hp;
        this.mana = mp;
        this.status = sc;
    }

    public String getStatuses() {
        return status;
    }

    public int getHealth() {
        return health;
    }

    public int getMana() {
        return mana;
    }

    @Override
    public String toString() {
        return  "health=" + health +
                ", mana=" + mana +
                ", statuses=" + status +
                '}';
    }
}
