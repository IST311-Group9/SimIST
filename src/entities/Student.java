
package entities;


public class Student extends Person {
    private int studentID;
    private double GPA;
    private String classStanding;

    public Student(String fName, String lName, int age, int studentID, double GPA, String classStanding)
    {
     super(fName, lName, age);
     this.studentID = studentID;
     this.GPA = GPA;
     this.classStanding = classStanding;
    }

  public String getInfo()
  {
     super.getInfo();
     return(", Student ID: " + this.getStudentID() + " GPA: " + this.getGPA()+", Class Standing: "+this.getClassStanding());
     }

    /**
     * @return the studentID
     */
    public int getStudentID() {
        return studentID;
    }

    /**
     * @param studentID the studentID to set
     */
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    /**
     * @return the GPA
     */
    public double getGPA() {
        return GPA;
    }

    /**
     * @param GPA the GPA to set
     */
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    /**
     * @return the classStanding
     */
    public String getClassStanding() {
        return classStanding;
    }

    /**
     * @param classStanding the classStanding to set
     */
    public void setClassStanding(String classStanding) {
        this.classStanding = classStanding;
    }
}
