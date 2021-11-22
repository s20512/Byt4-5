package Chain;

public class PlatinumHandler extends RewardHandler
{

    public void fetchReward(long givenAmount)
    {
        long amountOfCoins = givenAmount / 1000;
        if (amountOfCoins > 0)
        {
            if(amountOfCoins >1)
            {
                System.out.println(amountOfCoins + " Platinum Pieces \n");
            }
            else
            {
                System.out.println(amountOfCoins + " Platinum Piece \n");

            }
        }

        long pendingCoinsToBeProcessed = givenAmount % 1000;

        if (pendingCoinsToBeProcessed > 0)
        {
            rewardHandler.fetchReward(pendingCoinsToBeProcessed);

        }

    }

}