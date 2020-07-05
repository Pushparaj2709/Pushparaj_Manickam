import java.io.*;
import java.util.*;
import java.util.HashSet;
public class SockMerchant {
    static int sockMerchant(int n, int[] ar) {
        int i,value,pair=0;
        HashSet<Integer> Hash = new HashSet<Integer>();
        for(i=0;i<n;i++)
        {
            value = ar[i];
            if(Hash.contains(value))
            {
                pair++;
                Hash.remove(value);
            }
            else
            {
                Hash.add(value);
            }
        }
        return pair;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
