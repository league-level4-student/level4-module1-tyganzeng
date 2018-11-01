import java.util.Random;

public class Checkpoint {
	public static void main(String[] args) {
		Integer i = new Random().nextInt(5);
		switch(i) {
		case 0: {
			System.out.println("Zero");
			break;
		}
		case 1: {
			System.out.println("One");
			break;
		}
		case 2: {
			System.out.println("Two");
			break;
		}
		case 3: {
			System.out.println("Three");
			break;
		}
		case 4: {
			System.out.println("Three");
			break;
		}
		default:
			System.out.println("error");
		}
	}
}
