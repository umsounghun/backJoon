package com.example.backjun.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1300_K번째수 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        int[][] A = new int[N][N];
        int[] B = new int[N*N];

        /**
         * N x N인 배열 A, 배열에 들어있는 수 A[i][j] = i x j이다.
         * 이 수를 1차원 배열 B에 넣으면, B의 크기는 N*N이 된다.
         * B를 오름차순 정렬했을 때, B[k]를 구하여라
         */
        for (int i = 1; i <= N; i++){
            for (int j = 1; j <=N; i++){
                A[i][j] = i * j;
                    B[i*j] = A[i][j];
            }
            Arrays.sort(B);
        }
        System.out.println(B[K]);

    }
}
