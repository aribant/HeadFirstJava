import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// make three sets of words to choose from
		String[] wordListOne = { "24/7", "multi-tier", "30,000 foot", "B-to-B", "win-win", "web-based",
				" pervasive", "smart", "six-sigma", "critical-path", "dynamic" };

		String[] wordListTwo = { "empowered", "sticky", "value-added", "oriented", "centric", "distributed",
				"clustered", "branded", "outside-the-box", "aligned", "targeted", "shared", "cooperative",
				"accelerated" };

		String[] wordListThree = { "process", "tipping-point", "solution", "architecture",
				"core competency", "strategy", "mindshare", "portal", "space", "vision", "paradigm",
				"mission" };

		// find out how many words are in each list
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;

		// generate three random numbers
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);

		// now build a phrase
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

		int compGoInt;
		String compGo;
		String playerGo;

		while (true) {
			System.out.println("You can type 'Exit' to quit the game at any time.");
			System.out.print("Please enter your choice. Rock, Paper or Scissors: ");
			playerGo = input.nextLine();

			if (playerGo.equalsIgnoreCase("Exit"))
				break; // Checks for exit condition.
			else { // GameLogic

				compGoInt = (int) (Math.random() * 3);

				switch (compGoInt) {
				case 0:
					compGo = "1";
					break;
				case 1:
					compGo = "2";
					break;
				case 2:
					compGo = "3";
					break;
				default:
					compGo = "Error";
					System.out.println("Error.");
					break;
				}

				if (playerGo.equals(compGo)) {
				

					System.out.println("What we need is a " + phrase);

				}

				else if ((playerGo.equalsIgnoreCase("1"))
						|| (playerGo.equalsIgnoreCase("3") && compGo.equalsIgnoreCase("Paper"))) {
					System.out.println("What we need is a " + phrase);

				}

				else if ((compGo.equalsIgnoreCase("1") && playerGo.equalsIgnoreCase("Scissors"))
						|| (compGo.equalsIgnoreCase("2") && playerGo.equalsIgnoreCase("Rock"))
						|| (compGo.equalsIgnoreCase("3") && playerGo.equalsIgnoreCase("Paper"))) {
					System.out.println("What we need is a " + phrase);

				}

				else {
					System.out.println("Something has gone wrong!");
					System.out.println("Player chose " + playerGo);
					System.out.println("Computer chose " + compGo);
				}
			}
		}
	}
}