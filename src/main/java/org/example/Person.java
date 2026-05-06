package org.example;

public class Person {
    String name;
    int age;
    String profession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
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
