class Gate {
  public static void main(String[] args) {
    
    if (true) {
      System.out.println("条件式がtrueのため、出力されます");
    }
    
    if (false) {
      System.out.println("条件式がfalseのため、出力されません");
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
  }
}