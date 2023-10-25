package Demo;

public class Skill {
    private String name;
    private int yoe;
    public Skill(){
    }

    public Skill(String name, int yoe) {
        this.name = name;
        this.yoe = yoe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYoe() {
        return yoe;
    }

    public void setYoe(int yoe) {
        this.yoe = yoe;
    }
}
