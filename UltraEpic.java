import java.util.Set;

public class UltraEpic
{
	public static void main(String[] args)
	{
		simulatePlaythrough();
	}
	
	private static void simulatePlaythrough()
	{
		UltraEpicGame testUltraEpicGame = new UltraEpicGame("Test Guy");
		Set<Entity> entities = testUltraEpicGame.getEntitySet();
		Entity[] entityArray = entities.toArray(new Entity[0]);
		
		String charactor1Name = ((Named)entityArray[0].getComponentOfType("Named")).getName();
		Status charactor1Status = (Status)entityArray[0].getComponentOfType("Status");
		String charactor2Name = ((Named)entityArray[1].getComponentOfType("Named")).getName();
		Status charactor2Status = (Status)entityArray[1].getComponentOfType("Status");
		
		
		while (charactor1Status.getHitPoints() > 0 && charactor2Status.getHitPoints() > 0)
		{
			System.out.printf("%s's HP is %d\n",
				charactor1Name,
				charactor1Status.getHitPoints());
			System.out.printf("%s's HP is %d\n",
				charactor2Name,
				charactor2Status.getHitPoints());
			
			System.out.printf("%s and %s will now take turns attacking.\n",
				charactor1Name,
				charactor2Name);
			
			testUltraEpicGame.loop();
		}
		
		if (charactor1Status.getHitPoints() <= 0)
		{
			System.out.printf("%s wins!!!\n", charactor2Name);
		}
		else
		{
			System.out.printf("%s wins!!!\n", charactor1Name);
		}
	}
}
