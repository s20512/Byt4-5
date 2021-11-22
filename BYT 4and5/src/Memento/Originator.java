package Memento;


import java.util.ArrayList;

class Originator {
    private State state;

    public void setState(int hp, int mp, String sc) {
        state = new State (hp, mp, sc);
        System.out.println("Originator: Setting state to " + state);
    }

    public Memento save() {
        System.out.println("Originator: Saving to Memento.");
        return new Memento(state);
    }
    public void restore(Memento m) {
        state = m.getState();
        System.out.println("Originator: State after restoring from Memento: " + state);
    }
}
