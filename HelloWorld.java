package com.example.helloworld;
import java.time.LocalDate;
import java.util.Locale;
public class HelloWorld {
    public static void main(String[] args) {
        var name = "Arya";


        System.out.println(countChars("HexlEt", 'E'));

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


    public static boolean notToday(String dateAsString) {
        var date = LocalDate.now();
        return !dateAsString.equals(date.toString());
    }

    public static String getSentenceTone(String str) {
        var newStr = str.toUpperCase();
        if (newStr.equals(str)) {
            return "scream";
        }
        return "normal";
    }
    public static String normalizeUrl(String url) {
        if (url.startsWith("https://")) {
            return url;
        }
        return "https://" + url;
    }
    public static String whoIsThisHouseToStarks(String lastName) {
        if ( lastName.equals( "Karstark")) {
            return "friend";
        }
        else if ( lastName.equals( "Tally")) {
            return "friend";
        }
        else if ( lastName.equals(  "Lannister")) {
            return "enemy";
        }
        else if ( lastName.equals(  "Frey")) {
            return "enemy";
        }
        return "neutral";

    }

    public static  String getNumberExplanation(int num) {
        switch ( num) {
            case 666:
                return "devil number";
            case 7:
                return "prime number";
            case 42:
                return "answer for everything";
            default:
                return null;

        }
    }
    public static void printNumbers(int firstNumber) {
        // BEGIN (write your solution here)
        var i = firstNumber;

        while (i >= 1) {
            System.out.println(i);
            i = i -  1;
        }
        System.out.println("finished!");

    }

    public static int multiplyNumbersFromRange(int start, int finish) {

        var i = start;
        var res = 1;

        while (i <= finish) {
            res = res * i;
            i = i + 1;
        }


        return res;


    }

    public static String joinNumbersFromRange(int start, int finish) {
        // BEGIN
        var i = start;
        var result = "";

        while (i <= finish) {
            result = result + i;
            i = i + 1;
        }

        return result;
        // END
    }


    public static void printNameBySymbol(String name) {
        var i = name.length() - 1;
        // Такая проверка будет выполняться до конца строки
        // включая последний символ. Его индекс `length() - 1`.
        while (i >= 0) {
            // Обращаемся к символу по индексу
            System.out.println(name.charAt(i));
            i = i - 1;
        }
    }


    public static int countChars(String str, char ch) {
        var i = 0;
        var count = 0;
        while (i < str.length()) {
            var currentChar = Character.toLowerCase(str.charAt(i));
            if (currentChar == Character.toLowerCase(ch)) {
                count = count + 1;
            }
            i = i + 1;
        }
        return count;
    }
    public static String reverse(String str) {
        // BEGIN
        var i = str.length() - 1;
        var result = "";
        while (i >= 0) {
            result = result + str.charAt(i);
            i = i - 1;
        }

        return result;
        // END
    }


    public static String filterString(String str, char ch) {
        // BEGIN
        var i = 0;
        var result = "";
        while (i < str.length()) {
            var currentChar = str.charAt(i);
            if (currentChar != ch) {
                result += currentChar;
            }
            i += 1;
        }

        return result;
        // END
    }



    public static String makeItFunny(String str, int n) {
        // BEGIN
        var i = 0;
        var result = "";
        while (i < str.length()) {
            var current = str.charAt(i);
            if ((i + 1) % n == 0) {
                result = result + Character.toUpperCase(current);
            } else {
                result = result + current;
            }
            i++;
        }

        return result;
        // END
    }

    public static boolean hasChar(String str, char ch) {
        // BEGIN
        var i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == ch) {
                return true;
            }

            i += 1;
        }

        return false;
        // END
    }


    public static String encrypt(String str) {
        // BEGIN
        var result = "";
        for (var i = 0; i < str.length(); i += 2) {
            var nextSymbol = (i + 2 > str.length()) ? "" : str.charAt(i + 1);
            result = result + nextSymbol + str.charAt(i);
        }

        return result;
        // END
    }
}


