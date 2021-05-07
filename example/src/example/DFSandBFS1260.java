package example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class DFSandBFS1260 {

	public static class Graph {
		private int V;	// 노드의 개
		private LinkedList<Integer> adj[]; // 인접 리스트
		
		public Graph(int v) {
			this.V = v;
			adj = new LinkedList[v];
			for(int i = 0 ; i < v ; i++) {
				adj[i] = new LinkedList<Integer>();
			}
		}
		
		/* Connect Node */
		void addEdge(int v, int w) { 
			adj[v].add(w);
			adj[w].add(v);
		}
		
		/* s를 시작 노드로 한 BFS로 탐색하면서 탐색한 노드들을 출력 */
		void BFS(int s) {
			// 노드의 방문 여부 판단 (default : false) 
			boolean visited[] = new boolean[V];
			
			// BFS 구현을 위한 Queue 생성
			LinkedList<Integer> queue = new LinkedList<Integer>();
			
			// 현재 노드를 방문한 것으로 표시하고 큐에 삽입(enqueue)
			visited[s] = true;
			queue.add(s);
			
			// Queue가 빌 때 까지 반복
			while(queue.size() != 0) {
				// 방문한 노드를 큐에서 추출(dequeue)하고 값을 출력
				s = queue.poll();
				System.out.print((s+1) + " ");
				
				// 방문한 노드와 인접한 모든 노드를 가져온다.
				Collections.sort(adj[s]);
				Iterator<Integer> iter = adj[s].listIterator();
				
				while(iter.hasNext()) {
					int n = iter.next();
					if(visited[n] == false) {
						visited[n] = true;
						queue.add(n);
					}
				}
			}
			System.out.println();
		}
		
		void DFSSearch(int v, boolean[] visited) {
			visited[v] = true;
			System.out.print((v+1)+" ");
			
			Collections.sort(adj[v]);
			Iterator<Integer> iter = adj[v].listIterator();
			while(iter.hasNext()) {
				int n = iter.next();
				if(visited[n] == false) {
					DFSSearch(n, visited);
				}
			}
			
		}
		
		/** s를 시작 노드로 한 DFS로 탐색하면서 탐색한 노드들을 출력 */
		void DFS(int s) {
			boolean visited[] = new boolean[V];
			DFSSearch(s, visited);
			System.out.println();
		}
		
	}
	
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String firstLine = br.readLine();
			String[] NMV = firstLine.split(" ");
			int N = Integer.parseInt(NMV[0]);
			int M = Integer.parseInt(NMV[1]);
			int V = Integer.parseInt(NMV[2]);
			
			Graph graph = new Graph(N);
			String arr[] = new String[M];
			
			for(int i = 0 ; i < M ; i++) {
				arr[i] = br.readLine();
			}
			Arrays.sort(arr);

			for(String PP : arr) {
				String[] points = PP.split(" ");
				int A = Integer.parseInt(points[0])-1;
				int B = Integer.parseInt(points[1])-1;
				if(A<B)
					graph.addEdge(A,B);
				else
					graph.addEdge(B,A);
			}
			
			graph.DFS(V-1);
			graph.BFS(V-1);
			
		}catch(IOException e) {
			
		}
		
		
	}

}
