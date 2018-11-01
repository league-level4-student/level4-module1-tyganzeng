package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	public static void displayZodiac(Zodiac z) {
		switch(z) {
		case ARIES:{
			JOptionPane.showMessageDialog(null, "Aries");
			System.out.println("Aries");
			break;
		}
		case TAURUS: {
			JOptionPane.showMessageDialog(null, "Taurus");
			System.out.println("Taurus");
			break;
		}
		case GEMINI:{
			JOptionPane.showMessageDialog(null, "Gemini");
			System.out.println("Gemini");
			break;
		}
		case CANCER: {
			JOptionPane.showMessageDialog(null, "Cancer");
			System.out.println("Cancer");
			break;
		}
		case LEO: {
			JOptionPane.showMessageDialog(null, "Leo");
			System.out.println("Leo");
			break;
		}
		case VIRGO: {
			JOptionPane.showMessageDialog(null, "Virgo");
			System.out.println("Virgo");
			break;
		}
		case LIBRA: {
			JOptionPane.showMessageDialog(null, "Libra");
			System.out.println("Libra");
			break;
		}
		case SCORPIO: {
			JOptionPane.showMessageDialog(null, "Scorpio");
			System.out.println("Scorpio");
			break;
		}
		case SAGITTARIUS: {
			JOptionPane.showMessageDialog(null, "Sagittarius");
			System.out.println("Aries");
			break;
		}
		case CAPRICORN: {
			JOptionPane.showMessageDialog(null, "Capricorn");
			System.out.println("Sagittarius");
			break;
		}
		case AQUARIUS: {
			JOptionPane.showMessageDialog(null, "Aquarius");
			System.out.println("Aquarius");
			break;
		}
		case PISCES: {
			JOptionPane.showMessageDialog(null, "Pisces");
			System.out.println("Pisces");
			break;
		}
		default: {
			System.out.println("error");
			break;
		}
		}
	// 3. Make a main method to test your method
	}
	
	public static void main(String[] args) {
		Zodiac z = Zodiac.PISCES;
		
		displayZodiac(z);
	}
}
