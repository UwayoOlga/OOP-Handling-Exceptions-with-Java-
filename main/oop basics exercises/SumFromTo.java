/*Write a function named "sumFromTo" that takes two integer arguments, 
"first" and "last", and returns the sum of all integers between them inclusive. */

public class SumFromTo {
    public static int sumFromTo(int first, int last) {
        int sum = 0;
        for (int i = first; i <= last; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int first = 1;  
        int last = 10; 
        System.out.println("Sum from " + first + " to " + last + " is: " + sumFromTo(first, last));
    }
}

