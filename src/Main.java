public class Main {
    static Gryffindor[] gryffindors = new Gryffindor[]{
            new Gryffindor("Гарри", "Поттер", 60, 45, 70, 62, 81),
            new Gryffindor("Гермиона", "Грейнджер", 92, 64, 65, 70, 56),
            new Gryffindor("Рон", "Уизли", 35, 22, 63, 74, 85)
    };
    static Hufflepuff[] hufflepuffs = new Hufflepuff[]{
            new Hufflepuff("Захария", "Смит", 85, 37, 52, 48, 91),
            new Hufflepuff("Седрик", "Диггори", 73, 49, 69, 57, 82),
            new Hufflepuff("Джастин", "Финч-Флетчли", 66, 58, 64, 52, 61)
    };
    static Ravenclaw[] ravenclaws = new Ravenclaw[]{
            new Ravenclaw("Чжоу", "Чанг", 73, 69, 75, 64, 43, 54),
            new Ravenclaw("Падма", "Патил", 69, 55, 64, 84, 51, 43),
            new Ravenclaw("Маркус", "Белби", 49, 67, 54, 23, 81, 23)
    };
    static Slytherin[] slytherins = new Slytherin[]{
            new Slytherin("Драко", "Малфой", 77, 64, 54, 62, 74, 31, 59),
            new Slytherin("Грэхэм", "Монтегю", 37, 24, 47, 49, 56, 52, 47),
            new Slytherin("Грегори", "Гойл", 40, 32, 27, 39, 41, 38, 47)
    };

    public static void main(String[] args) {
        printStudents();
        equalsStudGryf();
        equalsStudHuff();
        equalsStudRav();
        equalsStudSly();
        equalsTwoStud();
    }

    public static void printStudents() {
        Hogwarts[][] students = new Hogwarts[4][];
        students[0] = gryffindors;
        students[1] = hufflepuffs;
        students[2] = ravenclaws;
        students[3] = slytherins;
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].length; j++) {
                System.out.println(students[i][j]);
            }

        }
        System.out.println();
    }

    public static void equalsStudGryf() {
        int stud1 = gryffindors[0].getNobility() + gryffindors[0].getHonesty() + gryffindors[0].getBravery();
        int stud2 = gryffindors[2].getNobility() + gryffindors[2].getHonesty() + gryffindors[2].getBravery();
        if (stud1 > stud2) {
            System.out.println("Лучший гриффиндорец = " + gryffindors[0]);
        } else {
            System.out.println("Лучший гриффиндорец = " + gryffindors[2]);
        }
        System.out.println();
    }

    public static void equalsStudHuff() {
        int stud1 = hufflepuffs[1].getFaithful() + hufflepuffs[1].getHonesty() + hufflepuffs[1].getHardworking();
        int stud2 = hufflepuffs[0].getFaithful() + hufflepuffs[0].getHonesty() + hufflepuffs[0].getHardworking();
        if (stud1 > stud2) {
            System.out.println("Лучший пуффендеуц = " + hufflepuffs[1]);
        } else {
            System.out.println("Лучший пуффендуец = " + hufflepuffs[0]);
        }
        System.out.println();
    }

    public static void equalsStudRav() {
        int stud1 = ravenclaws[1].getCreative() + ravenclaws[1].getWise() + ravenclaws[1].getWit() + ravenclaws[1].getSmart();
        int stud2 = ravenclaws[2].getCreative() + ravenclaws[2].getWise() + ravenclaws[2].getWit() + ravenclaws[2].getSmart();
        if (stud1 > stud2) {
            System.out.println("Лучший когтевранец = " + ravenclaws[1]);
        } else {
            System.out.println("Лучший когтевранец = " + ravenclaws[2]);
        }
        System.out.println();
    }

    public static void equalsStudSly() {
        int stud1 = slytherins[0].getAmbition() + slytherins[0].getIngenuity() + slytherins[0].getDetermination() + slytherins[0].getLustForPower() + slytherins[0].getTrick();
        int stud2 = slytherins[2].getAmbition() + slytherins[2].getIngenuity() + slytherins[2].getDetermination() + slytherins[2].getLustForPower() + slytherins[2].getTrick();
        if (stud1 > stud2) {
            System.out.println("Лучший слизеринец = " + slytherins[0]);
        } else {
            System.out.println("Лучший слизеринец = " + slytherins[2]);
        }
        System.out.println();
    }

    public static void equalsTwoStud() {
        int harry = gryffindors[0].getSpellPower() + gryffindors[0].getTransgression();
        int draco = slytherins[0].getSpellPower() + slytherins[0].getTransgression();
        if (harry > draco) {
            System.out.println("Лучший студент = " + gryffindors[0]);
        } else {
            System.out.println("Лучший студент = " + slytherins[0]);
        }
        System.out.println();
    }
}
