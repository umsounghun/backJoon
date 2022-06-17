package com.example.backjun.beakjoon.Print;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B18108_1998년생인_내가_태국에서는_2541년생 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int a = Integer.parseInt(str);

        System.out.println(a - 543);
    }


}