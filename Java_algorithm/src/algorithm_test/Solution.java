package algorithm_test;

// 괄호 회전하기
// 스택
import java.util.*;

class Solution {
    public int solution(String s) {
        String sb = s + s; // 문자열을 두 번 이어붙여 회전을 쉽게 처리
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            String str = sb.substring(i, i + s.length());
            if (isValid(str)) answer++;
        }

        return answer;
    }

    private boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.peek() != '(') return false;
                stack.pop();
            } else if (c == ']') {
                if (stack.isEmpty() || stack.peek() != '[') return false;
                stack.pop();
            } else if (c == '}') {
                if (stack.isEmpty() || stack.peek() != '{') return false;
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}

// 신고 결과 받기
// 집합, 맵

/*import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        // 중복되는 신고 없애기
        Set<String> reportSet = new HashSet<>(Arrays.asList(report));
        // System.out.println(reportSet);

        // 신고 받은 횟수 기록하기
        Map<String, Integer> reportCount = new HashMap<>();
        Map<String, List<String>> iReportWho = new HashMap<>();
        for(String s : reportSet){
            String[] part = s.split(" ");
            String from = part[0];
            String to = part[1];

            reportCount.put(to, reportCount.getOrDefault(to, 0) + 1);
            if(!iReportWho.containsKey(from)){
                iReportWho.put(from, new ArrayList<>());
            }
            iReportWho.get(from).add(to);
        }

        // K번 이상 신고받은 사람들 찾기
        for(int i = 0; i < id_list.length; i++){
            String reporter = id_list[i];
            for(String reportee: iReportWho.getOrDefault(reporter, new ArrayList<>())){
                if(reportCount.get(reportee) >= k){
                    answer[i] += 1;
                }
            }
        }
        // 제재 받은 사람을 신고한 사람한테 알림주기 answer[i]++;
        return answer;
    }
}*/


