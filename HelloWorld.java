package com.example.helloworld;

public class HelloWorld {
    public static void main(String[] args) {

        System.out.println(isInternationalPhone("12412414"));
        System.out.println(isLeapYear(2016));
    }

    public static char getLastChar(String str) {
        // Вычисляем индекс последнего символа как длина строки - 1
        return str.charAt(str.length() - 1);
    }

    public static String truncate(String text, int length) {
        return text.substring(0, length) + "...";
    }

    public static String getHiddenCard(String creditNumber, int numberToHide) {
        return "*".repeat(numberToHide) + creditNumber.substring(12);
    }

    public static boolean isPensioner(int age) {
        return age >= 60;
    }

    public static boolean isPalindrome(String word) {

        var wordToReverse = new StringBuilder(word).reverse().toString();
        return wordToReverse.equalsIgnoreCase(word);
    }

    public static boolean isInternationalPhone(String phone) {
        return phone.charAt(0) == '+';




    }
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        else if (year % 4 == 0 && year% 100 !=0) {
            return true;
        }
        else {
            return false;
        }






    }
}


