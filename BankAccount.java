
public class BankAccount {
    
    private final String id;
    private AmountOfMoney money;
    BankAccount (String id, AmountOfMoney money) {
        this.id = new String (id);
        this.money= new AmountOfMoney(money.get());
    }
    public String toString() {
        return new String ("["+this.id+"] "+this.money);
    }
    public AmountOfMoney getBalance(){
        return new AmountOfMoney(money.get());
    }
/*    public void setBalance(AmountOfMoney money){
        this.money=new AmountOfMoney(money);
    }  
*/}
