package Chain;

public class RewardGiving
{
    private static PlatinumHandler platinumHandler = new PlatinumHandler();
    private static GoldHandler goldHandler = new GoldHandler();
    private static SilverHandler silverHandler = new SilverHandler();
    private static BronzeHandler bronzeHandler = new BronzeHandler();


    static
    {
        platinumHandler.nextHandler(goldHandler);
        goldHandler.nextHandler(silverHandler);
        silverHandler.nextHandler(bronzeHandler);
    }

    public void reward( long givenAmount )
    {
        platinumHandler.fetchReward(givenAmount);
    }
}