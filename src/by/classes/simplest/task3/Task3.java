package by.classes.simplest.task3;

// Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы,
// успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа.
// Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        Student [] students = new Student[10];
        initStudents(students);
        showTheBest(students);
    }

    static void initStudents(Student [] s) {
        for (int i = 0; i < s.length; i++) {
            String name = "name" + i;
            int group = (int) (1 + 5 * Math.random());
            int [] marks = new int[]{randomMark(), randomMark(), randomMark(), randomMark(), randomMark()};
            s[i] = new Student(name, group, marks);
        }
    }

    static void showTheBest(Student [] s) {
        System.out.println("** students with good marks (9 - 10) **");
        for (Student student : s) {
            int quantityOfMarks = student.getMarks().length;
            int goodMarks = 0;
            for (int j = 0; j < quantityOfMarks; j++) {
                if (student.getMarks()[j] >= 9) {
                    goodMarks++;
                }
            }
            if (goodMarks == quantityOfMarks) {
                System.out.println(student.getName() + " " + student.getGroup() + " " + Arrays.toString(student.getMarks()));
            }
        }
    }

    static int randomMark() {
        return (int) (7 + 4 * Math.random());
    }
}
