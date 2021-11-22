package Chain;

public class BronzeHandler extends RewardHandler
{

    public void fetchReward(long givenAmount)
    {
        if (givenAmount > 0)
        {
            if(givenAmount >1)
            {
                System.out.println(givenAmount + " Bronze Pieces \n");
            }
            else
            {
                System.out.println(givenAmount + " Bronze Piece \n");

            }
        }

    }

}