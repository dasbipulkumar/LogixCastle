package com.bipul.logixcastle.dynamicprogamming.basic.optimalsubstructure


/**
  * Created by bipulk on 8/24/16.
  */
class Graph(v: Int, e: Int, edges: Array[Edge]) {

  val noOfVertices = v
  val noOfEdges = e
  val graphEdges = edges

}

class Edge(src: Int, dest: Int, wght: Int) {
  val source = src
  val destination = dest
  val weight = wght
}

object BellmanFordGraphShortestPath {

  def getShortestPath(graph: Graph, source: Int): Unit = {

    val pathCosts: Array[Int] = Array.fill(graph.noOfVertices)(Int.MaxValue)
    pathCosts(source) = 0

    for (vert <- (1 to graph.noOfVertices - 1)) {

      for (edge <- (0 to graph.noOfEdges - 1)) {

        val src = graph.graphEdges(edge).source
        val dest = graph.graphEdges(edge).destination
        val weght = graph.graphEdges(edge).weight

        if (pathCosts(src) != Int.MaxValue && pathCosts(src) + weght < pathCosts(dest)) {

          pathCosts(dest) = pathCosts(src) + weght

        }

        //pathCosts.foreach(x => print(s" $x"))
        //println("")
      }

    }

  }


  def main(args: Array[String]) {


    val v = 5
    val e = 6
    val edges: Array[Edge] = new Array[Edge](6)

    edges(0) = new Edge(0, 1, 1)
    edges(1) = new Edge(0, 2, 4)
    edges(2) = new Edge(1, 3, 3)
    edges(3) = new Edge(2, 3, 2)
    edges(4) = new Edge(2, 4, 6)
    edges(5) = new Edge(3, 4, 8)

    BellmanFordGraphShortestPath.getShortestPath(new Graph(v, e, edges), 0)

  }

}