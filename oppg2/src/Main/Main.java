package Main;

import InputUtil.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean flag = true;
        while(flag)
        {
            while (true)
            {
                num = InputUtil.InputInt("Enter a whole number over 2(-1 to exit): ", "You must enter a whole number.", sc);
                if(num == -1)
                {
                    flag = false;
                    break;
                }
                else if (num <= 2)
                {
                    System.out.println("Number must be more than 2.");
                } else
                {
                    break;
                }
            }
            if(flag)
            {
                boolean prime = true;
                for (int i = 2; i < num; i++)
                {
                    if (num % i == 0)
                    {
                        prime = false;
                        break;
                    }
                }
                if (prime)
                {
                    System.out.println(Integer.toString(num) + " is a prime number.");
                } else
                {
                    System.out.println(Integer.toString(num) + " is not a prime number.");
                }
            }
        }
    }
}