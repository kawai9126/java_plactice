{"filter":false,"title":"mondai.java","tooltip":"/mondai.java","undoManager":{"mark":11,"position":11,"stack":[[{"start":{"row":0,"column":0},"end":{"row":27,"column":0},"action":"insert","lines":["public class Main {","    public static void main(String[] args) throws Exception {","        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));","        // 入力パラメータを読み込む","        String input = br.readLine();","        String[] param = input.split(\" \");//入力値を空白で分解する","        String type = null ;","        Integer sum = 0 ;","        for(int idx = 0 ; idx < param.length; idx ++){//①","        if(param[idx].equals(\"+\") || param[idx].equals(\"-\")){//②","                type = param[idx] ;","        }else{","                Integer num = Integer.parseInt(param[idx]);//③","                if(type != null){//④","                    if(type.equals(\"+\")){","                        sum = sum + num;","                    }else if(type.equals(\"-\")){","                        sum = sum - num;","                    }","                }else{","                  sum = num ;//⑤","                }","            }","        }","        System.out.println(sum);","    }","}",""],"id":1}],[{"start":{"row":8,"column":56},"end":{"row":8,"column":57},"action":"remove","lines":["①"],"id":2},{"start":{"row":8,"column":55},"end":{"row":8,"column":56},"action":"remove","lines":["/"]},{"start":{"row":8,"column":54},"end":{"row":8,"column":55},"action":"remove","lines":["/"]}],[{"start":{"row":9,"column":63},"end":{"row":9,"column":64},"action":"remove","lines":["②"],"id":3},{"start":{"row":9,"column":62},"end":{"row":9,"column":63},"action":"remove","lines":["/"]},{"start":{"row":9,"column":61},"end":{"row":9,"column":62},"action":"remove","lines":["/"]}],[{"start":{"row":12,"column":61},"end":{"row":12,"column":62},"action":"remove","lines":["③"],"id":4},{"start":{"row":12,"column":60},"end":{"row":12,"column":61},"action":"remove","lines":["/"]},{"start":{"row":12,"column":59},"end":{"row":12,"column":60},"action":"remove","lines":["/"]}],[{"start":{"row":13,"column":35},"end":{"row":13,"column":36},"action":"remove","lines":["④"],"id":5},{"start":{"row":13,"column":34},"end":{"row":13,"column":35},"action":"remove","lines":["/"]},{"start":{"row":13,"column":33},"end":{"row":13,"column":34},"action":"remove","lines":["/"]}],[{"start":{"row":20,"column":31},"end":{"row":20,"column":32},"action":"remove","lines":["⑤"],"id":6},{"start":{"row":20,"column":30},"end":{"row":20,"column":31},"action":"remove","lines":["/"]},{"start":{"row":20,"column":29},"end":{"row":20,"column":30},"action":"remove","lines":["/"]}],[{"start":{"row":5,"column":54},"end":{"row":5,"column":55},"action":"remove","lines":["る"],"id":7},{"start":{"row":5,"column":53},"end":{"row":5,"column":54},"action":"remove","lines":["す"]},{"start":{"row":5,"column":52},"end":{"row":5,"column":53},"action":"remove","lines":["解"]},{"start":{"row":5,"column":51},"end":{"row":5,"column":52},"action":"remove","lines":["分"]},{"start":{"row":5,"column":50},"end":{"row":5,"column":51},"action":"remove","lines":["で"]},{"start":{"row":5,"column":49},"end":{"row":5,"column":50},"action":"remove","lines":["白"]},{"start":{"row":5,"column":48},"end":{"row":5,"column":49},"action":"remove","lines":["空"]},{"start":{"row":5,"column":47},"end":{"row":5,"column":48},"action":"remove","lines":["を"]},{"start":{"row":5,"column":46},"end":{"row":5,"column":47},"action":"remove","lines":["値"]},{"start":{"row":5,"column":45},"end":{"row":5,"column":46},"action":"remove","lines":["力"]},{"start":{"row":5,"column":44},"end":{"row":5,"column":45},"action":"remove","lines":["入"]},{"start":{"row":5,"column":43},"end":{"row":5,"column":44},"action":"remove","lines":["/"]}],[{"start":{"row":5,"column":42},"end":{"row":5,"column":43},"action":"remove","lines":["/"],"id":8}],[{"start":{"row":3,"column":22},"end":{"row":3,"column":23},"action":"remove","lines":["む"],"id":9},{"start":{"row":3,"column":21},"end":{"row":3,"column":22},"action":"remove","lines":["込"]},{"start":{"row":3,"column":20},"end":{"row":3,"column":21},"action":"remove","lines":["み"]},{"start":{"row":3,"column":19},"end":{"row":3,"column":20},"action":"remove","lines":["読"]},{"start":{"row":3,"column":18},"end":{"row":3,"column":19},"action":"remove","lines":["を"]},{"start":{"row":3,"column":17},"end":{"row":3,"column":18},"action":"remove","lines":["タ"]},{"start":{"row":3,"column":16},"end":{"row":3,"column":17},"action":"remove","lines":["ー"]},{"start":{"row":3,"column":15},"end":{"row":3,"column":16},"action":"remove","lines":["メ"]},{"start":{"row":3,"column":14},"end":{"row":3,"column":15},"action":"remove","lines":["ラ"]},{"start":{"row":3,"column":13},"end":{"row":3,"column":14},"action":"remove","lines":["パ"]},{"start":{"row":3,"column":12},"end":{"row":3,"column":13},"action":"remove","lines":["力"]},{"start":{"row":3,"column":11},"end":{"row":3,"column":12},"action":"remove","lines":["入"]},{"start":{"row":3,"column":10},"end":{"row":3,"column":11},"action":"remove","lines":[" "]},{"start":{"row":3,"column":9},"end":{"row":3,"column":10},"action":"remove","lines":["/"]},{"start":{"row":3,"column":8},"end":{"row":3,"column":9},"action":"remove","lines":["/"]}],[{"start":{"row":3,"column":4},"end":{"row":3,"column":8},"action":"remove","lines":["    "],"id":10},{"start":{"row":3,"column":0},"end":{"row":3,"column":4},"action":"remove","lines":["    "]},{"start":{"row":2,"column":81},"end":{"row":3,"column":0},"action":"remove","lines":["",""]}],[{"start":{"row":0,"column":16},"end":{"row":0,"column":17},"action":"remove","lines":["n"],"id":11},{"start":{"row":0,"column":15},"end":{"row":0,"column":16},"action":"remove","lines":["i"]},{"start":{"row":0,"column":14},"end":{"row":0,"column":15},"action":"remove","lines":["a"]},{"start":{"row":0,"column":13},"end":{"row":0,"column":14},"action":"remove","lines":["M"]}],[{"start":{"row":0,"column":13},"end":{"row":0,"column":14},"action":"insert","lines":["M"],"id":12},{"start":{"row":0,"column":14},"end":{"row":0,"column":15},"action":"insert","lines":["o"]},{"start":{"row":0,"column":15},"end":{"row":0,"column":16},"action":"insert","lines":["n"]},{"start":{"row":0,"column":16},"end":{"row":0,"column":17},"action":"insert","lines":["d"]},{"start":{"row":0,"column":17},"end":{"row":0,"column":18},"action":"insert","lines":["a"]},{"start":{"row":0,"column":18},"end":{"row":0,"column":19},"action":"insert","lines":["i"]}]]},"ace":{"folds":[],"scrolltop":0,"scrollleft":0,"selection":{"start":{"row":0,"column":19},"end":{"row":0,"column":19},"isBackwards":false},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":0},"timestamp":1632148665796,"hash":"aa446780d1f5ce0eb8ceb6a47ec1d037aaccadd8"}