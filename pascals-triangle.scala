# Todo Update result Generation

object Solution {
    def generate(numRows: Int): List[List[Int]] = {
        def pascal(c: Int, r: Int): Int = {
            if (c == 0 || c == r) 1 else {
                pascal(c - 1, r - 1) + pascal(c, r - 1)
              }
            }
        
        var result = List[List[Int]]()
        
        for (i <- 0 to numRows - 1) {
            var result_row: Array[Int] = Array()
            if (i == 0) {
                result = result ++ List(List(1))
            } else if (i == 1) { 
                result = result ++ List(List(1, 1))
            }else {
                for(j <- 0 to i) {
                    result_row = result_row :+ pascal(j, i)
                }
                result = result ++ List(result_row.toList)
            }
        }
        result
        }
}
