import java.util.Scanner;
import Services.BankServices;

public class BankMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankServices bankServicesobj = new BankServices();
        String str = null;
        
        do {
            System.out.println("---------------------Main Menu--------------------");
            System.out.println("1:Add Account\n2:Display All\n3:Search Account\n" +
                              "4:Transaction\n5:Update\n6:Delete\n7:Interest\n8:Statement");
            System.out.print("Choose (1-8): ");
            
            int ch = sc.nextInt();
            switch(ch) {
                case 1: bankServicesobj.addAccount(); break;
                case 2: bankServicesobj.displayAllAccounts(); break;
                case 3: bankServicesobj.searchAccount(); break;
                case 4: bankServicesobj.transaction(); break;
                case 5: bankServicesobj.updateAccount(); break;
                case 6: bankServicesobj.deleteAccount(); break;
                case 7: bankServicesobj.addInterestToAllAccounts(); break;
                case 8: bankServicesobj.viewStatement(); break;  // ✅ NEW
                default: System.out.println("Invalid! Choose 1-8"); break;
            }
            
            System.out.print("Continue? (yes/no): ");
            str = sc.next();
        } while(str.equalsIgnoreCase("yes"));
        
        sc.close();
        System.out.println("--------------------Thank You--------------------");
    }
}
