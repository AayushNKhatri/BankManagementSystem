
public class BankCard {  
    //decraling atribute
    private int cardId;                                      
    private String clientName;                                 
    private String issuerBank;                                
    private String bankAccount;                                                                      
    private double balanceAmount;                              

    public BankCard(double balanceAmount, int cardId, String bankAccount, String issuerBank) //Bank Crad constructor with 4 parmeter
    { 
        this.balanceAmount = balanceAmount;   //this fuctiction calls all the atribute from above from the above
        this.cardId = cardId;                 
        this.bankAccount = bankAccount;
        this.issuerBank = issuerBank;
        this.clientName = "";
    }
    //this is getter method 
    public int getCardId() {                            
        return cardId;
    }

    public String getClientName() {                     
        return clientName;
    }       

    public String getIssuerBank() {
        return issuerBank;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public double getBalanceAmount() {
        return balanceAmount;
    }
    //this is setter method
    public void setClientName(String newclientName) {
        this.clientName = newclientName;
    }

    public void setBalanceAmount(double newbalanceAmount) {
        this.balanceAmount = newbalanceAmount;
    }
    //this is the method to print suitable message
    public void display() {
        if (clientName.equals("")) {
            System.out.println("Client name not assigned.");
        }                                                                           //using if else statement to match the condition and print suitable message
                                                                                     
        else{
            System.out.println("Client Name: " + clientName);
        }
        System.out.println("Card ID:" +cardId);
        System.out.println("Issuer Bank: " + issuerBank);
        System.out.println("Bank Account: " + bankAccount);
        System.out.println("Balance Amount: " + balanceAmount);

    }
}

