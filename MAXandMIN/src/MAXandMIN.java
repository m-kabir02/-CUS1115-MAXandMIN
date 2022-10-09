

import java.util.Scanner;
public class MAXandMIN
{
    public static void main(String[] args)
    {




        Scanner kb=new Scanner(System.in);
        int x,y,z;

        System.out.println("Enter an integer value for x: ");
        x=kb.nextInt();

        System.out.println("Enter an integer value for y: ");
        y=kb.nextInt();

        System.out.println("Enter an integer value for z: ");
        z=kb.nextInt();

        int max;
        if(x>y)
        {
            if(x>z)max=x;
            else
                max=z;
        }
        else
        {
            if(y>z)max=y;
            else
                max=z;
        }
        System.out.println("The maximum value of all 3 integers entered: " +x+" "+y+" "+z+" is "+max);
        //create the nested if that will find the minimum of the 3 integers
        //output the minimum value of the 3 integers entered

        int min;

        if(x<y)
        {
            if(x<z)min=x;
            else
                min=z;
        }
        else
        {
            if(y<z)min=y;
            else
                min=z;
        }

        System.out.println("The minimum value of all 3 integers entered: " +x+" "+y+" "+z+" is "+min);

	/*
Enter an integer value for x:
7
Enter an integer value for y:
3
Enter an integer value for z:
4
The maximum value of all 3 integers entered: 7 3 4 is 7
The minimum value of all 3 integers entered: 7 3 4 is 3
	 */

    }
}
