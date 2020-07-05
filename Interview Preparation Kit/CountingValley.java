import java.io.*;
import java.util.*;
public class CountingValley {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int i,level=0,valley=0;
        char ar;
        for(i=0;i<n;i++)
        {
        ar = s.charAt(i);
        if(ar=='U')
        {
            if(level==-1)
            {
                valley++;
            }
            level++;
        }
        else
        {
            level--;
        }
        }
    return valley;
}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
