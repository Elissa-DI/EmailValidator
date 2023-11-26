package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created: " + this.firstName + " " + this.lastName);

        this.department = setDepartment();
        System.out.println("Department: " + this.department);
        //Call a method that returns a random password
    }
    //Department
    private String setDepartment() {
        System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter the department: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice ==1){ return "Sales"; }
        else if (depChoice == 2) { return "Dev"; }
        else if (depChoice == 3) { return "Acct"; }
        else{return "";}
    }

    //Generate a random password
    private String randomPassword(int length){

    }
}
