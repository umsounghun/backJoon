package com.example.backjun.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int i = Integer.parseInt(br.readLine());
            if (i == 0) {
                break;
            }
            list.add(i);
        }
        for (int n : list) {
            // count는 출력값으로 줄 값
            int count = 0;

            // 소수를 검증할 범위를 지정
            for (int i = n + 1; i <= 2 * n; i++) {
                boolean istrue = true;

                // 소수는 2부터 존재하고, 입력값까지 반복
                for (int j = 2; j <= (int) Math.sqrt(i); j++) {

                    if (i % j == 0) {
                        istrue = false;
                        break;
                    }
                }
                if (istrue == true) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}




