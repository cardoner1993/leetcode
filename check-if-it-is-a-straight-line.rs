impl Solution {
    pub fn check_straight_line(coordinates: Vec<Vec<i32>>) -> bool {
        let x1 = coordinates[0][0];
        let y1 = coordinates[0][1];
        let x2 = coordinates[1][0];
        let y2 = coordinates[1][1];
        for row in coordinates[2..].iter() {
            if (row[1]-y2)*(x2-x1) != (row[0]-x2)*(y2-y1) {
                return false
            }
        }
        return true
    }
}
