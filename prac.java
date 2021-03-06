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
    
    
    String[] names = {"ぬこ", "ひつじ", "いんぬ"};
    
    System.out.println(names[0]);
    
    System.out.println(names[2]);
    
    String[] languages = {"Ruby", "PHP", "Python"};

    System.out.println(languages[1]);
    
    languages[1] = "Java";
    
    System.out.println(languages[1]);
    
    String[] names2 = {"いんぬ", "かめきち", "ぬこ"};
    
    for (int l = 0; l < names2.length; l++) {
      System.out.println("私の名前は" + names2[l] + "です");
    }
  }
}