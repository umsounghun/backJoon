package com.example.backjun.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B10828_스택 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

     for (int i = 0; i < T; i++){
         String a = br.readLine();

         if (a.contains("push")){
             stack.push(Integer.valueOf(a.split(" ")[1]));
         }

         if (a.contains("top")){
             stack.peek();
         }


     }

    }
}
