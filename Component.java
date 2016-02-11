public abstract class Component
{
	public String getType()
	{
		return this.getClass().getName();
	}
}
