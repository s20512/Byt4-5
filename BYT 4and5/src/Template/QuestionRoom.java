package Template;

import java.util.ArrayList;
import java.util.Objects;

public class QuestionRoom extends Generalization{
    public void pickContent (Room[] rooms){
        ArrayList<Room> output = new ArrayList<Room>();
        for (Room room : rooms) {
            if (Objects.equals(room.getType(), "QuestionRoom")) {
                output.add(room);
            }
        }
        int rand = (int)(Math.random()*output.size());
        System.out.println("Room: " + output.get(rand));
    }

    public void selectReward (int difficulty){
        System.out.println("Reward: " + ((difficulty*21)+40));
    }
}
