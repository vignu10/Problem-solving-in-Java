// Two numbers A and B are passed as input. The program must print the odd numbers from A to B (inclusive of A and B) interlaced with the even numbers from B to A.

// Input Format:
// The first line denotes the value of A.
// The second line denotes the value of B.

// Output Format:
// The odd and even numbers interlaced, each separated by a space.

// Boundary Conditions:
// 1 <= A <= 9999999
// A <  B <= 9999999

// Example Input/Output 1:
// Input:
// 5
// 11

// Output:
// 5 10 7 8 9 6 11

// Explanation:
// The odd numbers from 5 to 11 are 5 7 9 11
// The even numbers from 11 to 5 (that is in reverse direction) are 10 8 6
// So these numbers are interlaced to produce 5 10 7 8 9 6 11

// Example Input/Output 2:
// Input:
// 4
// 14

// Output:
// 14 5 12 7 10 9 8 11 6 13 4

// Explanation:
// The odd numbers from 4 to 14 are 5 7 9 11 13
// The even numbers from 14 to 4 (that is in reverse direction) are 14 12 10 8 6 4
// So these numbers are interlaced to produce 14 5 12 7 10 9 8 11 6 13 4
// (Here as the even numbers count are more than the odd numbers count we start with the even number in the output)

// Example Input/Output 3:
// Input:
// 3
// 12

// Output:
// 3 12 5 10 7 8 9 6 11 4

// Explanation:
// The odd numbers from 3 to 12 are 3 5 7 9 11
// The even numbers from 12 to 3 (that is in reverse direction) are 12 10 8 6 4
// So these numbers are interlaced to produce 3 12 5 10 7 8 9 6 11 4























import java.util.Scanner;

public class number_interlace_oddoreven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int oddctr, evenctr;

        if (B % 2 == 0) {
            evenctr = B;
        } else {
            evenctr = B - 1;
        }

        if (A % 2 == 1) {
            oddctr = A;
        } else {
            oddctr = A + 1;
        }

        int printcount = 0;
        int totalprintcount = B - A + 1;
        while (printcount < totalprintcount) {
            if (A % 2 == 0 && B % 2 == 0) {
                if (evenctr >= A) {

                    System.out.print(evenctr + " ");
                    printcount++;
                    evenctr -= 2;
                }

                if (oddctr <= B) {
                    System.out.print(oddctr + " ");
                    printcount++;
                    oddctr += 2;
                }
            } else {
                if (oddctr <= B) {
                    System.out.print(oddctr + " ");
                    printcount++;
                    oddctr += 2;
                }

                if (evenctr >= A) {
                    System.out.print(evenctr + " ");
                    printcount++;
                    evenctr -= 2;
                }

            }
        }//end of while

    }
}
 



















