import java.util.Scanner;
import Clothing;

public class DresserFrontEnd {

	public static Dresser dresser = new Dresser();
	private static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {


		Integer cmd = 0;
		Type type;
		Color color;

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
					type = getType();
					color = getColor();
					dresser.remove(new Clothing(type, color));

					break;

				case 3:
					break;

				case 9:
					System.exit(0);

			}
		}
	}

	private static Type getType() {
		System.out.println("Enter the type");
		System.out.println("It may be undergarment, socks, stockings, top, bottom, or cape");
		return (Type)reader.next();
	}

	private static Color getColor() {
		System.out.println("Enter a color");
		System.out.println("It may be brown, pink, orange, green, blue, purple, or grey");
		return (Color)reader.next();
	}

}
