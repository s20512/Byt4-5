package Template;

import java.util.ArrayList;
import java.util.Objects;

public class EliteFight extends Generalization{
    public void pickContent (Room[] rooms){
        ArrayList<Room> output = new ArrayList<Room>();
        for (Room room : rooms) {
            if (Objects.equals(room.getType(), "EliteFight")) {
                output.add(room);
            }
        }
        int rand = (int)(Math.random()*output.size());
        System.out.println("Room: " + output.get(rand));
    }

    public void selectReward (int difficulty){
        System.out.println("Reward: " + ((difficulty*40)+80));
    }
}