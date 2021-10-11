package q8;

public class SavingAccountTest {
    public static void main(String[] args) {
        SavingAccount sa1 = new SavingAccount();
        SavingAccount sa2 = new SavingAccount();

        sa1.setSavingsBalance(2000.00);
        sa2.setSavingsBalance(3000.00);

        SavingAccount.modifyInterestRate(0.04);
        sa1.calculateMonthlyInterest();
        sa2.calculateMonthlyInterest();

        System.out.printf("New Balance for Server 1 = %f\n",sa1.getSavingsBalance());
        System.out.printf("New Balance for Server 2 = %f\n",sa2.getSavingsBalance());

        SavingAccount.modifyInterestRate(0.05);
        sa1.calculateMonthlyInterest();
        sa2.calculateMonthlyInterest();

        System.out.printf("New Balance for Server 1 = %f\n", sa1.getSavingsBalance());
        System.out.printf("New Balance for Server 2 = %f\n", sa2.getSavingsBalance());
    }
}
