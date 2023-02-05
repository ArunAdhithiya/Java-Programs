package com.adhithiya.lab7;
public class e1 {

    public static void main(String[] args) {

        try
        {
            int ar[] = {1, 2, 3, 4, 5};
            for (int i=0; i<=5; i++)
                System.out.println(ar[i]);

            int e=0;
            int f=20/e;
        }

        catch(ArithmeticException ae)
        { System.out.println("Divided by zero"+ae);
        }

        catch(Exception oe)
        { System.out.println("Array index out of bound"+oe);
        }
        System.out.println("After Try and Catch blocks");

        }
}