package guild;

public class Player {
    //•	name: String
    //•	clazz: String
    //•	rank: String – "Trial" by default
    //•	description: String – "n/a" by default
    private String name;
    private String clazz;
    private String rank;
    private String description;

    public Player(String name, String clazz) {
        this.name = name;
        this.clazz = clazz;
        this.rank = "Trial";
        this.description = "n/a";
    }

    public String getName() {
        return name;
    }

    public String getClazz() {
        return clazz;
    }

    public String getRank() {
        return rank;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString(){
        //"Player {name}: {clazz}
        //Rank: {rank}
        //Description: {description}"
        StringBuilder fill = new StringBuilder();

        fill.append(String.format("Player %s: %s", getName(), getClazz())).append(System.lineSeparator());
        fill.append(String.format("Rank: %s", getRank())).append(System.lineSeparator());
        fill.append(String.format("Description: %s", getDescription()));
        return fill.toString();
    }
}
