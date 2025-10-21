public  class Student {

    // STUDENT BASIC INFORMATION FIELDS
    private int studentId;
    private String stuName;
    private float stuMarks;

    // STUDENT CONSTRUCTOR
    public Student(int studentId, String stuName, float stuMarks) {
        this.studentId = studentId;
        this.stuName = stuName;
        this.stuMarks = stuMarks;
    }
    // STUDENT GETTERS AND SETTERS

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public float getStuMarks() {
        return stuMarks;
    }

    public void setStuMarks(float stuMarks) {
        this.stuMarks = stuMarks;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", stuName=" + stuName + ", stuMarks=" + stuMarks + "]";
    }

}