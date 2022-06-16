package com.example.backjun.beakjoon.Print;

// 참고 블로그 : https://st-lab.tistory.com/2
public class B2557_helloWorld {
        public static void main(String[] args) {
            System.out.print("Hello World!");


        }


    /**
     * 데이터를 모아두었다가 한 번에 출력한다. 특히나 문자열을 조작할 때 매우 유용하다.
     */
//    public static void main1(String[] args){
//
//        StringBuilder sb = new StringBuilder();
//        sb.append("Hello World!");
//
//        System.out.println(sb);
//    }


    /**
     * StringBuilder랑 거의 비슷하다! 다만 StringBuilder와 차이점이 있다면 StringBuffer은 동기화를 지원한다는 점.
     *  multi-thread 상황에서 문자열이 리소스로 사용된다면 StringBuffer을 사용해주어야 한다.
     *   동기화를 지원하다 보니 StringBuilder 보단 느리지만 그래도 문자열 조작에 있어 String 보다 훨씬 빠르다.
     */
        public static void main3(String[] args){

            StringBuffer sb = new StringBuffer();
            sb.append("Hello World!");

            System.out.println(sb);
        }



}