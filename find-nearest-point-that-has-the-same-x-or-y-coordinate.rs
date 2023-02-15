impl Solution {
    pub fn nearest_valid_point(x: i32, y: i32, points: Vec<Vec<i32>>) -> i32 {
        let mut manhattan = 99999;
        let mut index: i32 = 99999;
        for i in 0..points.len() {
            if x == points[i][0] || y == points[i][1] {
                let manhattan_sub = (x as i32 - points[i][0] as i32).abs() + (y as i32 - points[i][1] as i32).abs();
                if manhattan_sub < manhattan {
                    manhattan = manhattan_sub;
                    index = i as i32;
                }
            }
        }
        if index == 99999 {
            return -1;
        }

        return index
    }
}
