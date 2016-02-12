import java.util.Random;

public abstract class Game
{
	// Leaving empty for now.  Will consider refactoring methods into this class
	// when working on issue #5
	protected Entity rollStats(Entity person)
	{
		Random diceRoller = new Random();
		
		Stats personStats = (Stats)person.getComponentOfType("Stats");
		
		personStats.increaseAttack(diceRoller.nextInt(6) + 1);
		personStats.increaseDefense(diceRoller.nextInt(6) + 1);
		personStats.increaseWisdom(diceRoller.nextInt(6) + 1);
		personStats.increaseHitPoints(diceRoller.nextInt(6) + 1);
		
		person.addComponent(personStats);
		
		return person;
	}
}
