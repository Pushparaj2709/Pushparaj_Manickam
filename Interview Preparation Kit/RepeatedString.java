import java.io.*;
import java.util.*;
public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long div,rem;
        long count=0;
        char[] ch= s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(ch[i]=='a')
            {
                count++;
            }
        }
        div = n / s.length();
        rem = n % s.length();
        count = count*div;
        for(int i=0;i<rem;i++)
        {
            if(ch[i]=='a')
            {
                count++;
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
