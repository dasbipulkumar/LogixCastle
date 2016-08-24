#Optimal Substructure

####[BellmanFordGraphShortestPath](https://github.com/dasbipulkumar/LogixCastle/blob/master/src/main/scala/com/bipul/logixcastle/dynamicprogamming/basic/optimalsubstructure/BellmanFordGraphShortestPath.scala)

            The optimal substructure at any point of time can be intered for the path from source(s) to any vertex(v e V)
             is the path cost with maximum numbers of vertices allowed starting from 1  to all vertices
              
             For Graph G(E,V) directed weighted with some -ve edges but no -ve cycle      
                       
**           Assumption: There is no negative cycle, whereas this algorithm can be extended for detecting a -ve cycle**
           
             let for all destination v belongs to V and source s, 
                          
                Algorithm:
                          
                          Base Case: C[s] :=0 ; C[v] := Infinity for all v e V except s 
                          
                          for (i <- 1 to |V| -1) **
                              for all edge e in E
                                                                
                                    if the distance to the destination can be shortened by taking the edge, the distance is updated to the new lower value
                                    
                          end
                                    
                 ** Since the longest possible path without a cycle can be |V|-1 edges, the edges must be scanned | V | − 1  times to ensure the shortest path has been found for all nodes                               
                 Running Time is O(mn) in case of  sparse graph and O(n3) in case od dense graph
                                               
                            