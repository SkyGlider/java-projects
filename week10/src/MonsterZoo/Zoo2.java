package MonsterZoo;

import java.util.ArrayList;

public class Zoo2 {

	private ArrayList<Monster> monsters = new ArrayList<Monster>();
	//following must be maintained correctly within this class only
	//several methods below depend on its correctness at any given time
	//current number of monsters in zoo NOT zoo capacity
	private int capacity;


	//CONSTRUCTORS
	public Zoo2(int capacity){
		this.capacity = capacity;

	}

	//ACCESSORS
	public int getCapacity(){ //accessor??? there is no instance variable called capacity
		return this.capacity;
	}

	public int getNumberOfMonsters(){
		return monsters.size();
	}

	//MUTATORS
	//capacity of zoo cannot be changed, Java arrays are of fixed size
	//numberOfMonsters MUST NOT be mutated by the outside world
	//if set incorrectly methods below will either malfunction or
	//cause a run-time crash, this is why we hide data

	//OTHER METHODS
	public int getIndexOfAMonster(String nameToGet){
		int retValue = -1; //default is not found

		for (int i = 0; i < monsters.size(); i++)
			if (monsters.get(i).getName().equals(nameToGet))
				retValue = i;

		return retValue;
	}

	public Monster getAMonsterByIndex(int indexToGet){
		Monster retVal;
		if (indexToGet >= 0 && indexToGet < monsters.size())
			retVal =  monsters.get(indexToGet); //PRIVACY LEAK OUT
		else
			retVal = null;

		return retVal;
	}

	public Monster getAMonsterByName(String nameToGet){
		Monster retVal = null;
		for (int i = 0; i < monsters.size() ; i++)
			if (monsters.get(i).getName().equals(nameToGet))
				retVal = monsters.get(i);

		return retVal; //PRIVACY LEAK OUT
	}

	//an append operation
	public boolean addAMonster(Monster monsterToAdd){
		boolean retValue = true;
		
		if (monsters.size() < capacity){
			monsters.add(monsterToAdd); //PRIVACY LEAK IN
		}
		else
			retValue = false;
		return retValue;
	}

	//an insert operation
	public boolean insertAMonster(Monster monsterToAdd, int indexToAddAt){
		boolean retValue = true;

		if (monsters.size() < capacity &&
				(indexToAddAt >= 0 && indexToAddAt < monsters.size())){
			//create a gap
			//high -> high + 1, high -1 -> high, ... ,
			//indexToAddAt -> indexToAddAt + 1
			monsters.add(indexToAddAt,monsterToAdd);
		}
		else
			retValue = false;
		return retValue;
	}
	
	public boolean removeAMonster(int indexToRemove){
		boolean retValue = true;
		
		if (indexToRemove >= 0 && indexToRemove < monsters.size() ){
			//indexToRemove <- indexToRemove + 1,
			//indexToRemove + 1 <- indexToRemove + 2, ... , high - 1 <- high
			monsters.remove(indexToRemove);
		}
		else
			retValue = false;
		return retValue;
	}

	public boolean fight( Monster aggressor, int aggressorLimbsLost, int aggressorEyesLost, Monster victim, int victimLimbsLost, int victimEyesLost){
		boolean successFight = false;
		int aggressorIndex = this.getIndexOfAMonster(aggressor.getName());
		int victimIndex = this.getIndexOfAMonster(victim.getName());

		if ( aggressorIndex != -1 && victimIndex != -1 ){
			int aggressorLimbs = aggressor.getNumberOfLimbs() - aggressorLimbsLost;
			int aggressorEyes = aggressor.getNumberOfEyes() - aggressorEyesLost;
			int victimLimbs = victim.getNumberOfLimbs() - victimLimbsLost;
			int victimEyes = victim.getNumberOfEyes() - victimEyesLost;

			if (aggressorEyes >= 0 && aggressorLimbs >= 0 && victimEyes >= 0 && victimLimbs >= 0 ){
				if(aggressorLimbs == 0){
					aggressor.setTemperament(Monster.TemperamentEnum.PASSIVE);
				}else{
					aggressor.setTemperament(Monster.TemperamentEnum.AGGRESSIVE);
				}
				aggressor.setNumberofLimbs(aggressorLimbs);
				aggressor.setNumberofEyes(aggressorEyes);
				victim.setNumberofLimbs(victimLimbs);
				victim.setNumberofEyes(victimEyes);
				successFight = true;
			}
		}
		return successFight;
	}

	
	public String toString(){
		String outString;
		
		outString = monsters.size() + " monsters in the zoo";
		
		for (int i = 0; i < monsters.size(); i++)
			outString += "\n\t" + monsters.get(i).toString() + "\n";

		return outString;
	}

	public String toStringShort(){
		String outString;

		outString = monsters.size() + " monsters in the zoo\n";

		for (int i = 0; i < monsters.size(); i++)
			outString += monsters.get(i).toStringShort() + "\n";

		return outString;
	}
}
