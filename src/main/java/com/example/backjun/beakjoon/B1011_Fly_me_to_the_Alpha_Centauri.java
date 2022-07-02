package com.example.backjun.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1011_Fly_me_to_the_Alpha_Centauri {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int distance = y - x;
            //max 의 값은 distance 의 루트 값에서 소수점을 버린 정수값이랑 같다.
            int max = (int)Math.sqrt(distance);

            // max 최대값
            if (max == Math.sqrt(distance)){
                sb.append(max*2 - 1).append('\n');
            // 거리가 첫번 쨰 count(max * 2)가 1 오르는 구간
            } else if (distance <= max * max * max){
                sb.append(max * 2).append('\n');
            } else {
                sb.append(max * 2 + 1).append('\n');

            }

        }

        System.out.println(sb);
    }
}
