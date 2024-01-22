package sec03;

public class EX02 {
    public static void main(String[] args) {

        System.out.println("원주율: " + 3.14);
        System.out.println("원의 둘레: 지름 X " + 3.14);
        System.out.println("원의 넓이: 반지름의 제곱 X " + 3.14);
        System.out.println("구의 부피: 반지름의 세제곱 X 4/3 X " + 3.14);

        System.out.println("\n- - - - -\n"); // 💡 \n : 줄바꿈

        double pi = 3.14;

        System.out.println("원주율: " + pi);
        System.out.println("원의 둘레: 지름 X " + pi);
        System.out.println("원의 넓이: 반지름의 제곱 X " + pi);
        System.out.println("구의 부피: 반지름의 세제곱 X 4/3 X " + pi);

        System.out.println("\n- - - - -\n"); // 💡 \n : 줄바꿈

        pi = 3.1415692 ; // 값이 바뀔 수 있으므로 '변수'라 부름

        System.out.println("원주율: " + pi);
        System.out.println("원의 둘레: 지름 X " + pi);
        System.out.println("원의 넓이: 반지름의 제곱 X " + pi);
        System.out.println("구의 부피: 반지름의 세제곱 X 4/3 X " + pi);

        int age;

        // 아직 값이 없으므로 사용할 수 없음
        // System.out.println(age);

        age = 28; // 초기화 : 빈 주머니에 값 넣기

        System.out.println(age);
    }
}
