package com.example.backjun.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 선택된 수의 합이 최대가 되는 경로를 구하는 프로그램을 작성하라
 * 아래층에 있는 수는 현재 층에서 선택된 수의 대각선 왼쪽 또는 대각선 오른쪽에 있는 것 중에서만 선택할 수 있다.
 */
public class B1932정수삼각형 {
    // 입력을 받는 배열 : arr
        static int[][] arr;
        // 경로 합을 갖는 배열  : dp
        static Integer[][] dp;
        // 열 : n
        static int N;

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            N = Integer.parseInt(br.readLine());

            arr = new int[N][N];
            dp = new Integer[N][N];
            StringTokenizer st;
            // 가로배열
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                //세로배열
                for (int j = 0; j < i + 1; j++) {
                    // arr의 위치마다 주어진 값을 넣어 준다.
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            //0에서부터 마지막 층까지 반복할 때
            for (int i = 0; i < N; i++) {
                dp[N - 1][i] = arr[N - 1][i];
            }

            System.out.println(find(0, 0));

        }

        // 최대값 찾기 메서드
        static int find(int depth, int idx) {
            // 만약 맨 밑(깊이)의 행에 도달하면 해당 인덱스를 반환한다.
            if(depth == N - 1) return dp[depth][idx];

            // 만약 아직 탐색하지 않은 위치라면 다음 행의 양쪽 열 중 최댓값을 구함
            if (dp[depth][idx] == null) {
                /*
		 바로 다음행의 인덱스와 그 오른쪽의 인덱스 중
		 큰 값 찾아 dp에 현재 인덱스의 값과 더하여 저장
		*/
                dp[depth][idx] = Math.max(find(depth + 1, idx), find(depth + 1, idx + 1)) + arr[depth][idx]; // 둘중에 최대값인 값
            }
            return dp[depth][idx];

        }
    }
