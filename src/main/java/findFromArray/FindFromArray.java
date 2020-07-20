package findFromArray;

import java.util.Arrays;

public class FindFromArray {
    public static void main(String[] args) {
        //Дан массив из чисел:
//        int[] numbers = {2,-1, 5, 6, -320, 23, 3, 8, 22, 75, 4, -8, 35, 150, 322};
        int[] numbers = {2, 5, 6, 23, 3, 8, 22, 75, 4, -8, 35};
        System.out.println("Min: " + getMin(numbers));
        System.out.println("Max: " + getMax(numbers));
        System.out.println("Middle: " + getMiddle(numbers));
    }

    /**
     * Возвращает среднее число из массива
     * @param numbers массив чисел
     * @return среднее число
     */
    private static int getMiddle(int[] numbers) {
        int max = getMax(numbers);
        int firstMiddle = max - ((max - getMin(numbers)) / 2);
        int middle = numbers[0]; //29
        int secondMiddle = numbers[0];//32
//        int[] numbers = {2, 5, 6, 23, 3, 8, 22, 75, 4, -8};
//        int[] numbers = {2,-1, 5, 6, -320, 23, 3, 8, 22, 75, 4, -8, 35, 150, 322};

        for (int i = 0; i < numbers.length; i++) {
            int a = firstMiddle - secondMiddle;//34-2 = 32
            int b = firstMiddle - numbers[i]; //34-5= 29
//                32 >29
            if (Math.abs(a) > Math.abs(b)) {
                middle = numbers[i];
                secondMiddle = numbers[i];
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



