package by.algorithmization.oneDimArrays;

public class Task9 {
    public static void main(String[] args) {
        int n = 20;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int) (20 * Math.random());
            System.out.print("a[" + i + "]=" + a[i] + "\t");
        }
        System.out.println();
        // считаем повторы
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i] == a[j]) {
                    c[i]++;
                }
            }
        }
        // находим самое популярное
        int popular = -1;
        for (int i = 0; i < n; i++) {
            if (c[i] > popular) {
                popular = c[i];
            }
            System.out.print("c[" + i + "]=" + c[i] + "\t");
        }
        System.out.println();
        System.out.println("число, которое чаще всего встречалось, в массиве поворялось " + popular + " раз");
        // массив самых популярных
        int counter = 0;
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            if (c[i] == popular) {
                b[counter] = a[i];
                counter++;
            }
        }
        // поиск наименьшего
        int popularMinI = 0;
        for (int i = 0; i < counter; i++) {
            System.out.print("b[" + i + "]=" + b[i] + "\t");
            if (b[i] < b[popularMinI]) {
                popularMinI = i;
            }
        }
        System.out.println();
        System.out.println("наименьшее из самых популярных = " + b[popularMinI]);
    }
}
