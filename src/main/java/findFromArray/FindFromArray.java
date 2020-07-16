package findFromArray;

import java.util.Arrays;

public class FindFromArray {
    public static void main(String[] args) {
        //Дан массив из чисел:
        int[] numbers = {2, 5, 6, 23, 3, 8, 22, 75, 4, -8, 35};
//        int[] numbers = {1, 2, 3, 4, -2, 0, -3, -1};
        System.out.println("Min: " + getMin(numbers));
        System.out.println("Max: " + getMax(numbers));
        System.out.println("Middle: " + getMiddle(numbers));
    }

    /**
     * Возвращает среднее число из массива
     *
     * @param numbers массив чисел
     * @return среднее число
     */
    private static int getMiddle(int[] numbers) {
        int max = getMax(numbers);
        int firstMiddle = max - ((max - getMin(numbers)) / 2);
        int middle = 0;
//        int[] numbers = {2, 5, 6, 23, 3, 8, 22, 75, 4, -8};
        for (int i = 0; i < numbers.length; i++) {
//            Arrays.sort(numbers);
            if (firstMiddle > numbers[i]) {
                middle = numbers[i];
            }
        }

        return middle;
    }

    /**
     * Возвращает наибольшее число из массива
     *
     * @param numbers массив чисел
     * @return наибольшее число
     */

    private static int getMax(int[] numbers) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }

        return max;
    }

    /**
     * Возвращает наименьшее число из массива
     *
     * @param numbers массив чисел
     * @return наименьшее число
     */
    private static int getMin(int[] numbers) {
        int min = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }

}



