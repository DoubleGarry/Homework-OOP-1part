package Hogwarts;

public class Slytherin extends Hogwarts {
    private int cunning; // хитрость
    private int determination; // решительность
    private int ambition; // амбициозность
    private int resourcefulness; // находчивость
    private int lustForPower; // жажда власти

    public Slytherin(String studentName, int witchcraft, int transgression, int cunning, int determination, int ambition,
                     int resourcefulness, int lustForPower) {
        super(studentName, witchcraft, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
    public int getPoints(){
        int r = 0;
        r += getCunning() + getDetermination() + getAmbition() + getResourcefulness() + getLustForPower() + getPoint();
        return r;
    }

    @Override
    public int getPoint() {
        return super.getPoint();
    }

    @Override
    public String toString() {
        return "хитрость:" + cunning +
                "; решительность:" + determination +
                "; амбициозность:" + ambition +
                "; находчивость:" + resourcefulness +
                "; жажда власти:" + lustForPower ;
    }
}