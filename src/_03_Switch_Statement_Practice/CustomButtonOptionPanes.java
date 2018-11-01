package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Sunday": 
			System.out.println("The cycle repeats");
			break;
		case "Monday": 
			System.out.println("Oh no");
			break;
		case "Tuesday": 
			System.out.println("Faster..");
			break;
		case "Wednesday": 
			System.out.println("Halfway point");
			break;
		case "Thursday": 
			System.out.println("Almost there");
			break;
		case "Friday": 
			System.out.println("So close!");
			break;
		case "Saturday": 
			System.out.println("Finally!");
			break;
		default:
			System.out.println("Something went wrong");
			break;
		}
	}
}
