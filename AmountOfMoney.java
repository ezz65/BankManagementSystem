
public class AmountOfMoney {

    int money;
    
    public AmountOfMoney (int money) {
        this.money = money;
    }
    public String toString() {
        return new String (this.money +"EUR");
    }    
    void set(int money) {
        this.money = money;
    }
    static AmountOfMoney add(AmountOfMoney money1, AmountOfMoney money2) {
        return new AmountOfMoney ( money1.money + money2.money );
    } 
    static AmountOfMoney subtract(AmountOfMoney money1, AmountOfMoney money2) {
        return new AmountOfMoney ( money1.money - money2.money );
    }
    public int get(){
        return money;
    }
           
}
