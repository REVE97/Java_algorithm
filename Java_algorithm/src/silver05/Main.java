package silver05;

/*p.1316

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); //단어 갯수
        int count=0; //그룹 단어 갯수

        for(int i=0;i<N;i++){
            String word = br.readLine().toLowerCase(); // 소문자 단어 입력
            if(isGroupWord(word)){
                count++;
            }
        }
        //출력
        System.out.println(count);
    }
    
    //그룹 단어를 찾는 함수 작성
    public static boolean isGroupWord(String word) {
        boolean[] visited = new boolean[26]; // 알파벳 방문 여부를 저장
        char prev = '\0'; // 이전 문자를 초기화

        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i); // 현재 문자

            if (current != prev) { // 이전 문자와 다르다면
                if (visited[current - 'a']) { // 이미 방문한 문자라면 그룹 단어가 아님
                    return false;
                }
                visited[current - 'a'] = true; // 현재 문자를 방문 기록
            }
            prev = current; // 이전 문자를 현재 문자로 업데이트
        }

        return true; // 반복문이 끝날 때까지 문제가 없다면 그룹 단어
    }
}*/

//p.1676

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine()); //팩토리얼 숫자 입력

        int count = 0; // 0의 개수
        
        //5의 배수로 갯수 구하기
        while(num>=5){
           count+=(num/5); //5의 배수 갯수
           num/=5; //더 높은 5의 거듭제곱 확인하기
        }
        
        //출력
        System.out.println(count);
    }
}*/

// p.1427

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        // 내림차순
        for(int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}*/

// p.1193

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());

        int count = 0;
        int line = 0;

        // 몇 번째 대각선인지 찾기
        while (count < X) {
            line++;
            count += line; // 1 + 2 + 3 + ...
        }

        int diff = count - X; // 대각선에서 몇 번째인지 계산

        int numerator; //분자
        int denominator; //분모

        if (line % 2 == 0) {
            // 짝수번째 줄: 분자는 작아지고 분모는 커짐
            numerator = line - diff;
            denominator = 1 + diff;
        } else {
            // 홀수번째 줄: 분자는 커지고 분모는 작아짐
            numerator = 1 + diff;
            denominator = line - diff;
        }
        System.out.println(numerator + "/" + denominator);
    }
}*/

// p.4673

/*public class Main {
    static boolean[] arr = new boolean[10001];

    public static void main(String[] args) {
        for(int i=1; i<=10000; i++){
            int is = notSelfNum(i);
            if(is<=10000){
            arr[is] = true;
            }
        }
        for(int i=1; i<=10000; i++){
            if(!arr[i]){
                System.out.println(i);
            }
        }
    }

    // 생성자 유무 확인 함수
    public static int notSelfNum(int num) {
        int result = num;
        while(num > 0){
            result += num % 10;
            num /= 10;
        }
        return result;
    }
}*/

// p.2941
// String - > 문자 배열 ?

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String[] cro = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for(String s : cro) {
            if(str.contains(s)) {
                str = str.replace(s, " ");
            }
        }
        System.out.println(str.length());
    }
}*/

// p.10815
// 집합, 맵

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 첫번째 값들을 맵으로 생성하고 두번째 값들을 getOrDefault로 StringBuilder에 추가

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

        Map<Integer, Integer> map = new HashMap<>();

        int N = Integer.parseInt(br.readLine()); // 가지고 있는 카드

        int[] arr1 = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            map.put(arr1[i],1);
        }

        int M = Integer.parseInt(br.readLine()); // 존재하는 지 확인하는 카드

        int[] arr2 = new int[M];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            arr2[i] = Integer.parseInt(st2.nextToken());
        }

        for (int i = 0; i < M; i++) {
            output.append(map.getOrDefault(arr2[i],0)).append(" ");
        }

        System.out.println(output);
    }
}








