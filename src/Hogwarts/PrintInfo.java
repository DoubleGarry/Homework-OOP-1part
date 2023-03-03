package Hogwarts;

public class PrintInfo {
    public void print(Griffindor[] griffindors) {
        for (Griffindor griffindor : griffindors) {
            System.out.println("Студент: " + griffindor.getStudentName() + " - Мощьность колдовства:" + griffindor.getWitchcraft()
                    + "; трансгрессия:" + griffindor.getTransgression() + "; " + griffindor + " Итого очков:" + griffindor.fullPoints());
        }

        System.out.println();
        System.out.println("Пуффендуй");
    }
    public void print(Hufflepuff[] hufflepuffs) {
        for (Hufflepuff hufflepuff : hufflepuffs) {
            System.out.println("Студент: " + hufflepuff.getStudentName() + " - Мощьность колдовства:" + hufflepuff.getWitchcraft()
                    + "; трансгрессия:" + hufflepuff.getTransgression() + "; " + hufflepuff + " Итого очков:" + hufflepuff.fullPoints());
        }

        System.out.println();
        System.out.println("Когтевран");
    }
    public void print(Ravenclaw[] ravenclaws) {
        for (Ravenclaw ravenclaw : ravenclaws) {
            System.out.println("Студент: " + ravenclaw.getStudentName() + " - Мощьность колдовства:" + ravenclaw.getWitchcraft()
                    + "; трансгрессия:" + ravenclaw.getTransgression() + "; " + ravenclaw + " Итого очков:" + ravenclaw.fullPoints());
        }

        System.out.println();
        System.out.println("Слизерин");
    }
    public void print(Slytherin[] slytherins) {
        for (Slytherin slytherin : slytherins) {
            System.out.println("Студент: " + slytherin.getStudentName() + " - Мощьность колдовства:" + slytherin.getWitchcraft()
                    + "; трансгрессия:" + slytherin.getTransgression() + "; " + slytherin + " Итого очков:" + slytherin.fullPoints());
        }
    }
}
