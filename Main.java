
/*
    * Here is my graph theory template. You might think that I am smart for having a template, but it is literally the code from the GeeksForGeeks website for BFS and DFS. I will most likely change it in the future if I am smarter and find a better one (I don't even know if this one is bad).
        * https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/
        * https://www.geeksforgeeks.org/depth-first-search-or-dfs-for-a-graph/
*/

import java.util.LinkedList;
import java.util.Iterator;


public class Main {
   
    private int V;
    private LinkedList<Integer> adj[];
    private int[] BFSsearch;
    
    Current (int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
        BFSsearch = new int[v];
    }

    private void addEdge(int v,int w)
    {
        adj[v].add(w);
    }

    private void BFS(int s, int e)
    {
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[s]=true;
        queue.add(s);
        int currentValue = 0;
        while (queue.size() != 0)
        {
            s = queue.poll();
            BFSsearch [currentValue] = s;
            currentValue++;
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
    
    private void DFSUtil(int v, boolean visited[])
    {
        visited[v] = true; 
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) 
        {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }
 
    private void DFS(int s)
    {
        boolean visited[] = new boolean[V];
        DFSUtil(s, visited);
    }

    public static void main (String [] args){

    }
}
