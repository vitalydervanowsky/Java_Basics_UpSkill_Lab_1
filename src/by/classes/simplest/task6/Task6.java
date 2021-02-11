package by.classes.simplest.task6;

// Составьте описание класса для представления времени. Предусмотрте возможности установки времени
// и изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений.
// В случае недопустимых значений полей поле устанавливается в значение 0.
// Создать методы изменения времени на заданное количество часов, минут и секунд.

public class Task6 {
    public static void main(String[] args) {
        Time t = new Time();
        t.setTime(20560); // in seconds
        System.out.println(t.getTime());
        System.out.println(t.toString());
        t.setHours(7);
        t.setMinutes(2);
        t.setSeconds(17);
    }
}
