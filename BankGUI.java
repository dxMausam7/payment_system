import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;




/**
 * Write a description of class BankGUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankGUI implements ActionListener
{   
    //instance variable  for home 
    private JButton Creditbutton1;
    private JButton Debitbutton2; 
    private JFrame Home_obj; 
    private JPanel panHome_obj; 
    private JLabel Heading_obj; 
    private JLabel footer_obj; 
    

    //instance variable for Credit card 
    private JFrame credit_obj;
    private JButton Addcredit_but1;
    private JButton Cancel_but2;
    private JButton credit_homebut3;
    private JButton SetLimit_but4;
    private JButton Display_but5;
    private JButton Clear_but6;
    
    private JPanel pan_obj;
    private JLabel labR_obj;
    private JLabel cardid_lab1;
    private JLabel Balance_lab2;
    private JLabel BankAccount_lab3;
    private JLabel Issuer_lab4;
    private JLabel Client_lab5;
    private JLabel CVC_lab6;
    private JLabel line_obj;
    
    private JLabel InterestRate_obj;
    private JLabel CreditLimit_obj;
    private JLabel Graceperiod_obj;
    private JLabel ExpirationDate_obj;
    private JLabel Cardid1_obj;
    private JLabel NewCardid1_obj;
    

    private JTextField cardid_field1;
    private JTextField BalanceAmt_field2;
    private JTextField BankAcc_field3;
    private JTextField Issuer_field4;
    private JTextField client_field5;
    private JTextField CVC_field6;
    private JTextField interestrate1;
    private JTextField creditlimit;
    private JTextField expirationdate;
    private JTextField graceperiod;
    private JTextField CardidTxt1;
    private JTextField NewCardidTxt1;
    
    private JComboBox box11;
    private JComboBox box12;
    private JComboBox box13;
    

    //instance variable for debit card
    private JFrame Debit_obj;
    private JPanel Dpan_obj;
    private JLabel labeling1_obj;
    private JLabel Nextline_obj;
    private JLabel Dcardid_obj;
    private JLabel DBalanceamt_obj;
    private JLabel DBankacc_obj;
    private JLabel DIssuerbank_obj;
    private JLabel DClientname_obj;
    private JLabel DPinnumber_obj;
    private JLabel DWithdrawl_obj;
    private JLabel Dateofwithdrawl_obj;
    private JLabel DPinnumber2_obj;
    private JLabel Dcardid2_obj;
    private JTextField field12;
    private JTextField field13;
    private JTextField field1;
    private JTextField field2;
    private JTextField field3;
    private JTextField field4;
    private JTextField field5;
    private JTextField field6;
    private JTextField DfiS1;
    private JTextField DfiS5;
    private JButton Dbut3;
    private JButton Dbut1;
    private JButton Dbut4;
    private JButton Dbut5;
    private JButton Dbut6;
    private JComboBox Dbox11;
    private JComboBox Dbox12;
    private JComboBox Dbox13;
    private boolean a;
    //The array list for the Bank card class type
    ArrayList<BankCard> Arr_list = new ArrayList<BankCard>();
    
    
    
    
    
    
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == Creditbutton1) // Button for credit card in home page 
        {
            credit();
            Home_obj.dispose();
        }
        else if (e.getSource() == Debitbutton2) // button for tdebit card in home page 
        {
            debit();
            Home_obj.dispose();
        }
        else if (e.getSource() == Addcredit_but1)// button to add credit button
        {
            try{
          //This block of code retrives the input values entered by the users from various text fields and combo box in a grapgical user interface
          //These input values are then used to create a new credit object
          int cardI = Integer.valueOf(cardid_field1.getText());
          String Bank_acct =  (BankAcc_field3.getText());
          int Balance_Amt = Integer.valueOf(BalanceAmt_field2.getText());
          String issuer_Bank = Issuer_field4.getText();
          String client_Name =client_field5.getText();
          int cvc= Integer.valueOf(CVC_field6.getText());
          double interestrate= Double.parseDouble(interestrate1.getText());
          String day = box11.getSelectedItem().toString();
          String month = box12.getSelectedItem().toString();
          String year = box13.getSelectedItem().toString();
          String expirationdate= day+"/"+month+"/"+year;
              
          
          
          
          boolean b = true;
          for(BankCard obj: Arr_list)
          {
              if(obj instanceof CreditCard )
              {
                    CreditCard auto_obj = (CreditCard) obj;
                    if(auto_obj.getcardid()== cardI)
                    {
                        b=false;
            
                    }
                }
            }
          if(b==true)
            {
                CreditCard debit_obj = new CreditCard(cardI, Balance_Amt, issuer_Bank,Bank_acct,client_Name,cvc,interestrate, expirationdate);
                Arr_list.add(debit_obj);
                //Message Dialogue 
                JOptionPane.showMessageDialog(pan_obj, "Successfully added credit card");
            }
            else
                {
                    JOptionPane.showMessageDialog(pan_obj, "Already present card id");
                } 
        }
        catch (NumberFormatException XD)
        {
            if(cardid_field1.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(Dpan_obj, "Enter the cardid");
                
            }
            if(BalanceAmt_field2.getText().equals(""))
            {
                JOptionPane.showMessageDialog(Dpan_obj, "Your bank account is empty please enter the bank account ");
                
            }
            if(BankAcc_field3.getText().equals(""))
            {
                JOptionPane.showMessageDialog(Dpan_obj, "Your BankAcc is  empty, please enter  your Bank account ");
                
            }
            if( Issuer_field4.getText().equals(""))
            {
                JOptionPane.showMessageDialog(Dpan_obj, "Enter  issuer filed is empty, please enter the Issuer BANK");
                
            }
            if(client_field5.getText().equals(""))
            {
                JOptionPane.showMessageDialog(Dpan_obj, "Your client name is empty, please enter the Client name ");
                
            }
            if(CVC_field6.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(Dpan_obj, "Your client CVC number is empty, please enter the CVC number  ");
                
            }
            if(interestrate1.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(Dpan_obj, "Your interest rate  is empty, please enter the interest rate  ");
                
            }
            
            else
            {
               JOptionPane.showMessageDialog(Dpan_obj, "Please enter the valid details!!"); 
            }
        }
        }
        
        else if (e.getSource() == Cancel_but2) //cancel credit card button 
        {
            try
            { 
                 int cardId = Integer.valueOf(NewCardidTxt1.getText());
                 for (BankCard can1: Arr_list)
                 {
                     if (can1 instanceof CreditCard)
                     {
                         CreditCard credit_obj = (CreditCard)can1;
                         if(credit_obj.getcardid()==cardId)
                         {
                             credit_obj.cancelCreditCard();
                             JOptionPane.showMessageDialog(pan_obj,"The Credit Card ID is canceled  ");
                         }
                         else
                         {
                             JOptionPane.showMessageDialog(pan_obj,"cardid"+cardId+"please enter the valid card id");
                         }
                     }
                 }
            }       
            catch(NumberFormatException MB)
            {
                if(NewCardidTxt1.getText().isEmpty())
                {
                   JOptionPane.showMessageDialog(Dpan_obj, "Your card id is empty please Enter the cardid"); 
                }
                else
                {
                   JOptionPane.showMessageDialog(Dpan_obj, "Please enter the valid details!!");
                }
            }
        }
        //Home button
        else if (e.getSource() == credit_homebut3)
        {
          home();
          credit_obj.dispose();
        }
        else if (e.getSource() == SetLimit_but4)// Set credit limit 
        {
            try {
                  int NextcardI = Integer.valueOf(cardid_field1.getText());
                  int GracePeriod =  Integer.valueOf(graceperiod.getText());
                  double NextCreditLimit = Double.parseDouble(creditlimit.getText());
                  for (BankCard can1: Arr_list)
                 {
                     if (can1 instanceof CreditCard)
                     {
                         CreditCard credit_obj = (CreditCard)can1;
                         if(credit_obj.getcardid()==NextcardI)
                         {
                             credit_obj.setCreditLimit(NextCreditLimit,GracePeriod);
                             JOptionPane.showMessageDialog(pan_obj,"The card is:"+NextcardI+"\n"+"the grace period is:"+GracePeriod+"\n"+"The credit limit is:"+NextCreditLimit);
                             if (NextCreditLimit <= 2.5 * credit_obj.getbalanceamount())
                             {
                                JOptionPane.showMessageDialog(pan_obj,"The Credit is Successfully Granted"); 
                             }
                             else
                             {
                               JOptionPane.showMessageDialog(pan_obj,"The Credit is not granted please enter the valid amount  "); 
                             }
                         }
                         else
                         {
                             JOptionPane.showMessageDialog(pan_obj,"cardid"+NextcardI+"Please enter the valid card id");
                         }
                     }
                 }
            } catch(NumberFormatException MB)
            {
              if(cardid_field1.getText().isEmpty())  
              {
                 JOptionPane.showMessageDialog(pan_obj,"Your card id is empty please Enter the cardid ");  
              }
              else
              {
                  JOptionPane.showMessageDialog(pan_obj,"Please enter the valid details!!"); 
              }
            }
        }
        else if (e.getSource() == Display_but5)//display button
        {
            for (BankCard can1: Arr_list)
            {
                 if (can1 instanceof CreditCard)
                 {
                     CreditCard debit_obj = (CreditCard)can1;
                     debit_obj.Bank_card();
                     if(debit_obj.getisGranted()==true)
                     {
                         JOptionPane.showMessageDialog(pan_obj,"Card id :"+debit_obj.getcardid()+"\n"+" The CVC number is :"+debit_obj.getCVCnumber()+"\n"+"The interest rate is:"+debit_obj.getIntrestRate()+"\n"+"The expiration date:"+debit_obj.getExpirationDate()+"\n"+"The issuer bank:"+debit_obj.getissuername()+"\n"+"The Balance amount is:"+debit_obj.getbalanceamount()+"\n"+"The bank account is:"+debit_obj.getbalanceamount());
                     }
                     else
                     {
                        JOptionPane.showMessageDialog(pan_obj,"card id :"+debit_obj.getcardid()+"\n"+" The CVC number is :"+debit_obj.getCVCnumber()+"\n"+"The interest rate is:"+debit_obj.getIntrestRate()+"\n"+"The expiration date:"+debit_obj.getExpirationDate()+"\n"+"The issuer bank:"+debit_obj.getissuername()+"\n"+"The Balance amount is:"+debit_obj.getbalanceamount()+"\n"+"The bank account is:"+debit_obj.getbalanceamount());
                     }
                 }
            }
        }
        // clear button
        else if (e.getSource() == Clear_but6)
        {
            cardid_field1.setText("");
            BalanceAmt_field2.setText("");
            BankAcc_field3.setText("");
            Issuer_field4.setText("");
            client_field5.setText("");
            CVC_field6.setText("");
            interestrate1.setText("");
            creditlimit.setText("");
            expirationdate.setText("");
            graceperiod.setText("");
            NewCardidTxt1.setText("");
            
        }
        
        else if (e.getSource() == Dbut3)
        {
              home();
              Debit_obj.dispose();
        }
        
        else if (e.getSource() == Dbut5)//display button 

        {
            for (BankCard can1: Arr_list)
            {
                 if (can1 instanceof DebitCard)
                 {
                    DebitCard debit_obj = (DebitCard)can1;
                    debit_obj.Bank_card();
                    if(debit_obj.gethasWithdrawn()==true)
                    {

                         JOptionPane.showMessageDialog(pan_obj,"Card id :"+debit_obj.getcardid()+"\n"+" The PIN number is :"+debit_obj.getPINnumber()+"\n"+"The client Name :"+debit_obj.getclientname ()+"\n"+"\n"+"The issuer bank:"+debit_obj.getissuername()+"\n"+"The Balance amount is:"+debit_obj.getbalanceamount()+"\n"+"The bank account is:"+debit_obj.getbalanceamount()+"\n"+"The withdrawl amount is:"+debit_obj.getWithdrawAmount());
                         
        
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(pan_obj,"Card id :"+debit_obj.getcardid()+"\n"+" The PIN number is :"+debit_obj.getPINnumber()+"\n"+"The client Name :"+debit_obj.getclientname ()+"\n"+"\n"+"The issuer bank:"+debit_obj.getissuername()+"\n"+"The Balance amount is:"+debit_obj.getbalanceamount()+"\n"+"The bank account is:"+debit_obj.getbalanceamount());
                    }
                 }
            }
        }
        else if (e.getSource() == Dbut6)//clear button 
        {
            field1.setText("");
            field2.setText("");
            field3.setText("");
            field4.setText("");
            field5.setText("");
            field6.setText("");
            DfiS1.setText("");
            DfiS5.setText("");
        }
        else if (e.getSource() == Dbut1)//add debit card
        {
            try
            {
        
              int card_id = Integer.valueOf(field1.getText());
              String bank_acc = (field3.getText()); 
              int balance_Amt = Integer.valueOf(field2.getText());
              String Issuer_Bank = field4.getText();
              String Client_Name = field5.getText();
              int pin_Num= Integer.valueOf(field6.getText());
              //Creating object
              //array list 
              boolean a = true;
              for(BankCard obj: Arr_list)
              {
                  if(obj instanceof DebitCard )
                  {
                        DebitCard auto_obj = (DebitCard) obj;
                        if(auto_obj.getcardid()== card_id)
                        {
                            a=false;
                        }
                  }
              }
              if(a==true)
              {
                    if(field2.getText().equals(""))
                    {
                      JOptionPane.showMessageDialog(Dpan_obj, "Bank account  is empty plz enetr the card id!!");  
                    }
                    if(field4.getText().equals(""))
                    {
                      JOptionPane.showMessageDialog(Dpan_obj, "Issuer Bank is empty plz enetr the Issuer Bank !!");  
                    }
                    if(field5.getText().equals(""))
                    {
                      JOptionPane.showMessageDialog(Dpan_obj, "Client Name  is empty plz enetr the client name!!");  
                    }
            
                    else
                    {
                        DebitCard Debit_obj = new DebitCard(balance_Amt, card_id ,bank_acc, Issuer_Bank,Client_Name, pin_Num);
                        Arr_list.add(Debit_obj);
                        //Message Dialogue 
                        JOptionPane.showMessageDialog(Dpan_obj, "Successfully added debit card");
                    }
              }
              else
              {
                    JOptionPane.showMessageDialog(Dpan_obj, "Already present card id");
              } 
        }
        catch (NumberFormatException f)
        {   if(field1.getText().isEmpty())
            {
              JOptionPane.showMessageDialog(Dpan_obj, "Cardid is empty please enetr the card id!!");  
            }
            if(field2.getText().equals(""))
            {
              JOptionPane.showMessageDialog(Dpan_obj, "Bank account  is empty please enetr the Bank account !!");  
            }
            if(field4.getText().equals(""))
            {
              JOptionPane.showMessageDialog(Dpan_obj, "Balance amount  is empty please enetr the Balance amount !!");  
            }
            if(field5.getText().equals(""))
            {
              JOptionPane.showMessageDialog(Dpan_obj, "Client Name please enetr the Client !!");  
            }
            if(field6.getText().isEmpty())
            {
              JOptionPane.showMessageDialog(Dpan_obj, "PINnumner  is empty please enetr the Pinnumber!!");  
            }
            else 
            {
                JOptionPane.showMessageDialog(Dpan_obj, "Please enter the valid details!!");
            }
        }
        }

        else if (e.getSource() == Dbut4)//button of withdraw
        {
              try
              {

              int cardidN1 = Integer.valueOf(field13.getText());
              int WithdrawAmt = Integer.valueOf(DfiS1.getText());
              int PinN1 = Integer.valueOf(field12.getText()); 
              String day = Dbox11.getSelectedItem().toString();
              String month = Dbox12.getSelectedItem().toString();
              String year = Dbox13.getSelectedItem().toString();
              String WitDate =day+"/"+month+"/"+year;
              for (BankCard obj: Arr_list)
              {
                   if (obj instanceof DebitCard)
                    {
                        DebitCard auto_obj =(DebitCard) obj;
                      //comparing the value of cardId are same or not 
                      if (auto_obj.getcardid()==cardidN1)
                        {
                            JOptionPane.showMessageDialog(Dpan_obj, "The card ID is:"+cardidN1+"\n"+"The withdrawl amount is:"+WithdrawAmt+"\n");
                            if(auto_obj.getPINnumber()==PinN1)
                            {
                                if(WithdrawAmt<=auto_obj.getbalanceamount())
                                {
                                    auto_obj.Withdraw(WithdrawAmt, WitDate, PinN1);
                                    JOptionPane.showMessageDialog(Dpan_obj, "The card ID is:"+cardidN1+"\n"+"The withamount is:"+WithdrawAmt+"The date of withdraw is:"+WitDate+"\n"+"The balance amount"+auto_obj.getbalanceamount());
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(Dpan_obj,"Your Bank balance amount is insufficient");
                                }
                            }
                            else
                            {
                               JOptionPane.showMessageDialog(Dpan_obj,"Your Pin Number is incorrect"); 
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(Dpan_obj, cardidN1+"Your Card ID didn't match ");  
                        }
                    }
                }
            }
            catch(NumberFormatException Dx)
            {
                if(field12.getText().isEmpty())
                {
                  JOptionPane.showMessageDialog(Dpan_obj, "The card id is empty, please enter the card id   ");  
                }
                if(DfiS1.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(Dpan_obj, "The withdraw amount  is empty, please enter the withdraw amount  ");
                }
                if(field13.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(Dpan_obj, "The pin number  is empty, please enter the pin number!!  ");
                }
                else
                {
                   JOptionPane.showMessageDialog(Dpan_obj, "Please enter the valid details!!"); 
                }
            }
        }
    
        
    }
    public static void main(String[] args)
    {
        BankGUI obj = new BankGUI();
        obj.home();
    }
    public void home()
    {
        Home_obj = new JFrame();
        Home_obj.setTitle("NIC Asia BANK");
        Home_obj.setBounds(205, 0,850,600);
        Home_obj.setResizable(false);
        Home_obj.setLayout(null);//layout vaneko position ho 
        
        //creating Jpanel
        panHome_obj= new JPanel();
        panHome_obj.setBounds(0, 0, 850, 690);
        panHome_obj.setBackground(Color.decode("#CEEFD9"));
        
        Heading_obj = new JLabel ("HOME PAGE");
        Heading_obj.setBounds(390, 30, 250, 15);
        Font ffRH = new Font("Arial", Font.BOLD, 20);
        Heading_obj.setFont(ffRH);
        panHome_obj.add(Heading_obj);
        
        Creditbutton1 = new JButton();
        Creditbutton1.setText("Credit Card ");
        Creditbutton1.setBounds(200,100, 450, 100);
        Creditbutton1.setBackground(Color.decode("#F0E3E1"));
        Creditbutton1.addActionListener(this);
        panHome_obj.add(Creditbutton1);
        
        Debitbutton2= new JButton();
        Debitbutton2.setText("Debit Card ");
        Debitbutton2.setBounds(200, 250, 450, 100);
        Debitbutton2.setBackground(Color.decode("#8F9FF6"));
        Debitbutton2.addActionListener(this);
        panHome_obj.add(Debitbutton2);
        
        footer_obj = new JLabel ("Footer");
        footer_obj.setBounds(390, 500, 80, 15);
        Font ffRF = new Font("Arial", Font.BOLD, 12);
        footer_obj.setFont(ffRF);
        panHome_obj.add(footer_obj);
        
        
        


        
        //adding jpane in jframe.
        panHome_obj.setLayout(null);
        
        Home_obj.add(panHome_obj); 
        Home_obj.setVisible(true);
    }
    
    public void credit()
    {
        credit_obj = new JFrame();
        credit_obj.setTitle("Sometimes Bank");
        credit_obj.setBounds(205, 0,850,600);
        credit_obj.setResizable(false);
        credit_obj.setLayout(null);//layout vaneko position ho 
        
        //creating Jpanel
        pan_obj= new JPanel();
        pan_obj.setBounds(0, 0, 850, 690);
        pan_obj.setBackground(Color.decode("#CEB2E3"));
        //adding jpane in jframe
        pan_obj.setLayout(null);
       
        //heading of credit card/
        labR_obj = new JLabel ("Credit Card");
        labR_obj.setBounds(390, 30, 80, 15);
        Font ffR = new Font("Arial", Font.BOLD, 12);
        labR_obj.setFont(ffR);
        pan_obj.add(labR_obj);
        
        line_obj = new JLabel ("__________");
        line_obj.setBounds(390, 30, 80, 15);
        Font ffRL = new Font("Arial", Font.BOLD, 12);
        labR_obj.setFont(ffRL);
        pan_obj.add(line_obj);
        
        
        
        cardid_lab1 = new JLabel ("Card ID");
        cardid_lab1.setBounds(50, 100, 80, 15);
        Font ff = new Font("Arial", Font.PLAIN, 12);
        cardid_lab1.setFont(ff);
        pan_obj.add(cardid_lab1);
        
        Balance_lab2 = new JLabel ("Balance Amount");
        //x axis: y axis, width, height
        Balance_lab2.setBounds(50, 145, 150, 15);
        Font fff = new Font("Arial", Font.PLAIN, 12);
        Balance_lab2.setFont(fff);
        pan_obj.add(Balance_lab2);
        
        BankAccount_lab3 = new JLabel ("Bank Account");
        BankAccount_lab3.setBounds(50, 185, 80, 15);
        Font ffff = new Font("Arial", Font.PLAIN, 12);
        BankAccount_lab3.setFont(ffff);
        pan_obj.add(BankAccount_lab3);
        
        Issuer_lab4 = new JLabel ("Issuer Bank");
        Issuer_lab4.setBounds(500, 100, 80, 15);
        Font fffff = new Font("Arial", Font.PLAIN, 12);
        Issuer_lab4.setFont(fffff);
        pan_obj.add(Issuer_lab4);
        
        Client_lab5 = new JLabel ("Client Name ");
        Client_lab5.setBounds(500, 145, 80, 15);
        Font ffffff = new Font("Arial", Font.PLAIN, 12);
        Client_lab5.setFont(ffffff);
        pan_obj.add(Client_lab5);
        
        CVC_lab6 = new JLabel ("CVC Number");
        CVC_lab6.setBounds(500, 185, 80, 15);
        Font ffffv = new Font("Arial", Font.PLAIN, 12);
        CVC_lab6.setFont(ffffv);
        pan_obj.add(CVC_lab6);
        //
        cardid_field1 = new JTextField();
        cardid_field1.setBounds(150, 95, 170, 20);
        pan_obj.add(cardid_field1);
        
        BalanceAmt_field2= new JTextField();
        BalanceAmt_field2.setBounds(150, 140, 170, 20);
        pan_obj.add(BalanceAmt_field2);
        
        BankAcc_field3 = new JTextField();
        BankAcc_field3.setBounds(150, 180, 170, 20);
        pan_obj.add(BankAcc_field3);
        
        Issuer_field4 = new JTextField();
        Issuer_field4.setBounds(600, 95, 170, 20);
        pan_obj.add(Issuer_field4);
        
        client_field5 = new JTextField();
        client_field5.setBounds(600, 140, 170, 20);
        pan_obj.add(client_field5);
        
        CVC_field6 = new JTextField();
        CVC_field6.setBounds(600, 180, 170, 20);
        pan_obj.add(CVC_field6);

        Addcredit_but1 = new JButton();
        Addcredit_but1.setText("Add Credit Card ");
        Addcredit_but1.setBounds(500, 250, 170, 30);
        Addcredit_but1.setBackground(Color.decode("#8F9FF6"));
        Addcredit_but1.addActionListener(this);
        pan_obj.add(Addcredit_but1);
        
        Cancel_but2= new JButton();
        Cancel_but2.setText("Cancel credit card ");
        Cancel_but2.setBounds(425, 450, 170, 30);
        Cancel_but2.setBackground(Color.decode("#8F9FF6"));
        Cancel_but2.addActionListener(this);
        pan_obj.add(Cancel_but2);
        
        credit_homebut3 = new JButton();
        credit_homebut3.setText("Home ");
        credit_homebut3.setBounds(650, 350, 100, 30);
        credit_homebut3.addActionListener(this);
        pan_obj.add(credit_homebut3);
        
        SetLimit_but4= new JButton();
        SetLimit_but4.setText("Set Credit limit");
        SetLimit_but4.setBounds(120, 500, 150, 30);
        SetLimit_but4.setBackground(Color.decode("#8F9FF6"));
        SetLimit_but4.addActionListener(this);
        pan_obj.add(SetLimit_but4);
        //
        
        Display_but5 = new JButton();
        Display_but5.setText("Display");
        Display_but5.setBounds(650, 400, 100, 30);
        Display_but5.addActionListener(this);
        pan_obj.add(Display_but5);
        
        Clear_but6 = new JButton();
        Clear_but6.setText("Clear");
        Clear_but6.setBounds(650, 450, 100, 30);
        Clear_but6.addActionListener(this);
        pan_obj.add(Clear_but6);
        
        //next panel 2
        InterestRate_obj = new JLabel ("Interest Rate");
        InterestRate_obj.setBounds(50, 220, 80, 15);
        Font ffffS = new Font("Arial", Font.PLAIN, 12);
        InterestRate_obj.setFont(ffffS);
        pan_obj.add(InterestRate_obj);
        
        interestrate1 = new JTextField();
        interestrate1 .setBounds(150, 215, 170, 20);
        pan_obj.add(interestrate1);
        
        CreditLimit_obj = new JLabel ("Credit Limit");
        CreditLimit_obj.setBounds(50, 450, 150, 15);
        Font ffffS2 = new Font("Arial", Font.PLAIN, 12);
        CreditLimit_obj.setFont(ffffS2);
        pan_obj.add(CreditLimit_obj);
        
        creditlimit = new JTextField();
        creditlimit.setBounds(150, 445, 170, 20);
        pan_obj.add(creditlimit);
        
        
        
        Cardid1_obj = new JLabel ("CardID");
        Cardid1_obj .setBounds(50, 350, 80, 15);
        Font ffffC1 = new Font("Arial", Font.PLAIN, 12);
        Cardid1_obj .setFont(ffffC1);
        pan_obj.add(Cardid1_obj);
        
        CardidTxt1 = new JTextField();
        CardidTxt1.setBounds(150, 345, 170, 20);
        pan_obj.add(CardidTxt1);
        
        NewCardid1_obj = new JLabel ("CardID");
        NewCardid1_obj .setBounds(425, 420, 80, 15);
        Font ffffC2 = new Font("Arial", Font.PLAIN, 12);
        NewCardid1_obj .setFont(ffffC2);
        pan_obj.add(NewCardid1_obj);
        
        NewCardidTxt1 = new JTextField();
        NewCardidTxt1.setBounds(500, 415, 80, 20);
        pan_obj.add(NewCardidTxt1);
         
         
        Graceperiod_obj = new JLabel ("Grace Period");
        Graceperiod_obj.setBounds(50, 400, 80, 15);
        Font ffffS4 = new Font("Arial", Font.PLAIN, 12);
        Graceperiod_obj.setFont(ffffS4);
        pan_obj.add(Graceperiod_obj);
        
        graceperiod = new JTextField();
        graceperiod.setBounds(150, 395, 170, 20);
        pan_obj.add(graceperiod);
        
        ExpirationDate_obj = new JLabel ("Expiration Date");
        ExpirationDate_obj.setBounds(50, 250, 150, 15);
    
        Font ffffS5 = new Font("Arial", Font.PLAIN, 12);
        ExpirationDate_obj.setFont(ffffS5);
        pan_obj.add(ExpirationDate_obj);
        
        DefaultComboBoxModel<String> day = new DefaultComboBoxModel<>();
        for (int i = 1; i<33; i++)
        {
            day.addElement(String.valueOf(i));
        }
        
        
        box11 = new JComboBox(day);
        box11.setBounds(150, 250, 50, 20);
        pan_obj.add(box11);
        
        String months[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        box12 = new JComboBox(months);
        box12.setBounds(220, 250, 80, 20);
        pan_obj.add(box12);
        
        DefaultComboBoxModel<String>year = new DefaultComboBoxModel<>();
        for(int i = 2023; i>1990; i--)
        {
            year.addElement(String.valueOf(i));
        }
        
        box13 = new JComboBox(year);
        box13.setBounds(320, 250, 80, 20);
        pan_obj.add(box13);
        
        credit_obj.add(pan_obj); 
        credit_obj.setVisible(true);
    }
    
    
    public void debit()
    {
        Debit_obj = new JFrame();
        Debit_obj.setTitle("Himalchuli  BANK");
        Debit_obj.setBounds(205, 0,850,600);
        Debit_obj.setResizable(false);
        Debit_obj.setLayout(null);//layout vaneko position ho 
        
        //creating Jpanel
        Dpan_obj= new JPanel();
        Dpan_obj.setBounds(0, 0, 850, 690);
        Dpan_obj.setBackground(Color.decode("#E4D6EB"));
        //adding jpane in jframe
        Dpan_obj.setLayout(null);
       
        
        labeling1_obj = new JLabel ("Debit Card");
        labeling1_obj.setBounds(390, 30, 80, 15);
        Font font1= new Font("Arial", Font.BOLD, 12);
        labeling1_obj.setFont(font1);
        Dpan_obj.add(labeling1_obj);
        
        Nextline_obj = new JLabel ("_________");
        Nextline_obj.setBounds(390, 30, 80, 15);
        Font font2 = new Font("Arial", Font.BOLD, 12);
        Nextline_obj.setFont(font2);
        Dpan_obj.add(Nextline_obj);
        
        
        
        
        Dcardid_obj = new JLabel ("Card ID");
        Dcardid_obj.setBounds(50, 100, 80, 15);
        Font font3 = new Font("Arial", Font.PLAIN, 12);
        Dcardid_obj.setFont(font3);
        Dpan_obj.add(Dcardid_obj);
        
        DBalanceamt_obj = new JLabel ("Balance Amount");
        //x axis: y axis, width, height
        DBalanceamt_obj.setBounds(50, 145, 150, 15);
        Font font4= new Font("Arial", Font.PLAIN, 12);
        DBalanceamt_obj.setFont(font4);
        Dpan_obj.add(DBalanceamt_obj);
        
        DBankacc_obj = new JLabel ("Bank Account");
        DBankacc_obj.setBounds(50, 185, 80, 15);
        Font font5 = new Font("Arial", Font.PLAIN, 12);
        DBankacc_obj.setFont(font5);
        Dpan_obj.add(DBankacc_obj);
        
        DIssuerbank_obj = new JLabel ("Issuer Bank");
        DIssuerbank_obj.setBounds(500, 100, 80, 15);
        Font font6 = new Font("Arial", Font.PLAIN, 12);
        DIssuerbank_obj.setFont(font6);
        Dpan_obj.add(DIssuerbank_obj);
        
        DClientname_obj = new JLabel ("Client Name ");
        DClientname_obj.setBounds(500, 145, 80, 15);
        Font font7 = new Font("Arial", Font.PLAIN, 12);
        DClientname_obj.setFont(font7);
        Dpan_obj.add(DClientname_obj);
        
        DPinnumber_obj = new JLabel ("Pin Number");
        DPinnumber_obj.setBounds(500, 185, 80, 15);
        Font font8 = new Font("Arial", Font.PLAIN, 12);
        DPinnumber_obj.setFont(font8);
        Dpan_obj.add(DPinnumber_obj);
        
        field1 = new JTextField();
        field1.setBounds(150, 95, 170, 20);
        Dpan_obj.add(field1);
        
        
        
        //
        field2 = new JTextField();
        field2.setBounds(150, 140, 170, 20);
        Dpan_obj.add(field2);
        
        field3 = new JTextField();
        field3.setBounds(150, 180, 170, 20);
        Dpan_obj.add(field3);
        
        field4 = new JTextField();
        field4.setBounds(600, 95, 170, 20);
        Dpan_obj.add(field4);
        
        field5 = new JTextField();
        field5.setBounds(600, 140, 170, 20);
        Dpan_obj.add(field5);
        
        field6 = new JTextField();
        field6.setBounds(600, 180, 170, 20);
        Dpan_obj.add(field6);

        Dbut1 = new JButton();
        Dbut1.setText("Add Debit Card ");
        Dbut1.setBounds(350, 250, 170, 30);
        Dbut1.addActionListener(this);
        Dpan_obj.add(Dbut1);
        
        
        Dbut3 = new JButton();
        Dbut3.setText("Home ");
        Dbut3.setBounds(650, 350, 100, 30);
        Dbut3.addActionListener(this);
        Dpan_obj.add(Dbut3);
        
        Dbut4= new JButton();
        Dbut4.setText("Withdraw");
        Dbut4.setBounds(400, 390, 150, 30);
        Dbut4.addActionListener(this);
        Dpan_obj.add(Dbut4);
        
        
        Dbut5 = new JButton();
        Dbut5.setText("Display");
        Dbut5.setBounds(650, 400, 100, 30);
        Dbut5.addActionListener(this);
        Dpan_obj.add(Dbut5);
        
        Dbut6 = new JButton();
        Dbut6.setText("Clear");
        Dbut6.setBounds(650, 450, 100, 30);
        Dbut6.addActionListener(this);
        Dpan_obj.add(Dbut6);
        
        
        DPinnumber2_obj = new JLabel ("Pin Number");
        DPinnumber2_obj.setBounds(50, 395, 80, 15);
        Font font82 = new Font("Arial", Font.PLAIN, 12);
        DPinnumber2_obj.setFont(font82);
        Dpan_obj.add(DPinnumber2_obj);
        
        field12 = new JTextField();
        field12.setBounds(150, 390, 170, 20);
        Dpan_obj.add(field12);
        
        Dcardid2_obj = new JLabel ("Cardid");
        Dcardid2_obj.setBounds(50, 345, 80, 15);
        Font font83 = new Font("Arial", Font.PLAIN, 12);
        Dcardid2_obj.setFont(font83);
        Dpan_obj.add(Dcardid2_obj);
        
        field13 = new JTextField();
        field13.setBounds(150, 340, 170, 20);
        Dpan_obj.add(field13);
        
        //
        
        
        //next panel 2
        DWithdrawl_obj = new JLabel ("Withdrawl Amount");
        DWithdrawl_obj.setBounds(50, 445, 150, 15);
        Font font9 = new Font("Arial", Font.PLAIN, 12);
        DWithdrawl_obj.setFont(font9);
        Dpan_obj.add(DWithdrawl_obj);
        
        DfiS1 = new JTextField();
        DfiS1.setBounds(155, 440, 170, 20);
        Dpan_obj.add(DfiS1);
      
        
        
        Dateofwithdrawl_obj = new JLabel ("Date of Withdrawl");
        Dateofwithdrawl_obj.setBounds(50, 495, 200, 15);
        Font font10 = new Font("Arial", Font.PLAIN, 12);
        Dateofwithdrawl_obj.setFont(font10);
        Dpan_obj.add(Dateofwithdrawl_obj);
        
        DefaultComboBoxModel<String> day = new DefaultComboBoxModel<>();
        for (int i = 1; i<33; i++)
        {
            day.addElement(String.valueOf(i));
        }
        Dbox11 = new JComboBox(day);
        Dbox11.setBounds(150, 490, 50, 20);
        Dpan_obj.add(Dbox11);
        
        String months[] = {"January","February","March","April","May","June","July","August","September","October","Nov","Dec"};
        Dbox12 = new JComboBox(months);
        Dbox12.setBounds(250, 490, 50, 20);
        Dpan_obj.add(Dbox12);
        
        DefaultComboBoxModel<String>year = new DefaultComboBoxModel<>();
        for(int i = 2023; i>1990; i--)
        {
            year.addElement(String.valueOf(i));
        }
        Dbox13 = new JComboBox(year);
        Dbox13.setBounds(350, 490, 50, 20);
        Dpan_obj.add(Dbox13);
        
        Debit_obj.add(Dpan_obj); 
        Debit_obj.setVisible(true);
    }

}
