package basics.hashing;
public class higestelement {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1, 2, 4, 1};

        int max = 0;

        // Find maximum element
        for (int x : arr) {
            max = Math.max(max, x);
        }

        // Hash / frequency array
        int[] hash = new int[max + 1];

        // Pre-storing
        for (int x : arr) {
            hash[x]++;
        }

        // Fetching
        int highest = arr[0];
        int maxFreq = hash[arr[0]];

        for (int x : arr) {
            if (hash[x] > maxFreq) {
                maxFreq = hash[x];
                highest = x;
            }
        }

        System.out.println("Highest occurring element: " + highest);
        System.out.println("Frequency: " + maxFreq);
    }
}