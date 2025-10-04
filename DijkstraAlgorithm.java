import java.util.*;

public class DijkstraAlgorithm {

    // Helper class to represent a node and its distance from the source
    static class Node implements Comparable<Node> {
        public int vertex;
        public int distance;

        public Node(int vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }

        // The PriorityQueue will use this to order nodes by their distance
        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.distance, other.distance);
        }
    }

    // Helper class to represent a graph edge
    static class Edge {
        public int target;
        public int weight;

        public Edge(int target, int weight) {
            this.target = target;
            this.weight = weight;
        }
    }

    /**
     * Finds the shortest distance from a source vertex to all other vertices.
     * @param V The number of vertices in the graph.
     * @param adj The adjacency list representation of the graph.
     * @param source The starting vertex.
     * @return An array of shortest distances from the source.
     */
    public static int[] dijkstra(int V, List<List<Edge>> adj, int source) {
        // 1. Initialize distances
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;

        // 2. Priority Queue (Min-Heap)
        // Stores (distance, vertex) and is prioritized by distance
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(source, 0));

        // 3. Process nodes
        while (!pq.isEmpty()) {
            Node currentNode = pq.poll();
            int u = currentNode.vertex;
            int d = currentNode.distance;

            // Optimization: Skip if we found a shorter path to 'u' already
            if (d > dist[u]) {
                continue;
            }

            // 4. Relax edges for neighbors
            for (Edge edge : adj.get(u)) {
                int v = edge.target;
                int weight = edge.weight;

                // Relaxation step
                if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    // Add/update the neighbor in the Priority Queue
                    pq.add(new Node(v, dist[v]));
                }
            }
        }

        return dist;
    }

    public static void main(String[] args) {
        // Example Graph (V=5, nodes 0 to 4)
        int V = 5;
        // Adjacency list: List of lists of Edges
        List<List<Edge>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges: (source, target, weight)
        adj.get(0).add(new Edge(1, 10));
        adj.get(0).add(new Edge(4, 5));
        adj.get(1).add(new Edge(2, 1));
        adj.get(1).add(new Edge(4, 2));
        adj.get(2).add(new Edge(3, 4));
        adj.get(3).add(new Edge(2, 6));
        adj.get(4).add(new Edge(1, 3));
        adj.get(4).add(new Edge(2, 9));
        adj.get(4).add(new Edge(3, 2));

        int sourceVertex = 0;
        int[] shortestDistances = dijkstra(V, adj, sourceVertex);

        // Output results
        System.out.println("Shortest distances from source node " + sourceVertex + ":");
        for (int i = 0; i < V; i++) {
            String distance = (shortestDistances[i] == Integer.MAX_VALUE) ? "INF" : String.valueOf(shortestDistances[i]);
            System.out.println("To Vertex " + i + ": " + distance);
        }
    }
}