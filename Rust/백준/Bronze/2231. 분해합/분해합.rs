use std::io;

fn main() {
    let mut input = String::new();
    io::stdin()
        .read_line(&mut input)
        .expect("failed to read line");
    let n: i32 = input.trim().parse().expect("invalid number");

    let mut result = 0;

    for i in 1..n {
        let mut sum = i;
        let mut temp = i;

        while temp > 0 {
            sum += temp % 10;
            temp /= 10;
        }

        if sum == n {
            result = i;
            break;
        }
    }

    println!("{}", result);
}
