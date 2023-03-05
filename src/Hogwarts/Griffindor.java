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

    @Override
    public int getPoint() {
        return super.getPoint();
    }

    private static int fullPoints(Griffindor student) {
        return student.getNobility() + student.getHonor() + student.getBravery() + student.getPoint();
    }

    public void printInfo() {
        System.out.println(
                "Студент: " + getStudentName() +
                        " - Мощьность колдовства:" + getWitchcraft() +
                        "; Tрансгрессия: " + getTransgression() +
                        "; Благородство: " + nobility +
                        "; Честь: " + honor +
                        "; Храбрость: " + bravery +
                        ";");
    }


    static void findBestStudent(Griffindor firstStudent, Griffindor secondStudent) {
        if (fullPoints(firstStudent) > fullPoints(secondStudent)) {
            System.out.println("Итого очков: " + fullPoints(firstStudent) + " - " + firstStudent.getStudentName()
                    + " лучший Грифиндорец, чем " + secondStudent.getStudentName() + " - Итого очков: " + fullPoints(secondStudent));
        } else if (fullPoints(firstStudent) == fullPoints(secondStudent)) {
            System.out.println("Способности " + firstStudent.getStudentName() + " равны способностям "
                    + secondStudent.getStudentName());
        } else {
            System.out.println("Итого очков: " + fullPoints(secondStudent) + " - " + secondStudent.getStudentName()
                    + " лучший Грифиндорец, чем " + firstStudent.getStudentName() + " - Итого очков: " + fullPoints(firstStudent));
        }
    }
}
