package hr.unizg.fer.oop;

public class AdvancedWorkingWithStrings {
    static String text = "Dobro dosli na FER OOP";

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            sb.append(args[i]).append(";");
        }
        text = sb.toString();

        if (!text.isEmpty()) {
            System.out.println(text);
            System.out.println();
            split();
            System.out.println();
            indexOfLetter();
            System.out.println();
            substring();
        }
    }

    public static void split() {
        String[] splits = text.split(";");
        for (int i = 0; i < splits.length; i++)
            System.out.println(splits[i]);
    }

    public static void indexOfLetter() {
        int firstIndexOfSemicolon = text.indexOf(";");
        int lastIndexOfSemicolon = text.lastIndexOf(";");
        System.out.println("First semicolon index is " + firstIndexOfSemicolon + ", and the last one is " + lastIndexOfSemicolon);
    }

    public static void substring() {
        int firstIndexOfSemicolon = text.indexOf(";");
        int lastIndexOfSemicolon = text.lastIndexOf(";");

        String substring = text.substring(firstIndexOfSemicolon + 1, lastIndexOfSemicolon);
        System.out.println(substring);
    }
}