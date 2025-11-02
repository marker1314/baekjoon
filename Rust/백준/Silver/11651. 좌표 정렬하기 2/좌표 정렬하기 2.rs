use std::io::{self, BufRead, Write};

#[derive(Clone, Copy)]
struct Point {
    x: i32,
    y: i32,
}

fn main() {
    let stdin = io::stdin();
    let mut lines = stdin.lock().lines();

    let n: usize = lines.next().unwrap().unwrap().trim().parse().unwrap();

    let mut points = Vec::with_capacity(n);

    for _ in 0..n {
        let line = lines.next().unwrap().unwrap();
        let mut iter = line.split_whitespace().map(|x| x.parse::<i32>().unwrap());
        points.push(Point {
            x: iter.next().unwrap(),
            y: iter.next().unwrap(),
        });
    }

    points.sort_unstable_by(|a, b| a.y.cmp(&b.y).then(a.x.cmp(&b.x)));

    let mut out = String::new();
    for p in points {
        out.push_str(&format!("{} {}\n", p.x, p.y));
    }
    let _ = io::stdout().write_all(out.as_bytes());
}
