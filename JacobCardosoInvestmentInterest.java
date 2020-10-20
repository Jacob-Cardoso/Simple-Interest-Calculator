import java.io.*;
import java.util.Scanner;

 class InterestTable {
    Scanner scan = new Scanner(System.in);
    String cont;
    double balance, interest, interestRate, principal, time;

    void invInterest() {
        while (true) {
            System.out.print("What is the principal you plan on investing?: ");     
            principal = scan.nextDouble();
    
            System.out.print("What is the interest rate of this investment?: ");       
            interestRate = scan.nextDouble();
            interestRate /= 100;
            
            System.out.print("How long, in years will this investment be active for? : ");
            time = scan.nextDouble();
            System.out.println();
            
            System.out.printf("%-16s%-16s%-16s%-16s%n", "Year", "Principal", "Interest", "Balance");

            for (int j=1; j <= time; j++) {
                interest = interestRate * principal;
                balance = principal + interest;
                System.out.printf("%-16d$%-15.2f$%-15.2f$%-15.2f%n", j, principal, interest, balance);

                principal = balance;
            }

            System.out.printf("Enter N To Quit Or Y To Continue: %n");
            cont = scan.next();
            
            if (cont.equals("N") | cont.equals("n")) {
                scan.close();
                break;
            }
            else {continue;}
        }
    }
}

public class JacobCardosoInvestmentInterest {
    public static void main(String[] args) throws IOException{
        InterestTable myInvestment = new InterestTable();
        myInvestment.invInterest();
    }
}