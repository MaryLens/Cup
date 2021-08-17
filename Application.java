
public class Application {

	public static void main(String[] args) {
		cup.printInfo();

	}

}

//////////////////////////////////////
//Parent class
class cup {
	static int volume_mL = 500;

	static void printInfo() {
		int fill = 100 * drink.volume_mL / volume_mL;
		if (fill < 100 && fill >= 0) {
			System.out.printf("=========Cup(%3dmL)========\n", volume_mL);
			drink.printInfo();
			System.out.println(" (takes " + fill + " %) -");
			System.out.println("===========================");
		} else if (fill >= 100) {
			System.out.println("Tea spilled(");
		} else {
			System.out.println("You broke physics...");
		}
	}

	// child class
	static class drink {
		static String name = "Tea";
		static int volume_mL = 250;

		static void printInfo() {
			System.out.print("- Drink: " + name);
		}
	}
}