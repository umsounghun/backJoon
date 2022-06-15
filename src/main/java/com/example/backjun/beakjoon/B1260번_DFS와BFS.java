package com.example.backjun.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B1260번_DFS와BFS {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // 노드 (정점)
    static int[][] arr;
    // 정점의 방문 여부
    static boolean[] check;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        // n = 정점의 개수 (노드)
        int n = Integer.parseInt(st.nextToken());
        // m = 간선의 개수 (엣지)
        int m = Integer.parseInt(st.nextToken());
        // v = 탐색 시작한 정점의 번호
        int v = Integer.parseInt(st.nextToken());

        //
        arr = new int[n + 1][n + 1];
        check = new boolean[n + 1];

        // 노드와 간선에 대한 값을 초기화
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            arr[s][e] = 1;
            arr[e][s] = 1;
        }

        dfs(v);
        // bfs하기위해 1줄을 띄운다.
        sb.append("\n");
        bfs(v);

        System.out.println(sb);
    }

    // check배열 false로 초기화
    public static void initCheck() {
        for (int i = 0; i < check.length; i++) check[i] = false;
    }

    //dfs 메소드 / 시작값 v
    public static void dfs(int start) {
        // 경로 출력
        sb.append(start + " ");
        // 현재 노드 방문 처리 / 방문하면 true
        check[start] = true;

        // 노드갯수만큼 반복
        for (int i = 1; i < check.length; i++)
            // 현재 노드와 다른 노드 중 && 미방문 && 간선이 존재
            // 조건 1 : 현재 노드와 다른 노드
            // 조건 2 : 미방문
            // 조건 3 : 간선이 존재 (위에 간선이 존재한 배열에 1로 초기화 했기 때문)
            if (i != start && check[i] == false && arr[start][i] == 1)
                //dfs에 i를 넣어서, sb에 출력해줄 값을 넣어 준다.
                dfs(i);

    }

    public static void bfs(int start) {
        // check배열 초기화
        initCheck();
        Queue<Integer> queue = new LinkedList<>();

        // 처음 시작노드 추가
        queue.add(start);
        // 처음 시작노드 방문처리
        check[start] = true;

        // 큐가 빌때까지 반복
        while (!queue.isEmpty()) {
            // 큐에서 빼온다
            int num = queue.poll();
            // 빼온 숫자를 sb에 붙여준다.
            sb.append(num + " ");

            for (int i = 1; i < check.length; i++) {
                // 현재 노드와 다른 노드 중 && 미방문 && 간선이 존재
                // 조건 1 : 현재 노드와 다른 노드
                // 조건 2 : 미방문
                // 조건 3 : 간선이 존재 (위에 간선이 존재한 배열에 1로 초기화 했기 때문)
                if (i != num && check[i] == false && arr[num][i] == 1) {
                    // 노드 추가
                    queue.add(i);
                    // 현재 노드 방문 처리 / 방문하면 true
                    check[i] = true;
                }
            }
        }
        sb.append("\n");
    }
}

