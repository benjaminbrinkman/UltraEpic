public class UltraEpic
{
	public static void main(String[] args)
	{
		Entity testEntity = new Entity();
		Test testComponent = new Test(testEntity);
		
		testEntity.addComponent(testComponent);
		
		System.out.println(testComponent.getClassName());
		System.out.println(testEntity == testComponent.getContainingEntity());
	}
}
