package com.bipul.logixcastle.dynamicprogamming.basic.overlappingsubproblem

import scala.collection.mutable.ArrayBuffer

/**
  * Created by bipulk on 8/24/16.
  */
object FibonacciWithMemorization {


  def calculateFibonacci(maxLimit: Int): Long = {

    val buffer = Array.fill[Long](maxLimit + 1)(-1L)
    fibonacci(maxLimit, buffer)

  }

  private def fibonacci(limit: Int, buffer: Array[Long]): Long = {
    // println(limit)
    if (buffer(limit) == -1L) {
      if (limit <= 1)
        buffer(limit) = limit
      else
        buffer(limit) = fibonacci(limit - 1, buffer) + fibonacci(limit - 2, buffer)
    }
    buffer(limit)
  }

  def main(args: Array[String]) {

    println(FibonacciWithMemorization.calculateFibonacci(40))

  }

}
