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

/* 1543번
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static String text;
    static String pattern;
    static int cnt = 0;
    static int i = 0;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        text = br.readLine();
        pattern = br.readLine();
        int t = text.length();
        int p = pattern.length();

        while (i < t-p+1) {
            int startIdx = i;
            boolean flag = true;
            for (int j = 0; j < p; j++) {
                if (pattern.charAt(j) != text.charAt(startIdx)) {
                    i += 1;
                    flag = false;
                    break;
                } else {
                    startIdx += 1;
                }
            }

            if (flag) {
                cnt += 1;
                i += p;
            }
        }
        System.out.println(cnt);
    }
}


 */

