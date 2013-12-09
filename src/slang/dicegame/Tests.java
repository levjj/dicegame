package slang.dicegame;

public class Tests {
	public static void main(String[] args) {
		Tests t = new Tests();
		switch (args[0]) {
		case "testS61":
			t.testS61();
			return;
		case "testS62":
			t.testS62();
			return;
		case "testS51":
			t.testS51();
			return;
		case "testS52":
			t.testS52();
			return;
		case "testS15":
			t.testS15();
			return;
		case "testS161":
			t.testS161();
			return;
		case "testS42X":
			t.testS42X();
			return;
		case "testM61X":
			t.testM61X();
			return;
		case "testM62X":
			t.testM62X();
			return;
		case "testM51X":
			t.testM51X();
			return;
		case "testM52":
			t.testM52();
			return;
		case "testM15X":
			t.testM15X();
			return;
		case "testM152":
			t.testM152();
			return;
		case "testM162X":
			t.testM162X();
			return;
		case "testM161X":
			t.testM161X();
			return;
		case "testM1612":
			t.testM1612();
			return;
		case "testM42X":
			t.testM42X();
			return;
		}
	}

	// -------- Singleplayer --------

	private void testS61() {
		Game game = new Game(1);
		game.start();
		game.rollDice(6);
		game.rollDice(1);
		game.reportScore();
	}

	private void testS62() {
		Game game = new Game(1);
		game.start();
		game.rollDice(6);
		game.rollDice(2);
		game.reportScore();
	}

	private void testS51() {
		Game game = new Game(1);
		game.start();
		game.rollDice(5);
		game.rollDice(1);
		game.reportScore();
	}

	private void testS52() {
		Game game = new Game(1);
		game.start();
		game.rollDice(5);
		game.rollDice(2);
		game.reportScore();
	}

	private void testS15() {
		Game game = new Game(1);
		game.start();
		game.rollDice(1);
		game.rollDice(5);
		game.reportScore();
	}

	private void testS161() {
		Game game = new Game(1);
		game.start();
		game.rollDice(1);
		game.rollDice(6);
		game.rollDice(1);
		game.reportScore();
	}

	private void testS42X() {
		Game game = new Game(1);
		game.rollDice(4); // fail
		game.rollDice(2);
		game.reportScore();
	}

	// -------- Multiplayer --------

	private void testM61X() {
		Game game = new Game(2);
		game.start();
		game.rollDice(6);
		game.rollDice(1);
		game.reportScore(); // fail
	}

	private void testM62X() {
		Game game = new Game(2);
		game.start();
		game.rollDice(6);
		game.rollDice(2);
		game.reportScore(); // fail
	}

	private void testM51X() {
		Game game = new Game(2);
		game.start();
		game.rollDice(5);
		game.rollDice(1);
		game.reportScore(); // fail
	}

	private void testM52() {
		Game game = new Game(2);
		game.start();
		game.rollDice(5);
		game.rollDice(2);
		game.reportScore();
	}

	private void testM15X() {
		Game game = new Game(2);
		game.start();
		game.rollDice(1);
		game.rollDice(5);
		game.reportScore(); // fail
	}

	private void testM152() {
		Game game = new Game(2);
		game.start();
		game.rollDice(1);
		game.rollDice(5);
		game.rollDice(2);
		game.reportScore();
	}

	private void testM162X() {
		Game game = new Game(2);
		game.start();
		game.rollDice(1);
		game.rollDice(6);
		game.rollDice(2);
		game.reportScore(); // fail
	}

	private void testM161X() {
		Game game = new Game(2);
		game.start();
		game.rollDice(1);
		game.rollDice(6);
		game.rollDice(1);
		game.reportScore(); // fail
	}

	private void testM1612() {
		Game game = new Game(2);
		game.start();
		game.rollDice(1);
		game.rollDice(6);
		game.rollDice(1);
		game.rollDice(2);
		game.reportScore();
	}

	private void testM42X() {
		Game game = new Game(2);
		game.rollDice(4); // fail
		game.rollDice(2);
		game.reportScore();
	}

}
