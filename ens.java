public class Ens {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] param = input.split(" ");//入力値を空白で分解する
        int num1 = Integer.parseInt(param[0]);
        String type = param[1] ;
        int num2 = Integer.parseInt(param[2]);
        if(type.equals("+")){ //①
            System.out.println(num1 + num2);
        }else if(type.equals("-")){
            System.out.println(num1 - num2);
        }else if(type.equals("*")){
            System.out.println(num1 * num2);
        }else if(type.equals("/")){
            System.out.println(num1 / num2 + " ... " +  num1 % num2);//②
        }
    }
}
