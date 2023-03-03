package Hogwarts;

public class Hufflepuff extends Hogwarts {
    private int diligence; // усердие
    private int loyalty; // верность
    private int honesty; //чесность

    public Hufflepuff(String studentName, int witchcraft, int transgression, int diligence, int loyalty, int honesty) {
        super(studentName, witchcraft, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;

    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    public int fullPoints(){
        int r = 0;
        r += getDiligence() + getHonesty() + getLoyalty() + getPoint();
        return r;
    }

    @Override
    public int getPoint() {
        return super.getPoint();
    }

    @Override
    public String toString() {
        return
                " усердие:" + diligence +
                        "; верность:" + loyalty +
                        "; чесность:" + honesty ;
    }
}