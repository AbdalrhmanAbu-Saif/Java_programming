package JavaProgramming2.Part11.ClassDiagrams.SaveablePerson;

public interface Saveable {
    public void  save();
    public void delete();
    public void  load(String address);
}
