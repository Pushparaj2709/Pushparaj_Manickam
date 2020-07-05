import java.io.*;
import java.util.*;
public class AlterCharacter {

    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
        int size,delete=0;
        size = s.length();
        char[] a = s.toCharArray();
        for(int i=0;i<size-1;i++)
        {
            if(a[i] == a[i+1])
            {
                delete++;
            }
        }
        return delete;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = alternatingCharacters(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
