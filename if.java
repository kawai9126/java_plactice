public class If {
    public static void main (String[] args){
        int number = 200;
        if (number >= 1 && number <= 9){
            System.out.println("[3] number : 1 - 9");
        } else if (number >= 10 && number <= 99) {
            System.out.println("[5] number : 10 - 99");
        } else if (number >= 100 && number <= 999){
            System.out.println("[7] number : 100 - 999");
        }
    }
}