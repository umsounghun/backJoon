package com.example.backjun.beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B1260번_DFS와BFS_2 {

    //DFS에 쓰일 이차원 배열
    static int[][] Dgraph = new int[1001][1001];
    //BFS에 쓰일 이차원 배열
    static int[][] Bgraph = new int[1001][1001];
    static boolean[] Dvisit = new boolean[10001];
    //N은 DFS, BFS 메소드에도 사용되어야 하기 때문에 필드로 선언
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        //간선을 두개의 그래프 배열에 똑같이 저장해 준다. (노드와 간선에 대한 값을 초기화)
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            Dgraph[u][v] = Dgraph[v][u] = 1;
            Bgraph[u][v] = Bgraph[v][u] = 1;
        }
        // 1 2 4 3
        //
        DFS(V);
        System.out.println();
        BFS(V);
    }

    public static void DFS(int node) {
        Dvisit[node] = true;
        System.out.print(node + " ");
        for (int i = 1; i <= N; i++) {
            // 조건 1 : 미방문
            // 조건 2 : 간선이 존재 (위에 간선이 존재한 배열에 1로 초기화 했기 때문)
            if (!Dvisit[i] && Dgraph[node][i] == 1) {
                DFS(i);
            }
        }
    }

    public static void BFS(int node) {
        boolean[] Bvisit = new boolean[10001];
        Queue<Integer> que = new LinkedList<Integer>();
        Bvisit[node] = true;
        que.offer(node);

        // 큐가 비어있지 않다면 / 꺼내오기 (답을 출력하는 과정)
        while (!que.isEmpty()) {
            int P = que.poll();
            System.out.print(P + " ");

            for (int i = 1; i <= N; i++) {
                // 조건 1 : 미방문
                // 조건 2 : 간선이 존재 (위에 간선이 존재한 배열에 1로 초기화 했기 때문)
                if (!Bvisit[i] && Bgraph[P][i] == 1) {
                    Bvisit[i] = true;
                    que.offer(i);
                }
            }
        }
    }

}


