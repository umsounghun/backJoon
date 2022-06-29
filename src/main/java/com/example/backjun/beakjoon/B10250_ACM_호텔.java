package com.example.backjun.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10250_ACM_호텔 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int H = Integer.parseInt(st.nextToken());
            st.nextToken();    // W는 그냥 버린다.
            int N = Integer.parseInt(st.nextToken());

            if (N % H == 0) {
                sb.append((H * 100) + (N / H)).append('\n');
            } else {
                sb.append((N % H) * 100 + (N / H + 1)).append('\n');
            }
        }
        System.out.println(sb);
    }
}
