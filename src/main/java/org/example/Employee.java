package org.example;

public class Employee {
    private String fullName;
    private String jobTitle;
    private String email;
    private String phone;
    private int age;

    public Employee(String fullName,
                    String jobTitle,
                    String email,
                    String phone,
                    int age) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public Employee() {
        this("John Doe", "Unemployed", "j.doe@example.com", "0 (000) 000-00-00",18);
    }

    public String toString() {
        return "ПІБ: " + this.fullName + "\n" +
                "посада: " + this.jobTitle + "\n" +
                "email: " + this.email + "\n" +
                "телефон: " + this.phone + "\n" +
                "вік: " + this.age + "\n";
    }
}
