package com.example.backjun.beakjoon;

import java.io.*;
import java.util.PriorityQueue;


public class B1927 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> q = new PriorityQueue<>();


        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            if (m == 0) {
                if (q.isEmpty()) {
                    sb.append(0 + "\n");
                } else {
                    sb.append(q.poll() + "\n");
                }
            } else {
                q.add(m);
            }
        }
        System.out.println(sb);
    }
}