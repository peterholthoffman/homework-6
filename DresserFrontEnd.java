import java.util.Scanner;

public class DresserFrontEnd {

	public static Dresser dresser = new Dresser();
	private static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {


		Integer cmd = 0;
		String type;
		String color;

		while (true) {
			System.out.println("Welcome to the dresser!");
			System.out.println("Enter 1: to add an item");
			System.out.println("Enter 2: to remove an item");
			System.out.println("Enter 3: to print out the dresser contents");
			System.out.println("Enter 9: to quit");

			cmd = reader.nextInt();

			switch(cmd) {
				case 1:
					type = getType();
					color = getColor();
					dresser.addItem(new Clothing(type, color));

					break;

				case 2:
// Commented out temporarily to reduce the number of compile time errors.
//					type = getType();
//					color = getColor();
//					dresser.remove(new Clothing(type, color));

					break;

				case 3:
					break;

				case 9:
					System.exit(0);

			}
		}
	}

	private static String getType() {
		System.out.println("Enter the type");
		System.out.println("It may be undergarment, socks, stockings, top, bottom, or cape");
		return reader.next();
	}

	private static String getColor() {
		System.out.println("Enter a color");
		System.out.println("It may be brown, pink, orange, green, blue, purple, or grey");
		return reader.next();
	}

}
