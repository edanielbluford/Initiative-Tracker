import java.util.Scanner;

public class Program {
	
	Tracker initative = new Tracker();
	Scanner reader = new Scanner(System.in);
	public  void main(String[] args) {
		
		int partyNum;
		// TODO Auto-generated method stub

		//Starts fight, creates fight party.
		System.out.println("How many characters are in this combat?");
		partyNum = reader.nextInt();
		initative.newFight(partyNum);
		
		
		
		
	}

}
