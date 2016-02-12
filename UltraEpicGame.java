import java.util.*;

public class UltraEpicGame extends Game
{
	Set<Entity> mEntities = new HashSet<Entity>();
	
	public UltraEpicGame(String playerName)
	{
		mEntities.add(createPlayer(playerName));
		mEntities.add(createCharactor("Noob"));
	}
	
	public Set<Entity> getEntitySet()
	{
		return mEntities;
	}
	
	public void loop()
	{
		Entity[] entityArray = mEntities.toArray(new Entity[0]);
		Entity charactor1 = entityArray[0];
		Entity charactor2 = entityArray[1];
		
		attack(charactor1, charactor2);
		try 
		{
			heal(charactor2);
		}
		catch (IllegalArgumentException iae)
		{
			attack(charactor2, charactor1);
		}
	}
	
	private Entity createPlayer(String playerName)
	{
		Entity player = createCharactor(playerName);
		player.addComponent(new Player(player));
		
		return player;
	}
	
	private Entity createCharactor(String name)
	{
		Entity charactor = new Entity();
		Stats charactorStats = new Stats(charactor);
		
		charactor.addComponent(charactorStats);
		rollStats(charactor);
		charactorStats = (Stats)charactor.getComponentOfType("Stats");
		
		Status charactorStatus = new Status(charactor,
						    charactorStats.getHitPoints(),
						    charactorStats.getWisdom());
		
		charactor.addComponent(new Named(charactor, name));
		charactor.addComponent(new Charactor(charactor));
		charactor.addComponent(charactorStatus);
		
		return charactor;

	}
	
	private void attack(Entity attacker, Entity defender)
	{
		Random diceRoller = new Random();
		Stats attackerStats = (Stats)attacker.getComponentOfType("Stats");
		Stats defenderStats = (Stats)defender.getComponentOfType("Stats");
		Status defenderStatus = (Status)defender.getComponentOfType("Status");
		
		int attackRoll = diceRoller.nextInt(20) + attackerStats.getAttack();
		int defenseRoll = diceRoller.nextInt(20) + attackerStats.getDefense();
		
		if (attackRoll - defenseRoll > 0)
		{
			defenderStatus.damage(attackRoll - defenseRoll);
		}
		
		defender.addComponent(defenderStatus);
		
		mEntities.add(defender);
	}
	
	private void heal(Entity person)
	{
		Random diceRoller = new Random();
		Stats personStats = (Stats)person.getComponentOfType("Stats");
		Status personStatus = (Status)person.getComponentOfType("Status");
		
		if (personStatus.getDivineMana() > 0)
		{
			personStatus.castDivineSpell(1);
			int healRoll = diceRoller.nextInt(4);
			personStatus.heal(healRoll);
		}
		else
		{
			throw new IllegalArgumentException("Not enough mana");
		}
		
		person.addComponent(personStatus);
		
	}
}
