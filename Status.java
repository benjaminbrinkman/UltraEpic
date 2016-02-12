public class Status extends Component
{
	private int mHitPoints;
	private int mDivineMana;
	
	public Status(Entity containingEntity, int maxHitPoints, int wisdom)
	{
		super(containingEntity);
		mHitPoints = maxHitPoints;
		mDivineMana = wisdom;
	}
	
	public int getHitPoints()
	{
		return mHitPoints;
	}
	
	public void heal(int offset)
	{
		mHitPoints += offset;
	}
	
	public void damage(int offset)
	{
		mHitPoints -= offset;
	}
	
	public boolean isDestroyed()
	{
		return mHitPoints <= 0;
	}
	
	public int getDivineMana()
	{
		return mDivineMana;
	}
	
	public void replenishDivineMana(int offset)
	{
		mDivineMana += offset;
	}
	
	public void castDivineSpell(int offset)
	{
		mDivineMana -= offset;
	}
}
