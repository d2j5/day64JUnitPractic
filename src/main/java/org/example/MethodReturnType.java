package org.example;

public class MethodReturnType {
    public static void main(String[] args) {
        System.out.println(string());
        System.out.println(num());
        System.out.println(bool());
    }
    public static String string() {
        return "Here is the string";
    }
    public static int num() {

        return 13;
    }
    public static boolean bool() {

        return true;
    }
}
