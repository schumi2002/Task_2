package shop;

import java.time.LocalDate;

public class Person {
    private String Name;
    private LocalDate DOB;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    @Override
    public String toString() {
        return "Name: " + Name + ", DOB: " + DOB;
    }
}
