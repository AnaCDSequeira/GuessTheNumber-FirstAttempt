public class Player {

    private String name;
    private int generatedNumber;

    public Player (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getGeneratedNumber() {
        return generatedNumber;
    }

    public void setGeneratedNumber(int generatedNumber) {
        this.generatedNumber = generatedNumber;
    }
}
