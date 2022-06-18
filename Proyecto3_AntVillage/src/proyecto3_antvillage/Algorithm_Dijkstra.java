
package proyecto3_antvillage;

/**
 * Este algoritmo representa el algoritmo de dijkstra, lo que busca el camino más corto entre vertices
 * @author Roger Solano
 */
public class Algorithm_Dijkstra {
    
    public static String texto = "";

    //Función del algoritmo de dijkstra
    public static void dijkstra(int[][] graph, int sourceVertex, int arrival) {
        try {
            if (sourceVertex >= 0 && sourceVertex <= 5 && arrival >= 0 && arrival <= 5) {
                int vertexCount = graph.length;
                boolean[] visitedVertex = new boolean[vertexCount];
                int[] distance = new int[vertexCount];


                for (int i = 0; i < vertexCount; i++) {
                    visitedVertex[i] = false;
                    distance[i] = Integer.MAX_VALUE;
                }
                distance[sourceVertex] = 0; // Distancia del vertice fuente es cero
                for (int i = 0; i < vertexCount; i++) {
                    //find the neighbouring unviited vertex having  minimum distance from source vertex
                    //for the first time u will be the source vertex and the distance array will be updated with the neighbouring vertex distance of source vertex

                    int u = findMinDistance(distance, visitedVertex);
                    //u es la fila y v es la columna

                    visitedVertex[u] = true;
                    //Alerta a todos los vertices vecinos
                    for (int v = 0; v < vertexCount; v++) {
                        //graph[u][v] != 0 -> debe ser directo
                        if (!visitedVertex[v] && graph[u][v] != 0 && (distance[u] + graph[u][v] < distance[v])) {
                            distance[v] = distance[u] + graph[u][v];
                        }
                    }
                }


                int i = arrival;
                texto = String.format("El tiempo aproximado:", sourceVertex, i, distance[i]);
            }

          // Excepción si el valor a recorrer no es permitido
        } catch (Exception e) {
            System.out.println("Valor de recorrido no valido");
        }
    }
    
    //Retorna el texto 
    public String mostrartexto() {
        return texto;
    }
    
    //Función que encuentra la distancia minima
    private static int findMinDistance(int[] distance, boolean[] visitedVertex) {
        int minDistance = Integer.MAX_VALUE;
        int minDistanceVertex = 1;
        for (int i = 0; i < distance.length; i++) {
            //El vertice no debe d ser viistado y la distancia debe ser la minima.
            //Esto es similar a encontrar el elemnto min en un array
            if (!visitedVertex[i] && distance[i] < minDistance) {
                minDistance = distance[i];
                minDistanceVertex = i;
            }
        }
        return minDistanceVertex;
    }
    //El error solamente surge cuando va de X a 0
    //TODO hacerlo invertido, en vez de X a 0, de 0 a X
    public static void main(String[] args) {
        int graph[][] = new int[][]{
                {0, 73, 0, 0, 0,},
                {73, 0, 27, 0, 0,},
                {0, 27, 0, 4, 3,},
                {0, 0, 4, 0, 0,},
                {0, 0, 3, 0, 0,}};

        Algorithm_Dijkstra t = new Algorithm_Dijkstra();
        int source = 5;
        int arrival = 5;
        t.dijkstra(graph, source, arrival);
    }
    
}
