#Overlapping subproblems

####[Recursive Fibonacci](https://github.com/dasbipulkumar/LogixCastle/blob/master/src/main/scala/com/bipul/logixcastle/dynamicprogamming/basic/overlappingsubproblem/FibonacciWithNormalRecursion.scala)

                                            fib(6)
                                               +
                                           /      \
                                      fib(5)      fib(4)
                                      +              +
                                   /   \            /     \
                             fib(4)   fib(3)       fib(3)  fib(2)
                              +           +            +        +
                            /   \        /    \      /   \   /   \
                         fib(3) fib(2) fib(2) fib(1) .................
                         .............................................
                         ............................................ 
                         
                         Running time is ~O(2^n)
                         
      It can be observed that there are multiple repeatation of the same computation that can be memorized for further use. See below.
     
       .  
                         
####[Fibonacci with Memory](https://github.com/dasbipulkumar/LogixCastle/blob/master/src/main/scala/com/bipul/logixcastle/dynamicprogamming/basic/overlappingsubproblem/FibonacciWithMemorization.scala)

        Memorization will eliminate the unnecessary reprocessing of same inputs again and again and 
        
        Running time will be near to O(n)
                         
                     
                         
                       
                         
                         
                         
                         
                         
                         
                         