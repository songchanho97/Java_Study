package sec03.sec05.chap02.ex4_1;

public class Circle {
    int radius; // 원의 반지름 필드
    String name; // 원의 이름 필드

    public  Circle() {} // 생성자

    public double getArea(){ // 원의 면적 계산 메소드
        return 3.14 * radius * radius;
    }
}
