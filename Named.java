public class Named extends Component
{
	String mName;
	
	public Named(Entity containingEntity, String name)
	{
		super(containingEntity);
		mName = name;
	}
	
	public String getName()
	{
		return mName;
	}	
}
