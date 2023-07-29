
/**
 * Write a description of class CreditCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CreditCard extends BankCard
{
    private int     CVCnumber;
    private double  CreditLimit;
    private double  InterestRate;
    private String  ExpirationDate;
    private int     GracePeriod;
    private boolean isGranted;
    //constructor//
    public CreditCard(int cardid, int balanceamount  ,String issuerbank, String bankaccount,String clientname,int CVCnumber, 
    double IntrestRate,String ExpirationDate)
    {
        super(cardid, balanceamount ,issuerbank,bankaccount);
        super.setclientname(clientname);
        this.CVCnumber=CVCnumber;
        this.InterestRate=IntrestRate;
        this.ExpirationDate=ExpirationDate;
        this.isGranted=false;
        }
        //Getters Method //
    public int getCVCnumber()
        {
            return this.CVCnumber;
        }
    public double getCreditLimit()
        {
            return this.CreditLimit;
        }
    public double  getIntrestRate()
        {
            return this.InterestRate;
        }
    public String getExpirationDate()
        {
            return this.ExpirationDate;
        }
    public int getGaracPeriod()
        {
            return this.GracePeriod;
        }
    public  boolean getisGranted()
        {
            return this.isGranted;
        }
        //setters method to set the credit limit//
      public void setCreditLimit(double CreditLimit, int GracePeriod)
      {
        if (CreditLimit<= 2.5 * super.getbalanceamount())
          {
          this.CreditLimit=CreditLimit;
          this.isGranted= true;
          this.GracePeriod=GracePeriod;
        }
        else
        {
            System.out.println(" Credit Cannot be issued !!");
            
        }
    }
    //method to cancel the credit card//
    public void cancelCreditCard()
    {
    this.CVCnumber=0;
    this.CreditLimit=0;
    this.isGranted=false;
    this.GracePeriod=0;

    }
    
    //  Display method of credit card//      
    public void Bank_card ()
    {
        if(isGranted == true)
        {
           super.Bank_card();
           System.out.println("The Credit limit is:"+this. CreditLimit);
           System.out.println("The GracePeriod is:"+this. GracePeriod);
           
        }
        else
        {
            System.out.println("The CVCnumber is: "+ this.CVCnumber);
            System.out.println("The InterestRate is:"+this.InterestRate);
            System.out.println("The ExpirationDate is:"+this.ExpirationDate);
            System.out.println("The is granted is:"+this. isGranted);
            }
        }
        }

        
        
        
        
        
        
        
        
        
    
    
    


