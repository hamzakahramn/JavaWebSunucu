public class Student {
    private final String fullName;
    private final String studentNo;

    public Student(String fullName, String studentNo) {
        this.fullName = fullName;
        this.studentNo = studentNo;
    }

    public String getFullName() { return fullName; }
    public String getStudentNo() { return studentNo; }
}