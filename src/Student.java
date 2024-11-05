import java.sql.SQLOutput;

//Create Class named 'Student'
public class Student {
    //Declare Private Variables
    private String name;
    private int age;
    private double gpa;

    //Create a Constructor
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    //Implement Public Getter and Setter for GPA
    public String getGpaStatus() {
        if (gpa >3 && gpa<=4){
            return "Excellent!";
        }else if (gpa>=2 && gpa <=3){
            return "Good.";
        }else if(gpa<2)  {
            return "Needs Improvement.";
        }
        else{
            return "Out of Range";
        }
    }

    public void setGpa(double gpa) {
        if (gpa>=0.0 &&gpa<=4.0){
            this.gpa = gpa;
        }else{
            System.out.println("Invalid GPA.");
        }
    }

    //Implement Other Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Farah", 20, 5.0);
        System.out.println(student1.getGpaStatus());


    }

}
