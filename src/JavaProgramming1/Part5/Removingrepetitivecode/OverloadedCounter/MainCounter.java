package JavaProgramming1.Part5.Removingrepetitivecode.OverloadedCounter;

public class MainCounter {
    public static void main(String[] args){

        Counter c1 =new Counter();
        Counter c2 =new Counter(5);


        c1.increase();
        System.out.println(c1.value());

        c1.increase();
        System.out.println(c1.value());

        c1.decrease();
        System.out.println(c1.value());
        c1.decrease();
        System.out.println(c1.value());

        //******************



        c2.increase();
        System.out.println(c2.value());

        c2.increase();
        System.out.println(c2.value());

        c2.decrease();
        System.out.println(c2.value());
        c2.decrease();
        System.out.println(c2.value());


    }
}
