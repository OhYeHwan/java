package ch7.pkg2;
import ch7.pkg1.MyParent;

class MyChild extends ch7.pkg1.MyParent {
    public void printMembers() {
        //System.out.println(prv); private - 같은클래스
        //System.out.println(dft); default - 같은패키지
        System.out.println(prt); // protected - 같은패키지 + 자손(다른패키지) 접근가능
        System.out.println(pub); // public - 접근제한 없음.
    }
}

public class MyParentTest2 {
    public static void main(String[] args) {
        MyParent p = new MyParent();
        //System.out.println(p.prv); 같은 클래스
        //System.out.println(p.dft); 같은 패키지
        //System.out.println(p.prt); 같은 패키지 + 자손(다른패키지)
        System.out.println(p.pub); // 접근제한없음
    }
}
