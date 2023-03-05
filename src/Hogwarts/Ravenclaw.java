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

    @Override
    public int getPoint() {
        return super.getPoint();
    }

    public void printInfo() {
        System.out.println(
                "Студент: " + getStudentName() +
                        " - Мощьность колдовства:" + getWitchcraft() +
                        "; Tрансгрессия: " + getTransgression() +
                        "; Ум: " + intelligence +
                        "; Мудрость: " + wisdom +
                        "; Остроумие: " + wit +
                        "; Креативность: " + creativity);
    }
    private static int fullPoints(Ravenclaw student) {
        return student.getIntelligence() + student.getWisdom() + student.getWit() +
                student.getCreativity() + student.getPoint();
    }

    static void findBestStudent(Ravenclaw firstStudent, Ravenclaw secondStudent) {
        if (fullPoints(firstStudent) > fullPoints(secondStudent)) {
            System.out.println("Итого очков: " + fullPoints(firstStudent) + " - " + firstStudent.getStudentName()
                    + " лучший Когтевранец, чем " + secondStudent.getStudentName() + " - Итого очков: " + fullPoints(secondStudent));
        } else if (fullPoints(firstStudent) == fullPoints(secondStudent)) {
            System.out.println("Способности " + firstStudent.getStudentName() + " равны способностям "
                    + secondStudent.getStudentName());
        } else {
            System.out.println("Итого очков: " + fullPoints(secondStudent) + " - " + secondStudent.getStudentName()
                    + " лучший Когтевранец, чем " + firstStudent.getStudentName() + " - Итого очков: " + fullPoints(firstStudent));
        }
    }
}