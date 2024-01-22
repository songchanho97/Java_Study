package sec03.sec03.chap01;

public class Ex03 {
    public static void main(String[] args) {

        // 사용할 자료형 뒤에 []를 붙여 삽입
        char[] yutnori = {'도', '개', '걸', '윷', '모'};

        // length : 배열의 길이 반환
        int length = yutnori.length;

        // [] 안에 인덱스 정수를 넣어 접근
        char first = yutnori[0];
        char last = yutnori[yutnori.length - 1];

        //초기화하지 않고 일단 선언하기
        boolean[] boolAry = new boolean[3];
        int[] intAry = new int[3];
        String[] strAry = new String[3];

        intAry[0] = 123;
        intAry[1] = 456;
        intAry[2] = 789;
    }
}
