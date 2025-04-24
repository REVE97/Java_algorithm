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
}