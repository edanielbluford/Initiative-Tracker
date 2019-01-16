import java.util.Scanner;
public class Character {
	Scanner reader = new Scanner(System.in);
	
	private String name;
	private int hitPoints;
	private String status;
	private int initMod;
	private boolean isNPC;
	
	
	public String getName() { return name; }
	   public void setName(String name)
	      { this.name=name; }
	   
	   public int getHitPoints() { return hitPoints; }
	   public void setHitPoints(int hitPoints)
	      { this.hitPoints=hitPoints; }
	   
	   public int getInitMod() { return initMod; }
	   public void setInitMod(int initMod)
	      { this.initMod=initMod; }
	   
	   public String getStatus() { return status; }
	   public void setStatus(String status)
	      { this.status=status; }
	   
	   public boolean getIsNPC() { return isNPC; }
	   public void setIsNPC(boolean isNPC)
	      { this.isNPC=isNPC; }
	   
	   //Default Constructor
	   public Character() {
		   
		   
	   }
	   
	//Loaded Constructor
	   public Character(String characterName, int cHitPoints, String characterStatus, int characterInit, boolean noPC) {
			
		   this.name =characterName; 
			this.hitPoints=cHitPoints;
			this.status =characterStatus;
			this.initMod = characterInit;
			this.isNPC = noPC;
			
		}
	
	  //Changes the Character's HP
	   public int changeHP(int damage) {
		   hitPoints = damage;
		   return this.hitPoints;
		   
	   }
	   
	   //Changes character's status.
	   public String applyStatus(String newStatus) {
		 
		   status = newStatus;
		   return status;
	   }
	   
	   
	   
	   
	   
	

	
	
	
	
	

	
	
	
}

