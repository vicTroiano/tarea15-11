public class Player {
    private String name;
    private String position;
    private int goalCounter;
    private int matchCounter;

    public void setName(String name) {
        this.name = name;
        return;

    }

    public String getName() {
        return this.name;
    }

    public void setPosition(String position) {
        this.position = position;
        return;
    }

    public String getPosition() {
        return position;
    }

    public void setGoalCounter(int goalCounter) {
        this.goalCounter = goalCounter;
    }

    public int getGoalCounter() {
        return goalCounter;
    }

    public void setMatchCounter(int matchCounter) {
        this.matchCounter = matchCounter;
    }

    public int getMatchCounter() {
        return matchCounter;
    }

}
