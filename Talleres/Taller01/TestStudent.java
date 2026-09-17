public class TestStudent {
    
    public static void main(String [] args){
        
        Student student1 = new Student();
        //falta ID
        student1.setName("Laura");
        student1.setGrade1(3.5);
        student1.setGrade2(2.9);
        student1.setGrade3(5.0);

        System.out.println(student1.getName());
        System.out.println(student1.getGrade1());
        System.out.println(student1.getGrade2());
        System.out.println(student1.getGrade3());

        System.out.println(student1.getAverage());

    }
}
