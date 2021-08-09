package ch11;

public class AsciiPring {
    public static void main(String[] args) {
        // 문자 오름차순
        // 공백, 숫자, 대문자, 소문자
        char ch = ' ';
        for(int i=0; i<95; i++) System.out.print(ch++);
    }
}
