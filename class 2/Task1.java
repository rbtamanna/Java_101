import java.util.Scanner;

public class Task1 
{
    public static void main(String[] args) 
    {
        Scanner rbt = new Scanner(System.in);
        int n = rbt.nextInt();
        int n1 = rbt.nextInt();
        if (n > n1) 
        {
            System.out.println("First is greater");
        } else if (n < n1) 
        {
            System.out.println("Second is greater");
        } else 
        {
            System.out.println("The numbers are equal");
        }
    }
}
