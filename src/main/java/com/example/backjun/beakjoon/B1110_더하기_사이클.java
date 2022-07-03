package com.example.backjun.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B1110_더하기_사이클 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());    // 테스트 케이스
        int cnt = 0;

        int next = T;
        while (true) {
            next = func(next);
            cnt++;

            // N의 사이클의 길이를 구하는 것이므로,
            // 주어진 값과 동일하게 되면 1사이클이 완료된 것이다.
           if (T == next) {
                break;
            }
        }

        System.out.println(cnt);

    }

    // 함수
    private static int func(int n) {
        int next_num = 0;
        if (n >= 10) {
            //sum of each position
            int position_sum = n / 10 + n % 10;
            int position_sum_last = position_sum % 10;
            next_num = (n % 10) * 10 + position_sum_last;
        }

        if (n < 10) {
            next_num = n * 10 + n;
        }

        return next_num;
    }
}


