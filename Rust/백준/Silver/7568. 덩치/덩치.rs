use std::io::{self, Read};

fn main() {
    let mut input = String::new();
    io::stdin().read_to_string(&mut input).unwrap();

    let mut iter = input.split_whitespace();

    let n: usize = iter.next().unwrap().parse().unwrap();

    let mut people = Vec::with_capacity(n);
    for _ in 0..n {
        let w: i32 = iter.next().unwrap().parse().unwrap();
        let h: i32 = iter.next().unwrap().parse().unwrap();
        people.push((w, h));
    }

    let mut ranks = vec![1; n];
    for i in 0..n {
        for j in 0..n {
            if i != j {
                if people[j].0 > people[i].0 && people[j].1 > people[i].1 {
                    ranks[i] += 1;
                }
            }
        }
    }

    for (i, rank) in ranks.iter().enumerate() {
        if i > 0 {
            print!(" ");
        }
        print!("{}", rank);
    }
}
