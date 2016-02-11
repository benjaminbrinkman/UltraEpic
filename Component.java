public abstract class Component
{
	Entity mContainingEntity;
	
	public Component(Entity containingEntity)
	{
		mContainingEntity = containingEntity;
	}
	
	public String getType()
	{
		return this.getClass().getName();
	}

	public Entity getContainingEntity()
	{
		return mContainingEntity;
	}
}
