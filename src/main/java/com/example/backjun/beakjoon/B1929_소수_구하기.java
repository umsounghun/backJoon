package com.example.backjun.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1929_소수_구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        for (int i = M; i <= N; i++) {
            boolean istrue = true;

            if (i < 2) {
                istrue = false;
            }

            // 소수는 2부터 존재하고, 입력값까지 반복
            for (int j = 2; j <= (int) Math.sqrt(i); j++) {

                // 제곱근의 나머지가 0이면 소수가 아니므로 false
                if (i % j == 0) {
                    istrue = false;
                    break;
                }
            }
            if (istrue) {
                System.out.println(i);
            }
        }
    }
}


