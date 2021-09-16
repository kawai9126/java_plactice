public class Hukusyu {

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
    
    int number1 = 3;
    
    int number2 = 7;
    
    System.out.println(number1 * number2);
    
    String study = "勉強";
    
    System.out.println("java" + study);
    
    
    int number3 = 11;
    String ruby = "Ruby";
    System.out.println(number3);
    System.out.println(ruby);
    
    number3 = 9;
    
    System.out.println(number3);
    
    ruby = "Java";
    
    System.out.println(ruby);
    
    int number4 = 3;
    System.out.println(number4);
    
    number4 = number4 + 7;
    
    System.out.println(number4);
    
    int number5 = 8;
    
    number5 *= 7;
    
    System.out.println(number5);
    
    number5++;
    
    System.out.println(number5);
    
    int length = 6;
    int height = 8;
    
    int rectangleArea = length * height;
    
    System.out.println(rectangleArea);
    
    int triangleArea = length * height / 2;
    
    System.out.println(triangleArea);
    
    
    double number6 = 8.5;
    
    double number7 = 3.4;
    
    System.out.println(number6 + number7);
    
    System.out.println(number6 - number7);
    
    int month = 12;
    int date = 31;
    
    System.out.println(month + "月" + date + "日");
    
    System.out.println(7 / 2);
    
    System.out.println(7.0 / 2.0);
    
    System.out.println(7 / 2.0);
    
    int number8 = 7;
    int number9 = 2;
    System.out.println(number8 / number9);
    
    System.out.println((double)number8 / number9);
    
    
    String name2 = "かわい";
    
    int age = 22;
    
    double height2 = 1.80;
  
    double weight = 60.0;
    
    double bmi = weight / height2 / height2;
    
    System.out.println("名前は" + name2 + "です");
    System.out.println("年齢は" + age + "歳です");
    System.out.println("身長は" + height2 + "mです");
    System.out.println("体重は" + weight + "kgです");
    System.out.println("BMIは" + bmi + "です");
  }
}