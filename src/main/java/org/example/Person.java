package org.example;

public class Person {
    String name;
    int age;
    String profession;

    public Person(String name, int age, String profession) {
        this.name = (name != null && !name.isBlank()) ? name : "Unknown";
        this.age = (age > 0) ? age : 0;
        this.profession = (profession != null && !profession.isBlank()) ? profession : "Unemployed";
    }

    public Person() {
        this("Unknown", 18, "Unemployed");
    }

    public String getInfo() {
        return "Ім'я: " + name + ", Вік: " + age +", Професія: " + profession;
    }

    public void setInfo(String name, int age, String profession) {
        if (name != null && !name.isBlank()) this.name = name;
        if (age > 0) this.age = age;
        if (profession != null && !profession.isBlank()) this.profession = profession;
    }

    public void setProfession(String profession) {
        if (profession != null && !profession.isBlank()) {
            this.profession = profession;
        }
    }

}
