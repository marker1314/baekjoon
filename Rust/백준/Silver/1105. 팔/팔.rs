use std::io;

fn main() {
    let mut input = String::new();
    io::stdin().read_line(&mut input).unwrap();

    let mut iter = input.split_whitespace();
    let l = iter.next().expect("missing L");
    let r = iter.next().expect("missing R");

    if l.len() != r.len() {
        println!("0");
        return;
    }

    let lb = l.as_bytes();
    let rb = r.as_bytes();

    let mut cnt = 0;

    for i in 0..l.len() {
        if lb[i] == rb[i] && lb[i] == b'8' {
            cnt += 1;
        } else if lb[i] != rb[i] {
            break;
        }
    }

    println!("{}", cnt);
}
