import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class BankGUI implements ActionListener
{
    ArrayList<BankCard> bankCard = new ArrayList<BankCard>();
    JFrame f,f1,f2,f3,f4,f5,f6,f7 ;
    JPanel p,p1,p2,p3,p4,p5,p6,p7;
    JButton addDebit,withdraw,display,clear,clear2,addCredit,creditLimit,cancleCredit,display2,get,get2,addDr,addCr,goB1,goB2; 
    JLabel debit,credit,balance,cardid,bankAcc,bank,name,pin,cvc,interest,expDate,withdrawAmt,withdrawDate,grace,topCR,topDR,topWEL,topWIT,name2,topSET,topCAN,creditLIM;
    JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12,tf13,tf14,tf15,tf16,tf17,tf18,tf19,tf20,tf21,tf22;
    JComboBox cb1,cb2,cb3,cb4,cb5,cb6;
    
    
    
    BankGUI()
    {
        f = new JFrame("Bank System");
        p = new JPanel();
        f.add(p);
        p.setLayout(null);
        topWEL = new JLabel("Wellcome");
        topWEL.setBounds(249,34,301,34);
    
        addDebit = new JButton("DEBIT CARD");
        addDebit.setBounds(30,50,120,50);
        addDebit.setFocusable(false);
        p.add(addDebit);
        addDebit.addActionListener(this);
        
        addCredit = new JButton("CREDIT CARD");
        addCredit.setBounds(200,50,120,50);
        addCredit.setFocusable(false);
        p.add(addCredit);
        addCredit.addActionListener(this);
    
        f.setVisible(true);
        f.setSize(400,200);
        f.setDefaultCloseOperation(f.DISPOSE_ON_CLOSE);
    }
    
    public void DebitCard()
    {
        f1 = new JFrame("DEBIT CARD");
        p1 = new JPanel();
        f1.add(p1);
        p1.setLayout(null);
        topDR = new JLabel("DEBIT CARD");
        topDR.setBounds(86,48,250,34);
        p1.add(topDR);
        topDR.setFont(new Font("Verdana", Font.BOLD, 24));
        
        topWIT = new JLabel("WITHDRAW");
        topWIT.setBounds(750,48,250,34);
        p1.add(topWIT);
        topWIT.setFont(new Font("Verdana", Font.BOLD, 24));
        
        goB1 = new JButton("<--");
        goB1.setBounds(0,10,102,20);
        goB1.setFocusable(false);
        p1.add(goB1);
        
        addDr = new JButton("ADD DEBIT");
        addDr.setBounds(300,500,121,32);
        addDr.setFocusable(false);
        p1.add(addDr);
        
        withdraw = new JButton("WITHDRAW");
        withdraw.setBounds(640,500,120,32);
        withdraw.setFocusable(false);
        p1.add(withdraw);
        
        display = new JButton("DISPLAY");
        display.setBounds(90,500,120,32);
        display.setFocusable(false);
        p1.add(display);
        
        get = new JButton("GET");
        get.setBounds(650,270,100,25);
        get.setFocusable(false);
        p1.add(get);
        
        balance = new JLabel("Balance Amount :");//for Balance amount of debit card
        balance.setBounds(87,189,102,19);
        p1.add(balance);
        tf1 = new JTextField();
        tf1.setBounds(200,189,180,19);
        p1.add(tf1);
        
        cardid = new JLabel("Card ID :");//for Card id of debit card
        cardid.setBounds(87,237,102,20);
        p1.add(cardid);
        tf3 = new JTextField();
        tf3.setBounds(200,237,180,20);
        p1.add(tf3);
        
        cardid = new JLabel("Card ID :");//for Card id of debit card
        cardid.setBounds(650,237,102,20);
        p1.add(cardid);
        tf19 = new JTextField();
        tf19.setBounds(750,237,180,20);
        p1.add(tf19);
        
        bankAcc= new JLabel("Bank Account :");//for Card id of Credit card
        bankAcc.setBounds(87,285,102,20);
        p1.add(bankAcc);
        tf5 = new JTextField();
        tf5.setBounds(200,280,180,20);
        p1.add(tf5);
        
        bank= new JLabel("Issuer Bank :");//for Card id of Credit card
        bank.setBounds(87,333,74,20);
        p1.add(bank);
        tf7 = new JTextField();
        tf7.setBounds(200,329,180,20);
        p1.add(tf7);
        
        name= new JLabel("Name :");//for Card id of Credit card
        name.setBounds(87,381,74,20);
        p1.add(name);
        tf8 = new JTextField();
        tf8.setBounds(200,378,180,20);
        p1.add(tf8);
        
        pin= new JLabel("PIN number :");//for Card id of Credit card
        pin.setBounds(87,429,74,20);
        p1.add(pin);
        tf10 = new JTextField();
        tf10.setBounds(200,427,180,20);
        p1.add(tf10);
        
        pin= new JLabel("PIN number :");//for Card id of Credit card
        pin.setBounds(650,400,74,20);
        p1.add(pin);
        tf20 = new JTextField();
        tf20.setBounds(750,400,180,20);
        p1.add(tf20);
        
        withdrawAmt= new JLabel("Withdrawan Amount:");//for Card id of Credit card
        withdrawAmt.setBounds(650,300,120,20);
        p1.add(withdrawAmt);
        tf12 = new JTextField();
        tf12.setBounds(800,300,150,20);
        p1.add(tf12);
        
        String[]year = {"2023"};
        String[]month = {"Jan","Feb","Mar","Api","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        String[]day = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        
        withdrawDate = new JLabel("Withdrawan Date :");
        withdrawDate.setBounds(650,350,180,20);
        p1.add(withdrawDate);
        cb1 = new JComboBox(year);
        cb1.setBounds(755,350,56,20);
        p1.add(cb1);
        cb2 = new JComboBox(month);
        cb2.setBounds(815,350,77,20);
        p1.add(cb2);
        cb3 = new JComboBox(day);
        cb3.setBounds(895,350,80,20);
        p1.add(cb3);
        
        clear = new JButton("CLEAR");
        clear.setBounds(850,500,120,32);
        clear.setFocusable(false);
        p1.add(clear);
        
        get.addActionListener(this);
        display.addActionListener(this);
        addDr.addActionListener(this);
        goB1.addActionListener(this);
        f1.setVisible(true);
        f1.setSize(1000,900);
        f1.setDefaultCloseOperation(f1.DISPOSE_ON_CLOSE);
        
        
    }
    public void CreditCard()
    {
        f2 = new JFrame("CREDIT CARD");
        p2 = new JPanel();
        f2.add(p2);
        p2.setLayout(null);
        topCR = new JLabel("CREDIT CARD");
        topCR.setBounds(86,48,250,34);
        p2.add(topCR);
        topCR.setFont(new Font("Verdana", Font.BOLD, 24));
        
        balance = new JLabel("Balance Amount :");//for Balance amount of credit card
        balance.setBounds(87,150,102,19);
        p2.add(balance);
        tf2 = new JTextField();
        tf2.setBounds(200,150,180,19);
        p2.add(tf2);
        
        get2 = new JButton("GET");
        get2.setBounds(87,250,102,19);
        get2.setFocusable(false);
        p2.add(get2);
        
        
        
        clear2 = new JButton("CLEAR");
        clear.setBounds(450,600,120,32);
        clear.setFocusable(false);
        p2.add(clear);
        
        goB2 = new JButton("<--");
        goB2.setBounds(0,10,102,20);
        goB2.setFocusable(false);
        p2.add(goB2);
        
        cancleCredit = new JButton("CANCLECREDIT");
        cancleCredit.setBounds(750,600,120,32);
        cancleCredit.setFocusable(false);
        p2.add(cancleCredit);
        
        name2 = new JLabel("Name:");
        name2.setBounds(86,475,120,19);
        p2.add(name2);
        tf13 = new JTextField();
        tf13.setBounds(200,475,180,19);
        p2.add(tf13);
        
        cardid = new JLabel("Card ID :");//for Card id of Credit card
        cardid.setBounds(87,189,102,20);
        p2.add(cardid);
        tf4 = new JTextField();
        tf4.setBounds(200,189,180,20);
        p2.add(tf4);
        
        addCr = new JButton("ADD CREDIT");
        addCr.setBounds(87,600,121,32);
        addCr.setFocusable(false);
        p2.add(addCr);
        
        topCR = new JLabel("SET CREDIT LIMIT");
        topCR.setBounds(700,48,250,34);
        p2.add(topCR);
        topCR.setFont(new Font("Verdana", Font.BOLD, 24));
        
        cardid = new JLabel("Card ID :");//for Card id of Credit card
        cardid.setBounds(600,240,102,20);
        p2.add(cardid);
        tf22 = new JTextField();
        tf22.setBounds(750,240,180,20);
        p2.add(tf22);
        
        creditLIM = new JLabel("Set Limit :");//for Card id of Credit card
        creditLIM.setBounds(600,150,102,20);
        p2.add(creditLIM);
        tf14 = new JTextField();
        tf14.setBounds(750,150,180,20);
        p2.add(tf14);
        
        grace = new JLabel("Grace Period:");
        grace.setBounds(600,195,102,20);
        p2.add(grace);
        tf15 = new JTextField();
        tf15.setBounds(750,195,180,20);
        p2.add(tf15);
        
        bankAcc= new JLabel("Bank Account :");//for Card id of Credit card
        bankAcc.setBounds(87,285,102,20);
        p2.add(bankAcc);
        tf6 = new JTextField();
        tf6.setBounds(200,280,180,20);
        p2.add(tf6);
        
        display2 = new JButton("DISPLAY");
        display2.setBounds(250,600,120,32);
        display2.setFocusable(false);
        p2.add(display2);
        
        bank= new JLabel("Issuer Bank :");//for Card id of Credit card
        bank.setBounds(87,333,74,20);
        p2.add(bank);
        tf17 = new JTextField();
        tf17.setBounds(200,329,180,20);
        p2.add(tf17);
        
        cvc= new JLabel("CVC Number :");//for Card id of Credit card
        cvc.setBounds(87,381,100,20);
        p2.add(cvc);
        tf9 = new JTextField();
        tf9.setBounds(200,378,180,20);
        p2.add(tf9);
        
        interest= new JLabel("Intrest Rate :");//for Card id of Credit card
        interest.setBounds(87,429,74,20);
        p2.add(interest);
        tf11 = new JTextField();
        tf11.setBounds(200,427,180,20);
        p2.add(tf11);
        
        creditLimit = new JButton("SET");
        creditLimit.setBounds(750,300,120,32);
        creditLimit.setFocusable(false);
        p2.add(creditLimit);
        
        topCAN= new JLabel("CANCEL CREDIT");
        topCAN.setBounds(700,400,250,34);
        p2.add(topCAN);
        topCAN.setFont(new Font("Verdana", Font.BOLD, 24));
        
        cardid = new JLabel("Card ID :");//for Card id of Credit card
        cardid.setBounds(600,450,102,20);
        p2.add(cardid);
        tf21 = new JTextField();
        tf21.setBounds(750,450,180,20);
        p2.add(tf21);
        
        String[]year = {"2023"};
        String[]month = {"Jan","Feb","Mar","Api","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        String[]day = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        
        expDate = new JLabel("ExpirationDate:");
        expDate.setBounds(88,525,180,20);
        p2.add(expDate);
        cb4 = new JComboBox(year);
        cb4.setBounds(231,525,56,20);
        p2.add(cb4);
        cb5 = new JComboBox(month);
        cb5.setBounds(299,525,77,20);
        p2.add(cb5);
        cb6 = new JComboBox(day);
        cb6.setBounds(388,525,91,20);
        p2.add(cb6);
        
        
        display2.addActionListener(this);
        addCr.addActionListener(this);
        goB2.addActionListener(this);
        f2.setVisible(true);
        f2.setSize(1000,900);
        f2.setDefaultCloseOperation(f2.DISPOSE_ON_CLOSE);
    }

    public static void main(String[]args)
    {
        new BankGUI();
    }
    
    public void actionPerformed(ActionEvent click)
    {
        if(click.getSource() == addDebit)
        {
            DebitCard();
            f.setVisible(false);
       }
        else if(click.getSource()==addCredit)
        {
            CreditCard();
            f.setVisible(false);
        }
        else if(click.getSource()==goB1)
        {
            f.setVisible(true);
            f1.setVisible(false);
        }
        else if(click.getSource()==goB2)
        {
            f.setVisible(true);
            f2.setVisible(false);
        }
        else if(click.getSource()== addDr)
        {
            try
            {
            double bAmount = Double.parseDouble((tf1.getText()).trim());
            int cId = Integer.parseInt((tf3.getText()).trim());
            String bAccount = tf5.getText();
            String issBank = tf7.getText();
            String name = tf8.getText();
            int pNumber = Integer.parseInt((tf10.getText()).trim());
                
            JOptionPane.showMessageDialog(f2, "Your form has been sunmitted THANK YOU","TitleBar",JOptionPane.INFORMATION_MESSAGE);
            BankCard debitobj = new DebitCard(bAmount,cId,bAccount,issBank,name,pNumber);
            bankCard.add(debitobj);
                
            }
            catch(Exception e)
            {   
                System.out.println("Please enter in correct formant.");
            }   
        }
       else if(click.getSource()==addCr)
       {
         try
         {
             double bAmount = Double.parseDouble((tf2.getText()).trim());
             String name = tf13.getText();
             int cId = Integer.parseInt((tf4.getText()).trim());
             String bAccount = tf6.getText();
             String issBank = tf17.getText();
             int cvcNum = Integer.parseInt((tf9.getText()).trim());
             double inRate = Double.parseDouble((tf11.getText()).trim());
             String expDateDay = cb6.getSelectedItem().toString();
             String expDateYear = cb4.getSelectedItem().toString();
             String expDateMonth = cb5.getSelectedItem().toString();
             String expDate=expDateYear+expDateMonth+expDateDay;
             
             
             
             
             JOptionPane.showMessageDialog(f2, "Your form has been sunmitted THANK YOU","TitleBar",JOptionPane.INFORMATION_MESSAGE);
             BankCard creditobj = new CreditCard(bAmount,name,cId,bAccount,issBank,cvcNum,inRate,expDate);
             bankCard.add(creditobj);
             
         }
         
         catch(Exception e)
         {
             System.out.println("Please enter in correct formant.");
         }
       }
       else if(click.getSource()== withdraw)
       {
           try
           {
               int caId = Integer.parseInt((tf3.getText()).trim());
               int pNumber = Integer.parseInt((tf20.getText()).trim());
               String withDateDay = cb3.getSelectedItem().toString();
               String withDateYear = cb1.getSelectedItem().toString();
               String withDateMonth = cb2.getSelectedItem().toString();
               String withDate=withDateYear+withDateMonth+withDateDay;
               int withAmount=Integer.parseInt((tf12.getText()).trim());

               for(BankCard withdraw: bankCard)
               {
                   if(withdraw instanceof DebitCard)
                   {
                       DebitCard withobj = (DebitCard)withdraw;
                       withobj.withdraw(pNumber,withDate,withAmount);
                       System.out.println("The amount has been successfully withdrawn");
                   }
                   
               }
           }
           catch(Exception e)
           {
                System.out.println("The amount has not been withdrawn please check the balance amount or enter correct credentians");  
           }
        
       }
       else if(click.getSource() == display)
       {
            for(BankCard display:bankCard)
               {
                   if(display instanceof DebitCard)
                   {
                       DebitCard displayobj = (DebitCard)display;
                       displayobj.display();
                   }
               }
       }
       else if(click.getSource() == get)
       {   
           int cId = Integer.parseInt((tf19.getText()).trim());
           for(BankCard display:bankCard)
           {
               if(display instanceof DebitCard)
               { 
                   if(cId == display.getCardId())
                   {
                       System.out.println("your info");
                   }
                   else
                   {
                       System.out.println("incorect pin");
                   }
               }

           }
       }
       else if(click.getSource() == display2)
      {
          
          for(BankCard display:bankCard)
          {
              if(display instanceof CreditCard)
              {
                  CreditCard displayobj2 = (CreditCard)display;
                  displayobj2.display();
              }
          }
       }
      else if(click.getSource() == cancleCredit)
       {
           int cId = Integer.parseInt((tf21.getText()));
           for(BankCard CancleCreditCard:bankCard)
           {
               if( CancleCreditCard instanceof CreditCard)
               {
                   CreditCard cancle = (CreditCard)CancleCreditCard;
                    if(cId == CancleCreditCard.getCardId())
                   {
                       
                       cancle.CancleCreditCard();
                   }
                   else
                   {
                       System.out.println("That's incorrect pin");
                   }
               }
           }
      }
      else if(click.getSource() == creditLimit)
      {
           try{
            double creditLimit = Double.parseDouble(tf14.getText());
            int gracePeriod = Integer.parseInt(tf15.getText()); //arraylsi
            int cardId = Integer.parseInt(tf22.getText());

            for(BankCard bank: bankCard) {
                if(bank instanceof CreditCard) {
                    CreditCard credit = (CreditCard)bank;
                    if(cardId == credit.getCardId()) {
                        if(creditLimit <= 2.5*bank.getBalanceAmount()) {
                            credit.setCreditLimit(creditLimit, gracePeriod);
                            JOptionPane.showMessageDialog(f2,"Credit Limit has been set.","Message Alert",JOptionPane.INFORMATION_MESSAGE);
                        }
                        else {
                            JOptionPane.showMessageDialog(f2,"Credit Limit has been declined.","Message Alert",JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    else {
                        JOptionPane.showMessageDialog(f2,"Card ID doen't match our records. Please re-enter Card ID","Message Alert",JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
            }
            catch(NumberFormatException e2) {
                JOptionPane.showMessageDialog(f2,"ERROR!!! Incorret Format.","Message Alert",JOptionPane.INFORMATION_MESSAGE);
            }

      }
      else if(click.getSource() == get2)
      {
          int cId = Integer.parseInt((tf4.getText()));
          for(BankCard display:bankCard)
           {
               if(display instanceof CreditCard)
               { 
                   if(cId == display.getCardId())
                   {
                       System.out.println("your info");
                   }
                   else
                   {
                       System.out.println("incorect pin");
                   }
               }
          }
      } 
      else if (click.getSource() == clear)
      {
            tf1.setText("");
            tf3.setText("");
            tf5.setText("");
            tf7.setText("");
            tf8.setText("");
            tf10.setText("");
            tf12.setText("");
      }
      else if(click.getSource() == clear2)
      {
            tf4.setText("");
            tf13.setText("");
            tf17.setText("");
            tf6.setText("");
            tf2.setText("");
            tf9.setText("");
            tf11.setText("");
      }
    }
}

