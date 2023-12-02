**Email Validator**

Welcome to the Email Validator - a Java package that helps you create and manage professional company email addresses with ease. This lightweight application allows you to generate secure strong passwords, set mailbox capacities, and organize email details based on different departments.

Getting Started
To use the Email Validator, follow these simple steps:

Create an Email Object:

Email email = new Email("John", "Doe");
Set the Department:

The system will prompt you to choose a department:
Enter 1 for Sales
Enter 2 for Development
Enter 3 for Accounting
Enter 0 for none
Accessing Information:

Retrieve display name, company email, and mailbox capacity using:
java
Copy code
String displayName = email.showInfo();
Customize Settings:

Adjust mailbox capacity:

java
Copy code
email.setMailboxCapacity(1000); // Set capacity to 1000mb
Set an alternate email:

java
Copy code
email.setAlternateEmail("john.doe@example.com");
Change the password:

java
Copy code
email.changePassword("newPassword123!");
Example Usage
java
Copy code
public static void main(String[] args) {
    Email email = new Email("John", "Doe");
    
    // Customize settings if needed
    email.setMailboxCapacity(1000);
    email.setAlternateEmail("john.doe@example.com");
    
    // Change the password
    email.changePassword("newPassword123!");
    
    // Display user information
    System.out.println(email.showInfo());
}
Features
Dynamic Email Generation: Emails are generated based on the user's first name, last name, department, and a company suffix.

Secure Random Passwords: Passwords are randomly generated for enhanced security.

Departmental Organization: Users can be associated with different departments, making it easy to manage and identify different teams.

Customizable Settings: Adjust mailbox capacity, set alternate emails, and change passwords according to your preferences.

Contribution
If you have ideas for improvements or want to report issues, feel free to contribute to the project. Fork the repository, make your changes, and submit a pull request.

Happy emailing! 📧✨
