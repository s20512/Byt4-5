package Chain;

public class GoldHandler extends RewardHandler
{

    public void fetchReward(long givenAmount)
    {
        long amountOfCoins = givenAmount / 100;
        if (amountOfCoins > 0)
        {
            if(amountOfCoins >1)
            {
                System.out.println(amountOfCoins + " Gold Pieces \n");
            }
            else
            {
                System.out.println(amountOfCoins + " Gold Piece \n");

            }
        }

        long pendingCoinsToBeProcessed = givenAmount % 100;

        if (pendingCoinsToBeProcessed > 0)
        {
            rewardHandler.fetchReward(pendingCoinsToBeProcessed);

        }

    }

}