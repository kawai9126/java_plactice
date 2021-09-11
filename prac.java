class Prac {
  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
      System.out.println(i + "回目のループです");
    }
    
    System.out.println("=== while文 ===");
    int i = 1;
    while (i < 10) {
      if (i % 5 == 0) {
        break;
      }
      
      System.out.println(i);
      i++;
    }
    
    System.out.println("=== for文 ===");
    for (int j = 1; j < 10; j++) {
      if (j % 3 == 0) {
        continue;
      }
      
      System.out.println(j);
    }
    
    
  }
}