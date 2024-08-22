public class GameState {
    private static GameState state;
    private int level;
    private String difficulty;
    private GameState() {
        level = 1;
        difficulty = "Easy";
    }
    public static synchronized GameState getInstance() {
        if (state == null) {
            state = new GameState();
        }
        return state;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public String getDifficulty() {
        return difficulty;
    }
    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
}
