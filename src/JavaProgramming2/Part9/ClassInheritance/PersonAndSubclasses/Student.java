package JavaProgramming2.Part9.ClassInheritance.PersonAndSubclasses;

public class Student extends Person {
    private int studyCredits;

    public Student(String name , String location ){
        super(name,location);
        this.studyCredits=0;
    }

    public void study(){
        this.studyCredits++;
    }

    public int credits(){
        return this.studyCredits;
    }

    @Override
    public String toString() {
        return  super.toString() +"\n   Study credits "+this.studyCredits;
    }
}
