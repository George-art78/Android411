package HomeWorks.hm23;

public class Main {
    public static void main(String[] args) {
        Student students[] = new Student[3];
        students[0] = new Student("Виктор", "Вербов", "Gr111", 5);
        students[1] = new Aspirant("Александр", "Невзоров", "Gr222", 4, "Work1");
        students[2] = new Aspirant("Антон", "Бобров", "Gr333", 5, "Work2");

        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + "сумма стипендии: ");
            printSalary(students[i]);
            System.out.println();
        }
    }

    public static void printSalary (Student name) {
        System.out.print(name.salary());
    }
}
