package Hogwarts;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

                Griffindor studentHarry = new Griffindor("Гарри Поттер", random.nextInt(101), random.nextInt(101),
                random.nextInt(101), random.nextInt(101), random.nextInt(101));
        Griffindor studentHermiona = new Griffindor("Гермиона Грейнджер", random.nextInt(101), random.nextInt(101),
                random.nextInt(101), random.nextInt(101), random.nextInt(101));
        Griffindor studentRon = new Griffindor("Рон Уизли", random.nextInt(101), random.nextInt(101),
                random.nextInt(101), random.nextInt(101), random.nextInt(101));

        Hufflepuff studentZaharia = new Hufflepuff("Захария Смит", random.nextInt(101), random.nextInt(101),
                random.nextInt(101), random.nextInt(101), random.nextInt(101));
        Hufflepuff studentCedric = new Hufflepuff("Седрик Диггори", random.nextInt(101), random.nextInt(101),
                random.nextInt(101), random.nextInt(101), random.nextInt(101));
        Hufflepuff studentJustin = new Hufflepuff("Джастин Финч-Флетчли", random.nextInt(101), random.nextInt(101),
                random.nextInt(101), random.nextInt(101), random.nextInt(101));

        Ravenclaw studentJou = new Ravenclaw("Чжоу Чанг", random.nextInt(101), random.nextInt(101),
                random.nextInt(101), random.nextInt(101), random.nextInt(101),
                random.nextInt(101));
        Ravenclaw studentPadma = new Ravenclaw("Падма Патил", random.nextInt(101), random.nextInt(101),
                random.nextInt(101), random.nextInt(101), random.nextInt(101),
                random.nextInt(101));
        Ravenclaw studentMarcus = new Ravenclaw("Маркус Белби", random.nextInt(101), random.nextInt(101),
                random.nextInt(101), random.nextInt(101), random.nextInt(101),
                random.nextInt(101));

        Slytherin studentDraco = new Slytherin("Драко Малфой", random.nextInt(101), random.nextInt(101),
                random.nextInt(101), random.nextInt(101), random.nextInt(101),
                random.nextInt(101), random.nextInt(101));
        Slytherin studentGraham = new Slytherin("Грэхэм Монтегю", random.nextInt(101), random.nextInt(101),
                random.nextInt(101), random.nextInt(101), random.nextInt(101),
                random.nextInt(101), random.nextInt(101));
        Slytherin studentGregory = new Slytherin("Грегори Гойл", random.nextInt(101), random.nextInt(101),
                random.nextInt(101), random.nextInt(101), random.nextInt(101),
                random.nextInt(101), random.nextInt(101));

        System.out.println("Гриффиндор");
        studentHarry.printInfo();
        studentHermiona.printInfo();
        studentRon.printInfo();
        Griffindor.findBestStudent(studentHarry,studentHermiona);

        System.out.println();
        System.out.println("Пуффендуй");
        studentZaharia.printInfo();
        studentCedric.printInfo();
        studentJustin.printInfo();
        Hufflepuff.findBestStudent(studentZaharia,studentCedric);

        System.out.println();
        System.out.println("Когтевран");
        studentJou.printInfo();
        studentPadma.printInfo();
        studentMarcus.printInfo();
        Ravenclaw.findBestStudent(studentJou,studentMarcus);

        System.out.println();
        System.out.println("Слизерин");
        studentDraco.printInfo();
        studentGraham.printInfo();
        studentGregory.printInfo();
        Slytherin.findBestStudent(studentDraco,studentGraham);
}
}
