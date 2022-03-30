public class App {
    public static void main(String[] args) {
        /*
        // n = 0 は繰り返すと毎回0になるのでfor文の外に配置する
        int n = 0;
        // for文
        for(int i = 0; i < 5;i++){
            if (i == n) {
                System.out.println(i + "回繰り返した");
                n++;
            }
        }
        // for文の応用
        for(int i = 0; i < 5;i += 2){
            System.out.println(i);
        }
        // for文の応用
        for(int i = 5;i > 0;i--){
            System.out.println(i);
        }
        // while文
        int i = 0;
        while(i < 5){
            System.out.println(i);
            i++;
        }
        // continue文
        for(int i = 0;i < 5;i++){
            if(i == 2){
                System.out.println("skip");
                continue;
            }
            System.out.println(i);
        }
        // continuをif-else文で
        for(int i = 0;i < 5;i++){
            if(i == 2){
                System.out.println("skip");
            }else{
                System.out.println(i);
            }
        }
        // 掛け算
        for(int i = 1;i <= 9;i++){
            for(int j = 1;j <= 9;j++){
                System.out.printf("%2d | ",i * j);
            }
            System.out.println();
        }
        */
        // printf()について練習してみる
        var name = "fuji";
        var age = 21;
        var height = 166.8;

        System.out.printf("name: %s, age : %d,height: %.1f",name,age,height);
    }
}
