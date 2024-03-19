public class CreditCard extends BankCard
{
    //decraing the suitable atribute
    private int cvcNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;  
    private int gracePeriod;
    private boolean isGranted;
    
    //construtor which call atribute from bank card and from above
    public CreditCard(double balanceAmount,String clientName ,int cardId,String bankAccount,String issuerBank,int cvcNumber,double interestRate,String expirationDate)
    {
        super(balanceAmount,cardId,bankAccount,issuerBank);
        super.setClientName(clientName);
        this.cvcNumber=cvcNumber;
        this.interestRate=interestRate;
        this.expirationDate=expirationDate;
        this.isGranted=false;
        
    }
    //getter method 
    public int getCvcNumber()
    {
        return this.cvcNumber;
    }
    public double getCreditLimit()
    {
        return this.creditLimit;
    }
    public double getInterestRate()
    {
        return this.interestRate;
    }
    public String getExpirationDate()
    {
        return this.expirationDate;
    }
    public int getGracePeriod()
    {
        return this.gracePeriod;
    }
    public boolean getIsGranted()
    {
        return this.isGranted;
    }
    //method to set the credit limit
    public void setCreditLimit(double newcreditLimit,int newgracePeriod)
    {
        if(newcreditLimit <= 2.5*super.getBalanceAmount())
        {
            this.creditLimit = newcreditLimit;
            this.gracePeriod = newgracePeriod;                                                                                          
            this.isGranted = true;                                                                            //using if else to set credit limit and print suitable message
            System.out.println("Credit granted.Credit limit is: "+creditLimit+" Grace period "+gracePeriod);
        }
        else
        {   
           System.out.println("Credit cannot be issued.");
        }

    }
    //this is  cancle credit card method
    public void CancleCreditCard()
    {
        this.cvcNumber = 0;
        this.creditLimit = 0;
        this.gracePeriod = 0;
        this.isGranted = false;
    }
    //display method to print suitable message if credit is cancel and vice versa
    public void display()
    {
        super.display();
       if(isGranted)
       {
           
           System.out.println("CVC Number:" +cvcNumber);
           System.out.println("Credit Limit: "+creditLimit);
           System.out.println("Intrest Rate: "+interestRate);
           System.out.println("Exppration Date: "+expirationDate);
           System.out.println("Grace Period: "+gracePeriod);
       }
       else
       {
           System.out.println("Credit has not been granted.Sorry");
           System.out.println("Intrest Rate: "+interestRate);
           System.out.println("CVC Number:" +cvcNumber);
           System.out.println("Exppration Date: "+expirationDate);
       }
    }

}
