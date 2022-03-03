package inheritance;

public class UniversityStudent extends Student{
    private String major;

    public UniversityStudent(int id, String name, String lastname, String major) {
        super(id, name, lastname);//super is reference of this.
        //super means call the constructor(method..etc) of the parent.
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    //this is from the parent class. exiting method from parent class and redefining it.
    public String printStudent() {
        return super.printStudent()+" "+ major;
    }
}
