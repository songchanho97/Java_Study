package sec03.sec05.chap08;

public class YalcoChicken {
    protected int no;
    protected String name;

    public YalcoChicken(int no, String name){
        this.no = no;
        this.name = name;
    }

    public void takeHallOrder(){
        System.out.printf("%d호 %s점 홀 주문 받아%n", no, name);
    }

}
