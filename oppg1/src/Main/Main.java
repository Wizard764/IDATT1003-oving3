package Main;

import InputUtil.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int min = InputUtil.InputInt("Input the lowest number in the range that will be calculated: ", "You must enter a whole number.", sc);
        int max = -2147483648;
        while(max < min)
        {
            max = InputUtil.InputInt("Input the highest number in the range that will be calculated: ", "You must enter a whole number.", sc);
            if(max < min)
            {
                System.out.println("The highest number has to be higher og equal to the lower number");
            }
        }
        for(int i = min; i <= max; i++)
        {
            System.out.println(Integer.toString(i) + "-gangen:");
            for(int j = 1; j <= 10; j++)
            {
                System.out.println(Integer.toString(i) + " x " + Integer.toString(j) + " = " + Integer.toString(i  * j));
            }
        }
    }
}