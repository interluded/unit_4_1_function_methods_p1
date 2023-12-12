import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scan.nextInt();

        System.out.print("Enter the second number: ");
        int b = scan.nextInt();

        System.out.print("Enter the third number: ");
        int c = scan.nextInt();

        System.out.println("The middle number is " + middle(a, b, c));
    }

    // Write a function method called middle that accepts 3 int parameters and
    // returns the middle value. For example, middle(5, 8, 6) will return 6.

    public static int middle (int x, int y, int z){
        if ((x > y && x < z) || (x < y && x > z)) {
            return x;
        }
        else if ((y > x && y < z) || (y < x && y > z)) {
            return y;
        }
        else {
            return z;
           }
        }
    }

    
