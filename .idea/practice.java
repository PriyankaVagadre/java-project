import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int numDiv = scanner.nextInt();
        if(numDiv % 5 == 0 && numDiv % 3 == 0){
            System.out.println("Fuzz Buzz");
        }
        else if(numDiv % 5 == 0){
            System.out.println("Fuzz");
        }
        else if(numDiv % 3 == 0){
            System.out.println("Buzz");
        }
        else{
            System.out.println(numDiv);
        }
    }
}