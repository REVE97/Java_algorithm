package silver05;

//p.1316

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
}
