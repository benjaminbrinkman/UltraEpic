public class Stats extends Component
{
	private int mAttack;
	private int mDefense;
	private int mWisdom;
	private int mHitPoints;
	
	public Stats(Entity containingEntity)
	{
		super(containingEntity);
		mAttack = 0;
		mDefense = 0;
		mWisdom = 0;
		mHitPoints = 0;
	}
	
	public int getAttack()
	{
		return mAttack;
	}
	
	public int getDefense()
	{
		return mDefense;
	}
	
	public int getWisdom()
	{
		return mWisdom;
	}
	
	public int getHitPoints()
	{
		return mHitPoints;
	}
	
	private void increaseStat(int offset)
	{
		if (offset < 0)
		{
			throw new InvalidArgumentException("You cannot pass a negative offset!  It can only increase the stats!");
		}
	}
	
	public void increaseAttack(int offset)
	{
		increaseStat(offset);
		mAttack += offset;
	}
	
	public void increaseDefense(int offset)
	{
		increaseStat(offset);
		mDefense += offset;
	}
	
	public void increaseWisdom(int offset)
	{
		increaseStat(offset);
		mWisdom += offset;
	}
	
	public void increaseHitPoints(int offset)
	{
		increaseStat(offset);
		mHitPoints += offset;
	}
}
