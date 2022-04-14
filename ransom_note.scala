object Solution {
    def canConstruct(ransomNote: String, magazine: String): Boolean = {
        val ranset = ransomNote.toList
        System.out.println(ranset)
        val magaset = magazine.toList
        val interset = ranset.intersect(magaset)
        System.out.println(interset)
        if (interset.equals(ranset)) {
            return true
        } else {
            return false
        }
    }
}
