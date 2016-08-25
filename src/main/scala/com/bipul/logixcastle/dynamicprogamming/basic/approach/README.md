#**0-1 Knapsack problem**

##Bottom Up

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

        
        
        
## Top Down
        
        
        
        wt[] = {1, 1, 1}, W = 2, val[] = {10, 20, 30}
        
                               K(3, 2)         ---------> K(n, W)
                           /            \ 
                         /                \               
                    K(2,2)                  K(2,1)
                  /       \                  /    \ 
                /           \              /        \
               K(1,2)      K(1,1)        K(1,1)     K(1,0)
               /  \         /   \          /   \
             /      \     /       \      /       \
        K(0,2)  K(0,1)  K(0,1)  K(0,0)  K(0,1)   K(0,0)
        Recursion tree for Knapsack capacity 2 units and 3 items of 1 unit weight.