package Homework;

public class Myclass {
    public static void main(String[] args) {
        int number =75;
        if (number>=0 && number<=50){
            System.out.printf(number+" falls into the range 0-50");
        } else if (number>=51 && number<=100) {
            System.out.printf(number+" falls into the range 51-100");
        }
        else System.out.printf(number+" falls into the range 101-150");
    }
}
