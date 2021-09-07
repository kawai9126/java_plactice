public class hello {

  public static void main(String []args) {
    System.out.println("Hello, World!");

    System.out.println("The sum of 2 and 3 is 5.");

    int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);

    System.out.format("The sum of %s and %s is %s.\n",
      args[0], args[1], Integer.toString(sum));
      
    System.out.println("こんにちは" + "世界");
    
    System.out.println("38" + "19");
    
    System.out.println(38 + 19);
    
    int number;
    
    number = 3;
    
    System.out.println(number);

    String name;
    
    name = "kawai";
    
    System.out.println(name);
    
  }
}