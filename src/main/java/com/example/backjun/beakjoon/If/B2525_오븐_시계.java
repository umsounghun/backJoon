package com.example.backjun.beakjoon.If;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://propercoding.tistory.com/55
public class B2525_오븐_시계 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        a += (b+c) / 60;
        if (a >= 24) a -= 24;
        b = (b+c) % 60;
        System.out.print(a + " " + b);
    }
}