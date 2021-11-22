package Template;

public class Room {
    //implementation of this class will change in the future, when we would create many rooms, assign seeds to them
    //and provide all of the information here. For now, we will just assume the seed is equivalent to the whole room

    private String seed;
    private String type;

    public Room(String seed, String type){
        this.seed = seed;
        this.type = type;
    }

    public String getSeed() {
        return seed;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return seed + ", " + type;
    }
}
