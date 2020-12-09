public class Student {
    private String name;
    private int age;
    private double average;

    public Student() {

    }

    public Student(String name, int age, double average) {
        this.name = name;
        this.age = age;
        this.average = average;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getAverage() {
        return this.average;
    }

    // Specific Methods

    public String toString() {
        return "Student Name: " + getName() + "\nAge: " + getAge() + "\nAverage: " + getAverage();
    }
}