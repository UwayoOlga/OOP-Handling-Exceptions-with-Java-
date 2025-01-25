/*Write a function named "sumFromTo" that takes two integer arguments, 
"first" and "last", and returns the sum of all integers between them inclusive. */
public int sumFromTo(int first, int last) {
    int sum = 0;
    for (int i = first; i <= last; i++) {
        sum += i;
    }
    return sum;
}
