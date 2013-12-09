package slang.dicegame;

import java.util.ArrayList;
import java.util.List;

public class Game {
	
	private List<Player> players = new ArrayList<>();
	private Integer currentPlayer;
	
	public Game(int numPlayers) {
		for (int i = 0; i < numPlayers; i++) {
			players.add(new Player("Player " + i));
		}
	}
	
	private void nextPlayer() {
		if (currentPlayer < players.size() - 1) {
			currentPlayer++; 
		} else {
			currentPlayer = 0;
		}
	}
	
	public void start() {
		currentPlayer = 0;
	}
	
	public void rollDice(int faces) {
		if (faces > 1) {
			players.get(currentPlayer).add(faces);
		}
		if (faces < 6) {
			nextPlayer();
		}
	}
	
	public void reportScore() {
		for (Player p : players) {
			p.reportScore();
		}
	}
}
