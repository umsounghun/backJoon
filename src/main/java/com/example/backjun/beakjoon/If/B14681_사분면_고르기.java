package com.example.backjun.beakjoon.If;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class B14681_사분면_고르기 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();

        if (a.contains("-")){

            if (b.contains("-")){
                System.out.println(3);
            } else{
                System.out.println(2);
            }

        } else{

            if (b.contains("-")){
                System.out.println(4);
            } else{
                System.out.println(1);
            }

        }
    }
}
