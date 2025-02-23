package JavaProgramming1.Part6.Objectsonaistandalistaspartofanobject.Stack;

public class Part2 {
    public static void main(String[] args){
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        s.add("Value");
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        String taken = s.take();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        System.out.println(taken);

    }
}
