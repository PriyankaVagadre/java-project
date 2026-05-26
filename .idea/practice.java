class Scratch {
    public static void main(String[] args) {
        int numDiv =18;
        if(numDiv % 5 == 0 && numDiv % 3 == 0){
            System.out.println("Fuzz Buzz");
        }
        else if(numDiv % 5 == 0){
            System.out.println("Fuzz");
        }
        else if(numDiv % 3 == 0){
            System.out.println("Buzz");
        }
        else
            System.out.println(numDiv);
    }
}