public class JosephusProblem {
    public static void main(String[] args) {
        int n = 100; 
        int k = 2;  

        int survivor = findSurvivor(n, k);
        System.out.println("The person left with the gun is: " + survivor);
    }

    public static int findSurvivor(int n, int k) {
        if (n == 1) {
            return 1; 
        } else {
            // Recursively find the position of the survivor in a smaller circle
            return (findSurvivor(n - 1, k) + k - 1) % n + 1;
        }
    }
}
