package Hogwarts;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Гриффиндор");
        Griffindor[] griffindors = {
                new Griffindor("Гарри Поттер", random.nextInt(101), random.nextInt(101),
                        random.nextInt(101), random.nextInt(101), random.nextInt(101)),
                new Griffindor("Гермиона Грейнджер", random.nextInt(101), random.nextInt(101),
                        random.nextInt(101), random.nextInt(101), random.nextInt(101)),
                new Griffindor("Рон Уизли", random.nextInt(101), random.nextInt(101),
                        random.nextInt(101), random.nextInt(101), random.nextInt(101)),
        };
        for (Griffindor griffindor : griffindors) {
            System.out.println("Студент: " + griffindor.getStudentName() + " - Мощьность колдовства:" + griffindor.getWitchcraft()
                    + "; трансгрессия:" + griffindor.getTransgression() + "; " + griffindor + " Итого баллов:" + griffindor.getPoints());
        }

        System.out.println();
        System.out.println("Пуффендуй");
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария Смит", random.nextInt(101), random.nextInt(101),
                        random.nextInt(101), random.nextInt(101), random.nextInt(101)),
                new Hufflepuff("Седрик Диггори", random.nextInt(101), random.nextInt(101),
                        random.nextInt(101), random.nextInt(101), random.nextInt(101)),
                new Hufflepuff("Джастин Финч-Флетчли", random.nextInt(101), random.nextInt(101),
                        random.nextInt(101), random.nextInt(101), random.nextInt(101)),
        };
        for (Hufflepuff hufflepuff : hufflepuffs) {
            System.out.println("Студент: " + hufflepuff.getStudentName() + " - Мощьность колдовства:" + hufflepuff.getWitchcraft()
                    + "; трансгрессия:" + hufflepuff.getTransgression() + "; " + hufflepuff + " Итого баллов:" + hufflepuff.getPoints());
        }

        System.out.println();
        System.out.println("Когтевран");
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу Чанг", random.nextInt(101), random.nextInt(101),
                        random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101)),
                new Ravenclaw("Падма Патил", random.nextInt(101), random.nextInt(101),
                        random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101)),
                new Ravenclaw("Маркус Белби", random.nextInt(101), random.nextInt(101),
                        random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101)),
        };
        for (Ravenclaw ravenclaw : ravenclaws) {
            System.out.println("Студент: " + ravenclaw.getStudentName() + " - Мощьность колдовства:" + ravenclaw.getWitchcraft()
                    + "; трансгрессия:" + ravenclaw.getTransgression() + "; " + ravenclaw + " Итого баллов:" + ravenclaw.getPoints());
        }

        System.out.println();
        System.out.println("Слизерин");
        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой", random.nextInt(101), random.nextInt(101),
                        random.nextInt(101), random.nextInt(101), random.nextInt(101),
                        random.nextInt(101), random.nextInt(101)),
                new Slytherin("Грэхэм Монтегю", random.nextInt(101), random.nextInt(101),
                        random.nextInt(101), random.nextInt(101), random.nextInt(101),
                        random.nextInt(101), random.nextInt(101)),
                new Slytherin("Грегори Гойл", random.nextInt(101), random.nextInt(101),
                        random.nextInt(101), random.nextInt(101), random.nextInt(101),
                        random.nextInt(101), random.nextInt(101)),
        };
        for (Slytherin slytherin : slytherins) {
            System.out.println("Студент: " + slytherin.getStudentName() + " - Мощьность колдовства:" + slytherin.getWitchcraft()
                    + "; трансгрессия:" + slytherin.getTransgression() + "; " + slytherin + " Итого баллов:" + slytherin.getPoints());
        }
    }
}
