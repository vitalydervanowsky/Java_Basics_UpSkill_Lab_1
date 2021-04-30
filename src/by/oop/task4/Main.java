// Создать консольное приложение, удовлетворяющее следующим требованиям:
//• Приложение должно быть объектно-, а не процедурно-ориентированным.
//• Каждый класс должен иметь отражающее смысл название и информативный состав.
//• Наследование должно применяться только тогда, когда это имеет смысл.
//• При кодировании должны быть использованы соглашения об оформлении кода java code convention.
//• Классы должны быть грамотно разложены по пакетам.
//• Консольное меню должно быть минимальным.
//• Для хранения данных можно использовать файлы.
// Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
// дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
// выбора сокровищ на заданную сумму.

package by.oop.task4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int quantity = 100;
        ArrayList<Treasure> dragonsTreasure = createTreasureList(quantity);
        System.out.println(dragonsTreasure);
        System.out.println("The most valuable treasure is " + mostValuableTreasure(dragonsTreasure));
        int min = 300;
        int max = 400;
        findTreasureInRange(dragonsTreasure, min, max);
    }

    private static void findTreasureInRange(ArrayList<Treasure> dragonsTreasure, int min, int max) {
        ArrayList<Treasure> list = new ArrayList<>();
        for (Treasure treasure : dragonsTreasure) {
            if (treasure.getCost() > min && treasure.getCost() < max) {
                list.add(treasure);
            }
        }
        if (list.isEmpty()) {
            System.out.println("There is no treasures in range [" + min + ".." + max + "]");
        } else {
            System.out.println("Treasures in range [" + min + ".." + max + "]:");
            System.out.println(list);
        }
    }

    private static Treasure mostValuableTreasure(ArrayList<Treasure> dragonsTreasure) {
        Treasure maxCostTreasure = dragonsTreasure.get(0);
        for (Treasure treasure : dragonsTreasure) {
            if (maxCostTreasure.getCost()< treasure.getCost()) {
                maxCostTreasure = treasure;
            }
        }
        return maxCostTreasure;
    }

    private static ArrayList<Treasure> createTreasureList(int quantity) {
        ArrayList<Treasure> treasureList = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            Treasure treasure = new Treasure((int)(1000 * Math.random()));
            treasureList.add(treasure);
        }
        return treasureList;
    }
}
