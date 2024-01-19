package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder dubu = new ProductOrder();
        ProductOrder kimchi = new ProductOrder();
        ProductOrder cola = new ProductOrder();

        dubu.price = 2000;
        dubu.productName = "두부";
        dubu.quantity = 2;

        kimchi.price = 5000;
        kimchi.productName = "김치";
        kimchi.quantity = 1;

        cola.price = 1500;
        cola.productName = "콜라";
        cola.quantity = 2;

        ProductOrder[] productOrders = {dubu, kimchi, cola};

        // 상품 주문 정보를 'ProductOrder' 타입의 변수로 받아 저장

        // 상품 주문 정보와 최종 금액 출력
        int total = 0;


        for(ProductOrder product : productOrders){
            System.out.println("상품명: " + product.productName + ", 가격: " + product.price + ", 수량: " + product.quantity);
            total += product.price * product.quantity;
        }

        System.out.println("총 결제 금액: " + total);
    }
}
