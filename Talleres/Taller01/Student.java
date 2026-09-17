public class Student {
    
    private String studentID = "";
    private String name = "";
    private double grade1 = 0.0;
    private double grade2 = 0.0;
    private double grade3 = 0.0;

    public void Id(String studentID){   //como hacer para que no se pueda alterar o acceder luego
        this.studentID = studentID;
    }

    public boolean setName(String name) {
        if (name == null || name.isEmpty()) {
            return false;
        }
        this.name = name;
        return true;
    }

    public void setGrade1(double newgrade1){
        if(grade1 >= 0.0 || grade1 <= 5.0){
            this.grade1 = newgrade1;
        }
        else{
            System.out.println("Grade is not valid");
            
        }
    }

    public void setGrade2(double newgrade2){
        if(grade2 >= 0.0 || grade2 <= 5.0){
            this.grade2 = newgrade2;
        }
        else{
            System.out.println("Grade is not valid");
            
        }
    }

    public void setGrade3(double newgrade3){
        if(grade3 >= 0.0 || grade3 <= 5.0){
            this.grade3 = newgrade3;
        }
        else{
            System.out.println("Grade is not valid");
        }
    }

    public double getAverage( ){
        return (grade1 + grade2 + grade3)/ 3;
    }

    public String getStudentId() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public double getGrade1() {
        return grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public double getGrade3() {
        return grade3;
    }
}
