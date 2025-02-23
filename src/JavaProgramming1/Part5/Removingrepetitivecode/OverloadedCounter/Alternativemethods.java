package JavaProgramming1.Part5.Removingrepetitivecode.OverloadedCounter;

public class Alternativemethods {
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

        c1.increase(100);
        System.out.println(c1.value());

        c1.decrease(23);
        System.out.println(c1.value());

        //******************



        c2.increase();
        System.out.println(c2.value());

        c2.increase();
        System.out.println(c2.value());
        c2.increase(200);
        System.out.println(c2.value());
        c2.decrease();
        System.out.println(c2.value());
        c2.decrease();
        System.out.println(c2.value());
        c2.decrease(18);
        System.out.println(c2.value());
    }
}
