package Hogwarts;

public class Hogwarts {
    private String studentName;
    private int witchcraft; // колдовство
    private int transgression; // трансгрессия

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public void setWitchcraft(int witchcraft) {
        this.witchcraft = witchcraft;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public Hogwarts(String studentName, int witchcraft, int transgression) {
        this.studentName = studentName;
        this.witchcraft = witchcraft;
        this.transgression = transgression;

    }
    public int getPoint(){
        int p = 0;
        p += getWitchcraft() + getTransgression();
        return p;
    }
}
