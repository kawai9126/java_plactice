class Lol {
  public static void main(String[] args) {
    
    if (true) {
      System.out.println("true");
    }
    
    if (false) {
      System.out.println("false");
    }
    
    int x = 5;
    if (x > 2) {
      System.out.println("xは2より大きい");
    }
    
    if (x > 8) {
      System.out.println("xは8より大きい");
    }
    
    
    int number = 12;
    
    if (number < 10) {
      System.out.println("10より小さい");
    } else if (number < 20) {
      System.out.println("10以上、20より小さい");
    } else {
      System.out.println("20以上");
    }
    
    int number1 = 12;
    
    switch (number1 % 3) {
      case 0:
        System.out.println("3で割り切れます");
        break;
      case 1:
        System.out.println("3で割ると1余ります");
        break;
      case 2:
        System.out.println("3で割ると2余ります");
        break;
    }
    
    
     int number2 = 13;
    
    switch (number2 % 5) {
      case 0:
        System.out.println("aです");
        break;
      case 1:
        System.out.println("bです");
        break;
      case 4:
        System.out.println("cです");
        break;
      default:
        System.out.println("dです");
        break;
    }
    
    int number3 = 10;
  
    while (number3 > 0) {
      System.out.println(number3);
      number3--;
    }
  }
}