
/**
 * Write a description of class DebitCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DebitCard extends BankCard 
{
    private int PINnumber;
    private int WithdrawAmount;
    private String dateofWithdrawl;
    private boolean hasWithdrawn;
    
    //constructors//
    public DebitCard(int balanceamount, int cardid ,
    String bankaccount, String issuerbank,String clientname, 
    int PINnumber)
    {
        super( cardid,  balanceamount  , issuerbank,  bankaccount); 
        super.setclientname(clientname);
        this. PINnumber=  PINnumber;
        this.hasWithdrawn=  false;
    }
    //Getters method //
        public int getPINnumber()
    {
        return this.PINnumber;
    }
    public int getWithdrawAmount()
    {
        return this.WithdrawAmount;
    }

    public String getdateofWithdrawl()
    {
        return this.dateofWithdrawl;
    }

    public boolean gethasWithdrawn ()
    {
        return this.hasWithdrawn;
    }
    //setters method //
    public void setWithdrawAmount(int WithdrawAmount)
     {
          this.WithdrawAmount= WithdrawAmount;
     }
     //withdraw method//
    public void Withdraw(int WithdrawAmount, String dateofWithdrawl, int PINnumber)
     {
         if(PINnumber==this.PINnumber && WithdrawAmount <=getbalanceamount())
         {
             this.hasWithdrawn=true;
             int newbalanceamount=this.getbalanceamount() - WithdrawAmount;
             super.setbalanceamount(newbalanceamount);
             this.dateofWithdrawl = dateofWithdrawl;
             this.WithdrawAmount = WithdrawAmount;
             
         }
         else
         {
            System.out.println("INVALID");
            }
        }
         //display method //
    public void Bank_card()
         {
        super.Bank_card();
        System.out.println("The PINumber is: "+this.PINnumber);
        System.out.println("Withdrawamount is: "+this.WithdrawAmount);
        System.out.println("dateofwithdrwaw is:"+this.dateofWithdrawl);
        if(this. hasWithdrawn== false)
        {
        System.out.println(" The balanceamount is: "+super.getbalanceamount());
        }
        }
}

