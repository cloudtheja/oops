package sum;
import java.util.*;


public class Sum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, addtwo;
        System.out.println("Enter 1st number");
        a = in.nextInt();
        System.out.println("Enter 2nd number");
        b= in.nextInt();
        addtwo=addtwo(a,b);
        System.out.println("Addition of two numbers is:" +addtwo);


    }

    public static int addtwo(int a, int b){
        int addtwo = a+b;

        return addtwo;

    }


}
