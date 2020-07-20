package stringCoincidence;

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
        return 0;
    }
}
