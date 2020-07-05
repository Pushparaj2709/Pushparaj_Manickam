import java.io.*;
import java.util.*;
public class MinimumDiff {

    // Complete the minimumAbsoluteDifference function below.
static int minimumAbsoluteDifference(int[] arr) {;int size = arr.length;
int mini=Integer.MAX_VALUE;
Arrays.sort(arr);
for(int i=0;i<size-1;i++)
{
 int temp = Math.abs(arr[i]-arr[i+1])   ;
 mini = Math.min(temp,mini);
}
return mini;
}
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = minimumAbsoluteDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
