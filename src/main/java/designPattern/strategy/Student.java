package main.java.designPattern.strategy;

public class Student {

    public Student() {
    }
    /*접근점*/
    private Study study;
    /*교환가능*/
    public void setStudy(Study study){
         this.study=study;
    }
    public Study getStudy(){
        return this.study;
    }
    public void study(){
        
        if(this.study==null){
            System.out.println("공부안하고 논다");
        }else{
            /*delegate 처리를 위임함*/
            study.study();
        }
        
    }
    public static void main(String[] args){
        Student student = new Student();
        Study study = new CodingStudy();
        student.setStudy(study);

        Student student1 = new Student();
        Study study1 = new EnglishStudy();
        student1.setStudy(study1);
        Student student2 = new Student();


        student.study();
        student1.study();
        student2.study();

    }

}
