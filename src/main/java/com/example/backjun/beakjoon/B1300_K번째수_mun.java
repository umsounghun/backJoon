package com.example.backjun.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1300_K번째수_mun {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        // x는 lo <= x <= hi 의 범위를 갖는다.
        long lo = 1;
        long hi = K;

        // lower-bound
        // '찾고자 하는 값과 같거나 큰 수가 있는 첫 번째 인덱스'를 찾는 Lower-Bound
        while(lo < hi) {

            long mid = (lo + hi) / 2;	// 임의의 x(mid)를 중간 값으로 잡는다.
            long count = 0;

            /*
             *  임의의 x에 대해 i번 째 행을 나눔으로써 x보다 작거나 같은 원소의 개수
             *  누적 합을 구한다.
             *  이 때 각 행의 원소의 개수가 N(열 개수)를 초과하지 않는 선에서 합해주어야 한다.
             *
             *  우리가 찾고자하는 것은 B[K] = x에서 K인덱스의 원소 값 x를찾는 것
             * x보다 작거나 같은 원소의 개수가 k값과 일치치
             * 각 단(i)로 나눠버리면 개수가 된다.
             */
            for(int i = 1; i <= N; i++) {

                // x에 대해 x=13이라고 하면
                // 13 / 1 = 13
                // 4*4= 16 각 행에 대해 각 4개의 원소를 갖는다. -> x보다 작은 원소의 개수는 최대 n개를 넘지 못한다.
                // 13/2 = 6으로 한 행에 대한 열의 개수를 초과하게 된다.
                // 3단의 경우는 13/3 =4 로 13보다 작은 원소가 4개로 정확히 맞아 떨어지고,
                // 4단의 경우는 13/4=3으로, 4,8,12 총 3개로 n=4 안에서 개수를 갖게된다.
                count += Math.min(mid / i, N);
            }

            // count가 많다는 것은 임의의 x(mid)보다 작은 수가 B[K]보다 많다는 뜻
            if(K <= count) {
                hi = mid;
            }
            else {
                lo = mid + 1;
            }
        }

        System.out.println(lo);
    }
}

