package java_12_02_24;

public class Employee {
    private String firstName;
    private String lastName;
    
    public String getFullName() {
        return firstName + " " + lastName;
    }
    
    public String getInitials() {
        return firstName.charAt(0) + "." + lastName.charAt(0) + ".";
    }
    
    // Дублирование кода формирования email
    public String getEmail() {
        return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@company.com";
    }
}

class EmployeeData {
    private String firstName;
    private String lastName;

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getInitials() {
        return firstName.charAt(0) + "." + lastName.charAt(0) + ".";
    }

    // Дублирование кода формирования email
    public String generateEmail() {
        return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@company.com";
    }
}