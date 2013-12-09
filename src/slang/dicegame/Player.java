package slang.dicegame;

class Player {
	private Integer score;
	private String name;
	
	public Player(String name) {
		this.name = name;
	}
	
	public void add(int s) {
		if (score == null) {
			score = s;
		} else {
			score += s;
		}
	}

	public void reportScore() {
		System.out.printf("%s: %d\n", name, (int)score);
	}
}