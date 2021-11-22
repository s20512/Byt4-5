package Chain;

public class SilverHandler extends RewardHandler
{

    public void fetchReward(long givenAmount)
    {
        long amountOfCoins = givenAmount / 10;
        if (amountOfCoins > 0)
        {
            if(amountOfCoins >1)
            {
                System.out.println(amountOfCoins + " Silver Pieces \n");
            }
            else
            {
                System.out.println(amountOfCoins + " Silver Piece \n");

            }
        }

        long pendingCoinsToBeProcessed = givenAmount % 10;

        if (pendingCoinsToBeProcessed > 0)
        {
            rewardHandler.fetchReward(pendingCoinsToBeProcessed);

        }

    }

}