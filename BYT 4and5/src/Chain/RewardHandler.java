package Chain;

public abstract class RewardHandler
{
    RewardHandler rewardHandler;

    public void nextHandler( RewardHandler rewardHandler)
    {
        this.rewardHandler= rewardHandler;
    }

    public abstract void fetchReward( long givenAmount );

}
