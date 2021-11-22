package Template;

import java.util.ArrayList;
import java.util.Objects;

public class Fight extends Generalization{
    Room selected;
    int reward;
    public void pickContent (Room[] rooms){
        ArrayList<Room> output = new ArrayList<Room>();
        for (Room room : rooms) {
            if (Objects.equals(room.getType(), "Fight")) {
                output.add(room);
            }
        }
        int rand = (int)(Math.random()*output.size());
        System.out.println("Room: " + output.get(rand));
    }

    public void selectReward (int difficulty){
        reward = (difficulty*30)+60;
        System.out.println("Reward: " + reward);
    }
}