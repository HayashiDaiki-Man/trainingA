public class Account {
    String accountNo;

    // equals()メソッドをオーバーライドする
    public boolean equals(Object o) {
        // 自分自身が引数として渡されたら無条件でtrueを返す
        if (o == this)
            return true;
        // 引数がnullであった場合、無条件でfalseを返す
        if (o == null)
            return false;
        // 比較し、型が異なるならばfalseを返す
        if (!(o instanceof Account))
            return false;
        Account r = (Account) o;
        // 2つのインスタンスが持つしかるべきフィールド同士を比較して等価か判定し、trueかfalseを返す(空白は取り除く)
        if (!this.accountNo.trim().equals(r.accountNo.trim())) {
            return false;
        }
        return true;
    }
}
