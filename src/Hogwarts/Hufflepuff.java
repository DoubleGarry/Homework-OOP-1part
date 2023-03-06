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

    @Override
    public int getPoint() {
        return super.getPoint();
    }
    public void printInfo() {
        System.out.println(
                "Студент: " + getStudentName() +
                        " - Мощьность колдовства:" + getWitchcraft() +
                        "; Tрансгрессия: " + getTransgression() +
                        "; Усердие: " + diligence +
                        "; Верность: " + loyalty +
                        "; Чесность: " + honesty);
    }
    private int fullPoints() {
        return diligence + honesty + loyalty + this.getPoint();
    }

    static void findBestStudent(Hufflepuff firstStudent, Hufflepuff secondStudent) {
        if (firstStudent.fullPoints() > secondStudent.fullPoints()) {
            System.out.println("Итого очков: " + firstStudent.fullPoints() + " - " + firstStudent.getStudentName()
                    + " лучший Пуффедуец, чем " + secondStudent.getStudentName() + " - Итого очков: " + secondStudent.fullPoints());
        } else if (firstStudent.fullPoints() == secondStudent.fullPoints()) {
            System.out.println("Способности " + firstStudent.getStudentName() + " равны способностям "
                    + secondStudent.getStudentName());
        } else {
            System.out.println("Итого очков: " + secondStudent.fullPoints() + " - " + secondStudent.getStudentName()
                    + " лучший Пуффендуец, чем " + firstStudent.getStudentName() + " - Итого очков: " + firstStudent.fullPoints());
        }
    }
}