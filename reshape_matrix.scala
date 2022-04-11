object Solution {
    def matrixReshape(mat: Array[Array[Int]], r: Int, c: Int): Array[Array[Int]] = {
        val numOfelements = mat.length * mat(0).length
        if(r*c != numOfelements)
        return mat
        
        val x = mat.flatten
        val res = Array.ofDim[Int](r , c)
        var ind = 0
        for(i <- 0 until r)
        for(j <- 0 until c) {
            res(i)(j) = x(ind)
            ind += 1
        }
       
        res
    }
}
