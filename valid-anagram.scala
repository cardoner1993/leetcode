object Solution {
    def isAnagram(s: String, t: String): Boolean = {
        
        if (s.length != t.length) {
            return false
        }
        
        val slist = s.toList
        val tlist = t.toList
        val rlist = slist.intersect(tlist)
        System.out.println(rlist)
        if (rlist.equals(slist)) {
            return true
        } else {
            return false
        }
    }
}
