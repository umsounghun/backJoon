package com.example.backjun.beakjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


/**
 * 최장 증가 부분 수열
 * 수열에서 오름차순으로 구성 가능한 원소들을 선택하여 최대 길이를 찾아내는 것이다.
 * O(N log N)의 시간복잡도를 갖는다.
 * 시간복잡도가 o(n^2)알고리즘
 *
 * 수열 [10, 20, 10, 30, 20, 50], 이를 seq라고 하고, dp[] 배열에 메모이제이션이라고 함
 * seq[0] = 10에 대한 수열을 찾아보면 seq[0]보다 이전 값은 없으므로 10자체 하나밖에 존재하지 않으므로
 * dp[0] = 1 이 된다.
 * 그 다음 seq[1] = 20에 대한 수열을 찾아보면 seq[0] = 10으로 20보다 작기 때문에 {10, 20}이라는 부분수열이 되고,
 * 길이는 2로 dp[1] = 2가 되는 것이다. seq[2] = 10 의 경우 이전 값들 중 작은게 없으므로 {10} 하나만 되므로
 * dp[2] = 1이 되고.. 이런식으로 나가는 것이다.
 */


public class B11053가장긴증가하는부분수열 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        // seq : {10, 20, 10, 30, 20, 50}
        // dp : 수열의 길이, seq[0] = 10, dp[0] = 1
        int[] seq = new int[N];
        int[] dp = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        // 0 ~ N까지
        for(int i = 0; i < N; i++) {
            // seq에 i값을 넣기
            seq[i] = Integer.parseInt(st.nextToken());
        }

        // dp의 초기값을 1
        for(int i = 0; i < N; i++) {
            dp[i] = 1;

            // 0 ~ i 이전 원소들 탐색
            for(int j = 0; j < i; j++) {

                // j번째 원소가 i번째 원소보다 작으면서 i번째 dp가 j번째 dp+1 값보다 작은경우
                //{10, 20, 10, 30, 20, 50}
                /**
                 * seq[0] = 10 / dp[0] = 1
                 * seq[1] = 20 / dp[1] => dp[1]=1 < dp[0] + 1=2 => dp[1] = 1 + 1
                 * seq[2] = 10 / seq[1] = 20 !< seq[2] = 10 => dp[2] = 1
                 * seq[3] = 30 / dp[3] =>
                 * dp[3]=1 < dp[0] + 1 = 2 => dp[3] = 1 + 1
                 * dp[3]=2 = dp[1]=2 + 1 = 3 => dp[3] = 3
                 * dp[3]=3 < dp[2]=1 + 1 = 3 => dp[3] = 2 + 1
                 */

                // 이전 원소보다 크고 and  이전 수열길이의 +1버다 작다면?
                if(seq[j] < seq[i] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;	// j번째 원소의 +1 값이 i번째 dp가 된다.
                }
            }
        }
        /**
         * dp[0] = 1 -> max = 1
         * dp[1] = 2 -> max = 2
         * dp[2] = 1
         * dp[3] = 3 -> max = 3
         * dp[4] = 2
         * dp[5] = 4 -> max = 4
         */
        // 최댓값(최대 길이) 탐색
        int max = -1;
        for(int i = 0; i < N; i++) {
            // max의 값은 db[i]값이 max보다 클때, 대입된다.
            max = dp[i] > max ? dp[i] : max;
        }
        System.out.println(max);

    }
}
