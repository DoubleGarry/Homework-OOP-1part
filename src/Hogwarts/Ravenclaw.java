package Hogwarts;

public class Ravenclaw extends Hogwarts {
    private int intelligence; // ум
    private int wisdom; // мудрость
    private int wit; // остроумие
    private int creativity; // креативность

    public Ravenclaw(String studentName, int witchcraft, int transgression, int intelligence, int wisdom, int wit, int creativity) {
        super(studentName, witchcraft, transgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;

    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    public int fullPoints(){
        int r = 0;
        r += getIntelligence() + getWisdom() + getWit() + getCreativity() + getPoint();
        return r;
    }

    @Override
    public int getPoint() {
        return super.getPoint();
    }

    @Override
    public String toString() {
        return " ум:" + intelligence +
                "; мудрость:" + wisdom +
                "; остроумие:" + wit +
                "; креативность:" + creativity ;
    }
}