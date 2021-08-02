package ch7;

// ch7-51 익명클래스(anonymous class)
// 이름이 없는 일회용 클래스.
// 정의와 생성을 동시에
// new 조상클래스이름() {}
// or
// new 구현인터페이스이름() {}

import java.awt.*;
import java.awt.event.*;

public class Ex7_18 {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent occured!!!");
            }
        });
    }
}
