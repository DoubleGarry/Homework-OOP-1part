package Hogwarts;

public class Griffindor extends Hogwarts {
    private int nobility; // благородство
    private int honor; // честь
    private int bravery; // храбрость

    public Griffindor(String studentName, int witchcraft, int transgression, int nobility, int honor, int bravery) {
        super(studentName, witchcraft, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
    public int getPoints(){
        int r = 0;
        r += getHonor() + getBravery() + getNobility() + getPoint();
        return r;
    }

    @Override
    public int getPoint() {
        return super.getPoint();
    }

    @Override
    public String toString() {
        return "благородство:" + nobility +
                "; честь:" + honor +
                "; храбрость:" + bravery
                ;
    }
}
