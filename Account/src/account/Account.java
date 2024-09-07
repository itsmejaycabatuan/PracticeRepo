package account;

import java.util.Scanner;

public class Account {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Accounts[] acc = new Accounts[100];
        
        int no, i;

        System.out.print("Enter number of Accounts: ");
        no = sc.nextInt();

        for (i = 0; i < no; i++) {
            acc[i] = new Accounts();
          
            boolean identi;
            boolean email1;
            boolean username;
            
            System.out.println("Enter account Details " + (i + 1) + ": ");
            while (true) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                identi = false;

                
                for (int x = 0; x < i; x++) {
                    if (acc[x] != null && acc[x].id == id) {
                        identi = true;
                        break;
                    }
                }

                if (identi) {
                    System.out.println(" - ID already exists. Try again -");
                } else {
                   
                    acc[i].id = id;
                    break;
                }
            }
            
            System.out.print("First Name: ");
            String fname = sc.next();
            System.out.print("Last Name: ");
            String lname = sc.next();
            
             while (true) {
                System.out.print("Email: ");
                String email = sc.next();
                email1 = false;

                
                for (int x = 0; x < i; x++) {
                    if (acc[x] != null && acc[x].email.equals(email)) {
                        email1 = true;
                        break;
                    }
                }

                if (email1) {
                    System.out.println(" - Email already exists. Try again -");
                } else {
                   
                    acc[i].email = email;
                    break;
                }
            }
            
             while (true) {
                System.out.print("Username: ");
                String user = sc.next();
                username = false;

                
                for (int x = 0; x < i; x++) {
                    if (acc[x] != null && acc[x].username.equals(user)) {
                        username = true;
                        break;
                    }
                }

                if (username) {
                    System.out.println(" - Username already exists. Try again -");
                } else {
                   
                    acc[i].username = user;
                    break;
                }
            }
            
            boolean passValid = false;
            
            while (!passValid) {
                System.out.print("Password: ");
                String password = sc.next();

                if (acc[i].passwordVerify(password)) {
                    acc[i].addAccount(acc[i].id, fname, lname, acc[i].email, acc[i].username, password);
                    passValid = true;  
                } else {
                    System.out.println(" - Invalid password - , Try Again ");
                }
            }
            System.out.println(""); 
        

        }
        System.out.println("Account Details: ");
         System.out.printf("%-10s %-10s %-10s %-20s %-13s %-10s\n","ID", "FirstName", "LastName", "Email", "Username", "Password");
         System.out.println("---------------------------------------------------------------------------------");
        for (i = 0; i < no; i++) {
            if(acc[i] != null){
            acc[i].viewAccount();
            System.out.println(""); 
        }
        }
    }
}
