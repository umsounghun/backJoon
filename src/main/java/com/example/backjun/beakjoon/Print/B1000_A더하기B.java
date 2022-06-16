package com.example.backjun.beakjoon.Print;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 참고 블로그 : https://st-lab.tistory.com/12
public class B1000_A더하기B {

//
//    public static void main(String[] args) {
/**
 * 객체를 생성해준다.
 * Scanner(System.in) 에서 System.in 은 입력한 값을 Byte 단위로 읽는 것을 뜻한다.
 * 객체명은 자유롭게 선언해주면 되는데 보통 가장 많이쓰이는 객체명으로는 in 과 scan, sc 을 쓴다.
 * <p>
 * StringBuilder랑 거의 비슷하다! 다만 StringBuilder와 차이점이 있다면 StringBuffer은 동기화를 지원한다는 점.
 * multi-thread 상황에서 문자열이 리소스로 사용된다면 StringBuffer을 사용해주어야 한다.
 * 동기화를 지원하다 보니 StringBuilder 보단 느리지만 그래도 문자열 조작에 있어 String 보다 훨씬 빠르다.
 * <p>
 * 참고로 String 입력 방법에 in.next() 와 in.nextLine() 이 있는데 두 가지는 입력 받는 방식이 다르다.
 * <p>
 * in.next() : 문자열 입력시 공백 전 까지만 받음
 * in.nextLine() : 문자열 입력시 Enter 입력 전까지만 받음
 * 상황에 맞게 선택해주면 되지만 next() 의 경우 에러가 발생할 수 있는 경우가 많아
 * <p>
 * 대부분 문제에서는 행 단위로 입력받는 일이 다수이니 문자열 입력 형태로는 in.nextLine() 을 쓴다.
 * <p>
 * BufferedReader 의 경우 문자열을 받는 대표적인 방법은 readLine() 과 read() 이다.
 * <p>
 * 둘의 차이는 readLine() 은 한 행을 읽어오고, read() 는 한 문자만 읽어온다.
 * 그래서 특별한 경우가 없는 한 대부분 readLine() 을 쓴다.
 */
//        Scanner in = new Scanner(System.in);
//        int A = in.nextInt();
//        int B = in.nextInt();
//
//        System.out.println(A+B);
//
//        in.close();
//    }
//}


/**
 * StringBuilder랑 거의 비슷하다! 다만 StringBuilder와 차이점이 있다면 StringBuffer은 동기화를 지원한다는 점.
 *  multi-thread 상황에서 문자열이 리소스로 사용된다면 StringBuffer을 사용해주어야 한다.
 *   동기화를 지원하다 보니 StringBuilder 보단 느리지만 그래도 문자열 조작에 있어 String 보다 훨씬 빠르다.
 *
 *   참고로 String 입력 방법에 in.next() 와 in.nextLine() 이 있는데 두 가지는 입력 받는 방식이 다르다.
 *
 * in.next() : 문자열 입력시 공백 전 까지만 받음
 * in.nextLine() : 문자열 입력시 Enter 입력 전까지만 받음
 * 상황에 맞게 선택해주면 되지만 next() 의 경우 에러가 발생할 수 있는 경우가 많아
 *
 * 대부분 문제에서는 행 단위로 입력받는 일이 다수이니 문자열 입력 형태로는 in.nextLine() 을 쓴다.
 *
 *BufferedReader 의 경우 문자열을 받는 대표적인 방법은 readLine() 과 read() 이다.
 *
 * 둘의 차이는 readLine() 은 한 행을 읽어오고, read() 는 한 문자만 읽어온다.
 * 그래서 특별한 경우가 없는 한 대부분 readLine() 을 쓴다.
 */


//public static void main(String[]args)throws IOException{
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//
//        String[]str=br.readLine().split(" ");
//        int a=Integer.parseInt(str[0]);
//        int b=Integer.parseInt(str[1]);
//
//        System.out.println(a+b);
//
//        }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(a + b);
    }


        }