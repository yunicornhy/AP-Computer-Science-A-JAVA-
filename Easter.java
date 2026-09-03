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
            //6.	Divide b – f + 1 by 3 and get a quotient g. Ignore the remainder.
            int g= (b - f + 1)/3;
            System.out.println("g = "+g);
            //7.	Divide 19 * a + b – d – g + 15 by 30 and get a remainder h. Ignore the quotient.
            int h= (19 * a + b - d - g + 15)%30;
            System.out.println("h = "+h);
            //8.	Divide c by 4 and get a quotient i and a remainder k.
            int i = (c/4);
            System.out.println("i = "+i);
            int k = (c%4);
            System.out.println("k = "+k);
            //9.	Divide 32 + 2 * e + 2 * i - h - k by 7 and get a remainder r. Ignore the quotient.
            int r = (32 + 2 * e + 2 * i - h - k)%7;
            System.out.println("r = "+r);
            //10.	Divide a + 11 * h + 22 * r by 451 and get a quotient m. Ignore the remainder.
            int m = (a + 11 * h + 22 * r)/451;
            System.out.println("m = "+m);
            //11.	Divide h + r - 7 * m + 114 by 31 and get a quotient n and a remainder p.
            int n = (h + r - 7 * m + 114)/31;
            System.out.println("n = "+n);
            int p = (h + r - 7 * m + 114)%31;
            System.out.println("p = "+p);
            System.out.println("Easter in " +y);
            System.out.println ("falls on 4/"+ (p+1));
        }
    }
}
