use std::io;

fn main() {
    let mut input = String::new();
    io::stdin()
        .read_line(&mut input)
        .expect("Failed to read line");
    let length: i32 = input.trim().parse().expect("Please type a number!");
    let mut my_vec: Vec<i32> = Vec::new();
    for _ in 0..length {
        let mut input = String::new();
        io::stdin()
            .read_line(&mut input)
            .expect("Failed to read line");
        let num: i32 = input.trim().parse().expect("Please type a number!");
        my_vec.push(num);
        if num == 0 {
            my_vec.pop();
            my_vec.pop();
        }
    }
    println!("{}", my_vec.into_iter().sum::<i32>());
}
