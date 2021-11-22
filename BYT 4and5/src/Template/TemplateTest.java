package Template;

public class TemplateTest {
    public static void main(String[] args) {
        Room[] rooms = new Room[]{  new Room("Castle_0x01", "QuestionRoom"),
                                    new Room("Castle_0x02", "Fight"),
                                    new Room("Castle_0x03", "BossFight"),
                                    new Room("Castle_0x04", "EliteFight"),
                                    new Room("Castle_0x05", "Fight"),
                                    new Room("Castle_0x06", "QuestionRoom"),
                                    new Room("Castle_0x07", "QuestionRoom")};
        Generalization fight = new Fight();
        Generalization next = new QuestionRoom();
        fight.GenerateEncounter(rooms, 3, next);
        next.GenerateEncounter(rooms, 5, null);
    }


}
