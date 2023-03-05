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

    @Override
    public int getPoint() {
        return super.getPoint();
    }

    public void printInfo() {
        System.out.println(
                "Студент: " + getStudentName() +
                        " - Мощьность колдовства:" + getWitchcraft() +
                        "; Tрансгрессия: " + getTransgression() +
                        "; Хитрость: " + cunning +
                        "; Решительность: " + determination +
                        "; Амбициозность: " + ambition +
                        "; Находчивость: " + resourcefulness +
                        "; Жажда власти: " + lustForPower);
    }

    private static int fullPoints(Slytherin student) {
        return student.getCunning() + student.getDetermination() + student.getAmbition() +
                student.getResourcefulness() + student.getLustForPower() + student.getPoint();
    }

    static void findBestStudent(Slytherin firstStudent, Slytherin secondStudent) {
        if (fullPoints(firstStudent) > fullPoints(secondStudent)) {
            System.out.println("Итого очков: " + fullPoints(firstStudent) + " - " + firstStudent.getStudentName()
                    + " лучший Слизаринец, чем " + secondStudent.getStudentName() + " - Итого очков: " + fullPoints(secondStudent));
        } else if (fullPoints(firstStudent) == fullPoints(secondStudent)) {
            System.out.println("Способности " + firstStudent.getStudentName() + " равны способностям "
                    + secondStudent.getStudentName());
        } else {
            System.out.println("Итого очков: " + fullPoints(secondStudent) + " - " + secondStudent.getStudentName()
                    + " лучший Слизаринец, чем " + firstStudent.getStudentName() + " - Итого очков: " + fullPoints(firstStudent));
        }
    }
}