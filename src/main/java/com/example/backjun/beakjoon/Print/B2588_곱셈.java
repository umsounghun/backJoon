package com.example.backjun.beakjoon.Print;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2588_곱셈 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        String B = br.readLine();

        char[] b = B.toCharArray();

        System.out.println(A * (b[2])- '0');
        System.out.println(A * (b[1])- '0');
        System.out.println(A * (b[0])- '0');
        System.out.println(A * Integer.parseInt(B));

    }


}