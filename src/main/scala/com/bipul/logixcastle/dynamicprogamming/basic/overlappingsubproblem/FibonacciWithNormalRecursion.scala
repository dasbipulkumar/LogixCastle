package com.bipul.logixcastle.dynamicprogamming.basic.overlappingsubproblem

/**
  * Created by bipulk on 8/24/16.
  */
object FibonacciWithNormalRecursion {

  def fibonacci(limit: Int): (Int) = {
   // println(limit)
    if (limit <= 1)
      limit
    else
      fibonacci(limit - 1) + fibonacci(limit - 2)
  }

  def main(args: Array[String]) {

    println(FibonacciWithNormalRecursion.fibonacci(40))

  }

}
