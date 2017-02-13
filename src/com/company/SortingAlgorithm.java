package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/**
 * Created by Stas on 22.01.2017.
 */

public class SortingAlgorithm {
    private static final int ARRAY_LENTH = 10000; // константа
    private static final int MAX_VALUE = 100; // константа

    public static void main(String[] args) {
        //camel стиль
//        int i = 10;
//        Integer ii = new Integer(i); //Boxing

        int[] unsortedArray = getRandomArray(ARRAY_LENTH);

        //int[] unsortedArray1 = unsortedArray; //- пример неправильной инициализации
        int[] unsortedArray1 = Arrays.copyOf(unsortedArray, unsortedArray.length);
        int[] unsortedArray2 = Arrays.copyOf(unsortedArray, unsortedArray.length);
        int[] unsortedArray3 = Arrays.copyOf(unsortedArray, unsortedArray.length);

        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis()/(1000L*60L*60L*24L*365L)); // UNIX TIME    current TIME   ---- timeStamp
        long timeout = System.currentTimeMillis();

        //printArray(unsortedArray);
        int[] sortedArray = bubbleSort(unsortedArray);
        //printArray(sortedArray);

        System.out.println("---Bubble sort---");
        System.out.println(System.currentTimeMillis() - timeout + " Millis");
        timeout = System.currentTimeMillis();

        //printArray(unsortedArray1);
        sortedArray = selectionSort(unsortedArray1);
        //printArray(sortedArray);

        System.out.println("---Selection sort---");
        System.out.println(System.currentTimeMillis() - timeout + " Millis");
        timeout = System.currentTimeMillis();

        //printArray(unsortedArray2);
        sortedArray = quickSort(unsortedArray2);
        //printArray(sortedArray);
        //System.out.println(Arrays.toString(unsortedArray2));


        System.out.println("---Hoar (quick) sort---");
        System.out.println(System.currentTimeMillis() - timeout + " Millis");
        timeout = System.currentTimeMillis();

        System.out.println("---Convert int[] array to List Integer---");

        List<Integer> listSorted = IntStream.of(unsortedArray3).boxed().collect(Collectors.toList());

        System.out.println(System.currentTimeMillis() - timeout + " Millis");
        timeout = System.currentTimeMillis();

        System.out.println("---Util sort---");
        Collections.sort(listSorted);


        System.out.println(System.currentTimeMillis() - timeout + " Millis");
        timeout = System.currentTimeMillis();
        //System.out.println(listSorted.stream().map(Object::toString).collect(Collectors.joining(", ")));

    }

    static int[] getRandomArray(int lenth) {
        int[] array = new int[ARRAY_LENTH];
        Random random = new Random();
        for (int i = 0; i < ARRAY_LENTH; i++) {
            array[i] = random.nextInt(MAX_VALUE);
        }
        return array;
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    static int[] bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            /*Внешний цикл каждый раз сокращает фрагмент массива,
              так как внутренний цикл каждый раз ставит в конец
               фрагмента максимальный элемент*/
            for (int j = 0; j < i; j++) {
            /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами*/
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr) {
        /*По очереди будем просматривать все подмножества
         элементов массива (0 - последний, 1-последний,
        2-последний,...)*/
        for (int i = 0; i < arr.length; i++) {
            /*Предполагаем, что первый элемент (в каждом
            подмножестве элементов) является минимальным */
            int min = arr[i];
            int min_i = i;
             /*В оставшейся части подмножества ищем элемент,
            который меньше предположенного минимума*/
            for (int j = i + 1; j < arr.length; j++) {
                //Если находим, запоминаем его индекс
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            /*Если нашелся элемент, меньший, чем на текущей позиции,
            меняем их местами*/
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
        return arr;
    }

    //еще один пример инкапсуляции
    static int[] quickSort(int[] arr) {
        qSort(arr, 0, arr.length - 1);
        return arr;
    }

    //static void qSort(int[] А, int low, int high) {   - типичные ошибки наименования, пример опыта
    static void qSort(int[] arr, int first, int last) {
        int i = first;
        int j = last;
        int x = arr[(first + last) / 2];  // x - опорный элемент посредине между first и last
        do {
            while (arr[i] < x) ++i;  // поиск элемента для переноса в старшую часть
            while (arr[j] > x) --j;  // поиск элемента для переноса в младшую часть
            if (i <= j) {
                // обмен элементов местами:
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                // переход к следующим элементам:
                i++;
                j--;
            }
        } while (i < j);
        if (first < j) qSort(arr, first, j); // рекурсия
        if (i < last) qSort(arr, i, last);
    }


}
