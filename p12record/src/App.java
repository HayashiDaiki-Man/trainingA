import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        record Word(String english,String japanese,int age,double height){};
        var w = new Word("英語","日本語",18,33.3);
        System.out.println(w.age + " " + w.english + " " + w);
        record Spending(LocalDate date,int prince,String memo){}
        var sp = new Spending(LocalDate.now(), 500, "ほおほっほほh");
        System.out.println(sp.date);
        record abc(String a,int b,LocalDate c){}
        var ld = LocalDate.now();
        var abct = new abc("gorigori", 3030,ld);
        System.out.println(abct);
    }
}
