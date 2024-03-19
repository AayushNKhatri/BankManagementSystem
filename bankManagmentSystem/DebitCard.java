public class DebitCard extends BankCard {
    //declaring suitable attribute
    private int pinNumber;
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;
    //contsructor which call atribute from class bank card and from above
    public DebitCard(double balanceAmount, int cardId, String bankAccount, String issuerBank, String clientName, int pinNumber) {
        super(balanceAmount, cardId, bankAccount, issuerBank);
        super.setClientName(clientName);
        this.pinNumber = pinNumber;
        this.withdrawalAmount = 0;
        this.dateOfWithdrawal = "";
        this.hasWithdrawn = false;
    }
    //getter method
    public int getPinNumber() {
        return pinNumber;
    }

    public int getWithdrawalAmount() {
        return withdrawalAmount;
    }

    public String getDateOfWithdrawal() {
        return dateOfWithdrawal;
    }

    public boolean getHasWithdrawn() {
        return hasWithdrawn;
    }
    //setter method
    public void setWithdrawalAmount(int newWithdrawalAmount) {
        this.withdrawalAmount = newWithdrawalAmount;
    }
    //this is withdraw method   
    public void withdraw(int withdrawalAmount, String dateOfWithdrawal, int pinNumber) {
        if (pinNumber == this.pinNumber) 
        {
            if (withdrawalAmount <= super.getBalanceAmount())
            {
                setBalanceAmount(super.getBalanceAmount() - withdrawalAmount);
                this.withdrawalAmount = withdrawalAmount;                                           //using if else to implement the logic of withdrawing funds from debit card
                this.dateOfWithdrawal = dateOfWithdrawal;
                this.hasWithdrawn = true;
                System.out.println("Withdrawal successful. New balance: " + getBalanceAmount());
            } 
            else {
                System.out.println("Insufficient funds.");
            }
        } 
        else {
            System.out.println("Invalid PIN.");
        }
    }
    //disply method for printing suitable message after withdrawing the fund
    
    public void display() {
        super.display();
        System.out.println("PIN Number: " + pinNumber);
        if (hasWithdrawn) 
        {
            System.out.println("Withdrawal Amount: " + withdrawalAmount);
            System.out.println("Date of Withdrawal: " + dateOfWithdrawal);
        } 
        else 
        {
            System.out.println("No withdrawal has been made yet.");
        }
    }
}
