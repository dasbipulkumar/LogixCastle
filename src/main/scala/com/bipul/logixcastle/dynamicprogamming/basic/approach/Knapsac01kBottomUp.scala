package com.bipul.logixcastle.dynamicprogamming.basic.approach

/**
  * Created by bipulk on 8/25/16.
  */
object Knapsac01kBottomUp {

  def solveKnapsack(value: Array[Int], weight: Array[Int], knapsackMaxWeight: Int): Unit = {

    val matrix = Array.fill[Int](value.length + 1, knapsackMaxWeight + 1)(0)

    for (i <- (0 to value.length)) {

      for (j <- (0 to knapsackMaxWeight)) {

        if (i == 0 || j == 0) {

          matrix(i)(j) = 0 // base case

        }

        else {

          if (j - weight(i - 1) >= 0) {

            matrix(i)(j) = Math.max(matrix(i - 1)(j), matrix(i - 1)(j - weight(i - 1)) + value(i - 1)) //include the item

          }
          else {

            matrix(i)(j) = matrix(i - 1)(j) //exclude the item

          }

        }
          print(matrix(i)(j) + " ")

      }
      println("")
    }

    println(matrix({value.length})(knapsackMaxWeight))

  }

  def main(args: Array[String]) {

    val value = Array(10,40,30,50)
    val weight = Array(5,4,6,3)
    val maxKnapsackWeight = 10

    solveKnapsack(value,weight,maxKnapsackWeight)

  }

}
