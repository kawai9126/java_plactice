{"filter":false,"title":"progate1.java","tooltip":"/progate1.java","undoManager":{"mark":2,"position":2,"stack":[[{"start":{"row":0,"column":0},"end":{"row":47,"column":1},"action":"insert","lines":["class Prac {","  public static void main(String[] args) {","    for (int i = 1; i <= 10; i++) {","      System.out.println(i + \"回目のループです\");","    }","    ","    System.out.println(\"=== while文 ===\");","    int i = 1;","    while (i < 10) {","      if (i % 5 == 0) {","        break;","      }","      ","      System.out.println(i);","      i++;","    }","    ","    System.out.println(\"=== for文 ===\");","    for (int j = 1; j < 10; j++) {","      if (j % 3 == 0) {","        continue;","      }","      ","      System.out.println(j);","    }","    ","    ","    String[] names = {\"ぬこ\", \"ひつじ\", \"いんぬ\"};","    ","    System.out.println(names[0]);","    ","    System.out.println(names[2]);","    ","    String[] languages = {\"Ruby\", \"PHP\", \"Python\"};","","    System.out.println(languages[1]);","    ","    languages[1] = \"Java\";","    ","    System.out.println(languages[1]);","    ","    String[] names2 = {\"いんぬ\", \"かめきち\", \"ぬこ\"};","    ","    for (int l = 0; l < names2.length; l++) {","      System.out.println(\"私の名前は\" + names2[l] + \"です\");","    }","  }","}"],"id":1}],[{"start":{"row":0,"column":9},"end":{"row":0,"column":10},"action":"remove","lines":["c"],"id":2},{"start":{"row":0,"column":8},"end":{"row":0,"column":9},"action":"remove","lines":["a"]},{"start":{"row":0,"column":7},"end":{"row":0,"column":8},"action":"remove","lines":["r"]},{"start":{"row":0,"column":6},"end":{"row":0,"column":7},"action":"remove","lines":["P"]}],[{"start":{"row":0,"column":6},"end":{"row":0,"column":13},"action":"insert","lines":["Progate"],"id":3}]]},"ace":{"folds":[],"scrolltop":0,"scrollleft":0,"selection":{"start":{"row":0,"column":13},"end":{"row":0,"column":13},"isBackwards":false},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":0},"timestamp":1632064232417,"hash":"0d30f7843444f6ac1bd473d672b5f920ec0a0d08"}