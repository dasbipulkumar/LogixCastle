package com.bipul.logixcastle.utils

import com.bipul.logixcastle.dynamicprogamming.basic.overlappingsubproblem.{FibonacciWithMemorization, FibonacciWithNormalRecursion}

/**
  * Created by bipulk on 8/25/16.
  */
object RuntimeUtil {

  def runtime(f: Int => Long) = {

    val startTime = System.currentTimeMillis()
    val result = f(50)
    val endTime = System.currentTimeMillis()

    println("Result :: " + result)
    println("Total Time taken for "+ f.toString() +" :: " + (endTime - startTime))
  }

  def main(args: Array[String]) {

    runtime(FibonacciWithMemorization.calculateFibonacci)

    runtime(FibonacciWithNormalRecursion.fibonacci)

  }

}
