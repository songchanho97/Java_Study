package sec03.sec10.chap01;

public class Main {
    public static void main(String[] args) {
        Throwable throwable;
        Error error;
        Exception exception;
        OutOfMemoryError outOfMemoryError;
        StackOverflowError stackOverflowError;
        RuntimeException runtimeException;
        IndexOutOfBoundsException indexOutOfBoundsException;

        int[] ints = {1, 2, 3};
//        System.out.println(ints[3]); // 런타임 예외 발생
//        System.out.println("예외를 방지하지 않았음");

        try{
            // 예외가 일어날 여지가 있는 코드를 try 블록에 작성
            System.out.println(ints[3]);
        } catch (Exception e){
            String errMsg = e.getMessage();
            e.printStackTrace();
        }
        System.out.println("예외를 try문으로 감쌋을 때 1");

        try {
            System.out.println(((String) null).length());
        } catch (Exception e) {
            String errMsg = e.getMessage();
            e.printStackTrace(); // 🔴
        }
        System.out.println("예외를 try문으로 감쌌을 때 2");
    }
}
