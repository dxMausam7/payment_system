
/**
 * Write a description of class BankCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankCard
{
    private int cardid;
    private int balanceamount ; 
    private String  bankaccount;
    private String clientname ;
    private String issuerbank;

    //Constructors//
    public BankCard(int cardid, int balanceamount  ,String issuerbank, String bankaccount)
    {
        this.clientname="";
        this.cardid=cardid;
        this.balanceamount=balanceamount;
        this.bankaccount= bankaccount;
        this. issuerbank=issuerbank;
        



    }
    //getters method//
    public int getcardid()
    {
        return this.cardid;
    }

    public int getbalanceamount()
    {
        return this.balanceamount;
    }

    public String getclientname ()
    {
        return this.clientname;
    }

    public String getissuername()
    {
        return this.clientname;
    }

    public String getbankaccount()
    {
        return this.bankaccount;
    }
    //setters method//
    public void setclientname(String clientname)
    {
        this.clientname=clientname;
    }
    public void setbalanceamount(int balanceamount)
    {
        this.balanceamount= balanceamount;
    }
    //display method //
    public void Bank_card()
    {
        if(this.clientname=="")
        {
            System.out.println("please set the client name");
        }
        else{
            System.out.println("The clientname is:"+this.clientname);
        }
        System.out.println( "The clientname is:"+this.clientname);
        System.out.println("The issuerbankis:"+this.issuerbank);
        System.out.println("The bankaccount is:"+this.bankaccount);
        System.out.println("The cardid is:"+this.cardid);
        System.out.println("The balanceamount is:"+this.balanceamount);
    }
    
    
}

   
