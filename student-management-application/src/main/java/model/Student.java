package model;

public class Student {
    private int studentId;
    private String name;
    private Address address;
    private float percentage;
    private String grade;

    public Student(int studentId, String name, Address address, float percentage, String grade) {
    }

    //declare setter method for each field
    public void setStudentId(int studentId)
    {
        this.studentId=studentId;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setPercentage(float percentage)
    {
        this.percentage=percentage;
    }
    public void setGrade(String grade)
    {
        this.grade=grade;
    }
    public void setAddress(Address address)
    {
        this.address=address;
    }

    //declare getter method
    public int getStudentId()
    {
        return studentId;
    }
    public String getName()
    {
        return name;
    }
    public String getGrade()
    {
        return grade;
    }
    public Address getAddress()
    {
        return address;
    }

    public float getPercentage() {return percentage;}

    //declare default constructor
    public Student()
    {

    }

    //declare parameterized constructor
    public Student(int studentId,String name,String grade,Address address,float percentage)
    {
        this.studentId=studentId;
        this.name=name;
        this.grade=grade;
        this.percentage=percentage;
        this.address=address;
    }

    //override toString method
    public String toString()
    {
        return "Student{" +
                "studentId="+ studentId +
                ",name='"+name + '\''+
                ",address="+address +
                ",percentage=" +percentage +
                ",grade="+ grade +'\''+
                '}';
    }
}
