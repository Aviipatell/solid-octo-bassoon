import java.util.ArrayList;

public class Classroom {

    private Teacher teacher;
    private ArrayList<Student> students;
    private String course;
    private int roomNum;

    public Classroom() {
    };

    public Classroom(Teacher teacher) {
        this.teacher = teacher;
    }

    public Classroom(Teacher teacher, String course, int roomNum) {
        this.teacher = teacher;
        this.course = course;
        this.roomNum = roomNum;
    }

    public Classroom(Teacher teacher, ArrayList<Student> students, String course, int roomNum) {
        this.teacher = teacher;
        this.students = students;
        this.course = course;
        this.roomNum = roomNum;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setStudents() {
        this.students = students;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public Teacher getTeacher() {
        return this.teacher;
    }

    public ArrayList<Students> getStudents() {
        return this.students;
    }

    public String getCourse() {
        return this.course;
    }

    public int getRoomNum() {
        return this.roomNum;
    }

    // Specific Methods
    public String displayStudents() {
        if (students.size() < 1) {
            return "No students to display.";
        }

        for (int i = 0; i < students.size(); i++) {
            System.out.println(Students.get(i));
        }
    }

    public String toString() {
        System.out.println(teacher.getName() + " (" + teacher.getProfessionalTitle() + ")");
        displayStudents();
    }

    public int getClassAverage() {
        if (students.size() < 1) {
            return 0;
        }

        double total = 0;

        for (Student student : students) {
            total += student.getAverage();
        }

        double average = total / students.size();

        return average;
    }

}