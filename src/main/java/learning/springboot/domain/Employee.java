package learning.springboot.domain;

public class Employee {
    public String name;

    public Employee(String name) {
        this.name = name;
    }

    public Employee() {

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
