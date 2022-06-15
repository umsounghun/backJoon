package com.example.backjun.beakjoon;

import org.springframework.data.geo.Distance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1011 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());    // 테스트 케이스

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            // 출발과 도착의 이동거리는 1이여야 한다.
            // k값이 증가하다 줄어든다.
            // 거리가 1 -> 1 * max 1
            // 거리가 2 -> 1, 1*
            // 거리가 3 -> 1, 1, 1
            // 거리가 4 -> 1, 2, 1 * max 2
            // 거리가 5 -> 1, 2, 1, 1
            // 거리가 6 -> 1, 2, 2, 1*
            // 거리가 7 -> 1, 2, 1, 2, 1
            // 거리가 8 -> 1, 2, 2, 2, 1
            // 거리가 9 -> 1, 2, 3, 2, 1 * max 4
            // 거리가 10-> 1, 2, 2, 2, 2, 1
            // 거리가 11-> 1, 2, 3, 2, 2, 1
            // 거리가 12-> 1, 2, 3, 3, 2, 1 *
            // 거리가 13-> 1, 2, 2, 2, 3, 2, 1
            // 거리가 14-> 1, 2, 3, 2, 3, 2, 1
            // 거리가 15-> 1, 2, 3, 3, 3, 2, 1
            // 거리가 16-> 1, 2, 3, 4, 3, 2, 1 * max 4
            // 거리가 17-> 1, 2, 3, 3, 2, 3, 2, 1
            // 거리가 18-> 1, 2, 3, 3, 3, 3, 2, 1
            // 거리가 19-> 1, 2, 3, 4, 3, 3, 2, 1
            // 거리가 20-> 1, 2, 3, 4, 4, 3, 2, 1*
            // 거리가 21-> 1, 2, 3, 3, 3, 3, 3, 2, 1
            // 거리가 22-> 1, 2, 3, 4, 3, 3, 3, 2, 1
            // 거리가 23-> 1, 2, 3, 4, 4, 3, 3, 2, 1
            // 거리가 24-> 1, 2, 3, 4, 4, 4, 3, 2, 1
            // 거리가 25-> 1, 2, 3, 4, 5, 4, 3, 2, 1 * max5
            // 거리가 26-> 1, 2, 3, 4, 3, 3, 4, 3, 2, 1
            // 거리가 27-> 1, 2, 3, 4, 4, 3, 4, 3, 2, 1
            // 거리가 28-> 1, 2, 3, 4, 4, 4, 4, 3, 2, 1
            // 거리가 29-> 1, 2, 3, 4, 5, 4, 4, 3, 2, 1
            // 거리가 30-> 1, 2, 3, 4, 5, 5, 4, 3, 2, 1*
            // 거리가 31-> 1, 2, 3, 3, 3, 3, 3, 3, 3, 2, 1

            // count가 1일때 1개 -> distance 1
            // count가 2일때 1개 -> distance 2
            // count가 3일때 2개 -> distance 4
            // count가 4일때 2개 -> distance 6
            // count가 5일때 3개 -> distance 9
            // count가 6일때 3개 -> distance 12
            // count가 7일때 4개 -> distance 16
            // count가 8일때 4개 -> distance 20
            // count가 9일때 5개 -> distance 25
            // count가 9일때 5개 -> distance 30
            //-> count가 짝수일 때의 갯수와 홀수(count-1)인 의 갯수와 동일


            // count값에 따라 이동할 수 잇는 최대 거리나열 규칙 ->
            //max 가 1 씩 증가하면서 2 번씩 반복된다.
            //Distance(거리) 는 이전 거리와 최댓값과의 차이가 max 가 증가하는 규칙과 동일하다.
            //max 가 변하는 지점의 Distance 는 max 의 제곱 값이다.
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            // 거리
            int distance = Y - X;
            // 최댓값 -> 길이의 제곡근 중 정수 부분만 취한 값
            // 만약 정수부분만 취한 값과, 9는 제곱근이 3 / 소수점을 버린 max도 3
            int max = (int) Math.sqrt(distance);
            // 최댓값과 길이의 제곱근이 같으면
            // 최대값일 때 count는 max*2의 -1
            if (max == Math.sqrt(distance)) {
                sb.append(max * 2 - 1).append('\n');
                //1번째 구간dml count값
            } else if (distance <= max * max + max) {
                sb.append(max * 2).append('\n');
                // 2번째 구간일 경우 count
            } else {
                sb.append(max * 2 + 1).append('\n');
            }

        }
        System.out.println(sb);
    }
}
