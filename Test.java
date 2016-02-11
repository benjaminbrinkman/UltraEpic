public class Test extends Component
{
	String mClassName;
	
	public Test()
	{
		mClassName = super.getType();
	}

	public String getClassName()
	{
		return mClassName;
	}
}
