import javax.swing.JOptionPane;
public class Bamboo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//declare variables
		//ASSUMPTIONS MADE BY ME
		System.out.println("THIS PROGRAM ASSUMES 35HR STREAM WEEK, NO BONUSES, NO GAMBLING. SUB ON TWITCH/YT/TWITTER.");
		//INPUT FROM USER
		String strbamboo = JOptionPane.showInputDialog("enter the amount of bamboo you already have");
			//CONVERT TO INTEGER
			int bamboo = Integer.parseInt(strbamboo);
		//INPUT FROM USER
		String sacc = JOptionPane.showInputDialog("enter the amount of accounts you have");
			//CONVERT TO INTEGER
			int acc = Integer.parseInt(sacc);
		//INPUT FROM USER
		String strtotal = JOptionPane.showInputDialog("enter the amount of bamboo you want");
			//CONVERT TO INTEGER
			int total = Integer.parseInt(strtotal);
			//CONSTANT VARIABLE, WEEKLY BAMBOO SALARY	
			int w = 4850;
		//CALCULATIONS
		double time = (total-bamboo)/(w*acc);
		
		if (time < 0) {
			JOptionPane.showMessageDialog(null, "You already have enough bamboo! :)");
		}
		else {
			System.out.println("It will take you "+time+" weeks to get "+total+" bamboo.");
			double yrtime = (time/52);
			System.out.println("That's "+yrtime+ " years!");
			System.out.println("AWN YOUNGE HASSEYOOOOOO");
		}
	}

}
