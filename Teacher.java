public class Teacher {
    private String fName;
    private String lName;
    private String title;
    private String field;
    private int age;

    public Teacher() {

    }

    public Teacher(String fName, String lName, String title, String field, int age) {
        this.fName = fName;
        this.lName = lName;
        this.title = title;
        this.field = field;
        this.age = age;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setField(String field) {
        this.field = field;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFName() {
        return this.fName;
    }

    public String getLName() {
        return this.lName;
    }

    public String getTitle() {
        return this.title;
    }

    public String getField() {
        return this.field;
    }

    public int getAge() {
        return this.age;
    }

    // Specific Methods

    public String getName() {
        return getFName() + " " + getLName();
    }

    public String getProfessionalTitle() {
        return title + ". " + getLName();
    }

    public String toString() {
        return "Teacher Name: " + getName() + "\nField: " + getField() + "\nAge: " + getAge();
    }
}