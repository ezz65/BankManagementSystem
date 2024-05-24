

public class Main {

    public static void main(String[] args) {
    
        System.out.println("********** part 1 [4 pts] **********");

         AmountOfMoney money1 = new AmountOfMoney( 9 );
         AmountOfMoney money2 = new AmountOfMoney( 2 );
         AmountOfMoney money3 = new AmountOfMoney( 12 );
         System.out.println("1a)  " + money1 + " ;   " + money2 + " ;   " + money3);
        
         money3.set( 7 );
         System.out.println("1b)  " + money1 + " ;   " + money2 + " ;   " + money3);
        
         AmountOfMoney money4 = AmountOfMoney.add(money1, money3);
         System.out.println("1c)  " + money1 + " + " + money3 + " = " + money4);
        
         money4 = AmountOfMoney.subtract(money2, money3);
         System.out.println("1d)  " + money2 + " - " + money3 + " = " + money4);
        
         System.out.println("********** part 2 [4 pts] **********");   

         String id = "12 3456 7890";
         BankAccount account1 = new BankAccount(id, money1);
         System.out.println("2a)  " + account1);
        
         money1.set( 0 );
         System.out.println("2b)  " + account1  );
        
         AmountOfMoney x5 = account1.getBalance();
         x5.set( -1000 );
         System.out.println("2c)  " + account1  );
        
    //     account1.setBalance( new AmountOfMoney(1000) );
  //       System.out.println("2d)  " + account1);
        
        System.out.println("********** part 3 [2 pts] **********");                

//         Bank bank = new Bank();
//         bank.newAccount("22 8765 0001");
//         bank.newAccount("33 8765 0002");
//         System.out.println("3a)  " + bank);
        
//         money1.set( 88 );
//         bank.paymentOnAccount("22 8765 0001", money1);
//         bank.paymentOnAccount("33 8765 0002", money1);
//         System.out.println("3b)  " + bank  );
        
//         money1.set( 58 );
//         bank.withdrawFromAccount("22 8765 0001", money2);
//         System.out.println("3c)  " + bank  );
        
//         money4 = bank.accountBalance("33 8765 0002");
//         money4.set(0);
//         System.out.println("3d)  " + bank  );
        
    }
    
}


/* OUTPUT :

********** part 1 [4 pts] **********
1a)  9EUR ;   2EUR ;   12EUR
1b)  9EUR ;   2EUR ;   7EUR
1c)  9EUR + 7EUR = 16EUR
1d)  2EUR - 7EUR = -5EUR
********** part 2 [4 pts] **********
2a)  [12 3456 7890] 9EUR
2b)  [12 3456 7890] 9EUR
2c)  [12 3456 7890] 9EUR
2d)  [12 3456 7890] 1000EUR
********** part 3 [2 pts] **********
3a)  [22 8765 0001] 0EUR ;  [33 8765 0002] 0EUR ;
3b)  [22 8765 0001] 88EUR ;  [33 8765 0002] 88EUR ;
3c)  [22 8765 0001] 30EUR ;  [33 8765 0002] 88EUR ;
3d)  [22 8765 0001] 30EUR ;  [33 8765 0002] 88EUR ;


*/

