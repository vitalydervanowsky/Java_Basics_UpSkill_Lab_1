package by.classes.simplest.task6;

// Составьте описание класса для представления времени. Предусмотрте возможности установки времени
// и изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений.
// В случае недопустимых значений полей поле устанавливается в значение 0.
// Создать методы изменения времени на заданное количество часов, минут и секунд.

public class Time {
    private int time;

    public int getTime() {
        return time;
    }

    public int [] toHMS() {
        int [] a = new int[3];
        a[0] = this.time / 3600;
        a[1] = (this.time - a[0] * 3600) / 60;
        a[2] = this.time % 60;
        return a;
    }

    public String toString() {
        int [] t = toHMS();
        String h;
        String m;
        String s;
        if (t[0] < 10) {
            h = "0" + t[0];
        } else {
            h = "" + t[0];
        }
        if (t[1] < 10) {
            m = ":0" + t[1];
        } else {
            m = ":" + t[1];
        }
        if (t[2] < 10) {
            s = ":0" + t[2];
        } else {
            s = ":" + t[2];
        }
        return h + m + s;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setHours(int i) {
        if (i < 0) {
            System.out.println("incorrect value \"" + i + "\" hours. hours => 0");
            i = 0;
        }
        int [] t = toHMS();
        int newSeconds = i * 3600 + t[1] * 60 + t[2];
        setTime(newSeconds);
        System.out.println(toString());
    }

    public void setMinutes(int i) {
        if (i < 0 || i >= 60) {
            System.out.println("incorrect value \"" + i + "\" minutes. minutes => 0");
            i = 0;
        }
        int [] t = toHMS();
        int newSeconds = t[0] * 3600 + i * 60 + t[2];
        setTime(newSeconds);
        System.out.println(toString());
    }

    public void setSeconds(int i) {
        if (i < 0 || i >= 60) {
            System.out.println("incorrect value \"" + i + "\" minutes. seconds => 0");
            i = 0;
        }
        int [] t = toHMS();
        int newSeconds = t[0] * 3600 + t[1] * 60 + i;
        setTime(newSeconds);
        System.out.println(toString());
    }
}
