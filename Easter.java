// Yuna Kim Brooks
// This program will calculate the date easter falls on given a year after 1583.
import java.util.*;

public class Easter{
    public static void main(String[] args) {
        try (//code goes here
        Scanner scanner = new Scanner(System.in)) {
            int y = scanner.nextInt(); // reads the next number the user types. 
            int a = y % 19;
            System.out.println("a = "+a); 
            //3.	Divide y by 100 and get a quotient b and a remainder c.
            int b= y/100;
            System.out.println("b = "+b);
            int c= y%100; 
            System.out.println("c = "+c);
            //4.	Divide b by 4 and get a quotient d and a remainder e.
            int d= b/4;
            System.out.println("d = "+d);
            int e= b%4;
            System.out.println("e = "+e);
            //5.	Divide b + 8 by 25 and get a quotient f. Ignore the remainder.
            int f= (b + 8)/25;
            System.out.println("f = "+f);


        }
    }
}
