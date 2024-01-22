package sec03.sec03.chap01;

public class Ex04 {
    public static void main(String[] args) {
        //초기화 블록을 사용한 선언 동시 초기화
        char[] dirAry1 = {'동','서','남','북'};
        char[] dirAry2 = new char [] {'동', '서', '남', '북'};

        char[] dirAry3;

        // 선언만 한 상태에서는 아래있는 방법만 사용가능
        dirAry3 = new char[] {'동','서','남','북'};
    }
}
