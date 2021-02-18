package by.classes.simplest.task4;

// Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
// Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива
// по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
// Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
// назначения должны быть упорядочены по времени отправления.

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Train [] trains = new Train[5];
        initTrains(trains);
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1 : {
                sortTrainsByNo(trains);
                break;
            }
            case 2 : {
                System.out.print("please, input train number: ");
                int trainNumber = sc.nextInt();
                showTrain(trains, trainNumber);
                break;
            }
            case 3 : {
                sortTrainsByDestination(trains);
                break;
            }
            default: {
                break;
            }
        }
        sc.close();
    }

    static void initTrains(Train [] t) {
        String [] city = {"Brest", "Warsaw", "Moscow", "Berlin", "Brest"};
        for (int i = 0; i < t.length; i++) {
            String destination;
            if (t.length == city.length) {
                destination = city[i];
            } else {
                destination = "train" + i;
            }
            int trainNo = (int) (1 + 100 * Math.random());
            int time = (int) (1000 * Math.random());
            t[i] = new Train(destination, trainNo, time);
        }
        showTrains(t);
        System.out.println("1 - sort trains by number");
        System.out.println("2 - show info about train with input number");
        System.out.println("3 - sort trains by destination");
    }

    static void showTrains(Train [] t) {
        System.out.println("-------+---+-----\ndest\tnum\ttime\n-------+---+-----");
        for (Train train : t) {
            System.out.println(train.getDestination() + "\t" + train.getTrainNumber() + "\t" + train.getTimeInHours());
        }
    }

    static void showTrain(Train [] t, int trainNumber) {
        int j = -1;
        for (int i = 0; i < t.length; i++) {
            if (trainNumber == t[i].getTrainNumber()) {
                j = i;
            }
        }
        if (j != -1) {
            System.out.println("-------+---+----\ndest\tnum\ttime\n-------+---+-----");
            System.out.println(t[j].getDestination() + "\t" + t[j].getTrainNumber() + "\t" + t[j].getTimeInHours());
        } else {
            System.out.println("there isn't train with number " + trainNumber);
        }
    }

    static void sortTrainsByDestination(Train [] t) {
        Arrays.sort(t, Comparator.comparing(Train::getDestination));
        showTrains(t);
    }

    static void sortTrainsByNo(Train [] t) {
        Arrays.sort(t, Comparator.comparing(Train::getTrainNumber));
        showTrains(t);
    }
}
