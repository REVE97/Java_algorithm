/* 10998번 팰린드롬인지 확인
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static String word;
    static String reversedWord;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        word = br.readLine();

        StringBuilder sb = new StringBuilder();
        for (int i = word.length()-1; i >= 0; i--) {
            sb.append(word.charAt(i));
        }
        reversedWord = sb.toString();

        if (!word.equals(reversedWord)) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}

 */

