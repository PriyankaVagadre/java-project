import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        String fruits[]= {"aaple", "mango"};
        for(int i=0;i<fruits.length;i++){
            System.out.println(fruits[i]);
        }

        for (String fruit: fruits) //for each loop
            System.out.println(fruit);
    }
}