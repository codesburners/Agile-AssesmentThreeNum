import java.util.Scanner;

public class GreatestOfThreeNumbers {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number");
        int n1=s.nextInt();
        System.out.println("Enter Second number");
        int n2=s.nextInt();
        System.out.println("Enter Third number");
        int n3=s.nextInt();

        if(n1>n2 && n1>n3)
        {
            System.out.println(n1+"-->N1 is greater");
        }
        if(n2>n1 && n2>n3)
        {
            System.out.println(n2+"-->N2 is greater");
        }
        else{
            System.out.println(n3+"-->N3 is greater ");
        }

    }
}
