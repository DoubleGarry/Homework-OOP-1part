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

        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария Смит", random.nextInt(101), random.nextInt(101),
                        random.nextInt(101), random.nextInt(101), random.nextInt(101)),
                new Hufflepuff("Седрик Диггори", random.nextInt(101), random.nextInt(101),
                        random.nextInt(101), random.nextInt(101), random.nextInt(101)),
                new Hufflepuff("Джастин Финч-Флетчли", random.nextInt(101), random.nextInt(101),
                        random.nextInt(101), random.nextInt(101), random.nextInt(101)),
        };

        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу Чанг", random.nextInt(101), random.nextInt(101),
                        random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101)),
                new Ravenclaw("Падма Патил", random.nextInt(101), random.nextInt(101),
                        random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101)),
                new Ravenclaw("Маркус Белби", random.nextInt(101), random.nextInt(101),
                        random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101)),
        };

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

        PrintInfo printInfo = new PrintInfo();
        printInfo.print(griffindors);
        printInfo.print(hufflepuffs);
        printInfo.print(ravenclaws);
        printInfo.print(slytherins);
    }
}
