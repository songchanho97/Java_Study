package sec03.sec05.chap02.ex4_1;

public class Main {
    public static void main(String[] args) {
        Circle pizza ;  //레퍼런스 변수 pizza선언
        pizza = new Circle(); // Circle 객체 생성
        pizza.radius = 10;  // 피자의 반지름을 10으로 설정
        pizza.name = "자바피자";  // 피자의 이름 설정
        double area = pizza.getArea();  // 피자의 면적
        System.out.println(pizza.name + "의 면적은 " + area);

        Circle donut;
        donut = new Circle();
        donut.radius = 2;
        donut.name = "자바도넛";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은" + area);
    }
}
