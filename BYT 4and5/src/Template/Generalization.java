package Template;

import java.util.ArrayList;

abstract class Generalization {

    Generalization next;
    public void GenerateEncounter(Room[] rooms, int difficulty, Generalization enc) {
        pickContent(rooms);
        selectReward(difficulty);
        moveToNextEncounter(enc);
    }
    //following methods return the necessary values, but for the ease of use I added output to console to see the results

    public void pickContent (Room[] rooms){

    }

    public void selectReward (int difficulty){

    } // this will provide the monetary value, that we process in previous function, that uses memento design pattern

    public void moveToNextEncounter(Generalization enc){
        this.next = enc;
    }

}
