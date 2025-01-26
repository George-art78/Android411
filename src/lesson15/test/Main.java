package lesson15.test;

interface CalcInterface {
    int calculate(int a, int b);
}

//class Calc implements CalcInterface{
//    @Override
//    public void calculate(int a, int b) {
//        System.out.println(a + b);
//    }
//}

public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;

        CalcInterface sum = (a, b) -> (a + b); //лямбда-выражение

//        CalcInterface sum = new CalcInterface() {//можно создать экземпляр интерфейса, но необходимо сразу реализовать его метод
//            @Override
//            public void calculate(int a, int b) {
//                System.out.println(a + b);
//            }
//        };
        int res = sum.calculate(x, y);
        System.out.println(res);
    }
}
//    public static void main(String[] args) {
//        int x = 5;
//        int y = 3;
//
//        Calc sum = new Calc();
//        sum.calculate(x, y);
//
////        CalcElse mul = new CalcElse();
////        mul.calculate(x, y);
//        Calc mul = new Calc() {
//            @Override
//            public void calculate(int a, int b) {
//                System.out.println(a * b);
//            }
//        };
//        mul.calculate(x, y);
//    }
//}
//
//class Calc {
//    public void calculate(int a, int b) {
//        System.out.println(a + b);
//    }
//}

//class CalcElse extends Calc {
//    @Override
//    public void calculate(int a, int b) {
//        System.out.println(a * b);
//    }
//}
