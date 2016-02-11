public class Test extends Component
{
	String mClassName;
	
	public Test(Entity containingEntity)
	{
		super(containingEntity);
		mClassName = super.getType();
	}

	public String getClassName()
	{
		return mClassName;
	}
}
