package stringCoincidence;

import java.util.ArrayList;
import java.util.List;

public class StringIdentity {
    public static void main(String[] args) {
        String firstString = "First string to next";
        String secondString = "Other string for first";

        System.out.println("String coincidence: " + getIdentityCount(firstString, secondString));
    }

    /**
     * Вычисляет количество идентичных букв в заданных строках
     * Пример: в словах "телефон" и "телевизор" количество идентичности 5 букв
     *
     * @param firstString
     * @param secondString
     * @return процент идентичности
     */
    private static int getIdentityCount(String firstString, String secondString) {
        String first = firstString.toUpperCase();//FIRST ...
        String second = secondString.toUpperCase();//OTHER ...
        List<Character> foundChars = new ArrayList<>();
        for (int i = 0; i < first.length(); i++) {
            char ch = first.charAt(i);//S - 0
            if (second.contains(String.valueOf(ch))) {
                if (!foundChars.contains(ch) && ch != ' ') {//[FIRST ]
                    foundChars.add(ch);
                }
            }
        }
        return foundChars.size();
    }
}
