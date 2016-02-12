import java.util.*;

public class Entity
{
	private Set<Component> mComponents = new HashSet<Component>();
	
	public void addComponent(Component component)
	{
		mComponents.add(component);
	}
	
	public Component getComponentOfType(String type)
	{
		for (Component c : mComponents)
		{
			if (c.getClass().getName() == type)
			{
				return c;
			}
		}
		
		throw new IllegalArgumentException(type + " component does not exist in the entity.");
	}
}
