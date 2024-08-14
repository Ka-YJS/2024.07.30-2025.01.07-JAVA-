package ex04_generic;
	
	/*숫자만 받아 계산하는 계산기 클래스 모듈*/

class Calculator<T extends Number> {
    void add(T a, T b) {}
    void min(T a, T b) {}
    void mul(T a, T b) {}
    void div(T a, T b) {}
}

public class Ex01_Generic {
    public static void main(String[] args) {
    	
        // 제네릭에 아무 타입이나 모두 할당이 가능 -> 모두 가능하기에 에러는 나지 않음
        /*
    	Calculator<Number> cal1 = new Calculator<>();
        Calculator<Object> cal2 = new Calculator<>();
        Calculator<String> cal3 = new Calculator<>();
        Calculator<Ex01_Generic> cal4 = new Calculator<>();*/
    	//제네릭에 아무타입이나 모두 할당이 가능해서 문제가 될 수 있었지만
    	//extends를 사용하고 타입을 어느정도 제한시킬 수 있음

        Calculator<Integer> cal5 = new Calculator<>();
        Calculator<Number> cal7 = new Calculator<>();
        Calculator<Double> cal6 = new Calculator<>();
    }
	
	

}
