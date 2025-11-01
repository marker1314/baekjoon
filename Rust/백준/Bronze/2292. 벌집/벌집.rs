use std::io;

fn main() {
    let mut input = String::new();
    io::stdin()
        .read_line(&mut input)
        .expect("Failed to read line");
    let room_number: i32 = input.trim().parse().expect("Please type a number!");
    let mut temp = 1;
    let mut i = 0;

    loop {
        temp += i * 6;
        i += 1;
        if temp >= room_number {
            break;
        }
    }
    println!("{}", i);
}
