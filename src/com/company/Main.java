package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(methodString(generateRandomAge(), 25));
    }

    public static String methodString(int age, int temperatureOnStreet) {

        String result = age + " " + temperatureOnStreet;

        if (age <= 45 && temperatureOnStreet <= 30) {
            System.out.println("Можно идти гулять.");
        } else if (age < 20 && temperatureOnStreet <= 28) {
            System.out.println("Можно идти гулять.");
        } else if (temperatureOnStreet <= 25 || age > 45) {
            System.out.println("Можно идти гулять.");
        } else {
            System.out.println("Оставайтесь дома.");
        }

        return result;
    }

    public static int generateRandomAge() {

        int random = (int) (Math.random() * 5);
        
        return random;
    }
}
