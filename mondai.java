public class Mondai {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] param = input.split(" ");
        String type = null ;
        Integer sum = 0 ;
        for(int idx = 0 ; idx < param.length; idx ++){
        if(param[idx].equals("+") || param[idx].equals("-")){
                type = param[idx] ;
        }else{
                Integer num = Integer.parseInt(param[idx]);
                if(type != null){
                    if(type.equals("+")){
                        sum = sum + num;
                    }else if(type.equals("-")){
                        sum = sum - num;
                    }
                }else{
                  sum = num ;
                }
            }
        }
        System.out.println(sum);
    }
}
