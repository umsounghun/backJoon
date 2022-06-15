package com.example.backjun.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11050이항계수1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int answer = 0;

        answer = BC(N) / (BC(K)*BC((N-K)));

        System.out.println(answer);

    }

    static int BC(int n) {

        int total = 1;

        for (int i = 1; i <= n; i++){
            total *= i;
        }
        return total;

    }
}
