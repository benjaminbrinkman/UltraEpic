public class UltraEpic
{
	public static void main(String[] args)
	{
		Entity testEntity = new Entity();
		Test testComponent = new Test(testEntity);
		System.out.println(testComponent.getClassName());
		System.out.println(testEntity == testComponent.getContainingEntity());
	}
}
