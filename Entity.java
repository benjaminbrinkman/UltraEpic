import java.util.*;

public class Entity
{
	private Set<Component> mComponents = new HashSet<Component>();
	
	public void addComponent(Component component)
	{
		mComponents.add(component);
	}
}
