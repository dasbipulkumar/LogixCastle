##Bottom Up


**0-1 Knapsack problem**

                        0    1   2   3   4   5   6   7   8   9   10
                   
        (v,w)    0      0    0   0   0   0   0   0   0   0   0    0 
                 
        (10,5)   1      0    0   0   0   0  10  10   10  10  10  10 
                   
        (40,4)   2      0    0   0   0  40  40  40   40  40  50  50
                   
        (30,6)   3      0    0   0   0  40  40  40   40  40  50  70 
                   
        (50,4)   4      0    0   0  50  50  50  50   90  90  90  90
        
         if (j - weight(i - 1) >= 0) {
        
                    matrix(i)(j) = Math.max(matrix(i - 1)(j), matrix(i - 1)(j - weight(i - 1)) + value(i - 1))
        
                  }
                  else {
        
                    matrix(i)(j) = matrix(i - 1)(j)
        
                  }
        