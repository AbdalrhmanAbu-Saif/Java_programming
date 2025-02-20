package JavaProgramming1.Part2.MethodsandDividing;

public class Greatest {

    public static int Greatest(int number1, int number2,int number3) {

        if(number1>number2 &&number1>number3)
            return number1;

        else if(number3>number1 && number3>number2)
            return number3;

        return number2;
    }

    public static void main(String[] args) {
        int answer =  Greatest(2, 7,3);
        System.out.println("Greatest: " + answer);
    }

}
