public class Card {
    private String power = "N/A";
    private String toughness = "N/A";
    private int cmc = 0;
    private String type = "";
    private Colors color = Colors.BLACK;
    private String name = "";
    private boolean commander = false;

    public Card()
    {
    }

    public Card(String power, String toughness, int cmc, String type, Colors color, String name, boolean commander) {
        this.power = power;
        this.toughness = toughness;
        this.cmc = cmc;
        this.type = type;
        this.color = color;
        this.name = name;
        this.commander = commander;
    }

    public boolean isCommander() {
        return commander;
    }

    public void setCommander(boolean commander) {
        this.commander = commander;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getToughness() {
        return toughness;
    }

    public void setToughness(String toughness) {
        this.toughness = toughness;
    }

    public int getCmc() {
        return cmc;
    }

    public void setCmc(int cmc) {
        this.cmc = cmc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", cmc=" + cmc +
                ", type='" + type + '\'' +
                ", color=" + color +
                ", power='" + power + '\'' +
                ", toughness='" + toughness + '\'' +
                ", commander=" + commander +
                '}';
    }
}
