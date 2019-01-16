import java.util.Scanner;
public class Character {
	Scanner reader = new Scanner(System.in);
	
	private String name;
	private int hitPoints;
	private String status;
	private int initMod;
	
	
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
	   public void seStatus(String status)
	      { this.status=status; }
	   
	   public Character() {
		   
		   
	   }
	
	   public Character(String characterName, int cHitPoints, String characterStatus, int characterInit) {
			
		   this.name =characterName; 
			this.hitPoints=cHitPoints;
			this.status =characterStatus;
			this.initMod = characterInit;
			
		}
	
	   
	   public int changeHP(int damage) {
		   
		   
		   
		   hitPoints = damage;
		   return hitPoints;
		   
	   }
	   
	   public String applyStatus(String newStatus) {
		 
		   status = newStatus;
		   return status;
	   }
	   
	   
	   
	   
	   
	

	
	
	
	
	

	
	
	
}

