package sec03.sec05.chap01.ex02;

public class YalcoChicken {
    // 인스턴스가 가질 필드들
    int no;
    String name;

    // 인스턴스가 가질 메소드 - static 을 붙이지 않음
    String intro(){
        // no와 name앞에 this를 붙인 것과 같음
        return "안녕하세요, %d호 %s점입니다".formatted(no, name);
    }
}
