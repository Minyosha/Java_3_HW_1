import fruits.Apple;
import fruits.Orange;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Создание массива и печать
        int p[] = new int[5];

        for (int i = 0; i < p.length; i++) {
            p[i] = i;
            System.out.println(p[i]);
        }
        int a = 0;

        System.out.println();

        // Замена элементов
        for (int i = 0; i < p.length - 1; i = i + 2) {
            a = p[i];
            p[i] = p[i + 1];
            p[i + 1] = a;
        }

        // Печать нового массива
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i]);
        }
        System.out.println();

        // Переделка в ArrayList и печать
        ArrayList array = new ArrayList();
        for (int i = 0; i < p.length; i++) {
            array.add(p[i]);
            System.out.println(p[i]);
        }



        Box<Apple> boxOfApples1 = boxOfApples(10);
        Box<Apple> boxOfApples2 = boxOfApples(5);
        Box<Orange> boxOfOranges1 = boxOfOranges(10);


        System.out.println("Равны ли коробки по весу? " + boxOfApples1.compareWeight(boxOfOranges1));

        System.out.println("boxOfApples1 вес: " + boxOfApples1.getBoxWeight() + ", кол-во фруктов: " + boxOfApples1.getFruits());
        System.out.println("boxOfApples2 вес: " + boxOfApples2.getBoxWeight() + ", кол-во фруктов: " + boxOfApples2.getFruits());

        // Пересыпаем
        System.out.println("Пересыпаем");
        boxOfApples1.fillBox(boxOfApples2);

        System.out.println("boxOfApples1 вес: " + boxOfApples1.getBoxWeight() + ", кол-во фруктов: " + boxOfApples1.getFruits());
        System.out.println("boxOfApples2 вес: " + boxOfApples2.getBoxWeight() + ", кол-во фруктов: " + boxOfApples2.getFruits());
        System.out.println("boxOfOranges1 вес: " + boxOfOranges1.getBoxWeight() + ", кол-во фруктов: " + boxOfOranges1.getFruits());



    }



    public static Box<Apple> boxOfApples ( int count){

        Box<Apple> boxOfApples = new Box<>(new Apple());
        boxOfApples.addFruits(count);


        return boxOfApples;
    }

    public static Box<Orange> boxOfOranges ( int count){

        Box<Orange> boxOfOranges = new Box<>(new Orange());
        boxOfOranges.addFruits(count);

        return boxOfOranges;
    }

}
